package io.github.blackbaroness.fastutilextender.common.list.extra;

import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public class ObjectListWrapper<V> implements ObjectList<V> {

    protected final ObjectList<V> wrappedList;

    public ObjectListWrapper(@NotNull ObjectList<V> wrappedList) {
        this.wrappedList = wrappedList;
    }

    @Override
    public int size() {
        return wrappedList.size();
    }

    @Override
    public boolean isEmpty() {
        return wrappedList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return wrappedList.contains(o);
    }

    @Override
    public ObjectListIterator<V> iterator() {
        return wrappedList.iterator();
    }

    @NotNull
    @Override
    public Object @NotNull [] toArray() {
        return wrappedList.toArray();
    }

    @NotNull
    @Override
    public <T> T @NotNull [] toArray(@NotNull T @NotNull [] a) {
        return wrappedList.toArray(a);
    }

    @Override
    public boolean add(V v) {
        return wrappedList.add(v);
    }

    @Override
    public boolean remove(Object o) {
        return wrappedList.remove(o);
    }

    @SuppressWarnings("SlowListContainsAll")
    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return wrappedList.containsAll(c);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends V> c) {
        return wrappedList.addAll(c);
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends V> c) {
        return wrappedList.addAll(index, c);
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return wrappedList.removeAll(c);
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return wrappedList.retainAll(c);
    }

    @Override
    public void clear() {
        wrappedList.clear();
    }

    @Override
    public V get(int index) {
        return wrappedList.get(index);
    }

    @Override
    public V set(int index, V element) {
        return wrappedList.set(index, element);
    }

    @Override
    public void add(int index, V element) {
        wrappedList.add(index, element);
    }

    @Override
    public V remove(int index) {
        return wrappedList.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return wrappedList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return wrappedList.lastIndexOf(o);
    }

    @Override
    public ObjectListIterator<V> listIterator() {
        return wrappedList.listIterator();
    }

    @Override
    public ObjectListIterator<V> listIterator(int index) {
        return wrappedList.listIterator(index);
    }

    @Override
    public ObjectList<V> subList(int from, int to) {
        return wrappedList.subList(from, to);
    }

    @Override
    public void size(int size) {
        wrappedList.size(size);
    }

    @Override
    public void getElements(int from, Object[] a, int offset, int length) {
        wrappedList.getElements(from, a, offset, length);
    }

    @Override
    public void removeElements(int from, int to) {
        wrappedList.removeElements(from, to);
    }

    @Override
    public void addElements(int index, V[] a) {
        wrappedList.addElements(index, a);
    }

    @Override
    public void addElements(int index, V[] a, int offset, int length) {
        wrappedList.addElements(index, a, offset, length);
    }

    @Override
    public int compareTo(@NotNull List<? extends V> o) {
        return wrappedList.compareTo(o);
    }
}

