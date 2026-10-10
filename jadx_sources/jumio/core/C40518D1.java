package jumio.core;

import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.D1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40518D1 implements ShaderProvider {
    @Override // com.jumio.commons.camera.renderer.opengl.ShaderProvider
    public final String createFragmentShader(String samplerVarName, String fragCoordsVarName) {
        Intrinsics.checkNotNullParameter(samplerVarName, "samplerVarName");
        Intrinsics.checkNotNullParameter(fragCoordsVarName, "fragCoordsVarName");
        return "\n\t\t\t#extension GL_OES_EGL_image_external : require\n\t\t\tprecision mediump float;\n\t\t\tvarying vec2 " + fragCoordsVarName + ";\n\t\t\tuniform samplerExternalOES " + samplerVarName + ";\n\t\t\tuniform float uAlphaScale;\n\t\t\tvoid main() {\n\t\t\t\tvec4 src = texture2D(" + samplerVarName + ", " + fragCoordsVarName + ");\n\t\t\t\tgl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n\t\t\t}\n\t\t";
    }
}
