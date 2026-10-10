package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class BallClipRotatePulseIndicator extends Indicator {
    float degrees;
    float scaleFloat1;
    float scaleFloat2;

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallClipRotatePulseIndicator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BallClipRotatePulseIndicator.this.scaleFloat1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotatePulseIndicator.this.postInvalidate();
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.6f, 1.0f);
        valueAnimatorOfFloat2.setDuration(1000L);
        valueAnimatorOfFloat2.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat2, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallClipRotatePulseIndicator.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BallClipRotatePulseIndicator.this.scaleFloat2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotatePulseIndicator.this.postInvalidate();
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f);
        valueAnimatorOfFloat3.setDuration(1000L);
        valueAnimatorOfFloat3.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat3, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallClipRotatePulseIndicator.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BallClipRotatePulseIndicator.this.degrees = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotatePulseIndicator.this.postInvalidate();
            }
        });
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfFloat2);
        arrayList.add(valueAnimatorOfFloat3);
        return arrayList;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.save();
        canvas.translate(width, height);
        float f11 = this.scaleFloat1;
        canvas.scale(f11, f11);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0.0f, 0.0f, width / 2.5f, paint);
        canvas.restore();
        canvas.translate(width, height);
        float f12 = this.scaleFloat2;
        canvas.scale(f12, f12);
        canvas.rotate(this.degrees);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        float[] fArr = {225.0f, 45.0f};
        for (int i11 = 0; i11 < 2; i11++) {
            canvas.drawArc(new RectF((-width) + 12.0f, (-height) + 12.0f, width - 12.0f, height - 12.0f), fArr[i11], 90.0f, false, paint);
        }
    }
}
