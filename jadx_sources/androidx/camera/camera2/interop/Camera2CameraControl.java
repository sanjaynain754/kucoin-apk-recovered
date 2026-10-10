package androidx.camera.camera2.interop;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalCamera2Interop
public final class Camera2CameraControl {
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    CallbackToFutureAdapter.Completer<Void> mCompleter;
    final Executor mExecutor;
    private boolean mIsActive = false;
    private boolean mPendingUpdate = false;
    final Object mLock = new Object();

    @GuardedBy("mLock")
    private Camera2ImplConfig.Builder mBuilder = new Camera2ImplConfig.Builder();

    /* JADX INFO: Access modifiers changed from: private */
    public void updateConfig(CallbackToFutureAdapter.Completer<Void> completer) {
        this.mPendingUpdate = true;
        failInFlightUpdate(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        this.mCompleter = completer;
        if (this.mIsActive) {
            updateSession();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m1830a(final Camera2CameraControl camera2CameraControl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.interop.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f1552b.updateConfig(completer);
            }
        });
        return "addCaptureRequestOptions";
    }

    private void addCaptureRequestOptionsInternal(CaptureRequestOptions captureRequestOptions) {
        synchronized (this.mLock) {
            this.mBuilder.insertAllOptions(captureRequestOptions);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1831b(final Camera2CameraControl camera2CameraControl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.interop.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f1542b.updateConfig(completer);
            }
        });
        return "clearCaptureRequestOptions";
    }

    private void clearCaptureRequestOptionsInternal() {
        synchronized (this.mLock) {
            this.mBuilder = new Camera2ImplConfig.Builder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeInFlightUpdate() {
        CallbackToFutureAdapter.Completer<Void> completer = this.mCompleter;
        if (completer != null) {
            completer.set(null);
            this.mCompleter = null;
        }
    }

    private void failInFlightUpdate(Exception exc) {
        CallbackToFutureAdapter.Completer<Void> completer = this.mCompleter;
        if (completer != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            completer.setException(exc);
            this.mCompleter = null;
        }
    }

    public static Camera2CameraControl from(CameraControl cameraControl) {
        CameraControlInternal implementation = ((CameraControlInternal) cameraControl).getImplementation();
        Preconditions.checkArgument(implementation instanceof Camera2CameraControlImpl, "CameraControl doesn't contain Camera2 implementation.");
        return ((Camera2CameraControlImpl) implementation).getCamera2CameraControl();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m1836g(final Camera2CameraControl camera2CameraControl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.interop.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f1546b.updateConfig(completer);
            }
        });
        return "setCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveInternal(boolean z11) {
        if (this.mIsActive == z11) {
            return;
        }
        this.mIsActive = z11;
        if (!z11) {
            failInFlightUpdate(new CameraControl.OperationCanceledException("The camera control has became inactive."));
        } else if (this.mPendingUpdate) {
            updateSession();
        }
    }

    private void updateSession() {
        this.mCamera2CameraControlImpl.updateSessionConfigAsync().addListener(new Runnable() { // from class: androidx.camera.camera2.interop.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f1545b.completeInFlightUpdate();
            }
        }, this.mExecutor);
        this.mPendingUpdate = false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void applyOptionsToBuilder(Camera2ImplConfig.Builder builder) {
        synchronized (this.mLock) {
            builder.insertAllOptions(this.mBuilder.getMutableConfig(), Config.OptionPriority.ALWAYS_OVERRIDE);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2ImplConfig getCamera2ImplConfig() {
        Camera2ImplConfig camera2ImplConfigBuild;
        synchronized (this.mLock) {
            camera2ImplConfigBuild = this.mBuilder.build();
        }
        return camera2ImplConfigBuild;
    }

    public CaptureRequestOptions getCaptureRequestOptions() {
        CaptureRequestOptions captureRequestOptionsBuild;
        synchronized (this.mLock) {
            captureRequestOptionsBuild = CaptureRequestOptions.Builder.from(this.mBuilder.build()).build();
        }
        return captureRequestOptionsBuild;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActive(final boolean z11) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.interop.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f1548b.setActiveInternal(z11);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2CameraControl(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
    }

    public ListenableFuture<Void> addCaptureRequestOptions(CaptureRequestOptions captureRequestOptions) {
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.interop.b
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControl.m1830a(this.f1544a, completer);
            }
        }));
    }

    public ListenableFuture<Void> clearCaptureRequestOptions() {
        clearCaptureRequestOptionsInternal();
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.interop.g
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControl.m1831b(this.f1551a, completer);
            }
        }));
    }

    public ListenableFuture<Void> setCaptureRequestOptions(CaptureRequestOptions captureRequestOptions) {
        clearCaptureRequestOptionsInternal();
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.interop.f
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControl.m1836g(this.f1550a, completer);
            }
        }));
    }
}
