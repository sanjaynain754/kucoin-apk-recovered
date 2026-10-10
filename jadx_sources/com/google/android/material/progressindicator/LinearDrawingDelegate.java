package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes45.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float adjustedWavelength;
    private int cachedWavelength;
    private float displayedAmplitude;
    private float displayedCornerRadius;
    private float displayedInnerCornerRadius;
    private float displayedTrackThickness;
    private boolean drawingDeterminateIndicator;
    Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> endPoints;

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    private float totalTrackLengthFraction;
    private float trackLength;

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f11, float f12, float f13) {
        drawRoundedBlock(canvas, paint, pathPoint, f11, f12, f13, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i11, @IntRange(from = 0, m1553to = 255) int i12) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i11, i12);
        this.drawingDeterminateIndicator = false;
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        S s11 = this.spec;
        DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = new DrawingDelegate.PathPoint(new float[]{(this.trackLength / 2.0f) - (((LinearProgressIndicatorSpec) s11).trackStopIndicatorPadding != null ? ((LinearProgressIndicatorSpec) s11).trackStopIndicatorPadding.floatValue() + (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize / 2.0f) : this.displayedTrackThickness / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        S s12 = this.spec;
        drawRoundedBlock(canvas, paint, pathPoint, ((LinearProgressIndicatorSpec) s12).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s12).trackStopIndicatorSize, (this.displayedCornerRadius * ((LinearProgressIndicatorSpec) s12).trackStopIndicatorSize) / this.displayedTrackThickness);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    private void calculateDisplayedPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, @NonNull Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair, float f11, float f12, float f13, float f14) {
        int i11 = this.drawingDeterminateIndicator ? ((LinearProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
        if (pathMeasure == this.activePathMeasure && i11 != this.cachedWavelength) {
            this.cachedWavelength = i11;
            invalidateCachedPaths();
        }
        path.rewind();
        float f15 = (-this.trackLength) / 2.0f;
        boolean zHasWavyEffect = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator);
        if (zHasWavyEffect) {
            float f16 = this.trackLength;
            float f17 = this.adjustedWavelength;
            float f18 = f16 / f17;
            float f19 = f14 / f18;
            float f21 = f18 / (f18 + 1.0f);
            f11 = (f11 + f19) * f21;
            f12 = (f12 + f19) * f21;
            f15 -= f14 * f17;
        }
        float length = f11 * pathMeasure.getLength();
        float length2 = f12 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.posVec, pathPoint2.tanVec);
        this.transform.reset();
        this.transform.setTranslate(f15, 0.0f);
        pathPoint.translate(f15, 0.0f);
        pathPoint2.translate(f15, 0.0f);
        if (zHasWavyEffect) {
            float f22 = this.displayedAmplitude * f13;
            this.transform.postScale(1.0f, f22);
            pathPoint.scale(1.0f, f22);
            pathPoint2.scale(1.0f, f22);
        }
        path.transform(this.transform);
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, @ColorInt int i11, @Px int i12, @Px int i13, float f13, float f14, boolean z11) {
        float f15;
        float fLerp;
        Paint paint2;
        Canvas canvas2;
        float fClamp = MathUtils.clamp(f11, 0.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f12, 0.0f, 1.0f);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp);
        float fLerp3 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp2);
        int iClamp = (int) ((i12 * MathUtils.clamp(fLerp2, 0.0f, 0.01f)) / 0.01f);
        int iClamp2 = (int) ((i13 * (1.0f - MathUtils.clamp(fLerp3, 0.99f, 1.0f))) / 0.01f);
        float f16 = this.trackLength;
        int i14 = (int) ((fLerp2 * f16) + iClamp);
        int i15 = (int) ((fLerp3 * f16) - iClamp2);
        float f17 = this.displayedCornerRadius;
        float f18 = this.displayedInnerCornerRadius;
        if (f17 != f18) {
            float fMax = Math.max(f17, f18);
            float f19 = this.trackLength;
            float f21 = fMax / f19;
            float fLerp4 = com.google.android.material.math.MathUtils.lerp(this.displayedCornerRadius, this.displayedInnerCornerRadius, MathUtils.clamp(i14 / f19, 0.0f, f21) / f21);
            float f22 = this.displayedCornerRadius;
            float f23 = this.displayedInnerCornerRadius;
            float f24 = this.trackLength;
            fLerp = com.google.android.material.math.MathUtils.lerp(f22, f23, MathUtils.clamp((f24 - i15) / f24, 0.0f, f21) / f21);
            f15 = fLerp4;
        } else {
            f15 = f17;
            fLerp = f15;
        }
        float f25 = (-this.trackLength) / 2.0f;
        boolean z12 = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator) && z11 && f13 > 0.0f;
        if (i14 <= i15) {
            float f26 = i14 + f15;
            float f27 = i15 - fLerp;
            float f28 = f15 * 2.0f;
            float f29 = 2.0f * fLerp;
            paint.setColor(i11);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            ((DrawingDelegate.PathPoint) this.endPoints.first).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.second).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.first).translate(f26 + f25, 0.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.second).translate(f25 + f27, 0.0f);
            if (i14 == 0 && f27 + fLerp < f26 + f15) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
                float f31 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint, f28, f31, f15, (DrawingDelegate.PathPoint) pair.second, f29, f31, fLerp, true);
                return;
            }
            if (f26 - f15 > f27 - fLerp) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair2 = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair2.second;
                float f32 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint2, f29, f32, fLerp, (DrawingDelegate.PathPoint) pair2.first, f28, f32, f15, false);
                return;
            }
            float f33 = fLerp;
            float f34 = f15;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((LinearProgressIndicatorSpec) this.spec).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z12) {
                paint2 = paint;
                PathMeasure pathMeasure = this.activePathMeasure;
                Path path = this.displayedActivePath;
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair3 = this.endPoints;
                float f35 = this.trackLength;
                calculateDisplayedPath(pathMeasure, path, pair3, f26 / f35, f27 / f35, f13, f14);
                canvas2 = canvas;
                canvas2.drawPath(this.displayedActivePath, paint2);
            } else {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair4 = this.endPoints;
                Object obj = pair4.first;
                float f36 = ((DrawingDelegate.PathPoint) obj).posVec[0];
                float f37 = ((DrawingDelegate.PathPoint) obj).posVec[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f36, f37, ((DrawingDelegate.PathPoint) obj2).posVec[0], ((DrawingDelegate.PathPoint) obj2).posVec[1], paint);
                paint2 = paint;
                canvas2 = canvas;
            }
            if (((LinearProgressIndicatorSpec) this.spec).useStrokeCap()) {
                return;
            }
            if (f26 > 0.0f && f34 > 0.0f) {
                drawRoundedBlock(canvas2, paint2, (DrawingDelegate.PathPoint) this.endPoints.first, f28, this.displayedTrackThickness, f34);
            }
            if (f27 >= this.trackLength || f33 <= 0.0f) {
                return;
            }
            drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.second, f29, this.displayedTrackThickness, f33);
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f11, float f12, float f13, @Nullable DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2, float f14, float f15, float f16, boolean z11) {
        char c11;
        float f17;
        float f18;
        float fMin = Math.min(f12, this.displayedTrackThickness);
        float f19 = (-f11) / 2.0f;
        float f21 = (-fMin) / 2.0f;
        float f22 = f11 / 2.0f;
        float f23 = fMin / 2.0f;
        RectF rectF = new RectF(f19, f21, f22, f23);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pathPoint2 != null) {
            float fMin2 = Math.min(f15, this.displayedTrackThickness);
            float fMin3 = Math.min(f14 / 2.0f, (f16 * fMin2) / this.displayedTrackThickness);
            RectF rectF2 = new RectF();
            if (z11) {
                c11 = 0;
                float f24 = (pathPoint2.posVec[0] - fMin3) - (pathPoint.posVec[0] - f13);
                if (f24 > 0.0f) {
                    pathPoint2.translate((-f24) / 2.0f, 0.0f);
                    f18 = f14 + f24;
                } else {
                    f18 = f14;
                }
                rectF2.set(0.0f, f21, f22, f23);
            } else {
                c11 = 0;
                float f25 = (pathPoint2.posVec[0] + fMin3) - (pathPoint.posVec[0] + f13);
                if (f25 < 0.0f) {
                    pathPoint2.translate((-f25) / 2.0f, 0.0f);
                    f17 = f14 - f25;
                } else {
                    f17 = f14;
                }
                rectF2.set(f19, f21, 0.0f, f23);
                f18 = f17;
            }
            RectF rectF3 = new RectF((-f18) / 2.0f, (-fMin2) / 2.0f, f18 / 2.0f, fMin2 / 2.0f);
            float[] fArr = pathPoint2.posVec;
            canvas.translate(fArr[c11], fArr[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint2.tanVec));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-vectorToCanvasRotation(pathPoint2.tanVec));
            float[] fArr2 = pathPoint2.posVec;
            canvas.translate(-fArr2[c11], -fArr2[1]);
            float[] fArr3 = pathPoint.posVec;
            canvas.translate(fArr3[c11], fArr3[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f13, f13, paint);
        } else {
            float[] fArr4 = pathPoint.posVec;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRoundRect(rectF, f13, f13, paint);
        }
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11, boolean z11, boolean z12) {
        if (this.trackLength != rect.width()) {
            this.trackLength = rect.width();
            invalidateCachedPaths();
        }
        float preferredHeight = getPreferredHeight();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - preferredHeight) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f12 = this.trackLength / 2.0f;
        float f13 = preferredHeight / 2.0f;
        canvas.clipRect(-f12, -f13, f12, f13);
        S s11 = this.spec;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s11).trackThickness * f11;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s11).trackThickness / 2, ((LinearProgressIndicatorSpec) s11).getTrackCornerRadiusInPx()) * f11;
        S s12 = this.spec;
        this.displayedAmplitude = ((LinearProgressIndicatorSpec) s12).waveAmplitude * f11;
        this.displayedInnerCornerRadius = Math.min(((LinearProgressIndicatorSpec) s12).trackThickness / 2.0f, ((LinearProgressIndicatorSpec) s12).getTrackInnerCornerRadiusInPx()) * f11;
        if (z11 || z12) {
            if ((z11 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z12 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z11 || (z12 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (1.0f - f11)) / 2.0f);
            }
        }
        if (z12 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f11;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i11) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i11);
        this.drawingDeterminateIndicator = activeIndicator.isDeterminate;
        float f11 = activeIndicator.startFraction;
        float f12 = activeIndicator.endFraction;
        int i12 = activeIndicator.gapSize;
        drawLine(canvas, paint, f11, f12, iCompositeARGBWithAlpha, i12, i12, activeIndicator.amplitudeFraction, activeIndicator.phaseFraction, true);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        S s11 = this.spec;
        return ((LinearProgressIndicatorSpec) s11).trackThickness + (((LinearProgressIndicatorSpec) s11).waveAmplitude * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void invalidateCachedPaths() {
        this.cachedActivePath.rewind();
        if (((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            int i11 = this.drawingDeterminateIndicator ? ((LinearProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
            float f11 = this.trackLength;
            int i12 = (int) (f11 / i11);
            this.adjustedWavelength = f11 / i12;
            for (int i13 = 0; i13 <= i12; i13++) {
                int i14 = i13 * 2;
                float f12 = i14 + 1;
                this.cachedActivePath.cubicTo(i14 + 0.48f, 0.0f, f12 - 0.48f, 1.0f, f12, 1.0f);
                float f13 = i14 + 2;
                this.cachedActivePath.cubicTo(f12 + 0.48f, 1.0f, f13 - 0.48f, 0.0f, f13, 0.0f);
            }
            this.transform.reset();
            this.transform.setScale(this.adjustedWavelength / 2.0f, -2.0f);
            this.transform.postTranslate(0.0f, 1.0f);
            this.cachedActivePath.transform(this.transform);
        } else {
            this.cachedActivePath.lineTo(this.trackLength, 0.0f);
        }
        this.activePathMeasure.setPath(this.cachedActivePath, false);
    }

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
        this.endPoints = new Pair<>(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, int i11, int i12, @Px int i13) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i11, i12);
        this.drawingDeterminateIndicator = false;
        drawLine(canvas, paint, f11, f12, iCompositeARGBWithAlpha, i13, i13, 0.0f, 0.0f, false);
    }
}
