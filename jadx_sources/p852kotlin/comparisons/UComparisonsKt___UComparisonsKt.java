package p852kotlin.comparisons;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalUnsignedTypes;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.UByteArray;
import p852kotlin.UIntArray;
import p852kotlin.ULongArray;
import p852kotlin.UShort;
import p852kotlin.UShortArray;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _UComparisons.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a(\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b \u0010!\u001a#\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\u0005\u001a\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\b\u001a\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b(\u0010\u000b\u001a\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010\u000e\u001a(\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b*\u0010\u0011\u001a(\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b+\u0010\u0013\u001a(\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b,\u0010\u0015\u001a(\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b-\u0010\u0017\u001a#\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b.\u0010\u001b\u001a#\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u001e\u001a#\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b0\u0010!\u001a#\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b1\u0010$¨\u00062"}, m90084d2 = {"maxOf", "Lkotlin/UInt;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "maxOf-J1ME1BU", "(II)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "Lkotlin/UByte;", "maxOf-Kr8caGY", "(BB)B", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "c", "maxOf-WZ9TVnA", "(III)I", "maxOf-sambcqE", "(JJJ)J", "maxOf-b33U2AM", "(BBB)B", "maxOf-VKSA0NQ", "(SSS)S", "other", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-J1ME1BU", "minOf-eb3DHEI", "minOf-Kr8caGY", "minOf-5PvTz6A", "minOf-WZ9TVnA", "minOf-sambcqE", "minOf-b33U2AM", "minOf-VKSA0NQ", "minOf-Md2H83M", "minOf-R03FKyM", "minOf-Wr6uiD8", "minOf-t1qELG4", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/comparisons/UComparisonsKt")
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m105026maxOfKr8caGY(byte b11, byte b12) {
        return Intrinsics.compare(b11 & 255, b12 & 255) >= 0 ? b11 : b12;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m105027maxOfMd2H83M(int i11, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM104000getSizeimpl = UIntArray.m104000getSizeimpl(other);
        for (int i12 = 0; i12 < iM104000getSizeimpl; i12++) {
            i11 = m105025maxOfJ1ME1BU(i11, UIntArray.m103999getpVg5ArA(other, i12));
        }
        return i11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m105028maxOfR03FKyM(long j11, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM104079getSizeimpl = ULongArray.m104079getSizeimpl(other);
        for (int i11 = 0; i11 < iM104079getSizeimpl; i11++) {
            j11 = m105033maxOfeb3DHEI(j11, ULongArray.m104078getsVKNKU(other, i11));
        }
        return j11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m105031maxOfWr6uiD8(byte b11, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM103921getSizeimpl = UByteArray.m103921getSizeimpl(other);
        for (int i11 = 0; i11 < iM103921getSizeimpl; i11++) {
            b11 = m105026maxOfKr8caGY(b11, UByteArray.m103920getw2LRezQ(other, i11));
        }
        return b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m105035maxOft1qELG4(short s11, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM104184getSizeimpl = UShortArray.m104184getSizeimpl(other);
        for (int i11 = 0; i11 < iM104184getSizeimpl; i11++) {
            s11 = m105024maxOf5PvTz6A(s11, UShortArray.m104183getMh2AYeg(other, i11));
        }
        return s11;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m105038minOfKr8caGY(byte b11, byte b12) {
        return Intrinsics.compare(b11 & 255, b12 & 255) <= 0 ? b11 : b12;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m105039minOfMd2H83M(int i11, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM104000getSizeimpl = UIntArray.m104000getSizeimpl(other);
        for (int i12 = 0; i12 < iM104000getSizeimpl; i12++) {
            i11 = m105037minOfJ1ME1BU(i11, UIntArray.m103999getpVg5ArA(other, i12));
        }
        return i11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m105040minOfR03FKyM(long j11, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM104079getSizeimpl = ULongArray.m104079getSizeimpl(other);
        for (int i11 = 0; i11 < iM104079getSizeimpl; i11++) {
            j11 = m105045minOfeb3DHEI(j11, ULongArray.m104078getsVKNKU(other, i11));
        }
        return j11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m105043minOfWr6uiD8(byte b11, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM103921getSizeimpl = UByteArray.m103921getSizeimpl(other);
        for (int i11 = 0; i11 < iM103921getSizeimpl; i11++) {
            b11 = m105038minOfKr8caGY(b11, UByteArray.m103920getw2LRezQ(other, i11));
        }
        return b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m105047minOft1qELG4(short s11, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM104184getSizeimpl = UShortArray.m104184getSizeimpl(other);
        for (int i11 = 0; i11 < iM104184getSizeimpl; i11++) {
            s11 = m105036minOf5PvTz6A(s11, UShortArray.m104183getMh2AYeg(other, i11));
        }
        return s11;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m105024maxOf5PvTz6A(short s11, short s12) {
        if (Intrinsics.compare(s11 & UShort.MAX_VALUE, 65535 & s12) >= 0) {
            return s11;
        }
        return s12;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m105025maxOfJ1ME1BU(int i11, int i12) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) >= 0) {
            return i11;
        }
        return i12;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m105029maxOfVKSA0NQ(short s11, short s12, short s13) {
        return m105024maxOf5PvTz6A(s11, m105024maxOf5PvTz6A(s12, s13));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m105030maxOfWZ9TVnA(int i11, int i12, int i13) {
        return m105025maxOfJ1ME1BU(i11, m105025maxOfJ1ME1BU(i12, i13));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m105032maxOfb33U2AM(byte b11, byte b12, byte b13) {
        return m105026maxOfKr8caGY(b11, m105026maxOfKr8caGY(b12, b13));
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m105033maxOfeb3DHEI(long j11, long j12) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) >= 0) {
            return j11;
        }
        return j12;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m105034maxOfsambcqE(long j11, long j12, long j13) {
        return m105033maxOfeb3DHEI(j11, m105033maxOfeb3DHEI(j12, j13));
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m105036minOf5PvTz6A(short s11, short s12) {
        if (Intrinsics.compare(s11 & UShort.MAX_VALUE, 65535 & s12) <= 0) {
            return s11;
        }
        return s12;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m105037minOfJ1ME1BU(int i11, int i12) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) <= 0) {
            return i11;
        }
        return i12;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m105041minOfVKSA0NQ(short s11, short s12, short s13) {
        return m105036minOf5PvTz6A(s11, m105036minOf5PvTz6A(s12, s13));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m105042minOfWZ9TVnA(int i11, int i12, int i13) {
        return m105037minOfJ1ME1BU(i11, m105037minOfJ1ME1BU(i12, i13));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m105044minOfb33U2AM(byte b11, byte b12, byte b13) {
        return m105038minOfKr8caGY(b11, m105038minOfKr8caGY(b12, b13));
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m105045minOfeb3DHEI(long j11, long j12) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) <= 0) {
            return j11;
        }
        return j12;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m105046minOfsambcqE(long j11, long j12, long j13) {
        return m105045minOfeb3DHEI(j11, m105045minOfeb3DHEI(j12, j13));
    }
}
