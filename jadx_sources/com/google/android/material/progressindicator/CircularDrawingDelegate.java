package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes45.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH = 0.5522848f;
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float adjustedWavelength;
    private final RectF arcBounds;
    private float cachedAmplitude;
    private float cachedRadius;
    private int cachedWavelength;
    private float displayedAmplitude;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private boolean drawingDeterminateIndicator;
    private final Pair<DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint, DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint> endPoints;

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    private float totalTrackLengthFraction;

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint, float f11, float f12) {
        drawRoundedBlock(canvas, paint, pathPoint, f11, f12, 1.0f);
    }

    private void appendCubicPerHalfCycle(@NonNull Path path, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint2) {
        float f11 = (this.adjustedWavelength / 2.0f) * 0.48f;
        DrawingDelegate.PathPoint pathPoint3 = new DrawingDelegate.PathPoint(this, pathPoint);
        DrawingDelegate.PathPoint pathPoint4 = new DrawingDelegate.PathPoint(this, pathPoint2);
        pathPoint3.moveAlong(f11);
        pathPoint4.moveAlong(-f11);
        float[] fArr = pathPoint3.posVec;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float[] fArr2 = pathPoint4.posVec;
        float f14 = fArr2[0];
        float f15 = fArr2[1];
        float[] fArr3 = pathPoint2.posVec;
        path.cubicTo(f12, f13, f14, f15, fArr3[0], fArr3[1]);
    }

    private void calculateDisplayedPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, @NonNull Pair<DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint, DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint> pair, float f11, float f12, float f13, float f14) {
        float f15 = this.displayedAmplitude * f13;
        int i11 = this.drawingDeterminateIndicator ? ((CircularProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((CircularProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
        float f16 = this.adjustedRadius;
        if (f16 != this.cachedRadius || (pathMeasure == this.activePathMeasure && (f15 != this.cachedAmplitude || i11 != this.cachedWavelength))) {
            this.cachedAmplitude = f15;
            this.cachedWavelength = i11;
            this.cachedRadius = f16;
            invalidateCachedPaths();
        }
        path.rewind();
        float f17 = 0.0f;
        float fClamp = MathUtils.clamp(f12, 0.0f, 1.0f);
        if (((CircularProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            float f18 = f14 / ((float) ((((double) this.adjustedRadius) * 6.283185307179586d) / ((double) this.adjustedWavelength)));
            f11 += f18;
            f17 = 0.0f - (f18 * 360.0f);
        }
        float f19 = f11 % 1.0f;
        float length = (pathMeasure.getLength() * f19) / 2.0f;
        float length2 = ((f19 + fClamp) * pathMeasure.getLength()) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.posVec, pathPoint2.tanVec);
        this.transform.reset();
        this.transform.setRotate(f17);
        pathPoint.rotate(f17);
        pathPoint2.rotate(f17);
        path.transform(this.transform);
    }

    private void drawArc(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, @ColorInt int i11, @Px int i12, @Px int i13, float f13, float f14, boolean z11) {
        float f15 = f12 >= f11 ? f12 - f11 : (f12 + 1.0f) - f11;
        float f16 = f11 % 1.0f;
        if (f16 < 0.0f) {
            f16 += 1.0f;
        }
        if (this.totalTrackLengthFraction < 1.0f) {
            float f17 = f16 + f15;
            if (f17 > 1.0f) {
                drawArc(canvas, paint, f16, 1.0f, i11, i12, 0, f13, f14, z11);
                drawArc(canvas, paint, 1.0f, f17, i11, 0, i13, f13, f14, z11);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        float f18 = f15 - 0.99f;
        if (f18 >= 0.0f) {
            float f19 = ((f18 * degrees) / 180.0f) / ROUND_CAP_RAMP_DOWN_THRESHHOLD;
            f15 += f19;
            if (!z11) {
                f16 -= f19 / 2.0f;
            }
        }
        float fLerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f16);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f15);
        float degrees2 = (float) Math.toDegrees(i12 / this.adjustedRadius);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i13 / this.adjustedRadius));
        float f21 = (fLerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z12 = ((CircularProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator) && z11 && f13 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i11);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f22 = this.displayedCornerRadius * 2.0f;
        float f23 = degrees * 2.0f;
        if (degrees3 < f23) {
            float f24 = degrees3 / f23;
            float f25 = f21 + (degrees * f24);
            DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint = new DrawingDelegate.PathPoint();
            if (z12) {
                float length = ((f25 / 360.0f) * this.activePathMeasure.getLength()) / 2.0f;
                float f26 = this.displayedAmplitude * f13;
                float f27 = this.adjustedRadius;
                if (f27 != this.cachedRadius || f26 != this.cachedAmplitude) {
                    this.cachedAmplitude = f26;
                    this.cachedRadius = f27;
                    invalidateCachedPaths();
                }
                this.activePathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
            } else {
                pathPoint.rotate(f25 + 90.0f);
                pathPoint.moveAcross(-this.adjustedRadius);
            }
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, pathPoint, f22, this.displayedTrackThickness, f24);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(((CircularProgressIndicatorSpec) this.spec).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f28 = f21 + degrees;
        float f29 = degrees3 - f23;
        ((DrawingDelegate.PathPoint) this.endPoints.first).reset();
        ((DrawingDelegate.PathPoint) this.endPoints.second).reset();
        if (z12) {
            calculateDisplayedPath(this.activePathMeasure, this.displayedActivePath, this.endPoints, f28 / 360.0f, f29 / 360.0f, f13, f14);
            canvas.drawPath(this.displayedActivePath, paint);
        } else {
            ((DrawingDelegate.PathPoint) this.endPoints.first).rotate(f28 + 90.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.first).moveAcross(-this.adjustedRadius);
            ((DrawingDelegate.PathPoint) this.endPoints.second).rotate(f28 + f29 + 90.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.second).moveAcross(-this.adjustedRadius);
            RectF rectF = this.arcBounds;
            float f31 = this.adjustedRadius;
            rectF.set(-f31, -f31, f31, f31);
            canvas.drawArc(this.arcBounds, f28, f29, false, paint);
        }
        if (((CircularProgressIndicatorSpec) this.spec).useStrokeCap() || this.displayedCornerRadius <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.first, f22, this.displayedTrackThickness);
        drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.second, f22, this.displayedTrackThickness);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint, float f11, float f12, float f13) {
        float fMin = Math.min(f12, this.displayedTrackThickness);
        float f14 = f11 / 2.0f;
        float fMin2 = Math.min(f14, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f11) / 2.0f, (-fMin) / 2.0f, f14, fMin / 2.0f);
        canvas.save();
        float[] fArr = pathPoint.posVec;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
        canvas.scale(f13, f13);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private int getSize() {
        S s11 = this.spec;
        return ((CircularProgressIndicatorSpec) s11).indicatorSize + (((CircularProgressIndicatorSpec) s11).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, @IntRange(from = 0, m1553to = 255) int i11) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i11);
        canvas.save();
        canvas.rotate(activeIndicator.rotationDegree);
        this.drawingDeterminateIndicator = activeIndicator.isDeterminate;
        float f11 = activeIndicator.startFraction;
        float f12 = activeIndicator.endFraction;
        int i12 = activeIndicator.gapSize;
        drawArc(canvas, paint, f11, f12, iCompositeARGBWithAlpha, i12, i12, activeIndicator.amplitudeFraction, activeIndicator.phaseFraction, true);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void invalidateCachedPaths() {
        this.cachedActivePath.rewind();
        this.cachedActivePath.moveTo(1.0f, 0.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            this.cachedActivePath.cubicTo(1.0f, QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, 1.0f, 0.0f, 1.0f);
            this.cachedActivePath.cubicTo(-0.5522848f, 1.0f, -1.0f, QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, -1.0f, 0.0f);
            this.cachedActivePath.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.cachedActivePath.cubicTo(QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.transform.reset();
        Matrix matrix = this.transform;
        float f11 = this.adjustedRadius;
        matrix.setScale(f11, f11);
        this.cachedActivePath.transform(this.transform);
        if (((CircularProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            this.activePathMeasure.setPath(this.cachedActivePath, false);
            createWavyPath(this.activePathMeasure, this.cachedActivePath, this.cachedAmplitude);
        }
        this.activePathMeasure.setPath(this.cachedActivePath, false);
    }

    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.arcBounds = new RectF();
        this.endPoints = new Pair<>(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    private void createWavyPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, float f11) {
        int i11;
        path.rewind();
        float length = pathMeasure.getLength();
        if (this.drawingDeterminateIndicator) {
            i11 = ((CircularProgressIndicatorSpec) this.spec).wavelengthDeterminate;
        } else {
            i11 = ((CircularProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
        }
        int iMax = Math.max(3, (int) ((length / i11) / 2.0f)) * 2;
        this.adjustedWavelength = length / iMax;
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < iMax; i12++) {
            DrawingDelegate.PathPoint pathPoint = new DrawingDelegate.PathPoint();
            float f12 = i12;
            pathMeasure.getPosTan(this.adjustedWavelength * f12, pathPoint.posVec, pathPoint.tanVec);
            DrawingDelegate.PathPoint pathPoint2 = new DrawingDelegate.PathPoint();
            float f13 = this.adjustedWavelength;
            pathMeasure.getPosTan((f12 * f13) + (f13 / 2.0f), pathPoint2.posVec, pathPoint2.tanVec);
            arrayList.add(pathPoint);
            pathPoint2.moveAcross(f11 * 2.0f);
            arrayList.add(pathPoint2);
        }
        arrayList.add((DrawingDelegate.PathPoint) arrayList.get(0));
        DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint3 = (DrawingDelegate.PathPoint) arrayList.get(0);
        float[] fArr = pathPoint3.posVec;
        int i13 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i13 < arrayList.size()) {
            DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint4 = (DrawingDelegate.PathPoint) arrayList.get(i13);
            appendCubicPerHalfCycle(path, pathPoint3, pathPoint4);
            i13++;
            pathPoint3 = pathPoint4;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11, boolean z11, boolean z12) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        S s11 = this.spec;
        float f12 = (((CircularProgressIndicatorSpec) s11).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s11).indicatorInset;
        canvas.translate((f12 * fWidth) + rect.left, (f12 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f13 = -f12;
        canvas.clipRect(f13, f13, f12, f12);
        S s12 = this.spec;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s12).trackThickness * f11;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) s12).trackThickness / 2, ((CircularProgressIndicatorSpec) s12).getTrackCornerRadiusInPx()) * f11;
        S s13 = this.spec;
        this.displayedAmplitude = ((CircularProgressIndicatorSpec) s13).waveAmplitude * f11;
        float f14 = (((CircularProgressIndicatorSpec) s13).indicatorSize - ((CircularProgressIndicatorSpec) s13).trackThickness) / 2.0f;
        this.adjustedRadius = f14;
        if (z11 || z12) {
            float f15 = ((1.0f - f11) * ((CircularProgressIndicatorSpec) s13).trackThickness) / 2.0f;
            if ((z11 && ((CircularProgressIndicatorSpec) s13).showAnimationBehavior == 2) || (z12 && ((CircularProgressIndicatorSpec) s13).hideAnimationBehavior == 1)) {
                this.adjustedRadius = f14 + f15;
            } else if ((z11 && ((CircularProgressIndicatorSpec) s13).showAnimationBehavior == 1) || (z12 && ((CircularProgressIndicatorSpec) s13).hideAnimationBehavior == 2)) {
                this.adjustedRadius = f14 - f15;
            }
        }
        if (z12 && ((CircularProgressIndicatorSpec) s13).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f11;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, @ColorInt int i11, @IntRange(from = 0, m1553to = 255) int i12, int i13) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i11, i12);
        this.drawingDeterminateIndicator = false;
        drawArc(canvas, paint, f11, f12, iCompositeARGBWithAlpha, i13, i13, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i11, @IntRange(from = 0, m1553to = 255) int i12) {
    }
}
