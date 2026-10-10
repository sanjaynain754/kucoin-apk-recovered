package com.journeyapps.barcodescanner.camera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import com.google.zxing.client.android.AmbientLightManager;
import com.google.zxing.client.android.camera.CameraConfigurationUtils;
import com.google.zxing.client.android.camera.open.OpenCameraInterface;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p037b9.C4519m;
import p037b9.C4520n;
import p055c9.C4907a;
import p055c9.C4909c;
import p055c9.C4912f;
import p055c9.InterfaceC4915i;

/* JADX INFO: renamed from: com.journeyapps.barcodescanner.camera.a */
/* JADX INFO: compiled from: CameraManager.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C9298a {

    /* JADX INFO: renamed from: n */
    public static final String f13363n = "a";

    /* JADX INFO: renamed from: a */
    public Camera f13364a;

    /* JADX INFO: renamed from: b */
    public Camera.CameraInfo f13365b;

    /* JADX INFO: renamed from: c */
    public C4907a f13366c;

    /* JADX INFO: renamed from: d */
    public AmbientLightManager f13367d;

    /* JADX INFO: renamed from: e */
    public boolean f13368e;

    /* JADX INFO: renamed from: f */
    public String f13369f;

    /* JADX INFO: renamed from: h */
    public C4912f f13371h;

    /* JADX INFO: renamed from: i */
    public C4519m f13372i;

    /* JADX INFO: renamed from: j */
    public C4519m f13373j;

    /* JADX INFO: renamed from: l */
    public Context f13375l;

    /* JADX INFO: renamed from: g */
    public CameraSettings f13370g = new CameraSettings();

    /* JADX INFO: renamed from: k */
    public int f13374k = -1;

    /* JADX INFO: renamed from: m */
    public final a f13376m = new a();

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.camera.a$a */
    /* JADX INFO: compiled from: CameraManager.java */
    public final class a implements Camera.PreviewCallback {

        /* JADX INFO: renamed from: b */
        public InterfaceC4915i f13377b;

        /* JADX INFO: renamed from: c */
        public C4519m f13378c;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m14416a(InterfaceC4915i interfaceC4915i) {
            this.f13377b = interfaceC4915i;
        }

        /* JADX INFO: renamed from: b */
        public void m14417b(C4519m c4519m) {
            this.f13378c = c4519m;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C4519m c4519m = this.f13378c;
            InterfaceC4915i interfaceC4915i = this.f13377b;
            if (c4519m == null || interfaceC4915i == null) {
                Log.d(C9298a.f13363n, "Got preview callback, but no handler or resolution available");
                if (interfaceC4915i != null) {
                    interfaceC4915i.mo4343b(new Exception("No resolution available"));
                    return;
                }
                return;
            }
            try {
                if (bArr == null) {
                    throw new NullPointerException("No preview data received");
                }
                interfaceC4915i.mo4342a(new C4520n(bArr, c4519m.f3949b, c4519m.f3950c, camera.getParameters().getPreviewFormat(), C9298a.this.m14400e()));
            } catch (RuntimeException e11) {
                Log.e(C9298a.f13363n, "Camera preview failed", e11);
                interfaceC4915i.mo4343b(e11);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m14397b() {
        int iM5136c = this.f13371h.m5136c();
        int i11 = 0;
        if (iM5136c != 0) {
            if (iM5136c == 1) {
                i11 = 90;
            } else if (iM5136c == 2) {
                i11 = 180;
            } else if (iM5136c == 3) {
                i11 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f13365b;
        int i12 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i11) % TXVodDownloadDataSource.QUALITY_360P)) % TXVodDownloadDataSource.QUALITY_360P : ((cameraInfo.orientation - i11) + TXVodDownloadDataSource.QUALITY_360P) % TXVodDownloadDataSource.QUALITY_360P;
        Log.i(f13363n, "Camera Display Orientation: " + i12);
        return i12;
    }

    /* JADX INFO: renamed from: c */
    public void m14398c() {
        Camera camera = this.f13364a;
        if (camera != null) {
            camera.release();
            this.f13364a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m14399d() {
        if (this.f13364a == null) {
            throw new RuntimeException("Camera not open");
        }
        m14411q();
    }

    /* JADX INFO: renamed from: e */
    public int m14400e() {
        return this.f13374k;
    }

    /* JADX INFO: renamed from: f */
    public final Camera.Parameters m14401f() {
        Camera.Parameters parameters = this.f13364a.getParameters();
        String str = this.f13369f;
        if (str == null) {
            this.f13369f = parameters.flatten();
            return parameters;
        }
        parameters.unflatten(str);
        return parameters;
    }

    /* JADX INFO: renamed from: g */
    public C4519m m14402g() {
        if (this.f13373j == null) {
            return null;
        }
        return m14403i() ? this.f13373j.m4351b() : this.f13373j;
    }

    /* JADX INFO: renamed from: i */
    public boolean m14403i() {
        int i11 = this.f13374k;
        if (i11 != -1) {
            return i11 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    /* JADX INFO: renamed from: j */
    public boolean m14404j() {
        String flashMode;
        Camera.Parameters parameters = this.f13364a.getParameters();
        return (parameters == null || (flashMode = parameters.getFlashMode()) == null || (!ViewProps.f9928ON.equals(flashMode) && !"torch".equals(flashMode))) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public void m14405k() {
        Camera cameraOpen = OpenCameraInterface.open(this.f13370g.m14387b());
        this.f13364a = cameraOpen;
        if (cameraOpen == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int cameraId = OpenCameraInterface.getCameraId(this.f13370g.m14387b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f13365b = cameraInfo;
        Camera.getCameraInfo(cameraId, cameraInfo);
    }

    /* JADX INFO: renamed from: l */
    public void m14406l(InterfaceC4915i interfaceC4915i) {
        Camera camera = this.f13364a;
        if (camera == null || !this.f13368e) {
            return;
        }
        this.f13376m.m14416a(interfaceC4915i);
        camera.setOneShotPreviewCallback(this.f13376m);
    }

    /* JADX INFO: renamed from: m */
    public final void m14407m(int i11) {
        this.f13364a.setDisplayOrientation(i11);
    }

    /* JADX INFO: renamed from: n */
    public void m14408n(CameraSettings cameraSettings) {
        this.f13370g = cameraSettings;
    }

    /* JADX INFO: renamed from: p */
    public void m14410p(C4912f c4912f) {
        this.f13371h = c4912f;
    }

    /* JADX INFO: renamed from: r */
    public void m14412r(C4909c c4909c) throws IOException {
        c4909c.m5125a(this.f13364a);
    }

    /* JADX INFO: renamed from: s */
    public void m14413s(boolean z11) {
        if (this.f13364a != null) {
            try {
                if (z11 != m14404j()) {
                    C4907a c4907a = this.f13366c;
                    if (c4907a != null) {
                        c4907a.m5100j();
                    }
                    Camera.Parameters parameters = this.f13364a.getParameters();
                    CameraConfigurationUtils.setTorch(parameters, z11);
                    if (this.f13370g.m14391f()) {
                        CameraConfigurationUtils.setBestExposure(parameters, z11);
                    }
                    this.f13364a.setParameters(parameters);
                    C4907a c4907a2 = this.f13366c;
                    if (c4907a2 != null) {
                        c4907a2.m5099i();
                    }
                }
            } catch (RuntimeException e11) {
                Log.e(f13363n, "Failed to set torch", e11);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m14414t() {
        Camera camera = this.f13364a;
        if (camera == null || this.f13368e) {
            return;
        }
        camera.startPreview();
        this.f13368e = true;
        this.f13366c = new C4907a(this.f13364a, this.f13370g);
        AmbientLightManager ambientLightManager = new AmbientLightManager(this.f13375l, this, this.f13370g);
        this.f13367d = ambientLightManager;
        ambientLightManager.start();
    }

    /* JADX INFO: renamed from: u */
    public void m14415u() {
        C4907a c4907a = this.f13366c;
        if (c4907a != null) {
            c4907a.m5100j();
            this.f13366c = null;
        }
        AmbientLightManager ambientLightManager = this.f13367d;
        if (ambientLightManager != null) {
            ambientLightManager.stop();
            this.f13367d = null;
        }
        Camera camera = this.f13364a;
        if (camera == null || !this.f13368e) {
            return;
        }
        camera.stopPreview();
        this.f13376m.m14416a(null);
        this.f13368e = false;
    }

    public C9298a(Context context) {
        this.f13375l = context;
    }

    /* JADX INFO: renamed from: h */
    public static List<C4519m> m14396h(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new C4519m(previewSize.width, previewSize.height));
                return arrayList;
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new C4519m(size.width, size.height));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final void m14409o(boolean z11) {
        Camera.Parameters parametersM14401f = m14401f();
        if (parametersM14401f == null) {
            Log.w(f13363n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f13363n;
        Log.i(str, "Initial camera parameters: " + parametersM14401f.flatten());
        if (z11) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        CameraConfigurationUtils.setFocus(parametersM14401f, this.f13370g.m14386a(), z11);
        if (!z11) {
            CameraConfigurationUtils.setTorch(parametersM14401f, false);
            if (this.f13370g.m14393h()) {
                CameraConfigurationUtils.setInvertColor(parametersM14401f);
            }
            if (this.f13370g.m14390e()) {
                CameraConfigurationUtils.setBarcodeSceneMode(parametersM14401f);
            }
            if (this.f13370g.m14392g()) {
                CameraConfigurationUtils.setVideoStabilization(parametersM14401f);
                CameraConfigurationUtils.setFocusArea(parametersM14401f);
                CameraConfigurationUtils.setMetering(parametersM14401f);
            }
        }
        List<C4519m> listM14396h = m14396h(parametersM14401f);
        if (listM14396h.size() == 0) {
            this.f13372i = null;
        } else {
            C4519m c4519mM5134a = this.f13371h.m5134a(listM14396h, m14403i());
            this.f13372i = c4519mM5134a;
            parametersM14401f.setPreviewSize(c4519mM5134a.f3949b, c4519mM5134a.f3950c);
        }
        if (Build.DEVICE.equals("glass-1")) {
            CameraConfigurationUtils.setBestPreviewFPS(parametersM14401f);
        }
        Log.i(str, "Final camera parameters: " + parametersM14401f.flatten());
        this.f13364a.setParameters(parametersM14401f);
    }

    /* JADX INFO: renamed from: q */
    public final void m14411q() {
        try {
            int iM14397b = m14397b();
            this.f13374k = iM14397b;
            m14407m(iM14397b);
        } catch (Exception unused) {
            Log.w(f13363n, "Failed to set rotation.");
        }
        try {
            m14409o(false);
        } catch (Exception unused2) {
            try {
                m14409o(true);
            } catch (Exception unused3) {
                Log.w(f13363n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f13364a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f13373j = this.f13372i;
        } else {
            this.f13373j = new C4519m(previewSize.width, previewSize.height);
        }
        this.f13376m.m14417b(this.f13373j);
    }
}
