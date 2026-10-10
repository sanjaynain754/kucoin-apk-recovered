package com.tencent.ugc.videoprocessor.watermark.data;

import android.graphics.Bitmap;
import com.tencent.ugc.TXVideoEditConstants;

/* JADX INFO: loaded from: classes2.dex */
public class TailWaterMark extends WaterMark {
    public float mBlurLevel;
    private int mDuration;
    public float mMarkAlphaLevel;
    private long mStartTime;

    public int getDuration() {
        return this.mDuration;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public TailWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j11, int i11) {
        super(bitmap, tXRect);
        this.mStartTime = j11;
        this.mDuration = i11;
        this.mBlurLevel = 0.0f;
        this.mMarkAlphaLevel = 1.0f;
    }

    @Override // com.tencent.ugc.videoprocessor.watermark.data.WaterMark
    public void release() {
        super.release();
    }
}
