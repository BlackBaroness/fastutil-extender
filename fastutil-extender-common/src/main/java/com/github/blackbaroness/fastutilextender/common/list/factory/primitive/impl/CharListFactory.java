package com.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl;


import com.github.blackbaroness.fastutilextender.common.list.factory.primitive.PrimitiveListFactory;
import it.unimi.dsi.fastutil.chars.CharArrayList;
import it.unimi.dsi.fastutil.chars.CharList;
import it.unimi.dsi.fastutil.chars.CharLists;
import it.unimi.dsi.fastutil.chars.CharPredicate;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class CharListFactory extends PrimitiveListFactory<Character, CharList, CharPredicate> {

    @Override
    public @NotNull CharList create(@Positive int size) {
        return new CharArrayList(size);
    }

    @Override
    public @NotNull CharList of(@NotNull Collection<Character> source) {
        return new CharArrayList(source);
    }

    @Override
    public @NotNull CharList synchronize(@NotNull CharList list) {
        return CharLists.synchronize(list);
    }

    @Override
    public @NotNull CharList unmodifiable(@NotNull CharList list) {
        return CharLists.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull CharList ofArray(char @NotNull ... source) {
        return new CharArrayList(source);
    }
}
