package androidx.camera.core.impl;

import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraControlInternal extends CameraControl {
    public static final CameraControlInternal DEFAULT_EMPTY_INSTANCE = new CameraControlInternal() { // from class: androidx.camera.core.impl.CameraControlInternal.2
        @Override // androidx.camera.core.CameraControl
        public ListenableFuture<Void> cancelFocusAndMetering() {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public ListenableFuture<Void> enableTorch(boolean z11) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public int getFlashMode() {
            return 2;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public Config getInteropConfig() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public boolean isZslDisabledByByUserCaseConfig() {
            return false;
        }

        @Override // androidx.camera.core.CameraControl
        public ListenableFuture<Integer> setExposureCompensationIndex(int i11) {
            return Futures.immediateFuture(0);
        }

        @Override // androidx.camera.core.CameraControl
        public ListenableFuture<Void> setLinearZoom(float f11) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public ListenableFuture<Void> setZoomRatio(float f11) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public ListenableFuture<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i11, int i12) {
            return Futures.immediateFuture(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public SessionConfig getSessionConfig() {
            return SessionConfig.defaultEmptySessionConfig();
        }

        @Override // androidx.camera.core.CameraControl
        public ListenableFuture<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
            return Futures.immediateFuture(FocusMeteringResult.emptyInstance());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearInteropConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearZslConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addInteropConfig(Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addZslConfig(SessionConfig.Builder builder) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setFlashMode(int i11) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setZslDisabledByUserCaseConfig(boolean z11) {
        }
    };

    public static final class CameraControlException extends Exception {
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        public CameraCaptureFailure getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure, Throwable th2) {
            super(th2);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }

    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(List<CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(Config config);

    void addZslConfig(SessionConfig.Builder builder);

    void clearInteropConfig();

    void clearZslConfig();

    int getFlashMode();

    Config getInteropConfig();

    SessionConfig getSessionConfig();

    @VisibleForTesting
    default boolean isInVideoUsage() {
        return false;
    }

    boolean isZslDisabledByByUserCaseConfig();

    void setFlashMode(int i11);

    void setZslDisabledByUserCaseConfig(boolean z11);

    ListenableFuture<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i11, int i12);

    default ListenableFuture<CameraCapturePipeline> getCameraCapturePipelineAsync(int i11, int i12) {
        return Futures.immediateFuture(new CameraCapturePipeline() { // from class: androidx.camera.core.impl.CameraControlInternal.1
            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public ListenableFuture<Void> invokePostCapture() {
                return Futures.immediateFuture(null);
            }

            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public ListenableFuture<Void> invokePreCapture() {
                return Futures.immediateFuture(null);
            }
        });
    }

    default void decrementVideoUsage() {
    }

    default CameraControlInternal getImplementation() {
        return this;
    }

    default void incrementVideoUsage() {
    }

    default void setLowLightBoostDisabledByUseCaseSessionConfig(boolean z11) {
    }

    default void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
    }
}
