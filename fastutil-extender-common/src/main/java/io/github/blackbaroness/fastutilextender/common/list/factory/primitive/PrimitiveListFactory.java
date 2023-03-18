package io.github.blackbaroness.fastutilextender.common.list.factory.primitive;

import it.unimi.dsi.fastutil.Hash;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;

public abstract class PrimitiveListFactory<P, L extends List<P>, F extends Predicate<P>> {

    @Contract(value = "-> new", pure = true)
    public @NotNull L create() {
        return create(Hash.DEFAULT_INITIAL_SIZE);
    }

    @Contract(value = "_ -> new", pure = true)
    public abstract @NotNull L create(@Positive int size);

    @Contract(value = "_ -> new", pure = true)
    public abstract @NotNull L of(@NotNull Collection<P> source);

    @SuppressWarnings("unchecked")
    @Contract(value = "_ -> new", pure = true)
    public @NotNull L of(@NotNull P... source) {
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
                List::add,
                (left, right) -> {
                    left.addAll(right);
                    return left;
                }
        );
    }

    @Contract(value = "-> new", pure = true)
    public @NotNull Collector<P, ?, L> unmodifiableCollector() {
        return Collector.of(
                this::create,
                List::add,
                (left, right) -> {
                    left.addAll(right);
                    return left;
                },
                this::unmodifiable
        );
    }

    @Contract(value = "-> new", pure = true)
    public @NotNull PrimitiveListBuilder<P, L, F> builder() {
        return new PrimitiveListBuilder<>(this);
    }

    @Contract(value = "_ -> new", pure = true)
    public abstract @NotNull L synchronize(@NotNull L list);

    @Contract(value = "_ -> new", pure = true)
    public abstract @NotNull L unmodifiable(@NotNull L list);


}
