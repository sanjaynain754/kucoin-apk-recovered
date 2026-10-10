package jumio.core;

import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.F1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40528F1 implements ShaderProvider {
    @Override // com.jumio.commons.camera.renderer.opengl.ShaderProvider
    public final String createFragmentShader(String samplerVarName, String fragCoordsVarName) {
        Intrinsics.checkNotNullParameter(samplerVarName, "samplerVarName");
        Intrinsics.checkNotNullParameter(fragCoordsVarName, "fragCoordsVarName");
        return "\n\t\t\t#version 300 es\n\t\t\t#extension GL_EXT_YUV_target : require\n\t\t\tprecision mediump float;\n\t\t\tuniform __samplerExternal2DY2YEXT " + samplerVarName + ";\n\t\t\tuniform float uAlphaScale;\n\t\t\tin vec2 " + fragCoordsVarName + ";\n\t\t\tout vec4 outColor;\n\t\t\t\n\t\t\tvec3 yuvToRgb(vec3 yuv) {\n\t\t\t  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n\t\t\t  const mat3 yuvToRgbColorMat = mat3(\n\t\t\t\t1.1689f, 1.1689f, 1.1689f,\n\t\t\t\t0.0000f, -0.1881f, 2.1502f,\n\t\t\t\t1.6853f, -0.6530f, 0.0000f\n\t\t\t  );\n\t\t\t  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n\t\t\t}\n\t\t\t\n\t\t\tvoid main() {\n\t\t\t  vec3 srcYuv = texture(" + samplerVarName + ", " + fragCoordsVarName + ").xyz;\n\t\t\t  vec3 srcRgb = yuvToRgb(srcYuv);\n\t\t\t  outColor = vec4(srcRgb, uAlphaScale);\n\t\t\t}\n\t\t";
    }
}
