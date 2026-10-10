package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class CameraCharacteristicsCompat {
    private final CameraCharacteristicsCompatImpl mCameraCharacteristicsImpl;
    private final String mCameraId;

    @GuardedBy("this")
    private final Map<CameraCharacteristics.Key<?>, Object> mValuesCache = new HashMap();
    private StreamConfigurationMapCompat mStreamConfigurationMapCompat = null;

    public interface CameraCharacteristicsCompatImpl {
        <T> T get(CameraCharacteristics.Key<T> key);

        Set<String> getPhysicalCameraIds();

        CameraCharacteristics unwrap();
    }

    private boolean hasFlashUnit() {
        Boolean bool = (Boolean) get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }

    private boolean isKeyNonCacheable(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    @VisibleForTesting
    public static CameraCharacteristicsCompat toCameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics, String str) {
        return new CameraCharacteristicsCompat(cameraCharacteristics, str);
    }

    public String getCameraId() {
        return this.mCameraId;
    }

    public Set<String> getPhysicalCameraIds() {
        return this.mCameraCharacteristicsImpl.getPhysicalCameraIds();
    }

    public StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        if (this.mStreamConfigurationMapCompat == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.mStreamConfigurationMapCompat = StreamConfigurationMapCompat.toStreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(this.mCameraId));
            } catch (AssertionError | NullPointerException e11) {
                throw new IllegalArgumentException(e11.getMessage());
            }
        }
        return this.mStreamConfigurationMapCompat;
    }

    public boolean isZoomOverrideAvailable() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.mCameraCharacteristicsImpl.get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i11 : iArr) {
                if (i11 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public CameraCharacteristics toCameraCharacteristics() {
        return this.mCameraCharacteristicsImpl.unwrap();
    }

    private CameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsApi28Impl(cameraCharacteristics);
        } else {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsBaseImpl(cameraCharacteristics);
        }
        this.mCameraId = str;
    }

    public <T> T get(CameraCharacteristics.Key<T> key) {
        if (isKeyNonCacheable(key)) {
            return (T) this.mCameraCharacteristicsImpl.get(key);
        }
        synchronized (this) {
            try {
                T t11 = (T) this.mValuesCache.get(key);
                if (t11 != null) {
                    return t11;
                }
                T t12 = (T) this.mCameraCharacteristicsImpl.get(key);
                if (t12 != null) {
                    this.mValuesCache.put((CameraCharacteristics.Key<?>) key, t12);
                }
                return t12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getDefaultTorchStrengthLevel() {
        Integer num;
        if (hasFlashUnit() && Build.VERSION.SDK_INT >= 35) {
            num = (Integer) get(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        } else {
            num = null;
        }
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    @IntRange(from = 1)
    public int getMaxTorchStrengthLevel() {
        Integer num;
        if (hasFlashUnit() && Build.VERSION.SDK_INT >= 35) {
            num = (Integer) get(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        } else {
            num = null;
        }
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public boolean isTorchStrengthLevelSupported() {
        if (hasFlashUnit() && Build.VERSION.SDK_INT >= 35 && getMaxTorchStrengthLevel() > 1) {
            return true;
        }
        return false;
    }
}
