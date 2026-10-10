package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2711C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceFactory;
import androidx.media3.exoplayer.source.SinglePeriodTimeline;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class RtspMediaSource extends BaseMediaSource {
    public static final long DEFAULT_TIMEOUT_MS = 8000;
    private final boolean debugLoggingEnabled;

    @GuardedBy("this")
    private MediaItem mediaItem;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    private final SocketFactory socketFactory;
    private boolean timelineIsLive;
    private boolean timelineIsSeekable;
    private final Uri uri;
    private final String userAgent;
    private long timelineDurationUs = C2711C.TIME_UNSET;
    private boolean timelineIsPlaceholder = true;

    public static final class Factory implements MediaSourceFactory {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f3302a = 0;
        private boolean debugLoggingEnabled;
        private boolean forceUseRtpTcp;
        private long timeoutMs = 8000;
        private String userAgent = MediaLibraryInfo.VERSION_SLASHY;
        private SocketFactory socketFactory = SocketFactory.getDefault();

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{3};
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public RtspMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            return new RtspMediaSource(mediaItem, this.forceUseRtpTcp ? new TransferRtpDataChannelFactory(this.timeoutMs) : new UdpDataSourceRtpDataChannelFactory(this.timeoutMs), this.userAgent, this.socketFactory, this.debugLoggingEnabled);
        }

        @CanIgnoreReturnValue
        public Factory setDebugLoggingEnabled(boolean z11) {
            this.debugLoggingEnabled = z11;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setForceUseRtpTcp(boolean z11) {
            this.forceUseRtpTcp = z11;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setSocketFactory(SocketFactory socketFactory) {
            this.socketFactory = socketFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setTimeoutMs(@IntRange(from = 1) long j11) {
            Assertions.checkArgument(j11 > 0);
            this.timeoutMs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }
    }

    public static class RtspPlaybackException extends IOException {
        public RtspPlaybackException(String str) {
            super(str);
        }

        public RtspPlaybackException(Throwable th2) {
            super(th2);
        }

        public RtspPlaybackException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    public static final class RtspUdpUnsupportedTransportException extends RtspPlaybackException {
        public RtspUdpUnsupportedTransportException(String str) {
            super(str);
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer.rtsp");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySourceInfoRefreshed() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.timelineDurationUs, this.timelineIsSeekable, false, this.timelineIsLive, (Object) null, getMediaItem());
        if (this.timelineIsPlaceholder) {
            singlePeriodTimeline = new ForwardingTimeline(singlePeriodTimeline) { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource.2
                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
                    super.getPeriod(i11, period, z11);
                    period.isPlaceholder = true;
                    return period;
                }

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
                    super.getWindow(i11, window, j11);
                    window.isPlaceholder = true;
                    return window;
                }
            };
        }
        refreshSourceInfo(singlePeriodTimeline);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        return localConfiguration != null && localConfiguration.uri.equals(this.uri);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        return new RtspMediaPeriod(allocator, this.rtpDataChannelFactory, this.uri, new RtspMediaPeriod.Listener() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource.1
            @Override // androidx.media3.exoplayer.rtsp.RtspMediaPeriod.Listener
            public void onSeekingUnsupported() {
                RtspMediaSource.this.timelineIsSeekable = false;
                RtspMediaSource.this.notifySourceInfoRefreshed();
            }

            @Override // androidx.media3.exoplayer.rtsp.RtspMediaPeriod.Listener
            public void onSourceInfoRefreshed(RtspSessionTiming rtspSessionTiming) {
                RtspMediaSource.this.timelineDurationUs = Util.msToUs(rtspSessionTiming.getDurationMs());
                RtspMediaSource.this.timelineIsSeekable = !rtspSessionTiming.isLive();
                RtspMediaSource.this.timelineIsLive = rtspSessionTiming.isLive();
                RtspMediaSource.this.timelineIsPlaceholder = false;
                RtspMediaSource.this.notifySourceInfoRefreshed();
            }
        }, this.userAgent, this.socketFactory, this.debugLoggingEnabled);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((RtspMediaPeriod) mediaPeriod).release();
    }

    @VisibleForTesting
    public RtspMediaSource(MediaItem mediaItem, RtpDataChannel.Factory factory, String str, SocketFactory socketFactory, boolean z11) {
        this.mediaItem = mediaItem;
        this.rtpDataChannelFactory = factory;
        this.userAgent = str;
        this.uri = ((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri;
        this.socketFactory = socketFactory;
        this.debugLoggingEnabled = z11;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        notifySourceInfoRefreshed();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }
}
