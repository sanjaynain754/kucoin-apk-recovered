package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class BallPulseSyncIndicator extends Indicator {
    float[] translateYFloats = new float[3];

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = (getWidth() - 8.0f) / 6.0f;
        int[] iArr = {70, 140, 210};
        for (final int i11 = 0; i11 < 3; i11++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getHeight() / 2, (getHeight() / 2) - (2.0f * width), getHeight() / 2);
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i11]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallPulseSyncIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallPulseSyncIndicator.this.translateYFloats[i11] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallPulseSyncIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 8.0f) / 6.0f;
        float f11 = 2.0f * width;
        float width2 = (getWidth() / 2) - (f11 + 4.0f);
        for (int i11 = 0; i11 < 3; i11++) {
            canvas.save();
            float f12 = i11;
            canvas.translate((f11 * f12) + width2 + (f12 * 4.0f), this.translateYFloats[i11]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }
}
