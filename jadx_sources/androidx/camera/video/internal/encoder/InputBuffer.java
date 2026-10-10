package androidx.camera.video.internal.encoder;

import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public interface InputBuffer {
    boolean cancel();

    ByteBuffer getByteBuffer();

    ListenableFuture<Void> getTerminationFuture();

    void setEndOfStream(boolean z11);

    void setPresentationTimeUs(long j11);

    boolean submit();
}
