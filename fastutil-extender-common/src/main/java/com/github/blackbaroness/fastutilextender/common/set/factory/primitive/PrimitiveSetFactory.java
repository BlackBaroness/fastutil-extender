package com.github.blackbaroness.fastutilextender.common.set.factory.primitive;

import it.unimi.dsi.fastutil.Hash;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;

public abstract class PrimitiveSetFactory<P, L extends Set<P>, F extends Predicate<P>> {

    protected final int defaultSize = Hash.DEFAULT_INITIAL_SIZE;
    protected final float loadFactor = Hash.VERY_FAST_LOAD_FACTOR;

    @Contract(value = "-> new", pure = true)
    public @NotNull L create() {
        return create(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public abstract @NotNull L create(@Positive int size);

    @Contract(value = "_ -> new", pure = true)
    public abstract @NotNull L of(@NotNull Collection<P> source);

    @SuppressWarnings("unchecked")
    @Contract(value = "_ -> new", pure = true)
    public @NotNull L forArray(@NotNull P... source) {
        return of(Arrays.asList(source));
    }

    @Contract(value = "_, _ -> new", pure = true)
    public @NotNull <A> L convert(@NotNull Collection<A> anotherCollection, @NotNull Function<A, P> converter) {
        L result = create(anotherCollection.size());
        for (A object : anotherCollection) {
            result.add(converter.apply(object));
        }
        return result;
    }

    @Contract(value = "_, _ -> new", pure = true)
    public @NotNull L filter(@NotNull Collection<P> anotherCollection, @NotNull F filter) {
        L result = create(anotherCollection.size());
        for (P object : anotherCollection) {
            if (filter.test(object)) result.add(object);
        }
        return result;
    }

    @Contract(value = "-> new", pure = true)
    public @NotNull Collector<P, ?, L> collector() {
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

    @Contract(value = "-> new", pure = true)
    public @NotNull Collector<P, ?, L> unmodifiableCollector() {
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
                this::unmodifiable,
                Collector.Characteristics.UNORDERED
        );
    }

    @Contract(value = "-> new", pure = true)
    public @NotNull PrimitiveSetBuilder<P, L, F> builder() {
        return new PrimitiveSetBuilder<>(this);
    }

    @Contract(value = "_ -> new", pure = true)
    public abstract @NotNull L synchronize(@NotNull L list);

    @Contract(value = "_ -> new", pure = true)
    public abstract @NotNull L unmodifiable(@NotNull L list);
}
