package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class ExtendedCameraConfigProviderStore {
    private static final Object LOCK = new Object();

    @GuardedBy("LOCK")
    private static final Map<Object, CameraConfigProvider> CAMERA_CONFIG_PROVIDERS = new HashMap();

    public static void addConfig(Object obj, CameraConfigProvider cameraConfigProvider) {
        synchronized (LOCK) {
            CAMERA_CONFIG_PROVIDERS.put(obj, cameraConfigProvider);
        }
    }

    public static void clear() {
        synchronized (LOCK) {
            CAMERA_CONFIG_PROVIDERS.clear();
        }
    }

    public static CameraConfigProvider getConfigProvider(Object obj) {
        CameraConfigProvider cameraConfigProvider;
        synchronized (LOCK) {
            cameraConfigProvider = CAMERA_CONFIG_PROVIDERS.get(obj);
        }
        return cameraConfigProvider == null ? CameraConfigProvider.EMPTY : cameraConfigProvider;
    }

    private ExtendedCameraConfigProviderStore() {
    }
}
