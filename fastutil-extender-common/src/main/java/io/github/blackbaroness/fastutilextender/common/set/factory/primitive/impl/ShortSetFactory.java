package io.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl;

import io.github.blackbaroness.fastutilextender.common.set.factory.primitive.PrimitiveSetFactory;
import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortPredicate;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import it.unimi.dsi.fastutil.shorts.ShortSets;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class ShortSetFactory extends PrimitiveSetFactory<Short, ShortSet, ShortPredicate> {

    @Override
    public @NotNull ShortSet create(@Positive int size) {
        return new ShortOpenHashSet(size, loadFactor);
    }

    @Override
    public @NotNull ShortSet of(@NotNull Collection<Short> source) {
        return new ShortOpenHashSet(source, loadFactor);
    }

    @Override
    public @NotNull ShortSet synchronize(@NotNull ShortSet list) {
        return ShortSets.synchronize(list);
    }

    @Override
    public @NotNull ShortSet unmodifiable(@NotNull ShortSet list) {
        return ShortSets.unmodifiable(list);
    }
}
