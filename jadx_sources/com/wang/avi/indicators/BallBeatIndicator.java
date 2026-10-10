package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class BallBeatIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    private float[] scaleFloats = {1.0f, 1.0f, 1.0f};
    int[] alphas = {255, 255, 255};

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {350, 0, 350};
        for (final int i11 = 0; i11 < 3; i11++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.75f, 1.0f);
            valueAnimatorOfFloat.setDuration(700L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i11]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallBeatIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallBeatIndicator.this.scaleFloats[i11] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallBeatIndicator.this.postInvalidate();
                }
            });
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 51, 255);
            valueAnimatorOfInt.setDuration(700L);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr[i11]);
            addUpdateListener(valueAnimatorOfInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallBeatIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallBeatIndicator.this.alphas[i11] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallBeatIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 8.0f) / 6.0f;
        float f11 = 2.0f * width;
        float width2 = (getWidth() / 2) - (f11 + 4.0f);
        float height = getHeight() / 2;
        for (int i11 = 0; i11 < 3; i11++) {
            canvas.save();
            float f12 = i11;
            canvas.translate((f11 * f12) + width2 + (f12 * 4.0f), height);
            float f13 = this.scaleFloats[i11];
            canvas.scale(f13, f13);
            paint.setAlpha(this.alphas[i11]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }
}
