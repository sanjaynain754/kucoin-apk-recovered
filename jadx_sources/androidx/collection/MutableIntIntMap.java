package androidx.collection;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.ULong;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IntIntMap.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0086\bø\u0001\u0000J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0017H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0018H\u0086\nJ\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0001H\u0086\nJ\u0016\u0010\u001b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\u001e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0001J\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\b\u0010!\u001a\u00020\u0007H\u0002J&\u0010\"\u001a\u00020\u00072\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0$H\u0086\bø\u0001\u0000J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0003H\u0001J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0003H\u0002J\u0019\u0010)\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010*\u001a\u00020\u0003J\u0019\u0010+\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020,H\u0082\bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, m90084d2 = {"Landroidx/collection/MutableIntIntMap;", "Landroidx/collection/IntIntMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "getOrPut", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/IntList;", "Landroidx/collection/IntSet;", "", "plusAssign", "from", "put", "value", "default", "putAll", "remove", "", "removeDeletedMarkers", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "trim", "writeMetadata", "", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIntIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntMap.kt\nandroidx/collection/MutableIntIntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntIntMap.kt\nandroidx/collection/IntIntMap\n+ 5 IntSet.kt\nandroidx/collection/IntSet\n+ 6 IntList.kt\nandroidx/collection/IntList\n+ 7 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,1047:1\n1037#1,2:1134\n1041#1,5:1142\n1037#1,2:1173\n1041#1,5:1181\n1037#1,2:1198\n1041#1,5:1206\n1037#1,2:1212\n1041#1,5:1220\n1#2:1048\n1672#3,6:1049\n1826#3:1065\n1688#3:1069\n1826#3:1087\n1688#3:1091\n1826#3:1112\n1688#3:1116\n1672#3,6:1136\n1672#3,6:1147\n1615#3:1156\n1619#3:1157\n1795#3,3:1158\n1809#3,3:1161\n1733#3:1164\n1721#3:1165\n1715#3:1166\n1728#3:1167\n1818#3:1168\n1682#3:1169\n1661#3:1170\n1680#3:1171\n1661#3:1172\n1672#3,6:1175\n1795#3,3:1186\n1826#3:1189\n1715#3:1190\n1685#3:1191\n1661#3:1192\n1615#3:1196\n1619#3:1197\n1672#3,6:1200\n1661#3:1211\n1672#3,6:1214\n1672#3,6:1225\n1672#3,6:1231\n385#4,4:1055\n357#4,6:1059\n367#4,3:1066\n370#4,2:1070\n389#4,2:1072\n373#4,6:1074\n391#4:1080\n357#4,6:1081\n367#4,3:1088\n370#4,9:1092\n262#5,4:1101\n232#5,7:1105\n243#5,3:1113\n246#5,2:1117\n266#5,2:1119\n249#5,6:1121\n268#5:1127\n253#6,6:1128\n849#7,3:1153\n849#7,3:1193\n*S KotlinDebug\n*F\n+ 1 IntIntMap.kt\nandroidx/collection/MutableIntIntMap\n*L\n875#1:1134,2\n875#1:1142,5\n933#1:1173,2\n933#1:1181,5\n1007#1:1198,2\n1007#1:1206,5\n1023#1:1212,2\n1023#1:1220,5\n711#1:1049,6\n789#1:1065\n789#1:1069\n828#1:1087\n828#1:1091\n855#1:1112\n855#1:1116\n875#1:1136,6\n885#1:1147,6\n899#1:1156\n900#1:1157\n907#1:1158,3\n908#1:1161,3\n909#1:1164\n910#1:1165\n910#1:1166\n914#1:1167\n917#1:1168\n926#1:1169\n926#1:1170\n932#1:1171\n932#1:1172\n933#1:1175,6\n948#1:1186,3\n949#1:1189\n951#1:1190\n1002#1:1191\n1002#1:1192\n1005#1:1196\n1007#1:1197\n1007#1:1200,6\n1021#1:1211\n1023#1:1214,6\n1038#1:1225,6\n1044#1:1231,6\n789#1:1055,4\n789#1:1059,6\n789#1:1066,3\n789#1:1070,2\n789#1:1072,2\n789#1:1074,6\n789#1:1080\n828#1:1081,6\n828#1:1088,3\n828#1:1092,9\n855#1:1101,4\n855#1:1105,7\n855#1:1113,3\n855#1:1117,2\n855#1:1119,2\n855#1:1121,6\n855#1:1127\n864#1:1128,6\n898#1:1153,3\n1004#1:1193,3\n*E\n"})
public final class MutableIntIntMap extends IntIntMap {
    private int growthLimit;

    public MutableIntIntMap() {
        this(0, 1, null);
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i11 = this._capacity;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        initializeGrowth();
    }

    public final void minusAssign(int key) {
        remove(key);
    }

    public final void put(int key, int value) {
        set(key, value);
    }

    public final void remove(int key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public /* synthetic */ MutableIntIntMap(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    private final void adjustStorage() {
        if (this._capacity <= 8 || Long.compare(ULong.m104018constructorimpl(ULong.m104018constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m104018constructorimpl(ULong.m104018constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            removeDeletedMarkers();
        }
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i11 = this._capacity;
        int i12 = hash1 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j11 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j12 = j11 & ((~j11) << 7) & (-9187201950435737472L);
            if (j12 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j12) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final int findInsertIndex(int key) {
        int iHashCode = Integer.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this._capacity;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = i13;
            int i21 = i16;
            long j13 = j11 ^ (j12 * ScatterMapKt.BitmaskLsb);
            long j14 = (~j13) & (j13 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                int i22 = i19;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i19 = i22;
            }
            int i23 = i19;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                }
                this._size++;
                int i24 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i25 = iFindFirstAvailableSlot >> 3;
                long j15 = jArr2[i25];
                int i26 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i24 - (((j15 >> i26) & 255) == 128 ? i23 : 0);
                jArr2[i25] = (j15 & (~(255 << i26))) | (j12 << i26);
                int i27 = this._capacity;
                int i28 = ((iFindFirstAvailableSlot - 7) & i27) + (i27 & 7);
                int i29 = i28 >> 3;
                int i31 = (i28 & 7) << 3;
                jArr2[i29] = ((~(255 << i31)) & jArr2[i29]) | (j12 << i31);
                return ~iFindFirstAvailableSlot;
            }
            i16 = i21 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i11 = capacity >> 3;
        long j11 = 255 << ((capacity & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j11)) | j11;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new int[iMax];
        this.values = new int[iMax];
    }

    private final void removeDeletedMarkers() {
        long[] jArr = this.metadata;
        int i11 = this._capacity;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            if (((jArr[i14] >> i15) & 255) == 254) {
                long[] jArr2 = this.metadata;
                jArr2[i14] = (128 << i15) | (jArr2[i14] & (~(255 << i15)));
                int i16 = this._capacity;
                int i17 = ((i13 - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (128 << i19);
                i12++;
            }
        }
        this.growthLimit += i12;
    }

    private final void resizeStorage(int newCapacity) {
        MutableIntIntMap mutableIntIntMap = this;
        long[] jArr = mutableIntIntMap.metadata;
        int[] iArr = mutableIntIntMap.keys;
        int[] iArr2 = mutableIntIntMap.values;
        int i11 = mutableIntIntMap._capacity;
        initializeStorage(newCapacity);
        int[] iArr3 = mutableIntIntMap.keys;
        int[] iArr4 = mutableIntIntMap.values;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int iHashCode = Integer.hashCode(i13) * ScatterMapKt.MurmurHashC1;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableIntIntMap.findFirstAvailableSlot(i14 >>> 7);
                long j11 = i14 & 127;
                long[] jArr2 = mutableIntIntMap.metadata;
                int i15 = iFindFirstAvailableSlot >> 3;
                int i16 = (iFindFirstAvailableSlot & 7) << 3;
                jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (j11 << i16);
                int i17 = mutableIntIntMap._capacity;
                int i18 = ((iFindFirstAvailableSlot - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i21 = (i18 & 7) << 3;
                jArr2[i19] = ((~(255 << i21)) & jArr2[i19]) | (j11 << i21);
                iArr3[iFindFirstAvailableSlot] = i13;
                iArr4[iFindFirstAvailableSlot] = iArr2[i12];
            }
            i12++;
            mutableIntIntMap = this;
            jArr = jArr;
        }
    }

    private final void writeMetadata(int index, long value) {
        long[] jArr = this.metadata;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (value << i12);
        int i13 = this._capacity;
        int i14 = ((index - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (value << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public final int getOrPut(int key, @NotNull Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        int iIntValue = defaultValue.invoke().intValue();
        put(key, iIntValue);
        return iIntValue;
    }

    public final void minusAssign(@NotNull int[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (int i11 : keys) {
            remove(i11);
        }
    }

    public final void plusAssign(@NotNull IntIntMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final int put(int key, int value, int i11) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            i11 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
        return i11;
    }

    public final void putAll(@NotNull IntIntMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        int[] iArr = from.keys;
        int[] iArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        set(iArr[i14], iArr2[i14]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @PublishedApi
    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this._capacity;
        int i14 = ((index - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
    }

    public final int trim() {
        int i11 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i11) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i11 - this._capacity;
    }

    public MutableIntIntMap(int i11) {
        super(null);
        if (i11 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i11));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final boolean remove(int key, int value) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != value) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(@NotNull Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (predicate.invoke(Integer.valueOf(this.keys[i14]), Integer.valueOf(this.values[i14])).booleanValue()) {
                                removeValueAt(i14);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void set(int key, int value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
    }

    public final void minusAssign(@NotNull IntSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        remove(iArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void minusAssign(@NotNull IntList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.content;
        int i11 = keys._size;
        for (int i12 = 0; i12 < i11; i12++) {
            remove(iArr[i12]);
        }
    }
}
