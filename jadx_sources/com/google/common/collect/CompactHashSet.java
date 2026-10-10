package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;

    @VisibleForTesting
    transient Object[] elements;
    private transient int[] entries;
    private transient int metadata;
    private transient int size;
    private transient Object table;

    public CompactHashSet() {
        init(3);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    public void init(int i11) {
        Preconditions.checkArgument(i11 >= 0, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(i11, 1, 1073741823);
    }

    public void insertEntry(int i11, @ParametricNullness E e11, int i12, int i13) {
        setEntry(i11, CompactHashing.maskCombine(i12, 0, i13));
        setElement(i11, e11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.toArray() : Arrays.copyOf(requireElements(), this.size);
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactHashSetCreateWithExpectedSize.addAll(collection);
        return compactHashSetCreateWithExpectedSize;
    }

    private Set<E> createHashFloodingResistantDelegate(int i11) {
        return new LinkedHashSet(i11, 1.0f);
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i11) {
        return new CompactHashSet<>(i11);
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    private Object[] requireElements() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    public int adjustAfterRemove(int i11, int i12) {
        return i11 - 1;
    }

    @VisibleForTesting
    public Set<E> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int getSuccessor(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.size) {
            return i12;
        }
        return -1;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public boolean needsAllocArrays() {
        return this.table == null;
    }

    public CompactHashSet(int i11) {
        init(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E element(int i11) {
        return (E) requireElements()[i11];
    }

    private int entry(int i11) {
        return requireEntries()[i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i11 = objectInputStream.readInt();
        if (i11 >= 0) {
            init(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + i11);
    }

    private void resizeMeMaybe(int i11) {
        int iMin;
        int length = requireEntries().length;
        if (i11 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(iMin);
        }
    }

    @CanIgnoreReturnValue
    private int resizeTable(int i11, int i12, int i13, int i14) {
        Object objCreateTable = CompactHashing.createTable(i12);
        int i15 = i12 - 1;
        if (i14 != 0) {
            CompactHashing.tableSet(objCreateTable, i13 & i15, i14 + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i16 = 0; i16 <= i11; i16++) {
            int iTableGet = CompactHashing.tableGet(objRequireTable, i16);
            while (iTableGet != 0) {
                int i17 = iTableGet - 1;
                int i18 = iArrRequireEntries[i17];
                int hashPrefix = CompactHashing.getHashPrefix(i18, i11) | i16;
                int i19 = hashPrefix & i15;
                int iTableGet2 = CompactHashing.tableGet(objCreateTable, i19);
                CompactHashing.tableSet(objCreateTable, i19, iTableGet);
                iArrRequireEntries[i17] = CompactHashing.maskCombine(hashPrefix, iTableGet2, i15);
                iTableGet = CompactHashing.getNext(i18, i11);
            }
        }
        this.table = objCreateTable;
        setHashTableMask(i15);
        return i15;
    }

    private void setElement(int i11, E e11) {
        requireElements()[i11] = e11;
    }

    private void setEntry(int i11, int i12) {
        requireEntries()[i11] = i12;
    }

    private void setHashTableMask(int i11) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i11), 31);
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e11) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.add(e11);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int i11 = this.size;
        int i12 = i11 + 1;
        int iSmearedHash = Hashing.smearedHash(e11);
        int iHashTableMask = hashTableMask();
        int i13 = iSmearedHash & iHashTableMask;
        int iTableGet = CompactHashing.tableGet(requireTable(), i13);
        if (iTableGet == 0) {
            if (i12 > iHashTableMask) {
                iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i11);
            } else {
                CompactHashing.tableSet(requireTable(), i13, i12);
            }
        } else {
            int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
            int i14 = 0;
            while (true) {
                int i15 = iTableGet - 1;
                int i16 = iArrRequireEntries[i15];
                if (CompactHashing.getHashPrefix(i16, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(e11, objArrRequireElements[i15])) {
                    return false;
                }
                int next = CompactHashing.getNext(i16, iHashTableMask);
                i14++;
                if (next == 0) {
                    if (i14 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e11);
                    }
                    if (i12 > iHashTableMask) {
                        iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i11);
                    } else {
                        iArrRequireEntries[i15] = CompactHashing.maskCombine(i16, i12, iHashTableMask);
                    }
                } else {
                    iTableGet = next;
                }
            }
        }
        resizeMeMaybe(i12);
        insertEntry(i11, e11, iSmearedHash, iHashTableMask);
        this.size = i12;
        incrementModCount();
        return true;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i11 = this.metadata;
        int iTableSize = CompactHashing.tableSize(i11);
        this.table = CompactHashing.createTable(iTableSize);
        setHashTableMask(iTableSize - 1);
        this.entries = new int[i11];
        this.elements = new Object[i11];
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, 1073741823);
            setDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireElements(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.contains(obj);
        }
        int iSmearedHash = Hashing.smearedHash(obj);
        int iHashTableMask = hashTableMask();
        int iTableGet = CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return false;
        }
        int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i11 = iTableGet - 1;
            int iEntry = entry(i11);
            if (CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(obj, element(i11))) {
                return true;
            }
            iTableGet = CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return false;
    }

    @CanIgnoreReturnValue
    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            setCreateHashFloodingResistantDelegate.add(element(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = setCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return setCreateHashFloodingResistantDelegate;
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public boolean isUsingHashFloodingResistance() {
        if (delegateOrNull() != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.iterator();
        }
        return new Iterator<E>() { // from class: com.google.common.collect.CompactHashSet.1
            int currentIndex;
            int expectedMetadata;
            int indexToRemove = -1;

            {
                this.expectedMetadata = CompactHashSet.this.metadata;
                this.currentIndex = CompactHashSet.this.firstEntryIndex();
            }

            private void checkForConcurrentModification() {
                if (CompactHashSet.this.metadata != this.expectedMetadata) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.currentIndex >= 0;
            }

            public void incrementExpectedModCount() {
                this.expectedMetadata += 32;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public E next() {
                checkForConcurrentModification();
                if (hasNext()) {
                    int i11 = this.currentIndex;
                    this.indexToRemove = i11;
                    E e11 = (E) CompactHashSet.this.element(i11);
                    this.currentIndex = CompactHashSet.this.getSuccessor(this.currentIndex);
                    return e11;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z11;
                checkForConcurrentModification();
                if (this.indexToRemove >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                CollectPreconditions.checkRemove(z11);
                incrementExpectedModCount();
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.element(this.indexToRemove));
                this.currentIndex = CompactHashSet.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
                this.indexToRemove = -1;
            }
        };
    }

    public void moveLastEntry(int i11, int i12) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int size = size();
        int i13 = size - 1;
        if (i11 < i13) {
            Object obj = objArrRequireElements[i13];
            objArrRequireElements[i11] = obj;
            objArrRequireElements[i13] = null;
            iArrRequireEntries[i11] = iArrRequireEntries[i13];
            iArrRequireEntries[i13] = 0;
            int iSmearedHash = Hashing.smearedHash(obj) & i12;
            int iTableGet = CompactHashing.tableGet(objRequireTable, iSmearedHash);
            if (iTableGet == size) {
                CompactHashing.tableSet(objRequireTable, iSmearedHash, i11 + 1);
                return;
            }
            while (true) {
                int i14 = iTableGet - 1;
                int i15 = iArrRequireEntries[i14];
                int next = CompactHashing.getNext(i15, i12);
                if (next == size) {
                    iArrRequireEntries[i14] = CompactHashing.maskCombine(i15, i11 + 1, i12);
                    return;
                }
                iTableGet = next;
            }
        } else {
            objArrRequireElements[i11] = null;
            iArrRequireEntries[i11] = 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.remove(obj);
        }
        int iHashTableMask = hashTableMask();
        int iRemove = CompactHashing.remove(obj, null, iHashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (iRemove == -1) {
            return false;
        }
        moveLastEntry(iRemove, iHashTableMask);
        this.size--;
        incrementModCount();
        return true;
    }

    public void resizeEntries(int i11) {
        this.entries = Arrays.copyOf(requireEntries(), i11);
        this.elements = Arrays.copyOf(requireElements(), i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.size();
        }
        return this.size;
    }

    public void trimToSize() {
        if (!needsAllocArrays()) {
            Set<E> setDelegateOrNull = delegateOrNull();
            if (setDelegateOrNull != null) {
                Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
                setCreateHashFloodingResistantDelegate.addAll(setDelegateOrNull);
                this.table = setCreateHashFloodingResistantDelegate;
                return;
            }
            int i11 = this.size;
            if (i11 < requireEntries().length) {
                resizeEntries(i11);
            }
            int iTableSize = CompactHashing.tableSize(i11);
            int iHashTableMask = hashTableMask();
            if (iTableSize < iHashTableMask) {
                resizeTable(iHashTableMask, iTableSize, 0, 0);
            }
        }
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactHashSetCreateWithExpectedSize, eArr);
        return compactHashSetCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (needsAllocArrays()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return (T[]) setDelegateOrNull.toArray(tArr);
        }
        return (T[]) ObjectArrays.toArrayImpl(requireElements(), 0, this.size, tArr);
    }
}
