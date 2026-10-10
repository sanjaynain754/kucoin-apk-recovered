package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;

/* JADX INFO: loaded from: classes23.dex */
public final class MainThreadAsyncHandler {
    private static volatile Handler sHandler;

    public static Handler getInstance() {
        if (sHandler != null) {
            return sHandler;
        }
        synchronized (MainThreadAsyncHandler.class) {
            try {
                if (sHandler == null) {
                    sHandler = HandlerCompat.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sHandler;
    }

    private MainThreadAsyncHandler() {
    }
}
