package io.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl;

import io.github.blackbaroness.fastutilextender.common.set.factory.primitive.PrimitiveSetFactory;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongPredicate;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class LongSetFactory extends PrimitiveSetFactory<Long, LongSet, LongPredicate> {

    @Override
    public @NotNull LongSet create(@Positive int size) {
        return new LongOpenHashSet(size, loadFactor);
    }

    @Override
    public @NotNull LongSet of(@NotNull Collection<Long> source) {
        return new LongOpenHashSet(source, loadFactor);
    }

    @Override
    public @NotNull LongSet synchronize(@NotNull LongSet list) {
        return LongSets.synchronize(list);
    }

    @Override
    public @NotNull LongSet unmodifiable(@NotNull LongSet list) {
        return LongSets.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull LongSet of(long @NotNull ... source) {
        return new LongOpenHashSet(source, loadFactor);
    }
}
