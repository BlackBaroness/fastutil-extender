package io.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl;

import io.github.blackbaroness.fastutilextender.common.set.factory.primitive.PrimitiveSetFactory;
import it.unimi.dsi.fastutil.floats.FloatOpenHashSet;
import it.unimi.dsi.fastutil.floats.FloatPredicate;
import it.unimi.dsi.fastutil.floats.FloatSet;
import it.unimi.dsi.fastutil.floats.FloatSets;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class FloatSetFactory extends PrimitiveSetFactory<Float, FloatSet, FloatPredicate> {

    @Override
    public @NotNull FloatSet create(@Positive int size) {
        return new FloatOpenHashSet(size, loadFactor);
    }

    @Override
    public @NotNull FloatSet of(@NotNull Collection<Float> source) {
        return new FloatOpenHashSet(source, loadFactor);
    }

    @Override
    public @NotNull FloatSet synchronize(@NotNull FloatSet list) {
        return FloatSets.synchronize(list);
    }

    @Override
    public @NotNull FloatSet unmodifiable(@NotNull FloatSet list) {
        return FloatSets.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull FloatSet of(float @NotNull ... source) {
        return new FloatOpenHashSet(source, loadFactor);
    }
}
