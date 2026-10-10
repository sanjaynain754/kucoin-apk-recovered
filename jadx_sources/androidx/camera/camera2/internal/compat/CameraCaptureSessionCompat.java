package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraCaptureSessionCompat {
    private final CameraCaptureSessionCompatImpl mImpl;

    public interface CameraCaptureSessionCompatImpl {
        int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        CameraCaptureSession unwrap();
    }

    public static final class CaptureCallbackExecutorWrapper extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        final CameraCaptureSession.CaptureCallback mWrappedCallback;

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(24)
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j11) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.h
                @Override // java.lang.Runnable
                public final void run() {
                    ApiCompat.Api24Impl.onCaptureBufferLost(this.f1283b.mWrappedCallback, cameraCaptureSession, captureRequest, surface, j11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1267b.mWrappedCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1279b.mWrappedCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1271b.mWrappedCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i11) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1288b.mWrappedCallback.onCaptureSequenceAborted(cameraCaptureSession, i11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i11, final long j11) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1275b.mWrappedCallback.onCaptureSequenceCompleted(cameraCaptureSession, i11, j11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j11, final long j12) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1262b.mWrappedCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j11, j12);
                }
            });
        }

        public CaptureCallbackExecutorWrapper(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = captureCallback;
        }
    }

    public static final class StateCallbackExecutorWrapper extends CameraCaptureSession.StateCallback {
        private final Executor mExecutor;
        final CameraCaptureSession.StateCallback mWrappedCallback;

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1291b.mWrappedCallback.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(26)
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.m
                @Override // java.lang.Runnable
                public final void run() {
                    ApiCompat.Api26Impl.onCaptureQueueEmpty(this.f1298b.mWrappedCallback, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1293b.mWrappedCallback.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1304b.mWrappedCallback.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1300b.mWrappedCallback.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1302b.mWrappedCallback.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(23)
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.l
                @Override // java.lang.Runnable
                public final void run() {
                    ApiCompat.Api23Impl.onSurfacePrepared(this.f1295b.mWrappedCallback, cameraCaptureSession, surface);
                }
            });
        }

        public StateCallbackExecutorWrapper(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }
    }

    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession) {
        return toCameraCaptureSessionCompat(cameraCaptureSession, MainThreadAsyncHandler.getInstance());
    }

    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.mImpl.captureBurstRequests(list, executor, captureCallback);
    }

    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.mImpl.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.mImpl.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.mImpl.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession toCameraCaptureSession() {
        return this.mImpl.unwrap();
    }

    private CameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new CameraCaptureSessionCompatApi28Impl(cameraCaptureSession);
        } else {
            this.mImpl = CameraCaptureSessionCompatBaseImpl.create(cameraCaptureSession, handler);
        }
    }

    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new CameraCaptureSessionCompat(cameraCaptureSession, handler);
    }
}
