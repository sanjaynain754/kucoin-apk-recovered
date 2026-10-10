package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.annotation.GuardedBy;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.ExposureState;

/* JADX INFO: loaded from: classes23.dex */
class ExposureStateImpl implements ExposureState {
    private final CameraCharacteristicsCompat mCameraCharacteristics;

    @GuardedBy("mLock")
    private int mExposureCompensation;
    private final Object mLock = new Object();

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        int i11;
        synchronized (this.mLock) {
            i11 = this.mExposureCompensation;
        }
        return i11;
    }

    @Override // androidx.camera.core.ExposureState
    public Range<Integer> getExposureCompensationRange() {
        return (Range) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        Range range = (Range) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    public void setExposureCompensationIndex(int i11) {
        synchronized (this.mLock) {
            this.mExposureCompensation = i11;
        }
    }

    public ExposureStateImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i11) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mExposureCompensation = i11;
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        if (!isExposureCompensationSupported()) {
            return Rational.ZERO;
        }
        return (Rational) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }
}
