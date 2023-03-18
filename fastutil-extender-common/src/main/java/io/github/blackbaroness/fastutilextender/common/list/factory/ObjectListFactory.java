package io.github.blackbaroness.fastutilextender.common.list.factory;

import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectLists;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;

public class ObjectListFactory {

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> ObjectList<T> create() {
        return create(Hash.DEFAULT_INITIAL_SIZE);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> ObjectList<T> create(@Positive int size) {
        return new ObjectArrayList<>(size);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> ObjectList<T> of(@NotNull Collection<T> source) {
        return new ObjectArrayList<>(source);
    }

    @SafeVarargs
    @Contract(value = "_ -> new", pure = true)
    public final @NotNull <T> ObjectList<T> of(@NotNull T... source) {
        return new ObjectArrayList<>(source);
    }

    @Contract(value = "_, _ -> new", pure = true)
    public @NotNull <A, T> ObjectList<T> convert(@NotNull Collection<A> anotherCollection, @NotNull Function<A, T> converter) {
        ObjectList<T> result = create(anotherCollection.size());
        for (A object : anotherCollection) {
            result.add(converter.apply(object));
        }
        return result;
    }

    @Contract(value = "_, _ -> new", pure = true)
    public @NotNull <T> ObjectList<T> filter(@NotNull Collection<T> anotherCollection, @NotNull Predicate<T> filter) {
        ObjectList<T> result = create(anotherCollection.size());
        for (T object : anotherCollection) {
            if (filter.test(object)) result.add(object);
        }
        return result;
    }

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Collector<T, ?, ObjectList<T>> collector() {
        return Collector.of(
                this::create,
                List::add,
                (left, right) -> {
                    left.addAll(right);
                    return left;
                }
        );
    }

    @SuppressWarnings("unchecked")
    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Collector<T, ?, ObjectList<T>> unmodifiableCollector() {
        return Collector.of(
                this::create,
                List::add,
                (left, right) -> {
                    left.addAll(right);
                    return left;
                },
                list -> (ObjectList<T>) unmodifiable(list)
        );
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> ObjectList<T> synchronize(@NotNull ObjectList<T> list) {
        return ObjectLists.synchronize(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> ObjectList<T> unmodifiable(@NotNull ObjectList<T> list) {
        return ObjectLists.unmodifiable(list);
    }

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> ObjectListBuilder<T> builder() {
        return new ObjectListBuilder<>(this);
    }
}
