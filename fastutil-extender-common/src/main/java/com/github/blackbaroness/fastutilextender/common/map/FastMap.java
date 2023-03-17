package com.github.blackbaroness.fastutilextender.common.map;

import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.Pair;
import it.unimi.dsi.fastutil.bytes.*;
import it.unimi.dsi.fastutil.chars.*;
import it.unimi.dsi.fastutil.floats.*;
import it.unimi.dsi.fastutil.ints.*;
import it.unimi.dsi.fastutil.longs.*;
import it.unimi.dsi.fastutil.objects.*;
import it.unimi.dsi.fastutil.shorts.*;
import lombok.experimental.UtilityClass;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
@UtilityClass
public class FastMap {

    private final int defaultSize = Hash.DEFAULT_INITIAL_SIZE;
    private final float factor = Hash.VERY_FAST_LOAD_FACTOR;

    ///////////////////////////////////////////////////////////////////////////
    // Int2Int
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2IntMap newInt2IntMap() {
        return newInt2IntMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2IntMap newInt2IntMap(@Positive int size) {
        return new Int2IntOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2IntMap synchronize(@NotNull Int2IntMap map) {
        return Int2IntMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2IntMap unmodifiable(@NotNull Int2IntMap map) {
        return Int2IntMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Int | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2IntSortedMap newInt2IntSortedMap() {
        return newInt2IntSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2IntSortedMap newInt2IntSortedMap(@Positive int size) {
        return new Int2IntLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2IntSortedMap synchronize(@NotNull Int2IntSortedMap map) {
        return Int2IntSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2IntSortedMap unmodifiable(@NotNull Int2IntSortedMap map) {
        return Int2IntSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Boolean
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2BooleanMap newInt2BooleanMap() {
        return newInt2BooleanMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2BooleanMap newInt2BooleanMap(@Positive int size) {
        return new Int2BooleanOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2BooleanMap synchronize(@NotNull Int2BooleanMap map) {
        return Int2BooleanMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2BooleanMap unmodifiable(@NotNull Int2BooleanMap map) {
        return Int2BooleanMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Boolean | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2BooleanSortedMap newInt2BooleanSortedMap() {
        return newInt2BooleanSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2BooleanSortedMap newInt2BooleanSortedMap(@Positive int size) {
        return new Int2BooleanLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2BooleanSortedMap synchronize(@NotNull Int2BooleanSortedMap map) {
        return Int2BooleanSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2BooleanSortedMap unmodifiable(@NotNull Int2BooleanSortedMap map) {
        return Int2BooleanSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Float
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2FloatMap newInt2FloatMap() {
        return newInt2FloatMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2FloatMap newInt2FloatMap(@Positive int size) {
        return new Int2FloatOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2FloatMap synchronize(@NotNull Int2FloatMap map) {
        return Int2FloatMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2FloatMap unmodifiable(@NotNull Int2FloatMap map) {
        return Int2FloatMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Float | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2FloatSortedMap newInt2FloatSortedMap() {
        return newInt2FloatSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2FloatSortedMap newInt2FloatSortedMap(@Positive int size) {
        return new Int2FloatLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2FloatSortedMap synchronize(@NotNull Int2FloatSortedMap map) {
        return Int2FloatSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2FloatSortedMap unmodifiable(@NotNull Int2FloatSortedMap map) {
        return Int2FloatSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Object
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Int2ObjectMap<T> newInt2ObjectMap() {
        return newInt2ObjectMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Int2ObjectMap<T> newInt2ObjectMap(@Positive int size) {
        return new Int2ObjectOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Int2ObjectMap<T> synchronize(@NotNull Int2ObjectMap<T> map) {
        return Int2ObjectMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Int2ObjectMap<T> unmodifiable(@NotNull Int2ObjectMap<T> map) {
        return Int2ObjectMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Object | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Int2ObjectSortedMap<T> newInt2ObjectSortedMap() {
        return newInt2ObjectSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Int2ObjectSortedMap<T> newInt2ObjectSortedMap(@Positive int size) {
        return new Int2ObjectLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Int2ObjectSortedMap<T> synchronize(@NotNull Int2ObjectSortedMap<T> map) {
        return Int2ObjectSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Int2ObjectSortedMap<T> unmodifiable(@NotNull Int2ObjectSortedMap<T> map) {
        return Int2ObjectSortedMaps.unmodifiable(map);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Char2Object
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Char2ObjectMap<T> newChar2ObjectMap() {
        return newChar2ObjectMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Char2ObjectMap<T> newChar2ObjectMap(@Positive int size) {
        return new Char2ObjectOpenHashMap<>(size, factor);
    }

    @SafeVarargs
    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Char2ObjectMap<T> newChar2ObjectMap(@NotNull CharObjectPair<T>... pairs) {
        Char2ObjectMap<T> result = newChar2ObjectMap(pairs.length);
        for (CharObjectPair<T> pair : pairs) {
            result.put(pair.leftChar(), pair.value());
        }
        return result;
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Char2ObjectMap<T> synchronize(@NotNull Char2ObjectMap<T> map) {
        return Char2ObjectMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Char2ObjectMap<T> unmodifiable(@NotNull Char2ObjectMap<T> map) {
        return Char2ObjectMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Char2Object | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Char2ObjectSortedMap<T> newChar2ObjectSortedMap() {
        return newChar2ObjectSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Char2ObjectSortedMap<T> newChar2ObjectSortedMap(@Positive int size) {
        return new Char2ObjectLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Char2ObjectSortedMap<T> synchronize(@NotNull Char2ObjectSortedMap<T> map) {
        return Char2ObjectSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Char2ObjectSortedMap<T> unmodifiable(@NotNull Char2ObjectSortedMap<T> map) {
        return Char2ObjectSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Short
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2ShortMap newInt2ShortMap() {
        return newInt2ShortMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ShortMap newInt2ShortMap(@Positive int size) {
        return new Int2ShortOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ShortMap synchronize(@NotNull Int2ShortMap map) {
        return Int2ShortMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ShortMap unmodifiable(@NotNull Int2ShortMap map) {
        return Int2ShortMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Short | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2ShortSortedMap newInt2ShortSortedMap() {
        return newInt2ShortSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ShortSortedMap newInt2ShortSortedMap(@Positive int size) {
        return new Int2ShortLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ShortSortedMap synchronize(@NotNull Int2ShortSortedMap map) {
        return Int2ShortSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ShortSortedMap unmodifiable(@NotNull Int2ShortSortedMap map) {
        return Int2ShortSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Byte
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2ByteMap newInt2ByteMap() {
        return newInt2ByteMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ByteMap newInt2ByteMap(@Positive int size) {
        return new Int2ByteOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ByteMap synchronize(@NotNull Int2ByteMap map) {
        return Int2ByteMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ByteMap unmodifiable(@NotNull Int2ByteMap map) {
        return Int2ByteMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Byte | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2ByteSortedMap newInt2ByteSortedMap() {
        return newInt2ByteSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ByteSortedMap newInt2ByteSortedMap(@Positive int size) {
        return new Int2ByteLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ByteSortedMap synchronize(@NotNull Int2ByteSortedMap map) {
        return Int2ByteSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2ByteSortedMap unmodifiable(@NotNull Int2ByteSortedMap map) {
        return Int2ByteSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Long
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2LongMap newInt2LongMap() {
        return newInt2LongMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2LongMap newInt2LongMap(@Positive int size) {
        return new Int2LongOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2LongMap synchronize(@NotNull Int2LongMap map) {
        return Int2LongMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2LongMap unmodifiable(@NotNull Int2LongMap map) {
        return Int2LongMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Int2Long | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Int2LongSortedMap newInt2LongSortedMap() {
        return newInt2LongSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2LongSortedMap newInt2LongSortedMap(@Positive int size) {
        return new Int2LongLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2LongSortedMap synchronize(@NotNull Int2LongSortedMap map) {
        return Int2LongSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Int2LongSortedMap unmodifiable(@NotNull Int2LongSortedMap map) {
        return Int2LongSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Int
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2IntMap newFloat2IntMap() {
        return newFloat2IntMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2IntMap newFloat2IntMap(@Positive int size) {
        return new Float2IntOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2IntMap synchronize(@NotNull Float2IntMap map) {
        return Float2IntMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2IntMap unmodifiable(@NotNull Float2IntMap map) {
        return Float2IntMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Int | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2IntSortedMap newFloat2IntSortedMap() {
        return newFloat2IntSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2IntSortedMap newFloat2IntSortedMap(@Positive int size) {
        return new Float2IntLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2IntSortedMap synchronize(@NotNull Float2IntSortedMap map) {
        return Float2IntSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2IntSortedMap unmodifiable(@NotNull Float2IntSortedMap map) {
        return Float2IntSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Boolean
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2BooleanMap newFloat2BooleanMap() {
        return newFloat2BooleanMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2BooleanMap newFloat2BooleanMap(@Positive int size) {
        return new Float2BooleanOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2BooleanMap synchronize(@NotNull Float2BooleanMap map) {
        return Float2BooleanMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2BooleanMap unmodifiable(@NotNull Float2BooleanMap map) {
        return Float2BooleanMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Boolean | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2BooleanSortedMap newFloat2BooleanSortedMap() {
        return newFloat2BooleanSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2BooleanSortedMap newFloat2BooleanSortedMap(@Positive int size) {
        return new Float2BooleanLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2BooleanSortedMap synchronize(@NotNull Float2BooleanSortedMap map) {
        return Float2BooleanSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2BooleanSortedMap unmodifiable(@NotNull Float2BooleanSortedMap map) {
        return Float2BooleanSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Float
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2FloatMap newFloat2FloatMap() {
        return newFloat2FloatMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2FloatMap newFloat2FloatMap(@Positive int size) {
        return new Float2FloatOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2FloatMap synchronize(@NotNull Float2FloatMap map) {
        return Float2FloatMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2FloatMap unmodifiable(@NotNull Float2FloatMap map) {
        return Float2FloatMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Float | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2FloatSortedMap newFloat2FloatSortedMap() {
        return newFloat2FloatSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2FloatSortedMap newFloat2FloatSortedMap(@Positive int size) {
        return new Float2FloatLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2FloatSortedMap synchronize(@NotNull Float2FloatSortedMap map) {
        return Float2FloatSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2FloatSortedMap unmodifiable(@NotNull Float2FloatSortedMap map) {
        return Float2FloatSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Object
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Float2ObjectMap<T> newFloat2ObjectMap() {
        return newFloat2ObjectMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Float2ObjectMap<T> newFloat2ObjectMap(@Positive int size) {
        return new Float2ObjectOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Float2ObjectMap<T> synchronize(@NotNull Float2ObjectMap<T> map) {
        return Float2ObjectMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Float2ObjectMap<T> unmodifiable(@NotNull Float2ObjectMap<T> map) {
        return Float2ObjectMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Object | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Float2ObjectSortedMap<T> newFloat2ObjectSortedMap() {
        return newFloat2ObjectSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Float2ObjectSortedMap<T> newFloat2ObjectSortedMap(@Positive int size) {
        return new Float2ObjectLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Float2ObjectSortedMap<T> synchronize(@NotNull Float2ObjectSortedMap<T> map) {
        return Float2ObjectSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Float2ObjectSortedMap<T> unmodifiable(@NotNull Float2ObjectSortedMap<T> map) {
        return Float2ObjectSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Short
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2ShortMap newFloat2ShortMap() {
        return newFloat2ShortMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ShortMap newFloat2ShortMap(@Positive int size) {
        return new Float2ShortOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ShortMap synchronize(@NotNull Float2ShortMap map) {
        return Float2ShortMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ShortMap unmodifiable(@NotNull Float2ShortMap map) {
        return Float2ShortMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Short | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2ShortSortedMap newFloat2ShortSortedMap() {
        return newFloat2ShortSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ShortSortedMap newFloat2ShortSortedMap(@Positive int size) {
        return new Float2ShortLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ShortSortedMap synchronize(@NotNull Float2ShortSortedMap map) {
        return Float2ShortSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ShortSortedMap unmodifiable(@NotNull Float2ShortSortedMap map) {
        return Float2ShortSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Byte
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2ByteMap newFloat2ByteMap() {
        return newFloat2ByteMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ByteMap newFloat2ByteMap(@Positive int size) {
        return new Float2ByteOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ByteMap synchronize(@NotNull Float2ByteMap map) {
        return Float2ByteMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ByteMap unmodifiable(@NotNull Float2ByteMap map) {
        return Float2ByteMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Byte | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2ByteSortedMap newFloat2ByteSortedMap() {
        return newFloat2ByteSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ByteSortedMap newFloat2ByteSortedMap(@Positive int size) {
        return new Float2ByteLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ByteSortedMap synchronize(@NotNull Float2ByteSortedMap map) {
        return Float2ByteSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2ByteSortedMap unmodifiable(@NotNull Float2ByteSortedMap map) {
        return Float2ByteSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Long
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2LongMap newFloat2LongMap() {
        return newFloat2LongMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2LongMap newFloat2LongMap(@Positive int size) {
        return new Float2LongOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2LongMap synchronize(@NotNull Float2LongMap map) {
        return Float2LongMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2LongMap unmodifiable(@NotNull Float2LongMap map) {
        return Float2LongMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Float2Long | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Float2LongSortedMap newFloat2LongSortedMap() {
        return newFloat2LongSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2LongSortedMap newFloat2LongSortedMap(@Positive int size) {
        return new Float2LongLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2LongSortedMap synchronize(@NotNull Float2LongSortedMap map) {
        return Float2LongSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Float2LongSortedMap unmodifiable(@NotNull Float2LongSortedMap map) {
        return Float2LongSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Int
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2IntMap<T> newObject2IntMap() {
        return newObject2IntMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2IntMap<T> newObject2IntMap(@Positive int size) {
        return new Object2IntOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2IntMap<T> synchronize(@NotNull Object2IntMap<T> map) {
        return Object2IntMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2IntMap<T> unmodifiable(@NotNull Object2IntMap<T> map) {
        return Object2IntMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Int | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2IntSortedMap<T> newObject2IntSortedMap() {
        return newObject2IntSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2IntSortedMap<T> newObject2IntSortedMap(@Positive int size) {
        return new Object2IntLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2IntSortedMap<T> synchronize(@NotNull Object2IntSortedMap<T> map) {
        return Object2IntSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2IntSortedMap<T> unmodifiable(@NotNull Object2IntSortedMap<T> map) {
        return Object2IntSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Boolean
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2BooleanMap<T> newObject2BooleanMap() {
        return newObject2BooleanMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2BooleanMap<T> newObject2BooleanMap(@Positive int size) {
        return new Object2BooleanOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2BooleanMap<T> synchronize(@NotNull Object2BooleanMap<T> map) {
        return Object2BooleanMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2BooleanMap<T> unmodifiable(@NotNull Object2BooleanMap<T> map) {
        return Object2BooleanMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Boolean | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2BooleanSortedMap<T> newObject2BooleanSortedMap() {
        return newObject2BooleanSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2BooleanSortedMap<T> newObject2BooleanSortedMap(@Positive int size) {
        return new Object2BooleanLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2BooleanSortedMap<T> synchronize(@NotNull Object2BooleanSortedMap<T> map) {
        return Object2BooleanSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2BooleanSortedMap<T> unmodifiable(@NotNull Object2BooleanSortedMap<T> map) {
        return Object2BooleanSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Float
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2FloatMap<T> newObject2FloatMap() {
        return newObject2FloatMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2FloatMap<T> newObject2FloatMap(@Positive int size) {
        return new Object2FloatOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2FloatMap<T> synchronize(@NotNull Object2FloatMap<T> map) {
        return Object2FloatMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2FloatMap<T> unmodifiable(@NotNull Object2FloatMap<T> map) {
        return Object2FloatMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Float | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2FloatSortedMap<T> newObject2FloatSortedMap() {
        return newObject2FloatSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2FloatSortedMap<T> newObject2FloatSortedMap(@Positive int size) {
        return new Object2FloatLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2FloatSortedMap<T> synchronize(@NotNull Object2FloatSortedMap<T> map) {
        return Object2FloatSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2FloatSortedMap<T> unmodifiable(@NotNull Object2FloatSortedMap<T> map) {
        return Object2FloatSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Object
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <K, V> Object2ObjectMap<K, V> newMap() {
        return newMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <K, V> Object2ObjectMap<K, V> newMap(@Positive int size) {
        return new Object2ObjectOpenHashMap<>(size, factor);
    }

    @SafeVarargs
    @Contract(value = "_ -> new", pure = true)
    public @NotNull <K, V> Object2ObjectMap<K, V> newMap(@NotNull Pair<K, V>... pairs) {
        Object2ObjectMap<K, V> result = newMap(pairs.length);
        for (Pair<K, V> pair : pairs) {
            result.put(pair.first(), pair.second());
        }
        return result;
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <K, V> Object2ObjectMap<K, V> synchronize(@NotNull Object2ObjectMap<K, V> map) {
        return Object2ObjectMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <K, V> Object2ObjectMap<K, V> unmodifiable(@NotNull Object2ObjectMap<K, V> map) {
        return Object2ObjectMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Object | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <K, V> Object2ObjectSortedMap<K, V> newObject2ObjectSortedMap() {
        return newObject2ObjectSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <K, V> Object2ObjectSortedMap<K, V> newObject2ObjectSortedMap(@Positive int size) {
        return new Object2ObjectLinkedOpenHashMap<>(size, factor);
    }

    @SafeVarargs
    @Contract(value = "_ -> new", pure = true)
    public @NotNull <K, V> Object2ObjectSortedMap<K, V> newObject2ObjectSortedMap(@NotNull Pair<K, V>... pairs) {
        Object2ObjectSortedMap<K, V> result = newObject2ObjectSortedMap(pairs.length);
        for (Pair<K, V> pair : pairs) {
            result.put(pair.first(), pair.second());
        }
        return result;
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <K, V> Object2ObjectSortedMap<K, V> synchronize(@NotNull Object2ObjectSortedMap<K, V> map) {
        return Object2ObjectSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <K, V> Object2ObjectSortedMap<K, V> unmodifiable(@NotNull Object2ObjectSortedMap<K, V> map) {
        return Object2ObjectSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Short
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2ShortMap<T> newObject2ShortMap() {
        return newObject2ShortMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ShortMap<T> newObject2ShortMap(@Positive int size) {
        return new Object2ShortOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ShortMap<T> synchronize(@NotNull Object2ShortMap<T> map) {
        return Object2ShortMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ShortMap<T> unmodifiable(@NotNull Object2ShortMap<T> map) {
        return Object2ShortMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Short | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2ShortSortedMap<T> newObject2ShortSortedMap() {
        return newObject2ShortSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ShortSortedMap<T> newObject2ShortSortedMap(@Positive int size) {
        return new Object2ShortLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ShortSortedMap<T> synchronize(@NotNull Object2ShortSortedMap<T> map) {
        return Object2ShortSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ShortSortedMap<T> unmodifiable(@NotNull Object2ShortSortedMap<T> map) {
        return Object2ShortSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Byte
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2ByteMap<T> newObject2ByteMap() {
        return newObject2ByteMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ByteMap<T> newObject2ByteMap(@Positive int size) {
        return new Object2ByteOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ByteMap<T> synchronize(@NotNull Object2ByteMap<T> map) {
        return Object2ByteMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ByteMap<T> unmodifiable(@NotNull Object2ByteMap<T> map) {
        return Object2ByteMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Byte | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2ByteSortedMap<T> newObject2ByteSortedMap() {
        return newObject2ByteSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ByteSortedMap<T> newObject2ByteSortedMap(@Positive int size) {
        return new Object2ByteLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ByteSortedMap<T> synchronize(@NotNull Object2ByteSortedMap<T> map) {
        return Object2ByteSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2ByteSortedMap<T> unmodifiable(@NotNull Object2ByteSortedMap<T> map) {
        return Object2ByteSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Long
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2LongMap<T> newObject2LongMap() {
        return newObject2LongMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2LongMap<T> newObject2LongMap(@Positive int size) {
        return new Object2LongOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2LongMap<T> synchronize(@NotNull Object2LongMap<T> map) {
        return Object2LongMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2LongMap<T> unmodifiable(@NotNull Object2LongMap<T> map) {
        return Object2LongMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Object2Long | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Object2LongSortedMap<T> newObject2LongSortedMap() {
        return newObject2LongSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2LongSortedMap<T> newObject2LongSortedMap(@Positive int size) {
        return new Object2LongLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2LongSortedMap<T> synchronize(@NotNull Object2LongSortedMap<T> map) {
        return Object2LongSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Object2LongSortedMap<T> unmodifiable(@NotNull Object2LongSortedMap<T> map) {
        return Object2LongSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Int
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2IntMap newShort2IntMap() {
        return newShort2IntMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2IntMap newShort2IntMap(@Positive int size) {
        return new Short2IntOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2IntMap synchronize(@NotNull Short2IntMap map) {
        return Short2IntMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2IntMap unmodifiable(@NotNull Short2IntMap map) {
        return Short2IntMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Int | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2IntSortedMap newShort2IntSortedMap() {
        return newShort2IntSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2IntSortedMap newShort2IntSortedMap(@Positive int size) {
        return new Short2IntLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2IntSortedMap synchronize(@NotNull Short2IntSortedMap map) {
        return Short2IntSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2IntSortedMap unmodifiable(@NotNull Short2IntSortedMap map) {
        return Short2IntSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Boolean
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2BooleanMap newShort2BooleanMap() {
        return newShort2BooleanMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2BooleanMap newShort2BooleanMap(@Positive int size) {
        return new Short2BooleanOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2BooleanMap synchronize(@NotNull Short2BooleanMap map) {
        return Short2BooleanMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2BooleanMap unmodifiable(@NotNull Short2BooleanMap map) {
        return Short2BooleanMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Boolean | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2BooleanSortedMap newShort2BooleanSortedMap() {
        return newShort2BooleanSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2BooleanSortedMap newShort2BooleanSortedMap(@Positive int size) {
        return new Short2BooleanLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2BooleanSortedMap synchronize(@NotNull Short2BooleanSortedMap map) {
        return Short2BooleanSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2BooleanSortedMap unmodifiable(@NotNull Short2BooleanSortedMap map) {
        return Short2BooleanSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Float
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2FloatMap newShort2FloatMap() {
        return newShort2FloatMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2FloatMap newShort2FloatMap(@Positive int size) {
        return new Short2FloatOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2FloatMap synchronize(@NotNull Short2FloatMap map) {
        return Short2FloatMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2FloatMap unmodifiable(@NotNull Short2FloatMap map) {
        return Short2FloatMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Float | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2FloatSortedMap newShort2FloatSortedMap() {
        return newShort2FloatSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2FloatSortedMap newShort2FloatSortedMap(@Positive int size) {
        return new Short2FloatLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2FloatSortedMap synchronize(@NotNull Short2FloatSortedMap map) {
        return Short2FloatSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2FloatSortedMap unmodifiable(@NotNull Short2FloatSortedMap map) {
        return Short2FloatSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Object
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Short2ObjectMap<T> newShort2ObjectMap() {
        return newShort2ObjectMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Short2ObjectMap<T> newShort2ObjectMap(@Positive int size) {
        return new Short2ObjectOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Short2ObjectMap<T> synchronize(@NotNull Short2ObjectMap<T> map) {
        return Short2ObjectMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Short2ObjectMap<T> unmodifiable(@NotNull Short2ObjectMap<T> map) {
        return Short2ObjectMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Object | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Short2ObjectSortedMap<T> newShort2ObjectSortedMap() {
        return newShort2ObjectSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Short2ObjectSortedMap<T> newShort2ObjectSortedMap(@Positive int size) {
        return new Short2ObjectLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Short2ObjectSortedMap<T> synchronize(@NotNull Short2ObjectSortedMap<T> map) {
        return Short2ObjectSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Short2ObjectSortedMap<T> unmodifiable(@NotNull Short2ObjectSortedMap<T> map) {
        return Short2ObjectSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Short
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2ShortMap newShort2ShortMap() {
        return newShort2ShortMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ShortMap newShort2ShortMap(@Positive int size) {
        return new Short2ShortOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ShortMap synchronize(@NotNull Short2ShortMap map) {
        return Short2ShortMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ShortMap unmodifiable(@NotNull Short2ShortMap map) {
        return Short2ShortMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Short | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2ShortSortedMap newShort2ShortSortedMap() {
        return newShort2ShortSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ShortSortedMap newShort2ShortSortedMap(@Positive int size) {
        return new Short2ShortLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ShortSortedMap synchronize(@NotNull Short2ShortSortedMap map) {
        return Short2ShortSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ShortSortedMap unmodifiable(@NotNull Short2ShortSortedMap map) {
        return Short2ShortSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Byte
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2ByteMap newShort2ByteMap() {
        return newShort2ByteMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ByteMap newShort2ByteMap(@Positive int size) {
        return new Short2ByteOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ByteMap synchronize(@NotNull Short2ByteMap map) {
        return Short2ByteMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ByteMap unmodifiable(@NotNull Short2ByteMap map) {
        return Short2ByteMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Byte | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2ByteSortedMap newShort2ByteSortedMap() {
        return newShort2ByteSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ByteSortedMap newShort2ByteSortedMap(@Positive int size) {
        return new Short2ByteLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ByteSortedMap synchronize(@NotNull Short2ByteSortedMap map) {
        return Short2ByteSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2ByteSortedMap unmodifiable(@NotNull Short2ByteSortedMap map) {
        return Short2ByteSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Long
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2LongMap newShort2LongMap() {
        return newShort2LongMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2LongMap newShort2LongMap(@Positive int size) {
        return new Short2LongOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2LongMap synchronize(@NotNull Short2LongMap map) {
        return Short2LongMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2LongMap unmodifiable(@NotNull Short2LongMap map) {
        return Short2LongMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Short2Long | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Short2LongSortedMap newShort2LongSortedMap() {
        return newShort2LongSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2LongSortedMap newShort2LongSortedMap(@Positive int size) {
        return new Short2LongLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2LongSortedMap synchronize(@NotNull Short2LongSortedMap map) {
        return Short2LongSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Short2LongSortedMap unmodifiable(@NotNull Short2LongSortedMap map) {
        return Short2LongSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Int
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2IntMap newByte2IntMap() {
        return newByte2IntMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2IntMap newByte2IntMap(@Positive int size) {
        return new Byte2IntOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2IntMap synchronize(@NotNull Byte2IntMap map) {
        return Byte2IntMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2IntMap unmodifiable(@NotNull Byte2IntMap map) {
        return Byte2IntMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Int | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2IntSortedMap newByte2IntSortedMap() {
        return newByte2IntSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2IntSortedMap newByte2IntSortedMap(@Positive int size) {
        return new Byte2IntLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2IntSortedMap synchronize(@NotNull Byte2IntSortedMap map) {
        return Byte2IntSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2IntSortedMap unmodifiable(@NotNull Byte2IntSortedMap map) {
        return Byte2IntSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Boolean
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2BooleanMap newByte2BooleanMap() {
        return newByte2BooleanMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2BooleanMap newByte2BooleanMap(@Positive int size) {
        return new Byte2BooleanOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2BooleanMap synchronize(@NotNull Byte2BooleanMap map) {
        return Byte2BooleanMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2BooleanMap unmodifiable(@NotNull Byte2BooleanMap map) {
        return Byte2BooleanMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Boolean | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2BooleanSortedMap newByte2BooleanSortedMap() {
        return newByte2BooleanSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2BooleanSortedMap newByte2BooleanSortedMap(@Positive int size) {
        return new Byte2BooleanLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2BooleanSortedMap synchronize(@NotNull Byte2BooleanSortedMap map) {
        return Byte2BooleanSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2BooleanSortedMap unmodifiable(@NotNull Byte2BooleanSortedMap map) {
        return Byte2BooleanSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Float
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2FloatMap newByte2FloatMap() {
        return newByte2FloatMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2FloatMap newByte2FloatMap(@Positive int size) {
        return new Byte2FloatOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2FloatMap synchronize(@NotNull Byte2FloatMap map) {
        return Byte2FloatMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2FloatMap unmodifiable(@NotNull Byte2FloatMap map) {
        return Byte2FloatMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Float | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2FloatSortedMap newByte2FloatSortedMap() {
        return newByte2FloatSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2FloatSortedMap newByte2FloatSortedMap(@Positive int size) {
        return new Byte2FloatLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2FloatSortedMap synchronize(@NotNull Byte2FloatSortedMap map) {
        return Byte2FloatSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2FloatSortedMap unmodifiable(@NotNull Byte2FloatSortedMap map) {
        return Byte2FloatSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Object
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Byte2ObjectMap<T> newByte2ObjectMap() {
        return newByte2ObjectMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Byte2ObjectMap<T> newByte2ObjectMap(@Positive int size) {
        return new Byte2ObjectOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Byte2ObjectMap<T> synchronize(@NotNull Byte2ObjectMap<T> map) {
        return Byte2ObjectMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Byte2ObjectMap<T> unmodifiable(@NotNull Byte2ObjectMap<T> map) {
        return Byte2ObjectMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Object | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Byte2ObjectSortedMap<T> newByte2ObjectSortedMap() {
        return newByte2ObjectSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Byte2ObjectSortedMap<T> newByte2ObjectSortedMap(@Positive int size) {
        return new Byte2ObjectLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Byte2ObjectSortedMap<T> synchronize(@NotNull Byte2ObjectSortedMap<T> map) {
        return Byte2ObjectSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Byte2ObjectSortedMap<T> unmodifiable(@NotNull Byte2ObjectSortedMap<T> map) {
        return Byte2ObjectSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Short
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2ShortMap newByte2ShortMap() {
        return newByte2ShortMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ShortMap newByte2ShortMap(@Positive int size) {
        return new Byte2ShortOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ShortMap synchronize(@NotNull Byte2ShortMap map) {
        return Byte2ShortMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ShortMap unmodifiable(@NotNull Byte2ShortMap map) {
        return Byte2ShortMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Short | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2ShortSortedMap newByte2ShortSortedMap() {
        return newByte2ShortSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ShortSortedMap newByte2ShortSortedMap(@Positive int size) {
        return new Byte2ShortLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ShortSortedMap synchronize(@NotNull Byte2ShortSortedMap map) {
        return Byte2ShortSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ShortSortedMap unmodifiable(@NotNull Byte2ShortSortedMap map) {
        return Byte2ShortSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Byte
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2ByteMap newByte2ByteMap() {
        return newByte2ByteMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ByteMap newByte2ByteMap(@Positive int size) {
        return new Byte2ByteOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ByteMap synchronize(@NotNull Byte2ByteMap map) {
        return Byte2ByteMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ByteMap unmodifiable(@NotNull Byte2ByteMap map) {
        return Byte2ByteMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Byte | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2ByteSortedMap newByte2ByteSortedMap() {
        return newByte2ByteSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ByteSortedMap newByte2ByteSortedMap(@Positive int size) {
        return new Byte2ByteLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ByteSortedMap synchronize(@NotNull Byte2ByteSortedMap map) {
        return Byte2ByteSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2ByteSortedMap unmodifiable(@NotNull Byte2ByteSortedMap map) {
        return Byte2ByteSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Long
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2LongMap newByte2LongMap() {
        return newByte2LongMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2LongMap newByte2LongMap(@Positive int size) {
        return new Byte2LongOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2LongMap synchronize(@NotNull Byte2LongMap map) {
        return Byte2LongMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2LongMap unmodifiable(@NotNull Byte2LongMap map) {
        return Byte2LongMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Byte2Long | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Byte2LongSortedMap newByte2LongSortedMap() {
        return newByte2LongSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2LongSortedMap newByte2LongSortedMap(@Positive int size) {
        return new Byte2LongLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2LongSortedMap synchronize(@NotNull Byte2LongSortedMap map) {
        return Byte2LongSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Byte2LongSortedMap unmodifiable(@NotNull Byte2LongSortedMap map) {
        return Byte2LongSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Int
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2IntMap newLong2IntMap() {
        return newLong2IntMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2IntMap newLong2IntMap(@Positive int size) {
        return new Long2IntOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2IntMap synchronize(@NotNull Long2IntMap map) {
        return Long2IntMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2IntMap unmodifiable(@NotNull Long2IntMap map) {
        return Long2IntMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Int | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2IntSortedMap newLong2IntSortedMap() {
        return newLong2IntSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2IntSortedMap newLong2IntSortedMap(@Positive int size) {
        return new Long2IntLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2IntSortedMap synchronize(@NotNull Long2IntSortedMap map) {
        return Long2IntSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2IntSortedMap unmodifiable(@NotNull Long2IntSortedMap map) {
        return Long2IntSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Boolean
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2BooleanMap newLong2BooleanMap() {
        return newLong2BooleanMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2BooleanMap newLong2BooleanMap(@Positive int size) {
        return new Long2BooleanOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2BooleanMap synchronize(@NotNull Long2BooleanMap map) {
        return Long2BooleanMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2BooleanMap unmodifiable(@NotNull Long2BooleanMap map) {
        return Long2BooleanMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Boolean | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2BooleanSortedMap newLong2BooleanSortedMap() {
        return newLong2BooleanSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2BooleanSortedMap newLong2BooleanSortedMap(@Positive int size) {
        return new Long2BooleanLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2BooleanSortedMap synchronize(@NotNull Long2BooleanSortedMap map) {
        return Long2BooleanSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2BooleanSortedMap unmodifiable(@NotNull Long2BooleanSortedMap map) {
        return Long2BooleanSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Float
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2FloatMap newLong2FloatMap() {
        return newLong2FloatMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2FloatMap newLong2FloatMap(@Positive int size) {
        return new Long2FloatOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2FloatMap synchronize(@NotNull Long2FloatMap map) {
        return Long2FloatMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2FloatMap unmodifiable(@NotNull Long2FloatMap map) {
        return Long2FloatMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Float | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2FloatSortedMap newLong2FloatSortedMap() {
        return newLong2FloatSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2FloatSortedMap newLong2FloatSortedMap(@Positive int size) {
        return new Long2FloatLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2FloatSortedMap synchronize(@NotNull Long2FloatSortedMap map) {
        return Long2FloatSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2FloatSortedMap unmodifiable(@NotNull Long2FloatSortedMap map) {
        return Long2FloatSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Object
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Long2ObjectMap<T> newLong2ObjectMap() {
        return newLong2ObjectMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Long2ObjectMap<T> newLong2ObjectMap(@Positive int size) {
        return new Long2ObjectOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Long2ObjectMap<T> synchronize(@NotNull Long2ObjectMap<T> map) {
        return Long2ObjectMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Long2ObjectMap<T> unmodifiable(@NotNull Long2ObjectMap<T> map) {
        return Long2ObjectMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Object | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull <T> Long2ObjectSortedMap<T> newLong2ObjectSortedMap() {
        return newLong2ObjectSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Long2ObjectSortedMap<T> newLong2ObjectSortedMap(@Positive int size) {
        return new Long2ObjectLinkedOpenHashMap<>(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Long2ObjectSortedMap<T> synchronize(@NotNull Long2ObjectSortedMap<T> map) {
        return Long2ObjectSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> Long2ObjectSortedMap<T> unmodifiable(@NotNull Long2ObjectSortedMap<T> map) {
        return Long2ObjectSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Short
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2ShortMap newLong2ShortMap() {
        return newLong2ShortMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ShortMap newLong2ShortMap(@Positive int size) {
        return new Long2ShortOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ShortMap synchronize(@NotNull Long2ShortMap map) {
        return Long2ShortMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ShortMap unmodifiable(@NotNull Long2ShortMap map) {
        return Long2ShortMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Short | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2ShortSortedMap newLong2ShortSortedMap() {
        return newLong2ShortSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ShortSortedMap newLong2ShortSortedMap(@Positive int size) {
        return new Long2ShortLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ShortSortedMap synchronize(@NotNull Long2ShortSortedMap map) {
        return Long2ShortSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ShortSortedMap unmodifiable(@NotNull Long2ShortSortedMap map) {
        return Long2ShortSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Byte
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2ByteMap newLong2ByteMap() {
        return newLong2ByteMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ByteMap newLong2ByteMap(@Positive int size) {
        return new Long2ByteOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ByteMap synchronize(@NotNull Long2ByteMap map) {
        return Long2ByteMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ByteMap unmodifiable(@NotNull Long2ByteMap map) {
        return Long2ByteMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Byte | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2ByteSortedMap newLong2ByteSortedMap() {
        return newLong2ByteSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ByteSortedMap newLong2ByteSortedMap(@Positive int size) {
        return new Long2ByteLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ByteSortedMap synchronize(@NotNull Long2ByteSortedMap map) {
        return Long2ByteSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2ByteSortedMap unmodifiable(@NotNull Long2ByteSortedMap map) {
        return Long2ByteSortedMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Long
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2LongMap newLong2LongMap() {
        return newLong2LongMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2LongMap newLong2LongMap(@Positive int size) {
        return new Long2LongOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2LongMap synchronize(@NotNull Long2LongMap map) {
        return Long2LongMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2LongMap unmodifiable(@NotNull Long2LongMap map) {
        return Long2LongMaps.unmodifiable(map);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long2Long | Linked
    ///////////////////////////////////////////////////////////////////////////

    @Contract(value = "-> new", pure = true)
    public @NotNull Long2LongSortedMap newLong2LongSortedMap() {
        return newLong2LongSortedMap(defaultSize);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2LongSortedMap newLong2LongSortedMap(@Positive int size) {
        return new Long2LongLinkedOpenHashMap(size, factor);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2LongSortedMap synchronize(@NotNull Long2LongSortedMap map) {
        return Long2LongSortedMaps.synchronize(map);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull Long2LongSortedMap unmodifiable(@NotNull Long2LongSortedMap map) {
        return Long2LongSortedMaps.unmodifiable(map);
    }
}
