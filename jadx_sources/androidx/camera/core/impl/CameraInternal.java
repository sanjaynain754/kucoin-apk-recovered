package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraInternal extends Camera, UseCase.StateChangeCallback {

    public enum State {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }

        State(boolean z11) {
            this.mHoldsCameraSlot = z11;
        }
    }

    void attachUseCases(Collection<UseCase> collection);

    void close();

    void detachUseCases(Collection<UseCase> collection);

    CameraControlInternal getCameraControlInternal();

    CameraInfoInternal getCameraInfoInternal();

    Observable<State> getCameraState();

    default boolean getHasTransform() {
        return true;
    }

    void open();

    ListenableFuture<Void> release();

    @Override // androidx.camera.core.Camera
    default CameraControl getCameraControl() {
        return getCameraControlInternal();
    }

    @Override // androidx.camera.core.Camera
    default CameraInfo getCameraInfo() {
        return getCameraInfoInternal();
    }

    @Override // androidx.camera.core.Camera
    default CameraConfig getExtendedConfig() {
        return CameraConfigs.defaultConfig();
    }

    default boolean isFrontFacing() {
        if (getCameraInfo().getLensFacing() == 0) {
            return true;
        }
        return false;
    }

    default void onRemoved() {
    }

    default void setActiveResumingMode(boolean z11) {
    }

    default void setExtendedConfig(CameraConfig cameraConfig) {
    }

    default void setPrimary(boolean z11) {
    }
}
