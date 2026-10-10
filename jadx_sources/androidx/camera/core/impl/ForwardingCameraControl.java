package androidx.camera.core.impl;

import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ForwardingCameraControl implements CameraControlInternal {
    private final CameraControlInternal mCameraControlInternal;

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(Config config) {
        this.mCameraControlInternal.addInteropConfig(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(SessionConfig.Builder builder) {
        this.mCameraControlInternal.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> cancelFocusAndMetering() {
        return this.mCameraControlInternal.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCameraControlInternal.clearInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearZslConfig() {
        this.mCameraControlInternal.clearZslConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.mCameraControlInternal.decrementVideoUsage();
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> enableLowLightBoostAsync(boolean z11) {
        return this.mCameraControlInternal.enableLowLightBoostAsync(z11);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> enableTorch(boolean z11) {
        return this.mCameraControlInternal.enableTorch(z11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture<CameraCapturePipeline> getCameraCapturePipelineAsync(int i11, int i12) {
        return this.mCameraControlInternal.getCameraCapturePipelineAsync(i11, i12);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mCameraControlInternal.getFlashMode();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public CameraControlInternal getImplementation() {
        return this.mCameraControlInternal.getImplementation();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Config getInteropConfig() {
        return this.mCameraControlInternal.getInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public SessionConfig getSessionConfig() {
        return this.mCameraControlInternal.getSessionConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.mCameraControlInternal.incrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @VisibleForTesting
    public boolean isInVideoUsage() {
        return this.mCameraControlInternal.isInVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mCameraControlInternal.isZslDisabledByByUserCaseConfig();
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Integer> setExposureCompensationIndex(int i11) {
        return this.mCameraControlInternal.setExposureCompensationIndex(i11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i11) {
        this.mCameraControlInternal.setFlashMode(i11);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> setLinearZoom(float f11) {
        return this.mCameraControlInternal.setLinearZoom(f11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this.mCameraControlInternal.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> setTorchStrengthLevel(@IntRange(from = 1) int i11) {
        return this.mCameraControlInternal.setTorchStrengthLevel(i11);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> setZoomRatio(float f11) {
        return this.mCameraControlInternal.setZoomRatio(f11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z11) {
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(z11);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        return this.mCameraControlInternal.startFocusAndMetering(focusMeteringAction);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i11, int i12) {
        return this.mCameraControlInternal.submitStillCaptureRequests(list, i11, i12);
    }

    public ForwardingCameraControl(CameraControlInternal cameraControlInternal) {
        this.mCameraControlInternal = cameraControlInternal;
    }
}
