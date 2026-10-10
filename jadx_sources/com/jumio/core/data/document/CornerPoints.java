package com.jumio.core.data.document;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CameraUtilsKt;
import com.jumio.commons.camera.Size;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.ClosedFloatingPointRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0/2\u0006\u00100\u001a\u00020\u0000J\u0006\u00101\u001a\u00020'J\u0006\u00102\u001a\u00020'J\u000e\u00103\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u0000J\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030/J\u0006\u00105\u001a\u00020'J.\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020'2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020=J6\u0010>\u001a\u00020+2\u0006\u00107\u001a\u00020'2\u0006\u00108\u001a\u0002092\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000fJ\u001c\u0010C\u001a\u0002092\b\b\u0002\u0010D\u001a\u00020\u000f2\b\b\u0002\u0010E\u001a\u00020\u000fH\u0002J\u0006\u0010F\u001a\u00020'J(\u0010G\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020=0H2\u0006\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020=J \u0010K\u001a\u00020=2\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u0003H\u0002J \u0010O\u001a\u00020=2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000fH\u0002J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J1\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010X\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020+HÖ\u0001J\t\u0010Z\u001a\u00020[HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010 \u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u0011\u0010\"\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0011R\u0011\u0010$\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006\\"}, m90084d2 = {"Lcom/jumio/core/data/document/CornerPoints;", "", "tL", "Landroid/graphics/PointF;", "tR", "bR", "bL", "<init>", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)V", "getTL", "()Landroid/graphics/PointF;", "getTR", "getBR", "getBL", "left", "", "getLeft", "()F", "right", "getRight", ViewProps.TOP, "getTop", ViewProps.BOTTOM, "getBottom", "leftEdge", "getLeftEdge", "topEdge", "getTopEdge", "rightEdge", "getRightEdge", "bottomEdge", "getBottomEdge", "width", "getWidth", "height", "getHeight", ViewProps.ASPECT_RATIO, "getAspectRatio", "idPortrait", "", "getIdPortrait", "()Z", "rotationAngle", "", "getRotationAngle", "()I", "compareTo", "", "other", "isEmpty", "isValid", "averageDistance", "asList", "checkEdgeLength", "compareCornersRelativeToPreview", "isPortrait", "extractionRect", "Landroid/graphics/Rect;", "marginPercentLongSide", "marginPercentShortSide", "minAllowedRatio", "", "compareCornersAbsoluteToPreview", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "minIdSize", "Lcom/jumio/commons/camera/Size;", "generateOutsideBoundingBoxWithMargin", "horizontalMargin", "verticalMargin", "checkInsideAngles", "checkHorizontal", "Lkotlin/Triple;", "rotationTolerance", "rotationThreshold", "calculateSignedAngle", "from", "vertex", TypedValues.TransitionType.S_TO, "calculateAngle", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "component1", "component2", "component3", "component4", "copy", "equals", "hashCode", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCornerPoints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerPoints.kt\ncom/jumio/core/data/document/CornerPoints\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,332:1\n2341#2,14:333\n1734#2,3:347\n1734#2,3:353\n344#3,3:350\n*S KotlinDebug\n*F\n+ 1 CornerPoints.kt\ncom/jumio/core/data/document/CornerPoints\n*L\n61#1:333,14\n73#1:347,3\n253#1:353,3\n237#1:350,3\n*E\n"})
public final /* data */ class CornerPoints {

    /* JADX INFO: renamed from: a */
    public final PointF f13780a;

    /* JADX INFO: renamed from: b */
    public final PointF f13781b;

    /* JADX INFO: renamed from: c */
    public final PointF f13782c;

    /* JADX INFO: renamed from: d */
    public final PointF f13783d;

    /* JADX INFO: renamed from: e */
    public final float f13784e;

    /* JADX INFO: renamed from: f */
    public final float f13785f;

    /* JADX INFO: renamed from: g */
    public final float f13786g;

    /* JADX INFO: renamed from: h */
    public final float f13787h;

    /* JADX INFO: renamed from: i */
    public final float f13788i;

    /* JADX INFO: renamed from: j */
    public final float f13789j;

    /* JADX INFO: renamed from: k */
    public final float f13790k;

    /* JADX INFO: renamed from: l */
    public final float f13791l;

    /* JADX INFO: renamed from: m */
    public final float f13792m;

    /* JADX INFO: renamed from: n */
    public final float f13793n;

    public CornerPoints() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CornerPoints)) {
            return false;
        }
        CornerPoints cornerPoints = (CornerPoints) other;
        return Intrinsics.areEqual(this.f13780a, cornerPoints.f13780a) && Intrinsics.areEqual(this.f13781b, cornerPoints.f13781b) && Intrinsics.areEqual(this.f13782c, cornerPoints.f13782c) && Intrinsics.areEqual(this.f13783d, cornerPoints.f13783d);
    }

    public CornerPoints(@NotNull PointF tL, @NotNull PointF tR, @NotNull PointF bR, @NotNull PointF bL) {
        Intrinsics.checkNotNullParameter(tL, "tL");
        Intrinsics.checkNotNullParameter(tR, "tR");
        Intrinsics.checkNotNullParameter(bR, "bR");
        Intrinsics.checkNotNullParameter(bL, "bL");
        this.f13780a = tL;
        this.f13781b = tR;
        this.f13782c = bR;
        this.f13783d = bL;
        float fMinOf = ComparisonsKt.minOf(tL.x, tR.x, bL.x, bR.x);
        this.f13784e = fMinOf;
        float fMaxOf = ComparisonsKt.maxOf(tL.x, tR.x, bL.x, bR.x);
        this.f13785f = fMaxOf;
        float fMinOf2 = ComparisonsKt.minOf(tL.y, tR.y, bL.y, bR.y);
        this.f13786g = fMinOf2;
        float fMaxOf2 = ComparisonsKt.maxOf(tL.y, tR.y, bL.y, bR.y);
        this.f13787h = fMaxOf2;
        this.f13788i = CornerPointsKt.distanceTo(tL, bL);
        this.f13789j = CornerPointsKt.distanceTo(tL, tR);
        this.f13790k = CornerPointsKt.distanceTo(tR, bR);
        this.f13791l = CornerPointsKt.distanceTo(bL, bR);
        this.f13792m = fMaxOf - fMinOf;
        this.f13793n = fMaxOf2 - fMinOf2;
    }

    public static /* synthetic */ CornerPoints copy$default(CornerPoints cornerPoints, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pointF = cornerPoints.f13780a;
        }
        if ((i11 & 2) != 0) {
            pointF2 = cornerPoints.f13781b;
        }
        if ((i11 & 4) != 0) {
            pointF3 = cornerPoints.f13782c;
        }
        if ((i11 & 8) != 0) {
            pointF4 = cornerPoints.f13783d;
        }
        return cornerPoints.copy(pointF, pointF2, pointF3, pointF4);
    }

    /* JADX INFO: renamed from: a */
    public final Rect m14521a(float f11, float f12) {
        List listListOf = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(this.f13780a.x), Float.valueOf(this.f13783d.x), Float.valueOf(this.f13781b.x), Float.valueOf(this.f13782c.x)});
        List listListOf2 = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(this.f13780a.y), Float.valueOf(this.f13781b.y), Float.valueOf(this.f13782c.y), Float.valueOf(this.f13783d.y)});
        RectF rectF = new RectF(CollectionsKt.minOrThrow((Iterable<Double>) listListOf) - f11, CollectionsKt.minOrThrow((Iterable<Double>) listListOf2) - f12, CollectionsKt.maxOrThrow((Iterable<Double>) listListOf) + f11, CollectionsKt.maxOrThrow((Iterable<Double>) listListOf2) + f12);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @NotNull
    public final List<PointF> asList() {
        return CollectionsKt.listOf((Object[]) new PointF[]{CornerPointsKt.copy(this.f13780a), CornerPointsKt.copy(this.f13781b), CornerPointsKt.copy(this.f13782c), CornerPointsKt.copy(this.f13783d)});
    }

    public final float averageDistance(@NotNull CornerPoints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (float) CollectionsKt.averageOfFloat(compareTo(other));
    }

    public final boolean checkEdgeLength() {
        return ((double) Math.abs(this.f13788i - this.f13790k)) < ((double) ((this.f13788i + this.f13790k) / 2.0f)) * 0.1d && ((double) Math.abs(this.f13789j - this.f13791l)) < ((double) ((this.f13789j + this.f13791l) / 2.0f)) * 0.1d;
    }

    @NotNull
    public final Triple<Boolean, Boolean, Double> checkHorizontal(double rotationTolerance, double rotationThreshold) {
        PointF pointF = this.f13780a;
        PointF pointF2 = new PointF(pointF.x + 100, pointF.y);
        PointF pointF3 = this.f13780a;
        PointF pointF4 = this.f13781b;
        double degrees = Math.toDegrees(Math.atan2(pointF4.y - pointF3.y, pointF4.x - pointF3.x) - Math.atan2(pointF2.y - pointF3.y, pointF2.x - pointF3.x));
        double degrees2 = Math.toDegrees(3.141592653589793d);
        double d11 = 2;
        double d12 = degrees2 / d11;
        if (degrees > d12) {
            degrees -= degrees2;
        } else if (degrees < (-d12)) {
            degrees += degrees2;
        }
        double dAbs = Math.abs(degrees);
        double degrees3 = Math.toDegrees(3.141592653589793d) / d11;
        boolean z11 = false;
        boolean z12 = (0.0d <= dAbs && dAbs <= rotationTolerance) || (degrees3 - rotationTolerance <= dAbs && dAbs <= degrees3);
        if (dAbs > rotationTolerance && dAbs <= rotationThreshold) {
            z11 = true;
        }
        return new Triple<>(Boolean.valueOf(z12), Boolean.valueOf(z11), Double.valueOf(degrees));
    }

    public final boolean checkInsideAngles() {
        float f11 = this.f13788i;
        float f12 = this.f13789j;
        double d11 = f11;
        double d12 = 2;
        double d13 = f12;
        double degrees = Math.toDegrees(Math.acos(((Math.pow(d13, d12) + Math.pow(d11, d12)) - Math.pow(CornerPointsKt.distanceTo(this.f13783d, this.f13781b), d12)) / ((d11 * d12) * d13)));
        float f13 = this.f13789j;
        float f14 = this.f13790k;
        double d14 = f13;
        double d15 = f14;
        double degrees2 = Math.toDegrees(Math.acos(((Math.pow(d15, d12) + Math.pow(d14, d12)) - Math.pow(CornerPointsKt.distanceTo(this.f13780a, this.f13782c), d12)) / ((d14 * d12) * d15)));
        float f15 = this.f13790k;
        float f16 = this.f13791l;
        double d16 = f15;
        double d17 = f16;
        double degrees3 = Math.toDegrees(Math.acos(((Math.pow(d17, d12) + Math.pow(d16, d12)) - Math.pow(CornerPointsKt.distanceTo(this.f13780a, this.f13782c), d12)) / ((d12 * d16) * d17)));
        List listListOf = CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(degrees), Double.valueOf(degrees2), Double.valueOf(degrees3), Double.valueOf(((((double) TXVodDownloadDataSource.QUALITY_360P) - degrees) - degrees2) - degrees3)});
        if (listListOf != null && listListOf.isEmpty()) {
            return true;
        }
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            if (87.0d > dDoubleValue || dDoubleValue > 93.0d) {
                return false;
            }
        }
        return true;
    }

    public final int compareCornersAbsoluteToPreview(boolean isPortrait, @NotNull Rect extractionRect, @NotNull CameraSettings cameraSettings, @NotNull Size minIdSize, float marginPercentLongSide, float marginPercentShortSide) {
        Intrinsics.checkNotNullParameter(extractionRect, "extractionRect");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(minIdSize, "minIdSize");
        Size sizeAccess$toSize = CornerPointsKt.access$toSize(CameraUtilsKt.surfaceToPreview$default(cameraSettings, extractionRect, null, 4, null));
        Size sizeAccess$toSize2 = CornerPointsKt.access$toSize(CameraUtilsKt.surfaceToPreview$default(cameraSettings, m14521a(0.0f, 0.0f), null, 4, null));
        Size size = new Size(minIdSize.getWidth() + ((int) (minIdSize.getWidth() * marginPercentLongSide)), minIdSize.getHeight() + ((int) (minIdSize.getHeight() * marginPercentShortSide)));
        if (isPortrait && getIdPortrait()) {
            size = size.flip();
            minIdSize = minIdSize.flip();
        } else if (!isPortrait && getIdPortrait()) {
            size = size.flip();
            minIdSize = minIdSize.flip();
        }
        return (CornerPointsKt.access$isAtLeast(sizeAccess$toSize, size) && !CornerPointsKt.access$isAtLeast(sizeAccess$toSize2, minIdSize)) ? -1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[RETURN] */
    public final int compareCornersRelativeToPreview(boolean isPortrait, @NotNull Rect extractionRect, float marginPercentLongSide, float marginPercentShortSide, double minAllowedRatio) {
        int iHeight;
        double d11;
        float f11;
        float f12;
        float f13;
        ClosedFloatingPointRange<Double> closedFloatingPointRangeRangeTo;
        Intrinsics.checkNotNullParameter(extractionRect, "extractionRect");
        float fMax = Math.max(this.f13789j, this.f13791l);
        float fMax2 = Math.max(this.f13788i, this.f13790k);
        float fMax3 = Math.max(fMax, fMax2);
        float fMin = Math.min(fMax, fMax2);
        if (isPortrait && getIdPortrait()) {
            iHeight = extractionRect.height();
        } else {
            if (isPortrait || !getIdPortrait()) {
                int iWidth = extractionRect.width();
                d11 = iWidth;
                float f14 = 2;
                float f15 = (marginPercentLongSide / f14) * fMax3;
                f11 = (marginPercentShortSide / f14) * fMin;
                f12 = f15;
                if (!extractionRect.contains(m14521a(f12, f11))) {
                    return 1;
                }
                f13 = (1 + marginPercentLongSide) * fMax3;
                closedFloatingPointRangeRangeTo = RangesKt.rangeTo(minAllowedRatio * d11, d11);
                if (RangesKt.doubleRangeContains(closedFloatingPointRangeRangeTo, f13)) {
                    return 0;
                }
                if (f13 < closedFloatingPointRangeRangeTo.getStart().doubleValue()) {
                    return -1;
                }
                return 1;
            }
            iHeight = extractionRect.height();
        }
        d11 = iHeight;
        float f16 = 2;
        f12 = (marginPercentShortSide / f16) * fMin;
        f11 = (marginPercentLongSide / f16) * fMax3;
        if (!extractionRect.contains(m14521a(f12, f11))) {
            return 1;
        }
        f13 = (1 + marginPercentLongSide) * fMax3;
        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(minAllowedRatio * d11, d11);
        if (RangesKt.doubleRangeContains(closedFloatingPointRangeRangeTo, f13)) {
            return 0;
        }
        if (f13 < closedFloatingPointRangeRangeTo.getStart().doubleValue()) {
            return -1;
        }
        return 1;
    }

    @NotNull
    public final List<Float> compareTo(@NotNull CornerPoints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(CornerPointsKt.distanceTo(this.f13780a, other.f13780a)), Float.valueOf(CornerPointsKt.distanceTo(this.f13781b, other.f13781b)), Float.valueOf(CornerPointsKt.distanceTo(this.f13783d, other.f13783d)), Float.valueOf(CornerPointsKt.distanceTo(this.f13782c, other.f13782c))});
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PointF getF13780a() {
        return this.f13780a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PointF getF13781b() {
        return this.f13781b;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PointF getF13782c() {
        return this.f13782c;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PointF getF13783d() {
        return this.f13783d;
    }

    @NotNull
    public final CornerPoints copy(@NotNull PointF tL, @NotNull PointF tR, @NotNull PointF bR, @NotNull PointF bL) {
        Intrinsics.checkNotNullParameter(tL, "tL");
        Intrinsics.checkNotNullParameter(tR, "tR");
        Intrinsics.checkNotNullParameter(bR, "bR");
        Intrinsics.checkNotNullParameter(bL, "bL");
        return new CornerPoints(tL, tR, bR, bL);
    }

    public final float getAspectRatio() {
        return this.f13789j / this.f13788i;
    }

    @NotNull
    public final PointF getBL() {
        return this.f13783d;
    }

    @NotNull
    public final PointF getBR() {
        return this.f13782c;
    }

    /* JADX INFO: renamed from: getBottom, reason: from getter */
    public final float getF13787h() {
        return this.f13787h;
    }

    /* JADX INFO: renamed from: getBottomEdge, reason: from getter */
    public final float getF13791l() {
        return this.f13791l;
    }

    /* JADX INFO: renamed from: getHeight, reason: from getter */
    public final float getF13793n() {
        return this.f13793n;
    }

    public final boolean getIdPortrait() {
        return this.f13792m < this.f13793n;
    }

    /* JADX INFO: renamed from: getLeft, reason: from getter */
    public final float getF13784e() {
        return this.f13784e;
    }

    /* JADX INFO: renamed from: getLeftEdge, reason: from getter */
    public final float getF13788i() {
        return this.f13788i;
    }

    /* JADX INFO: renamed from: getRight, reason: from getter */
    public final float getF13785f() {
        return this.f13785f;
    }

    /* JADX INFO: renamed from: getRightEdge, reason: from getter */
    public final float getF13790k() {
        return this.f13790k;
    }

    public final int getRotationAngle() {
        Object obj;
        Iterator it = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m90091to(this.f13780a, 0), TuplesKt.m90091to(this.f13781b, 90), TuplesKt.m90091to(this.f13782c, 180), TuplesKt.m90091to(this.f13783d, 270)}).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                PointF pointF = (PointF) ((Pair) next).component1();
                float f11 = pointF.x + pointF.y;
                do {
                    Object next2 = it.next();
                    PointF pointF2 = (PointF) ((Pair) next2).component1();
                    float f12 = pointF2.x + pointF2.y;
                    if (Float.compare(f11, f12) > 0) {
                        next = next2;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            return ((Number) pair.getSecond()).intValue();
        }
        return 0;
    }

    @NotNull
    public final PointF getTL() {
        return this.f13780a;
    }

    @NotNull
    public final PointF getTR() {
        return this.f13781b;
    }

    /* JADX INFO: renamed from: getTop, reason: from getter */
    public final float getF13786g() {
        return this.f13786g;
    }

    /* JADX INFO: renamed from: getTopEdge, reason: from getter */
    public final float getF13789j() {
        return this.f13789j;
    }

    /* JADX INFO: renamed from: getWidth, reason: from getter */
    public final float getF13792m() {
        return this.f13792m;
    }

    public int hashCode() {
        return this.f13783d.hashCode() + ((this.f13782c.hashCode() + ((this.f13781b.hashCode() + (this.f13780a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CornerPoints(tL=" + this.f13780a + ", tR=" + this.f13781b + ", bR=" + this.f13782c + ", bL=" + this.f13783d + ')';
    }

    public final boolean isEmpty() {
        List<PointF> listAsList = asList();
        if (listAsList != null && listAsList.isEmpty()) {
            return true;
        }
        for (PointF pointF : listAsList) {
            if (Float.compare(pointF.x, 0.0f) != 0 || Float.compare(pointF.y, 0.0f) != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean isValid() {
        if (!isEmpty() && this.f13792m > 10.0f && this.f13793n > 10.0f) {
            return true;
        }
        return false;
    }

    public /* synthetic */ CornerPoints(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new PointF(0.0f, 0.0f) : pointF, (i11 & 2) != 0 ? new PointF(0.0f, 0.0f) : pointF2, (i11 & 4) != 0 ? new PointF(0.0f, 0.0f) : pointF3, (i11 & 8) != 0 ? new PointF(0.0f, 0.0f) : pointF4);
    }
}
