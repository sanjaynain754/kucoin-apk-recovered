package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001e\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u001b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\bH\u0080\b\u001a\u0011\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0080\b\u001a\u0011\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0080\b\u001a\u0013\u0010\u001f\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0080\b\u001a\u0019\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010$\u001a\u00020\bH\u0080\b\u001a\u0019\u0010%\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010$\u001a\u00020\bH\u0080\b\u001a\u0011\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0001H\u0081\b\u001a\u0019\u0010&\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010$\u001a\u00020\bH\u0080\b\u001a\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0000\u001a\u001e\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190\u000f\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019\u001aO\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190\u000f\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u00192*\u0010+\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190-0,\"\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190-¢\u0006\u0002\u0010.\u001a\u0010\u0010/\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0000\u001a\u0010\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0000\u001a\u0019\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\bH\u0081\b\u001a\u0010\u00104\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0000\u001a!\u00105\u001a\u0002062\u0006\u00103\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0001H\u0080\b\u001a\u0011\u00107\u001a\u00020\b*\u00060\u0001j\u0002`8H\u0080\b\u001a\u0011\u00109\u001a\u00020#*\u00060\u0001j\u0002`8H\u0080\b\u001a\u0011\u0010:\u001a\u00020\b*\u00060\u0001j\u0002`;H\u0081\b\u001a\u0015\u0010<\u001a\u00060\u0001j\u0002`8*\u00060\u0001j\u0002`\u001bH\u0080\b\u001a\u0015\u0010=\u001a\u00060\u0001j\u0002`8*\u00060\u0001j\u0002`\u001bH\u0081\b\u001a\u001d\u0010>\u001a\u00060\u0001j\u0002`8*\u00060\u0001j\u0002`\u001b2\u0006\u0010?\u001a\u00020\bH\u0081\b\u001a\u0011\u0010@\u001a\u00020\u0001*\u00060\u0001j\u0002`8H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0004\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0014\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0004*\f\b\u0000\u0010A\"\u00020\u00012\u00020\u0001*\f\b\u0000\u0010B\"\u00020\u00012\u00020\u0001*\f\b\u0000\u0010C\"\u00020\u00012\u00020\u0001¨\u0006D"}, m90084d2 = {"AllEmpty", "", "BitmaskLsb", "getBitmaskLsb$annotations", "()V", "BitmaskMsb", "getBitmaskMsb$annotations", "ClonedMetadataCount", "", "DefaultScatterCapacity", "Deleted", "Empty", "EmptyGroup", "", "EmptyScatterMap", "Landroidx/collection/MutableScatterMap;", "", "", "GroupWidth", "MurmurHashC1", "Sentinel", "getSentinel$annotations", "emptyScatterMap", "Landroidx/collection/ScatterMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "group", "Landroidx/collection/Group;", "metadata", TypedValues.CycleType.S_WAVE_OFFSET, "h1", "hash", "h2", "k", "isDeleted", "", "index", "isEmpty", "isFull", "value", "loadedCapacity", "capacity", "mutableScatterMapOf", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/collection/MutableScatterMap;", "nextCapacity", "normalizeCapacity", "n", "readRawMetadata", "data", "unloadedCapacity", "writeRawMetadata", "", "get", "Landroidx/collection/Bitmask;", "hasNext", "lowestBitSet", "Landroidx/collection/StaticBitmask;", "maskEmpty", "maskEmptyOrDeleted", "match", "m", "next", "Bitmask", "Group", "StaticBitmask", "collection"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n1661#1:1851\n1661#1:1852\n1661#1:1853\n1715#1:1854\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1680#1:1851\n1682#1:1852\n1685#1:1853\n1721#1:1854\n*E\n"})
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;

    @JvmField
    @NotNull
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};

    @NotNull
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    @PublishedApi
    public static final boolean isFull(long j11) {
        return j11 < 128;
    }

    public static final int loadedCapacity(int i11) {
        if (i11 == 7) {
            return 6;
        }
        return i11 - (i11 / 8);
    }

    public static final long maskEmpty(long j11) {
        return j11 & ((~j11) << 6) & (-9187201950435737472L);
    }

    @PublishedApi
    public static final long maskEmptyOrDeleted(long j11) {
        return j11 & ((~j11) << 7) & (-9187201950435737472L);
    }

    @PublishedApi
    public static final long match(long j11, int i11) {
        long j12 = j11 ^ (((long) i11) * BitmaskLsb);
        return (~j12) & (j12 - BitmaskLsb) & (-9187201950435737472L);
    }

    @NotNull
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final int unloadedCapacity(int i11) {
        if (i11 == 7) {
            return 8;
        }
        return i11 + ((i11 - 1) / 7);
    }

    @NotNull
    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        Intrinsics.checkNotNull(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    /* JADX INFO: renamed from: h1 */
    public static final int m2256h1(int i11) {
        return i11 >>> 7;
    }

    /* JADX INFO: renamed from: h2 */
    public static final int m2257h2(int i11) {
        return i11 & 127;
    }

    public static final boolean hasNext(long j11) {
        return j11 != 0;
    }

    public static final int hash(@Nullable Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean isFull(@NotNull long[] metadata, int i11) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i11 >> 3] >> ((i11 & 7) << 3)) & 255) < 128;
    }

    @NotNull
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.putAll(pairs);
        return mutableScatterMap;
    }

    public static final long next(long j11) {
        return j11 & (j11 - 1);
    }

    public static final int nextCapacity(int i11) {
        if (i11 == 0) {
            return 6;
        }
        return (i11 * 2) + 1;
    }

    public static final int normalizeCapacity(int i11) {
        if (i11 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i11);
        }
        return 0;
    }

    @PublishedApi
    public static final long readRawMetadata(@NotNull long[] data, int i11) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (data[i11 >> 3] >> ((i11 & 7) << 3)) & 255;
    }

    public static final void writeRawMetadata(@NotNull long[] data, int i11, long j11) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        data[i12] = (j11 << i13) | (data[i12] & (~(255 << i13)));
    }

    public static final int get(long j11) {
        return Long.numberOfTrailingZeros(j11) >> 3;
    }

    public static final long group(@NotNull long[] metadata, int i11) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        return (((-i13) >> 63) & (metadata[i12 + 1] << (64 - i13))) | (metadata[i12] >>> i13);
    }

    public static final boolean isDeleted(@NotNull long[] metadata, int i11) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (((metadata[i11 >> 3] >> ((i11 & 7) << 3)) & 255) == 254) {
            return true;
        }
        return false;
    }

    public static final boolean isEmpty(@NotNull long[] metadata, int i11) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (((metadata[i11 >> 3] >> ((i11 & 7) << 3)) & 255) == 128) {
            return true;
        }
        return false;
    }

    @PublishedApi
    public static final int lowestBitSet(long j11) {
        return Long.numberOfTrailingZeros(j11) >> 3;
    }

    @PublishedApi
    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSentinel$annotations() {
    }
}
