package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresPermission;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
class CameraManagerCompatBaseImpl implements CameraManagerCompat.CameraManagerCompatImpl {
    final CameraManager mCameraManager;
    final Object mObject;

    public static final class CameraManagerCompatParamsApi21 {
        final Handler mCompatHandler;

        @GuardedBy("mWrapperMap")
        final Map<CameraManager.AvailabilityCallback, CameraManagerCompat.AvailabilityCallbackExecutorWrapper> mWrapperMap = new HashMap();

        public CameraManagerCompatParamsApi21(Handler handler) {
            this.mCompatHandler = handler;
        }
    }

    public static CameraManagerCompatBaseImpl create(Context context, Handler handler) {
        return new CameraManagerCompatBaseImpl(context, new CameraManagerCompatParamsApi21(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return this.mCameraManager.getCameraCharacteristics(str);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e11);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public String[] getCameraIdList() throws CameraAccessExceptionCompat {
        try {
            return this.mCameraManager.getCameraIdList();
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e11);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraManager getCameraManager() {
        return this.mCameraManager;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.mObject;
        if (availabilityCallback != null) {
            synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                try {
                    availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.mWrapperMap.get(availabilityCallback);
                    if (availabilityCallbackExecutorWrapper == null) {
                        availabilityCallbackExecutorWrapper = new CameraManagerCompat.AvailabilityCallbackExecutorWrapper(executor, availabilityCallback);
                        cameraManagerCompatParamsApi21.mWrapperMap.put(availabilityCallback, availabilityCallbackExecutorWrapper);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            availabilityCallbackExecutorWrapper = null;
        }
        this.mCameraManager.registerAvailabilityCallback(availabilityCallbackExecutorWrapper, cameraManagerCompatParamsApi21.mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapperRemove;
        if (availabilityCallback != null) {
            CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.mObject;
            synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                availabilityCallbackExecutorWrapperRemove = cameraManagerCompatParamsApi21.mWrapperMap.remove(availabilityCallback);
            }
        } else {
            availabilityCallbackExecutorWrapperRemove = null;
        }
        if (availabilityCallbackExecutorWrapperRemove != null) {
            availabilityCallbackExecutorWrapperRemove.setDisabled();
        }
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallbackExecutorWrapperRemove);
    }

    public CameraManagerCompatBaseImpl(Context context, Object obj) {
        this.mCameraManager = (CameraManager) context.getSystemService("camera");
        this.mObject = obj;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @RequiresPermission("android.permission.CAMERA")
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(stateCallback);
        try {
            this.mCameraManager.openCamera(str, new CameraDeviceCompat.StateCallbackExecutorWrapper(executor, stateCallback), ((CameraManagerCompatParamsApi21) this.mObject).mCompatHandler);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e11);
        }
    }
}
