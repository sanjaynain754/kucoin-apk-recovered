package com.wang.avi.indicators;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes60.dex */
public class LineSpinFadeLoaderIndicator extends BallSpinFadeLoaderIndicator {
    @Override // com.wang.avi.indicators.BallSpinFadeLoaderIndicator, com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i11 = 0; i11 < 8; i11++) {
            canvas.save();
            BallSpinFadeLoaderIndicator.Point pointCircleAt = circleAt(getWidth(), getHeight(), (getWidth() / 2.5f) - width, 0.7853981633974483d * ((double) i11));
            canvas.translate(pointCircleAt.f79338x, pointCircleAt.f79339y);
            float f11 = this.scaleFloats[i11];
            canvas.scale(f11, f11);
            canvas.rotate(i11 * 45);
            paint.setAlpha(this.alphas[i11]);
            float f12 = -width;
            canvas.drawRoundRect(new RectF(f12, f12 / 1.5f, width * 1.5f, width / 1.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }
}
