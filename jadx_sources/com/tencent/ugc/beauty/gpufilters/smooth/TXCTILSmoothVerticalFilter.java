package com.tencent.ugc.beauty.gpufilters.smooth;

import android.opengl.GLES20;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class TXCTILSmoothVerticalFilter extends TXCGPUTwoInputFilter {
    private static final String TAG = "SmoothVertical";
    private float mBeautyLevel;
    private int mSmoothDegreeUniform;
    private int mTexelHeightOffsetLocation;
    private int mTexelWidthOffsetLocation;

    public TXCTILSmoothVerticalFilter() {
        super(null, null);
        this.mTexelWidthOffsetLocation = -1;
        this.mTexelHeightOffsetLocation = -1;
        this.mSmoothDegreeUniform = -1;
        this.mBeautyLevel = 0.0f;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return isLessOrEqualZero(this.mBeautyLevel);
    }

    public void setBeautyLevel(float f11) {
        LiteavLog.m76087i(TAG, "setBeautyLevel ".concat(String.valueOf(f11)));
        this.mBeautyLevel = f11;
        setFloatOnDraw(this.mSmoothDegreeUniform, f11);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public int buildProgram() {
        if (LiteavSystemInfo.getBrand().equals("samsung") && LiteavSystemInfo.getModel().equals("GT-I9500") && LiteavSystemInfo.getSystemOSVersion().equals("4.3")) {
            LiteavLog.m76079d(TAG, "SAMSUNG_S4 GT-I9500 + Android 4.3; use diffrent shader!");
            return NativeLoad.nativeLoadGLProgram(15);
        }
        return NativeLoad.nativeLoadGLProgram(5);
    }

    @Override // com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mTexelWidthOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.mTexelHeightOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
        this.mSmoothDegreeUniform = GLES20.glGetUniformLocation(getProgramId(), "smoothDegree");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        super.onOutputSizeChanged(i11, i12);
        float f11 = 4.0f;
        if (i11 <= i12 ? i11 < 540 : i12 < 540) {
            f11 = 2.0f;
        }
        LiteavLog.m76087i(TAG, "mTextureRation ".concat(String.valueOf(f11)));
        setFloatOnDraw(this.mTexelWidthOffsetLocation, f11 / i11);
        setFloatOnDraw(this.mTexelHeightOffsetLocation, f11 / i12);
    }
}
