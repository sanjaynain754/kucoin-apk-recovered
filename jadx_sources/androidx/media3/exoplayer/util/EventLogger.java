package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
public class EventLogger implements AnalyticsListener {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final Timeline.Period period;
    private final long startTimeMs;
    private final String tag;
    private final Timeline.Window window;

    public EventLogger() {
        this(DEFAULT_TAG);
    }

    private static String getPlayWhenReadyChangeReasonString(int i11) {
        if (i11 == 1) {
            return "USER_REQUEST";
        }
        if (i11 == 2) {
            return "AUDIO_FOCUS_LOSS";
        }
        if (i11 == 3) {
            return "AUDIO_BECOMING_NOISY";
        }
        if (i11 != 4) {
            return i11 != 5 ? "?" : "END_OF_MEDIA_ITEM";
        }
        return "REMOTE";
    }

    private static String getStateString(int i11) {
        if (i11 == 1) {
            return "IDLE";
        }
        if (i11 == 2) {
            return "BUFFERING";
        }
        if (i11 != 3) {
            return i11 != 4 ? "?" : "ENDED";
        }
        return "READY";
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i11 = 0; i11 < metadata.length(); i11++) {
            logd(str + metadata.get(i11));
        }
    }

    @UnstableApi
    public void logd(String str) {
        Log.m2955d(this.tag, str);
    }

    @UnstableApi
    public void loge(String str) {
        Log.m2957e(this.tag, str);
    }

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger(String str) {
        this.tag = str;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    private static String getAudioTrackConfigString(AudioSink.AudioTrackConfig audioTrackConfig) {
        return audioTrackConfig.encoding + "," + audioTrackConfig.channelConfig + "," + audioTrackConfig.sampleRate + "," + audioTrackConfig.tunneling + "," + audioTrackConfig.offload + "," + audioTrackConfig.bufferSize;
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, @Nullable String str2, @Nullable Throwable th2) {
        String str3 = str + " [" + getEventTimeString(eventTime);
        if (th2 instanceof PlaybackException) {
            str3 = str3 + ", errorCode=" + ((PlaybackException) th2).getErrorCodeName();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String throwableString = Log.getThrowableString(th2);
        if (!TextUtils.isEmpty(throwableString)) {
            str3 = str3 + "\n  " + throwableString.replace(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\n  ") + '\n';
        }
        return str3 + "]";
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        String str = "window=" + eventTime.windowIndex;
        if (eventTime.mediaPeriodId != null) {
            str = str + ", period=" + eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid);
            if (eventTime.mediaPeriodId.isAd()) {
                str = (str + ", adGroup=" + eventTime.mediaPeriodId.adGroupIndex) + ", ad=" + eventTime.mediaPeriodId.adIndexInAdGroup;
            }
        }
        return "eventTime=" + getTimeString(eventTime.realtimeMs - this.startTimeMs) + ", mediaPos=" + getTimeString(eventTime.eventPlaybackPositionMs) + ", " + str;
    }

    private static String getMediaItemTransitionReasonString(int i11) {
        if (i11 == 0) {
            return "REPEAT";
        }
        if (i11 == 1) {
            return "AUTO";
        }
        if (i11 != 2) {
            return i11 != 3 ? "?" : "PLAYLIST_CHANGED";
        }
        return "SEEK";
    }

    private static String getPlaybackSuppressionReasonString(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return "NONE";
    }

    private static String getRepeatModeString(int i11) {
        if (i11 == 0) {
            return "OFF";
        }
        if (i11 != 1) {
            return i11 != 2 ? "?" : "ALL";
        }
        return "ONE";
    }

    private static String getTimelineChangeReasonString(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? "?" : "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(boolean z11) {
        return z11 ? "[X]" : "[ ]";
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str, null, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, @Nullable Throwable th2) {
        loge(getEventString(eventTime, str, null, th2));
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        logd(eventTime, "audioAttributes", audioAttributes.contentType + "," + audioAttributes.flags + "," + audioAttributes.usage + "," + audioAttributes.allowedCapturePolicy);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j11, long j12) {
        logd(eventTime, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "audioInputFormat", Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i11) {
        logd(eventTime, "audioSessionId", Integer.toString(i11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioTrackInitialized(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackInit", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioTrackReleased(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackReleased", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i11, long j11, long j12) {
        loge(eventTime, "audioTrackUnderrun", i11 + ", " + j11 + ", " + j12, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i11) {
        logd(eventTime, "drmSessionAcquired", "state=" + i11);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i11, long j11) {
        logd(eventTime, "droppedFrames", Integer.toString(i11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z11) {
        logd(eventTime, "loading", Boolean.toString(z11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z11) {
        logd(eventTime, "isPlaying", Boolean.toString(z11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z11) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, @Nullable MediaItem mediaItem, int i11) {
        logd("mediaItem [" + getEventTimeString(eventTime) + ", reason=" + getMediaItemTransitionReasonString(i11) + "]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        logd("metadata [" + getEventTimeString(eventTime));
        printMetadata(metadata, "  ");
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z11, int i11) {
        logd(eventTime, "playWhenReady", z11 + ", " + getPlayWhenReadyChangeReasonString(i11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("reason=");
        sb2.append(getDiscontinuityReasonString(i11));
        sb2.append(", PositionInfo:old [");
        sb2.append("mediaItem=");
        sb2.append(positionInfo.mediaItemIndex);
        sb2.append(", period=");
        sb2.append(positionInfo.periodIndex);
        sb2.append(", pos=");
        sb2.append(positionInfo.positionMs);
        if (positionInfo.adGroupIndex != -1) {
            sb2.append(", contentPos=");
            sb2.append(positionInfo.contentPositionMs);
            sb2.append(", adGroup=");
            sb2.append(positionInfo.adGroupIndex);
            sb2.append(", ad=");
            sb2.append(positionInfo.adIndexInAdGroup);
        }
        sb2.append("], PositionInfo:new [");
        sb2.append("mediaItem=");
        sb2.append(positionInfo2.mediaItemIndex);
        sb2.append(", period=");
        sb2.append(positionInfo2.periodIndex);
        sb2.append(", pos=");
        sb2.append(positionInfo2.positionMs);
        if (positionInfo2.adGroupIndex != -1) {
            sb2.append(", contentPos=");
            sb2.append(positionInfo2.contentPositionMs);
            sb2.append(", adGroup=");
            sb2.append(positionInfo2.adGroupIndex);
            sb2.append(", ad=");
            sb2.append(positionInfo2.adIndexInAdGroup);
        }
        sb2.append("]");
        logd(eventTime, "positionDiscontinuity", sb2.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onRendererReadyChanged(AnalyticsListener.EventTime eventTime, int i11, int i12, boolean z11) {
        logd(eventTime, "rendererReady", "rendererIndex=" + i11 + ", " + Util.getTrackTypeString(i12) + ", " + z11);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i11, int i12) {
        logd(eventTime, "surfaceSize", i11 + ", " + i12);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i11) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        logd("timeline [" + getEventTimeString(eventTime) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i11));
        for (int i12 = 0; i12 < Math.min(periodCount, 3); i12++) {
            eventTime.timeline.getPeriod(i12, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i13 = 0; i13 < Math.min(windowCount, 3); i13++) {
            eventTime.timeline.getWindow(i13, this.window);
            logd("  window [" + getTimeString(this.window.getDurationMs()) + ", seekable=" + this.window.isSeekable + ", dynamic=" + this.window.isDynamic + "]");
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        Metadata metadata;
        logd("tracks [" + getEventTimeString(eventTime));
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        for (int i11 = 0; i11 < groups.size(); i11++) {
            Tracks.Group group = groups.get(i11);
            logd("  group [");
            for (int i12 = 0; i12 < group.length; i12++) {
                logd("    " + getTrackStatusString(group.isTrackSelected(i12)) + " Track:" + i12 + ", " + Format.toLogString(group.getTrackFormat(i12)) + ", supported=" + Util.getFormatSupportString(group.getTrackSupport(i12)));
            }
            logd("  ]");
        }
        boolean z11 = false;
        for (int i13 = 0; !z11 && i13 < groups.size(); i13++) {
            Tracks.Group group2 = groups.get(i13);
            for (int i14 = 0; !z11 && i14 < group2.length; i14++) {
                if (group2.isTrackSelected(i14) && (metadata = group2.getTrackFormat(i14).metadata) != null && metadata.length() > 0) {
                    logd("  Metadata [");
                    printMetadata(metadata, "    ");
                    logd("  ]");
                    z11 = true;
                }
            }
        }
        logd("]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        logd(eventTime, "videoSize", videoSize.width + ", " + videoSize.height);
    }

    private static String getDiscontinuityReasonString(int i11) {
        switch (i11) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return "SKIP";
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return "?";
        }
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, @Nullable Throwable th2) {
        loge(getEventString(eventTime, str, str2, th2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i11) {
        logd(eventTime, "state", getStateString(i11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i11) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        loge(eventTime, "playerFailed", playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j11) {
        logd(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i11) {
        logd(eventTime, "repeatMode", getRepeatModeString(i11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z11) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z11) {
        logd(eventTime, "skipSilenceEnabled", Boolean.toString(z11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j11, long j12) {
        logd(eventTime, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "videoInputFormat", Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    @UnstableApi
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f11) {
        logd(eventTime, "volume", Float.toString(f11));
    }

    private static String getTimeString(long j11) {
        if (j11 == C2711C.TIME_UNSET) {
            return "?";
        }
        return TIME_FORMAT.format(j11 / 1000.0f);
    }

    @UnstableApi
    @Deprecated
    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector) {
        this(DEFAULT_TAG);
    }

    @UnstableApi
    @Deprecated
    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector, String str) {
        this(str);
    }
}
