package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_CameraThreadConfig extends CameraThreadConfig {
    private final Executor cameraExecutor;
    private final Handler schedulerHandler;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraThreadConfig) {
            CameraThreadConfig cameraThreadConfig = (CameraThreadConfig) obj;
            if (this.cameraExecutor.equals(cameraThreadConfig.getCameraExecutor()) && this.schedulerHandler.equals(cameraThreadConfig.getSchedulerHandler())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public Executor getCameraExecutor() {
        return this.cameraExecutor;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public Handler getSchedulerHandler() {
        return this.schedulerHandler;
    }

    public int hashCode() {
        return ((this.cameraExecutor.hashCode() ^ 1000003) * 1000003) ^ this.schedulerHandler.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.cameraExecutor + ", schedulerHandler=" + this.schedulerHandler + "}";
    }

    public AutoValue_CameraThreadConfig(Executor executor, Handler handler) {
        if (executor != null) {
            this.cameraExecutor = executor;
            if (handler != null) {
                this.schedulerHandler = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }
}
