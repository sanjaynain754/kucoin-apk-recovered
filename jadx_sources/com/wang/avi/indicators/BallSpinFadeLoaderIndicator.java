package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class BallSpinFadeLoaderIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255};

    public final class Point {

        /* JADX INFO: renamed from: x */
        public float f79338x;

        /* JADX INFO: renamed from: y */
        public float f79339y;

        public Point(float f11, float f12) {
            this.f79338x = f11;
            this.f79339y = f12;
        }
    }

    public Point circleAt(int i11, int i12, float f11, double d11) {
        double d12 = f11;
        return new Point((float) (((double) (i11 / 2)) + (Math.cos(d11) * d12)), (float) (((double) (i12 / 2)) + (d12 * Math.sin(d11))));
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {0, 120, 240, TXVodDownloadDataSource.QUALITY_360P, TXVodDownloadDataSource.QUALITY_480P, 600, 720, 780, C33556b3.f69067m};
        for (final int i11 = 0; i11 < 8; i11++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i11]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallSpinFadeLoaderIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.scaleFloats[i11] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 77, 255);
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr[i11]);
            addUpdateListener(valueAnimatorOfInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallSpinFadeLoaderIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.alphas[i11] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i11 = 0; i11 < 8; i11++) {
            canvas.save();
            Point pointCircleAt = circleAt(getWidth(), getHeight(), (getWidth() / 2) - width, 0.7853981633974483d * ((double) i11));
            canvas.translate(pointCircleAt.f79338x, pointCircleAt.f79339y);
            float f11 = this.scaleFloats[i11];
            canvas.scale(f11, f11);
            paint.setAlpha(this.alphas[i11]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }
}
