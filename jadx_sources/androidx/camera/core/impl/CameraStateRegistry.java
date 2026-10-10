package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import androidx.camera.core.Camera;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import com.sensorsdata.abtest.entity.AppConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraStateRegistry implements CameraCoordinator.ConcurrentCameraModeListener {
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_CONCURRENT_MODE = 2;
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_SINGLE_MODE = 1;
    private static final String TAG = "CameraStateRegistry";

    @GuardedBy("mLock")
    private int mAvailableCameras;

    @GuardedBy("mLock")
    private final CameraCoordinator mCameraCoordinator;

    @GuardedBy("mLock")
    private final Map<Camera, CameraRegistration> mCameraStates;
    private final StringBuilder mDebugString = new StringBuilder();
    private final Object mLock;
    private int mMaxAllowedOpenedCameras;

    public static class CameraRegistration {
        private final Executor mNotifyExecutor;
        private final OnConfigureAvailableListener mOnConfigureAvailableListener;
        private final OnOpenAvailableListener mOnOpenAvailableListener;
        private CameraInternal.State mState;

        public CameraInternal.State getState() {
            return this.mState;
        }

        public void notifyOnConfigureAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                final OnConfigureAvailableListener onConfigureAvailableListener = this.mOnConfigureAvailableListener;
                Objects.requireNonNull(onConfigureAvailableListener);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        onConfigureAvailableListener.onConfigureAvailable();
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.m1869e(CameraStateRegistry.TAG, "Unable to notify camera to configure.", e11);
            }
        }

        public void notifyOnOpenAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                final OnOpenAvailableListener onOpenAvailableListener = this.mOnOpenAvailableListener;
                Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        onOpenAvailableListener.onOpenAvailable();
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.m1869e(CameraStateRegistry.TAG, "Unable to notify camera to open.", e11);
            }
        }

        public CameraInternal.State setState(CameraInternal.State state) {
            CameraInternal.State state2 = this.mState;
            this.mState = state;
            return state2;
        }

        public CameraRegistration(CameraInternal.State state, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
            this.mState = state;
            this.mNotifyExecutor = executor;
            this.mOnConfigureAvailableListener = onConfigureAvailableListener;
            this.mOnOpenAvailableListener = onOpenAvailableListener;
        }
    }

    public interface OnConfigureAvailableListener {
        void onConfigureAvailable();
    }

    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    public void markCameraState(Camera camera, CameraInternal.State state) {
        markCameraState(camera, state, true);
    }

    @GuardedBy("mLock")
    private CameraRegistration getCameraRegistration(String str) {
        for (Camera camera : this.mCameraStates.keySet()) {
            if (str.equals(((CameraInfoInternal) camera.getCameraInfo()).getCameraId())) {
                return this.mCameraStates.get(camera);
            }
        }
        return null;
    }

    private static boolean isOpen(CameraInternal.State state) {
        return state != null && state.holdsCameraSlot();
    }

    @GuardedBy("mLock")
    @WorkerThread
    private void recalculateAvailableCameras() {
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.setLength(0);
            this.mDebugString.append("Recalculating open cameras:\n");
            this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.mDebugString.append("-------------------------------------------------------------------\n");
        }
        int i11 = 0;
        for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
            if (Logger.isDebugEnabled(TAG)) {
                this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().getState() != null ? entry.getValue().getState().toString() : "UNKNOWN"));
            }
            if (isOpen(entry.getValue().getState())) {
                i11++;
            }
        }
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.append("-------------------------------------------------------------------\n");
            this.mDebugString.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i11), Integer.valueOf(this.mMaxAllowedOpenedCameras)));
            Logger.m1866d(TAG, this.mDebugString.toString());
        }
        this.mAvailableCameras = Math.max(this.mMaxAllowedOpenedCameras - i11, 0);
    }

    @GuardedBy("mLock")
    private CameraInternal.State unregisterCamera(Camera camera) {
        CameraRegistration cameraRegistrationRemove = this.mCameraStates.remove(camera);
        if (cameraRegistrationRemove == null) {
            return null;
        }
        recalculateAvailableCameras();
        return cameraRegistrationRemove.getState();
    }

    @GuardedBy("mLock")
    private CameraInternal.State updateAndVerifyState(Camera camera, CameraInternal.State state) {
        CameraInternal.State state2 = ((CameraRegistration) Preconditions.checkNotNull(this.mCameraStates.get(camera), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).setState(state);
        CameraInternal.State state3 = CameraInternal.State.OPENING;
        if (state == state3) {
            Preconditions.checkState(isOpen(state) || state2 == state3, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (state2 != state) {
            traceState(camera, state);
            recalculateAvailableCameras();
        }
        return state2;
    }

    public boolean isCameraClosing() {
        synchronized (this.mLock) {
            try {
                Iterator<Map.Entry<Camera, CameraRegistration>> it = this.mCameraStates.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().getState() == CameraInternal.State.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    public void markCameraState(Camera camera, CameraInternal.State state, boolean z11) {
        CameraRegistration cameraRegistration;
        synchronized (this.mLock) {
            try {
                int i11 = this.mAvailableCameras;
                if ((state == CameraInternal.State.RELEASED ? unregisterCamera(camera) : updateAndVerifyState(camera, state)) == state) {
                    return;
                }
                HashMap map = null;
                if (this.mCameraCoordinator.getCameraOperatingMode() == 2 && state == CameraInternal.State.CONFIGURED) {
                    String pairedConcurrentCameraId = this.mCameraCoordinator.getPairedConcurrentCameraId(((CameraInfoInternal) camera.getCameraInfo()).getCameraId());
                    if (pairedConcurrentCameraId != null) {
                        cameraRegistration = getCameraRegistration(pairedConcurrentCameraId);
                    } else {
                        cameraRegistration = null;
                    }
                } else {
                    cameraRegistration = null;
                }
                if (i11 < 1 && this.mAvailableCameras > 0) {
                    map = new HashMap();
                    for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
                        if (entry.getValue().getState() == CameraInternal.State.PENDING_OPEN) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (state == CameraInternal.State.PENDING_OPEN && this.mAvailableCameras > 0) {
                    map = new HashMap();
                    map.put(camera, this.mCameraStates.get(camera));
                }
                if (map != null && !z11) {
                    map.remove(camera);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((CameraRegistration) it.next()).notifyOnOpenAvailableListener();
                    }
                }
                if (cameraRegistration != null) {
                    cameraRegistration.notifyOnConfigureAvailableListener();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public void onCameraOperatingModeUpdated(int i11, int i12) {
        synchronized (this.mLock) {
            boolean z11 = true;
            this.mMaxAllowedOpenedCameras = i12 == 2 ? 2 : 1;
            boolean z12 = i11 != 2 && i12 == 2;
            if (i11 != 2 || i12 == 2) {
                z11 = false;
            }
            if (z12 || z11) {
                recalculateAvailableCameras();
            }
        }
    }

    public void registerCamera(Camera camera, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.mLock) {
            Preconditions.checkState(!this.mCameraStates.containsKey(camera), "Camera is already registered: " + camera);
            this.mCameraStates.put(camera, new CameraRegistration(null, executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    public boolean tryOpenCamera(Camera camera) {
        boolean z11;
        synchronized (this.mLock) {
            try {
                CameraRegistration cameraRegistration = (CameraRegistration) Preconditions.checkNotNull(this.mCameraStates.get(camera), "Camera must first be registered with registerCamera()");
                z11 = false;
                if (Logger.isDebugEnabled(TAG)) {
                    this.mDebugString.setLength(0);
                    this.mDebugString.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", camera, Integer.valueOf(this.mAvailableCameras), Boolean.valueOf(isOpen(cameraRegistration.getState())), cameraRegistration.getState()));
                }
                if (this.mAvailableCameras > 0 || isOpen(cameraRegistration.getState())) {
                    CameraInternal.State state = CameraInternal.State.OPENING;
                    cameraRegistration.setState(state);
                    traceState(camera, state);
                    z11 = true;
                }
                if (Logger.isDebugEnabled(TAG)) {
                    this.mDebugString.append(String.format(Locale.US, " --> %s", z11 ? AppConstants.AB_TEST_SUCCESS : "FAIL"));
                    Logger.m1866d(TAG, this.mDebugString.toString());
                }
                if (z11) {
                    recalculateAvailableCameras();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public boolean tryOpenCaptureSession(String str, String str2) {
        synchronized (this.mLock) {
            try {
                boolean z11 = true;
                if (this.mCameraCoordinator.getCameraOperatingMode() != 2) {
                    return true;
                }
                CameraRegistration cameraRegistration = getCameraRegistration(str);
                CameraInternal.State state = cameraRegistration != null ? cameraRegistration.getState() : null;
                CameraRegistration cameraRegistration2 = str2 != null ? getCameraRegistration(str2) : null;
                CameraInternal.State state2 = cameraRegistration2 != null ? cameraRegistration2.getState() : null;
                CameraInternal.State state3 = CameraInternal.State.OPEN;
                boolean z12 = state3.equals(state) || CameraInternal.State.CONFIGURED.equals(state);
                boolean z13 = state3.equals(state2) || CameraInternal.State.CONFIGURED.equals(state2);
                if (!z12 || !z13) {
                    z11 = false;
                }
                return z11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public CameraStateRegistry(CameraCoordinator cameraCoordinator, int i11) {
        Object obj = new Object();
        this.mLock = obj;
        this.mCameraStates = new HashMap();
        this.mMaxAllowedOpenedCameras = i11;
        synchronized (obj) {
            this.mCameraCoordinator = cameraCoordinator;
            this.mAvailableCameras = this.mMaxAllowedOpenedCameras;
        }
    }

    private static void traceState(Camera camera, CameraInternal.State state) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:State[" + camera + "]", state.ordinal());
        }
    }
}
