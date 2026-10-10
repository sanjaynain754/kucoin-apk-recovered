package androidx.camera.camera2.internal;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;

/* JADX INFO: loaded from: classes23.dex */
interface ZslControl {
    void addZslConfig(SessionConfig.Builder builder);

    void clearZslConfig();

    ImageProxy dequeueImageFromBuffer();

    boolean enqueueImageToImageWriter(ImageProxy imageProxy);

    boolean isZslDisabledByFlashMode();

    boolean isZslDisabledByUserCaseConfig();

    void setZslDisabledByFlashMode(boolean z11);

    void setZslDisabledByUserCaseConfig(boolean z11);
}
