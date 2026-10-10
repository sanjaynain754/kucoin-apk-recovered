package com.tencent.ugc.beauty.gpufilters.vague;

import android.opengl.GLES20;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGChannelBeautyFilter extends TXCGPUImageFilter {
    private final float[] mBeautyParam;
    private int mBeautyParamsHandle;
    private int mSingleStepOffsetLoc;

    public TXCGChannelBeautyFilter() {
        super(null, null);
        this.mSingleStepOffsetLoc = -1;
        this.mBeautyParamsHandle = -1;
        this.mBeautyParam = new float[]{0.5f, 0.0f, 0.0f, 0.0f};
    }

    private void setBeautyParam(float[] fArr) {
        setFloatVec4OnDraw(this.mBeautyParamsHandle, fArr);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public int buildProgram() {
        return NativeLoad.nativeLoadGLProgram(14);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return isLessOrEqualZero(this.mBeautyParam[0]) && isLessOrEqualZero(this.mBeautyParam[1]) && isLessOrEqualZero(this.mBeautyParam[2]);
    }

    public void setBeautyLevel(float f11) {
        float[] fArr = this.mBeautyParam;
        fArr[0] = f11;
        setBeautyParam(fArr);
    }

    public void setRuddyLevel(float f11) {
        float[] fArr = this.mBeautyParam;
        fArr[2] = f11;
        setBeautyParam(fArr);
    }

    public void setTexSize(int i11, int i12) {
        setFloatVec2OnDraw(this.mSingleStepOffsetLoc, new float[]{2.0f / i11, 2.0f / i12});
    }

    public void setWhitenessLevel(float f11) {
        float[] fArr = this.mBeautyParam;
        fArr[1] = f11;
        setBeautyParam(fArr);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mSingleStepOffsetLoc = GLES20.glGetUniformLocation(getProgramId(), "singleStepOffset");
        this.mBeautyParamsHandle = GLES20.glGetUniformLocation(getProgramId(), "beautyParams");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        super.onOutputSizeChanged(i11, i12);
        setTexSize(i11, i12);
    }
}
