package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualOutConfig;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
class VirtualCameraAdapter implements UseCase.StateChangeCallback {
    private static final String TAG = "VirtualCameraAdapter";
    final Set<UseCase> mChildren;
    private final Set<UseCaseConfig<?>> mChildrenConfigs;
    private final Map<UseCase, UseCaseConfig<?>> mChildrenConfigsMap;
    private final CameraInternal mParentCamera;
    private final ResolutionsMerger mResolutionsMerger;
    private final CameraInternal mSecondaryParentCamera;
    private ResolutionsMerger mSecondaryResolutionsMerger;
    private final UseCaseConfigFactory mUseCaseConfigFactory;
    final Map<UseCase, SurfaceEdge> mChildrenEdges = new HashMap();
    private final Map<UseCase, VirtualCamera> mChildrenVirtualCameras = new HashMap();
    final Map<UseCase, Boolean> mChildrenActiveState = new HashMap();
    private final CameraCaptureCallback mParentMetadataCallback = createCameraCaptureCallback();

    public static class VirtualCameraCaptureCallback extends CameraCaptureCallback {
        private final WeakReference<VirtualCameraAdapter> mVirtualCameraAdapterRef;

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i11, CameraCaptureResult cameraCaptureResult) {
            VirtualCameraAdapter virtualCameraAdapter = this.mVirtualCameraAdapterRef.get();
            if (virtualCameraAdapter != null) {
                Iterator<UseCase> it = virtualCameraAdapter.mChildren.iterator();
                while (it.hasNext()) {
                    VirtualCameraAdapter.sendCameraCaptureResultToChild(cameraCaptureResult, it.next().getSessionConfig(), i11);
                }
            }
        }

        public VirtualCameraCaptureCallback(VirtualCameraAdapter virtualCameraAdapter) {
            this.mVirtualCameraAdapterRef = new WeakReference<>(virtualCameraAdapter);
        }
    }

    public Map<UseCase, OutConfig> getChildrenOutConfigs(SurfaceEdge surfaceEdge, int i11, boolean z11, boolean z12) {
        HashMap map = new HashMap();
        for (UseCase useCase : this.mChildren) {
            SurfaceEdge surfaceEdge2 = surfaceEdge;
            OutConfig outConfigCalculateOutConfig = calculateOutConfig(useCase, this.mResolutionsMerger, this.mParentCamera, surfaceEdge2, i11, z11, z12);
            updateVirtualCameraRotationDegrees(useCase);
            map.put(useCase, outConfigCalculateOutConfig);
            surfaceEdge = surfaceEdge2;
        }
        return map;
    }

    private static int getChildFormat(UseCase useCase) {
        return useCase instanceof ImageCapture ? 256 : 34;
    }

    @VisibleForTesting
    public static DeferrableSurface getChildSurface(UseCase useCase) {
        List<DeferrableSurface> surfaces = useCase instanceof ImageCapture ? useCase.getSessionConfig().getSurfaces() : useCase.getSessionConfig().getRepeatingCaptureConfig().getSurfaces();
        Preconditions.checkState(surfaces.size() <= 1);
        if (surfaces.size() == 1) {
            return surfaces.get(0);
        }
        return null;
    }

    private static int getChildTargetType(UseCase useCase) {
        if (useCase instanceof Preview) {
            return 1;
        }
        return useCase instanceof ImageCapture ? 4 : 2;
    }

    private Preview getPreviewFromChildren() {
        for (UseCase useCase : this.mChildren) {
            if (useCase instanceof Preview) {
                return (Preview) useCase;
            }
        }
        return null;
    }

    private SurfaceEdge getUseCaseEdge(UseCase useCase) {
        SurfaceEdge surfaceEdge = this.mChildrenEdges.get(useCase);
        Objects.requireNonNull(surfaceEdge);
        return surfaceEdge;
    }

    private boolean isUseCaseActive(UseCase useCase) {
        Boolean bool = this.mChildrenActiveState.get(useCase);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    private static Range<Integer> resolveTargetFrameRate(Set<UseCaseConfig<?>> set) {
        Range<Integer> rangeIntersect = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        Iterator<UseCaseConfig<?>> it = set.iterator();
        while (it.hasNext()) {
            Range<Integer> targetFrameRate = it.next().getTargetFrameRate(rangeIntersect);
            Objects.requireNonNull(targetFrameRate);
            if (StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(rangeIntersect)) {
                rangeIntersect = targetFrameRate;
            } else {
                try {
                    rangeIntersect = rangeIntersect.intersect(targetFrameRate);
                } catch (IllegalArgumentException unused) {
                    Logger.m1866d(TAG, "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeIntersect + " <<>> " + targetFrameRate);
                    return rangeIntersect.extend(targetFrameRate);
                }
            }
        }
        return rangeIntersect;
    }

    private static Map<UseCase, UseCaseConfig<?>> toChildrenConfigsMap(CameraInternal cameraInternal, Set<UseCase> set, UseCaseConfigFactory useCaseConfigFactory) {
        HashMap map = new HashMap();
        for (UseCase useCase : set) {
            map.put(useCase, useCase.mergeConfigs(cameraInternal.getCameraInfoInternal(), null, useCase.getDefaultConfig(true, useCaseConfigFactory)));
        }
        return map;
    }

    private void updateVirtualCameraRotationDegrees(UseCase useCase) {
        int childRotationDegrees = getChildRotationDegrees(useCase, this.mParentCamera);
        VirtualCamera virtualCamera = this.mChildrenVirtualCameras.get(useCase);
        Objects.requireNonNull(virtualCamera);
        virtualCamera.setRotationDegrees(childRotationDegrees);
    }

    public void bindChildren() {
        for (UseCase useCase : this.mChildren) {
            VirtualCamera virtualCamera = this.mChildrenVirtualCameras.get(useCase);
            Objects.requireNonNull(virtualCamera);
            useCase.bindToCamera(virtualCamera, null, null, useCase.getDefaultConfig(true, this.mUseCaseConfigFactory));
        }
    }

    public CameraCaptureCallback createCameraCaptureCallback() {
        return new VirtualCameraCaptureCallback(this);
    }

    public Set<UseCase> getChildren() {
        return this.mChildren;
    }

    public CameraCaptureCallback getParentMetadataCallback() {
        return this.mParentMetadataCallback;
    }

    public Map<UseCase, Size> getSelectedChildSizes(SurfaceEdge surfaceEdge, boolean z11) {
        HashMap map = new HashMap();
        for (UseCase useCase : this.mChildren) {
            ResolutionsMerger resolutionsMerger = this.mResolutionsMerger;
            UseCaseConfig<?> useCaseConfig = this.mChildrenConfigsMap.get(useCase);
            Objects.requireNonNull(useCaseConfig);
            PreferredChildSize preferredChildSize = resolutionsMerger.getPreferredChildSize(useCaseConfig, surfaceEdge.getCropRect(), TransformUtils.getRotationDegrees(surfaceEdge.getSensorToBufferTransform()), z11);
            map.put(useCase, preferredChildSize.getOriginalSelectedChildSize());
            Logger.m1866d(TAG, "Selected child size: " + preferredChildSize.getOriginalSelectedChildSize() + ", useCase: " + useCase);
        }
        return map;
    }

    public void mergeChildrenConfigs(MutableConfig mutableConfig) {
        mutableConfig.insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, this.mResolutionsMerger.getMergedResolutions(mutableConfig));
        mutableConfig.insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(getHighestSurfacePriority(this.mChildrenConfigs)));
        DynamicRange dynamicRangeResolveDynamicRange = DynamicRangeUtils.resolveDynamicRange(this.mChildrenConfigs);
        if (dynamicRangeResolveDynamicRange == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        mutableConfig.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRangeResolveDynamicRange);
        mutableConfig.insertOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, resolveTargetFrameRate(this.mChildrenConfigs));
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            UseCaseConfig<?> useCaseConfig = this.mChildrenConfigsMap.get(it.next());
            Objects.requireNonNull(useCaseConfig);
            UseCaseConfig<?> useCaseConfig2 = useCaseConfig;
            if (useCaseConfig2.getVideoStabilizationMode() != 0) {
                mutableConfig.insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, Integer.valueOf(useCaseConfig2.getVideoStabilizationMode()));
            }
            if (useCaseConfig2.getPreviewStabilizationMode() != 0) {
                mutableConfig.insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, Integer.valueOf(useCaseConfig2.getPreviewStabilizationMode()));
            }
        }
    }

    public void notifyCameraControlReady() {
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onCameraControlReady();
        }
    }

    public void notifySessionStart() {
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onSessionStart();
        }
    }

    public void notifySessionStop() {
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onSessionStop();
        }
    }

    public void setChildrenEdges(Map<UseCase, SurfaceEdge> map, Map<UseCase, Size> map2) {
        this.mChildrenEdges.clear();
        this.mChildrenEdges.putAll(map);
        for (Map.Entry<UseCase, SurfaceEdge> entry : this.mChildrenEdges.entrySet()) {
            UseCase key = entry.getKey();
            SurfaceEdge value = entry.getValue();
            key.setViewPortCropRect(value.getCropRect());
            key.setSensorToBufferTransformMatrix(value.getSensorToBufferTransform());
            key.updateSuggestedStreamSpec(getChildStreamSpec(key, value.getStreamSpec(), map2), null);
            key.notifyState();
        }
    }

    public void unbindChildren() {
        for (UseCase useCase : this.mChildren) {
            VirtualCamera virtualCamera = this.mChildrenVirtualCameras.get(useCase);
            Objects.requireNonNull(virtualCamera);
            useCase.unbindFromCamera(virtualCamera);
        }
    }

    public VirtualCameraAdapter(CameraInternal cameraInternal, CameraInternal cameraInternal2, Set<UseCase> set, UseCaseConfigFactory useCaseConfigFactory, StreamSharing.Control control) {
        this.mParentCamera = cameraInternal;
        this.mSecondaryParentCamera = cameraInternal2;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
        this.mChildren = set;
        Map<UseCase, UseCaseConfig<?>> childrenConfigsMap = toChildrenConfigsMap(cameraInternal, set, useCaseConfigFactory);
        this.mChildrenConfigsMap = childrenConfigsMap;
        HashSet hashSet = new HashSet(childrenConfigsMap.values());
        this.mChildrenConfigs = hashSet;
        this.mResolutionsMerger = new ResolutionsMerger(cameraInternal, hashSet);
        if (cameraInternal2 != null) {
            this.mSecondaryResolutionsMerger = new ResolutionsMerger(cameraInternal2, hashSet);
        }
        for (UseCase useCase : set) {
            this.mChildrenActiveState.put(useCase, Boolean.FALSE);
            this.mChildrenVirtualCameras.put(useCase, new VirtualCamera(cameraInternal, this, control));
        }
    }

    private OutConfig calculateOutConfig(UseCase useCase, ResolutionsMerger resolutionsMerger, CameraInternal cameraInternal, SurfaceEdge surfaceEdge, int i11, boolean z11, boolean z12) {
        boolean zIsMirroringRequired;
        int sensorRotationDegrees = cameraInternal.getCameraInfo().getSensorRotationDegrees(i11);
        boolean zIsMirrored = TransformUtils.isMirrored(surfaceEdge.getSensorToBufferTransform());
        UseCaseConfig<?> useCaseConfig = this.mChildrenConfigsMap.get(useCase);
        Objects.requireNonNull(useCaseConfig);
        PreferredChildSize preferredChildSize = resolutionsMerger.getPreferredChildSize(useCaseConfig, surfaceEdge.getCropRect(), TransformUtils.getRotationDegrees(surfaceEdge.getSensorToBufferTransform()), z11);
        Rect cropRectBeforeScaling = preferredChildSize.getCropRectBeforeScaling();
        Size childSizeToScale = preferredChildSize.getChildSizeToScale();
        int iWithin360 = TransformUtils.within360((surfaceEdge.getRotationDegrees() + getChildRotationDegrees(useCase, cameraInternal)) - sensorRotationDegrees);
        if (z12) {
            zIsMirroringRequired = false;
        } else {
            zIsMirroringRequired = useCase.isMirroringRequired(cameraInternal) ^ zIsMirrored;
        }
        return OutConfig.m2050of(getChildTargetType(useCase), getChildFormat(useCase), cropRectBeforeScaling, TransformUtils.rotateSize(childSizeToScale, iWithin360), iWithin360, zIsMirroringRequired);
    }

    private static void forceSetProvider(SurfaceEdge surfaceEdge, DeferrableSurface deferrableSurface, SessionConfig sessionConfig) {
        surfaceEdge.invalidate();
        try {
            surfaceEdge.setProvider(deferrableSurface);
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            if (sessionConfig.getErrorListener() != null) {
                sessionConfig.getErrorListener().onError(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    @IntRange(from = 0, m1553to = 359)
    private int getChildRotationDegrees(UseCase useCase, CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfo().getSensorRotationDegrees(((ImageOutputConfig) useCase.getCurrentConfig()).getTargetRotation(0));
    }

    private static StreamSpec getChildStreamSpec(UseCase useCase, StreamSpec streamSpec, Map<UseCase, Size> map) {
        StreamSpec.Builder builder = streamSpec.toBuilder();
        Size size = map.get(useCase);
        if (size != null) {
            builder.setOriginalConfiguredResolution(size);
        }
        return builder.build();
    }

    private static int getHighestSurfacePriority(Set<UseCaseConfig<?>> set) {
        Iterator<UseCaseConfig<?>> it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().getSurfaceOccupancyPriority(0));
        }
        return iMax;
    }

    public static void sendCameraCaptureResultToChild(CameraCaptureResult cameraCaptureResult, SessionConfig sessionConfig, int i11) {
        Iterator<CameraCaptureCallback> it = sessionConfig.getRepeatingCameraCaptureCallbacks().iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(i11, new VirtualCameraCaptureResult(sessionConfig.getRepeatingCaptureConfig().getTagBundle(), cameraCaptureResult));
        }
    }

    public DualOutConfig getChildPreviewOutConfig(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, int i11, boolean z11) {
        Preview preview = (Preview) Preconditions.checkNotNull(getPreviewFromChildren());
        return DualOutConfig.m2037of(calculateOutConfig(preview, this.mResolutionsMerger, this.mParentCamera, surfaceEdge, i11, z11, false), calculateOutConfig(preview, this.mResolutionsMerger, this.mSecondaryParentCamera, surfaceEdge2, i11, z11, false));
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @MainThread
    public void onUseCaseActive(UseCase useCase) {
        Threads.checkMainThread();
        if (!isUseCaseActive(useCase)) {
            this.mChildrenActiveState.put(useCase, Boolean.TRUE);
            DeferrableSurface childSurface = getChildSurface(useCase);
            if (childSurface != null) {
                forceSetProvider(getUseCaseEdge(useCase), childSurface, useCase.getSessionConfig());
            }
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @MainThread
    public void onUseCaseInactive(UseCase useCase) {
        Threads.checkMainThread();
        if (!isUseCaseActive(useCase)) {
            return;
        }
        this.mChildrenActiveState.put(useCase, Boolean.FALSE);
        getUseCaseEdge(useCase).disconnect();
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @MainThread
    public void onUseCaseReset(UseCase useCase) {
        DeferrableSurface childSurface;
        Threads.checkMainThread();
        SurfaceEdge useCaseEdge = getUseCaseEdge(useCase);
        if (isUseCaseActive(useCase) && (childSurface = getChildSurface(useCase)) != null) {
            forceSetProvider(useCaseEdge, childSurface, useCase.getSessionConfig());
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    @MainThread
    public void onUseCaseUpdated(UseCase useCase) {
        Threads.checkMainThread();
        if (!isUseCaseActive(useCase)) {
            return;
        }
        SurfaceEdge useCaseEdge = getUseCaseEdge(useCase);
        DeferrableSurface childSurface = getChildSurface(useCase);
        if (childSurface != null) {
            forceSetProvider(useCaseEdge, childSurface, useCase.getSessionConfig());
        } else {
            useCaseEdge.disconnect();
        }
    }

    public void resetChildren() {
        Threads.checkMainThread();
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            onUseCaseReset(it.next());
        }
    }

    public Map<UseCase, DualOutConfig> getChildrenOutConfigs(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, int i11, boolean z11) {
        HashMap map = new HashMap();
        for (UseCase useCase : this.mChildren) {
            SurfaceEdge surfaceEdge3 = surfaceEdge;
            int i12 = i11;
            boolean z12 = z11;
            OutConfig outConfigCalculateOutConfig = calculateOutConfig(useCase, this.mResolutionsMerger, this.mParentCamera, surfaceEdge3, i12, z12, false);
            ResolutionsMerger resolutionsMerger = this.mSecondaryResolutionsMerger;
            Objects.requireNonNull(resolutionsMerger);
            CameraInternal cameraInternal = this.mSecondaryParentCamera;
            Objects.requireNonNull(cameraInternal);
            SurfaceEdge surfaceEdge4 = surfaceEdge2;
            OutConfig outConfigCalculateOutConfig2 = calculateOutConfig(useCase, resolutionsMerger, cameraInternal, surfaceEdge4, i12, z12, false);
            updateVirtualCameraRotationDegrees(useCase);
            map.put(useCase, DualOutConfig.m2037of(outConfigCalculateOutConfig, outConfigCalculateOutConfig2));
            surfaceEdge = surfaceEdge3;
            surfaceEdge2 = surfaceEdge4;
            i11 = i12;
            z11 = z12;
        }
        return map;
    }
}
