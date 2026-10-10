package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface SpeedProvider {
    long getNextSpeedChangeTimeUs(long j11);

    float getSpeed(long j11);
}
