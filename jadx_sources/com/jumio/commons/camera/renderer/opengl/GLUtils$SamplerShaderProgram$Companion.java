package com.jumio.commons.camera.renderer.opengl;

import jumio.core.AbstractC40538H1;
import jumio.core.AbstractC40618X2;
import jumio.core.C40654e1;
import jumio.core.EnumC40508B1;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\n"}, m90084d2 = {"Lcom/jumio/commons/camera/renderer/opengl/GLUtils$SamplerShaderProgram$Companion;", "", "<init>", "()V", "resolveDefaultShaderProvider", "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;", "dynamicRange", "Lcom/jumio/commons/camera/renderer/graphics/DynamicRange;", "inputFormat", "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$InputFormat;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GLUtils$SamplerShaderProgram$Companion {
    public GLUtils$SamplerShaderProgram$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final ShaderProvider access$resolveDefaultShaderProvider(GLUtils$SamplerShaderProgram$Companion gLUtils$SamplerShaderProgram$Companion, C40654e1 c40654e1, EnumC40508B1 enumC40508B1) {
        boolean z11;
        gLUtils$SamplerShaderProgram$Companion.getClass();
        if (c40654e1.m89253a()) {
            if (enumC40508B1 != EnumC40508B1.UNKNOWN) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC40618X2.m89243a(z11, "No default sampler shader available for" + enumC40508B1, new Object[0]);
            if (enumC40508B1 == EnumC40508B1.YUV) {
                return AbstractC40538H1.f89995e;
            }
            return AbstractC40538H1.f89994d;
        }
        return AbstractC40538H1.f89993c;
    }
}
