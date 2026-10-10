package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;

    @VisibleForTesting
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    public class MapEntry extends Multisets.AbstractEntry<K> {

        @ParametricNullness
        final K key;
        int lastKnownIndex;

        public MapEntry(int i11) {
            this.key = (K) ObjectCountHashMap.this.keys[i11];
            this.lastKnownIndex = i11;
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public K getElement() {
            return this.key;
        }

        public void updateLastKnownIndex() {
            int i11 = this.lastKnownIndex;
            if (i11 == -1 || i11 >= ObjectCountHashMap.this.size() || !Objects.equal(this.key, ObjectCountHashMap.this.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = ObjectCountHashMap.this.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            updateLastKnownIndex();
            int i11 = this.lastKnownIndex;
            if (i11 == -1) {
                return 0;
            }
            return ObjectCountHashMap.this.values[i11];
        }

        @CanIgnoreReturnValue
        public int setCount(int i11) {
            updateLastKnownIndex();
            int i12 = this.lastKnownIndex;
            if (i12 == -1) {
                ObjectCountHashMap.this.put(this.key, i11);
                return 0;
            }
            int[] iArr = ObjectCountHashMap.this.values;
            int i13 = iArr[i12];
            iArr[i12] = i11;
            return i13;
        }
    }

    public ObjectCountHashMap() {
        init(3, 1.0f);
    }

    private static int getNext(long j11) {
        return (int) j11;
    }

    public void init(int i11, float f11) {
        Preconditions.checkArgument(i11 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f11 > 0.0f, "Illegal load factor");
        int iClosedTableSize = Hashing.closedTableSize(i11, f11);
        this.table = newTable(iClosedTableSize);
        this.loadFactor = f11;
        this.keys = new Object[i11];
        this.values = new int[i11];
        this.entries = newEntries(i11);
        this.threshold = Math.max(1, (int) (iClosedTableSize * f11));
    }

    @CanIgnoreReturnValue
    public int remove(Object obj) {
        return remove(obj, Hashing.smearedHash(obj));
    }

    public static <K> ObjectCountHashMap<K> create() {
        return new ObjectCountHashMap<>();
    }

    public static <K> ObjectCountHashMap<K> createWithExpectedSize(int i11) {
        return new ObjectCountHashMap<>(i11);
    }

    private static int getHash(long j11) {
        return (int) (j11 >>> 32);
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    private static long[] newEntries(int i11) {
        long[] jArr = new long[i11];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] newTable(int i11) {
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int remove(Object obj, int i11) {
        int iHashTableMask = hashTableMask() & i11;
        int i12 = this.table[iHashTableMask];
        if (i12 == -1) {
            return 0;
        }
        int i13 = -1;
        while (true) {
            if (getHash(this.entries[i12]) == i11 && Objects.equal(obj, this.keys[i12])) {
                int i14 = this.values[i12];
                if (i13 == -1) {
                    this.table[iHashTableMask] = getNext(this.entries[i12]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i13] = swapNext(jArr[i13], getNext(jArr[i12]));
                }
                moveLastEntry(i12);
                this.size--;
                this.modCount++;
                return i14;
            }
            int next = getNext(this.entries[i12]);
            if (next == -1) {
                return 0;
            }
            i13 = i12;
            i12 = next;
        }
    }

    private void resizeMeMaybe(int i11) {
        int length = this.entries.length;
        if (i11 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                resizeEntries(iMax);
            }
        }
    }

    private void resizeTable(int i11) {
        if (this.table.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i12 = ((int) (i11 * this.loadFactor)) + 1;
        int[] iArrNewTable = newTable(i11);
        long[] jArr = this.entries;
        int length = iArrNewTable.length - 1;
        for (int i13 = 0; i13 < this.size; i13++) {
            int hash = getHash(jArr[i13]);
            int i14 = hash & length;
            int i15 = iArrNewTable[i14];
            iArrNewTable[i14] = i13;
            jArr[i13] = (((long) hash) << 32) | (((long) i15) & 4294967295L);
        }
        this.threshold = i12;
        this.table = iArrNewTable;
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1L);
        this.size = 0;
    }

    public void ensureCapacity(int i11) {
        if (i11 > this.entries.length) {
            resizeEntries(i11);
        }
        if (i11 >= this.threshold) {
            resizeTable(Math.max(2, Integer.highestOneBit(i11 - 1) << 1));
        }
    }

    public int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    public Multiset.Entry<K> getEntry(int i11) {
        Preconditions.checkElementIndex(i11, this.size);
        return new MapEntry(i11);
    }

    @ParametricNullness
    public K getKey(int i11) {
        Preconditions.checkElementIndex(i11, this.size);
        return (K) this.keys[i11];
    }

    public int getValue(int i11) {
        Preconditions.checkElementIndex(i11, this.size);
        return this.values[i11];
    }

    public void insertEntry(int i11, @ParametricNullness K k11, int i12, int i13) {
        this.entries[i11] = (((long) i13) << 32) | 4294967295L;
        this.keys[i11] = k11;
        this.values[i11] = i12;
    }

    public int nextIndex(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.size) {
            return i12;
        }
        return -1;
    }

    public int nextIndexAfterRemove(int i11, int i12) {
        return i11 - 1;
    }

    @CanIgnoreReturnValue
    public int put(@ParametricNullness K k11, int i11) {
        CollectPreconditions.checkPositive(i11, "count");
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int iSmearedHash = Hashing.smearedHash(k11);
        int iHashTableMask = hashTableMask() & iSmearedHash;
        int i12 = this.size;
        int[] iArr2 = this.table;
        int i13 = iArr2[iHashTableMask];
        if (i13 == -1) {
            iArr2[iHashTableMask] = i12;
        } else {
            while (true) {
                long j11 = jArr[i13];
                if (getHash(j11) == iSmearedHash && Objects.equal(k11, objArr[i13])) {
                    int i14 = iArr[i13];
                    iArr[i13] = i11;
                    return i14;
                }
                int next = getNext(j11);
                if (next == -1) {
                    jArr[i13] = swapNext(j11, i12);
                    break;
                }
                i13 = next;
            }
        }
        if (i12 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i15 = i12 + 1;
        resizeMeMaybe(i15);
        insertEntry(i12, k11, i11, iSmearedHash);
        this.size = i15;
        if (i12 >= this.threshold) {
            resizeTable(this.table.length * 2);
        }
        this.modCount++;
        return 0;
    }

    @CanIgnoreReturnValue
    public int removeEntry(int i11) {
        return remove(this.keys[i11], getHash(this.entries[i11]));
    }

    public void resizeEntries(int i11) {
        this.keys = Arrays.copyOf(this.keys, i11);
        this.values = Arrays.copyOf(this.values, i11);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
        if (i11 > length) {
            Arrays.fill(jArrCopyOf, length, i11, -1L);
        }
        this.entries = jArrCopyOf;
    }

    public void setValue(int i11, int i12) {
        Preconditions.checkElementIndex(i11, this.size);
        this.values[i11] = i12;
    }

    public int size() {
        return this.size;
    }

    public ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int iFirstIndex = objectCountHashMap.firstIndex();
        while (iFirstIndex != -1) {
            put(objectCountHashMap.getKey(iFirstIndex), objectCountHashMap.getValue(iFirstIndex));
            iFirstIndex = objectCountHashMap.nextIndex(iFirstIndex);
        }
    }

    public boolean containsKey(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public int get(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return 0;
        }
        return this.values[iIndexOf];
    }

    public int indexOf(Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int next = this.table[hashTableMask() & iSmearedHash];
        while (next != -1) {
            long j11 = this.entries[next];
            if (getHash(j11) == iSmearedHash && Objects.equal(obj, this.keys[next])) {
                return next;
            }
            next = getNext(j11);
        }
        return -1;
    }

    public void moveLastEntry(int i11) {
        int size = size() - 1;
        if (i11 < size) {
            Object[] objArr = this.keys;
            objArr[i11] = objArr[size];
            int[] iArr = this.values;
            iArr[i11] = iArr[size];
            objArr[size] = null;
            iArr[size] = 0;
            long[] jArr = this.entries;
            long j11 = jArr[size];
            jArr[i11] = j11;
            jArr[size] = -1;
            int hash = getHash(j11) & hashTableMask();
            int[] iArr2 = this.table;
            int i12 = iArr2[hash];
            if (i12 == size) {
                iArr2[hash] = i11;
                return;
            }
            while (true) {
                long j12 = this.entries[i12];
                int next = getNext(j12);
                if (next == size) {
                    this.entries[i12] = swapNext(j12, i11);
                    return;
                }
                i12 = next;
            }
        } else {
            this.keys[i11] = null;
            this.values[i11] = 0;
            this.entries[i11] = -1;
        }
    }

    private static long swapNext(long j11, int i11) {
        return (j11 & HASH_MASK) | (4294967295L & ((long) i11));
    }

    public ObjectCountHashMap(int i11) {
        this(i11, 1.0f);
    }

    public ObjectCountHashMap(int i11, float f11) {
        init(i11, f11);
    }
}
