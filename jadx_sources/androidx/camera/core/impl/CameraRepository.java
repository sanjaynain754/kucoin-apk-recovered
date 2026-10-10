package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class CameraRepository implements InternalCameraPresenceListener {
    private static final String TAG = "CameraRepository";
    private CameraFactory mCameraFactory;

    @GuardedBy("mCamerasLock")
    private CallbackToFutureAdapter.Completer<Void> mDeinitCompleter;

    @GuardedBy("mCamerasLock")
    private ListenableFuture<Void> mDeinitFuture;
    private final Object mCamerasLock = new Object();

    @GuardedBy("mCamerasLock")
    private final Map<String, CameraInternal> mCameras = new LinkedHashMap();

    @GuardedBy("mCamerasLock")
    private final Set<CameraInternal> mReleasingCameras = new HashSet();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1949a(CameraRepository cameraRepository, CameraInternal cameraInternal) {
        synchronized (cameraRepository.mCamerasLock) {
            try {
                cameraRepository.mReleasingCameras.remove(cameraInternal);
                if (cameraRepository.mReleasingCameras.isEmpty()) {
                    Preconditions.checkNotNull(cameraRepository.mDeinitCompleter);
                    cameraRepository.mDeinitCompleter.set(null);
                    cameraRepository.mDeinitCompleter = null;
                    cameraRepository.mDeinitFuture = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1950b(CameraRepository cameraRepository, CallbackToFutureAdapter.Completer completer) {
        synchronized (cameraRepository.mCamerasLock) {
            cameraRepository.mDeinitCompleter = completer;
        }
        return "CameraRepository-deinit";
    }

    public ListenableFuture<Void> deinit() {
        synchronized (this.mCamerasLock) {
            try {
                if (this.mCameras.isEmpty()) {
                    ListenableFuture<Void> listenableFutureImmediateFuture = this.mDeinitFuture;
                    if (listenableFutureImmediateFuture == null) {
                        listenableFutureImmediateFuture = Futures.immediateFuture(null);
                    }
                    return listenableFutureImmediateFuture;
                }
                ListenableFuture<Void> future = this.mDeinitFuture;
                if (future == null) {
                    future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.p
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return CameraRepository.m1950b(this.f1686a, completer);
                        }
                    });
                    this.mDeinitFuture = future;
                }
                this.mReleasingCameras.addAll(this.mCameras.values());
                for (final CameraInternal cameraInternal : this.mCameras.values()) {
                    cameraInternal.release().addListener(new Runnable() { // from class: androidx.camera.core.impl.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraRepository.m1949a(this.f1687b, cameraInternal);
                        }
                    }, CameraXExecutors.directExecutor());
                }
                this.mCameras.clear();
                return future;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public CameraInternal getCamera(String str) {
        CameraInternal cameraInternal;
        synchronized (this.mCamerasLock) {
            try {
                cameraInternal = this.mCameras.get(str);
                if (cameraInternal == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cameraInternal;
    }

    public Set<String> getCameraIds() {
        LinkedHashSet linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet(this.mCameras.keySet());
        }
        return linkedHashSet;
    }

    public LinkedHashSet<CameraInternal> getCameras() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet<>(this.mCameras.values());
        }
        return linkedHashSet;
    }

    public void init(CameraFactory cameraFactory) throws InitializationException {
        this.mCameraFactory = cameraFactory;
        synchronized (this.mCamerasLock) {
            try {
                for (String str : cameraFactory.getAvailableCameraIds()) {
                    Logger.m1866d(TAG, "Added camera: " + str);
                    CameraInternal cameraInternalPut = this.mCameras.put(str, cameraFactory.getCamera(str));
                    if (cameraInternalPut != null) {
                        cameraInternalPut.release();
                    }
                }
            } catch (CameraUnavailableException e11) {
                throw new InitializationException(e11);
            }
        }
    }

    @Override // androidx.camera.core.impl.InternalCameraPresenceListener
    public void onCamerasUpdated(List<String> list) throws CameraUpdateException {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.mCamerasLock) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.mCameras.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.mCameraFactory.getCamera(str));
            }
            synchronized (this.mCamerasLock) {
                try {
                    HashSet hashSet2 = new HashSet(this.mCameras.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<CameraInternal> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.mCameras.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : list) {
                        if (this.mCameras.containsKey(str2)) {
                            linkedHashMap.put(str2, this.mCameras.get(str2));
                        } else {
                            linkedHashMap.put(str2, (CameraInternal) map.get(str2));
                        }
                    }
                    this.mCameras.clear();
                    this.mCameras.putAll(linkedHashMap);
                    for (CameraInternal cameraInternal : arrayList) {
                        if (cameraInternal != null) {
                            cameraInternal.onRemoved();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (CameraUnavailableException e11) {
            throw new CameraUpdateException("Failed to create CameraInternal", e11);
        }
    }
}
