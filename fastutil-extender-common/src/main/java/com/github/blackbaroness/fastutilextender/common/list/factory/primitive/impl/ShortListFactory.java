package com.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl;

import com.github.blackbaroness.fastutilextender.common.list.factory.primitive.PrimitiveListFactory;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortLists;
import it.unimi.dsi.fastutil.shorts.ShortPredicate;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class ShortListFactory extends PrimitiveListFactory<Short, ShortList, ShortPredicate> {

    @Override
    public @NotNull ShortList create(@Positive int size) {
        return new ShortArrayList(size);
    }

    @Override
    public @NotNull ShortList of(@NotNull Collection<Short> source) {
        return new ShortArrayList(source);
    }

    @Override
    public @NotNull ShortList synchronize(@NotNull ShortList list) {
        return ShortLists.synchronize(list);
    }

    @Override
    public @NotNull ShortList unmodifiable(@NotNull ShortList list) {
        return ShortLists.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull ShortList ofArray(short @NotNull ... source) {
        return new ShortArrayList(source);
    }
}
