package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class WrappingMediaSource extends CompositeMediaSource<Void> {
    private static final Void CHILD_SOURCE_ID = null;
    protected final MediaSource mediaSource;

    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long getMediaTimeForChildMediaTime(long j11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return j11;
    }

    public int getWindowIndexForChildWindowIndex(int i11) {
        return i11;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        prepareSourceInternal();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        return this.mediaSource.createPeriod(mediaPeriodId, allocator, j11);
    }

    public final void disableChildSource() {
        disableChildSource(CHILD_SOURCE_ID);
    }

    public final void enableChildSource() {
        enableChildSource(CHILD_SOURCE_ID);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return this.mediaSource.getInitialTimeline();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean isSingleWindow() {
        return this.mediaSource.isSingleWindow();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(Void r11, MediaSource mediaSource, Timeline timeline) {
        onChildSourceInfoRefreshed(timeline);
    }

    public final void prepareChildSource() {
        prepareChildSource(CHILD_SOURCE_ID, this.mediaSource);
    }

    public final void releaseChildSource() {
        releaseChildSource(CHILD_SOURCE_ID);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        this.mediaSource.releasePeriod(mediaPeriod);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.mediaSource.updateMediaItem(mediaItem);
    }

    public WrappingMediaSource(MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public final MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void r11, MediaSource.MediaPeriodId mediaPeriodId) {
        return getMediaPeriodIdForChildMediaPeriodId(mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final long getMediaTimeForChildMediaTime(Void r11, long j11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return getMediaTimeForChildMediaTime(j11, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final int getWindowIndexForChildWindowIndex(Void r11, int i11) {
        return getWindowIndexForChildWindowIndex(i11);
    }

    public void onChildSourceInfoRefreshed(Timeline timeline) {
        refreshSourceInfo(timeline);
    }

    public void prepareSourceInternal() {
        prepareChildSource();
    }
}
