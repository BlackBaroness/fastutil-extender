package com.github.blackbaroness.fastutilextender.common.list.factory.primitive;

import com.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl.IntListFactory;
import com.github.blackbaroness.fastutilextender.common.map.FastMap;
import it.unimi.dsi.fastutil.Pair;
import it.unimi.dsi.fastutil.ints.IntList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrimitiveListBuilderTest {

    @Test
    void simple_test() {
        IntList list = new IntListFactory().builder()
                .size(30)
                .threadsafe(true)
                .unmodifiable(true)
                .content(1, 2, 3)
                .build();

        assertThrows(UnsupportedOperationException.class, () -> list.add(1));
        assertEquals(3, list.size());
        assertEquals(1, list.getInt(0));
        assertEquals(2, list.getInt(1));
        assertEquals(3, list.getInt(2));

        // default
        FastMap.newMap();

        // with size
        FastMap.newByte2ShortSortedMap(30);

        // of pairs (currently only for objects)
        FastMap.newMap(
                Pair.of("s1", "s2")
        );

        // make unmodifiable or synchronized
        FastMap.unmodifiable(FastMap.newInt2IntMap());
        FastMap.synchronize(FastMap.newByte2FloatMap());
    }
}