package jumio.core;

import android.opengl.GLES20;
import androidx.camera.core.processing.util.GLUtils;
import com.jumio.commons.camera.renderer.opengl.GLUtils$SamplerShaderProgram$Companion;
import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import java.nio.Buffer;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.core.G1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40533G1 extends AbstractC40513C1 {

    /* JADX INFO: renamed from: l */
    public static final GLUtils$SamplerShaderProgram$Companion f89974l = new GLUtils$SamplerShaderProgram$Companion(null);

    /* JADX INFO: renamed from: i */
    public int f89975i;

    /* JADX INFO: renamed from: j */
    public int f89976j;

    /* JADX INFO: renamed from: k */
    public int f89977k;

    /* JADX WARN: Illegal instructions before constructor call */
    public C40533G1(C40654e1 dynamicRange, ShaderProvider shaderProvider) {
        String str;
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        Intrinsics.checkNotNullParameter(shaderProvider, "shaderProvider");
        if (dynamicRange.m89253a()) {
            int[] iArr = AbstractC40538H1.f89991a;
            str = "\n\t\t#version 300 es\n\t\tin vec4 aPosition;\n\t\tin vec4 aTextureCoord;\n\t\tuniform mat4 uTexMatrix;\n\t\tuniform mat4 uTransMatrix;\n\t\tout vec2 vTextureCoord;\n\t\tvoid main() {\n\t\t  gl_Position = uTransMatrix * aPosition;\n\t\t  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n\t\t}\n\t";
        } else {
            int[] iArr2 = AbstractC40538H1.f89991a;
            str = "\n\t\tuniform mat4 uTexMatrix;\n\t\tuniform mat4 uTransMatrix;\n\t\tattribute vec4 aPosition;\n\t\tattribute vec4 aTextureCoord;\n\t\tvarying vec2 vTextureCoord;\n\t\tvoid main() {\n\t\t\tgl_Position = uTransMatrix * aPosition;\n\t\t\tvTextureCoord = (uTexMatrix * aTextureCoord).xy;\n\t\t}\n\t";
        }
        try {
            String strCreateFragmentShader = shaderProvider.createFragmentShader(GLUtils.VAR_TEXTURE, GLUtils.VAR_TEXTURE_COORD);
            if (strCreateFragmentShader != null && StringsKt.contains$default((CharSequence) strCreateFragmentShader, (CharSequence) GLUtils.VAR_TEXTURE_COORD, false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strCreateFragmentShader, (CharSequence) GLUtils.VAR_TEXTURE, false, 2, (Object) null)) {
                super(str, strCreateFragmentShader);
                this.f89975i = -1;
                this.f89976j = -1;
                this.f89977k = -1;
                mo89149a();
                return;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
        }
    }

    @Override // jumio.core.AbstractC40513C1
    /* JADX INFO: renamed from: a */
    public final void mo89149a() {
        super.mo89149a();
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f89932a, GLUtils.VAR_TEXTURE);
        this.f89975i = iGlGetUniformLocation;
        AbstractC40538H1.m89177a(iGlGetUniformLocation, GLUtils.VAR_TEXTURE);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f89932a, "aTextureCoord");
        this.f89977k = iGlGetAttribLocation;
        AbstractC40538H1.m89177a(iGlGetAttribLocation, "aTextureCoord");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f89932a, "uTexMatrix");
        this.f89976j = iGlGetUniformLocation2;
        AbstractC40538H1.m89177a(iGlGetUniformLocation2, "uTexMatrix");
    }

    @Override // jumio.core.AbstractC40513C1
    /* JADX INFO: renamed from: b */
    public final void mo89153b() {
        super.mo89153b();
        GLES20.glUniform1i(this.f89975i, 0);
        GLES20.glEnableVertexAttribArray(this.f89977k);
        AbstractC40538H1.m89184b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f89977k, 2, 5126, false, 0, (Buffer) AbstractC40538H1.f89997g);
        AbstractC40538H1.m89184b("glVertexAttribPointer");
    }
}
