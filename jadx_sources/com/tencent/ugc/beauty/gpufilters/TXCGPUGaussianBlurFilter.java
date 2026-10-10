package com.tencent.ugc.beauty.gpufilters;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUGaussianBlurFilter extends TXCGPUImageFilterChain {
    private final C35525a mHeightFilter;
    private final C35525a mWidthFilter;

    /* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.TXCGPUGaussianBlurFilter$a */
    public static class C35525a extends TXCGPUImageFilter {

        /* JADX INFO: renamed from: a */
        private int f76799a;

        /* JADX INFO: renamed from: b */
        private int f76800b;

        /* JADX INFO: renamed from: c */
        private float f76801c;

        /* JADX INFO: renamed from: d */
        private float f76802d;

        /* JADX INFO: renamed from: a */
        public final void m79025a(float f11, float f12) {
            this.f76801c = f11;
            this.f76802d = f12;
            m79023a();
        }

        public C35525a() {
            super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nconst int GAUSSIAN_SAMPLES = 9;\n\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n\nvarying vec2 textureCoordinate;\nvarying vec2 blurCoordinates[GAUSSIAN_SAMPLES];\n\nvoid main()\n{\n gl_Position = position;\n textureCoordinate = inputTextureCoordinate.xy;\n \n // Calculate the positions for the blur\n int multiplier = 0;\n vec2 blurStep;\n   vec2 singleStepOffset = vec2(texelHeightOffset, texelWidthOffset);\n    \n for (int i = 0; i < GAUSSIAN_SAMPLES; i++)\n   {\n  multiplier = (i - ((GAUSSIAN_SAMPLES - 1) / 2));\n       // Blur in x (horizontal)\n       blurStep = float(multiplier) * singleStepOffset;\n  blurCoordinates[i] = inputTextureCoordinate.xy + blurStep;\n }\n}\n", "uniform sampler2D inputImageTexture;\n\nconst lowp int GAUSSIAN_SAMPLES = 9;\n\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 blurCoordinates[GAUSSIAN_SAMPLES];\n\nvoid main()\n{\n lowp vec3 sum = vec3(0.0);\n   lowp vec4 fragColor=texture2D(inputImageTexture,textureCoordinate);\n \n    sum += texture2D(inputImageTexture, blurCoordinates[0]).rgb * 0.05;\n    sum += texture2D(inputImageTexture, blurCoordinates[1]).rgb * 0.09;\n    sum += texture2D(inputImageTexture, blurCoordinates[2]).rgb * 0.12;\n    sum += texture2D(inputImageTexture, blurCoordinates[3]).rgb * 0.15;\n    sum += texture2D(inputImageTexture, blurCoordinates[4]).rgb * 0.18;\n    sum += texture2D(inputImageTexture, blurCoordinates[5]).rgb * 0.15;\n    sum += texture2D(inputImageTexture, blurCoordinates[6]).rgb * 0.12;\n    sum += texture2D(inputImageTexture, blurCoordinates[7]).rgb * 0.09;\n    sum += texture2D(inputImageTexture, blurCoordinates[8]).rgb * 0.05;\n\n gl_FragColor = vec4(sum,fragColor.a);\n}");
        }

        @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public final void onInit(GLTexturePool gLTexturePool) {
            super.onInit(gLTexturePool);
            this.f76799a = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
            this.f76800b = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
        }

        @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
        public final void onOutputSizeChanged(int i11, int i12) {
            super.onOutputSizeChanged(i11, i12);
            m79023a();
        }

        /* JADX INFO: renamed from: a */
        private void m79023a() {
            runOnDraw(RunnableC35527a.m79027a(this));
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m79024a(C35525a c35525a) {
            GLES20.glUseProgram(c35525a.getProgramId());
            GLES20.glUniform1f(c35525a.f76799a, c35525a.f76801c / c35525a.mOutputSize.width);
            GLES20.glUniform1f(c35525a.f76800b, c35525a.f76802d / c35525a.mOutputSize.height);
        }
    }

    public TXCGPUGaussianBlurFilter() {
        this(1.0f);
    }

    public TXCGPUGaussianBlurFilter(float f11) {
        C35525a c35525a = new C35525a();
        this.mWidthFilter = c35525a;
        C35525a c35525a2 = new C35525a();
        this.mHeightFilter = c35525a2;
        c35525a.m79025a(f11, 0.0f);
        c35525a2.m79025a(0.0f, f11);
        addFilter(c35525a);
        addFilter(c35525a2);
    }

    public void setBlurSize(float f11) {
        this.mWidthFilter.m79025a(f11, 0.0f);
        this.mHeightFilter.m79025a(0.0f, f11);
    }
}
