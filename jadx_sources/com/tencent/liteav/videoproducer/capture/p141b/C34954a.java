package com.tencent.liteav.videoproducer.capture.p141b;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.InterfaceC34757v;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videoproducer.capture.C34953b;
import com.tencent.liteav.videoproducer.capture.C34958c;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.CameraControllerInterface;
import com.tencent.liteav.videoproducer.capture.CameraEventCallback;
import com.tencent.liteav.videoproducer.capture.FaceRect;
import com.tencent.liteav.videoproducer.p139a.C34947a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.b.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34954a extends CameraControllerInterface {

    /* JADX INFO: renamed from: c */
    private static boolean f74633c;

    /* JADX INFO: renamed from: A */
    private CountDownLatch f74636A;

    /* JADX INFO: renamed from: B */
    private CameraEventCallback f74637B;

    /* JADX INFO: renamed from: H */
    private Rect f74643H;

    /* JADX INFO: renamed from: g */
    private final InterfaceC34757v f74652g;

    /* JADX INFO: renamed from: l */
    private CaptureRequest f74657l;

    /* JADX INFO: renamed from: m */
    private CaptureRequest.Builder f74658m;

    /* JADX INFO: renamed from: n */
    private Size f74659n;

    /* JADX INFO: renamed from: s */
    private SurfaceTexture f74664s;

    /* JADX INFO: renamed from: z */
    private CountDownLatch f74671z;

    /* JADX INFO: renamed from: b */
    private static final HashMap<String, CameraCharacteristics> f74632b = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private static String f74634d = "";

    /* JADX INFO: renamed from: e */
    private static String f74635e = "";

    /* JADX INFO: renamed from: f */
    private final Handler f74651f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f74653h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    private final AtomicReference<CameraDevice> f74654i = new AtomicReference<>();

    /* JADX INFO: renamed from: j */
    private final AtomicBoolean f74655j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    private final AtomicReference<CameraCaptureSession> f74656k = new AtomicReference<>();

    /* JADX INFO: renamed from: o */
    private EnumC34747l f74660o = EnumC34747l.NORMAL;

    /* JADX INFO: renamed from: p */
    private EnumC34747l f74661p = null;

    /* JADX INFO: renamed from: q */
    private boolean f74662q = false;

    /* JADX INFO: renamed from: r */
    private int f74663r = 0;

    /* JADX INFO: renamed from: t */
    private boolean f74665t = true;

    /* JADX INFO: renamed from: u */
    private boolean f74666u = true;

    /* JADX INFO: renamed from: v */
    private boolean f74667v = true;

    /* JADX INFO: renamed from: w */
    private int f74668w = -1;

    /* JADX INFO: renamed from: x */
    private a f74669x = a.IDLE;

    /* JADX INFO: renamed from: y */
    private boolean f74670y = false;

    /* JADX INFO: renamed from: a */
    public boolean f74650a = false;

    /* JADX INFO: renamed from: C */
    private float f74638C = 0.0f;

    /* JADX INFO: renamed from: D */
    private float f74639D = 0.0f;

    /* JADX INFO: renamed from: E */
    private float f74640E = 1.0f;

    /* JADX INFO: renamed from: F */
    private boolean f74641F = false;

    /* JADX INFO: renamed from: G */
    private boolean f74642G = false;

    /* JADX INFO: renamed from: I */
    private C34953b f74644I = new C34953b();

    /* JADX INFO: renamed from: J */
    private int f74645J = 0;

    /* JADX INFO: renamed from: K */
    private final CameraDevice.StateCallback f74646K = new CameraDevice.StateCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.1
        /* JADX INFO: renamed from: a */
        private void m76727a(CameraDevice cameraDevice, int i11) {
            if (C34954a.this.f74653h.get()) {
                C34954a.m76705b(C34954a.this, i11);
            } else {
                C34954a.this.m76698a(false, cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            LiteavLog.m76087i("Camera2Controller", "CameraDevice onClosed!" + m76726a(cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            LiteavLog.m76083e("Camera2Controller", "CameraDevice onDisconnected!" + m76726a(cameraDevice));
            m76727a(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i11) {
            LiteavLog.m76083e("Camera2Controller", "CameraDevice onError!" + m76726a(cameraDevice) + ", error:" + i11);
            int i12 = 3;
            if (i11 == 3) {
                i12 = 2;
            } else if (i11 == 1) {
                i12 = 1;
            } else if (i11 != 5) {
                i12 = 4;
                if (i11 != 4) {
                    i12 = 0;
                }
            }
            m76727a(cameraDevice, i12);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            LiteavLog.m76087i("Camera2Controller", "CameraDevice onOpen!" + m76726a(cameraDevice));
            C34954a.this.m76698a(true, cameraDevice);
        }

        /* JADX INFO: renamed from: a */
        private static String m76726a(CameraDevice cameraDevice) {
            if (cameraDevice == null) {
                return "null";
            }
            return "CameraDevice[id:" + cameraDevice.getId() + "]";
        }
    };

    /* JADX INFO: renamed from: L */
    private final CameraCaptureSession.StateCallback f74647L = new CameraCaptureSession.StateCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.2
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            LiteavLog.m76083e("Camera2Controller", "CameraCaptureSession onConfigureFailed!");
            C34954a.this.m76697a(false, cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            LiteavLog.m76087i("Camera2Controller", "CameraCaptureSession onConfigured!");
            C34954a.this.m76697a(true, cameraCaptureSession);
        }
    };

    /* JADX INFO: renamed from: M */
    private final CameraManager.AvailabilityCallback f74648M = new CameraManager.AvailabilityCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.3
        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            super.onCameraAccessPrioritiesChanged();
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            LiteavLog.m76087i("Camera2Controller", "onCameraAvailable: ".concat(String.valueOf(str)));
            if (!C34954a.this.m76719g() && C34954a.m76702b(C34954a.this.f74665t).equals(str) && C34954a.this.f74653h.get()) {
                LiteavLog.m76093w("Camera2Controller", "Current camera is available, it could be interrupted by system app.");
                C34954a c34954a = C34954a.this;
                c34954a.m76698a(false, (CameraDevice) c34954a.f74654i.get());
                C34954a.m76705b(C34954a.this, 1);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            LiteavLog.m76087i("Camera2Controller", "onCameraUnavailable: ".concat(String.valueOf(str)));
        }
    };

    /* JADX INFO: renamed from: N */
    private final CameraCaptureSession.CaptureCallback f74649N = new AnonymousClass4();

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.b.a$4, reason: invalid class name */
    public class AnonymousClass4 extends CameraCaptureSession.CaptureCallback {
        /* JADX INFO: renamed from: a */
        private static boolean m76731a(CaptureRequest captureRequest) {
            return (captureRequest.getTag() instanceof C34954a) && !((C34954a) captureRequest.getTag()).f74650a;
        }

        public AnonymousClass4() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C34954a.this.f74652g.mo76133a(RunnableC34956c.m76733a(this, totalCaptureResult, captureRequest));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            LiteavLog.m76083e("Camera2Controller", "onCaptureFailed failure reason:" + captureFailure.getReason());
            C34954a.this.f74652g.mo76133a(RunnableC34957d.m76734a(this, captureRequest));
        }

        /* JADX INFO: renamed from: a */
        private void m76728a(CaptureRequest captureRequest, boolean z11) {
            if (C34954a.this.m76719g()) {
                return;
            }
            C34954a.m76722j(C34954a.this);
            try {
                C34954a.this.f74658m.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                C34954a.this.f74658m.set(CaptureRequest.CONTROL_AE_MODE, 1);
                C34954a.this.f74658m.set(CaptureRequest.CONTROL_AF_MODE, 3);
                C34954a.this.m76713d();
                if (captureRequest.getTag() instanceof C34954a) {
                    C34954a.m76694a((C34954a) captureRequest.getTag(), z11);
                }
            } catch (Throwable th2) {
                LiteavLog.m76083e("Camera2Controller", "mAfCaptureCallback exception:".concat(String.valueOf(th2)));
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m76729a(AnonymousClass4 anonymousClass4, CaptureRequest captureRequest) {
            if (!m76731a(captureRequest)) {
                C34954a.m76722j(C34954a.this);
            } else {
                anonymousClass4.m76728a(captureRequest, false);
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m76730a(AnonymousClass4 anonymousClass4, TotalCaptureResult totalCaptureResult, CaptureRequest captureRequest) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY);
            C34954a.this.f74645J = num != null ? num.intValue() : 0;
            if (C34954a.this.f74641F && C34954a.this.f74642G) {
                Face[] faceArr = (Face[]) totalCaptureResult.get(CaptureResult.STATISTICS_FACES);
                ArrayList arrayList = new ArrayList();
                for (Face face : faceArr) {
                    arrayList.add(face.getBounds());
                }
                C34953b c34953b = C34954a.this.f74644I;
                Rect rect = C34954a.this.f74643H;
                C34954a c34954a = C34954a.this;
                c34953b.m76685a(arrayList, rect, c34954a.m76708c(c34954a.f74639D));
            }
            if (!m76731a(captureRequest)) {
                C34954a.m76722j(C34954a.this);
                return;
            }
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 == null) {
                LiteavLog.m76083e("Camera2Controller", "handleCaptureCompleted get afState fail");
                anonymousClass4.m76728a(captureRequest, false);
            } else if (4 == num2.intValue() || 5 == num2.intValue()) {
                anonymousClass4.m76728a(captureRequest, true);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.b.a$a */
    public enum a {
        IDLE,
        PREVIEWING
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m76722j(C34954a c34954a) {
        c34954a.f74670y = false;
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m76704b(float f11) {
        float f12;
        int i11;
        if (this.f74658m == null || m76689a() == null) {
            LiteavLog.m76083e("Camera2Controller", "setExposureCompensation fail, value:" + f11 + " mCameraStatus:" + this.f74669x);
            return;
        }
        Range range = (Range) m76689a().get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        int iIntValue = ((Integer) range.getLower()).intValue();
        int iIntValue2 = ((Integer) range.getUpper()).intValue();
        if (iIntValue == 0 && iIntValue2 == 0) {
            LiteavLog.m76087i("Camera2Controller", "camera doesn't support exposure compensation");
            return;
        }
        float fM76114a = C34743h.m76114a(f11, -1.0f);
        if (fM76114a == 0.0f) {
            i11 = 0;
        } else {
            if (fM76114a > 0.0f) {
                f12 = iIntValue2;
            } else {
                fM76114a = Math.abs(fM76114a);
                f12 = iIntValue;
            }
            i11 = (int) (fM76114a * f12);
        }
        this.f74658m.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(C34743h.m76115a(i11, iIntValue, iIntValue2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m76713d() {
        CaptureRequest.Builder builder;
        CameraCaptureSession cameraCaptureSession = this.f74656k.get();
        if (cameraCaptureSession == null || (builder = this.f74658m) == null) {
            return;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), this.f74649N, null);
        } catch (Throwable th2) {
            LiteavLog.m76083e("Camera2Controller", "updatePreview exception:".concat(String.valueOf(th2)));
        }
    }

    /* JADX INFO: renamed from: e */
    private void m76714e() {
        CameraCharacteristics cameraCharacteristicsM76689a;
        int i11 = this.f74663r;
        if (i11 != 0) {
            if (i11 != 2 || this.f74665t) {
                if ((i11 == 3 && this.f74665t) || this.f74658m == null || (cameraCharacteristicsM76689a = m76689a()) == null) {
                    return;
                }
                for (int i12 : (int[]) cameraCharacteristicsM76689a.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES)) {
                    if (i12 == 1) {
                        this.f74658m.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
                        this.f74658m.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                        LiteavLog.m76087i("Camera2Controller", "set control scene mode to 1");
                        return;
                    }
                }
                LiteavLog.m76083e("Camera2Controller", "enable face ae, but device not support.");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private List<Size> m76716f() {
        if (m76689a() == null) {
            LiteavLog.m76083e("Camera2Controller", "getPreviewSizes error, Characteristics is null");
            return null;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m76689a().get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            LiteavLog.m76083e("Camera2Controller", "getPreviewSizes map null");
            return null;
        }
        android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null) {
            LiteavLog.m76083e("Camera2Controller", "getPreviewSizes choices is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.util.Size size : outputSizes) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m76719g() {
        return m76689a() == null || this.f74658m == null || this.f74669x != a.PREVIEWING;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableCameraDynamicFps(boolean z11) {
        this.f74662q = z11;
        LiteavLog.m76087i("Camera2Controller", "set enable camera dynamic fps value is:".concat(String.valueOf(z11)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableFaceDetection(boolean z11) {
        this.f74641F = z11;
        LiteavLog.m76087i("Camera2Controller", "enable face detection is: ".concat(String.valueOf(z11)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableTapToFocus(boolean z11) {
        this.f74666u = z11;
        if (this.f74670y) {
            return;
        }
        m76710c(z11);
        m76713d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final FaceRect getCameraFaceRect() {
        return this.f74644I.m76682a();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final EnumC34747l getCameraSystemRotation() {
        return this.f74660o;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCameraSystemRotationValue() {
        return this.f74660o.mValue;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCurrentCameraISO() {
        return this.f74645J;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getMaxZoom() {
        return Math.round(this.f74640E);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final Size getPreviewSize() {
        return this.f74659n;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCurrentPreviewSizeAspectRatioMatch(int i11, int i12, boolean z11) {
        EnumC34747l enumC34747l = this.f74661p;
        if (enumC34747l == null) {
            enumC34747l = this.f74660o;
        }
        Size sizeM76735a = C34958c.m76735a(m76716f(), enumC34747l, i11, i12);
        int i13 = sizeM76735a.width;
        Size size = this.f74659n;
        boolean z12 = i13 <= size.width && sizeM76735a.height <= size.height;
        if (m76687a(sizeM76735a) != m76687a(this.f74659n)) {
            z12 = false;
        }
        boolean z13 = (!z11 || Math.abs(sizeM76735a.aspectRatio() - this.f74659n.aspectRatio()) <= 0.001d) ? z12 : false;
        LiteavLog.m76087i("Camera2Controller", "isCurrentPreviewSizeAspectRatioMatch:".concat(String.valueOf(z13)));
        return z13;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensation(int i11) {
        if (this.f74658m == null || m76689a() == null) {
            LiteavLog.m76083e("Camera2Controller", "setExposureCompensation fail, value:" + i11 + " mCameraStatus:" + this.f74669x);
            return;
        }
        if (((Integer) ((Range) m76689a().get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getUpper()).intValue() <= 0) {
            LiteavLog.m76087i("Camera2Controller", "camera doesn't support exposure compensation");
        } else {
            this.f74658m.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i11));
            m76713d();
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensationNormalization(float f11) {
        this.f74638C = f11;
        m76704b(f11);
        m76713d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setFaceAEStrategy(int i11) {
        this.f74663r = i11;
        LiteavLog.m76087i("Camera2Controller", "set enable camera face ae value is: " + this.f74663r);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setZoom(float f11) {
        this.f74639D = f11;
        m76692a(f11);
        m76713d();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[PHI: r0
      0x0082: PHI (r0v8 android.graphics.Rect) = (r0v7 android.graphics.Rect), (r0v27 android.graphics.Rect) binds: [B:24:0x005c, B:30:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void startAutoFocusAtPosition(int i11, int i12) {
        int iWidth;
        int iHeight;
        int i13;
        int i14;
        int i15;
        double d11;
        double d12;
        double d13;
        Rect rect;
        if (this.f74666u && this.f74667v) {
            if (m76719g() || this.f74670y) {
                LiteavLog.m76083e("Camera2Controller", "autoFocus not preview, mCameraStatus:" + this.f74669x + " mIsAutoFocusing:" + this.f74670y);
                return;
            }
            CameraCaptureSession cameraCaptureSession = this.f74656k.get();
            if (cameraCaptureSession == null) {
                LiteavLog.m76083e("Camera2Controller", "CameraCaptureSession get fail");
                return;
            }
            if (i11 >= 0) {
                Size size = this.f74659n;
                if (i11 < size.width && i12 >= 0 && i12 < size.height) {
                    LiteavLog.m76088i("Camera2Controller", "Start auto focus at (%d, %d)", Integer.valueOf(i11), Integer.valueOf(i12));
                    double d14 = i11;
                    double d15 = i12;
                    Rect rect2 = (Rect) this.f74657l.get(CaptureRequest.SCALER_CROP_REGION);
                    if (rect2 == null) {
                        LiteavLog.m76083e("Camera2Controller", "getMeteringRect can't get crop region");
                        rect2 = (Rect) m76689a().get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        if (rect2 == null || rect2.height() <= 0 || rect2.width() <= 0) {
                            cameraCaptureSession = cameraCaptureSession;
                            rect = null;
                        } else {
                            iWidth = rect2.width();
                            iHeight = rect2.height();
                            Size size2 = this.f74659n;
                            i13 = size2.height;
                            i14 = i13 * iWidth;
                            i15 = size2.width;
                            d11 = 0.0d;
                            if (i14 > i15 * iHeight) {
                                d12 = (((double) iHeight) * 1.0d) / ((double) i13);
                                d11 = (((double) iWidth) - (((double) i15) * d12)) / 2.0d;
                                d13 = 0.0d;
                            } else {
                                d12 = (((double) iWidth) * 1.0d) / ((double) i15);
                                d13 = (((double) iHeight) - (((double) i13) * d12)) / 2.0d;
                            }
                            double d16 = (d14 * d12) + d11 + ((double) rect2.left);
                            double d17 = (d15 * d12) + d13 + ((double) rect2.top);
                            rect = new Rect();
                            rect.left = C34743h.m76115a((int) (d16 - (((double) rect2.width()) * 0.05d)), 0, rect2.width());
                            rect.right = C34743h.m76115a((int) (d16 + (((double) rect2.width()) * 0.05d)), 0, rect2.width());
                            rect.top = C34743h.m76115a((int) (d17 - (((double) rect2.height()) * 0.05d)), 0, rect2.height());
                            rect.bottom = C34743h.m76115a((int) (d17 + (((double) rect2.height()) * 0.05d)), 0, rect2.height());
                        }
                    } else {
                        iWidth = rect2.width();
                        iHeight = rect2.height();
                        Size size3 = this.f74659n;
                        i13 = size3.height;
                        i14 = i13 * iWidth;
                        i15 = size3.width;
                        d11 = 0.0d;
                        if (i14 > i15 * iHeight) {
                            d12 = (((double) iHeight) * 1.0d) / ((double) i13);
                            d11 = (((double) iWidth) - (((double) i15) * d12)) / 2.0d;
                            d13 = 0.0d;
                        } else {
                            d12 = (((double) iWidth) * 1.0d) / ((double) i15);
                            d13 = (((double) iHeight) - (((double) i13) * d12)) / 2.0d;
                        }
                        double d18 = (d14 * d12) + d11 + ((double) rect2.left);
                        double d19 = (d15 * d12) + d13 + ((double) rect2.top);
                        rect = new Rect();
                        rect.left = C34743h.m76115a((int) (d18 - (((double) rect2.width()) * 0.05d)), 0, rect2.width());
                        rect.right = C34743h.m76115a((int) (d18 + (((double) rect2.width()) * 0.05d)), 0, rect2.width());
                        rect.top = C34743h.m76115a((int) (d19 - (((double) rect2.height()) * 0.05d)), 0, rect2.height());
                        rect.bottom = C34743h.m76115a((int) (d19 + (((double) rect2.height()) * 0.05d)), 0, rect2.height());
                    }
                    if (rect == null) {
                        LiteavLog.m76083e("Camera2Controller", "Illegal meterRect:" + ((Object) null));
                        return;
                    }
                    try {
                        this.f74658m.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
                        this.f74658m.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
                        this.f74658m.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f74658m.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f74658m.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                        this.f74670y = true;
                        this.f74650a = false;
                        this.f74658m.setTag(this);
                        cameraCaptureSession.setRepeatingRequest(this.f74658m.build(), this.f74649N, this.f74651f);
                        return;
                    } catch (Throwable th2) {
                        LiteavLog.m76083e("Camera2Controller", "startAutoFocusAtPosition exception:".concat(String.valueOf(th2)));
                        return;
                    }
                }
            }
            LiteavLog.m76094w("Camera2Controller", "Start auto focus at (%d, %d) invalid ", Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean startCapture(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, CameraEventCallback cameraEventCallback) {
        boolean z11;
        this.f74637B = cameraEventCallback;
        if (!f74633c) {
            try {
                CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
                for (String str : cameraManager.getCameraIdList()) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num != null && num.intValue() == 0 && "1".equals(str)) {
                        f74632b.put(str, cameraCharacteristics);
                        f74635e = str;
                    } else if (num != null && num.intValue() == 1 && "0".equals(str)) {
                        f74632b.put(str, cameraCharacteristics);
                        f74634d = str;
                    }
                }
                LiteavLog.m76087i("Camera2Controller", "initCamera2Ability front:" + f74635e + ", back:" + f74634d);
            } catch (Throwable th2) {
                f74635e = "1";
                LiteavLog.m76083e("Camera2Controller", "initCamera2Ability exception!".concat(String.valueOf(th2)));
            }
            f74633c = true;
        }
        if (cameraCaptureParams == null || surfaceTexture == null) {
            LiteavLog.m76083e("Camera2Controller", "captureParams or surfaceTexture is null");
            return false;
        }
        a aVar = this.f74669x;
        a aVar2 = a.IDLE;
        if (aVar != aVar2) {
            LiteavLog.m76083e("Camera2Controller", "it's capturing, you should Stop first.");
            return false;
        }
        this.f74664s = surfaceTexture;
        this.f74665t = cameraCaptureParams.f74594a.booleanValue();
        if (m76689a() == null) {
            z11 = false;
        } else {
            int[] iArr = (int[]) m76689a().get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) {
                StringBuilder sb2 = new StringBuilder("Current ");
                sb2.append(this.f74665t ? "front camera " : "back camera ");
                sb2.append(" is not support auto focus.");
                LiteavLog.m76093w("Camera2Controller", sb2.toString());
                z11 = false;
            } else {
                z11 = true;
            }
        }
        this.f74667v = z11;
        ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).registerAvailabilityCallback(this.f74648M, this.f74651f);
        if (!m76699a(cameraCaptureParams.f74601c, cameraCaptureParams.f74602d)) {
            LiteavLog.m76083e("Camera2Controller", "openCamera failed.");
            m76709c();
            this.f74669x = aVar2;
            return false;
        }
        if (!m76700a(surfaceTexture)) {
            LiteavLog.m76083e("Camera2Controller", "startPreview failed.");
            m76703b();
            this.f74669x = aVar2;
            return false;
        }
        C34953b c34953b = this.f74644I;
        c34953b.f74628a = this.f74660o.mValue;
        Size size = this.f74659n;
        c34953b.m76683a(size.width, size.height);
        this.f74644I.f74629b = this.f74665t;
        this.f74658m.set(CaptureRequest.CONTROL_AE_MODE, 1);
        int i11 = cameraCaptureParams.f74600b;
        LiteavLog.m76087i("Camera2Controller", "preferred fps: ".concat(String.valueOf(i11)));
        Range range = new Range(Integer.valueOf(i11), Integer.valueOf(i11));
        CameraCharacteristics cameraCharacteristicsM76689a = m76689a();
        if (cameraCharacteristicsM76689a == null) {
            LiteavLog.m76083e("Camera2Controller", "camera characteristics is null");
        } else {
            C34947a c34947aM76736a = C34958c.m76736a(m76701a((Range<Integer>[]) cameraCharacteristicsM76689a.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)), i11, this.f74662q);
            if (c34947aM76736a != null) {
                range = new Range(Integer.valueOf(c34947aM76736a.f74592a), Integer.valueOf(c34947aM76736a.f74593b));
            }
        }
        LiteavLog.m76087i("Camera2Controller", "get best matched fps range result is ".concat(String.valueOf(range)));
        this.f74658m.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        m76710c(this.f74666u);
        m76692a(this.f74639D);
        m76704b(this.f74638C);
        m76714e();
        if (this.f74641F) {
            if (isCameraAutoFocusFaceModeSupported()) {
                try {
                    this.f74658m.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
                    this.f74642G = true;
                } catch (Throwable th3) {
                    LiteavLog.m76083e("Camera2Controller", "startFaceDetection exception:".concat(String.valueOf(th3)));
                }
            } else {
                LiteavLog.m76083e("Camera2Controller", "Camera not support auto focus face mode");
            }
        }
        this.f74657l = this.f74658m.build();
        m76713d();
        this.f74669x = a.PREVIEWING;
        this.f74640E = ((Float) m76689a().get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        this.f74643H = (Rect) m76689a().get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        LiteavLog.m76087i("Camera2Controller", "startCaptureInternal ok, mMaxZoomLevel:" + this.f74640E);
        return true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void stopCapture() {
        CountDownLatch countDownLatch = this.f74671z;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        this.f74671z = null;
        CountDownLatch countDownLatch2 = this.f74636A;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
        this.f74636A = null;
        if (this.f74642G) {
            try {
                this.f74658m.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                this.f74642G = false;
            } catch (Throwable th2) {
                LiteavLog.m76083e("Camera2Controller", "stopFaceDetection exception:".concat(String.valueOf(th2)));
            }
        }
        m76703b();
        m76709c();
        this.f74657l = null;
        this.f74650a = false;
        this.f74653h.set(false);
        this.f74664s = null;
        this.f74668w = -1;
        this.f74669x = a.IDLE;
        this.f74644I.m76686b();
        LiteavLog.m76087i("Camera2Controller", "stopCapture success");
    }

    public C34954a(InterfaceC34757v interfaceC34757v) {
        this.f74652g = interfaceC34757v;
    }

    /* JADX INFO: renamed from: c */
    private void m76709c() {
        CameraDevice andSet = this.f74654i.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (Throwable th2) {
                LiteavLog.m76083e("Camera2Controller", "closeCamera fail, Exception:".concat(String.valueOf(th2)));
            }
        }
        ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).unregisterAvailabilityCallback(this.f74648M);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final float getExposureCompensationStep() {
        if (m76689a() == null) {
            LiteavLog.m76083e("Camera2Controller", "getExposureCompensationStep fail, mCameraStatus:" + this.f74669x);
            return 0.0f;
        }
        Rational rational = (Rational) m76689a().get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (rational == null) {
            LiteavLog.m76083e("Camera2Controller", "getExposureCompensationStep fail, rational is null");
            return 0.0f;
        }
        return rational.floatValue();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraAutoFocusFaceModeSupported() {
        if (m76689a() != null && ((Integer) m76689a().get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraFocusPositionInPreviewSupported() {
        if (m76689a() != null && ((Integer) m76689a().get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isTorchSupported() {
        if (m76689a() != null && ((Boolean) m76689a().get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isZoomSupported() {
        if (m76689a() != null && this.f74640E > 0.0f) {
            return true;
        }
        return false;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setCameraRotationCorrectionValue(int i11) {
        EnumC34747l enumC34747lM76131a;
        if (EnumC34747l.m76132b(i11)) {
            enumC34747lM76131a = EnumC34747l.m76131a(i11);
        } else {
            enumC34747lM76131a = null;
        }
        this.f74661p = enumC34747lM76131a;
        LiteavLog.m76087i("Camera2Controller", "camera rotation correction is " + this.f74661p);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void turnOnTorch(boolean z11) {
        if (m76719g()) {
            LiteavLog.m76083e("Camera2Controller", "turnOnTorch error mCameraStatus:" + this.f74669x);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f74668w != 2) {
            this.f74668w = 2;
        } else if (!z11) {
            this.f74668w = 0;
        } else {
            z12 = false;
        }
        LiteavLog.m76087i("Camera2Controller", "turnOnTorch:" + z11 + ", mode:" + this.f74668w + ", updateView:" + z12);
        if (z12) {
            this.f74658m.set(CaptureRequest.FLASH_MODE, Integer.valueOf(this.f74668w));
            m76713d();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76692a(float f11) {
        if (this.f74658m != null && m76689a() != null) {
            Rect rectM76708c = m76708c(f11);
            if (rectM76708c == null) {
                LiteavLog.m76083e("Camera2Controller", "Illegal zoomRect:".concat(String.valueOf(rectM76708c)));
                return;
            } else {
                this.f74658m.set(CaptureRequest.SCALER_CROP_REGION, rectM76708c);
                return;
            }
        }
        LiteavLog.m76083e("Camera2Controller", "setZoom fail, scale:" + f11 + " mPreviewBuilder is null.");
    }

    /* JADX INFO: renamed from: c */
    private void m76710c(boolean z11) {
        CaptureRequest.Builder builder = this.f74658m;
        if (builder == null) {
            return;
        }
        int i11 = z11 ? 1 : 3;
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i11));
        LiteavLog.m76087i("Camera2Controller", "setFocusModeWithoutUpdatePreview to ".concat(String.valueOf(i11)));
    }

    /* JADX INFO: renamed from: a */
    private static int m76687a(Size size) {
        int i11 = size.width;
        int i12 = size.height;
        if (i11 == i12) {
            return 0;
        }
        return i11 > i12 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public Rect m76708c(float f11) {
        Rect rect = (Rect) m76689a().get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect == null || rect.height() <= 0 || rect.width() <= 0) {
            return null;
        }
        float fM76114a = (C34743h.m76114a(f11, 0.0f) * (this.f74640E - 1.0f)) + 1.0f;
        int iWidth = (int) (rect.width() / this.f74640E);
        int iHeight = (int) (rect.height() / this.f74640E);
        int iWidth2 = rect.width() - iWidth;
        int iHeight2 = rect.height() - iHeight;
        float f12 = fM76114a - 1.0f;
        float f13 = iWidth2 * f12;
        float f14 = this.f74640E;
        int i11 = (int) ((f13 / (f14 - 1.0f)) / 2.0f);
        int i12 = (int) (((iHeight2 * f12) / (f14 - 1.0f)) / 2.0f);
        return new Rect(i11, i12, rect.width() - i11, rect.height() - i12);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76693a(C34954a c34954a, int i11) {
        if (c34954a.m76719g()) {
            LiteavLog.m76083e("Camera2Controller", "onCameraError, but camera is invalid, do not send camera error.");
            return;
        }
        CameraEventCallback cameraEventCallback = c34954a.f74637B;
        if (cameraEventCallback != null) {
            cameraEventCallback.onCameraError(c34954a, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m76702b(boolean z11) {
        if (z11) {
            return !TextUtils.isEmpty(f74635e) ? f74635e : f74634d;
        }
        return !TextUtils.isEmpty(f74634d) ? f74634d : f74635e;
    }

    /* JADX INFO: renamed from: b */
    private void m76703b() {
        CameraCaptureSession andSet = this.f74656k.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (Throwable th2) {
                LiteavLog.m76083e("Camera2Controller", "closePreviewSession fail, Exception:".concat(String.valueOf(th2)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76698a(boolean z11, CameraDevice cameraDevice) {
        CountDownLatch countDownLatch = this.f74671z;
        this.f74653h.set(z11);
        this.f74654i.set(cameraDevice);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76705b(C34954a c34954a, int i11) {
        c34954a.f74652g.mo76133a(RunnableC34955b.m76732a(c34954a, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76697a(boolean z11, CameraCaptureSession cameraCaptureSession) {
        CountDownLatch countDownLatch = this.f74636A;
        this.f74655j.set(z11);
        this.f74656k.set(cameraCaptureSession);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: a */
    private CameraCharacteristics m76689a() {
        String strM76702b = m76702b(this.f74665t);
        if (TextUtils.isEmpty(strM76702b)) {
            return null;
        }
        return f74632b.get(strM76702b);
    }

    /* JADX INFO: renamed from: a */
    private boolean m76699a(int i11, int i12) {
        String strM76702b = m76702b(this.f74665t);
        if (m76689a() == null) {
            LiteavLog.m76083e("Camera2Controller", "openCamera fail getCameraCharacteristics null");
            return false;
        }
        EnumC34747l enumC34747lM76131a = EnumC34747l.m76131a(((Integer) m76689a().get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue());
        this.f74660o = enumC34747lM76131a;
        EnumC34747l enumC34747l = this.f74661p;
        if (enumC34747l != null) {
            enumC34747lM76131a = enumC34747l;
        }
        this.f74659n = C34958c.m76735a(m76716f(), enumC34747lM76131a, i11, i12);
        StringBuilder sb2 = new StringBuilder("openCamera ,id:");
        sb2.append(strM76702b);
        sb2.append(",");
        sb2.append(this.f74665t ? "front camera" : "back camera");
        sb2.append(" mPreviewSize ");
        sb2.append(this.f74659n);
        sb2.append(" cameraRotation ");
        sb2.append(enumC34747lM76131a);
        sb2.append(" mIsCameraSupportAutoFocus ");
        sb2.append(this.f74667v);
        LiteavLog.m76087i("Camera2Controller", sb2.toString());
        try {
            this.f74671z = new CountDownLatch(1);
            ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).openCamera(strM76702b, this.f74646K, this.f74651f);
            this.f74671z.await();
        } catch (Throwable th2) {
            LiteavLog.m76083e("Camera2Controller", "openCamera exception:".concat(String.valueOf(th2)));
            m76698a(false, (CameraDevice) null);
        }
        return this.f74653h.get();
    }

    /* JADX INFO: renamed from: a */
    private boolean m76700a(SurfaceTexture surfaceTexture) {
        try {
            CameraDevice cameraDevice = this.f74654i.get();
            if (cameraDevice != null && surfaceTexture != null) {
                m76703b();
                SurfaceTexture surfaceTexture2 = this.f74664s;
                Size size = this.f74659n;
                surfaceTexture2.setDefaultBufferSize(size.width, size.height);
                Surface surface = new Surface(this.f74664s);
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(3);
                this.f74658m = builderCreateCaptureRequest;
                builderCreateCaptureRequest.addTarget(surface);
                List<Surface> listSingletonList = Collections.singletonList(surface);
                this.f74636A = new CountDownLatch(1);
                cameraDevice.createCaptureSession(listSingletonList, this.f74647L, this.f74651f);
                this.f74636A.await();
                return this.f74655j.get();
            }
            throw new IOException("startPreview cameraDevice null!");
        } catch (Throwable th2) {
            LiteavLog.m76084e("Camera2Controller", "startPreview exception", th2);
            m76697a(false, (CameraCaptureSession) null);
        }
    }

    /* JADX INFO: renamed from: a */
    private static C34947a[] m76701a(Range<Integer>[] rangeArr) {
        if (rangeArr != null && rangeArr.length > 0) {
            C34947a[] c34947aArr = new C34947a[rangeArr.length];
            for (int i11 = 0; i11 < rangeArr.length; i11++) {
                c34947aArr[i11] = new C34947a(((Integer) rangeArr[i11].getLower()).intValue(), ((Integer) rangeArr[i11].getUpper()).intValue());
            }
            return c34947aArr;
        }
        return new C34947a[0];
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76694a(C34954a c34954a, boolean z11) {
        LiteavLog.m76087i("Camera2Controller", "onFocusCallback success:".concat(String.valueOf(z11)));
        c34954a.f74650a = true;
        boolean z12 = c34954a.f74666u;
        if (z12) {
            return;
        }
        c34954a.m76710c(z12);
        c34954a.m76713d();
    }
}
