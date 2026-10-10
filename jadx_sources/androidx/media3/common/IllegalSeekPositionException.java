package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i11, long j11) {
        this.timeline = timeline;
        this.windowIndex = i11;
        this.positionMs = j11;
    }
}
