package ai.advance.common.camera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes23.dex */
public class GuardianCameraViewV3 extends GuardianCameraViewV2 {

    /* JADX INFO: renamed from: E */
    public static final Object f896E = new Object();

    /* JADX INFO: renamed from: C */
    public final Object f897C;

    /* JADX INFO: renamed from: D */
    public volatile boolean f898D;

    public GuardianCameraViewV3(Context context) {
        super(context);
        this.f897C = new Object();
        this.f898D = false;
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: P */
    public void mo1179P(GuardianCameraViewV2.InterfaceC0337h interfaceC0337h) {
        this.f898D = true;
        this.f865h = false;
        super.mo1179P(interfaceC0337h);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m1220w0(int i11) {
        try {
            try {
                Camera cameraOpen = Camera.open(i11);
                Camera.Parameters parameters = cameraOpen.getParameters();
                Camera.Size sizeMo86L = mo86L(parameters);
                parameters.setPreviewSize(sizeMo86L.width, sizeMo86L.height);
                int iM1183T = m1183T(i11);
                cameraOpen.setDisplayOrientation(iM1183T);
                cameraOpen.setParameters(parameters);
                synchronized (this.f897C) {
                    this.f863f = cameraOpen;
                    this.f864g = sizeMo86L;
                    this.f869l = iM1183T;
                    this.f898D = false;
                }
                this.f879v.post(new Runnable() { // from class: i.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f86162b.mo431l0();
                    }
                });
                mo1190g0();
                mo1191h0();
            } catch (Exception e11) {
                m1219A0(e11);
            }
            this.f865h = false;
        } catch (Throwable th2) {
            this.f865h = false;
            throw th2;
        }
    }

    public GuardianCameraViewV3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f897C = new Object();
        this.f898D = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m1203C0() {
        GuardianCameraViewV2.InterfaceC0336g interfaceC0336g = this.f862e;
        if (interfaceC0336g != null) {
            interfaceC0336g.mo89b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m1204D0() {
        synchronized (this.f897C) {
            if (this.f863f != null && !this.f898D && this.f878u) {
                try {
                    this.f863f.setPreviewTexture(getSurfaceTexture());
                    this.f863f.setPreviewCallback(this);
                    this.f863f.startPreview();
                    Handler handler = this.f879v;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: i.r
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f86161b.m1203C0();
                            }
                        });
                    }
                } catch (Exception e11) {
                    try {
                        Camera camera = this.f863f;
                        if (camera != null) {
                            camera.setPreviewCallback(null);
                        }
                    } catch (Exception unused) {
                    }
                    m1219A0(e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m1205E0() {
        synchronized (this.f897C) {
            try {
                if (this.f863f != null && !this.f898D) {
                    this.f863f.stopPreview();
                    this.f863f.setPreviewCallback(null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public void m1202B0() {
        this.f883z.execute(new Runnable() { // from class: i.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f86160b.m1218z0();
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    private void m1207G0() {
        Handler handler = this.f879v;
        Object obj = f896E;
        handler.removeCallbacksAndMessages(obj);
        this.f879v.postAtTime(new Runnable() { // from class: i.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f86157b.m1202B0();
            }
        }, obj, SystemClock.uptimeMillis() + this.f860c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m1217v0() {
        if (this.f875r) {
            m1207G0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m1218z0() {
        synchronized (this.f897C) {
            if (this.f863f != null && !this.f898D) {
                try {
                    this.f863f.autoFocus(new Camera.AutoFocusCallback() { // from class: i.t
                        @Override // android.hardware.Camera.AutoFocusCallback
                        public final void onAutoFocus(boolean z11, Camera camera) {
                            this.f86163a.m1222y0(z11, camera);
                        }
                    });
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m1219A0(final Exception exc) {
        if (this.f879v != null) {
            synchronized (this.f897C) {
                this.f863f = null;
            }
            this.f879v.post(new Runnable() { // from class: i.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86164b.m1221x0(exc);
                }
            });
        }
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: M */
    public boolean mo1176M() {
        boolean z11 = false;
        if (this.f898D) {
            return false;
        }
        synchronized (this.f897C) {
            try {
                if (this.f863f != null && !this.f898D) {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: b0 */
    public void mo415b0(final int i11, GuardianCameraViewV2.InterfaceC0336g interfaceC0336g) {
        this.f862e = interfaceC0336g;
        this.f866i = i11;
        if (this.f861d == null) {
            return;
        }
        if (this.f871n == 0) {
            this.f870m = true;
            return;
        }
        this.f870m = false;
        if (this.f865h) {
            return;
        }
        this.f865h = true;
        this.f883z.execute(new Runnable() { // from class: i.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f86155b.m1220w0(i11);
            }
        });
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: g0 */
    public void mo1190g0() {
        if (this.f875r) {
            m1207G0();
        }
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    public Camera getCamera() {
        Camera camera;
        synchronized (this.f897C) {
            camera = this.f898D ? null : super.getCamera();
        }
        return camera;
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: h0 */
    public void mo1191h0() {
        this.f883z.execute(new Runnable() { // from class: i.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f86158b.m1204D0();
            }
        });
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: i0 */
    public void mo1192i0() {
        this.f879v.removeCallbacksAndMessages(f896E);
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: j0 */
    public void mo1193j0() {
        this.f883z.submit(new Runnable() { // from class: i.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f86159b.m1205E0();
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m1221x0(Exception exc) {
        GuardianCameraViewV2.InterfaceC0336g interfaceC0336g = this.f862e;
        if (interfaceC0336g != null) {
            interfaceC0336g.mo91i(exc);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m1222y0(boolean z11, Camera camera) {
        this.f879v.post(new Runnable() { // from class: i.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f86166b.m1217v0();
            }
        });
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: I */
    public void mo1173I() {
        m1202B0();
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: O */
    public void mo1178O() {
        try {
            mo1192i0();
            synchronized (this.f897C) {
                try {
                    Camera camera = this.f863f;
                    if (camera != null) {
                        camera.stopPreview();
                        this.f863f.setPreviewCallback(null);
                        this.f863f.release();
                        this.f863f = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
    }
}
