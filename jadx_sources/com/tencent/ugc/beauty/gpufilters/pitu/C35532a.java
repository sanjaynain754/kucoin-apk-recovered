package com.tencent.ugc.beauty.gpufilters.pitu;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.pitu.a */
/* JADX INFO: loaded from: classes2.dex */
final class C35532a extends TXCGPUImageFilter {

    /* JADX INFO: renamed from: a */
    private final boolean f76817a;

    /* JADX INFO: renamed from: b */
    private int f76818b;

    /* JADX INFO: renamed from: c */
    private int f76819c;

    public C35532a(boolean z11) {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform float texelWidthOffset;\n uniform float texelHeightOffset;\n \n varying vec2 textureCoordinate;\n varying vec4 textureShift_1;\n varying vec4 textureShift_2;\n varying vec4 textureShift_3;\n varying vec4 textureShift_4;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n     \n     vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n     textureShift_1 = vec4(textureCoordinate - singleStepOffset,                           textureCoordinate + singleStepOffset);\n     textureShift_2 = vec4(textureCoordinate - 2.0 * singleStepOffset,                           textureCoordinate + 2.0 * singleStepOffset);\n     textureShift_3 = vec4(textureCoordinate - 3.0 * singleStepOffset,                           textureCoordinate + 3.0 * singleStepOffset);\n     textureShift_4 = vec4(textureCoordinate - 4.0 * singleStepOffset,                           textureCoordinate + 4.0 * singleStepOffset);\n }\n", "uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n varying highp vec4 textureShift_1;\n varying highp vec4 textureShift_2;\n varying highp vec4 textureShift_3;\n varying highp vec4 textureShift_4;\n \n void main()\n {\n     mediump vec3 sum = texture2D(inputImageTexture, textureCoordinate).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.zw).rgb;\n     \n     gl_FragColor = vec4(sum * 0.1111, 1.0);\n }\n");
        this.f76818b = -1;
        this.f76819c = -1;
        this.f76817a = z11;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public final void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.f76818b = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.f76819c = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public final void onOutputSizeChanged(int i11, int i12) {
        float fMin = Math.min(1.0f, 360.0f / Math.min(i11, i12));
        int iRound = Math.round(i11 * fMin);
        int iRound2 = Math.round(i12 * fMin);
        super.onOutputSizeChanged(iRound, iRound2);
        if (this.f76817a) {
            setFloatOnDraw(this.f76818b, 0.0f);
            setFloatOnDraw(this.f76819c, 1.5f / iRound2);
        } else {
            setFloatOnDraw(this.f76818b, 1.5f / iRound);
            setFloatOnDraw(this.f76819c, 0.0f);
        }
    }
}
