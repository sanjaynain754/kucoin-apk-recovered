package androidx.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j11, long j12, float f11);
    }

    void cancel();

    void download(@Nullable ProgressListener progressListener) throws InterruptedException, IOException;

    void remove();
}
