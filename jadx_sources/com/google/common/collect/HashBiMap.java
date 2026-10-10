package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;

    @LazyInit
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @RetainedWith
    @LazyInit
    private transient BiMap<V, K> inverse;

    @LazyInit
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;

    @LazyInit
    private transient Set<V> valueSet;
    transient V[] values;

    public final class EntryForKey extends AbstractMapEntry<K, V> {
        int index;

        @ParametricNullness
        final K key;

        public EntryForKey(int i11) {
            this.key = (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i11]);
            this.index = i11;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        public void updateIndex() {
            int i11 = this.index;
            if (i11 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i11 <= hashBiMap.size && Objects.equal(hashBiMap.keys[i11], this.key)) {
                    return;
                }
            }
            this.index = HashBiMap.this.findEntryByKey(this.key);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            updateIndex();
            int i11 = this.index;
            if (i11 == -1) {
                return (V) NullnessCasts.unsafeNull();
            }
            return (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i11]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v11) {
            updateIndex();
            int i11 = this.index;
            if (i11 == -1) {
                HashBiMap.this.put(this.key, v11);
                return (V) NullnessCasts.unsafeNull();
            }
            V v12 = (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i11]);
            if (!Objects.equal(v12, v11)) {
                HashBiMap.this.replaceValueInEntry(this.index, v11, false);
                return v12;
            }
            return v11;
        }
    }

    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        final HashBiMap<K, V> biMap;
        int index;

        @ParametricNullness
        final V value;

        private void updateIndex() {
            int i11 = this.index;
            if (i11 != -1) {
                HashBiMap<K, V> hashBiMap = this.biMap;
                if (i11 <= hashBiMap.size && Objects.equal(this.value, hashBiMap.values[i11])) {
                    return;
                }
            }
            this.index = this.biMap.findEntryByValue(this.value);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return this.value;
        }

        public EntryForValue(HashBiMap<K, V> hashBiMap, int i11) {
            this.biMap = hashBiMap;
            this.value = (V) NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i11]);
            this.index = i11;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            updateIndex();
            int i11 = this.index;
            if (i11 == -1) {
                return (K) NullnessCasts.unsafeNull();
            }
            return (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i11]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k11) {
            updateIndex();
            int i11 = this.index;
            if (i11 == -1) {
                this.biMap.putInverse(this.value, k11, false);
                return (K) NullnessCasts.unsafeNull();
            }
            K k12 = (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i11]);
            if (!Objects.equal(k12, k11)) {
                this.biMap.replaceKeyInEntry(this.index, k11, false);
                return k12;
            }
            return k11;
        }
    }

    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        public EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByKey = HashBiMap.this.findEntryByKey(key);
                if (iFindEntryByKey != -1 && Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<K, V> forEntry(int i11) {
            return new EntryForKey(i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key, iSmearedHash);
            if (iFindEntryByKey == -1 || !Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }
    }

    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K forcePut(@ParametricNullness V v11, @ParametricNullness K k11) {
            return this.forward.putInverse(v11, k11, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K put(@ParametricNullness V v11, @ParametricNullness K k11) {
            return this.forward.putInverse(v11, k11, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        public K remove(Object obj) {
            return this.forward.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.forward.keySet();
        }

        public Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.forward).inverse = this;
        }
    }

    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByValue = this.biMap.findEntryByValue(key);
                if (iFindEntryByValue != -1 && Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<V, K> forEntry(int i11) {
            return new EntryForValue(this.biMap, i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByValue = this.biMap.findEntryByValue(key, iSmearedHash);
            if (iFindEntryByValue == -1 || !Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }

        public InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }
    }

    public final class KeySet extends View<K, V, K> {
        public KeySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public K forEntry(int i11) {
            return (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i11]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iSmearedHash = Hashing.smearedHash(obj);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(obj, iSmearedHash);
            if (iFindEntryByKey != -1) {
                HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
                return true;
            }
            return false;
        }
    }

    public final class ValueSet extends View<K, V, V> {
        public ValueSet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public V forEntry(int i11) {
            return (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i11]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iSmearedHash = Hashing.smearedHash(obj);
            int iFindEntryByValue = HashBiMap.this.findEntryByValue(obj, iSmearedHash);
            if (iFindEntryByValue != -1) {
                HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
                return true;
            }
            return false;
        }
    }

    public static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        @ParametricNullness
        public abstract T forEntry(int i11);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1
                private int expectedModCount;
                private int index;
                private int indexToRemove = -1;
                private int remaining;

                {
                    this.index = ((HashBiMap) View.this.biMap).firstInInsertionOrder;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    this.expectedModCount = hashBiMap.modCount;
                    this.remaining = hashBiMap.size;
                }

                private void checkForComodification() {
                    if (View.this.biMap.modCount != this.expectedModCount) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    if (this.index != -2 && this.remaining > 0) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (hasNext()) {
                        T t11 = (T) View.this.forEntry(this.index);
                        this.indexToRemove = this.index;
                        this.index = ((HashBiMap) View.this.biMap).nextInInsertionOrder[this.index];
                        this.remaining--;
                        return t11;
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.Iterator
                public void remove() {
                    boolean z11;
                    checkForComodification();
                    if (this.indexToRemove != -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    CollectPreconditions.checkRemove(z11);
                    View.this.biMap.removeEntry(this.indexToRemove);
                    int i11 = this.index;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    if (i11 == hashBiMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = hashBiMap.modCount;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }

        public View(HashBiMap<K, V> hashBiMap) {
            this.biMap = hashBiMap;
        }
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private void deleteFromTableKToV(int i11, int i12) {
        Preconditions.checkArgument(i11 != -1);
        int iBucket = bucket(i12);
        int[] iArr = this.hashTableKToV;
        int i13 = iArr[iBucket];
        if (i13 == i11) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[iBucket] = iArr2[i11];
            iArr2[i11] = -1;
            return;
        }
        int i14 = this.nextInBucketKToV[i13];
        while (true) {
            int i15 = i13;
            i13 = i14;
            if (i13 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.keys[i11]);
            }
            if (i13 == i11) {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i15] = iArr3[i11];
                iArr3[i11] = -1;
                return;
            }
            i14 = this.nextInBucketKToV[i13];
        }
    }

    private void deleteFromTableVToK(int i11, int i12) {
        Preconditions.checkArgument(i11 != -1);
        int iBucket = bucket(i12);
        int[] iArr = this.hashTableVToK;
        int i13 = iArr[iBucket];
        if (i13 == i11) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[iBucket] = iArr2[i11];
            iArr2[i11] = -1;
            return;
        }
        int i14 = this.nextInBucketVToK[i13];
        while (true) {
            int i15 = i13;
            i13 = i14;
            if (i13 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.values[i11]);
            }
            if (i13 == i11) {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i15] = iArr3[i11];
                iArr3[i11] = -1;
                return;
            }
            i14 = this.nextInBucketVToK[i13];
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i11) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
        Arrays.fill(iArrCopyOf, length, i11, -1);
        return iArrCopyOf;
    }

    private void insertIntoTableKToV(int i11, int i12) {
        Preconditions.checkArgument(i11 != -1);
        int iBucket = bucket(i12);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i11] = iArr2[iBucket];
        iArr2[iBucket] = i11;
    }

    private void insertIntoTableVToK(int i11, int i12) {
        Preconditions.checkArgument(i11 != -1);
        int iBucket = bucket(i12);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i11] = iArr2[iBucket];
        iArr2[iBucket] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int i11, @ParametricNullness K k11, boolean z11) {
        int i12;
        Preconditions.checkArgument(i11 != -1);
        int iSmearedHash = Hashing.smearedHash(k11);
        int iFindEntryByKey = findEntryByKey(k11, iSmearedHash);
        int i13 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i12 = -2;
        } else {
            if (!z11) {
                throw new IllegalArgumentException("Key already present in map: " + k11);
            }
            i13 = this.prevInInsertionOrder[iFindEntryByKey];
            i12 = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            if (i11 == this.size) {
                i11 = iFindEntryByKey;
            }
        }
        if (i13 == i11) {
            i13 = this.prevInInsertionOrder[i11];
        } else if (i13 == this.size) {
            i13 = iFindEntryByKey;
        }
        if (i12 == i11) {
            iFindEntryByKey = this.nextInInsertionOrder[i11];
        } else if (i12 != this.size) {
            iFindEntryByKey = i12;
        }
        setSucceeds(this.prevInInsertionOrder[i11], this.nextInInsertionOrder[i11]);
        deleteFromTableKToV(i11, Hashing.smearedHash(this.keys[i11]));
        this.keys[i11] = k11;
        insertIntoTableKToV(i11, Hashing.smearedHash(k11));
        setSucceeds(i13, i11);
        setSucceeds(i11, iFindEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i11, @ParametricNullness V v11, boolean z11) {
        Preconditions.checkArgument(i11 != -1);
        int iSmearedHash = Hashing.smearedHash(v11);
        int iFindEntryByValue = findEntryByValue(v11, iSmearedHash);
        if (iFindEntryByValue != -1) {
            if (!z11) {
                throw new IllegalArgumentException("Value already present in map: " + v11);
            }
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            if (i11 == this.size) {
                i11 = iFindEntryByValue;
            }
        }
        deleteFromTableVToK(i11, Hashing.smearedHash(this.values[i11]));
        this.values[i11] = v11;
        insertIntoTableVToK(i11, iSmearedHash);
    }

    private void setSucceeds(int i11, int i12) {
        if (i11 == -2) {
            this.firstInInsertionOrder = i12;
        } else {
            this.nextInInsertionOrder[i11] = i12;
        }
        if (i12 == -2) {
            this.lastInInsertionOrder = i11;
        } else {
            this.prevInInsertionOrder[i12] = i11;
        }
    }

    public int findEntryByKey(Object obj) {
        return findEntryByKey(obj, Hashing.smearedHash(obj));
    }

    public int findEntryByValue(Object obj) {
        return findEntryByValue(obj, Hashing.smearedHash(obj));
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V forcePut(@ParametricNullness K k11, @ParametricNullness V v11) {
        return put(k11, v11, true);
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k11, @ParametricNullness V v11) {
        return put(k11, v11, false);
    }

    public void removeEntry(int i11) {
        removeEntryKeyHashKnown(i11, Hashing.smearedHash(this.keys[i11]));
    }

    private int bucket(int i11) {
        return i11 & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create(int i11) {
        return new HashBiMap<>(i11);
    }

    private static int[] createFilledWithAbsent(int i11) {
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void ensureCapacity(int i11) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i11) {
            int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(iArr.length, i11);
            this.keys = (K[]) Arrays.copyOf(this.keys, iExpandedCapacity);
            this.values = (V[]) Arrays.copyOf(this.values, iExpandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iExpandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iExpandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iExpandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iExpandedCapacity);
        }
        if (this.hashTableKToV.length < i11) {
            int iClosedTableSize = Hashing.closedTableSize(i11, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
            this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
            for (int i12 = 0; i12 < this.size; i12++) {
                int iBucket = bucket(Hashing.smearedHash(this.keys[i12]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i12] = iArr3[iBucket];
                iArr3[iBucket] = i12;
                int iBucket2 = bucket(Hashing.smearedHash(this.values[i12]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i12] = iArr5[iBucket2];
                iArr5[iBucket2] = i12;
            }
        }
    }

    private void moveEntryToIndex(int i11, int i12) {
        int i13;
        int i14;
        if (i11 == i12) {
            return;
        }
        int i15 = this.prevInInsertionOrder[i11];
        int i16 = this.nextInInsertionOrder[i11];
        setSucceeds(i15, i12);
        setSucceeds(i12, i16);
        K[] kArr = this.keys;
        K k11 = kArr[i11];
        V[] vArr = this.values;
        V v11 = vArr[i11];
        kArr[i12] = k11;
        vArr[i12] = v11;
        int iBucket = bucket(Hashing.smearedHash(k11));
        int[] iArr = this.hashTableKToV;
        int i17 = iArr[iBucket];
        if (i17 == i11) {
            iArr[iBucket] = i12;
        } else {
            int i18 = this.nextInBucketKToV[i17];
            while (true) {
                i13 = i17;
                i17 = i18;
                if (i17 == i11) {
                    break;
                } else {
                    i18 = this.nextInBucketKToV[i17];
                }
            }
            this.nextInBucketKToV[i13] = i12;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[i12] = iArr2[i11];
        iArr2[i11] = -1;
        int iBucket2 = bucket(Hashing.smearedHash(v11));
        int[] iArr3 = this.hashTableVToK;
        int i19 = iArr3[iBucket2];
        if (i19 == i11) {
            iArr3[iBucket2] = i12;
        } else {
            int i21 = this.nextInBucketVToK[i19];
            while (true) {
                i14 = i19;
                i19 = i21;
                if (i19 == i11) {
                    break;
                } else {
                    i21 = this.nextInBucketVToK[i19];
                }
            }
            this.nextInBucketVToK[i14] = i12;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[i12] = iArr4[i11];
        iArr4[i11] = -1;
    }

    private void removeEntry(int i11, int i12, int i13) {
        Preconditions.checkArgument(i11 != -1);
        deleteFromTableKToV(i11, i12);
        deleteFromTableVToK(i11, i13);
        setSucceeds(this.prevInInsertionOrder[i11], this.nextInInsertionOrder[i11]);
        moveEntryToIndex(this.size - 1, i11);
        K[] kArr = this.keys;
        int i14 = this.size;
        kArr[i14 - 1] = null;
        this.values[i14 - 1] = null;
        this.size = i14 - 1;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public int findEntryByKey(Object obj, int i11) {
        return findEntry(obj, i11, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(Object obj, int i11) {
        return findEntry(obj, i11, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    public void init(int i11) {
        CollectPreconditions.checkNonnegative(i11, "expectedSize");
        int iClosedTableSize = Hashing.closedTableSize(i11, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i11];
        this.values = (V[]) new Object[i11];
        this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
        this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i11);
        this.nextInBucketVToK = createFilledWithAbsent(i11);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i11);
        this.nextInInsertionOrder = createFilledWithAbsent(i11);
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    public V put(@ParametricNullness K k11, @ParametricNullness V v11, boolean z11) {
        int iSmearedHash = Hashing.smearedHash(k11);
        int iFindEntryByKey = findEntryByKey(k11, iSmearedHash);
        if (iFindEntryByKey != -1) {
            V v12 = this.values[iFindEntryByKey];
            if (Objects.equal(v12, v11)) {
                return v11;
            }
            replaceValueInEntry(iFindEntryByKey, v11, z11);
            return v12;
        }
        int iSmearedHash2 = Hashing.smearedHash(v11);
        int iFindEntryByValue = findEntryByValue(v11, iSmearedHash2);
        if (!z11) {
            Preconditions.checkArgument(iFindEntryByValue == -1, "Value already present: %s", v11);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i11 = this.size;
        kArr[i11] = k11;
        this.values[i11] = v11;
        insertIntoTableKToV(i11, iSmearedHash);
        insertIntoTableVToK(this.size, iSmearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    public void removeEntryKeyHashKnown(int i11, int i12) {
        removeEntry(i11, i12, Hashing.smearedHash(this.values[i11]));
    }

    public void removeEntryValueHashKnown(int i11, int i12) {
        removeEntry(i11, Hashing.smearedHash(this.keys[i11]), i12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    private HashBiMap(int i11) {
        init(i11);
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int count = Serialization.readCount(objectInputStream);
        init(16);
        Serialization.populateMap(this, objectInputStream, count);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMap(this, objectOutputStream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (findEntryByKey(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (findEntryByValue(obj) != -1) {
            return true;
        }
        return false;
    }

    public int findEntry(Object obj, int i11, int[] iArr, int[] iArr2, Object[] objArr) {
        int i12 = iArr[bucket(i11)];
        while (i12 != -1) {
            if (Objects.equal(objArr[i12], obj)) {
                return i12;
            }
            i12 = iArr2[i12];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int iFindEntryByKey = findEntryByKey(obj);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    public K getInverse(Object obj) {
        int iFindEntryByValue = findEntryByValue(obj);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    @CanIgnoreReturnValue
    public K putInverse(@ParametricNullness V v11, @ParametricNullness K k11, boolean z11) {
        boolean z12;
        int i11;
        int iSmearedHash = Hashing.smearedHash(v11);
        int iFindEntryByValue = findEntryByValue(v11, iSmearedHash);
        if (iFindEntryByValue != -1) {
            K k12 = this.keys[iFindEntryByValue];
            if (Objects.equal(k12, k11)) {
                return k11;
            }
            replaceKeyInEntry(iFindEntryByValue, k11, z11);
            return k12;
        }
        int i12 = this.lastInInsertionOrder;
        int iSmearedHash2 = Hashing.smearedHash(k11);
        int iFindEntryByKey = findEntryByKey(k11, iSmearedHash2);
        if (z11) {
            if (iFindEntryByKey != -1) {
                i12 = this.prevInInsertionOrder[iFindEntryByKey];
                removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash2);
            }
        } else {
            if (iFindEntryByKey == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            Preconditions.checkArgument(z12, "Key already present: %s", k11);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i13 = this.size;
        kArr[i13] = k11;
        this.values[i13] = v11;
        insertIntoTableKToV(i13, iSmearedHash2);
        insertIntoTableVToK(this.size, iSmearedHash);
        if (i12 == -2) {
            i11 = this.firstInInsertionOrder;
        } else {
            i11 = this.nextInInsertionOrder[i12];
        }
        setSucceeds(i12, this.size);
        setSucceeds(this.size, i11);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int iFindEntryByKey = findEntryByKey(obj, iSmearedHash);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v11 = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
        return v11;
    }

    public K removeInverse(Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int iFindEntryByValue = findEntryByValue(obj, iSmearedHash);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k11 = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
        return k11;
    }
}
