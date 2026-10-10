package com.tencent.ugc;

import android.opengl.GLES20;
import com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes2.dex */
public class UGCWatermarkAlphaTextureFilter extends TXCGPUWatermarkFilter {
    private static final String WATERMARK_ALPHA_FRAG = "varying lowp vec2 textureCoordinate;\n   \n  uniform sampler2D inputImageTexture;\n  uniform mediump float alphaBlend;\n  \n  void main()\n  {\n      mediump vec4 color = texture2D(inputImageTexture, textureCoordinate);\n       if (0.0 == color.a){\n            gl_FragColor = color;\n       }else{\n            gl_FragColor = vec4(color.rgb, alphaBlend);\n       } \n  }\n";
    private int mAlphaUniform;
    private boolean mIsShowBackImageMoment;

    @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        this.mRenderObjects = null;
    }

    public UGCWatermarkAlphaTextureFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, WATERMARK_ALPHA_FRAG);
        this.mAlphaUniform = -1;
        this.mIsShowBackImageMoment = false;
    }

    public static /* synthetic */ void lambda$setTextureWatermark$1(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, int i11, int i12, int i13, float f11, float f12, float f13) {
        if (uGCWatermarkAlphaTextureFilter.mRenderObjects == null) {
            uGCWatermarkAlphaTextureFilter.mRenderObjects = new TXCGPUWatermarkFilter.WatermarkRenderObject[1];
        }
        TXCGPUWatermarkFilter.WatermarkRenderObject[] watermarkRenderObjectArr = uGCWatermarkAlphaTextureFilter.mRenderObjects;
        if (watermarkRenderObjectArr[0] == null) {
            watermarkRenderObjectArr[0] = new TXCGPUWatermarkFilter.WatermarkRenderObject();
        }
        if (i11 == -1) {
            uGCWatermarkAlphaTextureFilter.mRenderObjects[0].releaseResource();
            uGCWatermarkAlphaTextureFilter.mRenderObjects[0] = null;
        } else {
            uGCWatermarkAlphaTextureFilter.mRenderObjects[0].textureId = i11;
            uGCWatermarkAlphaTextureFilter.calculateOffsetMatrix(i12, i13, f11, f12, f13, 0);
        }
    }

    @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        if (!this.mDrawWaterMarkEnabled) {
            return;
        }
        GLES20.glEnable(3042);
        if (this.mIsShowBackImageMoment) {
            GLES20.glBlendFunc(773, 772);
        } else {
            GLES20.glBlendFunc(770, 771);
        }
        GLES20.glActiveTexture(33984);
        int i11 = 0;
        while (true) {
            TXCGPUWatermarkFilter.WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
            if (i11 >= watermarkRenderObjectArr.length) {
                GLES20.glDisable(3042);
                return;
            }
            if (watermarkRenderObjectArr[i11] != null) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.mRenderObjects[i11].textureId);
                GLES20.glUniform1i(this.mGLUniformTexture, 0);
                GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, 5126, false, 8, (Buffer) this.mRenderObjects[i11].vertexCoordsBuffer);
                GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
                GLES20.glVertexAttribPointer(this.mGLAttribTextureCoord, 2, 5126, false, 0, (Buffer) TXCGPUWatermarkFilter.TEXTURE_COORDS_BUFFER);
                GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord);
                GLES20.glDrawElements(4, TXCGPUWatermarkFilter.DRAW_ORDER.length, 5123, TXCGPUWatermarkFilter.DRAW_ORDER_BUFFER);
                GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
                GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoord);
            }
            i11++;
        }
    }

    public void setAlpha(float f11) {
        setFloatOnDraw(this.mAlphaUniform, f11);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        this.mAlphaUniform = GLES20.glGetUniformLocation(getProgramId(), "alphaBlend");
        this.mSrcBlendMode = 770;
        setAlpha(1.0f);
    }

    public void setShowBackImageMoment(boolean z11) {
        runOnDraw(RunnableC35739hp.m79233a(this, z11));
    }

    public void setTextureWatermark(int i11, int i12, int i13, float f11, float f12, float f13) {
        runOnDraw(RunnableC35740hq.m79234a(this, i11, i12, i13, f11, f12, f13));
    }
}
