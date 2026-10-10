package com.tencent.ugc.beauty.gpufilters.smooth;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class TXCBeautyBlend extends TXCGPUTwoInputFilter {
    private static final String TAG = "BeautyBlend";
    private float mContract;
    private int mContrastUniform;
    private int mRuddyDegreeUniform;
    private float mRuddyLevel;
    private int mWhiteDegreeUniform;
    private float mWhiteLevel;

    public TXCBeautyBlend() {
        super(null);
        this.mContrastUniform = -1;
        this.mWhiteDegreeUniform = -1;
        this.mRuddyDegreeUniform = -1;
        this.mWhiteLevel = 0.0f;
        this.mRuddyLevel = 0.0f;
        this.mContract = 0.0f;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public int buildProgram() {
        return NativeLoad.nativeLoadGLProgram(12);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return isLessOrEqualZero(this.mWhiteLevel) && isLessOrEqualZero(this.mRuddyLevel) && isLessOrEqualZero(this.mContract);
    }

    public void setContract(float f11) {
        LiteavLog.m76087i(TAG, "setContract ".concat(String.valueOf(f11)));
        this.mContract = f11;
        setFloatOnDraw(this.mContrastUniform, (f11 / 10.0f) + 1.0f);
    }

    public void setRuddyLevel(float f11) {
        LiteavLog.m76087i(TAG, "setRuddyLevel ".concat(String.valueOf(f11)));
        this.mRuddyLevel = f11;
        setFloatOnDraw(this.mRuddyDegreeUniform, f11 / 2.0f);
    }

    public void setWhitenessLevel(float f11) {
        LiteavLog.m76087i(TAG, "setWhitenessLevel ".concat(String.valueOf(f11)));
        this.mWhiteLevel = f11;
        setFloatOnDraw(this.mWhiteDegreeUniform, f11);
    }

    @Override // com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mWhiteDegreeUniform = GLES20.glGetUniformLocation(getProgramId(), "whiteDegree");
        this.mContrastUniform = GLES20.glGetUniformLocation(getProgramId(), "contrast");
        this.mRuddyDegreeUniform = GLES20.glGetUniformLocation(getProgramId(), "ruddyDegree");
    }
}
