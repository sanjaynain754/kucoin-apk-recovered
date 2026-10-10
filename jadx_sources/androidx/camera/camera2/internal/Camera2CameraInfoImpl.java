package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.FloatRange;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.OptIn;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.CameraQuirks;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraState;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExperimentalZeroShutterLag;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.RedirectableLiveData;
import androidx.camera.core.internal.StreamSpecsCalculator;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
public final class Camera2CameraInfoImpl implements CameraInfoInternal {
    private static final String TAG = "Camera2CameraInfo";

    @GuardedBy("mLock")
    private Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final Camera2CameraInfo mCamera2CameraInfo;
    private final EncoderProfilesProvider mCamera2EncoderProfilesProvider;

    @GuardedBy("mLock")
    private List<Pair<CameraCaptureCallback, Executor>> mCameraCaptureCallbacks;
    private final CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private final String mCameraId;
    private final CameraManagerCompat mCameraManager;
    private final Quirks mCameraQuirks;
    private final RedirectableLiveData<CameraState> mCameraStateLiveData;
    private final Object mLock;
    private Set<CameraInfo> mPhysicalCameraInfos;

    @GuardedBy("mLock")
    private RedirectableLiveData<Integer> mRedirectLowLightBoostStateLiveData;

    @GuardedBy("mLock")
    private RedirectableLiveData<Integer> mRedirectTorchStateLiveData;

    @GuardedBy("mLock")
    private RedirectableLiveData<Integer> mRedirectTorchStrengthLiveData;

    @GuardedBy("mLock")
    private RedirectableLiveData<ZoomState> mRedirectZoomStateLiveData;
    private final StreamSpecsCalculator mStreamSpecsCalculator;

    public Camera2CameraInfoImpl(String str, CameraManagerCompat cameraManagerCompat) throws CameraAccessExceptionCompat {
        this(str, cameraManagerCompat, StreamSpecsCalculator.NO_OP_STREAM_SPECS_CALCULATOR);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Object getPhysicalCameraCharacteristics(String str) {
        try {
            if (this.mCameraCharacteristicsCompat.getPhysicalCameraIds().contains(str)) {
                return this.mCameraManager.getCameraCharacteristicsCompat(str).toCameraCharacteristics();
            }
            return null;
        } catch (CameraAccessExceptionCompat e11) {
            Logger.m1869e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e11);
            return null;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i11) {
        return CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i11), getSensorOrientation(), 1 == getLensFacing());
    }

    public Camera2CameraInfoImpl(String str, CameraManagerCompat cameraManagerCompat, StreamSpecsCalculator streamSpecsCalculator) throws CameraAccessExceptionCompat {
        this.mLock = new Object();
        this.mRedirectTorchStateLiveData = null;
        this.mRedirectTorchStrengthLiveData = null;
        this.mRedirectLowLightBoostStateLiveData = null;
        this.mRedirectZoomStateLiveData = null;
        this.mCameraCaptureCallbacks = null;
        String str2 = (String) Preconditions.checkNotNull(str);
        this.mCameraId = str2;
        this.mCameraManager = cameraManagerCompat;
        CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str2);
        this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
        this.mCamera2CameraInfo = new Camera2CameraInfo(this);
        Quirks quirks = CameraQuirks.get(str, cameraCharacteristicsCompat);
        this.mCameraQuirks = quirks;
        this.mCamera2EncoderProfilesProvider = new Camera2EncoderProfilesProvider(str, quirks);
        this.mCameraStateLiveData = new RedirectableLiveData<>(CameraState.create(CameraState.Type.CLOSED));
        this.mStreamSpecsCalculator = streamSpecsCalculator;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl != null) {
                    camera2CameraControlImpl.addSessionCameraCaptureCallback(executor, cameraCaptureCallback);
                    return;
                }
                if (this.mCameraCaptureCallbacks == null) {
                    this.mCameraCaptureCallbacks = new ArrayList();
                }
                this.mCameraCaptureCallbacks.add(new Pair<>(cameraCaptureCallback, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<Integer> getAvailableCapabilities() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        return hashSet;
    }

    public Camera2CameraInfo getCamera2CameraInfo() {
        return this.mCamera2CameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Object getCameraCharacteristics() {
        return this.mCameraCharacteristicsCompat.toCameraCharacteristics();
    }

    public CameraCharacteristicsCompat getCameraCharacteristicsCompat() {
        return this.mCameraCharacteristicsCompat;
    }

    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.mCameraId, this.mCameraCharacteristicsCompat.toCameraCharacteristics());
        for (String str : this.mCameraCharacteristicsCompat.getPhysicalCameraIds()) {
            if (!Objects.equals(str, this.mCameraId)) {
                try {
                    linkedHashMap.put(str, this.mCameraManager.getCameraCharacteristicsCompat(str).toCameraCharacteristics());
                } catch (CameraAccessExceptionCompat e11) {
                    Logger.m1869e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e11);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public String getCameraId() {
        return this.mCameraId;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Quirks getCameraQuirks() {
        return this.mCameraQuirks;
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<CameraState> getCameraState() {
        return this.mCameraStateLiveData;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.mCamera2EncoderProfilesProvider;
    }

    @Override // androidx.camera.core.CameraInfo
    public ExposureState getExposureState() {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    return ExposureControl.getDefaultExposureState(this.mCameraCharacteristicsCompat);
                }
                return camera2CameraControlImpl.getExposureControl().getExposureState();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    @FloatRange(from = 0.0d, fromInclusive = false)
    public float getIntrinsicZoomRatio() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            return 1.0f;
        }
        try {
            return FovUtil.getDeviceDefaultViewAngleDegrees(this.mCameraManager, num.intValue()) / FovUtil.focalLengthToViewAngleDegrees(FovUtil.getDefaultFocalLength(this.mCameraCharacteristicsCompat), FovUtil.getSensorHorizontalLength(this.mCameraCharacteristicsCompat));
        } catch (Exception e11) {
            Logger.m1868e(TAG, "The camera is unable to provide necessary information to resolve its intrinsic zoom ratio with error: " + e11);
            return 1.0f;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING);
        Preconditions.checkArgument(num != null, "Unable to get the lens facing of the camera.");
        return LensFacingUtil.getCameraSelectorLensFacing(num.intValue());
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<Integer> getLowLightBoostState() {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    if (this.mRedirectLowLightBoostStateLiveData == null) {
                        this.mRedirectLowLightBoostStateLiveData = new RedirectableLiveData<>(-1);
                    }
                    return this.mRedirectLowLightBoostStateLiveData;
                }
                RedirectableLiveData<Integer> redirectableLiveData = this.mRedirectLowLightBoostStateLiveData;
                if (redirectableLiveData != null) {
                    return redirectableLiveData;
                }
                return camera2CameraControlImpl.getLowLightBoostControl().getLowLightBoostState();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public Set<CameraInfo> getPhysicalCameraInfos() {
        if (this.mPhysicalCameraInfos == null) {
            this.mPhysicalCameraInfos = new HashSet();
            for (String str : this.mCameraCharacteristicsCompat.getPhysicalCameraIds()) {
                try {
                    this.mPhysicalCameraInfos.add(new Camera2PhysicalCameraInfoImpl(str, this.mCameraManager));
                } catch (CameraAccessExceptionCompat e11) {
                    Logger.m1869e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e11);
                    return Collections.EMPTY_SET;
                }
            }
        }
        return this.mPhysicalCameraInfos;
    }

    public int getSensorOrientation() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Preconditions.checkNotNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Rect getSensorRect() {
        Rect rect = (Rect) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY, 3000) : (Rect) Preconditions.checkNotNull(rect);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return DynamicRangesCompat.fromCameraCharacteristics(this.mCameraCharacteristicsCompat).getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.CameraInfo
    public Set<Range<Integer>> getSupportedFrameRateRanges() {
        Range[] rangeArr = (Range[]) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new HashSet(Arrays.asList(rangeArr)) : Collections.EMPTY_SET;
    }

    public int getSupportedHardwareLevel() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Preconditions.checkNotNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public List<Size> getSupportedHighResolutions(int i11) {
        Size[] highResolutionOutputSizes = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getHighResolutionOutputSizes(i11);
        return highResolutionOutputSizes != null ? Arrays.asList(highResolutionOutputSizes) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<Range<Integer>> getSupportedHighSpeedFrameRateRanges() {
        Range<Integer>[] highSpeedVideoFpsRanges = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getHighSpeedVideoFpsRanges();
        return highSpeedVideoFpsRanges != null ? new HashSet(Arrays.asList(highSpeedVideoFpsRanges)) : Collections.EMPTY_SET;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<Range<Integer>> getSupportedHighSpeedFrameRateRangesFor(Size size) {
        Range<Integer>[] highSpeedVideoFpsRangesFor;
        try {
            highSpeedVideoFpsRangesFor = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getHighSpeedVideoFpsRangesFor(size);
        } catch (IllegalArgumentException e11) {
            Logger.m1873w(TAG, "Can't get high speed frame rate ranges for " + size, e11);
            highSpeedVideoFpsRangesFor = null;
        }
        return highSpeedVideoFpsRangesFor != null ? new HashSet(Arrays.asList(highSpeedVideoFpsRangesFor)) : Collections.EMPTY_SET;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public List<Size> getSupportedHighSpeedResolutions() {
        Size[] highSpeedVideoSizes = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getHighSpeedVideoSizes();
        return highSpeedVideoSizes != null ? Arrays.asList(highSpeedVideoSizes) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public List<Size> getSupportedHighSpeedResolutionsFor(Range<Integer> range) {
        Size[] highSpeedVideoSizesFor;
        try {
            highSpeedVideoSizesFor = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getHighSpeedVideoSizesFor(range);
        } catch (IllegalArgumentException e11) {
            Logger.m1873w(TAG, "Can't get high speed resolutions for " + range, e11);
            highSpeedVideoSizesFor = null;
        }
        return highSpeedVideoSizesFor != null ? Arrays.asList(highSpeedVideoSizesFor) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<Integer> getSupportedOutputFormats() {
        int[] outputFormats = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputFormats();
        if (outputFormats == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i11 : outputFormats) {
            hashSet.add(Integer.valueOf(i11));
        }
        return hashSet;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public List<Size> getSupportedResolutions(int i11) {
        Size[] outputSizes = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(i11);
        return outputSizes != null ? Arrays.asList(outputSizes) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Timebase getTimebase() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        Preconditions.checkNotNull(num);
        return num.intValue() != 1 ? Timebase.UPTIME : Timebase.REALTIME;
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<Integer> getTorchState() {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    if (this.mRedirectTorchStateLiveData == null) {
                        this.mRedirectTorchStateLiveData = new RedirectableLiveData<>(0);
                    }
                    return this.mRedirectTorchStateLiveData;
                }
                RedirectableLiveData<Integer> redirectableLiveData = this.mRedirectTorchStateLiveData;
                if (redirectableLiveData != null) {
                    return redirectableLiveData;
                }
                return camera2CameraControlImpl.getTorchControl().getTorchState();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<Integer> getTorchStrengthLevel() {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    if (this.mRedirectTorchStrengthLiveData == null) {
                        this.mRedirectTorchStrengthLiveData = new RedirectableLiveData<>(Integer.valueOf(isTorchStrengthSupported() ? this.mCameraCharacteristicsCompat.getDefaultTorchStrengthLevel() : 0));
                    }
                    return this.mRedirectTorchStrengthLiveData;
                }
                RedirectableLiveData<Integer> redirectableLiveData = this.mRedirectTorchStrengthLiveData;
                if (redirectableLiveData != null) {
                    return redirectableLiveData;
                }
                return camera2CameraControlImpl.getTorchControl().getTorchStrengthLevel();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<ZoomState> getZoomState() {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    if (this.mRedirectZoomStateLiveData == null) {
                        this.mRedirectZoomStateLiveData = new RedirectableLiveData<>(ZoomControl.getDefaultZoomState(this.mCameraCharacteristicsCompat));
                    }
                    return this.mRedirectZoomStateLiveData;
                }
                RedirectableLiveData<ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
                if (redirectableLiveData != null) {
                    return redirectableLiveData;
                }
                return camera2CameraControlImpl.getZoomControl().getZoomState();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        CameraCharacteristicsCompat cameraCharacteristicsCompat = this.mCameraCharacteristicsCompat;
        Objects.requireNonNull(cameraCharacteristicsCompat);
        return FlashAvailabilityChecker.isFlashAvailable(new C0879v0(cameraCharacteristicsCompat));
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    return false;
                }
                return camera2CameraControlImpl.getFocusMeteringControl().isFocusMeteringSupported(focusMeteringAction);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isHighSpeedSupported() {
        return ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 9);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLogicalMultiCameraSupported() {
        return ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 11);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLowLightBoostSupported() {
        return LowLightBoostControl.checkLowLightBoostAvailability(this.mCameraCharacteristicsCompat);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isPreviewStabilizationSupported() {
        return VideoStabilizationUtil.isPreviewStabilizationSupported(this.mCameraCharacteristicsCompat);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        return ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 4);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isTorchStrengthSupported() {
        return this.mCameraCharacteristicsCompat.isTorchStrengthLevelSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isUseCaseCombinationSupported(List<UseCase> list, int i11, boolean z11, CameraConfig cameraConfig) {
        try {
            StreamSpecsCalculator.INSTANCE.calculateSuggestedStreamSpecsCompat(this.mStreamSpecsCalculator, i11, this, list, cameraConfig, z11);
            return true;
        } catch (IllegalArgumentException e11) {
            Logger.m1867d(TAG, "isUseCaseCombinationSupported: calculateSuggestedStreamSpecs failed", e11);
            return false;
        }
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isVideoStabilizationSupported() {
        int[] iArr = (int[]) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void linkWithCameraControl(Camera2CameraControlImpl camera2CameraControlImpl) {
        synchronized (this.mLock) {
            try {
                this.mCamera2CameraControlImpl = camera2CameraControlImpl;
                RedirectableLiveData<ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
                if (redirectableLiveData != null) {
                    redirectableLiveData.redirectTo(camera2CameraControlImpl.getZoomControl().getZoomState());
                }
                RedirectableLiveData<Integer> redirectableLiveData2 = this.mRedirectTorchStateLiveData;
                if (redirectableLiveData2 != null) {
                    redirectableLiveData2.redirectTo(this.mCamera2CameraControlImpl.getTorchControl().getTorchState());
                }
                RedirectableLiveData<Integer> redirectableLiveData3 = this.mRedirectTorchStrengthLiveData;
                if (redirectableLiveData3 != null) {
                    redirectableLiveData3.redirectTo(this.mCamera2CameraControlImpl.getTorchControl().getTorchStrengthLevel());
                }
                RedirectableLiveData<Integer> redirectableLiveData4 = this.mRedirectLowLightBoostStateLiveData;
                if (redirectableLiveData4 != null) {
                    redirectableLiveData4.redirectTo(this.mCamera2CameraControlImpl.getLowLightBoostControl().getLowLightBoostState());
                }
                List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
                if (list != null) {
                    for (Pair<CameraCaptureCallback, Executor> pair : list) {
                        this.mCamera2CameraControlImpl.addSessionCameraCaptureCallback((Executor) pair.second, (CameraCaptureCallback) pair.first);
                    }
                    this.mCameraCaptureCallbacks = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        logDeviceInfo();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl != null) {
                    camera2CameraControlImpl.removeSessionCameraCaptureCallback(cameraCaptureCallback);
                    return;
                }
                List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
                if (list == null) {
                    return;
                }
                Iterator<Pair<CameraCaptureCallback, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == cameraCaptureCallback) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setCameraStateSource(LiveData<CameraState> liveData) {
        this.mCameraStateLiveData.redirectTo(liveData);
    }

    private void logDeviceInfo() {
        logDeviceLevel();
    }

    private void logDeviceLevel() {
        String str;
        int supportedHardwareLevel = getSupportedHardwareLevel();
        if (supportedHardwareLevel != 0) {
            if (supportedHardwareLevel != 1) {
                if (supportedHardwareLevel != 2) {
                    if (supportedHardwareLevel != 3) {
                        if (supportedHardwareLevel != 4) {
                            str = "Unknown value: " + supportedHardwareLevel;
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        Logger.m1870i(TAG, "Device Level: " + str);
    }

    @Override // androidx.camera.core.CameraInfo
    public String getImplementationType() {
        if (getSupportedHardwareLevel() == 2) {
            return CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY;
        }
        return CameraInfo.IMPLEMENTATION_TYPE_CAMERA2;
    }

    @Override // androidx.camera.core.CameraInfo
    @IntRange(from = 0)
    public int getMaxTorchStrengthLevel() {
        if (isTorchStrengthSupported()) {
            return this.mCameraCharacteristicsCompat.getMaxTorchStrengthLevel();
        }
        return 0;
    }

    @Override // androidx.camera.core.CameraInfo
    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    @SuppressLint({"NullAnnotationGroup"})
    public boolean isZslSupported() {
        if (isPrivateReprocessingSupported() && DeviceQuirks.get(ZslDisablerQuirk.class) == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public Set<DynamicRange> querySupportedDynamicRanges(Set<DynamicRange> set) {
        return DynamicRanges.findAllPossibleMatches(set, getSupportedDynamicRanges());
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
