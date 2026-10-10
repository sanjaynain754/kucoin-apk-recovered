package com.jumio.commons.camera.renderer.graphics;

import androidx.camera.core.processing.util.GLUtils;
import jumio.core.AbstractC40543I1;
import jumio.core.C40548J1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/commons/camera/renderer/graphics/GraphicDeviceInfo$Companion;", "", "<init>", "()V", "builder", "Lcom/jumio/commons/camera/renderer/graphics/GraphicDeviceInfo$Builder;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GraphicDeviceInfo$Companion {
    @NotNull
    public final AbstractC40543I1 builder() {
        C40548J1 c40548j1 = new C40548J1();
        Intrinsics.checkNotNullParameter(GLUtils.VERSION_UNKNOWN, "version");
        c40548j1.f90015a = GLUtils.VERSION_UNKNOWN;
        Intrinsics.checkNotNullParameter(GLUtils.VERSION_UNKNOWN, "version");
        c40548j1.f90016b = GLUtils.VERSION_UNKNOWN;
        Intrinsics.checkNotNullParameter("", "extensions");
        Intrinsics.checkNotNullParameter("", "extensions");
        return c40548j1;
    }

    public GraphicDeviceInfo$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
