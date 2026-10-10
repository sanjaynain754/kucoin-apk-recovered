package com.tencent.ugc.beauty.gpufilters.smooth;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class TXCTILSmoothHorizontalFilter extends TXCGPUImageFilter {
    private static final String TAG = "SmoothHorizontal";
    private int mTexelHeightOffsetLocation;
    private int mTexelWidthOffsetLocation;

    public TXCTILSmoothHorizontalFilter() {
        super(null, null);
        this.mTexelWidthOffsetLocation = -1;
        this.mTexelHeightOffsetLocation = -1;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public int buildProgram() {
        return NativeLoad.nativeLoadGLProgram(13);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mTexelWidthOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.mTexelHeightOffsetLocation = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        super.onOutputSizeChanged(i11, i12);
        float f11 = 4.0f;
        if (i11 <= i12 ? i11 < 540 : i12 < 540) {
            f11 = 2.0f;
        }
        LiteavLog.m76087i(TAG, "m_textureRation ".concat(String.valueOf(f11)));
        setFloatOnDraw(this.mTexelWidthOffsetLocation, f11 / i11);
        setFloatOnDraw(this.mTexelHeightOffsetLocation, f11 / i12);
    }
}
