package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.wallet.WalletConstants;
import com.tencent.bugly.proguard.C33643f6;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes60.dex */
public class BallGridBeatIndicator extends Indicator {
    public static final int ALPHA = 255;
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255, 255};

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {960, 930, 1190, 1130, 1340, 940, 1200, C33643f6.f69865u, 1190};
        int[] iArr2 = {TXVodDownloadDataSource.QUALITY_360P, 400, 680, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, 710, -150, -120, 10, 320};
        for (final int i11 = 0; i11 < 9; i11++) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 168, 255);
            valueAnimatorOfInt.setDuration(iArr[i11]);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr2[i11]);
            addUpdateListener(valueAnimatorOfInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wang.avi.indicators.BallGridBeatIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallGridBeatIndicator.this.alphas[i11] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallGridBeatIndicator.this.postInvalidate();
                }
            });
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
                paint.setAlpha(this.alphas[(i11 * 3) + i12]);
                canvas.drawCircle(0.0f, 0.0f, width, paint);
                canvas.restore();
            }
        }
    }
}
