package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Cubic.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 ?2\u00020\u0001:\u0001?B7\b\u0010\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\bB\u0011\b\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ!\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\rH\u0086\u0002J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0086\u0002J\u0013\u0010)\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010+\u001a\u00020(H\u0016J\u0011\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0086\u0002J!\u0010.\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010/\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0006\u00102\u001a\u00020\u0000J\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000042\u0006\u0010/\u001a\u00020\rJ\u0011\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\rH\u0086\u0002J\u0011\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0086\u0002J\b\u00106\u001a\u000207H\u0016J\u000e\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\rH\u0002J\r\u0010=\u001a\u00020$H\u0000¢\u0006\u0002\b>R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000fR\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m90084d2 = {"Landroidx/graphics/shapes/Cubic;", "", "anchor0", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "control0", "control1", "anchor1", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "points", "", "([F)V", "anchor0X", "", "getAnchor0X", "()F", "anchor0Y", "getAnchor0Y", "anchor1X", "getAnchor1X", "anchor1Y", "getAnchor1Y", "control0X", "getControl0X", "control0Y", "getControl0Y", "control1X", "getControl1X", "control1Y", "getControl1Y", "getPoints$graphics_shapes_release", "()[F", "calculateBounds", "", "bounds", "approximate", "", "calculateBounds$graphics_shapes_release", TtmlNode.TAG_DIV, "x", "", "equals", "other", "hashCode", "plus", "o", "pointOnCurve", "t", "pointOnCurve-OOQOV4g$graphics_shapes_release", "(F)J", "reverse", "split", "Lkotlin/Pair;", "times", "toString", "", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "zeroIsh", "value", "zeroLength", "zeroLength$graphics_shapes_release", "Companion", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCubic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cubic.kt\nandroidx/graphics/shapes/Cubic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n1#2:449\n*E\n"})
public class Cubic {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final float[] points;

    /* JADX INFO: compiled from: Cubic.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J(\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¨\u0006\r"}, m90084d2 = {"Landroidx/graphics/shapes/Cubic$Companion;", "", "()V", "circularArc", "Landroidx/graphics/shapes/Cubic;", "centerX", "", "centerY", "x0", "y0", "x1", "y1", "straightLine", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Cubic circularArc(float centerX, float centerY, float x11, float y11, float x12, float y12) {
            float f11 = x11 - centerX;
            float f12 = y11 - centerY;
            long jDirectionVector = Utils.directionVector(f11, f12);
            float f13 = x12 - centerX;
            float f14 = y12 - centerY;
            long jDirectionVector2 = Utils.directionVector(f13, f14);
            long jM103583rotate90DnnuFBc = Utils.m103583rotate90DnnuFBc(jDirectionVector);
            long jM103583rotate90DnnuFBc2 = Utils.m103583rotate90DnnuFBc(jDirectionVector2);
            boolean z11 = PointKt.m103557dotProduct5P9i7ZU(jM103583rotate90DnnuFBc, f13, f14) >= 0.0f;
            float fM103558dotProductybeJwSQ = PointKt.m103558dotProductybeJwSQ(jDirectionVector, jDirectionVector2);
            if (fM103558dotProductybeJwSQ > 0.999f) {
                return straightLine(x11, y11, x12, y12);
            }
            float f15 = 1;
            float f16 = f15 - fM103558dotProductybeJwSQ;
            float fDistance = ((((Utils.distance(f11, f12) * 4.0f) / 3.0f) * (((float) Math.sqrt(2 * f16)) - ((float) Math.sqrt(f15 - (fM103558dotProductybeJwSQ * fM103558dotProductybeJwSQ))))) / f16) * (z11 ? 1.0f : -1.0f);
            return CubicKt.Cubic(x11, y11, x11 + (PointKt.m103562getXDnnuFBc(jM103583rotate90DnnuFBc) * fDistance), y11 + (PointKt.m103563getYDnnuFBc(jM103583rotate90DnnuFBc) * fDistance), x12 - (PointKt.m103562getXDnnuFBc(jM103583rotate90DnnuFBc2) * fDistance), y12 - (PointKt.m103563getYDnnuFBc(jM103583rotate90DnnuFBc2) * fDistance), x12, y12);
        }

        @JvmStatic
        @NotNull
        public final Cubic straightLine(float x11, float y11, float x12, float y12) {
            return CubicKt.Cubic(x11, y11, Utils.interpolate(x11, x12, 0.33333334f), Utils.interpolate(y11, y12, 0.33333334f), Utils.interpolate(x11, x12, 0.6666667f), Utils.interpolate(y11, y12, 0.6666667f), x12, y12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cubic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Cubic div(float x11) {
        return times(1.0f / x11);
    }

    /* JADX INFO: renamed from: pointOnCurve-OOQOV4g$graphics_shapes_release, reason: not valid java name */
    public final long m103550pointOnCurveOOQOV4g$graphics_shapes_release(float t11) {
        float f11 = 1 - t11;
        float f12 = f11 * f11 * f11;
        float f13 = 3 * t11;
        float f14 = f13 * f11 * f11;
        float f15 = f13 * t11 * f11;
        float f16 = t11 * t11 * t11;
        return FloatFloatPair.m103448constructorimpl((getAnchor0X() * f12) + (getControl0X() * f14) + (getControl1X() * f15) + (getAnchor1X() * f16), (getAnchor0Y() * f12) + (getControl0Y() * f14) + (getControl1Y() * f15) + (getAnchor1Y() * f16));
    }

    @NotNull
    public final Pair<Cubic, Cubic> split(float t11) {
        float f11 = 1 - t11;
        long jM103550pointOnCurveOOQOV4g$graphics_shapes_release = m103550pointOnCurveOOQOV4g$graphics_shapes_release(t11);
        float f12 = f11 * f11;
        float f13 = 2 * f11 * t11;
        float f14 = t11 * t11;
        return TuplesKt.m90091to(CubicKt.Cubic(getAnchor0X(), getAnchor0Y(), (getAnchor0X() * f11) + (getControl0X() * t11), (getAnchor0Y() * f11) + (getControl0Y() * t11), (getAnchor0X() * f12) + (getControl0X() * f13) + (getControl1X() * f14), (getAnchor0Y() * f12) + (getControl0Y() * f13) + (getControl1Y() * f14), PointKt.m103562getXDnnuFBc(jM103550pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m103563getYDnnuFBc(jM103550pointOnCurveOOQOV4g$graphics_shapes_release)), CubicKt.Cubic(PointKt.m103562getXDnnuFBc(jM103550pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m103563getYDnnuFBc(jM103550pointOnCurveOOQOV4g$graphics_shapes_release), (getControl0X() * f12) + (getControl1X() * f13) + (getAnchor1X() * f14), (getControl0Y() * f12) + (getControl1Y() * f13) + (getAnchor1Y() * f14), (getControl1X() * f11) + (getAnchor1X() * t11), (getControl1Y() * f11) + (getAnchor1Y() * t11), getAnchor1X(), getAnchor1Y()));
    }

    @NotNull
    public final Cubic times(float x11) {
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = this.points[i11] * x11;
        }
        return new Cubic(fArr);
    }

    public /* synthetic */ Cubic(long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14);
    }

    public static /* synthetic */ void calculateBounds$graphics_shapes_release$default(Cubic cubic, float[] fArr, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateBounds");
        }
        if ((i11 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cubic.calculateBounds$graphics_shapes_release(fArr, z11);
    }

    @JvmStatic
    @NotNull
    public static final Cubic circularArc(float f11, float f12, float f13, float f14, float f15, float f16) {
        return INSTANCE.circularArc(f11, f12, f13, f14, f15, f16);
    }

    @JvmStatic
    @NotNull
    public static final Cubic straightLine(float f11, float f12, float f13, float f14) {
        return INSTANCE.straightLine(f11, f12, f13, f14);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c9 A[PHI: r3 r7
      0x01c9: PHI (r3v15 float) = (r3v12 float), (r3v21 float) binds: [B:85:0x0218, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r7v14 float) = (r7v10 float), (r7v16 float) binds: [B:85:0x0218, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b A[PHI: r9 r15
      0x021b: PHI (r9v5 float) = (r9v2 float), (r9v3 float), (r9v3 float), (r9v2 float), (r9v2 float), (r9v2 float) binds: [B:65:0x01d2, B:77:0x0201, B:79:0x0205, B:51:0x01a6, B:54:0x01b0, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r15v13 float) = (r15v9 float), (r15v10 float), (r15v10 float), (r15v9 float), (r15v9 float), (r15v9 float) binds: [B:65:0x01d2, B:77:0x0201, B:79:0x0205, B:51:0x01a6, B:54:0x01b0, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    public final void calculateBounds$graphics_shapes_release(@NotNull float[] bounds, boolean approximate) {
        char c11;
        char c12;
        char c13;
        float f11;
        float control0Y;
        float anchor0Y;
        float control0Y2;
        float f12;
        float fSqrt;
        float fSqrt2;
        float fM103563getYDnnuFBc;
        float f13;
        float fM103563getYDnnuFBc2;
        float f14;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (zeroLength$graphics_shapes_release()) {
            bounds[0] = getAnchor0X();
            bounds[1] = getAnchor0Y();
            bounds[2] = getAnchor0X();
            bounds[3] = getAnchor0Y();
            return;
        }
        float fMin = Math.min(getAnchor0X(), getAnchor1X());
        float fMin2 = Math.min(getAnchor0Y(), getAnchor1Y());
        float fMax = Math.max(getAnchor0X(), getAnchor1X());
        float fMax2 = Math.max(getAnchor0Y(), getAnchor1Y());
        if (approximate) {
            bounds[0] = Math.min(fMin, Math.min(getControl0X(), getControl1X()));
            bounds[1] = Math.min(fMin2, Math.min(getControl0Y(), getControl1Y()));
            bounds[2] = Math.max(fMax, Math.max(getControl0X(), getControl1X()));
            bounds[3] = Math.max(fMax2, Math.max(getControl0Y(), getControl1Y()));
            return;
        }
        float f15 = 3;
        float control0X = (((-getAnchor0X()) + (getControl0X() * f15)) - (getControl1X() * f15)) + getAnchor1X();
        float f16 = 2;
        float f17 = 4;
        float anchor0X = ((getAnchor0X() * f16) - (getControl0X() * f17)) + (getControl1X() * f16);
        float control0X2 = (-getAnchor0X()) + getControl0X();
        if (!zeroIsh(control0X)) {
            float f18 = (anchor0X * anchor0X) - ((f17 * control0X) * control0X2);
            if (f18 >= 0.0f) {
                float f19 = -anchor0X;
                c11 = 0;
                c12 = 3;
                double d11 = f18;
                c13 = 2;
                f11 = fMin2;
                float f21 = control0X * f16;
                float fSqrt3 = (((float) Math.sqrt(d11)) + f19) / f21;
                if (0.0f <= fSqrt3 && fSqrt3 <= 1.0f) {
                    float fM103562getXDnnuFBc = PointKt.m103562getXDnnuFBc(m103550pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt3));
                    if (fM103562getXDnnuFBc < fMin) {
                        fMin = fM103562getXDnnuFBc;
                    }
                    if (fM103562getXDnnuFBc > fMax) {
                        fMax = fM103562getXDnnuFBc;
                    }
                }
                float fSqrt4 = (f19 - ((float) Math.sqrt(d11))) / f21;
                if (0.0f <= fSqrt4 && fSqrt4 <= 1.0f) {
                    float fM103562getXDnnuFBc2 = PointKt.m103562getXDnnuFBc(m103550pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt4));
                    if (fM103562getXDnnuFBc2 < fMin) {
                        fMin = fM103562getXDnnuFBc2;
                    }
                    if (fM103562getXDnnuFBc2 > fMax) {
                        fMax = fM103562getXDnnuFBc2;
                    }
                }
            }
            control0Y = (((-getAnchor0Y()) + (getControl0Y() * f15)) - (f15 * getControl1Y())) + getAnchor1Y();
            anchor0Y = ((getAnchor0Y() * f16) - (getControl0Y() * f17)) + (getControl1Y() * f16);
            control0Y2 = (-getAnchor0Y()) + getControl0Y();
            if (zeroIsh(control0Y)) {
                f12 = (anchor0Y * anchor0Y) - ((f17 * control0Y) * control0Y2);
                if (f12 >= 0.0f) {
                    float f22 = -anchor0Y;
                    double d12 = f12;
                    float f23 = f16 * control0Y;
                    fSqrt = (((float) Math.sqrt(d12)) + f22) / f23;
                    if (0.0f <= fSqrt && fSqrt <= 1.0f) {
                        fM103563getYDnnuFBc2 = PointKt.m103563getYDnnuFBc(m103550pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt));
                        if (fM103563getYDnnuFBc2 < f11) {
                            f11 = fM103563getYDnnuFBc2;
                        }
                        if (fM103563getYDnnuFBc2 > fMax2) {
                            fMax2 = fM103563getYDnnuFBc2;
                        }
                    }
                    fSqrt2 = (f22 - ((float) Math.sqrt(d12))) / f23;
                    if (0.0f <= fSqrt2 || fSqrt2 > 1.0f) {
                        f13 = f11;
                    } else {
                        fM103563getYDnnuFBc = PointKt.m103563getYDnnuFBc(m103550pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt2));
                        f13 = fM103563getYDnnuFBc < f11 ? fM103563getYDnnuFBc : f11;
                        if (fM103563getYDnnuFBc > fMax2) {
                            fMax2 = fM103563getYDnnuFBc;
                        }
                    }
                } else {
                    f13 = f11;
                }
            } else if (anchor0Y == 0.0f) {
                f13 = f11;
            } else {
                f14 = (f16 * control0Y2) / ((-2) * anchor0Y);
                if (0.0f <= f14 || f14 > 1.0f) {
                    f13 = f11;
                } else {
                    fM103563getYDnnuFBc = PointKt.m103563getYDnnuFBc(m103550pointOnCurveOOQOV4g$graphics_shapes_release(f14));
                    f13 = fM103563getYDnnuFBc < f11 ? fM103563getYDnnuFBc : f11;
                    if (fM103563getYDnnuFBc > fMax2) {
                        fMax2 = fM103563getYDnnuFBc;
                    }
                }
            }
            bounds[c11] = fMin;
            bounds[1] = f13;
            bounds[c13] = fMax;
            bounds[c12] = fMax2;
        }
        if (anchor0X != 0.0f) {
            float f24 = (control0X2 * f16) / ((-2) * anchor0X);
            if (0.0f <= f24 && f24 <= 1.0f) {
                float fM103562getXDnnuFBc3 = PointKt.m103562getXDnnuFBc(m103550pointOnCurveOOQOV4g$graphics_shapes_release(f24));
                if (fM103562getXDnnuFBc3 < fMin) {
                    fMin = fM103562getXDnnuFBc3;
                }
                if (fM103562getXDnnuFBc3 > fMax) {
                    fMax = fM103562getXDnnuFBc3;
                }
            }
        }
        c11 = 0;
        c12 = 3;
        c13 = 2;
        f11 = fMin2;
        control0Y = (((-getAnchor0Y()) + (getControl0Y() * f15)) - (f15 * getControl1Y())) + getAnchor1Y();
        anchor0Y = ((getAnchor0Y() * f16) - (getControl0Y() * f17)) + (getControl1Y() * f16);
        control0Y2 = (-getAnchor0Y()) + getControl0Y();
        if (zeroIsh(control0Y)) {
            f12 = (anchor0Y * anchor0Y) - ((f17 * control0Y) * control0Y2);
            if (f12 >= 0.0f) {
                float f25 = -anchor0Y;
                double d13 = f12;
                float f26 = f16 * control0Y;
                fSqrt = (((float) Math.sqrt(d13)) + f25) / f26;
                if (0.0f <= fSqrt) {
                    fM103563getYDnnuFBc2 = PointKt.m103563getYDnnuFBc(m103550pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt));
                    if (fM103563getYDnnuFBc2 < f11) {
                        f11 = fM103563getYDnnuFBc2;
                    }
                    if (fM103563getYDnnuFBc2 > fMax2) {
                        fMax2 = fM103563getYDnnuFBc2;
                    }
                }
                fSqrt2 = (f25 - ((float) Math.sqrt(d13))) / f26;
                if (0.0f <= fSqrt2) {
                    f13 = f11;
                } else {
                    f13 = f11;
                }
            } else {
                f13 = f11;
            }
        } else if (anchor0Y == 0.0f) {
            f13 = f11;
        } else {
            f14 = (f16 * control0Y2) / ((-2) * anchor0Y);
            if (0.0f <= f14) {
                f13 = f11;
            } else {
                f13 = f11;
            }
        }
        bounds[c11] = fMin;
        bounds[1] = f13;
        bounds[c13] = fMax;
        bounds[c12] = fMax2;
    }

    @NotNull
    public final Cubic div(int x11) {
        return div(x11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Cubic) {
            return Arrays.equals(this.points, ((Cubic) other).points);
        }
        return false;
    }

    public final float getAnchor0X() {
        return this.points[0];
    }

    public final float getAnchor0Y() {
        return this.points[1];
    }

    public final float getAnchor1X() {
        return this.points[6];
    }

    public final float getAnchor1Y() {
        return this.points[7];
    }

    public final float getControl0X() {
        return this.points[2];
    }

    public final float getControl0Y() {
        return this.points[3];
    }

    public final float getControl1X() {
        return this.points[4];
    }

    public final float getControl1Y() {
        return this.points[5];
    }

    @NotNull
    /* JADX INFO: renamed from: getPoints$graphics_shapes_release, reason: from getter */
    public final float[] getPoints() {
        return this.points;
    }

    public int hashCode() {
        return Arrays.hashCode(this.points);
    }

    @NotNull
    public final Cubic plus(@NotNull Cubic o11) {
        Intrinsics.checkNotNullParameter(o11, "o");
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = this.points[i11] + o11.points[i11];
        }
        return new Cubic(fArr);
    }

    @NotNull
    public final Cubic times(int x11) {
        return times(x11);
    }

    @NotNull
    public String toString() {
        return "anchor0: (" + getAnchor0X() + ", " + getAnchor0Y() + ") control0: (" + getControl0X() + ", " + getControl0Y() + "), control1: (" + getControl1X() + ", " + getControl1Y() + "), anchor1: (" + getAnchor1X() + ", " + getAnchor1Y() + ')';
    }

    @NotNull
    public final Cubic transformed(@NotNull PointTransformer f11) {
        Intrinsics.checkNotNullParameter(f11, "f");
        MutableCubic mutableCubic = new MutableCubic();
        ArraysKt.copyInto$default(this.points, mutableCubic.getPoints(), 0, 0, 0, 14, (Object) null);
        mutableCubic.transform(f11);
        return mutableCubic;
    }

    public Cubic(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.points = points;
        if (points.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    private final boolean zeroIsh(float value) {
        if (Math.abs(value) < 1.0E-4f) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Cubic reverse() {
        return CubicKt.Cubic(getAnchor1X(), getAnchor1Y(), getControl1X(), getControl1Y(), getControl0X(), getControl0Y(), getAnchor0X(), getAnchor0Y());
    }

    public final boolean zeroLength$graphics_shapes_release() {
        if (Math.abs(getAnchor0X() - getAnchor1X()) < 1.0E-4f && Math.abs(getAnchor0Y() - getAnchor1Y()) < 1.0E-4f) {
            return true;
        }
        return false;
    }

    public /* synthetic */ Cubic(float[] fArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new float[8] : fArr);
    }

    private Cubic(long j11, long j12, long j13, long j14) {
        this(new float[]{PointKt.m103562getXDnnuFBc(j11), PointKt.m103563getYDnnuFBc(j11), PointKt.m103562getXDnnuFBc(j12), PointKt.m103563getYDnnuFBc(j12), PointKt.m103562getXDnnuFBc(j13), PointKt.m103563getYDnnuFBc(j13), PointKt.m103562getXDnnuFBc(j14), PointKt.m103563getYDnnuFBc(j14)});
    }
}
