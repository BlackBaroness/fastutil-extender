package io.github.blackbaroness.fastutilextender.common.list.factory;

import io.github.blackbaroness.fastutilextender.common.set.factory.primitive.PrimitiveSetBuilder;
import it.unimi.dsi.fastutil.objects.ObjectList;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.index.qual.Positive;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

@RequiredArgsConstructor
public class ObjectListBuilder<T> {

    private final ObjectListFactory factory;

    private int size = -1;
    private boolean threadsafe;
    private boolean unmodifiable;
    private Collection<T> content;

    public @This ObjectListBuilder<T> size(@Positive int size) {
        this.size = size;
        return this;
    }

    public @This ObjectListBuilder<T> threadsafe(boolean threadsafe) {
        this.threadsafe = threadsafe;
        return this;
    }

    public @This ObjectListBuilder<T> unmodifiable(boolean unmodifiable) {
        this.unmodifiable = unmodifiable;
        return this;
    }

    public @This ObjectListBuilder<T> threadsafe() {
        return threadsafe(true);
    }

    public @This ObjectListBuilder<T> unmodifiable() {
        return unmodifiable(true);
    }

    public @This ObjectListBuilder<T> content(@NonNull Collection<T> source) {
        setContent(factory.of(source));
        return this;
    }

    @SafeVarargs
    public final @This ObjectListBuilder<T> content(@NonNull T... source) {
        setContent(factory.of(source));
        return this;
    }

    private void setContent(Collection<T> content) {
        if (this.content != null) {
            throw new IllegalStateException("Content already specified");
        }

        this.content = content;
    }

    @SideEffectFree
    public @NotNull ObjectList<T> build() {
        ObjectList<T> result;

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
