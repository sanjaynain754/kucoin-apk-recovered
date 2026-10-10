package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RoundedPolygon.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B5\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0002Jf\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\n\u0010-\u001a\u00060\u0003j\u0002`\u00042\n\u0010.\u001a\u00060\u0003j\u0002`\u00042\n\u0010/\u001a\u00060\u0003j\u0002`\u00042\n\u00100\u001a\u00060\u0003j\u0002`\u00042\n\u00101\u001a\u00060\u0003j\u0002`\u00042\u0006\u00102\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104J \u00105\u001a\b\u0012\u0004\u0012\u00020*062\u0006\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u00020\u0011H\u0007JJ\u00109\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\u0010:\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<R&\u0010\n\u001a\u00060\u0003j\u0002`\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0019\u0010\fR\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001d\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001e\u0010\fR\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001f\u0010\fR\u001d\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b \u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R\u0011\u0010%\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, m90084d2 = {"Landroidx/graphics/shapes/RoundedCorner;", "", "p0", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "p1", "p2", "rounding", "Landroidx/graphics/shapes/CornerRounding;", "(JJJLandroidx/graphics/shapes/CornerRounding;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", TtmlNode.CENTER, "getCenter-1ufDz9w", "()J", "setCenter-DnnuFBc", "(J)V", "J", "cornerRadius", "", "getCornerRadius", "()F", "cosAngle", "getCosAngle", "d1", "getD1-1ufDz9w", "d2", "getD2-1ufDz9w", "expectedCut", "getExpectedCut", "expectedRoundCut", "getExpectedRoundCut", "getP0-1ufDz9w", "getP1-1ufDz9w", "getP2-1ufDz9w", "getRounding", "()Landroidx/graphics/shapes/CornerRounding;", "sinAngle", "getSinAngle", "smoothing", "getSmoothing", "calculateActualSmoothingValue", "allowedCut", "computeFlankingCurve", "Landroidx/graphics/shapes/Cubic;", "actualRoundCut", "actualSmoothingValues", "corner", "sideStart", "circleSegmentIntersection", "otherCircleSegmentIntersection", "circleCenter", "actualR", "computeFlankingCurve-oAJzIJU", "(FFJJJJJF)Landroidx/graphics/shapes/Cubic;", "getCubics", "", "allowedCut0", "allowedCut1", "lineIntersection", "d0", "lineIntersection-CBFvKDc", "(JJJJ)Landroidx/collection/FloatFloatPair;", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
final class RoundedCorner {
    private long center;
    private final float cornerRadius;
    private final float cosAngle;
    private final long d1;
    private final long d2;
    private final float expectedRoundCut;
    private final long p0;
    private final long p1;
    private final long p2;

    @Nullable
    private final CornerRounding rounding;
    private final float sinAngle;
    private final float smoothing;

    public /* synthetic */ RoundedCorner(long j11, long j12, long j13, CornerRounding cornerRounding, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, cornerRounding);
    }

    @JvmOverloads
    @NotNull
    public final List<Cubic> getCubics(float f11) {
        return getCubics$default(this, f11, 0.0f, 2, null);
    }

    public final float getExpectedCut() {
        return (1 + this.smoothing) * this.expectedRoundCut;
    }

    private RoundedCorner(long j11, long j12, long j13, CornerRounding cornerRounding) {
        this.p0 = j11;
        this.p1 = j12;
        this.p2 = j13;
        this.rounding = cornerRounding;
        long jM103559getDirectionDnnuFBc = PointKt.m103559getDirectionDnnuFBc(PointKt.m103565minusybeJwSQ(j11, j12));
        this.d1 = jM103559getDirectionDnnuFBc;
        long jM103559getDirectionDnnuFBc2 = PointKt.m103559getDirectionDnnuFBc(PointKt.m103565minusybeJwSQ(j13, j12));
        this.d2 = jM103559getDirectionDnnuFBc2;
        float radius = cornerRounding != null ? cornerRounding.getRadius() : 0.0f;
        this.cornerRadius = radius;
        this.smoothing = cornerRounding != null ? cornerRounding.getSmoothing() : 0.0f;
        float fM103558dotProductybeJwSQ = PointKt.m103558dotProductybeJwSQ(jM103559getDirectionDnnuFBc, jM103559getDirectionDnnuFBc2);
        this.cosAngle = fM103558dotProductybeJwSQ;
        float f11 = 1;
        float fSqrt = (float) Math.sqrt(f11 - Utils.square(fM103558dotProductybeJwSQ));
        this.sinAngle = fSqrt;
        this.expectedRoundCut = ((double) fSqrt) > 0.001d ? (radius * (fM103558dotProductybeJwSQ + f11)) / fSqrt : 0.0f;
        this.center = FloatFloatPair.m103448constructorimpl(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: computeFlankingCurve-oAJzIJU, reason: not valid java name */
    private final Cubic m103572computeFlankingCurveoAJzIJU(float actualRoundCut, float actualSmoothingValues, long corner, long sideStart, long circleSegmentIntersection, long otherCircleSegmentIntersection, long circleCenter, float actualR) {
        long jM103559getDirectionDnnuFBc = PointKt.m103559getDirectionDnnuFBc(PointKt.m103565minusybeJwSQ(sideStart, corner));
        long jM103566plusybeJwSQ = PointKt.m103566plusybeJwSQ(corner, PointKt.m103568timesso9K2fw(PointKt.m103568timesso9K2fw(jM103559getDirectionDnnuFBc, actualRoundCut), 1 + actualSmoothingValues));
        long packedValue = circleSegmentIntersection;
        long jM103564interpolatedLqxh1s = PointKt.m103564interpolatedLqxh1s(packedValue, PointKt.m103556divso9K2fw(PointKt.m103566plusybeJwSQ(circleSegmentIntersection, otherCircleSegmentIntersection), 2.0f), actualSmoothingValues);
        long jM103566plusybeJwSQ2 = PointKt.m103566plusybeJwSQ(circleCenter, PointKt.m103568timesso9K2fw(Utils.directionVector(PointKt.m103562getXDnnuFBc(jM103564interpolatedLqxh1s) - PointKt.m103562getXDnnuFBc(circleCenter), PointKt.m103563getYDnnuFBc(jM103564interpolatedLqxh1s) - PointKt.m103563getYDnnuFBc(circleCenter)), actualR));
        FloatFloatPair floatFloatPairM103573lineIntersectionCBFvKDc = m103573lineIntersectionCBFvKDc(sideStart, jM103559getDirectionDnnuFBc, jM103566plusybeJwSQ2, Utils.m103583rotate90DnnuFBc(PointKt.m103565minusybeJwSQ(jM103566plusybeJwSQ2, circleCenter)));
        if (floatFloatPairM103573lineIntersectionCBFvKDc != null) {
            packedValue = floatFloatPairM103573lineIntersectionCBFvKDc.getPackedValue();
        }
        return new Cubic(jM103566plusybeJwSQ, PointKt.m103556divso9K2fw(PointKt.m103566plusybeJwSQ(jM103566plusybeJwSQ, PointKt.m103568timesso9K2fw(packedValue, 2.0f)), 3.0f), packedValue, jM103566plusybeJwSQ2, null);
    }

    public static /* synthetic */ List getCubics$default(RoundedCorner roundedCorner, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = f11;
        }
        return roundedCorner.getCubics(f11, f12);
    }

    /* JADX INFO: renamed from: getCenter-1ufDz9w, reason: not valid java name and from getter */
    public final long getCenter() {
        return this.center;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getCosAngle() {
        return this.cosAngle;
    }

    @JvmOverloads
    @NotNull
    public final List<Cubic> getCubics(float allowedCut0, float allowedCut1) {
        float fMin = Math.min(allowedCut0, allowedCut1);
        float f11 = this.expectedRoundCut;
        if (f11 < 1.0E-4f || fMin < 1.0E-4f || this.cornerRadius < 1.0E-4f) {
            long j11 = this.p1;
            this.center = j11;
            return CollectionsKt.listOf(Cubic.INSTANCE.straightLine(PointKt.m103562getXDnnuFBc(j11), PointKt.m103563getYDnnuFBc(this.p1), PointKt.m103562getXDnnuFBc(this.p1), PointKt.m103563getYDnnuFBc(this.p1)));
        }
        float fMin2 = Math.min(fMin, f11);
        float fCalculateActualSmoothingValue = calculateActualSmoothingValue(allowedCut0);
        float fCalculateActualSmoothingValue2 = calculateActualSmoothingValue(allowedCut1);
        float f12 = (this.cornerRadius * fMin2) / this.expectedRoundCut;
        this.center = PointKt.m103566plusybeJwSQ(this.p1, PointKt.m103568timesso9K2fw(PointKt.m103559getDirectionDnnuFBc(PointKt.m103556divso9K2fw(PointKt.m103566plusybeJwSQ(this.d1, this.d2), 2.0f)), (float) Math.sqrt(Utils.square(f12) + Utils.square(fMin2))));
        long jM103566plusybeJwSQ = PointKt.m103566plusybeJwSQ(this.p1, PointKt.m103568timesso9K2fw(this.d1, fMin2));
        long jM103566plusybeJwSQ2 = PointKt.m103566plusybeJwSQ(this.p1, PointKt.m103568timesso9K2fw(this.d2, fMin2));
        Cubic cubicM103572computeFlankingCurveoAJzIJU = m103572computeFlankingCurveoAJzIJU(fMin2, fCalculateActualSmoothingValue, this.p1, this.p0, jM103566plusybeJwSQ, jM103566plusybeJwSQ2, this.center, f12);
        Cubic cubicReverse = m103572computeFlankingCurveoAJzIJU(fMin2, fCalculateActualSmoothingValue2, this.p1, this.p2, jM103566plusybeJwSQ2, jM103566plusybeJwSQ, this.center, f12).reverse();
        return CollectionsKt.listOf((Object[]) new Cubic[]{cubicM103572computeFlankingCurveoAJzIJU, Cubic.INSTANCE.circularArc(PointKt.m103562getXDnnuFBc(this.center), PointKt.m103563getYDnnuFBc(this.center), cubicM103572computeFlankingCurveoAJzIJU.getAnchor1X(), cubicM103572computeFlankingCurveoAJzIJU.getAnchor1Y(), cubicReverse.getAnchor0X(), cubicReverse.getAnchor0Y()), cubicReverse});
    }

    /* JADX INFO: renamed from: getD1-1ufDz9w, reason: not valid java name and from getter */
    public final long getD1() {
        return this.d1;
    }

    /* JADX INFO: renamed from: getD2-1ufDz9w, reason: not valid java name and from getter */
    public final long getD2() {
        return this.d2;
    }

    public final float getExpectedRoundCut() {
        return this.expectedRoundCut;
    }

    /* JADX INFO: renamed from: getP0-1ufDz9w, reason: not valid java name and from getter */
    public final long getP0() {
        return this.p0;
    }

    /* JADX INFO: renamed from: getP1-1ufDz9w, reason: not valid java name and from getter */
    public final long getP1() {
        return this.p1;
    }

    /* JADX INFO: renamed from: getP2-1ufDz9w, reason: not valid java name and from getter */
    public final long getP2() {
        return this.p2;
    }

    @Nullable
    public final CornerRounding getRounding() {
        return this.rounding;
    }

    public final float getSinAngle() {
        return this.sinAngle;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    /* JADX INFO: renamed from: setCenter-DnnuFBc, reason: not valid java name */
    public final void m103580setCenterDnnuFBc(long j11) {
        this.center = j11;
    }

    private final float calculateActualSmoothingValue(float allowedCut) {
        if (allowedCut > getExpectedCut()) {
            return this.smoothing;
        }
        float f11 = this.expectedRoundCut;
        if (allowedCut > f11) {
            return (this.smoothing * (allowedCut - f11)) / (getExpectedCut() - this.expectedRoundCut);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: lineIntersection-CBFvKDc, reason: not valid java name */
    private final FloatFloatPair m103573lineIntersectionCBFvKDc(long p11, long d11, long p12, long d12) {
        long jM103583rotate90DnnuFBc = Utils.m103583rotate90DnnuFBc(d12);
        float fM103558dotProductybeJwSQ = PointKt.m103558dotProductybeJwSQ(d11, jM103583rotate90DnnuFBc);
        if (Math.abs(fM103558dotProductybeJwSQ) < 1.0E-4f) {
            return null;
        }
        float fM103558dotProductybeJwSQ2 = PointKt.m103558dotProductybeJwSQ(PointKt.m103565minusybeJwSQ(p12, p11), jM103583rotate90DnnuFBc);
        if (Math.abs(fM103558dotProductybeJwSQ) < Math.abs(fM103558dotProductybeJwSQ2) * 1.0E-4f) {
            return null;
        }
        return FloatFloatPair.m103445boximpl(PointKt.m103566plusybeJwSQ(p11, PointKt.m103568timesso9K2fw(d11, fM103558dotProductybeJwSQ2 / fM103558dotProductybeJwSQ)));
    }

    public /* synthetic */ RoundedCorner(long j11, long j12, long j13, CornerRounding cornerRounding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, (i11 & 8) != 0 ? null : cornerRounding, null);
    }
}
