package androidx.camera.lifecycle;

import android.annotation.SuppressLint;
import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ExperimentalSessionConfig;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalSessionConfig.class})
@SuppressLint({"UsesNonDefaultVisibleForTesting"})
@VisibleForTesting(otherwise = 3)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class LifecycleCamera implements LifecycleObserver, Camera {
    private final CameraUseCaseAdapter mCameraUseCaseAdapter;

    @GuardedBy("mLock")
    private final LifecycleOwner mLifecycleOwner;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private volatile boolean mIsActive = false;

    @GuardedBy("mLock")
    private boolean mSuspended = false;

    @GuardedBy("mLock")
    private boolean mReleased = false;

    @GuardedBy("mLock")
    private SessionConfig mBoundSessionConfig = null;

    public boolean isBound(UseCase useCase) {
        boolean zContains;
        synchronized (this.mLock) {
            zContains = this.mCameraUseCaseAdapter.getUseCases().contains(useCase);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2099a(ResolvedFeatureGroup resolvedFeatureGroup, SessionConfig sessionConfig) {
        HashSet hashSet = new HashSet();
        if (resolvedFeatureGroup != null) {
            hashSet.addAll(resolvedFeatureGroup.getFeatures());
        }
        sessionConfig.getFeatureSelectionListener().accept(hashSet);
    }

    public void bind(final SessionConfig sessionConfig) throws CameraUseCaseAdapter.CameraException {
        synchronized (this.mLock) {
            try {
                if (this.mBoundSessionConfig == null) {
                    this.mBoundSessionConfig = sessionConfig;
                } else if (sessionConfig.getIsLegacy()) {
                    if (!this.mBoundSessionConfig.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.mBoundSessionConfig.getUseCases());
                    arrayList.addAll(sessionConfig.getUseCases());
                    this.mBoundSessionConfig = new LegacySessionConfig(arrayList, sessionConfig.getViewPort(), sessionConfig.getEffects());
                } else {
                    if (this.mBoundSessionConfig.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.mBoundSessionConfig = sessionConfig;
                    CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
                    cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
                }
                this.mCameraUseCaseAdapter.setViewPort(sessionConfig.getViewPort());
                this.mCameraUseCaseAdapter.setEffects(sessionConfig.getEffects());
                this.mCameraUseCaseAdapter.setSessionType(sessionConfig.getSessionType());
                this.mCameraUseCaseAdapter.setFrameRate(sessionConfig.getFrameRateRange());
                final ResolvedFeatureGroup resolvedFeatureGroupResolveFeatureGroup = ResolvedFeatureGroup.resolveFeatureGroup(sessionConfig, (CameraInfoInternal) getCameraInfo());
                sessionConfig.getFeatureSelectionListenerExecutor().execute(new Runnable() { // from class: androidx.camera.lifecycle.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        LifecycleCamera.m2099a(resolvedFeatureGroupResolveFeatureGroup, sessionConfig);
                    }
                });
                this.mCameraUseCaseAdapter.addUseCases(sessionConfig.getUseCases(), resolvedFeatureGroupResolveFeatureGroup);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SessionConfig getBoundSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mLock) {
            sessionConfig = this.mBoundSessionConfig;
        }
        return sessionConfig;
    }

    @Override // androidx.camera.core.Camera
    public CameraControl getCameraControl() {
        return this.mCameraUseCaseAdapter.getCameraControl();
    }

    @Override // androidx.camera.core.Camera
    public CameraInfo getCameraInfo() {
        return this.mCameraUseCaseAdapter.getCameraInfo();
    }

    public CameraUseCaseAdapter getCameraUseCaseAdapter() {
        return this.mCameraUseCaseAdapter;
    }

    @Override // androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        return this.mCameraUseCaseAdapter.getExtendedConfig();
    }

    public LifecycleOwner getLifecycleOwner() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.mLock) {
            lifecycleOwner = this.mLifecycleOwner;
        }
        return lifecycleOwner;
    }

    public CameraInfo getSecondaryCameraInfo() {
        return this.mCameraUseCaseAdapter.getSecondaryCameraInfo();
    }

    public List<UseCase> getUseCases() {
        List<UseCase> listUnmodifiableList;
        synchronized (this.mLock) {
            listUnmodifiableList = Collections.unmodifiableList(this.mCameraUseCaseAdapter.getUseCases());
        }
        return listUnmodifiableList;
    }

    public boolean isActive() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mIsActive;
        }
        return z11;
    }

    public boolean isLegacySessionConfigBound() {
        boolean isLegacy;
        synchronized (this.mLock) {
            SessionConfig sessionConfig = this.mBoundSessionConfig;
            isLegacy = sessionConfig == null ? false : sessionConfig.getIsLegacy();
        }
        return isLegacy;
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(boolean z11, UseCase... useCaseArr) {
        return this.mCameraUseCaseAdapter.isUseCasesCombinationSupported(z11, useCaseArr);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        this.mCameraUseCaseAdapter.setActiveResumingMode(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        this.mCameraUseCaseAdapter.setActiveResumingMode(true);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                if (!this.mSuspended && !this.mReleased) {
                    this.mCameraUseCaseAdapter.attachUseCases();
                    this.mIsActive = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                if (!this.mSuspended && !this.mReleased) {
                    this.mCameraUseCaseAdapter.detachUseCases();
                    this.mIsActive = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void release() {
        synchronized (this.mLock) {
            this.mReleased = true;
            this.mIsActive = false;
            this.mLifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    public void suspend() {
        synchronized (this.mLock) {
            try {
                if (this.mSuspended) {
                    return;
                }
                onStop(this.mLifecycleOwner);
                this.mSuspended = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unbind(SessionConfig sessionConfig) {
        synchronized (this.mLock) {
            try {
                SessionConfig sessionConfig2 = this.mBoundSessionConfig;
                if (sessionConfig2 != null && sessionConfig2.getIsLegacy() == sessionConfig.getIsLegacy()) {
                    LegacySessionConfig legacySessionConfig = null;
                    if (this.mBoundSessionConfig.getIsLegacy() || sessionConfig.getIsLegacy()) {
                        if (this.mBoundSessionConfig.getIsLegacy() && sessionConfig.getIsLegacy()) {
                            ArrayList arrayList = new ArrayList(this.mBoundSessionConfig.getUseCases());
                            arrayList.removeAll(sessionConfig.getUseCases());
                            if (!arrayList.isEmpty()) {
                                legacySessionConfig = new LegacySessionConfig(arrayList, this.mBoundSessionConfig.getViewPort(), this.mBoundSessionConfig.getEffects());
                            }
                            this.mBoundSessionConfig = legacySessionConfig;
                        }
                    } else if (this.mBoundSessionConfig != sessionConfig) {
                        return;
                    } else {
                        this.mBoundSessionConfig = null;
                    }
                    ArrayList arrayList2 = new ArrayList(sessionConfig.getUseCases());
                    arrayList2.retainAll(this.mCameraUseCaseAdapter.getUseCases());
                    this.mCameraUseCaseAdapter.removeUseCases(arrayList2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unbindAll() {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
            this.mBoundSessionConfig = null;
        }
    }

    public void unsuspend() {
        synchronized (this.mLock) {
            try {
                if (this.mSuspended) {
                    this.mSuspended = false;
                    if (this.mLifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                        onStart(this.mLifecycleOwner);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public LifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.mLifecycleOwner = lifecycleOwner;
        this.mCameraUseCaseAdapter = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public boolean isBound(SessionConfig sessionConfig) {
        boolean z11 = true;
        Preconditions.checkState(!sessionConfig.getIsLegacy());
        synchronized (this.mLock) {
            if (this.mBoundSessionConfig != sessionConfig) {
                z11 = false;
            }
        }
        return z11;
    }
}
