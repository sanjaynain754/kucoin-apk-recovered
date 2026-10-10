package com.tencent.ugc.videobase.filter;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUTwoInputFilter extends TXCGPUImageMultipleInputFilter {
    public static final String TWOINPUT_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}";
    private int mGLAttribTextureCoord2;
    private final FloatBuffer mSecondTextureCoordsBuffer;

    public TXCGPUTwoInputFilter(String str) {
        this(TWOINPUT_VERTEX_SHADER, str);
    }

    public TXCGPUTwoInputFilter(String str, String str2) {
        super(str, str2);
        this.mGLAttribTextureCoord2 = -1;
        this.mSecondTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);
    }

    public void setSecondInputTexture(int i11) {
        setInputTexture(TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME, i11);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        super.afterDrawArrays();
        int i11 = this.mGLAttribTextureCoord2;
        if (i11 != -1) {
            GLES20.glDisableVertexAttribArray(i11);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void beforeDrawArrays(int i11) {
        super.beforeDrawArrays(i11);
        int i12 = this.mGLAttribTextureCoord2;
        if (i12 != -1) {
            GLES20.glVertexAttribPointer(i12, 2, 5126, false, 0, (Buffer) this.mSecondTextureCoordsBuffer);
            GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord2);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mGLAttribTextureCoord2 = GLES20.glGetAttribLocation(getProgramId(), "inputTextureCoordinate2");
    }
}
