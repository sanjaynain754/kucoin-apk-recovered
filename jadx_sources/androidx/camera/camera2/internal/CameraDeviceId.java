package androidx.camera.camera2.internal;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
abstract class CameraDeviceId {
    public abstract String getBrand();

    public abstract String getCameraId();

    public abstract String getDevice();

    public abstract String getModel();

    public static CameraDeviceId create(String str, String str2, String str3, String str4) {
        return new AutoValue_CameraDeviceId(str.toLowerCase(), str2.toLowerCase(), str3.toLowerCase(), str4.toLowerCase());
    }
}
