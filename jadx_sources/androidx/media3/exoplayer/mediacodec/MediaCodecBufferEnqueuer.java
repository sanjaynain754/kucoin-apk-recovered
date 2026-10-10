package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

/* JADX INFO: loaded from: classes34.dex */
interface MediaCodecBufferEnqueuer {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void queueSecureInputBuffer(int i11, int i12, CryptoInfo cryptoInfo, long j11, int i13);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();

    void waitUntilQueueingComplete() throws InterruptedException;
}
