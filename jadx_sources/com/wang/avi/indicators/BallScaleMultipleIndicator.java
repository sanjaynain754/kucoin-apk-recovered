package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class BallScaleMultipleIndicator extends Indicator {
    float[] scaleFloats = {1.0f, 1.0f, 1.0f};
    int[] alphaInts = {255, 255, 255};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        for (int i11 = 0; i11 < 3; i11++) {
            paint.setAlpha(this.alphaInts[i11]);
            float f11 = this.scaleFloats[i11];
            canvas.scale(f11, f11, getWidth() / 2, getHeight() / 2);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - 4.0f, paint);
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {0, 200, 400};
        for (final int i11 = 0; i11 < 3; i11++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallScaleMultipleIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallScaleMultipleIndicator.this.scaleFloats[i11] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallScaleMultipleIndicator.this.postInvalidate();
                }
            });
            valueAnimatorOfFloat.setStartDelay(jArr[i11]);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallScaleMultipleIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallScaleMultipleIndicator.this.alphaInts[i11] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallScaleMultipleIndicator.this.postInvalidate();
                }
            });
            valueAnimatorOfFloat.setStartDelay(jArr[i11]);
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
