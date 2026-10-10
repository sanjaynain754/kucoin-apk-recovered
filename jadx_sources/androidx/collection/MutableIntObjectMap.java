package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.ULong;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IntObjectMap.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0011\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\nJ\u0011\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0019H\u0086\nJ\u0011\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u001aH\u0086\nJ\u0017\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\nJ\u001d\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0002\u0010\"J\u001b\u0010!\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\bH\u0002J&\u0010&\u001a\u00020\b2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0(H\u0086\bø\u0001\u0000J\u0017\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010*\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\"J\u0010\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0004H\u0002J\u001e\u0010-\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020\u0004J\u0019\u00100\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u000201H\u0082\bR\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, m90084d2 = {"Landroidx/collection/MutableIntObjectMap;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/IntObjectMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findAbsoluteInsertIndex", "key", "findFirstAvailableSlot", "hash1", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/IntList;", "Landroidx/collection/IntSet;", "", "plusAssign", "from", "put", "value", "(ILjava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(I)Ljava/lang/Object;", "", "(ILjava/lang/Object;)Z", "removeDeletedMarkers", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "(ILjava/lang/Object;)V", "trim", "writeMetadata", "", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 5 IntSet.kt\nandroidx/collection/IntSetKt\n+ 6 IntSet.kt\nandroidx/collection/IntSet\n+ 7 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,1034:1\n820#1,2:1187\n820#1,2:1201\n1024#1,2:1204\n1028#1,5:1212\n1024#1,2:1243\n1028#1,5:1251\n1024#1,2:1268\n1028#1,5:1276\n1024#1,2:1282\n1028#1,5:1290\n1#2:1035\n1672#3,6:1036\n1826#3:1052\n1688#3:1056\n1619#3:1073\n1615#3:1076\n1795#3,3:1081\n1809#3,3:1085\n1733#3:1089\n1721#3:1091\n1715#3:1092\n1728#3:1097\n1818#3:1099\n1619#3:1113\n1615#3:1116\n1795#3,3:1121\n1809#3,3:1125\n1733#3:1129\n1721#3:1131\n1715#3:1132\n1728#3:1137\n1818#3:1139\n1826#3:1154\n1688#3:1158\n1826#3:1179\n1688#3:1183\n1672#3,6:1206\n1672#3,6:1217\n1615#3:1226\n1619#3:1227\n1795#3,3:1228\n1809#3,3:1231\n1733#3:1234\n1721#3:1235\n1715#3:1236\n1728#3:1237\n1818#3:1238\n1682#3:1239\n1661#3:1240\n1680#3:1241\n1661#3:1242\n1672#3,6:1245\n1795#3,3:1256\n1826#3:1259\n1715#3:1260\n1685#3:1261\n1661#3:1262\n1615#3:1266\n1619#3:1267\n1672#3,6:1270\n1661#3:1281\n1672#3,6:1284\n1672#3,6:1295\n1672#3,6:1301\n382#4,4:1042\n354#4,6:1046\n364#4,3:1053\n367#4,2:1057\n387#4,2:1059\n370#4,6:1061\n389#4:1067\n619#4:1068\n620#4:1072\n622#4,2:1074\n624#4,4:1077\n628#4:1084\n629#4:1088\n630#4:1090\n631#4,4:1093\n637#4:1098\n638#4,8:1100\n619#4:1108\n620#4:1112\n622#4,2:1114\n624#4,4:1117\n628#4:1124\n629#4:1128\n630#4:1130\n631#4,4:1133\n637#4:1138\n638#4,8:1140\n354#4,6:1148\n364#4,3:1155\n367#4,9:1159\n849#5,3:1069\n849#5,3:1109\n849#5,3:1223\n849#5,3:1263\n262#6,4:1168\n232#6,7:1172\n243#6,3:1180\n246#6,2:1184\n266#6:1186\n267#6:1189\n249#6,6:1190\n268#6:1196\n253#7,4:1197\n258#7:1203\n*S KotlinDebug\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n*L\n837#1:1187,2\n846#1:1201,2\n856#1:1204,2\n856#1:1212,5\n920#1:1243,2\n920#1:1251,5\n994#1:1268,2\n994#1:1276,5\n1010#1:1282,2\n1010#1:1290,5\n713#1:1036,6\n766#1:1052\n766#1:1056\n782#1:1073\n782#1:1076\n782#1:1081,3\n782#1:1085,3\n782#1:1089\n782#1:1091\n782#1:1092\n782#1:1097\n782#1:1099\n794#1:1113\n794#1:1116\n794#1:1121,3\n794#1:1125,3\n794#1:1129\n794#1:1131\n794#1:1132\n794#1:1137\n794#1:1139\n808#1:1154\n808#1:1158\n836#1:1179\n836#1:1183\n856#1:1206,6\n871#1:1217,6\n886#1:1226\n887#1:1227\n894#1:1228,3\n895#1:1231,3\n896#1:1234\n897#1:1235\n897#1:1236\n901#1:1237\n904#1:1238\n913#1:1239\n913#1:1240\n919#1:1241\n919#1:1242\n920#1:1245,6\n935#1:1256,3\n936#1:1259\n938#1:1260\n989#1:1261\n989#1:1262\n992#1:1266\n994#1:1267\n994#1:1270,6\n1008#1:1281\n1010#1:1284,6\n1025#1:1295,6\n1031#1:1301,6\n766#1:1042,4\n766#1:1046,6\n766#1:1053,3\n766#1:1057,2\n766#1:1059,2\n766#1:1061,6\n766#1:1067\n782#1:1068\n782#1:1072\n782#1:1074,2\n782#1:1077,4\n782#1:1084\n782#1:1088\n782#1:1090\n782#1:1093,4\n782#1:1098\n782#1:1100,8\n794#1:1108\n794#1:1112\n794#1:1114,2\n794#1:1117,4\n794#1:1124\n794#1:1128\n794#1:1130\n794#1:1133,4\n794#1:1138\n794#1:1140,8\n808#1:1148,6\n808#1:1155,3\n808#1:1159,9\n782#1:1069,3\n794#1:1109,3\n885#1:1223,3\n991#1:1263,3\n836#1:1168,4\n836#1:1172,7\n836#1:1180,3\n836#1:1184,2\n836#1:1186\n836#1:1189\n836#1:1190,6\n836#1:1196\n845#1:1197,4\n845#1:1203\n*E\n"})
public final class MutableIntObjectMap<V> extends IntObjectMap<V> {
    private int growthLimit;

    public MutableIntObjectMap() {
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
        ArraysKt.fill(this.values, (Object) null, 0, this._capacity);
        initializeGrowth();
    }

    public final void minusAssign(int key) {
        remove(key);
    }

    @Nullable
    public final V remove(int key) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j11;
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return removeValueAt(iNumberOfTrailingZeros);
        }
        return null;
    }

    public /* synthetic */ MutableIntObjectMap(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    private final void adjustStorage() {
        if (this._capacity <= 8 || Long.compare(ULong.m104018constructorimpl(ULong.m104018constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m104018constructorimpl(ULong.m104018constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            removeDeletedMarkers();
        }
    }

    private final int findAbsoluteInsertIndex(int key) {
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
                return iFindFirstAvailableSlot;
            }
            i16 = i21 + 8;
            i15 = (i15 + i16) & i14;
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
        this.values = new Object[iMax];
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
        MutableIntObjectMap<V> mutableIntObjectMap = this;
        long[] jArr = mutableIntObjectMap.metadata;
        int[] iArr = mutableIntObjectMap.keys;
        Object[] objArr = mutableIntObjectMap.values;
        int i11 = mutableIntObjectMap._capacity;
        initializeStorage(newCapacity);
        int[] iArr2 = mutableIntObjectMap.keys;
        Object[] objArr2 = mutableIntObjectMap.values;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int iHashCode = Integer.hashCode(i13) * ScatterMapKt.MurmurHashC1;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableIntObjectMap.findFirstAvailableSlot(i14 >>> 7);
                long j11 = i14 & 127;
                long[] jArr2 = mutableIntObjectMap.metadata;
                int i15 = iFindFirstAvailableSlot >> 3;
                int i16 = (iFindFirstAvailableSlot & 7) << 3;
                jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (j11 << i16);
                int i17 = mutableIntObjectMap._capacity;
                int i18 = ((iFindFirstAvailableSlot - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i21 = (i18 & 7) << 3;
                jArr2[i19] = ((~(255 << i21)) & jArr2[i19]) | (j11 << i21);
                iArr2[iFindFirstAvailableSlot] = i13;
                objArr2[iFindFirstAvailableSlot] = objArr[i12];
            }
            i12++;
            mutableIntObjectMap = this;
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

    public final V getOrPut(int key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v11 = get(key);
        if (v11 != null) {
            return v11;
        }
        V vInvoke = defaultValue.invoke();
        set(key, vInvoke);
        return vInvoke;
    }

    public final void minusAssign(@NotNull int[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (int i11 : keys) {
            remove(i11);
        }
    }

    public final void plusAssign(@NotNull IntObjectMap<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull IntObjectMap<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        int[] iArr = from.keys;
        Object[] objArr = from.values;
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
                        set(iArr[i14], objArr[i14]);
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
    @Nullable
    public final V removeValueAt(int index) {
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
        Object[] objArr = this.values;
        V v11 = (V) objArr[index];
        objArr[index] = null;
        return v11;
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

    public MutableIntObjectMap(int i11) {
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

    @Nullable
    public final V put(int key, V value) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(key);
        Object[] objArr = this.values;
        V v11 = (V) objArr[iFindAbsoluteInsertIndex];
        this.keys[iFindAbsoluteInsertIndex] = key;
        objArr[iFindAbsoluteInsertIndex] = value;
        return v11;
    }

    public final void removeIf(@NotNull Function2<? super Integer, ? super V, Boolean> predicate) {
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
                            if (predicate.invoke(Integer.valueOf(this.keys[i14]), this.values[i14]).booleanValue()) {
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

    public final void set(int key, V value) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(key);
        this.keys[iFindAbsoluteInsertIndex] = key;
        this.values[iFindAbsoluteInsertIndex] = value;
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

    public final boolean remove(int key, V value) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j11;
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros < 0 || !Intrinsics.areEqual(this.values[iNumberOfTrailingZeros], value)) {
            return false;
        }
        removeValueAt(iNumberOfTrailingZeros);
        return true;
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
