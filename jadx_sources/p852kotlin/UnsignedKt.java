package p852kotlin;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.flutter.embedding.android.KeyboardMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.CharsKt;

/* JADX INFO: compiled from: UnsignedJVM.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0001\u001a\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011H\u0001\u001a\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b¢\u0006\u0002\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0016\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0001\u001a\u0015\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001d\u001a\u0011\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0016\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010 \u001a\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0001\u001a\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010#\u001a\u0011\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0019\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0018\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u000fH\u0000¨\u0006("}, m90084d2 = {"uintRemainder", "Lkotlin/UInt;", "v1", "v2", "uintRemainder-J1ME1BU", "(II)I", "uintDivide", "uintDivide-J1ME1BU", "ulongDivide", "Lkotlin/ULong;", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "uintCompare", "", "ulongCompare", "", "uintToULong", "value", "(I)J", "uintToLong", "uintToFloat", "", "floatToUInt", "(F)I", "uintToDouble", "", "doubleToUInt", "(D)I", "ulongToFloat", "floatToULong", "(F)J", "ulongToDouble", "doubleToULong", "(D)J", "uintToString", "", TtmlNode.RUBY_BASE, "ulongToString", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "UnsignedKt")
public final class UnsignedKt {
    @PublishedApi
    @InlineOnly
    private static final int floatToUInt(float f11) {
        return doubleToUInt(f11);
    }

    @PublishedApi
    @InlineOnly
    private static final long floatToULong(float f11) {
        return doubleToULong(f11);
    }

    @PublishedApi
    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m104195uintDivideJ1ME1BU(int i11, int i12) {
        return UInt.m103939constructorimpl((int) ((((long) i11) & KeyboardMap.kValueMask) / (((long) i12) & KeyboardMap.kValueMask)));
    }

    @PublishedApi
    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m104196uintRemainderJ1ME1BU(int i11, int i12) {
        return UInt.m103939constructorimpl((int) ((((long) i11) & KeyboardMap.kValueMask) % (((long) i12) & KeyboardMap.kValueMask)));
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToLong(int i11) {
        return ((long) i11) & KeyboardMap.kValueMask;
    }

    @InlineOnly
    private static final String uintToString(int i11) {
        return String.valueOf(((long) i11) & KeyboardMap.kValueMask);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToULong(int i11) {
        return ULong.m104018constructorimpl(((long) i11) & KeyboardMap.kValueMask);
    }

    @InlineOnly
    private static final String ulongToString(long j11) {
        return ulongToString(j11, 10);
    }

    @PublishedApi
    public static final int uintCompare(int i11, int i12) {
        return Intrinsics.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    private static final String uintToString(int i11, int i12) {
        return ulongToString(((long) i11) & KeyboardMap.kValueMask, i12);
    }

    @PublishedApi
    public static final int ulongCompare(long j11, long j12) {
        return Intrinsics.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m104197ulongDivideeb3DHEI(long j11, long j12) {
        if (j12 < 0) {
            return Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) < 0 ? ULong.m104018constructorimpl(0L) : ULong.m104018constructorimpl(1L);
        }
        if (j11 >= 0) {
            return ULong.m104018constructorimpl(j11 / j12);
        }
        long j13 = ((j11 >>> 1) / j12) << 1;
        return ULong.m104018constructorimpl(j13 + ((long) (Long.compare(ULong.m104018constructorimpl(j11 - (j13 * j12)) ^ Long.MIN_VALUE, ULong.m104018constructorimpl(j12) ^ Long.MIN_VALUE) < 0 ? 0 : 1)));
    }

    @PublishedApi
    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m104198ulongRemaindereb3DHEI(long j11, long j12) {
        if (j12 < 0) {
            return Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) < 0 ? j11 : ULong.m104018constructorimpl(j11 - j12);
        }
        if (j11 >= 0) {
            return ULong.m104018constructorimpl(j11 % j12);
        }
        long j13 = j11 - ((((j11 >>> 1) / j12) << 1) * j12);
        if (Long.compare(ULong.m104018constructorimpl(j13) ^ Long.MIN_VALUE, ULong.m104018constructorimpl(j12) ^ Long.MIN_VALUE) < 0) {
            j12 = 0;
        }
        return ULong.m104018constructorimpl(j13 - j12);
    }

    @PublishedApi
    public static final double ulongToDouble(long j11) {
        return ((j11 >>> 11) * ((double) 2048)) + (j11 & 2047);
    }

    @NotNull
    public static final String ulongToString(long j11, int i11) {
        if (j11 >= 0) {
            String string = Long.toString(j11, CharsKt.checkRadix(i11));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j12 = i11;
        long j13 = ((j11 >>> 1) / j12) << 1;
        long j14 = j11 - (j13 * j12);
        if (j14 >= j12) {
            j14 -= j12;
            j13++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j13, CharsKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j14, CharsKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }

    @PublishedApi
    public static final int doubleToUInt(double d11) {
        if (Double.isNaN(d11) || d11 <= uintToDouble(0)) {
            return 0;
        }
        if (d11 >= uintToDouble(-1)) {
            return -1;
        }
        if (d11 <= 2.147483647E9d) {
            return UInt.m103939constructorimpl((int) d11);
        }
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl((int) (d11 - ((double) Integer.MAX_VALUE))) + UInt.m103939constructorimpl(Integer.MAX_VALUE));
    }

    @PublishedApi
    public static final long doubleToULong(double d11) {
        if (Double.isNaN(d11) || d11 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d11 >= ulongToDouble(-1L)) {
            return -1L;
        }
        if (d11 < 9.223372036854776E18d) {
            return ULong.m104018constructorimpl((long) d11);
        }
        return ULong.m104018constructorimpl(ULong.m104018constructorimpl((long) (d11 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @PublishedApi
    public static final double uintToDouble(int i11) {
        return ((double) (Integer.MAX_VALUE & i11)) + (((double) ((i11 >>> 31) << 30)) * ((double) 2));
    }

    @PublishedApi
    @InlineOnly
    private static final float uintToFloat(int i11) {
        return (float) uintToDouble(i11);
    }

    @PublishedApi
    @InlineOnly
    private static final float ulongToFloat(long j11) {
        return (float) ulongToDouble(j11);
    }
}
