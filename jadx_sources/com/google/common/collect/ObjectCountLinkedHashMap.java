package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    transient long[] links;

    public ObjectCountLinkedHashMap() {
        this(3);
    }

    private void setSucceeds(int i11, int i12) {
        if (i11 == -2) {
            this.firstEntry = i12;
        } else {
            setSuccessor(i11, i12);
        }
        if (i12 == -2) {
            this.lastEntry = i11;
        } else {
            setPredecessor(i12, i11);
        }
    }

    public ObjectCountLinkedHashMap(int i11) {
        this(i11, 1.0f);
    }

    public static <K> ObjectCountLinkedHashMap<K> create() {
        return new ObjectCountLinkedHashMap<>();
    }

    public static <K> ObjectCountLinkedHashMap<K> createWithExpectedSize(int i11) {
        return new ObjectCountLinkedHashMap<>(i11);
    }

    private int getPredecessor(int i11) {
        return (int) (this.links[i11] >>> 32);
    }

    private int getSuccessor(int i11) {
        return (int) this.links[i11];
    }

    private void setPredecessor(int i11, int i12) {
        long[] jArr = this.links;
        jArr[i11] = (jArr[i11] & KeyboardMap.kValueMask) | (((long) i12) << 32);
    }

    private void setSuccessor(int i11, int i12) {
        long[] jArr = this.links;
        jArr[i11] = (jArr[i11] & (-4294967296L)) | (((long) i12) & KeyboardMap.kValueMask);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int firstIndex() {
        int i11 = this.firstEntry;
        if (i11 == -2) {
            return -1;
        }
        return i11;
    }

    public ObjectCountLinkedHashMap(int i11, float f11) {
        super(i11, f11);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void init(int i11, float f11) {
        super.init(i11, f11);
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = new long[i11];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void insertEntry(int i11, @ParametricNullness K k11, int i12, int i13) {
        super.insertEntry(i11, k11, i12, i13);
        setSucceeds(this.lastEntry, i11);
        setSucceeds(i11, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void moveLastEntry(int i11) {
        int size = size() - 1;
        setSucceeds(getPredecessor(i11), getSuccessor(i11));
        if (i11 < size) {
            setSucceeds(getPredecessor(size), i11);
            setSucceeds(i11, getSuccessor(size));
        }
        super.moveLastEntry(i11);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndex(int i11) {
        int successor = getSuccessor(i11);
        if (successor == -2) {
            return -1;
        }
        return successor;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndexAfterRemove(int i11, int i12) {
        if (i11 == size()) {
            return i12;
        }
        return i11;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void resizeEntries(int i11) {
        super.resizeEntries(i11);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
        this.links = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i11, -1L);
    }

    public ObjectCountLinkedHashMap(ObjectCountHashMap<K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int iFirstIndex = objectCountHashMap.firstIndex();
        while (iFirstIndex != -1) {
            put(objectCountHashMap.getKey(iFirstIndex), objectCountHashMap.getValue(iFirstIndex));
            iFirstIndex = objectCountHashMap.nextIndex(iFirstIndex);
        }
    }
}
