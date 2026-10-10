package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final Object NOT_FOUND = new Object();

    @VisibleForTesting
    transient int[] entries;

    @LazyInit
    private transient Set<Map.Entry<K, V>> entrySetView;

    @LazyInit
    private transient Set<K> keySetView;

    @VisibleForTesting
    transient Object[] keys;
    private transient int metadata;
    private transient int size;
    private transient Object table;

    @VisibleForTesting
    transient Object[] values;

    @LazyInit
    private transient Collection<V> valuesView;

    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        public EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iIndexOf = CompactHashMap.this.indexOf(entry.getKey());
                if (iIndexOf != -1 && Objects.equal(CompactHashMap.this.value(iIndexOf), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iHashTableMask;
            int iRemove;
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.needsAllocArrays() || (iRemove = CompactHashing.remove(entry.getKey(), entry.getValue(), (iHashTableMask = CompactHashMap.this.hashTableMask()), CompactHashMap.this.requireTable(), CompactHashMap.this.requireEntries(), CompactHashMap.this.requireKeys(), CompactHashMap.this.requireValues())) == -1) {
                return false;
            }
            CompactHashMap.this.moveLastEntry(iRemove, iHashTableMask);
            CompactHashMap.access$1210(CompactHashMap.this);
            CompactHashMap.this.incrementModCount();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;

        private Itr() {
            this.expectedMetadata = CompactHashMap.this.metadata;
            this.currentIndex = CompactHashMap.this.firstEntryIndex();
            this.indexToRemove = -1;
        }

        @ParametricNullness
        public abstract T getOutput(int i11);

        private void checkForConcurrentModification() {
            if (CompactHashMap.this.metadata != this.expectedMetadata) {
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
        public T next() {
            checkForConcurrentModification();
            if (hasNext()) {
                int i11 = this.currentIndex;
                this.indexToRemove = i11;
                T output = getOutput(i11);
                this.currentIndex = CompactHashMap.this.getSuccessor(this.currentIndex);
                return output;
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
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.key(this.indexToRemove));
            this.currentIndex = CompactHashMap.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }
    }

    public class KeySetView extends AbstractSet<K> {
        public KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.keySet().remove(obj);
            }
            return CompactHashMap.this.removeHelper(obj) != CompactHashMap.NOT_FOUND;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class MapEntry extends AbstractMapEntry<K, V> {

        @ParametricNullness
        private final K key;
        private int lastKnownIndex;

        public MapEntry(int i11) {
            this.key = (K) CompactHashMap.this.key(i11);
            this.lastKnownIndex = i11;
        }

        private void updateLastKnownIndex() {
            int i11 = this.lastKnownIndex;
            if (i11 == -1 || i11 >= CompactHashMap.this.size() || !Objects.equal(this.key, CompactHashMap.this.key(this.lastKnownIndex))) {
                this.lastKnownIndex = CompactHashMap.this.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.get(this.key));
            }
            updateLastKnownIndex();
            int i11 = this.lastKnownIndex;
            return i11 == -1 ? (V) NullnessCasts.unsafeNull() : (V) CompactHashMap.this.value(i11);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v11) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.put(this.key, v11));
            }
            updateLastKnownIndex();
            int i11 = this.lastKnownIndex;
            if (i11 == -1) {
                CompactHashMap.this.put(this.key, v11);
                return (V) NullnessCasts.unsafeNull();
            }
            V v12 = (V) CompactHashMap.this.value(i11);
            CompactHashMap.this.setValue(this.lastKnownIndex, v11);
            return v12;
        }
    }

    public class ValuesView extends AbstractCollection<V> {
        public ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        init(3);
    }

    public void init(int i11) {
        Preconditions.checkArgument(i11 >= 0, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(i11, 1, 1073741823);
    }

    public void insertEntry(int i11, @ParametricNullness K k11, @ParametricNullness V v11, int i12, int i13) {
        setEntry(i11, CompactHashing.maskCombine(i12, 0, i13));
        setKey(i11, k11);
        setValue(i11, v11);
    }

    public static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i11 = compactHashMap.size;
        compactHashMap.size = i11 - 1;
        return i11;
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i11) {
        return new CompactHashMap<>(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] requireEntries() {
        int[] iArr = this.entries;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireKeys() {
        Object[] objArr = this.keys;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object requireTable() {
        Object obj = this.table;
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireValues() {
        Object[] objArr = this.values;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    public int adjustAfterRemove(int i11, int i12) {
        return i11 - 1;
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new EntrySetView();
    }

    public Map<K, V> createHashFloodingResistantDelegate(int i11) {
        return new LinkedHashMap(i11, 1.0f);
    }

    public Set<K> createKeySet() {
        return new KeySetView();
    }

    public Collection<V> createValues() {
        return new ValuesView();
    }

    @VisibleForTesting
    public Map<K, V> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySetView;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.entrySetView = setCreateEntrySet;
        return setCreateEntrySet;
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

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySetView;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySetView = setCreateKeySet;
        return setCreateKeySet;
    }

    public boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.valuesView = collectionCreateValues;
        return collectionCreateValues;
    }

    public CompactHashMap(int i11) {
        init(i11);
    }

    private int entry(int i11) {
        return requireEntries()[i11];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iSmearedHash = Hashing.smearedHash(obj);
        int iHashTableMask = hashTableMask();
        int iTableGet = CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i11 = iTableGet - 1;
            int iEntry = entry(i11);
            if (CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && Objects.equal(obj, key(i11))) {
                return i11;
            }
            iTableGet = CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K key(int i11) {
        return (K) requireKeys()[i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i11 = objectInputStream.readInt();
        if (i11 >= 0) {
            init(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeHelper(Object obj) {
        if (needsAllocArrays()) {
            return NOT_FOUND;
        }
        int iHashTableMask = hashTableMask();
        int iRemove = CompactHashing.remove(obj, null, iHashTableMask, requireTable(), requireEntries(), requireKeys(), null);
        if (iRemove == -1) {
            return NOT_FOUND;
        }
        V vValue = value(iRemove);
        moveLastEntry(iRemove, iHashTableMask);
        this.size--;
        incrementModCount();
        return vValue;
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

    private void setEntry(int i11, int i12) {
        requireEntries()[i11] = i12;
    }

    private void setHashTableMask(int i11) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i11), 31);
    }

    private void setKey(int i11, K k11) {
        requireKeys()[i11] = k11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i11, V v11) {
        requireValues()[i11] = v11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V value(int i11) {
        return (V) requireValues()[i11];
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            Map.Entry<K, V> next = itEntrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i11 = this.metadata;
        int iTableSize = CompactHashing.tableSize(i11);
        this.table = CompactHashing.createTable(iTableSize);
        setHashTableMask(iTableSize - 1);
        this.entries = new int[i11];
        this.keys = new Object[i11];
        this.values = new Object[i11];
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, 1073741823);
            mapDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.size, (Object) null);
        Arrays.fill(requireValues(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsKey(obj);
        }
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(obj);
        }
        for (int i11 = 0; i11 < this.size; i11++) {
            if (Objects.equal(obj, value(i11))) {
                return true;
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(key(iFirstEntryIndex), value(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.entrySet().iterator();
        }
        return new CompactHashMap<K, V>.Itr<Map.Entry<K, V>>() { // from class: com.google.common.collect.CompactHashMap.2
            @Override // com.google.common.collect.CompactHashMap.Itr
            public Map.Entry<K, V> getOutput(int i11) {
                return new MapEntry(i11);
            }
        };
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(obj);
        }
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        accessEntry(iIndexOf);
        return value(iIndexOf);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Iterator<K> keySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.keySet().iterator();
        }
        return new CompactHashMap<K, V>.Itr<K>() { // from class: com.google.common.collect.CompactHashMap.1
            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            public K getOutput(int i11) {
                return (K) CompactHashMap.this.key(i11);
            }
        };
    }

    public void moveLastEntry(int i11, int i12) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int size = size();
        int i13 = size - 1;
        if (i11 < i13) {
            Object obj = objArrRequireKeys[i13];
            objArrRequireKeys[i11] = obj;
            objArrRequireValues[i11] = objArrRequireValues[i13];
            objArrRequireKeys[i13] = null;
            objArrRequireValues[i13] = null;
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
            objArrRequireKeys[i11] = null;
            objArrRequireValues[i11] = null;
            iArrRequireEntries[i11] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k11, @ParametricNullness V v11) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(k11, v11);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int i11 = this.size;
        int i12 = i11 + 1;
        int iSmearedHash = Hashing.smearedHash(k11);
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
                if (CompactHashing.getHashPrefix(i16, iHashTableMask) == hashPrefix && Objects.equal(k11, objArrRequireKeys[i15])) {
                    V v12 = (V) objArrRequireValues[i15];
                    objArrRequireValues[i15] = v11;
                    accessEntry(i15);
                    return v12;
                }
                int next = CompactHashing.getNext(i16, iHashTableMask);
                i14++;
                if (next == 0) {
                    if (i14 >= 9) {
                        return convertToHashFloodingResistantImplementation().put(k11, v11);
                    }
                    if (i12 > iHashTableMask) {
                        iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i11);
                        break;
                    }
                    iArrRequireEntries[i15] = CompactHashing.maskCombine(i16, i12, iHashTableMask);
                    break;
                }
                k11 = k11;
                v11 = v11;
                iTableGet = next;
            }
        }
        int i17 = iHashTableMask;
        resizeMeMaybe(i12);
        insertEntry(i11, k11, v11, iSmearedHash, i17);
        this.size = i12;
        incrementModCount();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        V v11 = (V) removeHelper(obj);
        if (v11 == NOT_FOUND) {
            return null;
        }
        return v11;
    }

    public void resizeEntries(int i11) {
        this.entries = Arrays.copyOf(requireEntries(), i11);
        this.keys = Arrays.copyOf(requireKeys(), i11);
        this.values = Arrays.copyOf(requireValues(), i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.size();
        }
        return this.size;
    }

    public void trimToSize() {
        if (!needsAllocArrays()) {
            Map<K, V> mapDelegateOrNull = delegateOrNull();
            if (mapDelegateOrNull != null) {
                Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
                mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
                this.table = mapCreateHashFloodingResistantDelegate;
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

    public Iterator<V> valuesIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.values().iterator();
        }
        return new CompactHashMap<K, V>.Itr<V>() { // from class: com.google.common.collect.CompactHashMap.3
            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            public V getOutput(int i11) {
                return (V) CompactHashMap.this.value(i11);
            }
        };
    }

    public void accessEntry(int i11) {
    }
}
