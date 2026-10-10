package androidx.camera.extensions.internal.sessionprocessor;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
interface Camera2OutputConfig {
    int getId();

    String getPhysicalCameraId();

    int getSurfaceGroupId();

    List<Camera2OutputConfig> getSurfaceSharingOutputConfigs();
}
