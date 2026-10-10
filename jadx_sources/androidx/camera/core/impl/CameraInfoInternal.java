package androidx.camera.core.impl;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.annotation.OptIn;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUseCaseAdapterProvider;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExperimentalSessionConfig;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.impl.utils.RangeUtil;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraInfoInternal extends CameraInfo {
    void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback);

    Object getCameraCharacteristics();

    String getCameraId();

    Quirks getCameraQuirks();

    EncoderProfilesProvider getEncoderProfilesProvider();

    Object getPhysicalCameraCharacteristics(String str);

    Rect getSensorRect();

    Set<DynamicRange> getSupportedDynamicRanges();

    @Override // androidx.camera.core.CameraInfo
    @ExperimentalSessionConfig
    default Set<Range<Integer>> getSupportedFrameRateRanges(androidx.camera.core.SessionConfig sessionConfig) {
        try {
            int maxSupportedFrameRate = UseCaseAdditionSimulator.simulateAddUseCases(this, sessionConfig, true).getPrimaryStreamSpecResult().getMaxSupportedFrameRate();
            Set<Range<Integer>> setFilterFixedRanges = sessionConfig.getSessionType() == 1 ? RangeUtil.filterFixedRanges(getSupportedHighSpeedFrameRateRanges()) : getSupportedFrameRateRanges();
            if (setFilterFixedRanges.isEmpty()) {
                return Collections.EMPTY_SET;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Range<Integer> range : setFilterFixedRanges) {
                if (((Integer) range.getUpper()).intValue() <= maxSupportedFrameRate) {
                    linkedHashSet.add(range);
                }
            }
            return linkedHashSet;
        } catch (Throwable th2) {
            Logger.m1873w("CameraInfoInternal", "Failed to get max supported frameRate by SessionConfig: " + sessionConfig, th2);
            return Collections.EMPTY_SET;
        }
    }

    List<Size> getSupportedHighResolutions(int i11);

    Set<Range<Integer>> getSupportedHighSpeedFrameRateRanges();

    Set<Range<Integer>> getSupportedHighSpeedFrameRateRangesFor(Size size);

    List<Size> getSupportedHighSpeedResolutions();

    List<Size> getSupportedHighSpeedResolutionsFor(Range<Integer> range);

    Set<Integer> getSupportedOutputFormats();

    List<Size> getSupportedResolutions(int i11);

    Timebase getTimebase();

    default boolean isCaptureProcessProgressSupported() {
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    @ExperimentalSessionConfig
    default boolean isFeatureGroupSupported(androidx.camera.core.SessionConfig sessionConfig) {
        try {
            UseCaseAdditionSimulator.simulateAddUseCases(this, sessionConfig, false);
            return true;
        } catch (CameraUseCaseAdapter.CameraException | IllegalArgumentException e11) {
            Logger.m1867d("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e11);
            return false;
        }
    }

    boolean isHighSpeedSupported();

    default boolean isPostviewSupported() {
        return false;
    }

    boolean isPreviewStabilizationSupported();

    default boolean isUseCaseCombinationSupported(List<UseCase> list, int i11, boolean z11, CameraConfig cameraConfig) {
        return false;
    }

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback);

    default Set<Integer> getAvailableCapabilities() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.core.CameraInfo
    default CameraSelector getCameraSelector() {
        return new CameraSelector.Builder().addCameraFilter(new CameraFilter() { // from class: androidx.camera.core.impl.g
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                return CameraInfoInternal.m1940a(this.f1668a, list);
            }
        }).addCameraFilter(new LensFacingCameraFilter(getLensFacing())).build();
    }

    default boolean isUseCaseCombinationSupported(List<UseCase> list) {
        return isUseCaseCombinationSupported(list, 0);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ List m1940a(CameraInfoInternal cameraInfoInternal, List list) {
        String cameraId = cameraInfoInternal.getCameraId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            Preconditions.checkArgument(cameraInfo instanceof CameraInfoInternal);
            if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalStateException("Unable to find camera with id " + cameraId + " from list of available cameras.");
    }

    @Override // androidx.camera.core.CameraInfo
    default CameraIdentifier getCameraIdentifier() {
        return CameraIdentifier.create(getCameraId());
    }

    @OptIn(markerClass = {ExperimentalSessionConfig.class})
    default boolean isResolvedFeatureGroupSupported(ResolvedFeatureGroup resolvedFeatureGroup, androidx.camera.core.SessionConfig sessionConfig) {
        for (GroupableFeature groupableFeature : resolvedFeatureGroup.getFeatures()) {
            if (!groupableFeature.isSupportedIndividually(this, sessionConfig)) {
                Logger.m1866d("CameraInfoInternal", groupableFeature + " is not supported.");
                return false;
            }
        }
        try {
            UseCaseAdditionSimulator.simulateAddUseCases(this, sessionConfig, false, resolvedFeatureGroup);
            return true;
        } catch (CameraUseCaseAdapter.CameraException | IllegalArgumentException e11) {
            Logger.m1867d("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e11);
            return false;
        }
    }

    default boolean isUseCaseCombinationSupported(List<UseCase> list, int i11) {
        return isUseCaseCombinationSupported(list, i11, false);
    }

    default void setCameraUseCaseAdapterProvider(CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider) {
        UseCaseAdditionSimulator.setCameraUseCaseAdapterProvider(cameraUseCaseAdapterProvider);
    }

    default boolean isUseCaseCombinationSupported(List<UseCase> list, int i11, boolean z11) {
        return isUseCaseCombinationSupported(list, i11, z11, CameraConfigs.defaultConfig());
    }

    default CameraInfoInternal getImplementation() {
        return this;
    }
}
