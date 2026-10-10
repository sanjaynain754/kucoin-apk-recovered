package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
public class ArrayMap<K, V> extends AbstractMap<K, V> implements Cloneable {
    private Object[] data;
    int size;

    public final class Entry implements Map.Entry<K, V> {
        private int index;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Objects.equal(getKey(), entry.getKey()) && Objects.equal(getValue(), entry.getValue());
        }

        public Entry(int i11) {
            this.index = i11;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ArrayMap.this.getKey(this.index);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) ArrayMap.this.getValue(this.index);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            return (V) ArrayMap.this.set(this.index, v11);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            Object key = getKey();
            Object value = getValue();
            int iHashCode2 = 0;
            if (key != null) {
                iHashCode = key.hashCode();
            } else {
                iHashCode = 0;
            }
            if (value != null) {
                iHashCode2 = value.hashCode();
            }
            return iHashCode ^ iHashCode2;
        }
    }

    public final class EntryIterator implements Iterator<Map.Entry<K, V>> {
        private int nextIndex;
        private boolean removed;

        public EntryIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextIndex < ArrayMap.this.size;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            int i11 = this.nextIndex;
            ArrayMap arrayMap = ArrayMap.this;
            if (i11 == arrayMap.size) {
                throw new NoSuchElementException();
            }
            this.nextIndex = i11 + 1;
            this.removed = false;
            return new Entry(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            int i11 = this.nextIndex - 1;
            if (this.removed || i11 < 0) {
                throw new IllegalArgumentException();
            }
            ArrayMap.this.remove(i11);
            this.nextIndex--;
            this.removed = true;
        }
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ArrayMap.this.size;
        }
    }

    public static <K, V> ArrayMap<K, V> create() {
        return new ArrayMap<>();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ArrayMap<K, V> m13330of(Object... objArr) {
        ArrayMap<K, V> arrayMapCreate = create(1);
        int length = objArr.length;
        if (1 == length % 2) {
            throw new IllegalArgumentException("missing value for last key: " + objArr[length - 1]);
        }
        arrayMapCreate.size = objArr.length / 2;
        Object[] objArr2 = new Object[length];
        ((ArrayMap) arrayMapCreate).data = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return arrayMapCreate;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.size = 0;
        this.data = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return -2 != getDataIndexOfKey(obj);
    }

    public final V remove(int i11) {
        return removeFromDataIndexOfKey(i11 << 1);
    }

    public final V set(int i11, K k11, V v11) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = i11 + 1;
        ensureCapacity(i12);
        int i13 = i11 << 1;
        V vValueAtDataIndex = valueAtDataIndex(i13 + 1);
        setData(i13, k11, v11);
        if (i12 > this.size) {
            this.size = i12;
        }
        return vValueAtDataIndex;
    }

    public static <K, V> ArrayMap<K, V> create(int i11) {
        ArrayMap<K, V> arrayMapCreate = create();
        arrayMapCreate.ensureCapacity(i11);
        return arrayMapCreate;
    }

    private int getDataIndexOfKey(Object obj) {
        int i11 = this.size << 1;
        Object[] objArr = this.data;
        for (int i12 = 0; i12 < i11; i12 += 2) {
            Object obj2 = objArr[i12];
            if (obj == null) {
                if (obj2 == null) {
                    return i12;
                }
            } else {
                if (obj.equals(obj2)) {
                    return i12;
                }
            }
        }
        return -2;
    }

    private V removeFromDataIndexOfKey(int i11) {
        int i12 = this.size << 1;
        if (i11 < 0 || i11 >= i12) {
            return null;
        }
        V vValueAtDataIndex = valueAtDataIndex(i11 + 1);
        Object[] objArr = this.data;
        int i13 = (i12 - i11) - 2;
        if (i13 != 0) {
            System.arraycopy(objArr, i11 + 2, objArr, i11, i13);
        }
        this.size--;
        setData(i12 - 2, null, null);
        return vValueAtDataIndex;
    }

    private void setData(int i11, K k11, V v11) {
        Object[] objArr = this.data;
        objArr[i11] = k11;
        objArr[i11 + 1] = v11;
    }

    private void setDataCapacity(int i11) {
        if (i11 == 0) {
            this.data = null;
            return;
        }
        int i12 = this.size;
        Object[] objArr = this.data;
        if (i12 == 0 || i11 != objArr.length) {
            Object[] objArr2 = new Object[i11];
            this.data = objArr2;
            if (i12 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i12 << 1);
            }
        }
    }

    private V valueAtDataIndex(int i11) {
        if (i11 < 0) {
            return null;
        }
        return (V) this.data[i11];
    }

    public final void add(K k11, V v11) {
        set(this.size, k11, v11);
    }

    @Override // java.util.AbstractMap
    public ArrayMap<K, V> clone() {
        try {
            ArrayMap<K, V> arrayMap = (ArrayMap) super.clone();
            Object[] objArr = this.data;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                arrayMap.data = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return arrayMap;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i11 = this.size << 1;
        Object[] objArr = this.data;
        for (int i12 = 1; i12 < i11; i12 += 2) {
            Object obj2 = objArr[i12];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else {
                if (obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void ensureCapacity(int i11) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] objArr = this.data;
        int i12 = i11 << 1;
        int length = objArr == null ? 0 : objArr.length;
        if (i12 > length) {
            int i13 = (length / 2) * 3;
            int i14 = i13 + 1;
            if (i14 % 2 != 0) {
                i14 = i13 + 2;
            }
            if (i14 >= i12) {
                i12 = i14;
            }
            setDataCapacity(i12);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new EntrySet();
    }

    public final K getKey(int i11) {
        if (i11 < 0 || i11 >= this.size) {
            return null;
        }
        return (K) this.data[i11 << 1];
    }

    public final V getValue(int i11) {
        if (i11 < 0 || i11 >= this.size) {
            return null;
        }
        return valueAtDataIndex((i11 << 1) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return removeFromDataIndexOfKey(getDataIndexOfKey(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    public final void trim() {
        setDataCapacity(this.size << 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return valueAtDataIndex(getDataIndexOfKey(obj) + 1);
    }

    public final int getIndexOfKey(K k11) {
        return getDataIndexOfKey(k11) >> 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k11, V v11) {
        int indexOfKey = getIndexOfKey(k11);
        if (indexOfKey == -1) {
            indexOfKey = this.size;
        }
        return set(indexOfKey, k11, v11);
    }

    public final V set(int i11, V v11) {
        int i12 = this.size;
        if (i11 >= 0 && i11 < i12) {
            int i13 = (i11 << 1) + 1;
            V vValueAtDataIndex = valueAtDataIndex(i13);
            this.data[i13] = v11;
            return vValueAtDataIndex;
        }
        throw new IndexOutOfBoundsException();
    }
}
