package com.tencent.ugc.videoprocessor.watermark;

import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.videoprocessor.data.Resolution;

/* JADX INFO: loaded from: classes2.dex */
public class PasterBase {
    protected Size mRenderSize;

    public TXVideoEditConstants.TXRect calculateRect(int i11, int i12, int i13, TXVideoEditConstants.TXRect tXRect) {
        Size size = this.mRenderSize;
        if (size == null) {
            return null;
        }
        int i14 = size.width;
        int i15 = size.height;
        Resolution resolution = new Resolution();
        float f11 = i11;
        float f12 = (i14 * 1.0f) / f11;
        float f13 = i12;
        float f14 = (i15 * 1.0f) / f13;
        if (i13 != 2 ? f12 < f14 : f12 > f14) {
            f12 = f14;
        }
        resolution.width = (int) (f11 * f12);
        resolution.height = (int) (f13 * f12);
        TXVideoEditConstants.TXRect tXRect2 = new TXVideoEditConstants.TXRect();
        float f15 = tXRect.f76678x;
        int i16 = resolution.width;
        tXRect2.f76678x = (f15 - ((i14 - i16) / 2)) / i16;
        float f16 = tXRect.f76679y;
        int i17 = resolution.height;
        tXRect2.f76679y = (f16 - ((i15 - i17) / 2)) / i17;
        tXRect2.width = tXRect.width / i16;
        return tXRect2;
    }

    public void clear() {
    }

    public void normalized(int i11, int i12, int i13) {
    }
}
