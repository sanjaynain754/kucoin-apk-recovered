package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.C0686l;

/* JADX INFO: loaded from: classes23.dex */
public final class ApiCompat {

    public static class Api21Impl {
        private Api21Impl() {
        }

        public static void close(CameraDevice cameraDevice) {
            cameraDevice.close();
        }
    }

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void onSurfacePrepared(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }

    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static void onCaptureBufferLost(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j11) {
            captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j11);
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static <T> OutputConfiguration newOutputConfiguration(Size size, Class<T> cls) {
            return C0686l.m1641a(size, cls);
        }

        public static void onCaptureQueueEmpty(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void onCameraAccessPrioritiesChanged(CameraManager.AvailabilityCallback availabilityCallback) {
            availabilityCallback.onCameraAccessPrioritiesChanged();
        }
    }

    private ApiCompat() {
    }
}
