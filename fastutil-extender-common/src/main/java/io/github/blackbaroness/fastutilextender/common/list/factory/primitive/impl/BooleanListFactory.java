package io.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl;

import io.github.blackbaroness.fastutilextender.common.list.factory.primitive.PrimitiveListFactory;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import it.unimi.dsi.fastutil.booleans.BooleanLists;
import it.unimi.dsi.fastutil.booleans.BooleanPredicate;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class BooleanListFactory extends PrimitiveListFactory<Boolean, BooleanList, BooleanPredicate> {

    @Override
    public @NotNull BooleanList create(@Positive int size) {
        return new BooleanArrayList(size);
    }

    @Override
    public @NotNull BooleanList of(@NotNull Collection<Boolean> source) {
        return new BooleanArrayList(source);
    }

    @Override
    public @NotNull BooleanList synchronize(@NotNull BooleanList list) {
        return BooleanLists.synchronize(list);
    }

    @Override
    public @NotNull BooleanList unmodifiable(@NotNull BooleanList list) {
        return BooleanLists.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull BooleanList ofArray(boolean @NotNull ... source) {
        return new BooleanArrayList(source);
    }
}
