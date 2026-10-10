package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUSplitScreenFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_SPLIT_SCREEN = 1000;
    private SplitSceenParam mSplitScreenParam;
    private int mSpliteNumber = 0;
    private final int[] mSupportSplitNumber = {1, 4, 9};
    private C35849a[] mSubWindowPosition = null;

    public static class SplitSceenParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public int splitScreenNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateParams(SplitSceenParam splitSceenParam) {
        int i11 = splitSceenParam.splitScreenNumber;
        if (i11 != this.mSpliteNumber) {
            int[] iArr = this.mSupportSplitNumber;
            byte b11 = 0;
            if (i11 == iArr[0] || i11 == iArr[1] || i11 == iArr[2]) {
                this.mSpliteNumber = i11;
                this.mSubWindowPosition = new C35849a[i11];
                for (int i12 = 0; i12 < this.mSpliteNumber; i12++) {
                    this.mSubWindowPosition[i12] = new C35849a(b11);
                }
                int i13 = getOutputSize().width;
                int i14 = getOutputSize().height;
                int i15 = splitSceenParam.splitScreenNumber;
                int[] iArr2 = this.mSupportSplitNumber;
                if (i15 == iArr2[0]) {
                    C35849a c35849a = this.mSubWindowPosition[0];
                    c35849a.f77428a = 0;
                    c35849a.f77429b = 0;
                    c35849a.f77430c = i13;
                    c35849a.f77431d = i14;
                    return;
                }
                if (i15 == iArr2[1]) {
                    while (b11 < this.mSupportSplitNumber[1]) {
                        C35849a c35849a2 = this.mSubWindowPosition[b11];
                        c35849a2.f77428a = ((b11 % 2) * i13) / 2;
                        c35849a2.f77429b = ((b11 / 2) * i14) / 2;
                        c35849a2.f77430c = i13 / 2;
                        c35849a2.f77431d = i14 / 2;
                        b11++;
                    }
                    return;
                }
                if (i15 == iArr2[2]) {
                    for (int i16 = 0; i16 < this.mSupportSplitNumber[2]; i16++) {
                        C35849a c35849a3 = this.mSubWindowPosition[i16];
                        c35849a3.f77428a = ((i16 % 3) * i13) / 3;
                        c35849a3.f77429b = ((i16 / 3) * i14) / 3;
                        c35849a3.f77430c = i13 / 3;
                        c35849a3.f77431d = i14 / 3;
                    }
                }
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i11, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.mSubWindowPosition == null) {
            super.onDraw(i11, gLTexture, floatBuffer, floatBuffer2);
        }
        for (C35849a c35849a : this.mSubWindowPosition) {
            if (c35849a != null) {
                GLES20.glViewport(c35849a.f77428a, c35849a.f77429b, c35849a.f77430c, c35849a.f77431d);
            }
            super.onDraw(i11, gLTexture, floatBuffer, floatBuffer2);
        }
        GLES20.glViewport(0, 0, getOutputSize().width, getOutputSize().height);
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j11) {
        super.setNextFrameTimestamp(j11);
        if (this.mSplitScreenParam == null) {
            this.mSplitScreenParam = new SplitSceenParam();
        }
        long jAbs = Math.abs(j11 - this.mEffectStartTime);
        if (jAbs <= 1000) {
            this.mSplitScreenParam.splitScreenNumber = 4;
        } else if (jAbs <= 2000) {
            this.mSplitScreenParam.splitScreenNumber = 9;
        } else {
            this.mEffectStartTime = -1L;
        }
        updateParams(this.mSplitScreenParam);
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUSplitScreenFilter$a */
    public static class C35849a {

        /* JADX INFO: renamed from: a */
        int f77428a;

        /* JADX INFO: renamed from: b */
        public int f77429b;

        /* JADX INFO: renamed from: c */
        public int f77430c;

        /* JADX INFO: renamed from: d */
        public int f77431d;

        private C35849a() {
            this.f77428a = 0;
            this.f77429b = 0;
            this.f77430c = 0;
            this.f77431d = 0;
        }

        public /* synthetic */ C35849a(byte b11) {
            this();
        }
    }
}
