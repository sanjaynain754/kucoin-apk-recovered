package com.google.android.material.loadingindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.graphics.shapes.Morph;
import androidx.graphics.shapes.RoundedPolygon;
import androidx.graphics.shapes.Shapes_androidKt;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.shape.MaterialShapes;

/* JADX INFO: loaded from: classes45.dex */
class LoadingIndicatorDrawingDelegate {
    private static final Morph[] INDETERMINATE_MORPH_SEQUENCE;
    private static final RoundedPolygon[] INDETERMINATE_SHAPES;

    @NonNull
    final Path indicatorPath = new Path();

    @NonNull
    final Matrix indicatorPathTransform = new Matrix();

    @NonNull
    LoadingIndicatorSpec specs;

    public static class IndicatorState {

        @ColorInt
        int color;
        float morphFraction;
        float rotationDegree;
    }

    static {
        RoundedPolygon[] roundedPolygonArr = {MaterialShapes.normalize(MaterialShapes.SOFT_BURST, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.COOKIE_9, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.PENTAGON, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.PILL, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.SUNNY, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.COOKIE_4, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.OVAL, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
        INDETERMINATE_SHAPES = roundedPolygonArr;
        INDETERMINATE_MORPH_SEQUENCE = new Morph[roundedPolygonArr.length];
        int i11 = 0;
        while (true) {
            RoundedPolygon[] roundedPolygonArr2 = INDETERMINATE_SHAPES;
            if (i11 >= roundedPolygonArr2.length) {
                return;
            }
            int i12 = i11 + 1;
            INDETERMINATE_MORPH_SEQUENCE[i11] = new Morph(roundedPolygonArr2[i11], roundedPolygonArr2[i12 % roundedPolygonArr2.length]);
            i11 = i12;
        }
    }

    public void drawContainer(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i11, @IntRange(from = 0, m1553to = 255) int i12) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        float fMin = Math.min(loadingIndicatorSpec.containerWidth, loadingIndicatorSpec.containerHeight) / 2.0f;
        paint.setColor(MaterialColors.compositeARGBWithAlpha(i11, i12));
        paint.setStyle(Paint.Style.FILL);
        LoadingIndicatorSpec loadingIndicatorSpec2 = this.specs;
        int i13 = loadingIndicatorSpec2.containerWidth;
        int i14 = loadingIndicatorSpec2.containerHeight;
        canvas.drawRoundRect(new RectF((-i13) / 2.0f, (-i14) / 2.0f, i13 / 2.0f, i14 / 2.0f), fMin, fMin, paint);
    }

    public void drawIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull IndicatorState indicatorState, @IntRange(from = 0, m1553to = 255) int i11) {
        paint.setColor(MaterialColors.compositeARGBWithAlpha(indicatorState.color, i11));
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        canvas.rotate(indicatorState.rotationDegree);
        this.indicatorPath.rewind();
        int iFloor = (int) Math.floor(indicatorState.morphFraction);
        Morph[] morphArr = INDETERMINATE_MORPH_SEQUENCE;
        Shapes_androidKt.toPath(morphArr[MathUtils.floorMod(iFloor, morphArr.length)], indicatorState.morphFraction - iFloor, this.indicatorPath);
        Matrix matrix = this.indicatorPathTransform;
        int i12 = this.specs.indicatorSize;
        matrix.setScale(i12 / 2.0f, i12 / 2.0f);
        this.indicatorPath.transform(this.indicatorPathTransform);
        canvas.drawPath(this.indicatorPath, paint);
        canvas.restore();
    }

    public int getPreferredHeight() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        return Math.max(loadingIndicatorSpec.containerWidth, loadingIndicatorSpec.indicatorSize);
    }

    public int getPreferredWidth() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        return Math.max(loadingIndicatorSpec.containerHeight, loadingIndicatorSpec.indicatorSize);
    }

    public LoadingIndicatorDrawingDelegate(@NonNull LoadingIndicatorSpec loadingIndicatorSpec) {
        this.specs = loadingIndicatorSpec;
    }

    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect) {
        canvas.translate(rect.centerX(), rect.centerY());
        if (this.specs.scaleToFit) {
            float fMin = Math.min(rect.width() / getPreferredWidth(), rect.height() / getPreferredHeight());
            canvas.scale(fMin, fMin);
        }
        canvas.clipRect((-getPreferredWidth()) / 2.0f, (-getPreferredHeight()) / 2.0f, getPreferredWidth() / 2.0f, getPreferredHeight() / 2.0f);
        canvas.rotate(-90.0f);
    }
}
