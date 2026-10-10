package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Process;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.InterfaceC34757v;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videoproducer.capture.p140a.C34951a;
import com.tencent.liteav.videoproducer.capture.p141b.C34954a;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public abstract class CameraControllerInterface {
    public static final int CAMERA_ERROR_DEVICE = 4;
    public static final int CAMERA_ERROR_DISABLED = 2;
    public static final int CAMERA_ERROR_OCCUPIED = 1;
    public static final int CAMERA_ERROR_SERVER_DIED = 3;
    public static final int CAMERA_ERROR_UNKNOWN = 0;
    public static final int CAMERA_FACE_AE_STRATEGY_ALWAYS_ON = 1;
    public static final int CAMERA_FACE_AE_STRATEGY_BACK_ONLY = 3;
    public static final int CAMERA_FACE_AE_STRATEGY_FRONT_ONLY = 2;
    public static final int CAMERA_FACE_AE_STRATEGY_OFF = 0;
    private static final String TAG = "CameraControllerInterface";

    public abstract void enableCameraDynamicFps(boolean z11);

    public abstract void enableFaceDetection(boolean z11);

    public abstract void enableTapToFocus(boolean z11);

    public abstract FaceRect getCameraFaceRect();

    public abstract EnumC34747l getCameraSystemRotation();

    public abstract int getCameraSystemRotationValue();

    public abstract int getCurrentCameraISO();

    public abstract float getExposureCompensationStep();

    public abstract int getMaxZoom();

    public abstract Size getPreviewSize();

    public abstract boolean isCameraAutoFocusFaceModeSupported();

    public abstract boolean isCameraFocusPositionInPreviewSupported();

    public abstract boolean isCurrentPreviewSizeAspectRatioMatch(int i11, int i12, boolean z11);

    public abstract boolean isTorchSupported();

    public abstract boolean isZoomSupported();

    public abstract void setCameraRotationCorrectionValue(int i11);

    public abstract void setExposureCompensation(int i11);

    public abstract void setExposureCompensationNormalization(float f11);

    public abstract void setFaceAEStrategy(int i11);

    public abstract void setZoom(float f11);

    public abstract void startAutoFocusAtPosition(int i11, int i12);

    public abstract boolean startCapture(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, CameraEventCallback cameraEventCallback);

    public abstract void stopCapture();

    public abstract void turnOnTorch(boolean z11);

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.CameraControllerInterface$1 */
    public static /* synthetic */ class C349481 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f74595a;

        static {
            int[] iArr = new int[EnumC34949a.values().length];
            f74595a = iArr;
            try {
                iArr[EnumC34949a.CAMERA_2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74595a[EnumC34949a.CAMERA_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.CameraControllerInterface$a */
    public enum EnumC34949a {
        MOCK(0),
        CAMERA_1(1),
        CAMERA_2(2);

        private final int mValue;

        EnumC34949a(int i11) {
            this.mValue = i11;
        }

        /* JADX INFO: renamed from: a */
        public static EnumC34949a m76669a(int i11) {
            for (EnumC34949a enumC34949a : values()) {
                if (enumC34949a.mValue == i11) {
                    return enumC34949a;
                }
            }
            return CAMERA_1;
        }
    }

    public static CameraControllerInterface createCameraController(int i11, final Handler handler) {
        CameraControllerInterface c34954a;
        EnumC34949a enumC34949aM76669a = EnumC34949a.m76669a(i11);
        if (C349481.f74595a[enumC34949aM76669a.ordinal()] != 1) {
            c34954a = new C34951a();
        } else {
            handler.getClass();
            c34954a = new C34954a(new InterfaceC34757v(handler) { // from class: com.tencent.liteav.videoproducer.capture.a

                /* JADX INFO: renamed from: a */
                private final Handler f74605a;

                @Override // com.tencent.liteav.base.util.InterfaceC34757v
                /* JADX INFO: renamed from: a */
                public final void mo76133a(Runnable runnable) {
                    this.f74605a.post(runnable);
                }

                {
                    this.f74605a = handler;
                }
            });
        }
        LiteavLog.m76087i(TAG, "createCameraController, CameraAPIType:" + enumC34949aM76669a + ", return camera controller: " + c34954a);
        return c34954a;
    }

    public static boolean hasCameraPermission() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || LiteavSystemInfo.getSystemOSVersionInt() < 23 || applicationContext.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }
}
