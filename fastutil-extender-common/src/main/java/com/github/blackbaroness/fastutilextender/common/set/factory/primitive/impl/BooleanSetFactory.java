package com.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl;

import com.github.blackbaroness.fastutilextender.common.set.factory.primitive.PrimitiveSetFactory;
import it.unimi.dsi.fastutil.booleans.BooleanOpenHashSet;
import it.unimi.dsi.fastutil.booleans.BooleanPredicate;
import it.unimi.dsi.fastutil.booleans.BooleanSet;
import it.unimi.dsi.fastutil.booleans.BooleanSets;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class BooleanSetFactory extends PrimitiveSetFactory<Boolean, BooleanSet, BooleanPredicate> {

    @Override
    public @NotNull BooleanSet create(@Positive int size) {
        return new BooleanOpenHashSet(size, loadFactor);
    }

    @Override
    public @NotNull BooleanSet of(@NotNull Collection<Boolean> source) {
        return new BooleanOpenHashSet(source, loadFactor);
    }

    @Override
    public @NotNull BooleanSet synchronize(@NotNull BooleanSet list) {
        return BooleanSets.synchronize(list);
    }

    @Override
    public @NotNull BooleanSet unmodifiable(@NotNull BooleanSet list) {
        return BooleanSets.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull BooleanSet of(boolean @NotNull ... source) {
        return new BooleanOpenHashSet(source, loadFactor);
    }
}
