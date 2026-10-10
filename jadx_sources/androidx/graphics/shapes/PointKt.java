package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import io.flutter.embedding.android.KeyboardMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Point.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\b\u001a\u00060\u0002j\u0002`\u00032\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\n\u0010\n\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\u000e\u001a\u00020\u000f*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005\u001a\u001a\u0010&\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0005\u001a+\u0010(\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a+\u0010+\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010*\u001a'\u0010-\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0019\u001a'\u0010/\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019\u001a&\u00101\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u00102\u001a\u000203H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b7\u0010#\"\u001c\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005*\f\b\u0000\u00108\"\u00020\u00022\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, m90084d2 = {"x", "", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "getX-DnnuFBc", "(J)F", "y", "getY-DnnuFBc", "interpolate", "start", InterfaceC33730j9.f70350a, "fraction", "interpolate-dLqxh1s", "(JJF)J", "clockwise", "", "other", "clockwise-ybeJwSQ", "(JJ)Z", "copy", "copy-5P9i7ZU", "(JFF)J", TtmlNode.TAG_DIV, "operand", "div-so9K2fw", "(JF)J", "dotProduct", "dotProduct-ybeJwSQ", "(JJ)F", "otherX", "otherY", "dotProduct-5P9i7ZU", "(JFF)F", "getDirection", "getDirection-DnnuFBc", "(J)J", "getDistance", "getDistance-DnnuFBc", "getDistanceSquared", "getDistanceSquared-DnnuFBc", "minus", "minus-ybeJwSQ", "(JJ)J", "plus", "plus-ybeJwSQ", "rem", "rem-so9K2fw", "times", "times-so9K2fw", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "transformed-so9K2fw", "(JLandroidx/graphics/shapes/PointTransformer;)J", "unaryMinus", "unaryMinus-DnnuFBc", "Point", "graphics-shapes_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Point.kt\nandroidx/graphics/shapes/PointKt\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n48#2:140\n54#2:142\n48#2:144\n54#2:146\n48#2:148\n54#2:150\n22#3:141\n22#3:143\n22#3:145\n22#3:149\n1#4:147\n*S KotlinDebug\n*F\n+ 1 Point.kt\nandroidx/graphics/shapes/PointKt\n*L\n27#1:140\n30#1:142\n32#1:144\n32#1:146\n137#1:148\n137#1:150\n27#1:141\n30#1:143\n32#1:145\n137#1:149\n*E\n"})
public final class PointKt {
    /* JADX INFO: renamed from: copy-5P9i7ZU$default, reason: not valid java name */
    public static /* synthetic */ long m103555copy5P9i7ZU$default(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (KeyboardMap.kValueMask & j11));
        }
        return m103554copy5P9i7ZU(j11, f11, f12);
    }

    /* JADX INFO: renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m103562getXDnnuFBc(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* JADX INFO: renamed from: transformed-so9K2fw, reason: not valid java name */
    public static final long m103569transformedso9K2fw(long j11, @NotNull PointTransformer f11) {
        Intrinsics.checkNotNullParameter(f11, "f");
        long jMo103571transformXgqJiTY = f11.mo103571transformXgqJiTY(m103562getXDnnuFBc(j11), m103563getYDnnuFBc(j11));
        return FloatFloatPair.m103448constructorimpl(Float.intBitsToFloat((int) (jMo103571transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (jMo103571transformXgqJiTY & KeyboardMap.kValueMask)));
    }

    /* JADX INFO: renamed from: clockwise-ybeJwSQ, reason: not valid java name */
    public static final boolean m103553clockwiseybeJwSQ(long j11, long j12) {
        if ((m103562getXDnnuFBc(j11) * m103563getYDnnuFBc(j12)) - (m103563getYDnnuFBc(j11) * m103562getXDnnuFBc(j12)) > 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: copy-5P9i7ZU, reason: not valid java name */
    public static final long m103554copy5P9i7ZU(long j11, float f11, float f12) {
        return FloatFloatPair.m103448constructorimpl(f11, f12);
    }

    /* JADX INFO: renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m103556divso9K2fw(long j11, float f11) {
        return FloatFloatPair.m103448constructorimpl(m103562getXDnnuFBc(j11) / f11, m103563getYDnnuFBc(j11) / f11);
    }

    /* JADX INFO: renamed from: dotProduct-5P9i7ZU, reason: not valid java name */
    public static final float m103557dotProduct5P9i7ZU(long j11, float f11, float f12) {
        return (m103562getXDnnuFBc(j11) * f11) + (m103563getYDnnuFBc(j11) * f12);
    }

    /* JADX INFO: renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m103558dotProductybeJwSQ(long j11, long j12) {
        return (m103562getXDnnuFBc(j11) * m103562getXDnnuFBc(j12)) + (m103563getYDnnuFBc(j11) * m103563getYDnnuFBc(j12));
    }

    /* JADX INFO: renamed from: getDirection-DnnuFBc, reason: not valid java name */
    public static final long m103559getDirectionDnnuFBc(long j11) {
        float fM103560getDistanceDnnuFBc = m103560getDistanceDnnuFBc(j11);
        if (fM103560getDistanceDnnuFBc > 0.0f) {
            return m103556divso9K2fw(j11, fM103560getDistanceDnnuFBc);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    /* JADX INFO: renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m103560getDistanceDnnuFBc(long j11) {
        return (float) Math.sqrt((m103562getXDnnuFBc(j11) * m103562getXDnnuFBc(j11)) + (m103563getYDnnuFBc(j11) * m103563getYDnnuFBc(j11)));
    }

    /* JADX INFO: renamed from: getDistanceSquared-DnnuFBc, reason: not valid java name */
    public static final float m103561getDistanceSquaredDnnuFBc(long j11) {
        return (m103562getXDnnuFBc(j11) * m103562getXDnnuFBc(j11)) + (m103563getYDnnuFBc(j11) * m103563getYDnnuFBc(j11));
    }

    /* JADX INFO: renamed from: interpolate-dLqxh1s, reason: not valid java name */
    public static final long m103564interpolatedLqxh1s(long j11, long j12, float f11) {
        return FloatFloatPair.m103448constructorimpl(Utils.interpolate(m103562getXDnnuFBc(j11), m103562getXDnnuFBc(j12), f11), Utils.interpolate(m103563getYDnnuFBc(j11), m103563getYDnnuFBc(j12), f11));
    }

    /* JADX INFO: renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m103565minusybeJwSQ(long j11, long j12) {
        return FloatFloatPair.m103448constructorimpl(m103562getXDnnuFBc(j11) - m103562getXDnnuFBc(j12), m103563getYDnnuFBc(j11) - m103563getYDnnuFBc(j12));
    }

    /* JADX INFO: renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m103566plusybeJwSQ(long j11, long j12) {
        return FloatFloatPair.m103448constructorimpl(m103562getXDnnuFBc(j11) + m103562getXDnnuFBc(j12), m103563getYDnnuFBc(j11) + m103563getYDnnuFBc(j12));
    }

    /* JADX INFO: renamed from: rem-so9K2fw, reason: not valid java name */
    public static final long m103567remso9K2fw(long j11, float f11) {
        return FloatFloatPair.m103448constructorimpl(m103562getXDnnuFBc(j11) % f11, m103563getYDnnuFBc(j11) % f11);
    }

    /* JADX INFO: renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m103568timesso9K2fw(long j11, float f11) {
        return FloatFloatPair.m103448constructorimpl(m103562getXDnnuFBc(j11) * f11, m103563getYDnnuFBc(j11) * f11);
    }

    /* JADX INFO: renamed from: unaryMinus-DnnuFBc, reason: not valid java name */
    public static final long m103570unaryMinusDnnuFBc(long j11) {
        return FloatFloatPair.m103448constructorimpl(-m103562getXDnnuFBc(j11), -m103563getYDnnuFBc(j11));
    }

    /* JADX INFO: renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m103563getYDnnuFBc(long j11) {
        return Float.intBitsToFloat((int) (j11 & KeyboardMap.kValueMask));
    }
}
