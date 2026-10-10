package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class CubeTransitionIndicator extends Indicator {
    float degrees;
    float[] translateX = new float[2];
    float[] translateY = new float[2];
    float scaleFloat = 1.0f;

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        char c11;
        int i11;
        char c12 = 3;
        int i12 = 2;
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = getWidth() / 5;
        float height = getHeight() / 5;
        final int i13 = 0;
        while (i13 < i12) {
            this.translateX[i13] = width;
            float width2 = getWidth() - width;
            float width3 = getWidth() - width;
            float[] fArr = new float[5];
            fArr[0] = width;
            fArr[1] = width2;
            fArr[i12] = width3;
            fArr[c12] = width;
            fArr[4] = width;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            if (i13 == 1) {
                float width4 = getWidth() - width;
                float width5 = getWidth() - width;
                float width6 = getWidth() - width;
                c11 = c12;
                float[] fArr2 = new float[5];
                fArr2[0] = width4;
                fArr2[1] = width;
                fArr2[i12] = width;
                fArr2[c11] = width5;
                fArr2[4] = width6;
                valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr2);
            } else {
                c11 = c12;
            }
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(1600L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.CubeTransitionIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CubeTransitionIndicator.this.translateX[i13] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CubeTransitionIndicator.this.postInvalidate();
                }
            });
            this.translateY[i13] = height;
            float height2 = getHeight() - height;
            float height3 = getHeight() - height;
            float[] fArr3 = new float[5];
            fArr3[0] = height;
            fArr3[1] = height;
            fArr3[i12] = height2;
            fArr3[c11] = height3;
            fArr3[4] = height;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr3);
            if (i13 == 1) {
                float height4 = getHeight() - height;
                float height5 = getHeight() - height;
                float height6 = getHeight() - height;
                i11 = i12;
                float[] fArr4 = new float[5];
                fArr4[0] = height4;
                fArr4[1] = height5;
                fArr4[i11] = height;
                fArr4[c11] = height;
                fArr4[4] = height6;
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr4);
            } else {
                i11 = i12;
            }
            valueAnimatorOfFloat2.setDuration(1600L);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat2, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.CubeTransitionIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CubeTransitionIndicator.this.translateY[i13] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CubeTransitionIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfFloat2);
            i13++;
            c12 = c11;
            i12 = i11;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.5f, 1.0f, 0.5f, 1.0f);
        valueAnimatorOfFloat3.setDuration(1600L);
        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat3.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat3, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.CubeTransitionIndicator.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CubeTransitionIndicator.this.scaleFloat = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CubeTransitionIndicator.this.postInvalidate();
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f, 540.0f, 720.0f);
        valueAnimatorOfFloat4.setDuration(1600L);
        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat4.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat4, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.CubeTransitionIndicator.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CubeTransitionIndicator.this.degrees = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CubeTransitionIndicator.this.postInvalidate();
            }
        });
        arrayList.add(valueAnimatorOfFloat3);
        arrayList.add(valueAnimatorOfFloat4);
        return arrayList;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 5;
        float height = getHeight() / 5;
        for (int i11 = 0; i11 < 2; i11++) {
            canvas.save();
            canvas.translate(this.translateX[i11], this.translateY[i11]);
            canvas.rotate(this.degrees);
            float f11 = this.scaleFloat;
            canvas.scale(f11, f11);
            canvas.drawRect(new RectF((-width) / 2.0f, (-height) / 2.0f, width / 2.0f, height / 2.0f), paint);
            canvas.restore();
        }
    }
}
