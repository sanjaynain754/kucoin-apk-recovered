package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ServiceDescriptionElement {
    public final long maxOffsetMs;
    public final float maxPlaybackSpeed;
    public final long minOffsetMs;
    public final float minPlaybackSpeed;
    public final long targetOffsetMs;

    public ServiceDescriptionElement(long j11, long j12, long j13, float f11, float f12) {
        this.targetOffsetMs = j11;
        this.minOffsetMs = j12;
        this.maxOffsetMs = j13;
        this.minPlaybackSpeed = f11;
        this.maxPlaybackSpeed = f12;
    }
}
