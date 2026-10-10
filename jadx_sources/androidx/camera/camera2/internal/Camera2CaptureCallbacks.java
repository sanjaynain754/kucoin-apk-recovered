package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class Camera2CaptureCallbacks {

    public static final class ComboSessionCaptureCallback extends CameraCaptureSession.CaptureCallback {
        private final List<CameraCaptureSession.CaptureCallback> mCallbacks = new ArrayList();

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(api = 24)
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j11) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                ApiCompat.Api24Impl.onCaptureBufferLost(it.next(), cameraCaptureSession, captureRequest, surface, j11);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i11) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceAborted(cameraCaptureSession, i11);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i11, long j11) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceCompleted(cameraCaptureSession, i11, j11);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j11, long j12) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j11, j12);
            }
        }

        public ComboSessionCaptureCallback(List<CameraCaptureSession.CaptureCallback> list) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                if (!(captureCallback instanceof NoOpSessionCaptureCallback)) {
                    this.mCallbacks.add(captureCallback);
                }
            }
        }
    }

    public static CameraCaptureSession.CaptureCallback createComboCallback(List<CameraCaptureSession.CaptureCallback> list) {
        return new ComboSessionCaptureCallback(list);
    }

    public static CameraCaptureSession.CaptureCallback createComboCallback(CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return createComboCallback((List<CameraCaptureSession.CaptureCallback>) Arrays.asList(captureCallbackArr));
    }

    public static CameraCaptureSession.CaptureCallback createNoOpCallback() {
        return new NoOpSessionCaptureCallback();
    }

    private Camera2CaptureCallbacks() {
    }

    public static final class NoOpSessionCaptureCallback extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i11) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i11, long j11) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j11) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j11, long j12) {
        }
    }
}
