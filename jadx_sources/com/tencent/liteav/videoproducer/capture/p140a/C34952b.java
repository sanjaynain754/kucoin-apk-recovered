package com.tencent.liteav.videoproducer.capture.p140a;

import android.hardware.Camera;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.a.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class C34952b implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a */
    private static final C34952b f74627a = new C34952b();

    /* JADX INFO: renamed from: a */
    public static Camera.AutoFocusCallback m76680a() {
        return f74627a;
    }

    private C34952b() {
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z11, Camera camera) {
        LiteavLog.m76080d("CameraController", "onAutoFocus success: %b", Boolean.valueOf(z11));
    }
}
