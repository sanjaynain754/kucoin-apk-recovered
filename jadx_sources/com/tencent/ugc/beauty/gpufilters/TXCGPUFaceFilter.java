package com.tencent.ugc.beauty.gpufilters;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.beauty.NativeLoad;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.filter.TXCGPUThreeInputFilter;
import com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUFaceFilter extends TXCGPUImageFilter {
    private static final String bShaderFragmentShader = "precision highp float;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvoid main()\n{\n    gl_FragColor = texture2D(inputImageTexture2, textureCoordinate2) - texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture2, textureCoordinate2);\n}\n";
    private static final String retShaderFragmentShader = "precision highp float;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\nvoid main()\n{\n    gl_FragColor = texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture3, textureCoordinate3) + texture2D(inputImageTexture2, textureCoordinate2);\n}\n";
    private boolean mCustomizeSamplingRatio;
    private int mSamplingHeight;
    private int mSamplingWidth;
    private float mSamplingRatio = 4.0f;
    private final FloatBuffer mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
    private final FloatBuffer mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);
    private final TXCGPUBoxBlurFilter mBoxFilter = new TXCGPUBoxBlurFilter();
    private final C35524c mVarShader = new C35524c();
    private final C35522a mBShader = new C35522a(bShaderFragmentShader);
    private final C35523b mRetShader = new C35523b(retShaderFragmentShader);
    private final TXCGPUImageFilter mNormalFilter = new TXCGPUImageFilter();

    /* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.TXCGPUFaceFilter$a */
    public static class C35522a extends TXCGPUTwoInputFilter {
        public C35522a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.TXCGPUFaceFilter$b */
    public static class C35523b extends TXCGPUThreeInputFilter {
        public C35523b(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.TXCGPUFaceFilter$c */
    public static class C35524c extends TXCGPUTwoInputFilter {

        /* JADX INFO: renamed from: a */
        private int f76797a;

        /* JADX INFO: renamed from: b */
        private int f76798b;

        public C35524c() {
            super(null, null);
        }

        @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public final int buildProgram() {
            return NativeLoad.nativeLoadGLProgram(2);
        }

        @Override // com.tencent.ugc.videobase.filter.TXCGPUTwoInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public final void onInit(GLTexturePool gLTexturePool) {
            super.onInit(gLTexturePool);
            this.f76797a = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
            this.f76798b = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
        }

        @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public final void onOutputSizeChanged(int i11, int i12) {
            super.onOutputSizeChanged(i11, i12);
            setFloatOnDraw(this.f76797a, 1.5f / this.mOutputSize.width);
            setFloatOnDraw(this.f76798b, 1.5f / this.mOutputSize.height);
        }
    }

    public void setSamplingRatio(float f11) {
        this.mSamplingRatio = f11;
        this.mCustomizeSamplingRatio = true;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i11, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLTexture gLTextureObtain;
        int id2;
        if (!isInitialized()) {
            return;
        }
        runPendingOnDrawTasks();
        int i12 = this.mSamplingWidth;
        Size size = this.mOutputSize;
        if (i12 == size.width && this.mSamplingHeight == size.height) {
            gLTextureObtain = null;
            id2 = i11;
        } else {
            gLTextureObtain = this.mTexturePool.obtain(i12, this.mSamplingHeight);
            GLES20.glViewport(0, 0, this.mSamplingWidth, this.mSamplingHeight);
            this.mNormalFilter.onDraw(i11, gLTextureObtain, floatBuffer, floatBuffer2);
            id2 = gLTextureObtain.getId();
        }
        GLTexture gLTextureObtain2 = this.mTexturePool.obtain(this.mSamplingWidth, this.mSamplingHeight);
        GLTexture gLTextureObtain3 = this.mTexturePool.obtain(this.mSamplingWidth, this.mSamplingHeight);
        this.mBoxFilter.onDraw(id2, gLTextureObtain2, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
        this.mVarShader.setSecondInputTexture(gLTextureObtain2.getId());
        this.mVarShader.onDraw(id2, gLTextureObtain3, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
        if (gLTextureObtain != null) {
            gLTextureObtain.release();
        }
        GLTexture gLTextureObtain4 = this.mTexturePool.obtain(this.mSamplingWidth, this.mSamplingHeight);
        this.mBShader.setSecondInputTexture(gLTextureObtain2.getId());
        this.mBShader.onDraw(gLTextureObtain3.getId(), gLTextureObtain4, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
        gLTextureObtain2.release();
        GLTexture gLTextureObtain5 = this.mTexturePool.obtain(this.mSamplingWidth, this.mSamplingHeight);
        this.mBoxFilter.onDraw(gLTextureObtain3.getId(), gLTextureObtain5, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
        gLTextureObtain3.release();
        GLTexture gLTextureObtain6 = this.mTexturePool.obtain(this.mSamplingWidth, this.mSamplingHeight);
        this.mBoxFilter.onDraw(gLTextureObtain4.getId(), gLTextureObtain6, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
        gLTextureObtain4.release();
        if (this.mSamplingRatio != 1.0f) {
            GLTexturePool gLTexturePool = this.mTexturePool;
            Size size2 = this.mOutputSize;
            GLTexture gLTextureObtain7 = gLTexturePool.obtain(size2.width, size2.height);
            GLTexturePool gLTexturePool2 = this.mTexturePool;
            Size size3 = this.mOutputSize;
            GLTexture gLTextureObtain8 = gLTexturePool2.obtain(size3.width, size3.height);
            Size size4 = this.mOutputSize;
            GLES20.glViewport(0, 0, size4.width, size4.height);
            this.mNormalFilter.onDraw(gLTextureObtain5.getId(), gLTextureObtain7, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
            this.mNormalFilter.onDraw(gLTextureObtain6.getId(), gLTextureObtain8, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
            this.mRetShader.setSecondInputTexture(gLTextureObtain8.getId());
            this.mRetShader.setThirdInputTexture(i11);
            this.mRetShader.onDraw(gLTextureObtain7.getId(), gLTexture, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
            gLTextureObtain7.release();
            gLTextureObtain8.release();
        } else {
            this.mRetShader.setSecondInputTexture(gLTextureObtain6.getId());
            this.mRetShader.setThirdInputTexture(i11);
            this.mRetShader.onDraw(gLTextureObtain5.getId(), gLTexture, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
        }
        gLTextureObtain6.release();
        gLTextureObtain5.release();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mBoxFilter.initialize(gLTexturePool);
        this.mVarShader.initialize(gLTexturePool);
        this.mBShader.initialize(gLTexturePool);
        this.mRetShader.initialize(gLTexturePool);
        this.mNormalFilter.initialize(gLTexturePool);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        super.onOutputSizeChanged(i11, i12);
        if (!this.mCustomizeSamplingRatio) {
            if (i11 < i12) {
                if (i11 < 540) {
                    this.mSamplingRatio = 1.0f;
                } else {
                    this.mSamplingRatio = 4.0f;
                }
            } else if (i12 < 540) {
                this.mSamplingRatio = 1.0f;
            } else {
                this.mSamplingRatio = 4.0f;
            }
        }
        if (Float.compare(this.mSamplingRatio, 1.0f) == 0) {
            this.mSamplingWidth = i11;
            this.mSamplingHeight = i12;
        } else {
            float f11 = this.mSamplingRatio;
            this.mSamplingWidth = (int) (i11 / f11);
            this.mSamplingHeight = (int) (i12 / f11);
        }
        this.mNormalFilter.onOutputSizeChanged(this.mSamplingWidth, this.mSamplingHeight);
        this.mVarShader.onOutputSizeChanged(this.mSamplingWidth, this.mSamplingHeight);
        this.mBShader.onOutputSizeChanged(this.mSamplingWidth, this.mSamplingHeight);
        this.mRetShader.onOutputSizeChanged(i11, i12);
        this.mBoxFilter.onOutputSizeChanged(this.mSamplingWidth, this.mSamplingHeight);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        this.mBoxFilter.uninitialize();
        this.mVarShader.uninitialize();
        this.mBShader.uninitialize();
        this.mRetShader.uninitialize();
        this.mNormalFilter.uninitialize();
    }
}
