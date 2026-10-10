package com.tencent.ugc.videobase.yuv;

import android.opengl.GLES20;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUImageYUVOutputFilter extends TXCGPUImageFilter {
    private int mUniformConvertMatrix;
    private int mUniformConvertOffset;
    private int mUniformHeight;
    private int mUniformWidth;

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.TXCGPUImageYUVOutputFilter$1 */
    public static /* synthetic */ class C358351 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77401a;

        static {
            int[] iArr = new int[GLConstants.ColorRange.values().length];
            f77401a = iArr;
            try {
                iArr[GLConstants.ColorRange.FULL_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77401a[GLConstants.ColorRange.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77401a[GLConstants.ColorRange.VIDEO_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private float[] getConvertMatrix() {
        GLConstants.ColorSpace colorSpace = this.mColorSpace;
        if (colorSpace == null || colorSpace == GLConstants.ColorSpace.UNKNOWN) {
            colorSpace = GLConstants.ColorSpace.BT601;
        }
        GLConstants.ColorRange colorRange = this.mColorRange;
        if (colorRange == null || colorRange == GLConstants.ColorRange.UNKNOWN) {
            colorRange = GLConstants.ColorRange.VIDEO_RANGE;
        }
        if (colorSpace == GLConstants.ColorSpace.BT601) {
            if (colorRange == GLConstants.ColorRange.VIDEO_RANGE) {
                return TXCYUVRGBConvertMatrix.T_TX_RGB_2_YUV_601_VIDEO_RANGE_MATRIX;
            }
            if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
                return TXCYUVRGBConvertMatrix.T_TX_RGB_2_YUV_601_FULL_RANGE_MATRIX;
            }
        } else if (colorSpace == GLConstants.ColorSpace.BT709) {
            if (colorRange == GLConstants.ColorRange.VIDEO_RANGE) {
                return TXCYUVRGBConvertMatrix.T_TX_RGB_2_YUV_709_VIDEO_RANGE_MATRIX;
            }
            if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
                return TXCYUVRGBConvertMatrix.T_TX_RGB_2_YUV_709_Full_RANGE_MATRIX;
            }
        }
        return TXCYUVRGBConvertMatrix.T_TX_RGB_2_YUV_601_VIDEO_RANGE_MATRIX;
    }

    private float[] getConvertOffset() {
        return C358351.f77401a[this.mColorRange.ordinal()] != 1 ? TXCYUVRGBConvertMatrix.TX_RGB_2_YUV_VIDEO_RANGE_OFFSET : TXCYUVRGBConvertMatrix.TX_RGB_2_YUV_FULL_RANGE_OFFSET;
    }

    public static /* synthetic */ void lambda$setColorFormat$0(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        GLES20.glUniformMatrix3fv(tXCGPUImageYUVOutputFilter.mUniformConvertMatrix, 1, false, tXCGPUImageYUVOutputFilter.getConvertMatrix(), 0);
        GLES20.glUniform3fv(tXCGPUImageYUVOutputFilter.mUniformConvertOffset, 1, tXCGPUImageYUVOutputFilter.getConvertOffset(), 0);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        if (colorRange == this.mColorRange && colorSpace == this.mColorSpace) {
            return;
        }
        super.setColorFormat(colorRange, colorSpace);
        runOnDraw(RunnableC35840e.m79325a(this));
    }

    public TXCGPUImageYUVOutputFilter(String str, String str2) {
        super(str, str2);
    }

    public static /* synthetic */ void lambda$onOutputSizeChanged$1(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        GLES20.glUseProgram(tXCGPUImageYUVOutputFilter.getProgramId());
        GLES20.glUniform1f(tXCGPUImageYUVOutputFilter.mUniformWidth, tXCGPUImageYUVOutputFilter.mOutputSize.width);
        GLES20.glUniform1f(tXCGPUImageYUVOutputFilter.mUniformHeight, tXCGPUImageYUVOutputFilter.mOutputSize.height);
        GLES20.glUniformMatrix3fv(tXCGPUImageYUVOutputFilter.mUniformConvertMatrix, 1, false, tXCGPUImageYUVOutputFilter.getConvertMatrix(), 0);
        GLES20.glUniform3fv(tXCGPUImageYUVOutputFilter.mUniformConvertOffset, 1, tXCGPUImageYUVOutputFilter.getConvertOffset(), 0);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mUniformWidth = GLES20.glGetUniformLocation(getProgramId(), "width");
        this.mUniformHeight = GLES20.glGetUniformLocation(getProgramId(), "height");
        this.mUniformConvertMatrix = GLES20.glGetUniformLocation(getProgramId(), "convertMatrix");
        this.mUniformConvertOffset = GLES20.glGetUniformLocation(getProgramId(), TypedValues.CycleType.S_WAVE_OFFSET);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        super.onOutputSizeChanged(i11, i12);
        runOnDraw(RunnableC35841f.m79326a(this));
    }
}
