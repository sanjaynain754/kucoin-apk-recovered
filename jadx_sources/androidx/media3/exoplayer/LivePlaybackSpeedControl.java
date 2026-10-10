package androidx.media3.exoplayer;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long j11, long j12);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration);

    void setTargetLiveOffsetOverrideUs(long j11);
}
