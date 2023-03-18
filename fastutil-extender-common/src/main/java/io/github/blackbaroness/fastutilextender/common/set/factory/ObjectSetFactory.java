package io.github.blackbaroness.fastutilextender.common.set.factory;

import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import it.unimi.dsi.fastutil.objects.ObjectSets;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;

public class ObjectSetFactory {

    private final float loadFactor = Hash.VERY_FAST_LOAD_FACTOR;

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> ObjectSet<T> create() {
        return create(Hash.DEFAULT_INITIAL_SIZE);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> ObjectSet<T> create(@Positive int size) {
        return new ObjectOpenHashSet<>(size, loadFactor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> ObjectSet<T> of(@NotNull Collection<T> source) {
        return new ObjectOpenHashSet<>(source, loadFactor);
    }

    @SafeVarargs
    @Contract(value = "_ -> new", pure = true)
    public final @NotNull <T> ObjectSet<T> of(@NotNull T... source) {
        return new ObjectOpenHashSet<>(source, loadFactor);
    }

    @Contract(value = "_, _ -> new", pure = true)
    public @NotNull <A, T> ObjectSet<T> convert(@NotNull Collection<A> anotherCollection, @NotNull Function<A, T> converter) {
        ObjectSet<T> result = create(anotherCollection.size());
        for (A object : anotherCollection) {
            result.add(converter.apply(object));
        }
        return result;
    }

    @Contract(value = "_, _ -> new", pure = true)
    public @NotNull <T> ObjectSet<T> filter(@NotNull Collection<T> anotherCollection, @NotNull Predicate<T> filter) {
        ObjectSet<T> result = create(anotherCollection.size());
        for (T object : anotherCollection) {
            if (filter.test(object)) result.add(object);
        }
        return result;
    }

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Collector<T, ?, ObjectSet<T>> collector() {
        return Collector.of(
                this::create,
                Set::add,
                (left, right) -> {
                    if (left.size() < right.size()) {
                        right.addAll(left);
                        return right;
                    } else {
                        left.addAll(right);
                        return left;
                    }
                },
                Collector.Characteristics.UNORDERED
        );
    }

    @SuppressWarnings("unchecked")
    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Collector<T, ?, ObjectSet<T>> unmodifiableCollector() {
        return Collector.of(
                this::create,
                Set::add,
                (left, right) -> {
                    if (left.size() < right.size()) {
                        right.addAll(left);
                        return right;
                    } else {
                        left.addAll(right);
                        return left;
                    }
                },
                set -> (ObjectSet<T>) unmodifiable(set),
                Collector.Characteristics.UNORDERED
        );
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> ObjectSet<T> synchronize(@NotNull ObjectSet<T> Set) {
        return ObjectSets.synchronize(Set);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> ObjectSet<T> unmodifiable(@NotNull ObjectSet<T> Set) {
        return ObjectSets.unmodifiable(Set);
    }

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> ObjectSetBuilder<T> builder() {
        return new ObjectSetBuilder<>(this);
    }
}
