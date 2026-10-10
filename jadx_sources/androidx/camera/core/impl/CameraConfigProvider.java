package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.CameraInfo;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraConfigProvider {
    public static final CameraConfigProvider EMPTY = new CameraConfigProvider() { // from class: androidx.camera.core.impl.d
        @Override // androidx.camera.core.impl.CameraConfigProvider
        public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
            return CameraConfigProvider.m1937a(cameraInfo, context);
        }
    };

    /* JADX INFO: renamed from: a */
    static /* synthetic */ CameraConfig m1937a(CameraInfo cameraInfo, Context context) {
        return null;
    }

    CameraConfig getConfig(CameraInfo cameraInfo, Context context);
}
