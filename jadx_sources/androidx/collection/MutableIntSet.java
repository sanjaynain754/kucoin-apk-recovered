package androidx.collection;

import androidx.annotation.IntRange;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.ULong;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0016\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u0016\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u0011\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0007J\u0019\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H\u0082\bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Landroidx/collection/MutableIntSet;", "Landroidx/collection/IntSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "addAll", "elements", "", "adjustStorage", "", "clear", "findAbsoluteInsertIndex", "findFirstAvailableSlot", "hash1", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "plusAssign", "remove", "removeAll", "removeDeletedMarkers", "removeElementAt", "index", "resizeStorage", "newCapacity", "trim", "writeMetadata", "value", "", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 IntSet.kt\nandroidx/collection/IntSet\n+ 6 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,853:1\n832#1,2:997\n836#1,5:1005\n832#1,2:1036\n836#1,5:1044\n832#1,2:1061\n836#1,5:1069\n832#1,2:1075\n836#1,5:1083\n1#2:854\n1672#3,6:855\n1826#3:874\n1688#3:878\n1619#3:895\n1615#3:898\n1795#3,3:902\n1809#3,3:906\n1733#3:910\n1721#3:912\n1715#3:913\n1728#3:918\n1818#3:920\n1619#3:934\n1615#3:937\n1795#3,3:941\n1809#3,3:945\n1733#3:949\n1721#3:951\n1715#3:952\n1728#3:957\n1818#3:959\n1826#3:981\n1688#3:985\n1672#3,6:999\n1672#3,6:1010\n1615#3:1019\n1619#3:1020\n1795#3,3:1021\n1809#3,3:1024\n1733#3:1027\n1721#3:1028\n1715#3:1029\n1728#3:1030\n1818#3:1031\n1682#3:1032\n1661#3:1033\n1680#3:1034\n1661#3:1035\n1672#3,6:1038\n1795#3,3:1049\n1826#3:1052\n1715#3:1053\n1685#3:1054\n1661#3:1055\n1615#3:1059\n1619#3:1060\n1672#3,6:1063\n1661#3:1074\n1672#3,6:1077\n1672#3,6:1088\n1672#3,6:1094\n13600#4,2:861\n13600#4,2:968\n262#5,4:863\n232#5,7:867\n243#5,3:875\n246#5,2:879\n266#5,2:881\n249#5,6:883\n268#5:889\n442#5:890\n443#5:894\n445#5,2:896\n447#5,3:899\n450#5:905\n451#5:909\n452#5:911\n453#5,4:914\n459#5:919\n460#5,8:921\n442#5:929\n443#5:933\n445#5,2:935\n447#5,3:938\n450#5:944\n451#5:948\n452#5:950\n453#5,4:953\n459#5:958\n460#5,8:960\n262#5,4:970\n232#5,7:974\n243#5,3:982\n246#5,2:986\n266#5,2:988\n249#5,6:990\n268#5:996\n849#6,3:891\n849#6,3:930\n849#6,3:1016\n849#6,3:1056\n*S KotlinDebug\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n*L\n673#1:997,2\n673#1:1005,5\n731#1:1036,2\n731#1:1044,5\n803#1:1061,2\n803#1:1069,5\n818#1:1075,2\n818#1:1083,5\n526#1:855,6\n595#1:874\n595#1:878\n607#1:895\n607#1:898\n607#1:902,3\n607#1:906,3\n607#1:910\n607#1:912\n607#1:913\n607#1:918\n607#1:920\n620#1:934\n620#1:937\n620#1:941,3\n620#1:945,3\n620#1:949\n620#1:951\n620#1:952\n620#1:957\n620#1:959\n663#1:981\n663#1:985\n673#1:999,6\n683#1:1010,6\n697#1:1019\n698#1:1020\n705#1:1021,3\n706#1:1024,3\n707#1:1027\n708#1:1028\n708#1:1029\n712#1:1030\n715#1:1031\n724#1:1032\n724#1:1033\n730#1:1034\n730#1:1035\n731#1:1038,6\n745#1:1049,3\n746#1:1052\n748#1:1053\n798#1:1054\n798#1:1055\n801#1:1059\n803#1:1060\n803#1:1063,6\n816#1:1074\n818#1:1077,6\n833#1:1088,6\n839#1:1094,6\n573#1:861,2\n642#1:968,2\n595#1:863,4\n595#1:867,7\n595#1:875,3\n595#1:879,2\n595#1:881,2\n595#1:883,6\n595#1:889\n607#1:890\n607#1:894\n607#1:896,2\n607#1:899,3\n607#1:905\n607#1:909\n607#1:911\n607#1:914,4\n607#1:919\n607#1:921,8\n620#1:929\n620#1:933\n620#1:935,2\n620#1:938,3\n620#1:944\n620#1:948\n620#1:950\n620#1:953,4\n620#1:958\n620#1:960,8\n663#1:970,4\n663#1:974,7\n663#1:982,3\n663#1:986,2\n663#1:988,2\n663#1:990,6\n663#1:996\n607#1:891,3\n620#1:930,3\n696#1:1016,3\n800#1:1056,3\n*E\n"})
public final class MutableIntSet extends IntSet {
    private int growthLimit;

    public MutableIntSet() {
        this(0, 1, null);
    }

    public final boolean addAll(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        plusAssign(elements);
        return i11 != this._size;
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

    public final void minusAssign(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * ScatterMapKt.MurmurHashC1;
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i15 += 8;
                i14 = (i14 + i15) & i13;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            removeElementAt(iNumberOfTrailingZeros);
        }
    }

    public final void plusAssign(int element) {
        this.elements[findAbsoluteInsertIndex(element)] = element;
    }

    public final boolean removeAll(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        minusAssign(elements);
        return i11 != this._size;
    }

    public /* synthetic */ MutableIntSet(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    private final void adjustStorage() {
        if (this._capacity <= 8 || Long.compare(ULong.m104018constructorimpl(ULong.m104018constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m104018constructorimpl(ULong.m104018constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            removeDeletedMarkers();
        }
    }

    private final int findAbsoluteInsertIndex(int element) {
        int iHashCode = Integer.hashCode(element) * ScatterMapKt.MurmurHashC1;
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
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
        this.elements = new int[iMax];
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

    private final void removeElementAt(int index) {
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

    private final void resizeStorage(int newCapacity) {
        MutableIntSet mutableIntSet = this;
        long[] jArr = mutableIntSet.metadata;
        int[] iArr = mutableIntSet.elements;
        int i11 = mutableIntSet._capacity;
        initializeStorage(newCapacity);
        int[] iArr2 = mutableIntSet.elements;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int iHashCode = Integer.hashCode(i13) * ScatterMapKt.MurmurHashC1;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableIntSet.findFirstAvailableSlot(i14 >>> 7);
                long j11 = i14 & 127;
                long[] jArr2 = mutableIntSet.metadata;
                int i15 = iFindFirstAvailableSlot >> 3;
                int i16 = (iFindFirstAvailableSlot & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (j11 << i16);
                int i17 = mutableIntSet._capacity;
                int i18 = ((iFindFirstAvailableSlot - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i21 = (i18 & 7) << 3;
                jArr2[i19] = ((~(255 << i21)) & jArr2[i19]) | (j11 << i21);
                iArr2[iFindFirstAvailableSlot] = i13;
            }
            i12++;
            mutableIntSet = this;
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

    public final boolean add(int element) {
        int i11 = this._size;
        this.elements[findAbsoluteInsertIndex(element)] = element;
        return this._size != i11;
    }

    public final boolean remove(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * ScatterMapKt.MurmurHashC1;
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
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
        boolean z11 = iNumberOfTrailingZeros >= 0;
        if (z11) {
            removeElementAt(iNumberOfTrailingZeros);
        }
        return z11;
    }

    @IntRange(from = 0)
    public final int trim() {
        int i11 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i11) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i11 - this._capacity;
    }

    public MutableIntSet(int i11) {
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

    public final void plusAssign(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i11 : elements) {
            plusAssign(i11);
        }
    }

    public final boolean addAll(@NotNull IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        plusAssign(elements);
        return i11 != this._size;
    }

    public final boolean removeAll(@NotNull IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        minusAssign(elements);
        return i11 != this._size;
    }

    public final void plusAssign(@NotNull IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        plusAssign(iArr[(i11 << 3) + i13]);
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

    public final void minusAssign(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i11 : elements) {
            minusAssign(i11);
        }
    }

    public final void minusAssign(@NotNull IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        minusAssign(iArr[(i11 << 3) + i13]);
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
