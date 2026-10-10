package androidx.camera.core.impl;

import android.os.Handler;
import com.google.auto.value.AutoValue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class CameraThreadConfig {
    public abstract Executor getCameraExecutor();

    public abstract Handler getSchedulerHandler();

    public static CameraThreadConfig create(Executor executor, Handler handler) {
        return new AutoValue_CameraThreadConfig(executor, handler);
    }
}
