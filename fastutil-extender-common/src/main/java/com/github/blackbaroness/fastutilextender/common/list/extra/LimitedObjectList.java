package com.github.blackbaroness.fastutilextender.common.list.extra;

import it.unimi.dsi.fastutil.objects.ObjectList;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.NotNull;

public class LimitedObjectList<V> extends ObjectListWrapper<V> {

    private final int maximumSize;

    public LimitedObjectList(@Positive int maximumSize, @NotNull ObjectList<V> wrappedList) {
        super(wrappedList);
        this.maximumSize = maximumSize;
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public boolean add(V v) {
        final boolean result = super.add(v);
        if (size() > maximumSize) {
            remove(0);
        }
        return result;
    }
}
