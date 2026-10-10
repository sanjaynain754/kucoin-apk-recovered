package androidx.camera.core.imagecapture;

import androidx.annotation.MainThread;
import androidx.camera.core.impl.CaptureConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface ImageCaptureControl {
    @MainThread
    void lockFlashMode();

    @MainThread
    ListenableFuture<Void> submitStillCaptureRequests(List<CaptureConfig> list);

    @MainThread
    void unlockFlashMode();
}
