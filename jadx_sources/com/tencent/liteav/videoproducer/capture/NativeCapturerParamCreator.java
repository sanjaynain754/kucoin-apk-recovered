package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class NativeCapturerParamCreator {
    public static CameraCaptureParams createCameraParams(Boolean bool, int i11, int i12, int i13) {
        CameraCaptureParams cameraCaptureParams = new CameraCaptureParams();
        cameraCaptureParams.f74594a = bool;
        cameraCaptureParams.f74600b = i11;
        cameraCaptureParams.f74601c = i12;
        cameraCaptureParams.f74602d = i13;
        return cameraCaptureParams;
    }

    public static Boolean createBooleanWithValue(boolean z11) {
        return Boolean.valueOf(z11);
    }
}
