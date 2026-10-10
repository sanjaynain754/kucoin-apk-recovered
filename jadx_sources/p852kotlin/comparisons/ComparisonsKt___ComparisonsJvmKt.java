package p852kotlin.comparisons;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0017\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0014\n\u0002\u0010\u0013\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\r\u001a!\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0087\b\u001a!\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0087\b\u001a!\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000f\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\n\u0010\u000e\u001a\u00020\u0011\"\u00020\u0006H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u000e\u001a\u00020\u0012\"\u00020\u0007H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\n\u0010\u000e\u001a\u00020\u0013\"\u00020\bH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\n\u0010\u000e\u001a\u00020\u0014\"\u00020\tH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\n\u0010\u000e\u001a\u00020\u0015\"\u00020\nH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00020\u0016\"\u00020\u000bH\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\r\u001a!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0087\b\u001a!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0087\b\u001a!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000f\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\n\u0010\u000e\u001a\u00020\u0011\"\u00020\u0006H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u000e\u001a\u00020\u0012\"\u00020\u0007H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\n\u0010\u000e\u001a\u00020\u0013\"\u00020\bH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\n\u0010\u000e\u001a\u00020\u0014\"\u00020\tH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\n\u0010\u000e\u001a\u00020\u0015\"\u00020\nH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00020\u0016\"\u00020\u000bH\u0007¨\u0006\u0018"}, m90084d2 = {"maxOf", ExifInterface.GPS_DIRECTION_TRUE, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/comparisons/ComparisonsKt")
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version = "1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T maxOf(@NotNull T a11, @NotNull T b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return a11.compareTo(b11) >= 0 ? a11 : b11;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T minOf(@NotNull T a11, @NotNull T b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return a11.compareTo(b11) <= 0 ? a11 : b11;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b11, byte b12) {
        return (byte) Math.max((int) b11, (int) b12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b11, byte b12) {
        return (byte) Math.min((int) b11, (int) b12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s11, short s12) {
        return (short) Math.max((int) s11, (int) s12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s11, short s12) {
        return (short) Math.min((int) s11, (int) s12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i11, int i12) {
        return Math.max(i11, i12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i11, int i12) {
        return Math.min(i11, i12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j11, long j12) {
        return Math.max(j11, j12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j11, long j12) {
        return Math.min(j11, j12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f11, float f12) {
        return Math.max(f11, f12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f11, float f12) {
        return Math.min(f11, f12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d11, double d12) {
        return Math.max(d11, d12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d11, double d12) {
        return Math.min(d11, d12);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a11, @NotNull T b11, @NotNull T c11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        Intrinsics.checkNotNullParameter(c11, "c");
        return (T) maxOf(a11, maxOf(b11, c11));
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a11, @NotNull T b11, @NotNull T c11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        Intrinsics.checkNotNullParameter(c11, "c");
        return (T) minOf(a11, minOf(b11, c11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b11, byte b12, byte b13) {
        return (byte) Math.max((int) b11, Math.max((int) b12, (int) b13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b11, byte b12, byte b13) {
        return (byte) Math.min((int) b11, Math.min((int) b12, (int) b13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s11, short s12, short s13) {
        return (short) Math.max((int) s11, Math.max((int) s12, (int) s13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s11, short s12, short s13) {
        return (short) Math.min((int) s11, Math.min((int) s12, (int) s13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i11, int i12, int i13) {
        return Math.max(i11, Math.max(i12, i13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i11, int i12, int i13) {
        return Math.min(i11, Math.min(i12, i13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j11, long j12, long j13) {
        return Math.max(j11, Math.max(j12, j13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j11, long j12, long j13) {
        return Math.min(j11, Math.min(j12, j13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f11, float f12, float f13) {
        return Math.max(f11, Math.max(f12, f13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f11, float f12, float f13) {
        return Math.min(f11, Math.min(f12, f13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d11, double d12, double d13) {
        return Math.max(d11, Math.max(d12, d13));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d11, double d12, double d13) {
        return Math.min(d11, Math.min(d12, d13));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a11, @NotNull T... other) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t11 : other) {
            a11 = (T) maxOf(a11, t11);
        }
        return a11;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a11, @NotNull T... other) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t11 : other) {
            a11 = (T) minOf(a11, t11);
        }
        return a11;
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b11, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b12 : other) {
            b11 = (byte) Math.max((int) b11, (int) b12);
        }
        return b11;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b11, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b12 : other) {
            b11 = (byte) Math.min((int) b11, (int) b12);
        }
        return b11;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short s11, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s12 : other) {
            s11 = (short) Math.max((int) s11, (int) s12);
        }
        return s11;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short s11, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s12 : other) {
            s11 = (short) Math.min((int) s11, (int) s12);
        }
        return s11;
    }

    @SinceKotlin(version = "1.4")
    public static final int maxOf(int i11, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i12 : other) {
            i11 = Math.max(i11, i12);
        }
        return i11;
    }

    @SinceKotlin(version = "1.4")
    public static int minOf(int i11, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i12 : other) {
            i11 = Math.min(i11, i12);
        }
        return i11;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long j11, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j12 : other) {
            j11 = Math.max(j11, j12);
        }
        return j11;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long j11, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j12 : other) {
            j11 = Math.min(j11, j12);
        }
        return j11;
    }

    @SinceKotlin(version = "1.4")
    public static float maxOf(float f11, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f12 : other) {
            f11 = Math.max(f11, f12);
        }
        return f11;
    }

    @SinceKotlin(version = "1.4")
    public static float minOf(float f11, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f12 : other) {
            f11 = Math.min(f11, f12);
        }
        return f11;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double d11, @NotNull double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d12 : other) {
            d11 = Math.max(d11, d12);
        }
        return d11;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double d11, @NotNull double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d12 : other) {
            d11 = Math.min(d11, d12);
        }
        return d11;
    }
}
