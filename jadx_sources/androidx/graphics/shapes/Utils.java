package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.jumio.liveness.DaClient;
import com.p059BV.LinearGradient.LinearGradientManager;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0080\bø\u0001\u0000\u001a\u0019\u0010\u0019\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001b\u001a!\u0010\u0019\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001c\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a*\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0000\u001a \u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0000\u001a\u0018\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0001H\u0000\u001a4\u0010,\u001a\u00060\u000bj\u0002`\f2\u0006\u0010-\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\f\b\u0002\u0010.\u001a\u00060\u000bj\u0002`\fH\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a\u0010\u00101\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u001e\u00102\u001a\u00060\u000bj\u0002`\f*\u00060\u000bj\u0002`\fH\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u001a\u0010\n\u001a\u00060\u000bj\u0002`\fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000e\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u00065"}, m90084d2 = {"AngleEpsilon", "", "DEBUG", "", "DistanceEpsilon", "FloatPi", "getFloatPi", "()F", "TwoPi", "getTwoPi", "Zero", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "getZero", "()J", "J", LinearGradientManager.PROP_ANGLE, "x", "y", "debugLog", "", "tag", "", "messageFactory", "Lkotlin/Function0;", "directionVector", "angleRadians", "(F)J", "(FF)J", DaClient.ATTR_DISTANCE, "distanceSquared", "findMinimum", "v0", "v1", "tolerance", "f", "Landroidx/graphics/shapes/FindMinimumFunction;", "interpolate", "start", InterfaceC33730j9.f70350a, "fraction", "positiveModulo", "num", "mod", "radialToCartesian", "radius", TtmlNode.CENTER, "radialToCartesian-L6JJ3z0", "(FFJ)J", "square", "rotate90", "rotate90-DnnuFBc", "(J)J", "graphics-shapes_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@JvmName(name = "Utils")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nandroidx/graphics/shapes/Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class Utils {
    public static final float AngleEpsilon = 1.0E-6f;
    public static final boolean DEBUG = false;
    public static final float DistanceEpsilon = 1.0E-4f;
    private static final long Zero = FloatFloatPair.m103448constructorimpl(0.0f, 0.0f);
    private static final float FloatPi = 3.1415927f;
    private static final float TwoPi = 6.2831855f;

    public static final float angle(float f11, float f12) {
        float fAtan2 = (float) Math.atan2(f12, f11);
        float f13 = TwoPi;
        return (fAtan2 + f13) % f13;
    }

    public static final long directionVector(float f11, float f12) {
        float fDistance = distance(f11, f12);
        if (fDistance > 0.0f) {
            return FloatFloatPair.m103448constructorimpl(f11 / fDistance, f12 / fDistance);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float distance(float f11, float f12) {
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    public static final float distanceSquared(float f11, float f12) {
        return (f11 * f11) + (f12 * f12);
    }

    public static final float interpolate(float f11, float f12, float f13) {
        return ((1 - f13) * f11) + (f13 * f12);
    }

    public static final float positiveModulo(float f11, float f12) {
        return ((f11 % f12) + f12) % f12;
    }

    public static final float square(float f11) {
        return f11 * f11;
    }

    public static final float findMinimum(float f11, float f12, float f13, @NotNull FindMinimumFunction f14) {
        Intrinsics.checkNotNullParameter(f14, "f");
        while (f12 - f11 > f13) {
            float f15 = 2;
            float f16 = 3;
            float f17 = ((f15 * f11) + f12) / f16;
            float f18 = ((f15 * f12) + f11) / f16;
            if (f14.invoke(f17) < f14.invoke(f18)) {
                f12 = f18;
            } else {
                f11 = f17;
            }
        }
        return (f11 + f12) / 2;
    }

    public static /* synthetic */ float findMinimum$default(float f11, float f12, float f13, FindMinimumFunction findMinimumFunction, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f13 = 0.001f;
        }
        return findMinimum(f11, f12, f13, findMinimumFunction);
    }

    public static final float getFloatPi() {
        return FloatPi;
    }

    public static final float getTwoPi() {
        return TwoPi;
    }

    public static final long getZero() {
        return Zero;
    }

    /* JADX INFO: renamed from: radialToCartesian-L6JJ3z0$default, reason: not valid java name */
    public static /* synthetic */ long m103582radialToCartesianL6JJ3z0$default(float f11, float f12, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = Zero;
        }
        return m103581radialToCartesianL6JJ3z0(f11, f12, j11);
    }

    public static final void debugLog(@NotNull String tag, @NotNull Function0<String> messageFactory) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageFactory, "messageFactory");
    }

    /* JADX INFO: renamed from: radialToCartesian-L6JJ3z0, reason: not valid java name */
    public static final long m103581radialToCartesianL6JJ3z0(float f11, float f12, long j11) {
        return PointKt.m103566plusybeJwSQ(PointKt.m103568timesso9K2fw(directionVector(f12), f11), j11);
    }

    /* JADX INFO: renamed from: rotate90-DnnuFBc, reason: not valid java name */
    public static final long m103583rotate90DnnuFBc(long j11) {
        return FloatFloatPair.m103448constructorimpl(-PointKt.m103563getYDnnuFBc(j11), PointKt.m103562getXDnnuFBc(j11));
    }

    public static final long directionVector(float f11) {
        double d11 = f11;
        return FloatFloatPair.m103448constructorimpl((float) Math.cos(d11), (float) Math.sin(d11));
    }
}
