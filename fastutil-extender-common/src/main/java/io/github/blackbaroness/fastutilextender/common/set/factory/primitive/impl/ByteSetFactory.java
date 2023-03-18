package io.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl;

import io.github.blackbaroness.fastutilextender.common.set.factory.primitive.PrimitiveSetFactory;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import it.unimi.dsi.fastutil.bytes.BytePredicate;
import it.unimi.dsi.fastutil.bytes.ByteSet;
import it.unimi.dsi.fastutil.bytes.ByteSets;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class ByteSetFactory extends PrimitiveSetFactory<Byte, ByteSet, BytePredicate> {

    @Override
    public @NotNull ByteSet create(@Positive int size) {
        return new ByteOpenHashSet(size, loadFactor);
    }

    @Override
    public @NotNull ByteSet of(@NotNull Collection<Byte> source) {
        return new ByteOpenHashSet(source, loadFactor);
    }

    @Override
    public @NotNull ByteSet synchronize(@NotNull ByteSet list) {
        return ByteSets.synchronize(list);
    }

    @Override
    public @NotNull ByteSet unmodifiable(@NotNull ByteSet list) {
        return ByteSets.unmodifiable(list);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull ByteSet of(byte @NotNull ... source) {
        return new ByteOpenHashSet(source, loadFactor);
    }
}
