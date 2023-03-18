package io.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl;

import io.github.blackbaroness.fastutilextender.common.list.factory.primitive.PrimitiveListFactory;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleLists;
import it.unimi.dsi.fastutil.doubles.DoublePredicate;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class DoubleListFactory extends PrimitiveListFactory<Double, DoubleList, DoublePredicate> {

    @Override
    public @NotNull DoubleList create(@Positive int size) {
        return new DoubleArrayList(size);
    }

    @Override
    public @NotNull DoubleList of(@NotNull Collection<Double> source) {
        return new DoubleArrayList(source);
    }

    @Override
    public @NotNull DoubleList synchronize(@NotNull DoubleList list) {
        return DoubleLists.synchronize(list);
    }

    @Override
    public @NotNull DoubleList unmodifiable(@NotNull DoubleList list) {
        return DoubleLists.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull DoubleList ofArray(double @NotNull ... source) {
        return new DoubleArrayList(source);
    }
}
