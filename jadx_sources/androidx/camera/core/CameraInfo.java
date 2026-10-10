package androidx.camera.core;

import android.util.Range;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.internal.compat.MediaActionSoundCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraInfo {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String IMPLEMENTATION_TYPE_CAMERA2 = "androidx.camera.camera2";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String IMPLEMENTATION_TYPE_CAMERA2_LEGACY = "androidx.camera.camera2.legacy";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String IMPLEMENTATION_TYPE_FAKE = "androidx.camera.fake";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String IMPLEMENTATION_TYPE_UNKNOWN = "<unknown>";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final float INTRINSIC_ZOOM_RATIO_UNKNOWN = 1.0f;
    public static final int TORCH_STRENGTH_LEVEL_UNSUPPORTED = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ImplementationType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default CameraIdentifier getCameraIdentifier() {
        return null;
    }

    CameraSelector getCameraSelector();

    LiveData<CameraState> getCameraState();

    ExposureState getExposureState();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    String getImplementationType();

    default int getLensFacing() {
        return -1;
    }

    @IntRange(from = 0)
    default int getMaxTorchStrengthLevel() {
        return 0;
    }

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i11);

    default Set<Range<Integer>> getSupportedFrameRateRanges() {
        return Collections.EMPTY_SET;
    }

    LiveData<Integer> getTorchState();

    LiveData<ZoomState> getZoomState();

    boolean hasFlashUnit();

    @ExperimentalSessionConfig
    default boolean isFeatureGroupSupported(SessionConfig sessionConfig) {
        return false;
    }

    default boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        return false;
    }

    default boolean isLogicalMultiCameraSupported() {
        return false;
    }

    default boolean isLowLightBoostSupported() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isPrivateReprocessingSupported() {
        return false;
    }

    default boolean isTorchStrengthSupported() {
        return false;
    }

    @ExperimentalZeroShutterLag
    default boolean isZslSupported() {
        return false;
    }

    @FloatRange(from = 0.0d, fromInclusive = false)
    default float getIntrinsicZoomRatio() {
        return 1.0f;
    }

    default LiveData<Integer> getLowLightBoostState() {
        return new MutableLiveData(-1);
    }

    default Set<CameraInfo> getPhysicalCameraInfos() {
        return Collections.EMPTY_SET;
    }

    @ExperimentalSessionConfig
    default Set<Range<Integer>> getSupportedFrameRateRanges(SessionConfig sessionConfig) {
        return Collections.EMPTY_SET;
    }

    default LiveData<Integer> getTorchStrengthLevel() {
        return new MutableLiveData(0);
    }

    default Set<DynamicRange> querySupportedDynamicRanges(Set<DynamicRange> set) {
        return DynamicRanges.findAllPossibleMatches(set, Collections.singleton(DynamicRange.SDR));
    }

    static boolean mustPlayShutterSound() {
        return MediaActionSoundCompat.mustPlayShutterSound();
    }
}
