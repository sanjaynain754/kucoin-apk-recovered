package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExperimentalSessionConfig;
import androidx.camera.core.Logger;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraMode;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.SurfaceStreamSpecQueryResult;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p852kotlin.UnsafeLazyImpl;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
public final class SupportedSurfaceCombination {
    private static final int FRAME_RATE_UNLIMITED = Integer.MAX_VALUE;
    private static final String TAG = "SupportedSurfaceCombination";
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final String mCameraId;
    private final CameraCharacteristicsCompat mCharacteristics;
    private final DisplayInfoManager mDisplayInfoManager;
    private final DynamicRangeResolver mDynamicRangeResolver;
    private final ExtraSupportedSurfaceCombinationsContainer mExtraSupportedSurfaceCombinationsContainer;
    private final FeatureCombinationQuery mFeatureCombinationQuery;
    private final int mHardwareLevel;
    private final HighSpeedResolver mHighSpeedResolver;
    private boolean mIsBurstCaptureSupported;
    private final boolean mIsConcurrentCameraModeSupported;
    private boolean mIsManualSensorSupported;
    private final boolean mIsPreviewStabilizationSupported;
    private boolean mIsRawSupported;
    private final boolean mIsStreamUseCaseSupported;
    private boolean mIsUltraHighResolutionSensorSupported;

    @VisibleForTesting
    SurfaceSizeDefinition mSurfaceSizeDefinition;
    private final List<SurfaceCombination> mSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mUltraHighSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mConcurrentSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mPreviewStabilizationSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mHighSpeedSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mFcqSurfaceCombinations = new ArrayList();
    private final Map<FeatureSettings, List<SurfaceCombination>> mFeatureSettingsToSupportedCombinationsMap = new HashMap();
    private final List<SurfaceCombination> mSurfaceCombinations10Bit = new ArrayList();
    private final List<SurfaceCombination> mSurfaceCombinationsUltraHdr = new ArrayList();
    private final List<SurfaceCombination> mSurfaceCombinationsStreamUseCase = new ArrayList();
    List<Integer> mSurfaceSizeDefinitionFormats = new ArrayList();
    private final TargetAspectRatio mTargetAspectRatio = new TargetAspectRatio();
    private final ResolutionCorrector mResolutionCorrector = new ResolutionCorrector();

    @AutoValue
    public static abstract class BestSizesAndMaxFpsForConfigs {
        public abstract List<Size> getBestSizes();

        public abstract List<Size> getBestSizesForStreamUseCase();

        public abstract int getMaxFpsForAllSizes();

        public abstract int getMaxFpsForBestSizes();

        public abstract int getMaxFpsForStreamUseCase();

        /* JADX INFO: renamed from: of */
        public static BestSizesAndMaxFpsForConfigs m1756of(List<Size> list, List<Size> list2, int i11, int i12, int i13) {
            return new C0693xf44dce2(list, list2, i11, i12, i13);
        }
    }

    public enum CheckingMethod {
        WITHOUT_FEATURE_COMBO,
        WITH_FEATURE_COMBO,
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
    }

    @AutoValue
    public static abstract class FeatureSettings {
        public abstract int getCameraMode();

        public abstract int getRequiredMaxBitDepth();

        public abstract Range<Integer> getTargetFpsRange();

        public abstract boolean hasVideoCapture();

        public abstract boolean isFeatureComboInvocation();

        public abstract boolean isHighSpeedOn();

        public abstract boolean isPreviewStabilizationOn();

        public abstract boolean isStrictFpsRequired();

        public abstract boolean isUltraHdrOn();

        public abstract boolean requiresFeatureComboQuery();

        /* JADX INFO: renamed from: of */
        public static FeatureSettings m1757of(int i11, boolean z11, int i12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Range<Integer> range, boolean z17) {
            return new AutoValue_SupportedSurfaceCombination_FeatureSettings(i11, z11, i12, z12, z13, z14, z15, z16, range, z17);
        }
    }

    private int getMaxFrameRate(int i11, Size size, boolean z11) {
        Preconditions.checkState(!z11 || i11 == 34);
        return z11 ? this.mHighSpeedResolver.getMaxFrameRate(size) : getMaxFrameRate(this.mCharacteristics, i11, size);
    }

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Size[] getHighResolutionOutputSizes(StreamConfigurationMap streamConfigurationMap, int i11) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i11);
        }
    }

    private void generate10BitSupportedCombinationList() {
        this.mSurfaceCombinations10Bit.addAll(GuaranteedConfigurationsUtil.get10BitSupportedCombinationList());
    }

    private void generateConcurrentSupportedCombinationList() {
        this.mConcurrentSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList());
    }

    private void generateFcqSurfaceCombinations() {
        this.mFcqSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateQueryableFcqCombinations());
    }

    private void generateHighSpeedSupportedCombinationList() {
        if (this.mHighSpeedResolver.isHighSpeedSupported()) {
            this.mHighSpeedSurfaceCombinations.clear();
            Size maxSize = this.mHighSpeedResolver.getMaxSize();
            if (maxSize != null) {
                this.mHighSpeedSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateHighSpeedSupportedCombinationList(maxSize, getUpdatedSurfaceSizeDefinitionByFormat(34)));
            }
        }
    }

    private void generatePreviewStabilizationSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mPreviewStabilizationSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getPreviewStabilizationSupportedCombinationList());
        }
    }

    private void generateStreamUseCaseSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mSurfaceCombinationsStreamUseCase.addAll(GuaranteedConfigurationsUtil.getStreamUseCaseSupportedCombinationList());
        }
    }

    private void generateSupportedCombinationList() {
        this.mSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateSupportedCombinationList(this.mHardwareLevel, this.mIsRawSupported, this.mIsBurstCaptureSupported));
        this.mSurfaceCombinations.addAll(this.mExtraSupportedSurfaceCombinationsContainer.get(this.mCameraId));
    }

    private void generateSurfaceSizeDefinition() {
        this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(SizeUtil.RESOLUTION_VGA, new HashMap(), this.mDisplayInfoManager.getPreviewSize(), new HashMap(), getRecordSize(), new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    private void generateUltraHdrSupportedCombinationList() {
        this.mSurfaceCombinationsUltraHdr.addAll(GuaranteedConfigurationsUtil.getUltraHdrSupportedCombinationList());
    }

    private void generateUltraHighSupportedCombinationList() {
        this.mUltraHighSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList());
    }

    private boolean getAndValidateIsStrictFpsRequired(boolean z11, Boolean bool) {
        if (bool == null || bool.booleanValue() == z11) {
            return z11;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    private CheckingMethod getCheckingMethod(Collection<DynamicRange> collection, Range<Integer> range, boolean z11, boolean z12, boolean z13) {
        int i11;
        if (!z13) {
            return CheckingMethod.WITHOUT_FEATURE_COMBO;
        }
        ?? Contains = collection.contains(DynamicRange.HLG_10_BIT);
        if (range != null && ((Integer) range.getUpper()).intValue() == 60) {
            i11 = Contains;
            i11 = Contains;
            i11 = Contains + 1;
        }
        if (z11) {
            i11++;
        }
        if (z12) {
            i11++;
        }
        if (i11 > 1) {
            return CheckingMethod.WITH_FEATURE_COMBO;
        }
        return i11 == 1 ? CheckingMethod.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : CheckingMethod.WITHOUT_FEATURE_COMBO;
    }

    private Range<Integer> getClosestSupportedDeviceFrameRate(Range<Integer> range, int i11, Range<Integer>[] rangeArr) {
        Range<Integer> rangeCompareIntersectingRanges = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (rangeCompareIntersectingRanges.equals(range) || rangeArr == null) {
            return rangeCompareIntersectingRanges;
        }
        Range<T> range2 = new Range<>(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i11)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i11)));
        int rangeLength = 0;
        for (Range<Integer> range3 : rangeArr) {
            Objects.requireNonNull(range3);
            if (i11 >= ((Integer) range3.getLower()).intValue()) {
                if (rangeCompareIntersectingRanges.equals(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                    rangeCompareIntersectingRanges = range3;
                }
                if (range3.equals(range2)) {
                    return range3;
                }
                try {
                    int rangeLength2 = getRangeLength(range3.intersect(range2));
                    if (rangeLength == 0) {
                        rangeLength = rangeLength2;
                    } else {
                        if (rangeLength2 >= rangeLength) {
                            rangeCompareIntersectingRanges = compareIntersectingRanges(range2, rangeCompareIntersectingRanges, range3);
                            rangeLength = getRangeLength(range2.intersect(rangeCompareIntersectingRanges));
                        }
                        range3 = rangeCompareIntersectingRanges;
                    }
                } catch (IllegalArgumentException unused) {
                    if (rangeLength != 0 || (getRangeDistance(range3, range2) >= getRangeDistance(rangeCompareIntersectingRanges, range2) && (getRangeDistance(range3, range2) != getRangeDistance(rangeCompareIntersectingRanges, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeCompareIntersectingRanges.getUpper()).intValue() && getRangeLength(range3) >= getRangeLength(rangeCompareIntersectingRanges))))) {
                    }
                }
                rangeCompareIntersectingRanges = range3;
            }
        }
        return rangeCompareIntersectingRanges;
    }

    private static Size[] getOutputSizes(StreamConfigurationMap streamConfigurationMap, int i11, Rational rational) {
        Size[] outputSizes;
        try {
            outputSizes = i11 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i11);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        if (rational == null) {
            return outputSizes;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                arrayList.add(size);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    private Size getRecordSize() {
        try {
            Size recordSizeFromCamcorderProfile = getRecordSizeFromCamcorderProfile(Integer.parseInt(this.mCameraId));
            if (recordSizeFromCamcorderProfile != null) {
                return recordSizeFromCamcorderProfile;
            }
        } catch (NumberFormatException unused) {
        }
        Size recordSizeFromStreamConfigurationMap = getRecordSizeFromStreamConfigurationMap();
        return recordSizeFromStreamConfigurationMap != null ? recordSizeFromStreamConfigurationMap : SizeUtil.RESOLUTION_480P;
    }

    private Size getRecordSizeFromCamcorderProfile(int i11) {
        CamcorderProfile camcorderProfile;
        int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = iArr[i12];
            if (this.mCamcorderProfileHelper.hasProfile(i11, i13) && (camcorderProfile = this.mCamcorderProfileHelper.get(i11, i13)) != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
        }
        return null;
    }

    private Size getRecordSizeFromStreamConfigurationMap() {
        Size[] outputSizes;
        try {
            outputSizes = this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap().getOutputSizes(MediaRecorder.class);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null) {
            return null;
        }
        Arrays.sort(outputSizes, new CompareSizesByArea(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = SizeUtil.RESOLUTION_1080P;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return null;
    }

    private List<SurfaceCombination> getSurfaceCombinationsByFeatureSettings(FeatureSettings featureSettings) {
        if (this.mFeatureSettingsToSupportedCombinationsMap.containsKey(featureSettings)) {
            return this.mFeatureSettingsToSupportedCombinationsMap.get(featureSettings);
        }
        List<SurfaceCombination> arrayList = new ArrayList<>();
        if (featureSettings.requiresFeatureComboQuery()) {
            if (this.mFcqSurfaceCombinations.isEmpty()) {
                generateFcqSurfaceCombinations();
            }
            arrayList.addAll(this.mFcqSurfaceCombinations);
        } else if (featureSettings.isUltraHdrOn()) {
            if (this.mSurfaceCombinationsUltraHdr.isEmpty()) {
                generateUltraHdrSupportedCombinationList();
            }
            if (featureSettings.getCameraMode() == 0) {
                arrayList.addAll(this.mSurfaceCombinationsUltraHdr);
            }
        } else if (featureSettings.isHighSpeedOn()) {
            if (this.mHighSpeedSurfaceCombinations.isEmpty()) {
                generateHighSpeedSupportedCombinationList();
            }
            arrayList.addAll(this.mHighSpeedSurfaceCombinations);
        } else if (featureSettings.getRequiredMaxBitDepth() == 8) {
            int cameraMode = featureSettings.getCameraMode();
            if (cameraMode == 1) {
                arrayList = this.mConcurrentSurfaceCombinations;
            } else if (cameraMode != 2) {
                arrayList.addAll(featureSettings.isPreviewStabilizationOn() ? this.mPreviewStabilizationSurfaceCombinations : this.mSurfaceCombinations);
            } else {
                arrayList.addAll(this.mUltraHighSurfaceCombinations);
                arrayList.addAll(this.mSurfaceCombinations);
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 10 && featureSettings.getCameraMode() == 0) {
            arrayList.addAll(this.mSurfaceCombinations10Bit);
        }
        this.mFeatureSettingsToSupportedCombinationsMap.put(featureSettings, arrayList);
        return arrayList;
    }

    private Pair<List<SurfaceConfig>, Integer> getSurfaceConfigListAndFpsCeiling(FeatureSettings featureSettings, List<AttachedSurfaceInfo> list, List<Size> list2, List<UseCaseConfig<?>> list3, List<Integer> list4, int i11, Map<Integer, AttachedSurfaceInfo> map, Map<Integer, UseCaseConfig<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            arrayList.add(attachedSurfaceInfo.getSurfaceConfig());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), attachedSurfaceInfo);
            }
        }
        for (int i12 = 0; i12 < list2.size(); i12++) {
            Size size = list2.get(i12);
            UseCaseConfig<?> useCaseConfig = list3.get(list4.get(i12).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat), featureSettings.getCameraMode(), featureSettings.requiresFeatureComboQuery() ? SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE : SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, useCaseConfig.getStreamUseCase()));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), useCaseConfig);
            }
            i11 = getUpdatedMaximumFps(i11, useCaseConfig.getInputFormat(), size, featureSettings.isHighSpeedOn());
        }
        return new Pair<>(arrayList, Integer.valueOf(i11));
    }

    private Range<Integer> getTargetFpsRange(List<AttachedSurfaceInfo> list, List<UseCaseConfig<?>> list2, List<Integer> list3, boolean z11) {
        Range<Integer> updatedTargetFrameRate = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            updatedTargetFrameRate = getUpdatedTargetFrameRate(it.next().getTargetFrameRate(), updatedTargetFrameRate, z11);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            Range<Integer> targetFrameRate = list2.get(it2.next().intValue()).getTargetFrameRate(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
            Objects.requireNonNull(targetFrameRate);
            updatedTargetFrameRate = getUpdatedTargetFrameRate(targetFrameRate, updatedTargetFrameRate, z11);
        }
        return updatedTargetFrameRate;
    }

    private Range<Integer> getUpdatedTargetFrameRate(Range<Integer> range, Range<Integer> range2, boolean z11) {
        Range<Integer> range3 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (!range3.equals(range)) {
            if (z11) {
                Preconditions.checkState(range == range2, "All targetFrameRate should be the same if strict fps is required");
                return range;
            }
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private static List<Integer> getUseCasesPriorityOrder(List<UseCaseConfig<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<UseCaseConfig<?>> it = list.iterator();
        while (it.hasNext()) {
            int surfaceOccupancyPriority = it.next().getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            for (UseCaseConfig<?> useCaseConfig : list) {
                if (iIntValue == useCaseConfig.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(useCaseConfig)));
                }
            }
        }
        return arrayList;
    }

    private static boolean isConfigFrameRateAcceptable(int i11, Range<Integer> range, int i12) {
        return StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(range) || i12 >= i11 || i12 >= ((Integer) range.getUpper()).intValue();
    }

    private boolean isUseCasesCombinationSupported(FeatureSettings featureSettings, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSurfaceConfig());
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        for (UseCaseConfig<?> useCaseConfig : map.keySet()) {
            List<Size> list2 = map.get(useCaseConfig);
            Preconditions.checkArgument((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + useCaseConfig + C33978va.f72339h);
            Size size = (Size) Collections.min(list2, compareSizesByArea);
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat), featureSettings.getCameraMode(), SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, useCaseConfig.getStreamUseCase()));
        }
        Map<SurfaceConfig, DynamicRange> map2 = Collections.EMPTY_MAP;
        List<UseCaseConfig<?>> list3 = Collections.EMPTY_LIST;
        return checkSupported(featureSettings, arrayList, map2, list3, list3);
    }

    private void refreshPreviewSize() {
        this.mDisplayInfoManager.refresh();
        if (this.mSurfaceSizeDefinition == null) {
            generateSurfaceSizeDefinition();
        } else {
            this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(this.mSurfaceSizeDefinition.getAnalysisSize(), this.mSurfaceSizeDefinition.getS720pSizeMap(), this.mDisplayInfoManager.getPreviewSize(), this.mSurfaceSizeDefinition.getS1440pSizeMap(), this.mSurfaceSizeDefinition.getRecordSize(), this.mSurfaceSizeDefinition.getMaximumSizeMap(), this.mSurfaceSizeDefinition.getMaximum4x3SizeMap(), this.mSurfaceSizeDefinition.getMaximum16x9SizeMap(), this.mSurfaceSizeDefinition.getUltraMaximumSizeMap());
        }
    }

    @OptIn(markerClass = {ExperimentalSessionConfig.class})
    private SurfaceStreamSpecQueryResult resolveSpecsByCheckingMethod(CheckingMethod checkingMethod, FeatureSettings featureSettings, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, List<UseCaseConfig<?>> list2, List<Integer> list3, Map<UseCaseConfig<?>, DynamicRange> map2, boolean z11) {
        Logger.m1866d(TAG, "resolveSpecsByCheckingMethod: checkingMethod = " + checkingMethod);
        int iOrdinal = checkingMethod.ordinal();
        if (iOrdinal == 1) {
            return resolveSpecsBySettings(createFeatureSettings(featureSettings.getCameraMode(), featureSettings.hasVideoCapture(), map2, featureSettings.isPreviewStabilizationOn(), featureSettings.isUltraHdrOn(), featureSettings.isHighSpeedOn(), featureSettings.isFeatureComboInvocation(), true, featureSettings.getTargetFpsRange(), featureSettings.isStrictFpsRequired()), list, map, list2, list3, map2, z11);
        }
        if (iOrdinal != 2) {
            return resolveSpecsBySettings(featureSettings, list, map, list2, list3, map2, z11);
        }
        try {
            return resolveSpecsBySettings(featureSettings, list, map, list2, list3, map2, z11);
        } catch (IllegalArgumentException e11) {
            Logger.m1867d(TAG, "Failed to find a supported combination without feature combo, trying again with feature combo", e11);
            return resolveSpecsBySettings(createFeatureSettings(featureSettings.getCameraMode(), featureSettings.hasVideoCapture(), map2, featureSettings.isPreviewStabilizationOn(), featureSettings.isUltraHdrOn(), featureSettings.isHighSpeedOn(), featureSettings.isFeatureComboInvocation(), true, featureSettings.getTargetFpsRange(), featureSettings.isStrictFpsRequired()), list, map, list2, list3, map2, z11);
        }
    }

    private SurfaceStreamSpecQueryResult resolveSpecsBySettings(FeatureSettings featureSettings, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, List<UseCaseConfig<?>> list2, List<Integer> list3, Map<UseCaseConfig<?>, DynamicRange> map2, boolean z11) {
        HashMap map3;
        HashMap map4;
        int i11;
        List<AttachedSurfaceInfo> list4 = list;
        List<UseCaseConfig<?>> list5 = list2;
        Logger.m1866d(TAG, "resolveSpecsBySettings: featureSettings = " + featureSettings);
        if (!featureSettings.requiresFeatureComboQuery() && !isUseCasesCombinationSupported(featureSettings, list, map)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + list4 + ". New configs: " + list5 + ". GroupableFeature settings: " + featureSettings);
        }
        Map<UseCaseConfig<?>, List<Size>> mapFilterSupportedSizes = filterSupportedSizes(map, featureSettings, z11);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list3.iterator();
        while (it.hasNext()) {
            UseCaseConfig<?> useCaseConfig = list5.get(it.next().intValue());
            List<Size> list6 = mapFilterSupportedSizes.get(useCaseConfig);
            if (list6 == null) {
                list6 = Collections.EMPTY_LIST;
            }
            arrayList.add(applyResolutionSelectionOrderRelatedWorkarounds(list6, useCaseConfig.getInputFormat()));
        }
        List<List<Size>> sizeArrangements = featureSettings.isHighSpeedOn() ? this.mHighSpeedResolver.getSizeArrangements(arrayList) : getAllPossibleSizeArrangements(arrayList);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        boolean zContainsZslUseCase = StreamUseCaseUtil.containsZslUseCase(list4, list5);
        int maxSupportedFpsFromAttachedSurfaces = getMaxSupportedFpsFromAttachedSurfaces(list4, featureSettings.isHighSpeedOn());
        List<SurfaceConfig> orderedSupportedStreamUseCaseSurfaceConfigList = null;
        if (!this.mIsStreamUseCaseSupported || zContainsZslUseCase) {
            map3 = map7;
            map4 = map8;
            i11 = maxSupportedFpsFromAttachedSurfaces;
        } else {
            Iterator<List<Size>> it2 = sizeArrangements.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    map3 = map7;
                    map4 = map8;
                    i11 = maxSupportedFpsFromAttachedSurfaces;
                    break;
                }
                Pair<List<SurfaceConfig>, Integer> surfaceConfigListAndFpsCeiling = getSurfaceConfigListAndFpsCeiling(featureSettings, list4, it2.next(), list5, list3, maxSupportedFpsFromAttachedSurfaces, map7, map8);
                map3 = map7;
                map4 = map8;
                i11 = maxSupportedFpsFromAttachedSurfaces;
                orderedSupportedStreamUseCaseSurfaceConfigList = getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettings, (List) surfaceConfigListAndFpsCeiling.first, map3, map4);
                if (orderedSupportedStreamUseCaseSurfaceConfigList != null) {
                    break;
                }
                map3.clear();
                map4.clear();
                list5 = list2;
                map7 = map3;
                maxSupportedFpsFromAttachedSurfaces = i11;
                list4 = list;
                map8 = map4;
            }
            Logger.m1866d(TAG, "orderedSurfaceConfigListForStreamUseCase = " + orderedSupportedStreamUseCaseSurfaceConfigList);
        }
        List<SurfaceConfig> list7 = orderedSupportedStreamUseCaseSurfaceConfigList;
        HashMap map9 = map3;
        HashMap map10 = map4;
        BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigsFindBestSizesAndFps = findBestSizesAndFps(featureSettings, list, list2, list3, sizeArrangements, list7, map2, i11, z11);
        Logger.m1866d(TAG, "resolveSpecsBySettings: bestSizesAndFps = " + bestSizesAndMaxFpsForConfigsFindBestSizesAndFps);
        List<Size> bestSizes = bestSizesAndMaxFpsForConfigsFindBestSizesAndFps.getBestSizes();
        int maxFpsForBestSizes = bestSizesAndMaxFpsForConfigsFindBestSizesAndFps.getMaxFpsForBestSizes();
        List<Size> bestSizesForStreamUseCase = bestSizesAndMaxFpsForConfigsFindBestSizesAndFps.getBestSizesForStreamUseCase();
        int maxFpsForStreamUseCase = bestSizesAndMaxFpsForConfigsFindBestSizesAndFps.getMaxFpsForStreamUseCase();
        int maxFpsForAllSizes = bestSizesAndMaxFpsForConfigsFindBestSizesAndFps.getMaxFpsForAllSizes();
        if (bestSizes == null) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + " and Hardware level: " + this.mHardwareLevel + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        Range<Integer> closestSupportedDeviceFrameRate = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (closestSupportedDeviceFrameRate.equals(featureSettings.getTargetFpsRange())) {
            maxFpsForAllSizes = maxFpsForAllSizes;
            if (featureSettings.isHighSpeedOn()) {
                closestSupportedDeviceFrameRate = getClosestSupportedDeviceFrameRate(HighSpeedResolver.DEFAULT_FPS, maxFpsForBestSizes, this.mHighSpeedResolver.getFrameRateRangesFor(bestSizes));
            }
        } else {
            Range<Integer>[] frameRateRangesFor = featureSettings.isHighSpeedOn() ? this.mHighSpeedResolver.getFrameRateRangesFor(bestSizes) : (Range[]) this.mCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range<Integer> closestSupportedDeviceFrameRate2 = getClosestSupportedDeviceFrameRate(featureSettings.getTargetFpsRange(), maxFpsForBestSizes, frameRateRangesFor);
            if (featureSettings.isFeatureComboInvocation() || featureSettings.isStrictFpsRequired()) {
                Preconditions.checkArgument(closestSupportedDeviceFrameRate2.equals(featureSettings.getTargetFpsRange()), "Target FPS range " + featureSettings.getTargetFpsRange() + " is not supported. Max FPS supported by the calculated best combination: " + maxFpsForBestSizes + ". Calculated best FPS range for device: " + closestSupportedDeviceFrameRate2 + ". Device supported FPS ranges: " + Arrays.toString(frameRateRangesFor));
            }
            closestSupportedDeviceFrameRate = closestSupportedDeviceFrameRate2;
        }
        Iterator<UseCaseConfig<?>> it3 = list2.iterator();
        while (it3.hasNext()) {
            UseCaseConfig<?> next = it3.next();
            Iterator<UseCaseConfig<?>> it4 = it3;
            StreamSpec.Builder zslDisabled = StreamSpec.builder(bestSizes.get(list3.indexOf(Integer.valueOf(list2.indexOf(next))))).setSessionType(featureSettings.isHighSpeedOn() ? 1 : 0).setDynamicRange((DynamicRange) Preconditions.checkNotNull(map2.get(next))).setImplementationOptions(StreamUseCaseUtil.getStreamSpecImplementationOptions(next)).setZslDisabled(featureSettings.hasVideoCapture());
            if (!StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(closestSupportedDeviceFrameRate)) {
                zslDisabled.setExpectedFrameRateRange(closestSupportedDeviceFrameRate);
            }
            map6.put(next, zslDisabled.build());
            it3 = it4;
        }
        if (list7 != null && maxFpsForBestSizes == maxFpsForStreamUseCase && bestSizes.size() == bestSizesForStreamUseCase.size()) {
            for (int i12 = 0; i12 < bestSizes.size(); i12++) {
                if (bestSizes.get(i12).equals(bestSizesForStreamUseCase.get(i12))) {
                }
            }
            if (!StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithInteropOverride(this.mCharacteristics, list, map6, map5)) {
                StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(map6, map5, map9, map10, list7);
            }
        }
        return new SurfaceStreamSpecQueryResult(map6, map5, maxFpsForAllSizes);
    }

    private void updateMaximumSizeByFormat(Map<Integer, Size> map, int i11, Rational rational) {
        Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i11, true, rational);
        if (maxOutputSizeByFormat != null) {
            map.put(Integer.valueOf(i11), maxOutputSizeByFormat);
        }
    }

    private void updateS720pOrS1440pSizeByFormat(Map<Integer, Size> map, Size size, int i11) {
        if (this.mIsConcurrentCameraModeSupported) {
            Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i11, false, null);
            Integer numValueOf = Integer.valueOf(i11);
            if (maxOutputSizeByFormat != null) {
                size = (Size) Collections.min(Arrays.asList(size, maxOutputSizeByFormat), new CompareSizesByArea());
            }
            map.put(numValueOf, size);
        }
    }

    private void updateUltraMaximumSizeByFormat(Map<Integer, Size> map, int i11) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.mIsUltraHighResolutionSensorSupported || (streamConfigurationMap = (StreamConfigurationMap) this.mCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i11), getMaxOutputSizeByFormat(streamConfigurationMap, i11, true, null));
    }

    @VisibleForTesting
    public List<Size> applyResolutionSelectionOrderRelatedWorkarounds(List<Size> list, int i11) {
        Rational rational;
        int i12 = this.mTargetAspectRatio.get(this.mCameraId, this.mCharacteristics);
        if (i12 == 0) {
            rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        } else if (i12 != 1) {
            rational = null;
            if (i12 == 2) {
                Size maximumSize = getUpdatedSurfaceSizeDefinitionByFormat(256).getMaximumSize(256);
                if (maximumSize != null) {
                    rational = new Rational(maximumSize.getWidth(), maximumSize.getHeight());
                }
            } else if (i12 != 3) {
                throw new AssertionError("Undefined targetAspectRatio: " + i12);
            }
        } else {
            rational = AspectRatioUtil.ASPECT_RATIO_16_9;
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.mResolutionCorrector.insertOrPrioritize(SurfaceConfig.getConfigType(i11), list);
    }

    @VisibleForTesting
    public Map<UseCaseConfig<?>, List<Size>> filterSupportedSizes(Map<UseCaseConfig<?>, List<Size>> map, FeatureSettings featureSettings, boolean z11) {
        HashMap map2 = new HashMap();
        for (UseCaseConfig<?> useCaseConfig : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            List<Size> list = map.get(useCaseConfig);
            Objects.requireNonNull(list);
            Iterator<Size> it = list.iterator();
            while (it.hasNext()) {
                populateReducedSizeListAndUniqueMaxFpsMap(featureSettings, featureSettings.getTargetFpsRange(), it.next(), useCaseConfig.getInputFormat(), useCaseConfig.getStreamUseCase(), z11, map3, arrayList);
            }
            map2.put(useCaseConfig, arrayList);
        }
        return map2;
    }

    public SurfaceStreamSpecQueryResult getSuggestedStreamSpecifications(int i11, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean zIsStrictFpsRequired;
        Range<Integer> targetFpsRange;
        refreshPreviewSize();
        boolean zIsHighSpeedOn = HighSpeedResolver.isHighSpeedOn(list, map.keySet());
        Map<UseCaseConfig<?>, List<Size>> mapFilterCommonSupportedSizes = zIsHighSpeedOn ? this.mHighSpeedResolver.filterCommonSupportedSizes(map) : map;
        ArrayList arrayList = new ArrayList(mapFilterCommonSupportedSizes.keySet());
        List<Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(arrayList);
        Map<UseCaseConfig<?>, DynamicRange> mapResolveAndValidateDynamicRanges = this.mDynamicRangeResolver.resolveAndValidateDynamicRanges(list, arrayList, useCasesPriorityOrder);
        Logger.m1866d(TAG, "resolvedDynamicRanges = " + mapResolveAndValidateDynamicRanges);
        boolean zIsUltraHdrOn = isUltraHdrOn(list, mapFilterCommonSupportedSizes);
        if (z14) {
            targetFpsRange = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            zIsStrictFpsRequired = false;
        } else {
            zIsStrictFpsRequired = isStrictFpsRequired(list, arrayList);
            targetFpsRange = getTargetFpsRange(list, arrayList, useCasesPriorityOrder, zIsStrictFpsRequired);
        }
        Range<Integer> range = targetFpsRange;
        boolean z15 = zIsStrictFpsRequired;
        Logger.m1866d(TAG, "getSuggestedStreamSpecifications: isPreviewStabilizationOn = " + z11 + ", mIsPreviewStabilizationSupported = " + this.mIsPreviewStabilizationSupported + ", isFeatureComboInvocation = " + z13);
        if (z11 && !this.mIsPreviewStabilizationSupported && z13) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        return resolveSpecsByCheckingMethod(getCheckingMethod(mapResolveAndValidateDynamicRanges.values(), range, z11, zIsUltraHdrOn, z13), createFeatureSettings(i11, z12, mapResolveAndValidateDynamicRanges, z11, zIsUltraHdrOn, zIsHighSpeedOn, z13, false, range, z15), list, mapFilterCommonSupportedSizes, arrayList, useCasesPriorityOrder, mapResolveAndValidateDynamicRanges, z14);
    }

    @VisibleForTesting
    public SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int i11) {
        if (!this.mSurfaceSizeDefinitionFormats.contains(Integer.valueOf(i11))) {
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS720pSizeMap(), SizeUtil.RESOLUTION_720P, i11);
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS1440pSizeMap(), SizeUtil.RESOLUTION_1440P, i11);
            updateMaximumSizeByFormat(this.mSurfaceSizeDefinition.getMaximumSizeMap(), i11, null);
            updateMaximumSizeByFormat(this.mSurfaceSizeDefinition.getMaximum4x3SizeMap(), i11, AspectRatioUtil.ASPECT_RATIO_4_3);
            updateMaximumSizeByFormat(this.mSurfaceSizeDefinition.getMaximum16x9SizeMap(), i11, AspectRatioUtil.ASPECT_RATIO_16_9);
            updateUltraMaximumSizeByFormat(this.mSurfaceSizeDefinition.getUltraMaximumSizeMap(), i11);
            this.mSurfaceSizeDefinitionFormats.add(Integer.valueOf(i11));
        }
        return this.mSurfaceSizeDefinition;
    }

    public SupportedSurfaceCombination(Context context, String str, CameraManagerCompat cameraManagerCompat, CamcorderProfileHelper camcorderProfileHelper, FeatureCombinationQuery featureCombinationQuery) throws CameraUnavailableException {
        int iIntValue;
        this.mIsRawSupported = false;
        this.mIsBurstCaptureSupported = false;
        this.mIsUltraHighResolutionSensorSupported = false;
        this.mIsManualSensorSupported = false;
        String str2 = (String) Preconditions.checkNotNull(str);
        this.mCameraId = str2;
        this.mCamcorderProfileHelper = (CamcorderProfileHelper) Preconditions.checkNotNull(camcorderProfileHelper);
        this.mExtraSupportedSurfaceCombinationsContainer = new ExtraSupportedSurfaceCombinationsContainer();
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str2);
            this.mCharacteristics = cameraCharacteristicsCompat;
            Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 2;
            }
            this.mHardwareLevel = iIntValue;
            int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i11 : iArr) {
                    if (i11 == 3) {
                        this.mIsRawSupported = true;
                    } else if (i11 == 6) {
                        this.mIsBurstCaptureSupported = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i11 == 16) {
                        this.mIsUltraHighResolutionSensorSupported = true;
                    } else if (i11 == 1) {
                        this.mIsManualSensorSupported = true;
                    }
                }
            }
            DynamicRangeResolver dynamicRangeResolver = new DynamicRangeResolver(this.mCharacteristics);
            this.mDynamicRangeResolver = dynamicRangeResolver;
            this.mHighSpeedResolver = new HighSpeedResolver(this.mCharacteristics);
            generateSupportedCombinationList();
            if (this.mIsUltraHighResolutionSensorSupported) {
                generateUltraHighSupportedCombinationList();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.mIsConcurrentCameraModeSupported = zHasSystemFeature;
            if (zHasSystemFeature) {
                generateConcurrentSupportedCombinationList();
            }
            if (dynamicRangeResolver.is10BitDynamicRangeSupported()) {
                generate10BitSupportedCombinationList();
            }
            boolean zIsStreamUseCaseSupported = StreamUseCaseUtil.isStreamUseCaseSupported(this.mCharacteristics);
            this.mIsStreamUseCaseSupported = zIsStreamUseCaseSupported;
            if (zIsStreamUseCaseSupported) {
                generateStreamUseCaseSupportedCombinationList();
            }
            boolean zIsPreviewStabilizationSupported = VideoStabilizationUtil.isPreviewStabilizationSupported(this.mCharacteristics);
            this.mIsPreviewStabilizationSupported = zIsPreviewStabilizationSupported;
            if (zIsPreviewStabilizationSupported) {
                generatePreviewStabilizationSupportedCombinationList();
            }
            generateSurfaceSizeDefinition();
            checkCustomization();
            this.mFeatureCombinationQuery = featureCombinationQuery;
        } catch (CameraAccessExceptionCompat e11) {
            throw CameraUnavailableExceptionHelper.createFrom(e11);
        }
    }

    private static Range<Integer> compareIntersectingRanges(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double rangeLength = getRangeLength(range2.intersect(range));
        double rangeLength2 = getRangeLength(range3.intersect(range));
        double rangeLength3 = rangeLength2 / ((double) getRangeLength(range3));
        double rangeLength4 = rangeLength / ((double) getRangeLength(range2));
        if (rangeLength2 <= rangeLength ? !(rangeLength2 != rangeLength ? rangeLength4 >= 0.5d || rangeLength3 <= rangeLength4 : rangeLength3 <= rangeLength4 && (rangeLength3 != rangeLength4 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue())) : !(rangeLength3 < 0.5d && rangeLength3 < rangeLength4)) {
            return range3;
        }
        return range2;
    }

    private SessionConfig createFeatureComboSessionConfig(FeatureSettings featureSettings, List<SurfaceConfig> list, Map<SurfaceConfig, DynamicRange> map, List<UseCaseConfig<?>> list2, List<Integer> list3) {
        Range<Integer> range;
        Range<Integer> targetFpsRange = featureSettings.getTargetFpsRange();
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            SurfaceConfig surfaceConfig = list.get(i11);
            Size resolution = surfaceConfig.getResolution(getUpdatedSurfaceSizeDefinitionByFormat(surfaceConfig.getImageFormat()));
            UseCaseConfig<?> useCaseConfig = list2.get(list3.get(i11).intValue());
            DynamicRange dynamicRange = map.get(surfaceConfig);
            Objects.requireNonNull(dynamicRange);
            SessionConfig.Builder builderCreateSessionConfigBuilder = FeatureCombinationQuery.createSessionConfigBuilder(useCaseConfig, resolution, dynamicRange);
            if (StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(targetFpsRange)) {
                range = FpsRangeFeature.DEFAULT_FPS_RANGE;
            } else {
                range = targetFpsRange;
            }
            builderCreateSessionConfigBuilder.setExpectedFrameRateRange(range);
            if (featureSettings.isPreviewStabilizationOn()) {
                builderCreateSessionConfigBuilder.setPreviewStabilization(2);
            }
            validatingBuilder.add(builderCreateSessionConfigBuilder.build());
            Preconditions.checkState(validatingBuilder.isValid(), "Cannot create a combined SessionConfig for feature combo after adding " + useCaseConfig + " with " + surfaceConfig + " due to [" + validatingBuilder.getInvalidReason() + "]; surfaceConfigList = " + list + ", featureSettings = " + featureSettings + ", newUseCaseConfigs = " + list2);
        }
        return validatingBuilder.build();
    }

    private FeatureSettings createFeatureSettings(int i11, boolean z11, Map<UseCaseConfig<?>, DynamicRange> map, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Range<Integer> range, boolean z17) {
        int requiredMaxBitDepth = getRequiredMaxBitDepth(map);
        if (i11 != 0 && z13) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.mCameraId, CameraMode.toLabelString(i11)));
        }
        if (i11 != 0 && requiredMaxBitDepth == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.mCameraId, CameraMode.toLabelString(i11)));
        }
        if (i11 != 0 && z15) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Feature combination query is not currently supported in %s camera mode.", this.mCameraId, CameraMode.toLabelString(i11)));
        }
        if (z14 && z15) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z14 && !this.mHighSpeedResolver.isHighSpeedSupported()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if (z15 && range == StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED && z16) {
            range = FpsRangeFeature.DEFAULT_FPS_RANGE;
        }
        return FeatureSettings.m1757of(i11, z11, requiredMaxBitDepth, z12, z13, z14, z15, z16, range, z17);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0112 A[PHI: r6 r7 r10
      0x0112: PHI (r6v2 boolean) = (r6v1 boolean), (r6v1 boolean), (r6v1 boolean), (r6v3 boolean) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v5 int), (r7v6 int) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r10v3 java.util.List<android.util.Size>) = 
      (r10v1 java.util.List<android.util.Size>)
      (r10v1 java.util.List<android.util.Size>)
      (r10v5 java.util.List<android.util.Size>)
      (r10v6 java.util.List<android.util.Size>)
     binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    private BestSizesAndMaxFpsForConfigs findBestSizesAndFps(final FeatureSettings featureSettings, List<AttachedSurfaceInfo> list, final List<UseCaseConfig<?>> list2, final List<Integer> list3, List<List<Size>> list4, List<SurfaceConfig> list5, Map<UseCaseConfig<?>, DynamicRange> map, int i11, boolean z11) {
        FeatureSettings featureSettings2;
        Range<Integer> targetFpsRange = featureSettings.getTargetFpsRange();
        Iterator<List<Size>> it = list4.iterator();
        int i12 = Integer.MAX_VALUE;
        boolean z12 = false;
        int i13 = Integer.MAX_VALUE;
        boolean z13 = false;
        int i14 = Integer.MAX_VALUE;
        List<Size> list6 = null;
        List<Size> list7 = null;
        while (true) {
            if (it.hasNext()) {
                List<Size> next = it.next();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                Pair<List<SurfaceConfig>, Integer> surfaceConfigListAndFpsCeiling = getSurfaceConfigListAndFpsCeiling(featureSettings, list, next, list2, list3, i11, map2, map3);
                final List<SurfaceConfig> list8 = (List) surfaceConfigListAndFpsCeiling.first;
                int iIntValue = ((Integer) surfaceConfigListAndFpsCeiling.second).intValue();
                boolean zIsConfigFrameRateAcceptable = isConfigFrameRateAcceptable(i11, targetFpsRange, iIntValue);
                final HashMap map4 = new HashMap();
                Iterator<List<Size>> it2 = it;
                int i15 = 0;
                while (i15 < list8.size()) {
                    SurfaceConfig surfaceConfig = list8.get(i15);
                    DynamicRange dynamicRange = DynamicRange.UNSPECIFIED;
                    int i16 = i15;
                    if (map2.containsKey(Integer.valueOf(i16))) {
                        AttachedSurfaceInfo attachedSurfaceInfo = map2.get(Integer.valueOf(i16));
                        Objects.requireNonNull(attachedSurfaceInfo);
                        dynamicRange = attachedSurfaceInfo.getDynamicRange();
                    } else {
                        if (map3.containsKey(Integer.valueOf(i16))) {
                            UseCaseConfig<?> useCaseConfig = map3.get(Integer.valueOf(i16));
                            Objects.requireNonNull(useCaseConfig);
                            dynamicRange = map.get(useCaseConfig);
                        }
                        map4.put(surfaceConfig, dynamicRange);
                        i15 = i16 + 1;
                    }
                    map4.put(surfaceConfig, dynamicRange);
                    i15 = i16 + 1;
                }
                UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl(new Function0() { // from class: androidx.camera.camera2.internal.y3
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(this.f1528b.checkSupported(featureSettings, list8, map4, list2, list3));
                    }
                });
                if (z11 && ((Boolean) unsafeLazyImpl.getValue()).booleanValue() && (i12 == Integer.MAX_VALUE || i12 < iIntValue)) {
                    i12 = iIntValue;
                }
                if (!z12 && ((Boolean) unsafeLazyImpl.getValue()).booleanValue()) {
                    if (i13 == Integer.MAX_VALUE || i13 < iIntValue) {
                        i13 = iIntValue;
                        list6 = next;
                    }
                    if (zIsConfigFrameRateAcceptable) {
                        if (z13 && !z11) {
                            featureSettings2 = featureSettings;
                            i13 = iIntValue;
                            list6 = next;
                            break;
                        }
                        z12 = true;
                        i13 = iIntValue;
                        list6 = next;
                        if (list5 == null) {
                        }
                        it = it2;
                    } else {
                        if (list5 == null) {
                        }
                        it = it2;
                    }
                } else {
                    if (list5 == null && !z13) {
                        featureSettings2 = featureSettings;
                        if (getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettings2, list8, map2, map3) != null) {
                            if (i14 == Integer.MAX_VALUE || i14 < iIntValue) {
                                i14 = iIntValue;
                                list7 = next;
                            }
                            if (!zIsConfigFrameRateAcceptable) {
                                continue;
                            } else {
                                if (z12 && !z11) {
                                    i14 = iIntValue;
                                    list7 = next;
                                    break;
                                }
                                z13 = true;
                                i14 = iIntValue;
                                list7 = next;
                            }
                        } else {
                            continue;
                        }
                    }
                    it = it2;
                }
            } else {
                featureSettings2 = featureSettings;
                break;
            }
        }
        if (featureSettings2.isFeatureComboInvocation() && !StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(targetFpsRange) && (i13 == Integer.MAX_VALUE || i13 < ((Integer) targetFpsRange.getUpper()).intValue())) {
            return BestSizesAndMaxFpsForConfigs.m1756of(null, null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        return BestSizesAndMaxFpsForConfigs.m1756of(list6, list7, i13, i14, i12);
    }

    private List<List<Size>> getAllPossibleSizeArrangements(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new ArrayList());
            }
            int size2 = size / list.get(0).size();
            int i12 = size;
            for (int i13 = 0; i13 < list.size(); i13++) {
                List<Size> list2 = list.get(i13);
                for (int i14 = 0; i14 < size; i14++) {
                    ((List) arrayList.get(i14)).add(list2.get((i14 % i12) / size2));
                }
                if (i13 < list.size() - 1) {
                    i12 = size2;
                    size2 /= list.get(i13 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    private Size getMaxOutputSizeByFormat(StreamConfigurationMap streamConfigurationMap, int i11, boolean z11, Rational rational) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = getOutputSizes(streamConfigurationMap, i11, rational);
        if (outputSizes != null && outputSizes.length != 0) {
            CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
            Size size = (Size) Collections.max(Arrays.asList(outputSizes), compareSizesByArea);
            Size size2 = SizeUtil.RESOLUTION_ZERO;
            if (z11 && (highResolutionOutputSizes = Api23Impl.getHighResolutionOutputSizes(streamConfigurationMap, i11)) != null && highResolutionOutputSizes.length > 0) {
                size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), compareSizesByArea);
            }
            return (Size) Collections.max(Arrays.asList(size, size2), compareSizesByArea);
        }
        return null;
    }

    private int getMaxSupportedFpsFromAttachedSurfaces(List<AttachedSurfaceInfo> list, boolean z11) {
        int updatedMaximumFps = Integer.MAX_VALUE;
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            updatedMaximumFps = getUpdatedMaximumFps(updatedMaximumFps, attachedSurfaceInfo.getImageFormat(), attachedSurfaceInfo.getSize(), z11);
        }
        return updatedMaximumFps;
    }

    private static int getRangeDistance(Range<Integer> range, Range<Integer> range2) {
        boolean z11;
        if (!range.contains((Integer) range2.getUpper()) && !range.contains((Integer) range2.getLower())) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "Ranges must not intersect");
        if (((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue()) {
            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue();
        }
        return ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static int getRangeLength(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    private static int getRequiredMaxBitDepth(Map<UseCaseConfig<?>, DynamicRange> map) {
        Iterator<DynamicRange> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private int getUpdatedMaximumFps(int i11, int i12, Size size, boolean z11) {
        return Math.min(i11, getMaxFrameRate(i12, size, z11));
    }

    private boolean isStrictFpsRequired(List<AttachedSurfaceInfo> list, List<UseCaseConfig<?>> list2) {
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        Boolean boolValueOf = null;
        while (it.hasNext()) {
            boolValueOf = Boolean.valueOf(getAndValidateIsStrictFpsRequired(it.next().isStrictFrameRateRequired(), boolValueOf));
        }
        Iterator<UseCaseConfig<?>> it2 = list2.iterator();
        while (it2.hasNext()) {
            boolValueOf = Boolean.valueOf(getAndValidateIsStrictFpsRequired(it2.next().isStrictFrameRateRequired(), boolValueOf));
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private static boolean isUltraHdrOn(List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map) {
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getImageFormat() == 4101) {
                return true;
            }
        }
        Iterator<UseCaseConfig<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getInputFormat() == 4101) {
                return true;
            }
        }
        return false;
    }

    private void populateReducedSizeListAndUniqueMaxFpsMap(FeatureSettings featureSettings, Range<Integer> range, Size size, int i11, StreamUseCase streamUseCase, boolean z11, Map<SurfaceConfig.ConfigSize, Set<Integer>> map, List<Size> list) {
        SurfaceConfig.ConfigSource configSource;
        int maxFrameRate;
        SurfaceSizeDefinition updatedSurfaceSizeDefinitionByFormat = getUpdatedSurfaceSizeDefinitionByFormat(i11);
        int cameraMode = featureSettings.getCameraMode();
        if (featureSettings.requiresFeatureComboQuery()) {
            configSource = SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE;
        } else {
            configSource = SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES;
        }
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.transformSurfaceConfig(i11, size, updatedSurfaceSizeDefinitionByFormat, cameraMode, configSource, streamUseCase).getConfigSize();
        Range<Integer> range2 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (range2.equals(range) && !z11) {
            maxFrameRate = Integer.MAX_VALUE;
        } else {
            maxFrameRate = getMaxFrameRate(i11, size, featureSettings.isHighSpeedOn());
        }
        if (featureSettings.isFeatureComboInvocation()) {
            if (configSize != SurfaceConfig.ConfigSize.NOT_SUPPORT) {
                if (!range2.equals(range) && maxFrameRate < ((Integer) range.getUpper()).intValue()) {
                    return;
                }
            } else {
                return;
            }
        }
        Set<Integer> hashSet = map.get(configSize);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(configSize, hashSet);
        }
        if (!hashSet.contains(Integer.valueOf(maxFrameRate))) {
            list.add(size);
            hashSet.add(Integer.valueOf(maxFrameRate));
        }
    }

    public boolean checkSupported(FeatureSettings featureSettings, List<SurfaceConfig> list, Map<SurfaceConfig, DynamicRange> map, List<UseCaseConfig<?>> list2, List<Integer> list3) {
        Iterator<SurfaceCombination> it = getSurfaceCombinationsByFeatureSettings(featureSettings).iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (it.next().getOrderedSupportedSurfaceConfigList(list) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                break;
            }
        }
        if (z11 && featureSettings.requiresFeatureComboQuery()) {
            SessionConfig sessionConfigCreateFeatureComboSessionConfig = createFeatureComboSessionConfig(featureSettings, list, map, list2, list3);
            boolean zIsSupported = this.mFeatureCombinationQuery.isSupported(sessionConfigCreateFeatureComboSessionConfig);
            Iterator<DeferrableSurface> it2 = sessionConfigCreateFeatureComboSessionConfig.getSurfaces().iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
            return zIsSupported;
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<SurfaceConfig> getOrderedSupportedStreamUseCaseSurfaceConfigList(FeatureSettings featureSettings, List<SurfaceConfig> list, Map<Integer, AttachedSurfaceInfo> map, Map<Integer, UseCaseConfig<?>> map2) {
        if (!StreamUseCaseUtil.shouldUseStreamUseCase(featureSettings)) {
            return null;
        }
        Iterator<SurfaceCombination> it = this.mSurfaceCombinationsStreamUseCase.iterator();
        while (it.hasNext()) {
            final List<SurfaceConfig> orderedSupportedSurfaceConfigList = it.next().getOrderedSupportedSurfaceConfigList(list);
            if (orderedSupportedSurfaceConfigList != null) {
                boolean zAreCaptureTypesEligible = StreamUseCaseUtil.areCaptureTypesEligible(map, map2, orderedSupportedSurfaceConfigList);
                UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl(new Function0() { // from class: androidx.camera.camera2.internal.x3
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(StreamUseCaseUtil.areStreamUseCasesAvailableForSurfaceConfigs(this.f1518b.mCharacteristics, orderedSupportedSurfaceConfigList));
                    }
                });
                if (zAreCaptureTypesEligible && ((Boolean) unsafeLazyImpl.getValue()).booleanValue()) {
                    return orderedSupportedSurfaceConfigList;
                }
            }
        }
        return null;
    }

    public SurfaceConfig transformSurfaceConfig(int i11, int i12, Size size, StreamUseCase streamUseCase) {
        return SurfaceConfig.transformSurfaceConfig(i12, size, getUpdatedSurfaceSizeDefinitionByFormat(i12), i11, SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase);
    }

    private int getMaxFrameRate(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i11, Size size) {
        StreamConfigurationMapCompat streamConfigurationMapCompat = cameraCharacteristicsCompat.getStreamConfigurationMapCompat();
        Objects.requireNonNull(streamConfigurationMapCompat);
        long outputMinFrameDuration = streamConfigurationMapCompat.getOutputMinFrameDuration(i11, size);
        if (outputMinFrameDuration > 0) {
            return (int) (1.0E9d / outputMinFrameDuration);
        }
        if (!this.mIsManualSensorSupported) {
            return Integer.MAX_VALUE;
        }
        Logger.m1872w(TAG, "minFrameDuration: " + outputMinFrameDuration + " is invalid for imageFormat = " + i11 + ", size = " + size);
        return 0;
    }

    private void checkCustomization() {
    }
}
