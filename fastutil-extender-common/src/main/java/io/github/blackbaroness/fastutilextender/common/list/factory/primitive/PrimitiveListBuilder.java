package io.github.blackbaroness.fastutilextender.common.list.factory.primitive;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.index.qual.Positive;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

@RequiredArgsConstructor
public class PrimitiveListBuilder<P, L extends List<P>, F extends Predicate<P>> {

    private final PrimitiveListFactory<P, L, F> factory;

    private int size = -1;
    private boolean threadsafe;
    private boolean unmodifiable;
    private Collection<P> content;

    public @This PrimitiveListBuilder<P, L, F> size(@Positive int size) {
        this.size = size;
        return this;
    }

    public @This PrimitiveListBuilder<P, L, F> threadsafe(boolean threadsafe) {
        this.threadsafe = threadsafe;
        return this;
    }

    public @This PrimitiveListBuilder<P, L, F> unmodifiable(boolean unmodifiable) {
        this.unmodifiable = unmodifiable;
        return this;
    }

    public @This PrimitiveListBuilder<P, L, F> threadsafe() {
        return threadsafe(true);
    }

    public @This PrimitiveListBuilder<P, L, F> unmodifiable() {
        return unmodifiable(true);
    }

    public @This PrimitiveListBuilder<P, L, F> content(@NonNull Collection<P> source) {
        setContent(factory.of(source));
        return this;
    }

    @SafeVarargs
    public final @This PrimitiveListBuilder<P, L, F> content(@NonNull P... source) {
        setContent(factory.of(source));
        return this;
    }

    private void setContent(Collection<P> content) {
        if (this.content != null) {
            throw new IllegalStateException("Content already specified");
        }

        this.content = content;
    }

    @SideEffectFree
    public @NotNull L build() {
        L result;

        if (size != -1) {
            result = factory.create();
            if (content != null) result.addAll(content);
        } else if (content != null) {
            result = factory.of(content);
        } else {
            result = factory.create();
        }

        if (threadsafe) {
            result = factory.synchronize(result);
        }

        if (unmodifiable) {
            result = factory.unmodifiable(result);
        }

        return result;
    }
}
