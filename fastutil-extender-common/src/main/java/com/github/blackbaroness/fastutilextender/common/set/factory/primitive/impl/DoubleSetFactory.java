package com.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl;

import com.github.blackbaroness.fastutilextender.common.set.factory.primitive.PrimitiveSetFactory;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import it.unimi.dsi.fastutil.doubles.DoublePredicate;
import it.unimi.dsi.fastutil.doubles.DoubleSet;
import it.unimi.dsi.fastutil.doubles.DoubleSets;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class DoubleSetFactory extends PrimitiveSetFactory<Double, DoubleSet, DoublePredicate> {

    @Override
    public @NotNull DoubleSet create(@Positive int size) {
        return new DoubleOpenHashSet(size, loadFactor);
    }

    @Override
    public @NotNull DoubleSet of(@NotNull Collection<Double> source) {
        return new DoubleOpenHashSet(source, loadFactor);
    }

    @Override
    public @NotNull DoubleSet synchronize(@NotNull DoubleSet list) {
        return DoubleSets.synchronize(list);
    }

    @Override
    public @NotNull DoubleSet unmodifiable(@NotNull DoubleSet list) {
        return DoubleSets.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull DoubleSet of(double @NotNull ... source) {
        return new DoubleOpenHashSet(source, loadFactor);
    }
}
