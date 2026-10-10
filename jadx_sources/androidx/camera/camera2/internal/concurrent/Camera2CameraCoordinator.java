package androidx.camera.camera2.internal.concurrent;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.camera.camera2.internal.CameraIdUtil;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class Camera2CameraCoordinator implements CameraCoordinator {
    private static final String TAG = "Camera2CameraCoordinator";
    private final CameraManagerCompat mCameraManager;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private Map<String, List<String>> mConcurrentCameraIdMap = new HashMap();

    @GuardedBy("mLock")
    private Set<Set<String>> mConcurrentCameraIds = new HashSet();

    @GuardedBy("mLock")
    private List<CameraInfo> mActiveConcurrentCameraInfos = new ArrayList();

    @GuardedBy("mLock")
    private int mCameraOperatingMode = 0;
    private final List<CameraCoordinator.ConcurrentCameraModeListener> mConcurrentCameraModeListeners = new ArrayList();

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    private static CameraSelector createCameraSelectorById(CameraManagerCompat cameraManagerCompat, final String str) {
        CameraSelector.Builder builderAddCameraFilter = new CameraSelector.Builder().addCameraFilter(new CameraFilter() { // from class: b0.a
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                return Camera2CameraCoordinator.m1820a(str, list);
            }
        });
        try {
            Integer num = (Integer) cameraManagerCompat.getCameraCharacteristicsCompat(str).get(CameraCharacteristics.LENS_FACING);
            if (num != null) {
                builderAddCameraFilter.requireLensFacing(num.intValue());
            }
            return builderAddCameraFilter.build();
        } catch (CameraAccessExceptionCompat e11) {
            throw new RuntimeException("Unable to get camera characteristics for " + str, e11);
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void addListener(CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        synchronized (this.mLock) {
            this.mConcurrentCameraModeListeners.add(concurrentCameraModeListener);
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public List<CameraInfo> getActiveConcurrentCameraInfos() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mActiveConcurrentCameraInfos);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public int getCameraOperatingMode() {
        int i11;
        synchronized (this.mLock) {
            i11 = this.mCameraOperatingMode;
        }
        return i11;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public List<List<CameraSelector>> getConcurrentCameraSelectors() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mLock) {
            try {
                for (Set<String> set : this.mConcurrentCameraIds) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(createCameraSelectorById(this.mCameraManager, it.next()));
                    }
                    arrayList.add(arrayList2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public String getPairedConcurrentCameraId(String str) {
        synchronized (this.mLock) {
            try {
                if (!this.mConcurrentCameraIdMap.containsKey(str)) {
                    return null;
                }
                List<String> list = this.mConcurrentCameraIdMap.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator<CameraInfo> it = this.mActiveConcurrentCameraInfos.iterator();
                    while (it.hasNext()) {
                        if (str2.equals(Camera2CameraInfo.from(it.next()).getCameraId())) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.InternalCameraPresenceListener
    public void onCamerasUpdated(List<String> list) throws CameraUpdateException {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set<String> set : this.mCameraManager.getConcurrentCameraIds()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (CameraIdUtil.isBackwardCompatible(this.mCameraManager, str) && CameraIdUtil.isBackwardCompatible(this.mCameraManager, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (InitializationException unused) {
                            Logger.m1866d(TAG, "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.mLock) {
                this.mConcurrentCameraIdMap = map;
                this.mConcurrentCameraIds = hashSet;
                Logger.m1866d(TAG, "Updated concurrent camera map: " + this.mConcurrentCameraIdMap);
            }
        } catch (CameraAccessExceptionCompat e11) {
            throw new CameraUpdateException("Failed to retrieve concurrent camera id info.", e11);
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void removeListener(CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        synchronized (this.mLock) {
            this.mConcurrentCameraModeListeners.remove(concurrentCameraModeListener);
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setActiveConcurrentCameraInfos(List<CameraInfo> list) {
        synchronized (this.mLock) {
            this.mActiveConcurrentCameraInfos = new ArrayList(list);
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setCameraOperatingMode(int i11) {
        synchronized (this.mLock) {
            try {
                int i12 = this.mCameraOperatingMode;
                if (i11 == i12) {
                    return;
                }
                this.mCameraOperatingMode = i11;
                ArrayList arrayList = new ArrayList(this.mConcurrentCameraModeListeners);
                if (i12 == 2 && i11 != 2) {
                    this.mActiveConcurrentCameraInfos.clear();
                }
                notifyCameraModeListener(arrayList, i12, i11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void shutdown() {
        synchronized (this.mLock) {
            this.mConcurrentCameraModeListeners.clear();
            this.mConcurrentCameraIdMap.clear();
            this.mActiveConcurrentCameraInfos.clear();
            this.mConcurrentCameraIds.clear();
            this.mCameraOperatingMode = 0;
        }
    }

    public Camera2CameraCoordinator(CameraManagerCompat cameraManagerCompat) {
        this.mCameraManager = cameraManagerCompat;
        try {
            onCamerasUpdated(Arrays.asList(cameraManagerCompat.getCameraIdList()));
        } catch (CameraAccessExceptionCompat | CameraUpdateException e11) {
            Logger.m1869e(TAG, "Failed to get concurrent camera ids", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m1820a(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            if (str.equals(Camera2CameraInfo.from(cameraInfo).getCameraId())) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalArgumentException("No camera can be find for id: " + str);
    }

    private void notifyCameraModeListener(List<CameraCoordinator.ConcurrentCameraModeListener> list, int i11, int i12) {
        Iterator<CameraCoordinator.ConcurrentCameraModeListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onCameraOperatingModeUpdated(i11, i12);
        }
    }
}
