package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class BallRotateIndicator extends Indicator {
    float degress;
    float scaleFloat = 0.5f;
    private Matrix mMatrix = new Matrix();

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1.0f, 0.5f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallRotateIndicator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BallRotateIndicator.this.scaleFloat = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallRotateIndicator.this.postInvalidate();
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f);
        addUpdateListener(valueAnimatorOfFloat2, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallRotateIndicator.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BallRotateIndicator.this.degress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallRotateIndicator.this.postInvalidate();
            }
        });
        valueAnimatorOfFloat2.setDuration(1000L);
        valueAnimatorOfFloat2.setRepeatCount(-1);
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfFloat2);
        return arrayList;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        float width2 = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.rotate(this.degress, centerX(), centerY());
        canvas.save();
        float f11 = 2.0f * width;
        canvas.translate((width2 - f11) - width, height);
        float f12 = this.scaleFloat;
        canvas.scale(f12, f12);
        canvas.drawCircle(0.0f, 0.0f, width, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width2, height);
        float f13 = this.scaleFloat;
        canvas.scale(f13, f13);
        canvas.drawCircle(0.0f, 0.0f, width, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width2 + f11 + width, height);
        float f14 = this.scaleFloat;
        canvas.scale(f14, f14);
        canvas.drawCircle(0.0f, 0.0f, width, paint);
        canvas.restore();
    }
}
