package com.tencent.ugc.videobase.yuv;

import android.opengl.GLES20;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUImageNV12InputFilter extends TXCGPUImageYUVInputFilter {
    private static final String NV21_RENDER_SHADER = "precision highp float;\nvarying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D uvTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuv;\n    highp vec3 rgb;\n\n    yuv.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuv.y = texture2D(uvTexture, textureCoordinate).r;\n    yuv.z = texture2D(uvTexture, textureCoordinate).a;\n    yuv += offset;\n    rgb = convertMatrix * yuv;\n\n    gl_FragColor = vec4(rgb, 1.0);\n}";
    private int mUniformConvertMatrix;
    private int mUniformConvertOffset;

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.yuv.TXCGPUImageNV12InputFilter$1 */
    public static /* synthetic */ class C358341 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77400a;

        static {
            int[] iArr = new int[GLConstants.ColorRange.values().length];
            f77400a = iArr;
            try {
                iArr[GLConstants.ColorRange.FULL_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77400a[GLConstants.ColorRange.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77400a[GLConstants.ColorRange.VIDEO_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TXCGPUImageNV12InputFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, NV21_RENDER_SHADER);
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
        return C358341.f77400a[this.mColorRange.ordinal()] != 1 ? TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_VIDEO_RANGE_OFFSET : TXCYUVRGBConvertMatrix.TX_YUV_2_RGB_FULL_RANGE_OFFSET;
    }

    public static /* synthetic */ void lambda$setColorFormat$1(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        GLES20.glUniformMatrix3fv(tXCGPUImageNV12InputFilter.mUniformConvertMatrix, 1, false, tXCGPUImageNV12InputFilter.getConvertMatrix(), 0);
        GLES20.glUniform3fv(tXCGPUImageNV12InputFilter.mUniformConvertOffset, 1, tXCGPUImageNV12InputFilter.getConvertOffset(), 0);
    }

    @Override // com.tencent.ugc.videobase.yuv.TXCGPUImageYUVInputFilter
    public int getUvFormat() {
        return 6410;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        if (colorRange == this.mColorRange && colorSpace == this.mColorSpace) {
            return;
        }
        super.setColorFormat(colorRange, colorSpace);
        runOnDraw(RunnableC35839d.m79324a(this));
    }

    public static /* synthetic */ void lambda$onInit$0(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        GLES20.glUseProgram(tXCGPUImageNV12InputFilter.getProgramId());
        GLES20.glUniform3fv(tXCGPUImageNV12InputFilter.mUniformConvertOffset, 1, tXCGPUImageNV12InputFilter.getConvertOffset(), 0);
        GLES20.glUniformMatrix3fv(tXCGPUImageNV12InputFilter.mUniformConvertMatrix, 1, false, tXCGPUImageNV12InputFilter.getConvertMatrix(), 0);
    }

    @Override // com.tencent.ugc.videobase.yuv.TXCGPUImageYUVInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mUniformConvertMatrix = GLES20.glGetUniformLocation(getProgramId(), "convertMatrix");
        this.mUniformConvertOffset = GLES20.glGetUniformLocation(getProgramId(), TypedValues.CycleType.S_WAVE_OFFSET);
        runOnDraw(RunnableC35838c.m79323a(this));
    }
}
