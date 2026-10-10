package com.jumio.commons.camera.renderer.surface;

import android.opengl.EGLSurface;
import jumio.core.AbstractC40524E2;
import jumio.core.C40529F2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/commons/camera/renderer/surface/OutputSurface$Companion;", "", "<init>", "()V", "of", "Lcom/jumio/commons/camera/renderer/surface/OutputSurface;", "eglSurface", "Landroid/opengl/EGLSurface;", "width", "", "height", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OutputSurface$Companion {
    @NotNull
    /* JADX INFO: renamed from: of */
    public final AbstractC40524E2 m14460of(@NotNull EGLSurface eglSurface, int i11, int i12) {
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        return new C40529F2(eglSurface, i11, i12);
    }

    public OutputSurface$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
