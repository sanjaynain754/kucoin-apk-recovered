package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraConfig;

/* JADX INFO: loaded from: classes23.dex */
public interface Camera {
    CameraControl getCameraControl();

    CameraInfo getCameraInfo();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    CameraConfig getExtendedConfig();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isUseCasesCombinationSupported(boolean z11, UseCase... useCaseArr) {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isUseCasesCombinationSupportedByFramework(UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(false, useCaseArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(true, useCaseArr);
    }
}
