package androidx.collection;

import java.util.Iterator;
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
import p852kotlin.sequences.Sequence;

/* JADX INFO: compiled from: ObjectLongMap.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\nJ\u001e\u0010\u0018\u001a\u00020\b2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\u0086\n¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u0018\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\nJ\u0017\u0010\u0018\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\nJ\u0017\u0010 \u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\nJ\u001b\u0010\"\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0002\u0010$J#\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0002\u0010&J\u0014\u0010'\u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0013\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\u001b\u0010(\u001a\u00020)2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\bH\u0002J&\u0010,\u001a\u00020\b2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020)0.H\u0086\bø\u0001\u0000J\u0010\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0001J\u0010\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u0004H\u0002J\u001e\u00103\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0002\u0010$J\u0006\u00104\u001a\u00020\u0004J\u0019\u00105\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0010H\u0082\bR\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, m90084d2 = {"Landroidx/collection/MutableObjectLongMap;", "K", "Landroidx/collection/ObjectLongMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findFirstAvailableSlot", "hash1", "findIndex", "key", "(Ljava/lang/Object;)I", "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)J", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "keys", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "plusAssign", "from", "put", "value", "(Ljava/lang/Object;J)V", "default", "(Ljava/lang/Object;JJ)J", "putAll", "remove", "", "(Ljava/lang/Object;J)Z", "removeDeletedMarkers", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "trim", "writeMetadata", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/MutableObjectLongMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1074:1\n1064#1,2:1155\n1068#1,5:1163\n1064#1,2:1194\n1068#1,5:1202\n1064#1,2:1219\n1068#1,5:1227\n1064#1,2:1233\n1068#1,5:1241\n1#2:1075\n1672#3,6:1076\n1826#3:1092\n1688#3:1096\n1826#3:1114\n1688#3:1118\n1826#3:1139\n1688#3:1143\n1672#3,6:1157\n1672#3,6:1168\n1605#3,3:1174\n1615#3:1177\n1619#3:1178\n1795#3,3:1179\n1809#3,3:1182\n1733#3:1185\n1721#3:1186\n1715#3:1187\n1728#3:1188\n1818#3:1189\n1682#3:1190\n1661#3:1191\n1680#3:1192\n1661#3:1193\n1672#3,6:1196\n1795#3,3:1207\n1826#3:1210\n1715#3:1211\n1685#3:1212\n1661#3:1213\n1605#3,3:1214\n1615#3:1217\n1619#3:1218\n1672#3,6:1221\n1661#3:1232\n1672#3,6:1235\n1672#3,6:1246\n1672#3,6:1252\n401#4,4:1082\n373#4,6:1086\n383#4,3:1093\n386#4,2:1097\n406#4,2:1099\n389#4,6:1101\n408#4:1107\n373#4,6:1108\n383#4,3:1115\n386#4,9:1119\n267#5,4:1128\n237#5,7:1132\n248#5,3:1140\n251#5,2:1144\n272#5,2:1146\n254#5,6:1148\n274#5:1154\n*S KotlinDebug\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/MutableObjectLongMap\n*L\n900#1:1155,2\n900#1:1163,5\n960#1:1194,2\n960#1:1202,5\n1034#1:1219,2\n1034#1:1227,5\n1050#1:1233,2\n1050#1:1241,5\n728#1:1076,6\n804#1:1092\n804#1:1096\n843#1:1114\n843#1:1118\n889#1:1139\n889#1:1143\n900#1:1157,6\n911#1:1168,6\n925#1:1174,3\n926#1:1177\n927#1:1178\n934#1:1179,3\n935#1:1182,3\n936#1:1185\n937#1:1186\n937#1:1187\n941#1:1188\n944#1:1189\n953#1:1190\n953#1:1191\n959#1:1192\n959#1:1193\n960#1:1196,6\n975#1:1207,3\n976#1:1210\n978#1:1211\n1029#1:1212\n1029#1:1213\n1031#1:1214,3\n1032#1:1217\n1034#1:1218\n1034#1:1221,6\n1048#1:1232\n1050#1:1235,6\n1065#1:1246,6\n1071#1:1252,6\n804#1:1082,4\n804#1:1086,6\n804#1:1093,3\n804#1:1097,2\n804#1:1099,2\n804#1:1101,6\n804#1:1107\n843#1:1108,6\n843#1:1115,3\n843#1:1119,9\n889#1:1128,4\n889#1:1132,7\n889#1:1140,3\n889#1:1144,2\n889#1:1146,2\n889#1:1148,6\n889#1:1154\n*E\n"})
public final class MutableObjectLongMap<K> extends ObjectLongMap<K> {
    private int growthLimit;

    public MutableObjectLongMap() {
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
        ArraysKt.fill(this.keys, (Object) null, 0, this._capacity);
        initializeGrowth();
    }

    public final void minusAssign(K key) {
        remove(key);
    }

    public final void put(K key, long value) {
        set(key, value);
    }

    public final void remove(K key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public /* synthetic */ MutableObjectLongMap(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
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

    private final int findIndex(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
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
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = i13;
            int i19 = i13;
            long j13 = j11 ^ (j12 * ScatterMapKt.BitmaskLsb);
            for (long j14 = (~j13) & (j13 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                }
                this._size++;
                int i21 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i22 = iFindFirstAvailableSlot >> 3;
                long j15 = jArr2[i22];
                int i23 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i21 - (((j15 >> i23) & 255) == 128 ? 1 : 0);
                jArr2[i22] = (j15 & (~(255 << i23))) | (j12 << i23);
                int i24 = this._capacity;
                int i25 = ((iFindFirstAvailableSlot - 7) & i24) + (i24 & 7);
                int i26 = i25 >> 3;
                int i27 = (i25 & 7) << 3;
                jArr2[i26] = ((~(255 << i27)) & jArr2[i26]) | (j12 << i27);
                return ~iFindFirstAvailableSlot;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
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
        this.keys = new Object[iMax];
        this.values = new long[iMax];
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
        int i11;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        int i12 = this._capacity;
        initializeStorage(newCapacity);
        Object[] objArr2 = this.keys;
        long[] jArr3 = this.values;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i14 >>> 7);
                long j11 = i14 & 127;
                long[] jArr4 = this.metadata;
                int i15 = iFindFirstAvailableSlot >> 3;
                int i16 = (iFindFirstAvailableSlot & 7) << 3;
                i11 = i13;
                jArr4[i15] = (jArr4[i15] & (~(255 << i16))) | (j11 << i16);
                int i17 = this._capacity;
                int i18 = ((iFindFirstAvailableSlot - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i21 = (i18 & 7) << 3;
                jArr4[i19] = (jArr4[i19] & (~(255 << i21))) | (j11 << i21);
                objArr2[iFindFirstAvailableSlot] = obj;
                jArr3[iFindFirstAvailableSlot] = jArr2[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
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

    public final long getOrPut(K key, @NotNull Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        long jLongValue = defaultValue.invoke().longValue();
        set(key, jLongValue);
        return jLongValue;
    }

    public final void minusAssign(@NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k11 : keys) {
            remove(k11);
        }
    }

    public final void plusAssign(@NotNull ObjectLongMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final long put(K key, long value, long j11) {
        int iFindIndex = findIndex(key);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        } else {
            j11 = this.values[iFindIndex];
        }
        this.keys[iFindIndex] = key;
        this.values[iFindIndex] = value;
        return j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull ObjectLongMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        long[] jArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        set(objArr[i14], jArr[i14]);
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
        this.keys[index] = null;
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

    public MutableObjectLongMap(int i11) {
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

    public final boolean remove(K key, long value) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != value) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(@NotNull Function2<? super K, ? super Long, Boolean> predicate) {
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
                            if (predicate.invoke(this.keys[i14], Long.valueOf(this.values[i14])).booleanValue()) {
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

    public final void set(K key, long value) {
        int iFindIndex = findIndex(key);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        }
        this.keys[iFindIndex] = key;
        this.values[iFindIndex] = value;
    }

    public final void minusAssign(@NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(@NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.elements;
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
                        remove(objArr[(i11 << 3) + i13]);
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
}
