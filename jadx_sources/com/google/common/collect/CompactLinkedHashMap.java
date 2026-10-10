package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    transient long[] links;

    public CompactLinkedHashMap() {
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

    public CompactLinkedHashMap(int i11) {
        this(i11, false);
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i11) {
        return new CompactLinkedHashMap<>(i11);
    }

    private long[] requireLinks() {
        long[] jArr = this.links;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void accessEntry(int i11) {
        if (this.accessOrder) {
            setSucceeds(getPredecessor(i11), getSuccessor(i11));
            setSucceeds(this.lastEntry, i11);
            setSucceeds(i11, -2);
            incrementModCount();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map<K, V> createHashFloodingResistantDelegate(int i11) {
        return new LinkedHashMap(i11, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    public int firstEntryIndex() {
        return this.firstEntry;
    }

    public CompactLinkedHashMap(int i11, boolean z11) {
        super(i11);
        this.accessOrder = z11;
    }

    private int getPredecessor(int i11) {
        return ((int) (link(i11) >>> 32)) - 1;
    }

    private long link(int i11) {
        return requireLinks()[i11];
    }

    private void setLink(int i11, long j11) {
        requireLinks()[i11] = j11;
    }

    private void setPredecessor(int i11, int i12) {
        setLink(i11, (link(i11) & KeyboardMap.kValueMask) | (((long) (i12 + 1)) << 32));
    }

    private void setSuccessor(int i11, int i12) {
        setLink(i11, (link(i11) & (-4294967296L)) | (((long) (i12 + 1)) & KeyboardMap.kValueMask));
    }

    @Override // com.google.common.collect.CompactHashMap
    public int adjustAfterRemove(int i11, int i12) {
        if (i11 >= size()) {
            return i12;
        }
        return i11;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.links = new long[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = this.links;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    @CanIgnoreReturnValue
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return mapConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int getSuccessor(int i11) {
        return ((int) link(i11)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void init(int i11) {
        super.init(i11);
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void insertEntry(int i11, @ParametricNullness K k11, @ParametricNullness V v11, int i12, int i13) {
        super.insertEntry(i11, k11, v11, i12, i13);
        setSucceeds(this.lastEntry, i11);
        setSucceeds(i11, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void moveLastEntry(int i11, int i12) {
        int size = size() - 1;
        super.moveLastEntry(i11, i12);
        setSucceeds(getPredecessor(i11), getSuccessor(i11));
        if (i11 < size) {
            setSucceeds(getPredecessor(size), i11);
            setSucceeds(i11, getSuccessor(size));
        }
        setLink(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void resizeEntries(int i11) {
        super.resizeEntries(i11);
        this.links = Arrays.copyOf(requireLinks(), i11);
    }
}
