package com.sumsub.sns.internal.util.camera;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.HandlerThread;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.camera.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33397g extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C33398h f68103a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HandlerThread f68104b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Handler f68105c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function0 f68106d;

    public C33397g(C33398h c33398h, HandlerThread handlerThread, Handler handler, Function0 function0) {
        this.f68103a = c33398h;
        this.f68104b = handlerThread;
        this.f68105c = handler;
        this.f68106d = function0;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        C33272c.f67816e.f67810a.mo68955d("CameraTrace", "Camera disconnected", null);
        this.f68104b.quitSafely();
        Handler handler = this.f68105c;
        final Function0 function0 = this.f68106d;
        handler.post(new Runnable() { // from class: com.sumsub.sns.internal.util.camera.i
            @Override // java.lang.Runnable
            public final void run() {
                C33397g.m71686a(function0);
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i11) {
        C33272c.f67816e.f67810a.mo68956e("CameraTrace", "Camera error " + i11, null);
        this.f68104b.quitSafely();
        Handler handler = this.f68105c;
        final Function0 function0 = this.f68106d;
        handler.post(new Runnable() { // from class: com.sumsub.sns.internal.util.camera.j
            @Override // java.lang.Runnable
            public final void run() {
                C33397g.m71687b(function0);
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        this.f68103a.m71690a();
        cameraDevice.close();
        this.f68104b.quitSafely();
        Handler handler = this.f68105c;
        final Function0 function0 = this.f68106d;
        handler.post(new Runnable() { // from class: com.sumsub.sns.internal.util.camera.k
            @Override // java.lang.Runnable
            public final void run() {
                C33397g.m71688c(function0);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m71686a(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: b */
    public static final void m71687b(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: c */
    public static final void m71688c(Function0 function0) {
        function0.invoke();
    }
}
