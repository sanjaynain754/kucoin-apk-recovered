package jumio.core;

import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.E1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40523E1 implements ShaderProvider {
    @Override // com.jumio.commons.camera.renderer.opengl.ShaderProvider
    public final String createFragmentShader(String samplerVarName, String fragCoordsVarName) {
        Intrinsics.checkNotNullParameter(samplerVarName, "samplerVarName");
        Intrinsics.checkNotNullParameter(fragCoordsVarName, "fragCoordsVarName");
        return "\n\t\t\t#version 300 es\n\t\t\t#extension GL_OES_EGL_image_external_essl3 : require\n\t\t\tprecision mediump float;\n\t\t\tuniform samplerExternalOES " + samplerVarName + ";\n\t\t\tuniform float uAlphaScale;\n\t\t\tin vec2 " + fragCoordsVarName + ";\n\t\t\tout vec4 outColor;\n\t\t\t\n\t\t\tvoid main() {\n\t\t\t  vec4 src = texture(" + samplerVarName + ", " + fragCoordsVarName + ");\n\t\t\t  outColor = vec4(src.rgb, src.a * uAlphaScale);\n\t\t\t}\n\t\t";
    }
}
