package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {
    private final MediaItem updatedMediaItem;

    public TimelineWithUpdatedMediaItem(Timeline timeline, MediaItem mediaItem) {
        super(timeline);
        this.updatedMediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
        Object obj;
        super.getWindow(i11, window, j11);
        MediaItem mediaItem = this.updatedMediaItem;
        window.mediaItem = mediaItem;
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration != null) {
            obj = localConfiguration.tag;
        } else {
            obj = null;
        }
        window.tag = obj;
        return window;
    }
}
