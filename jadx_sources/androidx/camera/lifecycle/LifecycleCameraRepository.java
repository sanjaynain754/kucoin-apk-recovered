package androidx.camera.lifecycle;

import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.ExperimentalSessionConfig;
import androidx.camera.core.Logger;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalSessionConfig.class})
final class LifecycleCameraRepository {
    private static final Object INSTANCE_LOCK = new Object();
    private static final String TAG = "LifecycleCameraRepository";

    @GuardedBy("INSTANCE_LOCK")
    private static LifecycleCameraRepository sInstance;

    @GuardedBy("mLock")
    CameraCoordinator mCameraCoordinator;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private final Map<Key, LifecycleCamera> mCameraMap = new HashMap();

    @GuardedBy("mLock")
    private final Map<LifecycleCameraRepositoryObserver, Set<Key>> mLifecycleObserverMap = new HashMap();

    @GuardedBy("mLock")
    private final ArrayDeque<LifecycleOwner> mActiveLifecycleOwners = new ArrayDeque<>();

    @Retention(RetentionPolicy.SOURCE)
    public @interface FromUseCaseAdapter {
    }

    @AutoValue
    public static abstract class Key {
        public abstract CameraIdentifier getCameraIdentifier();

        public abstract int getLifecycleOwnerHash();

        public static Key create(LifecycleOwner lifecycleOwner, CameraIdentifier cameraIdentifier) {
            return new AutoValue_LifecycleCameraRepository_Key(System.identityHashCode(lifecycleOwner), cameraIdentifier);
        }
    }

    public static class LifecycleCameraRepositoryObserver implements LifecycleObserver {
        private final LifecycleCameraRepository mLifecycleCameraRepository;
        private final LifecycleOwner mLifecycleOwner;

        public LifecycleOwner getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.unregisterLifecycle(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setActive(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setInactive(lifecycleOwner);
        }

        public LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.mLifecycleOwner = lifecycleOwner;
            this.mLifecycleCameraRepository = lifecycleCameraRepository;
        }
    }

    public void unbind(SessionConfig sessionConfig) {
        unbind(sessionConfig, null);
    }

    public void unbindAll() {
        unbindAll(null);
    }

    public static LifecycleCameraRepository getInstance() {
        LifecycleCameraRepository lifecycleCameraRepository;
        synchronized (INSTANCE_LOCK) {
            try {
                if (sInstance == null) {
                    sInstance = new LifecycleCameraRepository();
                }
                lifecycleCameraRepository = sInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lifecycleCameraRepository;
    }

    private LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                    if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.getLifecycleOwner())) {
                        return lifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean hasUseCaseBound(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                if (lifecycleCameraRepositoryObserver == null) {
                    return false;
                }
                Iterator<Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
                while (it.hasNext()) {
                    if (!((LifecycleCamera) Preconditions.checkNotNull(this.mCameraMap.get(it.next()))).getUseCases().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void registerCamera(LifecycleCamera lifecycleCamera) {
        synchronized (this.mLock) {
            try {
                LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
                Key keyCreate = Key.create(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getAdapterIdentifier());
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                Set<Key> hashSet = lifecycleCameraRepositoryObserver != null ? this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver) : new HashSet<>();
                hashSet.add(keyCreate);
                this.mCameraMap.put(keyCreate, lifecycleCamera);
                if (lifecycleCameraRepositoryObserver == null) {
                    LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver2 = new LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                    this.mLifecycleObserverMap.put(lifecycleCameraRepositoryObserver2, hashSet);
                    lifecycleOwner.getLifecycle().addObserver(lifecycleCameraRepositoryObserver2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void suspendUseCases(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                if (lifecycleCameraRepositoryObserver == null) {
                    return;
                }
                Iterator<Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
                while (it.hasNext()) {
                    ((LifecycleCamera) Preconditions.checkNotNull(this.mCameraMap.get(it.next()))).suspend();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void unregisterCamera(LifecycleCamera lifecycleCamera) {
        synchronized (this.mLock) {
            try {
                LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
                Key keyCreate = Key.create(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getAdapterIdentifier());
                this.mCameraMap.remove(keyCreate);
                HashSet hashSet = new HashSet();
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                    if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.getLifecycleOwner())) {
                        Set<Key> set = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
                        set.remove(keyCreate);
                        if (set.isEmpty()) {
                            hashSet.add(lifecycleCameraRepositoryObserver.getLifecycleOwner());
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    unregisterLifecycle((LifecycleOwner) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void unsuspendUseCases(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                Iterator<Key> it = this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                    if (!((LifecycleCamera) Preconditions.checkNotNull(lifecycleCamera)).getUseCases().isEmpty()) {
                        lifecycleCamera.unsuspend();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void bindToLifecycleCamera(LifecycleCamera lifecycleCamera, SessionConfig sessionConfig, CameraCoordinator cameraCoordinator) {
        synchronized (this.mLock) {
            try {
                Preconditions.checkArgument(!sessionConfig.getUseCases().isEmpty());
                this.mCameraCoordinator = cameraCoordinator;
                LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                if (lifecycleCameraRepositoryObserver == null) {
                    return;
                }
                Set<Key> set = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
                CameraCoordinator cameraCoordinator2 = this.mCameraCoordinator;
                if (cameraCoordinator2 == null || cameraCoordinator2.getCameraOperatingMode() != 2) {
                    Iterator<Key> it = set.iterator();
                    while (it.hasNext()) {
                        LifecycleCamera lifecycleCamera2 = (LifecycleCamera) Preconditions.checkNotNull(this.mCameraMap.get(it.next()));
                        if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.getUseCases().isEmpty()) {
                            if (lifecycleCamera2.isLegacySessionConfigBound() || sessionConfig.getIsLegacy()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            lifecycleCamera2.unbindAll();
                        }
                    }
                }
                try {
                    lifecycleCamera.bind(sessionConfig);
                    if (lifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                        setActive(lifecycleOwner);
                    }
                } catch (CameraUseCaseAdapter.CameraException e11) {
                    throw new IllegalArgumentException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clear() {
        synchronized (this.mLock) {
            try {
                Iterator it = new HashSet(this.mLifecycleObserverMap.keySet()).iterator();
                while (it.hasNext()) {
                    unregisterLifecycle(((LifecycleCameraRepositoryObserver) it.next()).getLifecycleOwner());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public LifecycleCamera createLifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.mLock) {
            try {
                Preconditions.checkArgument(this.mCameraMap.get(Key.create(lifecycleOwner, cameraUseCaseAdapter.getAdapterIdentifier())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                LifecycleCamera lifecycleCamera = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                    lifecycleCamera.suspend();
                }
                if (lifecycleOwner.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
                    return lifecycleCamera;
                }
                registerCamera(lifecycleCamera);
                return lifecycleCamera;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public LifecycleCamera getLifecycleCamera(LifecycleOwner lifecycleOwner, CameraIdentifier cameraIdentifier) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            lifecycleCamera = this.mCameraMap.get(Key.create(lifecycleOwner, cameraIdentifier));
        }
        return lifecycleCamera;
    }

    public Collection<LifecycleCamera> getLifecycleCameras() {
        Collection<LifecycleCamera> collectionUnmodifiableCollection;
        synchronized (this.mLock) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.mCameraMap.values());
        }
        return collectionUnmodifiableCollection;
    }

    public void removeLifecycleCameras(Set<Key> set) {
        synchronized (this.mLock) {
            if (set == null) {
                try {
                    set = this.mCameraMap.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (Key key : set) {
                if (this.mCameraMap.containsKey(key)) {
                    unregisterCamera(this.mCameraMap.get(key));
                }
            }
        }
    }

    public void setActive(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                if (hasUseCaseBound(lifecycleOwner)) {
                    if (this.mActiveLifecycleOwners.isEmpty()) {
                        this.mActiveLifecycleOwners.push(lifecycleOwner);
                    } else {
                        CameraCoordinator cameraCoordinator = this.mCameraCoordinator;
                        if (cameraCoordinator == null || cameraCoordinator.getCameraOperatingMode() != 2) {
                            LifecycleOwner lifecycleOwnerPeek = this.mActiveLifecycleOwners.peek();
                            if (!lifecycleOwner.equals(lifecycleOwnerPeek)) {
                                suspendUseCases(lifecycleOwnerPeek);
                                this.mActiveLifecycleOwners.remove(lifecycleOwner);
                                this.mActiveLifecycleOwners.push(lifecycleOwner);
                            }
                        }
                    }
                    unsuspendUseCases(lifecycleOwner);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setInactive(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                this.mActiveLifecycleOwners.remove(lifecycleOwner);
                suspendUseCases(lifecycleOwner);
                if (!this.mActiveLifecycleOwners.isEmpty()) {
                    unsuspendUseCases(this.mActiveLifecycleOwners.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unbind(SessionConfig sessionConfig, Set<Key> set) {
        synchronized (this.mLock) {
            if (set == null) {
                try {
                    set = this.mCameraMap.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (Key key : set) {
                if (this.mCameraMap.containsKey(key)) {
                    LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                    boolean zIsEmpty = lifecycleCamera.getUseCases().isEmpty();
                    lifecycleCamera.unbind(sessionConfig);
                    if (!zIsEmpty && lifecycleCamera.getUseCases().isEmpty()) {
                        setInactive(lifecycleCamera.getLifecycleOwner());
                    }
                } else {
                    Logger.m1872w(TAG, "Attempt to unbind use cases from an invalid camera.");
                }
            }
        }
    }

    public void unbindAll(Set<Key> set) {
        synchronized (this.mLock) {
            if (set == null) {
                try {
                    set = this.mCameraMap.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator<Key> it = set.iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                if (lifecycleCamera != null) {
                    lifecycleCamera.unbindAll();
                    setInactive(lifecycleCamera.getLifecycleOwner());
                }
            }
        }
    }

    public void unregisterLifecycle(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                if (lifecycleCameraRepositoryObserver == null) {
                    return;
                }
                setInactive(lifecycleOwner);
                Iterator<Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
                while (it.hasNext()) {
                    this.mCameraMap.remove(it.next());
                }
                this.mLifecycleObserverMap.remove(lifecycleCameraRepositoryObserver);
                lifecycleCameraRepositoryObserver.getLifecycleOwner().getLifecycle().removeObserver(lifecycleCameraRepositoryObserver);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public LifecycleCameraRepository() {
    }
}
