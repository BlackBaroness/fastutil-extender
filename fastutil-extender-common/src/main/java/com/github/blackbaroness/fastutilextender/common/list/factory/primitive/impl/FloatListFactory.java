package com.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl;

import com.github.blackbaroness.fastutilextender.common.list.factory.primitive.PrimitiveListFactory;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatList;
import it.unimi.dsi.fastutil.floats.FloatLists;
import it.unimi.dsi.fastutil.floats.FloatPredicate;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class FloatListFactory extends PrimitiveListFactory<Float, FloatList, FloatPredicate> {

    @Override
    public @NotNull FloatList create(@Positive int size) {
        return new FloatArrayList(size);
    }

    @Override
    public @NotNull FloatList of(@NotNull Collection<Float> source) {
        return new FloatArrayList(source);
    }

    @Override
    public @NotNull FloatList synchronize(@NotNull FloatList list) {
        return FloatLists.synchronize(list);
    }

    @Override
    public @NotNull FloatList unmodifiable(@NotNull FloatList list) {
        return FloatLists.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull FloatList ofArray(float @NotNull ... source) {
        return new FloatArrayList(source);
    }
}
