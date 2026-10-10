package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes23.dex */
final class MainThreadExecutor {
    private static volatile ScheduledExecutorService sInstance;

    public static ScheduledExecutorService getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (MainThreadExecutor.class) {
            try {
                if (sInstance == null) {
                    sInstance = new HandlerScheduledExecutorService(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sInstance;
    }

    private MainThreadExecutor() {
    }
}
