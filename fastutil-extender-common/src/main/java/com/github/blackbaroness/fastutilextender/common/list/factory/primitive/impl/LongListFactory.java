package com.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl;

import com.github.blackbaroness.fastutilextender.common.list.factory.primitive.PrimitiveListFactory;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.longs.LongLists;
import it.unimi.dsi.fastutil.longs.LongPredicate;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class LongListFactory extends PrimitiveListFactory<Long, LongList, LongPredicate> {

    @Override
    public @NotNull LongList create(@Positive int size) {
        return new LongArrayList(size);
    }

    @Override
    public @NotNull LongList of(@NotNull Collection<Long> source) {
        return new LongArrayList(source);
    }

    @Override
    public @NotNull LongList synchronize(@NotNull LongList list) {
        return LongLists.synchronize(list);
    }

    @Override
    public @NotNull LongList unmodifiable(@NotNull LongList list) {
        return LongLists.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull LongList ofArray(long @NotNull ... source) {
        return new LongArrayList(source);
    }
}
