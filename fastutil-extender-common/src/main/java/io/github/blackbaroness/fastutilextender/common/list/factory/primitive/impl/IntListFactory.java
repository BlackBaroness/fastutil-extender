package io.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl;

import io.github.blackbaroness.fastutilextender.common.list.factory.primitive.PrimitiveListFactory;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.ints.IntPredicate;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class IntListFactory extends PrimitiveListFactory<Integer, IntList, IntPredicate> {

    @Override
    public @NotNull IntList create(@Positive int size) {
        return new IntArrayList(size);
    }

    @Override
    public @NotNull IntList of(@NotNull Collection<Integer> source) {
        return new IntArrayList(source);
    }

    @Override
    public @NotNull IntList synchronize(@NotNull IntList list) {
        return IntLists.synchronize(list);
    }

    @Override
    public @NotNull IntList unmodifiable(@NotNull IntList list) {
        return IntLists.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull IntList ofArray(int... source) {
        return new IntArrayList(source);
    }
}
