package com.tencent.ugc.videobase.yuv;

import android.opengl.GLES20;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUImageI420InputFilter extends TXCGPUImageYUVInputFilter {
    private static final String I420_RENDER_SHADER = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D uvTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform\n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor;\n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}";
    private int mUniformConvertMatrix;
    private int mUniformConvertOffset;

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.TXCGPUImageI420InputFilter$1 */
    public static /* synthetic */ class C358331 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77399a;

        static {
            int[] iArr = new int[GLConstants.ColorRange.values().length];
            f77399a = iArr;
            try {
                iArr[GLConstants.ColorRange.FULL_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77399a[GLConstants.ColorRange.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77399a[GLConstants.ColorRange.VIDEO_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TXCGPUImageI420InputFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, I420_RENDER_SHADER);
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
                return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_601_VIDEO_RANGE_MATRIX;
            }
            if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
                return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_601_FULL_RANGE_MATRIX;
            }
        } else if (colorSpace == GLConstants.ColorSpace.BT709) {
            if (colorRange == GLConstants.ColorRange.VIDEO_RANGE) {
                return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_709_VIDEO_RANGE_MATRIX;
            }
            if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
                return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_709_FULL_RANGE_MATRIX;
            }
        }
        return TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_601_VIDEO_RANGE_MATRIX;
    }

    private float[] getConvertOffset() {
        return C358331.f77399a[this.mColorRange.ordinal()] != 1 ? TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_VIDEO_RANGE_OFFSET : TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_FULL_RANGE_OFFSET;
    }

    public static /* synthetic */ void lambda$setColorFormat$1(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        GLES20.glUniformMatrix3fv(tXCGPUImageI420InputFilter.mUniformConvertMatrix, 1, false, tXCGPUImageI420InputFilter.getConvertMatrix(), 0);
        GLES20.glUniform3fv(tXCGPUImageI420InputFilter.mUniformConvertOffset, 1, tXCGPUImageI420InputFilter.getConvertOffset(), 0);
    }

    @Override // com.tencent.ugc.videobase.yuv.TXCGPUImageYUVInputFilter
    public int getUvFormat() {
        return 6409;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        if (colorRange == this.mColorRange && colorSpace == this.mColorSpace) {
            return;
        }
        super.setColorFormat(colorRange, colorSpace);
        runOnDraw(RunnableC35837b.m79322a(this));
    }

    public static /* synthetic */ void lambda$onInit$0(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        GLES20.glUseProgram(tXCGPUImageI420InputFilter.getProgramId());
        GLES20.glUniform3fv(tXCGPUImageI420InputFilter.mUniformConvertOffset, 1, tXCGPUImageI420InputFilter.getConvertOffset(), 0);
        GLES20.glUniformMatrix3fv(tXCGPUImageI420InputFilter.mUniformConvertMatrix, 1, false, tXCGPUImageI420InputFilter.getConvertMatrix(), 0);
    }

    @Override // com.tencent.ugc.videobase.yuv.TXCGPUImageYUVInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mUniformConvertMatrix = GLES20.glGetUniformLocation(getProgramId(), "convertMatrix");
        this.mUniformConvertOffset = GLES20.glGetUniformLocation(getProgramId(), TypedValues.CycleType.S_WAVE_OFFSET);
        runOnDraw(RunnableC35836a.m79321a(this));
    }
}
