package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.ugc.datereport.UGCDataReportDef;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class BallGridPulseIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255, 255};
    float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {720, 1020, 1280, 1420, 1450, 1180, 870, 1450, UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_FILTER};
        int[] iArr2 = {-60, 250, -170, TXVodDownloadDataSource.QUALITY_480P, 310, 30, 460, 780, 450};
        for (final int i11 = 0; i11 < 9; i11++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.5f, 1.0f);
            valueAnimatorOfFloat.setDuration(iArr[i11]);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr2[i11]);
            addUpdateListener(valueAnimatorOfFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallGridPulseIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallGridPulseIndicator.this.scaleFloats[i11] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallGridPulseIndicator.this.postInvalidate();
                }
            });
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 210, 122, 255);
            valueAnimatorOfInt.setDuration(iArr[i11]);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr2[i11]);
            addUpdateListener(valueAnimatorOfInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallGridPulseIndicator.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallGridPulseIndicator.this.alphas[i11] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallGridPulseIndicator.this.postInvalidate();
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 16.0f) / 6.0f;
        float f11 = 2.0f * width;
        float f12 = f11 + 4.0f;
        float width2 = (getWidth() / 2) - f12;
        float width3 = (getWidth() / 2) - f12;
        for (int i11 = 0; i11 < 3; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                canvas.save();
                float f13 = i12;
                float f14 = (f11 * f13) + width2 + (f13 * 4.0f);
                float f15 = i11;
                canvas.translate(f14, (f11 * f15) + width3 + (f15 * 4.0f));
                int i13 = (i11 * 3) + i12;
                float f16 = this.scaleFloats[i13];
                canvas.scale(f16, f16);
                paint.setAlpha(this.alphas[i13]);
                canvas.drawCircle(0.0f, 0.0f, width, paint);
                canvas.restore();
            }
        }
    }
}
