package com.jumio.core.util;

import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.ImageData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"getCameraPosition", "Lcom/jumio/commons/camera/ImageData$CameraPosition;", "Lcom/jumio/commons/camera/CameraSettings;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExtensionsKt {
    @NotNull
    public static final ImageData.CameraPosition getCameraPosition(@NotNull CameraSettings cameraSettings) {
        Intrinsics.checkNotNullParameter(cameraSettings, "<this>");
        return cameraSettings.getF13519e() ? ImageData.CameraPosition.FRONT : ImageData.CameraPosition.BACK;
    }
}
