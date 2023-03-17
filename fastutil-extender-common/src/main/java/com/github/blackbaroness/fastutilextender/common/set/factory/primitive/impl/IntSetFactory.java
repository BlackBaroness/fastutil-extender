package com.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl;

import com.github.blackbaroness.fastutilextender.common.set.factory.primitive.PrimitiveSetFactory;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntPredicate;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class IntSetFactory extends PrimitiveSetFactory<Integer, IntSet, IntPredicate> {

    @Override
    public @NotNull IntSet create(@Positive int size) {
        return new IntOpenHashSet(size, loadFactor);
    }

    @Override
    public @NotNull IntSet of(@NotNull Collection<Integer> source) {
        return new IntOpenHashSet(source, loadFactor);
    }

    @Override
    public @NotNull IntSet synchronize(@NotNull IntSet list) {
        return IntSets.synchronize(list);
    }

    @Override
    public @NotNull IntSet unmodifiable(@NotNull IntSet list) {
        return IntSets.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull IntSet of(int... source) {
        return new IntOpenHashSet(source, loadFactor);
    }
}
