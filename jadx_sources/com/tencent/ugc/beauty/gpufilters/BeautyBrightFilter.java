package com.tencent.ugc.beauty.gpufilters;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.filter.TXCGPUThreeInputFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class BeautyBrightFilter extends TXCGPUImageFilter implements BeautyInterFace {
    private float mBeautyLevel = 0.0f;
    private float mWhiteLevel = 0.0f;
    private float mRuddyLevel = 0.0f;
    private float mSharpnessLevel = 0.0f;
    private final FloatBuffer mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
    private final FloatBuffer mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);
    private final TXCGPUFaceFilter mNewFaceFilter = new TXCGPUFaceFilter();
    private final BeautyCoreFilter mBeautyCoreFilter = new BeautyCoreFilter();
    private final TXCGPUSharpenFilter mSharpenessFilter = new TXCGPUSharpenFilter();

    public static class BeautyCoreFilter extends TXCGPUThreeInputFilter {
        private int mBeautyDegreeLocation;
        private int mBrightDegreeLocation;
        private int mRuddyLocation;

        @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public int buildProgram() {
            return NativeLoad.nativeLoadGLProgram(1);
        }

        public BeautyCoreFilter() {
            super(TXCGPUThreeInputFilter.VERTEX_THREE_INPUT_SHADER, TXCGPUImageFilter.NO_FILTER_FRAGMENT_SHADER);
            this.mBeautyDegreeLocation = -1;
            this.mBrightDegreeLocation = -1;
            this.mRuddyLocation = -1;
        }

        public void setBeautyLevel(float f11) {
            setFloatOnDraw(this.mBeautyDegreeLocation, BeautyBrightFilter.getNewBeautyLevel(f11));
        }

        public void setBrightLevel(float f11) {
            setFloatOnDraw(this.mBrightDegreeLocation, f11 / 3.0f);
        }

        public void setRuddyLevel(float f11) {
            setFloatOnDraw(this.mRuddyLocation, (f11 / 10.0f) / 2.0f);
        }

        @Override // com.tencent.ugc.videobase.filter.TXCGPUThreeInputFilter, com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public void onInit(GLTexturePool gLTexturePool) {
            super.onInit(gLTexturePool);
            this.mBeautyDegreeLocation = GLES20.glGetUniformLocation(getProgramId(), "smoothDegree");
            this.mBrightDegreeLocation = GLES20.glGetUniformLocation(getProgramId(), "brightDegree");
            this.mRuddyLocation = GLES20.glGetUniformLocation(getProgramId(), "ruddyDegree");
        }
    }

    private static float getValue(float f11, float f12, float f13) {
        return f12 + ((f13 - f12) * f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float getNewBeautyLevel(float f11) {
        if (f11 <= 1.0f) {
            return 0.1f;
        }
        double d11 = f11;
        if (d11 < 2.5d) {
            f11 = getValue((f11 - 1.0f) / 1.5f, 1.0f, 4.1f);
        } else if (f11 < 4.0f) {
            f11 = getValue((f11 - 2.5f) / 1.5f, 4.1f, 5.6f);
        } else if (d11 < 5.5d) {
            f11 = getValue((f11 - 4.0f) / 1.5f, 5.6f, 6.8f);
        } else if (d11 <= 7.0d) {
            f11 = getValue((f11 - 5.5f) / 1.5f, 6.8f, 7.0f);
        }
        return f11 / 10.0f;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return isLessOrEqualZero(this.mBeautyLevel) && isLessOrEqualZero(this.mWhiteLevel) && isLessOrEqualZero(this.mRuddyLevel) && isLessOrEqualZero(this.mSharpnessLevel);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setBeautyLevel(float f11) {
        this.mBeautyLevel = f11;
        this.mBeautyCoreFilter.setBeautyLevel(f11);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setRuddyLevel(float f11) {
        this.mRuddyLevel = f11;
        this.mBeautyCoreFilter.setRuddyLevel(f11);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setSharpenLevel(float f11) {
        float f12 = f11 / 1.5f;
        this.mSharpnessLevel = f12;
        this.mSharpenessFilter.setSharpness(f12);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setWhitenessLevel(float f11) {
        this.mWhiteLevel = f11;
        this.mBeautyCoreFilter.setBrightLevel(f11);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i11, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        FloatBuffer floatBuffer3;
        FloatBuffer floatBuffer4;
        int id2;
        int id3;
        FloatBuffer floatBuffer5;
        FloatBuffer floatBuffer6;
        if (isInitialized()) {
            runPendingOnDrawTasks();
            float f11 = this.mBeautyLevel;
            GLTexture gLTextureObtain = null;
            if (f11 <= 0.0f && this.mWhiteLevel <= 0.0f && this.mRuddyLevel <= 0.0f) {
                floatBuffer6 = floatBuffer2;
                floatBuffer5 = floatBuffer;
                id3 = i11;
            } else {
                if (f11 != 0.0f) {
                    GLTexturePool gLTexturePool = this.mTexturePool;
                    Size size = this.mOutputSize;
                    gLTextureObtain = gLTexturePool.obtain(size.width, size.height);
                    this.mNewFaceFilter.onDraw(i11, gLTextureObtain, floatBuffer, floatBuffer2);
                    id2 = gLTextureObtain.getId();
                    floatBuffer4 = this.mNormalCubeVerticesBuffer;
                    floatBuffer3 = this.mNormalTextureCoordsBuffer;
                } else {
                    floatBuffer3 = floatBuffer2;
                    floatBuffer4 = floatBuffer;
                    id2 = i11;
                }
                GLTexturePool gLTexturePool2 = this.mTexturePool;
                Size size2 = this.mOutputSize;
                GLTexture gLTextureObtain2 = gLTexturePool2.obtain(size2.width, size2.height);
                this.mBeautyCoreFilter.setSecondInputTexture(i11);
                if (this.mSharpnessLevel > 0.0f) {
                    this.mBeautyCoreFilter.onDraw(id2, gLTextureObtain2, floatBuffer4, floatBuffer3);
                } else {
                    this.mBeautyCoreFilter.onDraw(id2, gLTexture, floatBuffer4, floatBuffer3);
                }
                id3 = gLTextureObtain2.getId();
                floatBuffer5 = this.mNormalCubeVerticesBuffer;
                floatBuffer6 = this.mNormalTextureCoordsBuffer;
                if (gLTextureObtain != null) {
                    gLTextureObtain.release();
                }
                gLTextureObtain = gLTextureObtain2;
            }
            if (this.mSharpnessLevel > 0.0f || id3 == i11) {
                this.mSharpenessFilter.onDraw(id3, gLTexture, floatBuffer5, floatBuffer6);
            }
            if (gLTextureObtain != null) {
                gLTextureObtain.release();
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mNewFaceFilter.initialize(gLTexturePool);
        this.mBeautyCoreFilter.initialize(gLTexturePool);
        this.mSharpenessFilter.initialize(gLTexturePool);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        super.onOutputSizeChanged(i11, i12);
        this.mBeautyCoreFilter.onOutputSizeChanged(i11, i12);
        this.mNewFaceFilter.onOutputSizeChanged(i11, i12);
        this.mSharpenessFilter.onOutputSizeChanged(i11, i12);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        this.mBeautyCoreFilter.uninitialize();
        this.mNewFaceFilter.uninitialize();
        this.mSharpenessFilter.uninitialize();
    }
}
