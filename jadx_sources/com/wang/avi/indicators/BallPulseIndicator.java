package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class BallPulseIndicator extends Indicator {
    public static final float SCALE = 1.0f;
    private float[] scaleFloats = {1.0f, 1.0f, 1.0f};

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {120, 240, TXVodDownloadDataSource.QUALITY_360P};
        for (final int i11 = 0; i11 < 3; i11++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i11]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallPulseIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallPulseIndicator.this.scaleFloats[i11] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallPulseIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float fMin = (Math.min(getWidth(), getHeight()) - 8.0f) / 6.0f;
        float f11 = 2.0f * fMin;
        float width = (getWidth() / 2) - (f11 + 4.0f);
        float height = getHeight() / 2;
        for (int i11 = 0; i11 < 3; i11++) {
            canvas.save();
            float f12 = i11;
            canvas.translate((f11 * f12) + width + (f12 * 4.0f), height);
            float f13 = this.scaleFloats[i11];
            canvas.scale(f13, f13);
            canvas.drawCircle(0.0f, 0.0f, fMin, paint);
            canvas.restore();
        }
    }
}
