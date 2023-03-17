package com.github.blackbaroness.fastutilextender.common.map.extra;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;

import java.util.Map;

public class LimitedSizeLinkedHashMap<K, V> extends Object2ObjectLinkedOpenHashMap<K, V> {

    private volatile int maximumSize = Integer.MAX_VALUE;

    public LimitedSizeLinkedHashMap(int expected, float f) {
        super(expected, f);
    }

    public LimitedSizeLinkedHashMap() {
    }

    //========================== default constructors =========================

    public LimitedSizeLinkedHashMap(Map<? extends K, ? extends V> m, float f) {
        super(m, f);
    }

    public LimitedSizeLinkedHashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public LimitedSizeLinkedHashMap(Object2ObjectMap<K, V> m, float f) {
        super(m, f);
    }

    public LimitedSizeLinkedHashMap(Object2ObjectMap<K, V> m) {
        super(m);
    }

    public LimitedSizeLinkedHashMap(K[] k, V[] v, float f) {
        super(k, v, f);
    }

    public LimitedSizeLinkedHashMap(K[] k, V[] v) {
        super(k, v);
    }

    @Contract("_ -> this")
    public LimitedSizeLinkedHashMap<K, V> maximumSize(@Positive int maximumSize) {
        this.maximumSize = maximumSize;
        return this;
    }

    @Override
    public V put(K k, V v) {
        final V result = super.put(k, v);
        if (size() > maximumSize) {
            removeFirst();
        }
        return result;
    }
}
