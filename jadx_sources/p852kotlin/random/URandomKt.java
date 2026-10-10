package p852kotlin.random;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import io.flutter.embedding.android.KeyboardMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalUnsignedTypes;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.UByteArray;
import p852kotlin.UInt;
import p852kotlin.ULong;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.UIntRange;
import p852kotlin.ranges.ULongRange;

/* JADX INFO: compiled from: URandom.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u000e*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a/\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0000¢\u0006\u0004\b'\u0010(¨\u0006)"}, m90084d2 = {"nextUInt", "Lkotlin/UInt;", "Lkotlin/random/Random;", "(Lkotlin/random/Random;)I", "until", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "from", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", SessionDescription.ATTR_RANGE, "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "Lkotlin/ULong;", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "nextUBytes", "Lkotlin/UByteArray;", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "size", "", "(Lkotlin/random/Random;I)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "checkUIntRangeBounds", "", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class URandomKt {
    @SinceKotlin(version = "1.5")
    public static final int nextUInt(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UInt.m103939constructorimpl(random.nextInt());
    }

    @SinceKotlin(version = "1.5")
    public static final long nextULong(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return ULong.m104018constructorimpl(random.nextLong());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] nextUBytes(@NotNull Random random, int i11) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UByteArray.m103915constructorimpl(random.nextBytes(i11));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m105059nextUBytesEVgfTAA(@NotNull Random nextUBytes, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m105060nextUBytesWvrt4B4(@NotNull Random nextUBytes, @NotNull byte[] array, int i11, int i12) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i11, i12);
        return array;
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m105061nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = UByteArray.m103921getSizeimpl(bArr);
        }
        return m105060nextUBytesWvrt4B4(random, bArr, i11, i12);
    }

    @SinceKotlin(version = "1.5")
    public static final int nextUInt(@NotNull Random random, @NotNull UIntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (Integer.compare(range.getLast() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE) < 0) {
                return m105062nextUInta8DCA5k(random, range.getFirst(), UInt.m103939constructorimpl(range.getLast() + 1));
            }
            return Integer.compare(range.getFirst() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0 ? UInt.m103939constructorimpl(m105062nextUInta8DCA5k(random, UInt.m103939constructorimpl(range.getFirst() - 1), range.getLast()) + 1) : nextUInt(random);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m105062nextUInta8DCA5k(@NotNull Random nextUInt, int i11, int i12) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m105057checkUIntRangeBoundsJ1ME1BU(i11, i12);
        return UInt.m103939constructorimpl(nextUInt.nextInt(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m105063nextUIntqCasIEU(@NotNull Random nextUInt, int i11) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m105062nextUInta8DCA5k(nextUInt, 0, i11);
    }

    @SinceKotlin(version = "1.5")
    public static final long nextULong(@NotNull Random random, @NotNull ULongRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compare(range.getLast() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE) < 0) {
            return m105065nextULongjmpaWc(random, range.getFirst(), ULong.m104018constructorimpl(range.getLast() + ULong.m104018constructorimpl(((long) 1) & KeyboardMap.kValueMask)));
        }
        if (Long.compare(range.getFirst() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
            return nextULong(random);
        }
        long jM105075getFirstsVKNKU = range.getFirst();
        long j11 = ((long) 1) & KeyboardMap.kValueMask;
        return ULong.m104018constructorimpl(m105065nextULongjmpaWc(random, ULong.m104018constructorimpl(jM105075getFirstsVKNKU - ULong.m104018constructorimpl(j11)), range.getLast()) + ULong.m104018constructorimpl(j11));
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m105064nextULongV1Xi4fY(@NotNull Random nextULong, long j11) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m105065nextULongjmpaWc(nextULong, 0L, j11);
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m105065nextULongjmpaWc(@NotNull Random nextULong, long j11, long j12) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m105058checkULongRangeBoundseb3DHEI(j11, j12);
        return ULong.m104018constructorimpl(nextULong.nextLong(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m105057checkUIntRangeBoundsJ1ME1BU(int i11, int i12) {
        if (Integer.compare(i12 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0) {
        } else {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m103933boximpl(i11), UInt.m103933boximpl(i12)).toString());
        }
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m105058checkULongRangeBoundseb3DHEI(long j11, long j12) {
        if (Long.compare(j12 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0) {
        } else {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m104012boximpl(j11), ULong.m104012boximpl(j12)).toString());
        }
    }
}
