package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes23.dex */
public interface SurfaceProcessorInternal extends SurfaceProcessor {
    void release();

    default ListenableFuture<Void> snapshot(@IntRange(from = 0, m1553to = 100) int i11, @IntRange(from = 0, m1553to = 359) int i12) {
        return Futures.immediateFuture(null);
    }
}
