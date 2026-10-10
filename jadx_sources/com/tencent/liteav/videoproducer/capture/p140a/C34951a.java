package com.tencent.liteav.videoproducer.capture.p140a;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.tencent.liteav.base.p129a.C34689a;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videoproducer.capture.C34953b;
import com.tencent.liteav.videoproducer.capture.C34958c;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.CameraControllerInterface;
import com.tencent.liteav.videoproducer.capture.CameraEventCallback;
import com.tencent.liteav.videoproducer.capture.FaceRect;
import com.tencent.liteav.videoproducer.p139a.C34947a;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.a.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34951a extends CameraControllerInterface implements Camera.ErrorCallback, Camera.FaceDetectionListener {

    /* JADX INFO: renamed from: b */
    private Camera f74607b;

    /* JADX INFO: renamed from: f */
    private SurfaceTexture f74611f;

    /* JADX INFO: renamed from: g */
    private Size f74612g;

    /* JADX INFO: renamed from: h */
    private boolean f74613h;

    /* JADX INFO: renamed from: i */
    private boolean f74614i;

    /* JADX INFO: renamed from: l */
    private CameraEventCallback f74617l;

    /* JADX INFO: renamed from: n */
    private float f74619n;

    /* JADX INFO: renamed from: a */
    private boolean f74606a = true;

    /* JADX INFO: renamed from: c */
    private EnumC34747l f74608c = EnumC34747l.NORMAL;

    /* JADX INFO: renamed from: d */
    private EnumC34747l f74609d = null;

    /* JADX INFO: renamed from: e */
    private boolean f74610e = false;

    /* JADX INFO: renamed from: j */
    private boolean f74615j = true;

    /* JADX INFO: renamed from: k */
    private int f74616k = 0;

    /* JADX INFO: renamed from: m */
    private boolean f74618m = false;

    /* JADX INFO: renamed from: o */
    private boolean f74620o = false;

    /* JADX INFO: renamed from: p */
    private float f74621p = 0.0f;

    /* JADX INFO: renamed from: q */
    private boolean f74622q = false;

    /* JADX INFO: renamed from: r */
    private boolean f74623r = false;

    /* JADX INFO: renamed from: s */
    private C34953b f74624s = new C34953b();

    /* JADX INFO: renamed from: t */
    private float f74625t = 1.0f;

    /* JADX INFO: renamed from: u */
    private final Camera.AutoFocusCallback f74626u = C34952b.m76680a();

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCurrentCameraISO() {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static int m76672a(Size size) {
        int i11 = size.width;
        int i12 = size.height;
        if (i11 == i12) {
            return 0;
        }
        return i11 > i12 ? 1 : 2;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableCameraDynamicFps(boolean z11) {
        this.f74610e = z11;
        LiteavLog.m76087i("CameraController", "set enable camera dynamic fps value is:".concat(String.valueOf(z11)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableFaceDetection(boolean z11) {
        this.f74622q = z11;
        LiteavLog.m76087i("CameraController", "set enable face detection value is:".concat(String.valueOf(z11)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableTapToFocus(boolean z11) {
        Camera.Parameters parametersM76675a;
        this.f74615j = z11;
        if (this.f74607b == null || (parametersM76675a = m76675a()) == null) {
            return;
        }
        try {
            m76677a(parametersM76675a, z11);
            this.f74607b.setParameters(parametersM76675a);
        } catch (Throwable th2) {
            LiteavLog.m76084e("CameraController", "enableTapToFocus failed.", th2);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final FaceRect getCameraFaceRect() {
        return this.f74624s.m76682a();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final EnumC34747l getCameraSystemRotation() {
        return this.f74608c;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCameraSystemRotationValue() {
        return this.f74608c.mValue;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getMaxZoom() {
        int i11 = this.f74616k;
        if (i11 != 0) {
            return i11;
        }
        if (this.f74607b != null) {
            Camera.Parameters parametersM76675a = m76675a();
            if (parametersM76675a == null) {
                return this.f74616k;
            }
            if (parametersM76675a.getMaxZoom() > 0 && parametersM76675a.isZoomSupported()) {
                this.f74616k = parametersM76675a.getMaxZoom();
            }
        }
        return this.f74616k;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final Size getPreviewSize() {
        return this.f74612g;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraAutoFocusFaceModeSupported() {
        Camera.Parameters parametersM76675a;
        return (this.f74607b == null || (parametersM76675a = m76675a()) == null || parametersM76675a.getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraFocusPositionInPreviewSupported() {
        return this.f74613h;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCurrentPreviewSizeAspectRatioMatch(int i11, int i12, boolean z11) {
        boolean z12 = true;
        if (this.f74607b != null) {
            Camera.Parameters parametersM76675a = m76675a();
            if (parametersM76675a == null) {
                return true;
            }
            EnumC34747l enumC34747l = this.f74609d;
            if (enumC34747l == null) {
                enumC34747l = this.f74608c;
            }
            Size sizeM76676a = m76676a(parametersM76675a, enumC34747l, i11, i12);
            if (sizeM76676a != null) {
                int i13 = sizeM76676a.width;
                Size size = this.f74612g;
                z12 = i13 <= size.width && sizeM76676a.height <= size.height;
                if (m76672a(sizeM76676a) != m76672a(this.f74612g)) {
                    z12 = false;
                }
                if (z11 && Math.abs(sizeM76676a.aspectRatio() - this.f74612g.aspectRatio()) > 0.001d) {
                    z12 = false;
                }
            }
        }
        LiteavLog.m76087i("CameraController", "isCurrentPreviewSizeAspectRatioMatch : ".concat(String.valueOf(z12)));
        return z12;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isTorchSupported() {
        Camera.Parameters parametersM76675a;
        List<String> supportedFlashModes;
        return (this.f74607b == null || (parametersM76675a = m76675a()) == null || (supportedFlashModes = parametersM76675a.getSupportedFlashModes()) == null || !supportedFlashModes.contains("torch")) ? false : true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isZoomSupported() {
        Camera.Parameters parametersM76675a;
        return this.f74607b != null && (parametersM76675a = m76675a()) != null && parametersM76675a.getMaxZoom() > 0 && parametersM76675a.isZoomSupported();
    }

    @Override // android.hardware.Camera.FaceDetectionListener
    public final void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
        if (this.f74622q && faceArr != null && faceArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (Camera.Face face : faceArr) {
                arrayList.add(face.rect);
            }
            this.f74624s.m76684a(arrayList, this.f74625t);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensation(int i11) {
        Camera.Parameters parametersM76675a;
        if (this.f74607b == null || (parametersM76675a = m76675a()) == null) {
            return;
        }
        if (parametersM76675a.getMaxExposureCompensation() <= 0) {
            LiteavLog.m76087i("CameraController", "camera doesn't support exposure compensation");
            return;
        }
        parametersM76675a.setExposureCompensation(i11);
        try {
            this.f74607b.setParameters(parametersM76675a);
        } catch (Throwable th2) {
            LiteavLog.m76084e("CameraController", "set exposure compensation failed.", th2);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensationNormalization(float f11) {
        this.f74619n = f11;
        this.f74618m = true;
        if (this.f74607b == null) {
            return;
        }
        this.f74618m = false;
        Camera.Parameters parametersM76675a = m76675a();
        if (parametersM76675a == null) {
            return;
        }
        parametersM76675a.setExposureCompensation(m76671a(parametersM76675a, f11));
        try {
            this.f74607b.setParameters(parametersM76675a);
        } catch (Throwable th2) {
            LiteavLog.m76084e("CameraController", "set exposure compensation failed.", th2);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setZoom(float f11) {
        this.f74621p = f11;
        this.f74620o = true;
        if (this.f74607b == null) {
            return;
        }
        this.f74620o = false;
        Camera.Parameters parametersM76675a = m76675a();
        if (parametersM76675a == null) {
            return;
        }
        if (parametersM76675a.getMaxZoom() <= 0 || !parametersM76675a.isZoomSupported()) {
            LiteavLog.m76087i("CameraController", "camera doesn't support zoom!");
            return;
        }
        int maxZoom = parametersM76675a.getMaxZoom();
        int iM76115a = C34743h.m76115a(Math.round(f11 * maxZoom), 0, maxZoom);
        try {
            parametersM76675a.setZoom(iM76115a);
            this.f74625t = parametersM76675a.getZoomRatios().get(iM76115a).intValue() / 100.0f;
            this.f74607b.setParameters(parametersM76675a);
        } catch (Throwable th2) {
            LiteavLog.m76084e("CameraController", "set zoom failed.", th2);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void startAutoFocusAtPosition(int i11, int i12) {
        if (!this.f74615j || this.f74607b == null) {
            return;
        }
        if (i11 >= 0) {
            Size size = this.f74612g;
            if (i11 < size.width && i12 >= 0 && i12 < size.height) {
                LiteavLog.m76088i("CameraController", "Start auto focus at (%d, %d)", Integer.valueOf(i11), Integer.valueOf(i12));
                try {
                    this.f74607b.cancelAutoFocus();
                    Camera.Parameters parametersM76675a = m76675a();
                    if (parametersM76675a == null) {
                        return;
                    }
                    if (this.f74613h) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(m76674a(i11, i12, 2.0f), 1000));
                        parametersM76675a.setFocusAreas(arrayList);
                    }
                    if (this.f74614i) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new Camera.Area(m76674a(i11, i12, 3.0f), 1000));
                        parametersM76675a.setMeteringAreas(arrayList2);
                    }
                    try {
                        this.f74607b.setParameters(parametersM76675a);
                        this.f74607b.autoFocus(this.f74626u);
                        return;
                    } catch (Throwable th2) {
                        LiteavLog.m76084e("CameraController", "auto focus failed.", th2);
                        return;
                    }
                } catch (Throwable th3) {
                    LiteavLog.m76084e("CameraController", "cancel auto focus failed.", th3);
                    return;
                }
            }
        }
        LiteavLog.m76094w("CameraController", "Start auto focus at (%d, %d) invalid ", Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0130 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:5:0x000b, B:7:0x000f, B:10:0x0019, B:13:0x0045, B:17:0x006b, B:21:0x0076, B:23:0x0081, B:25:0x008b, B:27:0x0091, B:28:0x00a4, B:30:0x00a8, B:31:0x00b3, B:33:0x00d0, B:39:0x0119, B:40:0x0122, B:42:0x0130, B:43:0x0134, B:45:0x016a, B:48:0x016f, B:50:0x0173, B:52:0x0179, B:54:0x017f, B:59:0x0199, B:61:0x01a3, B:34:0x00e0, B:36:0x0102, B:38:0x0111, B:63:0x01b0, B:64:0x01b7, B:56:0x0185), top: B:67:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x017f A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:5:0x000b, B:7:0x000f, B:10:0x0019, B:13:0x0045, B:17:0x006b, B:21:0x0076, B:23:0x0081, B:25:0x008b, B:27:0x0091, B:28:0x00a4, B:30:0x00a8, B:31:0x00b3, B:33:0x00d0, B:39:0x0119, B:40:0x0122, B:42:0x0130, B:43:0x0134, B:45:0x016a, B:48:0x016f, B:50:0x0173, B:52:0x0179, B:54:0x017f, B:59:0x0199, B:61:0x01a3, B:34:0x00e0, B:36:0x0102, B:38:0x0111, B:63:0x01b0, B:64:0x01b7, B:56:0x0185), top: B:67:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean startCapture(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, CameraEventCallback cameraEventCallback) {
        int i11;
        this.f74617l = cameraEventCallback;
        try {
            if (cameraCaptureParams == null || surfaceTexture == null) {
                throw new IOException("captureParams or surfaceTexture is null");
            }
            if (this.f74607b != null) {
                LiteavLog.m76083e("CameraController", "it's capturing, you should Stop first.");
                return false;
            }
            this.f74611f = surfaceTexture;
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int iM76673a = m76673a(cameraCaptureParams.f74594a.booleanValue(), cameraInfo);
            this.f74606a = cameraCaptureParams.f74594a.booleanValue();
            this.f74607b = Camera.open(iM76673a);
            EnumC34747l enumC34747lM76131a = EnumC34747l.m76131a(cameraInfo.orientation);
            this.f74608c = enumC34747lM76131a;
            EnumC34747l enumC34747l = this.f74609d;
            if (enumC34747l != null) {
                enumC34747lM76131a = enumC34747l;
            }
            LiteavLog.m76088i("CameraController", "open camera id: %d, isFrontCamera: %b, camera rotation: %s, camera info orientation: %d", Integer.valueOf(iM76673a), cameraCaptureParams.f74594a, enumC34747lM76131a, Integer.valueOf(cameraInfo.orientation));
            Camera.Parameters parameters = this.f74607b.getParameters();
            this.f74613h = parameters.getMaxNumFocusAreas() > 0;
            this.f74614i = parameters.getMaxNumMeteringAreas() > 0;
            m76677a(parameters, this.f74615j);
            if (this.f74620o) {
                this.f74620o = false;
                int maxZoom = parameters.getMaxZoom();
                this.f74616k = maxZoom;
                if (maxZoom > 0 && parameters.isZoomSupported()) {
                    parameters.setZoom(C34743h.m76115a(Math.round(this.f74621p * this.f74616k), 0, this.f74616k));
                }
            }
            if (this.f74618m) {
                this.f74618m = false;
                parameters.setExposureCompensation(m76671a(parameters, this.f74619n));
            }
            Size sizeM76676a = m76676a(parameters, enumC34747lM76131a, cameraCaptureParams.f74601c, cameraCaptureParams.f74602d);
            this.f74612g = sizeM76676a;
            parameters.setPreviewSize(sizeM76676a.width, sizeM76676a.height);
            if (!LiteavSystemInfo.getModel().equalsIgnoreCase("aiv8167sm3_bsp")) {
                int i12 = cameraCaptureParams.f74600b * 1000;
                LiteavLog.m76087i("CameraController", "preferred fps: ".concat(String.valueOf(i12)));
                C34947a c34947aM76736a = C34958c.m76736a(m76679a(parameters.getSupportedPreviewFpsRange()), i12, this.f74610e);
                if (c34947aM76736a != null) {
                    LiteavLog.m76087i("CameraController", "choosed fps range: ".concat(String.valueOf(c34947aM76736a)));
                }
                if (c34947aM76736a != null) {
                    parameters.setPreviewFpsRange(c34947aM76736a.f74592a, c34947aM76736a.f74593b);
                }
                parameters.setWhiteBalance("auto");
                parameters.setSceneMode("auto");
                i11 = this.f74608c.mValue;
                if (cameraInfo.facing == 1) {
                    i11 = (360 - i11) % TXVodDownloadDataSource.QUALITY_360P;
                }
                this.f74607b.setDisplayOrientation(i11);
                C34953b c34953b = this.f74624s;
                Size size = this.f74612g;
                c34953b.m76683a(size.width, size.height);
                C34953b c34953b2 = this.f74624s;
                c34953b2.f74628a = this.f74608c.mValue;
                c34953b2.f74629b = this.f74606a;
                this.f74607b.setParameters(parameters);
                this.f74607b.setErrorCallback(this);
                this.f74607b.setPreviewTexture(this.f74611f);
                this.f74607b.startPreview();
                if (this.f74622q && !this.f74623r && this.f74607b != null && m76675a() != null) {
                    if (isCameraAutoFocusFaceModeSupported()) {
                        try {
                            this.f74607b.setFaceDetectionListener(this);
                            this.f74607b.startFaceDetection();
                            this.f74623r = true;
                            LiteavLog.m76087i("CameraController", "start face detection success.");
                        } catch (Throwable th2) {
                            LiteavLog.m76084e("CameraController", "start face detection failed.", th2);
                            Camera camera = this.f74607b;
                            if (camera != null) {
                                camera.stopFaceDetection();
                                this.f74607b.setFaceDetectionListener(null);
                                this.f74622q = false;
                            }
                        }
                    } else {
                        LiteavLog.m76087i("CameraController", "camera doesn't support face detection");
                    }
                }
                return true;
            }
            LiteavLog.m76088i("CameraController", "Model equals dingdang, setPreviewFrameRate: %d", Integer.valueOf(cameraCaptureParams.f74600b));
            parameters.setPreviewFrameRate(m76670a(cameraCaptureParams.f74600b));
            parameters.setWhiteBalance("auto");
            parameters.setSceneMode("auto");
            i11 = this.f74608c.mValue;
            if (cameraInfo.facing == 1) {
                i11 = (360 - i11) % TXVodDownloadDataSource.QUALITY_360P;
            }
            this.f74607b.setDisplayOrientation(i11);
            C34953b c34953b3 = this.f74624s;
            Size size2 = this.f74612g;
            c34953b3.m76683a(size2.width, size2.height);
            C34953b c34953b4 = this.f74624s;
            c34953b4.f74628a = this.f74608c.mValue;
            c34953b4.f74629b = this.f74606a;
            this.f74607b.setParameters(parameters);
            this.f74607b.setErrorCallback(this);
            this.f74607b.setPreviewTexture(this.f74611f);
            this.f74607b.startPreview();
            if (this.f74622q) {
                if (isCameraAutoFocusFaceModeSupported()) {
                    LiteavLog.m76087i("CameraController", "camera doesn't support face detection");
                } else {
                    this.f74607b.setFaceDetectionListener(this);
                    this.f74607b.startFaceDetection();
                    this.f74623r = true;
                    LiteavLog.m76087i("CameraController", "start face detection success.");
                }
            }
            return true;
        } catch (Throwable th3) {
            LiteavLog.m76083e("CameraController", "open camera1 fail, Exception:".concat(String.valueOf(th3)));
            return false;
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void turnOnTorch(boolean z11) {
        List<String> supportedFlashModes;
        if (this.f74607b == null) {
            return;
        }
        String str = z11 ? "torch" : "off";
        Camera.Parameters parametersM76675a = m76675a();
        if (parametersM76675a == null || (supportedFlashModes = parametersM76675a.getSupportedFlashModes()) == null || !supportedFlashModes.contains(str)) {
            return;
        }
        try {
            parametersM76675a.setFlashMode(str);
            this.f74607b.setParameters(parametersM76675a);
        } catch (Throwable th2) {
            LiteavLog.m76084e("CameraController", "enable torch failed.", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    private Rect m76674a(float f11, float f12, float f13) {
        int i11 = (int) (f13 * 200.0f);
        Size size = this.f74612g;
        int i12 = (int) (((f11 / size.width) * 2000.0f) - 1000.0f);
        int i13 = (int) (((f12 / size.height) * 2000.0f) - 1000.0f);
        int i14 = i11 / 2;
        int iM76115a = C34743h.m76115a(i12 - i14, -1000, 1000);
        int iM76115a2 = C34743h.m76115a(iM76115a + i11, -1000, 1000);
        int iM76115a3 = C34743h.m76115a(i13 - i14, -1000, 1000);
        return new Rect(iM76115a, iM76115a3, iM76115a2, C34743h.m76115a(i11 + iM76115a3, -1000, 1000));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final float getExposureCompensationStep() {
        if (m76675a() == null) {
            return 0.0f;
        }
        return m76675a().getExposureCompensationStep();
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i11, Camera camera) {
        LiteavLog.m76083e("CameraController", "onError, error:".concat(String.valueOf(i11)));
        int i12 = 1;
        if (i11 == 1 || i11 == 2 || i11 == 100) {
            if (i11 != 2) {
                if (i11 == 100) {
                    i12 = 3;
                } else {
                    i12 = 0;
                }
            }
            CameraEventCallback cameraEventCallback = this.f74617l;
            if (cameraEventCallback != null) {
                cameraEventCallback.onCameraError(this, i12);
            }
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setCameraRotationCorrectionValue(int i11) {
        EnumC34747l enumC34747lM76131a;
        if (EnumC34747l.m76132b(i11)) {
            enumC34747lM76131a = EnumC34747l.m76131a(i11);
        } else {
            enumC34747lM76131a = null;
        }
        this.f74609d = enumC34747lM76131a;
        LiteavLog.m76087i("CameraController", "camera rotation correction is " + this.f74609d);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void stopCapture() {
        LiteavLog.m76087i("CameraController", "stopCapture");
        this.f74624s.m76686b();
        try {
            Camera camera = this.f74607b;
            if (camera != null) {
                if (this.f74623r) {
                    try {
                        camera.stopFaceDetection();
                        this.f74607b.setFaceDetectionListener(null);
                        this.f74623r = false;
                    } catch (Throwable th2) {
                        LiteavLog.m76084e("CameraController", "stop face detection failed.", th2);
                        this.f74623r = false;
                    }
                }
                this.f74607b.setErrorCallback(null);
                this.f74607b.stopPreview();
                this.f74607b.release();
                this.f74607b = null;
            }
        } catch (Throwable th3) {
            LiteavLog.m76083e("CameraController", "closeCamera fail, Exception:".concat(String.valueOf(th3)));
        }
        this.f74611f = null;
    }

    /* JADX INFO: renamed from: a */
    private static int m76671a(Camera.Parameters parameters, float f11) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
            LiteavLog.m76087i("CameraController", "camera doesn't support exposure compensation");
            return minExposureCompensation;
        }
        C34689a.m76039a();
        return C34743h.m76115a((int) (C34743h.m76114a(f11, -1.0f) * maxExposureCompensation), minExposureCompensation, maxExposureCompensation);
    }

    /* JADX INFO: renamed from: a */
    private static int m76673a(boolean z11, Camera.CameraInfo cameraInfo) {
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < Camera.getNumberOfCameras(); i13++) {
            Camera.getCameraInfo(i13, cameraInfo);
            LiteavLog.m76087i("CameraController", "get camera info, index: " + i13 + ", facing: " + cameraInfo.facing);
            if (i11 == -1 && cameraInfo.facing == 1) {
                i11 = i13;
            } else if (i12 == -1 && cameraInfo.facing == 0) {
                i12 = i13;
            }
        }
        if (!z11 ? i12 != -1 : i11 == -1) {
            i11 = i12;
        }
        Camera.getCameraInfo(i11, cameraInfo);
        return i11;
    }

    /* JADX INFO: renamed from: a */
    private static Size m76676a(Camera.Parameters parameters, EnumC34747l enumC34747l, int i11, int i12) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes != null) {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new Size(size.width, size.height));
            }
        }
        return C34958c.m76735a(arrayList, enumC34747l, i11, i12);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setFaceAEStrategy(int i11) {
    }

    /* JADX INFO: renamed from: a */
    private static void m76677a(Camera.Parameters parameters, boolean z11) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return;
        }
        if (z11 && supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
            LiteavLog.m76087i("CameraController", "set focus mode to auto");
        } else if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
            LiteavLog.m76087i("CameraController", "set focus mode to continuous-video");
        }
    }

    /* JADX INFO: renamed from: a */
    private int m76670a(int i11) {
        Camera.Parameters parametersM76675a = m76675a();
        if (parametersM76675a == null) {
            return 1;
        }
        List<Integer> supportedPreviewFrameRates = parametersM76675a.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates == null || supportedPreviewFrameRates.isEmpty()) {
            LiteavLog.m76083e("CameraController", "supported preview frame rates is empty");
            return 1;
        }
        int iIntValue = supportedPreviewFrameRates.get(0).intValue();
        Iterator<Integer> it = supportedPreviewFrameRates.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (Math.abs(i11 - iIntValue2) < Math.abs(i11 - iIntValue)) {
                iIntValue = iIntValue2;
            }
        }
        LiteavLog.m76088i("CameraController", "best matched frame rate: %d", Integer.valueOf(iIntValue));
        return iIntValue;
    }

    /* JADX INFO: renamed from: a */
    private Camera.Parameters m76675a() {
        try {
            Camera camera = this.f74607b;
            if (camera != null) {
                return camera.getParameters();
            }
            return null;
        } catch (Throwable th2) {
            LiteavLog.m76084e("CameraController", "getCameraParameters failed.", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static C34947a[] m76679a(List<int[]> list) {
        if (list != null && list.size() > 0) {
            C34947a[] c34947aArr = new C34947a[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                int[] iArr = list.get(i11);
                if (iArr != null && iArr.length >= 2) {
                    c34947aArr[i11] = new C34947a(iArr[0], iArr[1]);
                }
            }
            return c34947aArr;
        }
        return new C34947a[0];
    }
}
