package com.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl;

import com.github.blackbaroness.fastutilextender.common.list.factory.primitive.PrimitiveListFactory;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.bytes.ByteLists;
import it.unimi.dsi.fastutil.bytes.BytePredicate;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class ByteListFactory extends PrimitiveListFactory<Byte, ByteList, BytePredicate> {

    @Override
    public @NotNull ByteList create(@Positive int size) {
        return new ByteArrayList(size);
    }

    @Override
    public @NotNull ByteList of(@NotNull Collection<Byte> source) {
        return new ByteArrayList(source);
    }

    @Override
    public @NotNull ByteList synchronize(@NotNull ByteList list) {
        return ByteLists.synchronize(list);
    }

    @Override
    public @NotNull ByteList unmodifiable(@NotNull ByteList list) {
        return ByteLists.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull ByteList ofArray(byte @NotNull ... source) {
        return new ByteArrayList(source);
    }
}
