package io.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl;

import io.github.blackbaroness.fastutilextender.common.set.factory.primitive.PrimitiveSetFactory;
import it.unimi.dsi.fastutil.chars.CharOpenHashSet;
import it.unimi.dsi.fastutil.chars.CharPredicate;
import it.unimi.dsi.fastutil.chars.CharSet;
import it.unimi.dsi.fastutil.chars.CharSets;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class CharSetFactory extends PrimitiveSetFactory<Character, CharSet, CharPredicate> {

    @Override
    public @NotNull CharSet create(@Positive int size) {
        return new CharOpenHashSet(size, loadFactor);
    }

    @Override
    public @NotNull CharSet of(@NotNull Collection<Character> source) {
        return new CharOpenHashSet(source, loadFactor);
    }

    @Override
    public @NotNull CharSet synchronize(@NotNull CharSet list) {
        return CharSets.synchronize(list);
    }

    @Override
    public @NotNull CharSet unmodifiable(@NotNull CharSet list) {
        return CharSets.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull CharSet of(char @NotNull ... source) {
        return new CharOpenHashSet(source, loadFactor);
    }
}
