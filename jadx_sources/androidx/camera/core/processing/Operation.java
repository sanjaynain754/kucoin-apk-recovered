package androidx.camera.core.processing;

import androidx.annotation.WorkerThread;
import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes23.dex */
public interface Operation<I, O> {
    @WorkerThread
    O apply(I i11) throws ImageCaptureException;
}
