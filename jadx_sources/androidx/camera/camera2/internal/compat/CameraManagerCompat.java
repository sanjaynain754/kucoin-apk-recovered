package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraManagerCompat {

    @GuardedBy("mCameraCharacteristicsMap")
    private final Map<String, CameraCharacteristicsCompat> mCameraCharacteristicsMap = new ArrayMap(4);
    private final CameraManagerCompatImpl mImpl;

    public static final class AvailabilityCallbackExecutorWrapper extends CameraManager.AvailabilityCallback {
        private final Executor mExecutor;
        final CameraManager.AvailabilityCallback mWrappedCallback;
        private final Object mLock = new Object();

        @GuardedBy("mLock")
        private boolean mDisabled = false;

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        @RequiresApi(29)
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.mLock) {
                try {
                    if (!this.mDisabled) {
                        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.y
                            @Override // java.lang.Runnable
                            public final void run() {
                                ApiCompat.Api29Impl.onCameraAccessPrioritiesChanged(this.f1321b.mWrappedCallback);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.mLock) {
                try {
                    if (!this.mDisabled) {
                        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.x
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f1319b.mWrappedCallback.onCameraAvailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.mLock) {
                try {
                    if (!this.mDisabled) {
                        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.z
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f1322b.mWrappedCallback.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void setDisabled() {
            synchronized (this.mLock) {
                this.mDisabled = true;
            }
        }

        public AvailabilityCallbackExecutorWrapper(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = availabilityCallback;
        }
    }

    public interface CameraManagerCompatImpl {
        CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat;

        String[] getCameraIdList() throws CameraAccessExceptionCompat;

        CameraManager getCameraManager();

        Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat;

        @RequiresPermission("android.permission.CAMERA")
        void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;

        void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback);

        static CameraManagerCompatImpl from(Context context, Handler handler) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                return new CameraManagerCompatApi30Impl(context);
            }
            if (i11 >= 29) {
                return new CameraManagerCompatApi29Impl(context);
            }
            return i11 >= 28 ? CameraManagerCompatApi28Impl.create(context) : CameraManagerCompatBaseImpl.create(context, handler);
        }
    }

    public static CameraManagerCompat from(Context context) {
        return from(context, MainThreadAsyncHandler.getInstance());
    }

    public static CameraManagerCompat from(Context context, Handler handler) {
        return new CameraManagerCompat(CameraManagerCompatImpl.from(context, handler));
    }

    public CameraCharacteristicsCompat getCameraCharacteristicsCompat(String str) throws CameraAccessExceptionCompat {
        CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.mCameraCharacteristicsMap) {
            cameraCharacteristicsCompat = this.mCameraCharacteristicsMap.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    cameraCharacteristicsCompat = CameraCharacteristicsCompat.toCameraCharacteristicsCompat(this.mImpl.getCameraCharacteristics(str), str);
                    this.mCameraCharacteristicsMap.put(str, cameraCharacteristicsCompat);
                } catch (AssertionError e11) {
                    throw new CameraAccessExceptionCompat(10002, e11.getMessage(), e11);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }

    public String[] getCameraIdList() throws CameraAccessExceptionCompat {
        return this.mImpl.getCameraIdList();
    }

    public Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat {
        return this.mImpl.getConcurrentCameraIds();
    }

    @RequiresPermission("android.permission.CAMERA")
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        this.mImpl.openCamera(str, executor, stateCallback);
    }

    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.unregisterAvailabilityCallback(availabilityCallback);
    }

    public CameraManager unwrap() {
        return this.mImpl.getCameraManager();
    }

    private CameraManagerCompat(CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.mImpl = cameraManagerCompatImpl;
    }

    @VisibleForTesting
    public static CameraManagerCompat from(CameraManagerCompatImpl cameraManagerCompatImpl) {
        return new CameraManagerCompat(cameraManagerCompatImpl);
    }
}
