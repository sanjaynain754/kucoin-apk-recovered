package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class LineScalePartyIndicator extends Indicator {
    public static final float SCALE = 1.0f;
    float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {1260, 430, 1010, 730};
        long[] jArr2 = {770, 290, 280, 740};
        for (final int i11 = 0; i11 < 4; i11++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            valueAnimatorOfFloat.setDuration(jArr[i11]);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(jArr2[i11]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.LineScalePartyIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LineScalePartyIndicator.this.scaleFloats[i11] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    LineScalePartyIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 9;
        float height = getHeight() / 2;
        for (int i11 = 0; i11 < 4; i11++) {
            canvas.save();
            float f11 = width / 2.0f;
            canvas.translate((((i11 * 2) + 2) * width) - f11, height);
            float f12 = this.scaleFloats[i11];
            canvas.scale(f12, f12);
            canvas.drawRoundRect(new RectF((-width) / 2.0f, (-getHeight()) / 2.5f, f11, getHeight() / 2.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }
}
