package androidx.media3.exoplayer.analytics;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.exception.hashCode();
        }

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }
    }

    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;

        @Nullable
        public final Format format;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTimeAndFormat.class == obj.getClass()) {
                EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
                if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                    return false;
                }
                Format format = this.format;
                Format format2 = eventTimeAndFormat.format;
                if (format != null) {
                    return format.equals(format2);
                }
                if (format2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.eventTime.hashCode() * 31;
            Format format = this.format;
            return iHashCode + (format != null ? format.hashCode() : 0);
        }

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }
    }

    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i11) {
            this.eventTime = eventTime;
            this.playbackState = i11;
        }
    }

    public PlaybackStats(int i11, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j11, int i12, int i13, int i14, int i15, long j12, int i16, int i17, int i18, int i19, int i21, long j13, int i22, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j14, long j15, long j16, long j17, long j18, long j19, int i23, int i24, int i25, long j21, int i26, long j22, long j23, long j24, long j25, long j26, int i27, int i28, int i29, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i11;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j11;
        this.foregroundPlaybackCount = i12;
        this.abandonedBeforeReadyCount = i13;
        this.endedCount = i14;
        this.backgroundJoiningCount = i15;
        this.totalValidJoinTimeMs = j12;
        this.validJoinTimeCount = i16;
        this.totalPauseCount = i17;
        this.totalPauseBufferCount = i18;
        this.totalSeekCount = i19;
        this.totalRebufferCount = i21;
        this.maxRebufferTimeMs = j13;
        this.adPlaybackCount = i22;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j14;
        this.totalVideoFormatHeightTimeProduct = j15;
        this.totalVideoFormatBitrateTimeMs = j16;
        this.totalVideoFormatBitrateTimeProduct = j17;
        this.totalAudioFormatTimeMs = j18;
        this.totalAudioFormatBitrateTimeProduct = j19;
        this.initialVideoFormatHeightCount = i23;
        this.initialVideoFormatBitrateCount = i24;
        this.totalInitialVideoFormatHeight = i25;
        this.totalInitialVideoFormatBitrate = j21;
        this.initialAudioFormatBitrateCount = i26;
        this.totalInitialAudioFormatBitrate = j22;
        this.totalBandwidthTimeMs = j23;
        this.totalBandwidthBytes = j24;
        this.totalDroppedFrames = j25;
        this.totalAudioUnderruns = j26;
        this.fatalErrorPlaybackCount = i27;
        this.fatalErrorCount = i28;
        this.nonFatalErrorCount = i29;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(4) + getPlaybackStateDurationMs(7);
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(2) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(5);
    }

    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
        PlaybackStats[] playbackStatsArr2 = playbackStatsArr;
        int i11 = 16;
        long[] jArr = new long[16];
        int length = playbackStatsArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j21 = 0;
        long j22 = -1;
        long j23 = -1;
        long j24 = -1;
        long jMax = C2711C.TIME_UNSET;
        int i28 = -1;
        long jMin = C2711C.TIME_UNSET;
        long j25 = C2711C.TIME_UNSET;
        int i29 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i29 < length) {
            long j26 = j22;
            PlaybackStats playbackStats = playbackStatsArr2[i29];
            i12 += playbackStats.playbackCount;
            int i33 = 0;
            while (i33 < i11) {
                jArr[i33] = jArr[i33] + playbackStats.playbackStateDurationsMs[i33];
                i33++;
                i11 = 16;
            }
            if (jMin == C2711C.TIME_UNSET) {
                jMin = playbackStats.firstReportedTimeMs;
            } else {
                long j27 = playbackStats.firstReportedTimeMs;
                if (j27 != C2711C.TIME_UNSET) {
                    jMin = Math.min(jMin, j27);
                }
            }
            i13 += playbackStats.foregroundPlaybackCount;
            i31 += playbackStats.abandonedBeforeReadyCount;
            i32 += playbackStats.endedCount;
            i14 += playbackStats.backgroundJoiningCount;
            if (j25 == C2711C.TIME_UNSET) {
                j25 = playbackStats.totalValidJoinTimeMs;
            } else {
                long j28 = playbackStats.totalValidJoinTimeMs;
                if (j28 != C2711C.TIME_UNSET) {
                    j25 += j28;
                }
            }
            i15 += playbackStats.validJoinTimeCount;
            i16 += playbackStats.totalPauseCount;
            i17 += playbackStats.totalPauseBufferCount;
            i18 += playbackStats.totalSeekCount;
            i19 += playbackStats.totalRebufferCount;
            if (jMax == C2711C.TIME_UNSET) {
                jMax = playbackStats.maxRebufferTimeMs;
            } else {
                long j29 = playbackStats.maxRebufferTimeMs;
                if (j29 != C2711C.TIME_UNSET) {
                    jMax = Math.max(jMax, j29);
                }
            }
            i21 += playbackStats.adPlaybackCount;
            j11 += playbackStats.totalVideoFormatHeightTimeMs;
            j12 += playbackStats.totalVideoFormatHeightTimeProduct;
            j13 += playbackStats.totalVideoFormatBitrateTimeMs;
            j14 += playbackStats.totalVideoFormatBitrateTimeProduct;
            j15 += playbackStats.totalAudioFormatTimeMs;
            j16 += playbackStats.totalAudioFormatBitrateTimeProduct;
            i22 += playbackStats.initialVideoFormatHeightCount;
            i23 += playbackStats.initialVideoFormatBitrateCount;
            if (i28 == -1) {
                i28 = playbackStats.totalInitialVideoFormatHeight;
            } else {
                int i34 = playbackStats.totalInitialVideoFormatHeight;
                if (i34 != -1) {
                    i28 += i34;
                }
            }
            if (j23 == j26) {
                j23 = playbackStats.totalInitialVideoFormatBitrate;
            } else {
                long j31 = playbackStats.totalInitialVideoFormatBitrate;
                if (j31 != j26) {
                    j23 += j31;
                }
            }
            i24 += playbackStats.initialAudioFormatBitrateCount;
            if (j24 == j26) {
                j24 = playbackStats.totalInitialAudioFormatBitrate;
            } else {
                long j32 = playbackStats.totalInitialAudioFormatBitrate;
                if (j32 != j26) {
                    j24 += j32;
                }
            }
            j17 += playbackStats.totalBandwidthTimeMs;
            j18 += playbackStats.totalBandwidthBytes;
            j19 += playbackStats.totalDroppedFrames;
            j21 += playbackStats.totalAudioUnderruns;
            i25 += playbackStats.fatalErrorPlaybackCount;
            i26 += playbackStats.fatalErrorCount;
            i27 += playbackStats.nonFatalErrorCount;
            i29++;
            playbackStatsArr2 = playbackStatsArr;
            j22 = j26;
            i11 = 16;
        }
        long j33 = jMax;
        List list = Collections.EMPTY_LIST;
        return new PlaybackStats(i12, jArr, list, list, jMin, i13, i31, i32, i14, j25, i15, i16, i17, i18, i19, j33, i21, list, list, j11, j12, j13, j14, j15, j16, i22, i23, i28, j23, i24, j24, j17, j18, j19, j21, i25, i26, i27, list, list);
    }

    public float getAbandonedBeforeReadyRatio() {
        int i11 = this.abandonedBeforeReadyCount;
        int i12 = this.playbackCount;
        int i13 = this.foregroundPlaybackCount;
        int i14 = i11 - (i12 - i13);
        if (i13 == 0) {
            return 0.0f;
        }
        return i14 / i13;
    }

    public float getEndedRatio() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.endedCount / i11;
    }

    public float getFatalErrorRatio() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.fatalErrorPlaybackCount / i11;
    }

    public int getMeanAudioFormatBitrate() {
        long j11 = this.totalAudioFormatTimeMs;
        if (j11 == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j11);
    }

    public int getMeanBandwidth() {
        long j11 = this.totalBandwidthTimeMs;
        if (j11 == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * 8000) / j11);
    }

    public long getMeanElapsedTimeMs() {
        return this.playbackCount == 0 ? C2711C.TIME_UNSET : getTotalElapsedTimeMs() / ((long) this.playbackCount);
    }

    public int getMeanInitialAudioFormatBitrate() {
        int i11 = this.initialAudioFormatBitrateCount;
        if (i11 == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / ((long) i11));
    }

    public int getMeanInitialVideoFormatBitrate() {
        int i11 = this.initialVideoFormatBitrateCount;
        if (i11 == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / ((long) i11));
    }

    public int getMeanInitialVideoFormatHeight() {
        int i11 = this.initialVideoFormatHeightCount;
        if (i11 == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i11;
    }

    public long getMeanJoinTimeMs() {
        int i11 = this.validJoinTimeCount;
        return i11 == 0 ? C2711C.TIME_UNSET : this.totalValidJoinTimeMs / ((long) i11);
    }

    public float getMeanNonFatalErrorCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.nonFatalErrorCount / i11;
    }

    public float getMeanPauseBufferCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.totalPauseBufferCount / i11;
    }

    public float getMeanPauseCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.totalPauseCount / i11;
    }

    public long getMeanPausedTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C2711C.TIME_UNSET : getTotalPausedTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayAndWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C2711C.TIME_UNSET : getTotalPlayAndWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C2711C.TIME_UNSET : getTotalPlayTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanRebufferCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.totalRebufferCount / i11;
    }

    public long getMeanRebufferTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C2711C.TIME_UNSET : getTotalRebufferTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanSeekCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.totalSeekCount / i11;
    }

    public long getMeanSeekTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C2711C.TIME_UNSET : getTotalSeekTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanSingleRebufferTimeMs() {
        return this.totalRebufferCount == 0 ? C2711C.TIME_UNSET : (getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(7)) / ((long) this.totalRebufferCount);
    }

    public long getMeanSingleSeekTimeMs() {
        return this.totalSeekCount == 0 ? C2711C.TIME_UNSET : getTotalSeekTimeMs() / ((long) this.totalSeekCount);
    }

    public float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }

    public float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public int getMeanVideoFormatBitrate() {
        long j11 = this.totalVideoFormatBitrateTimeMs;
        if (j11 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j11);
    }

    public int getMeanVideoFormatHeight() {
        long j11 = this.totalVideoFormatHeightTimeMs;
        if (j11 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j11);
    }

    public long getMeanWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C2711C.TIME_UNSET : getTotalWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMediaTimeMsAtRealtimeMs(long j11) {
        if (this.mediaTimeHistory.isEmpty()) {
            return C2711C.TIME_UNSET;
        }
        int i11 = 0;
        while (i11 < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i11)[0] <= j11) {
            i11++;
        }
        if (i11 == 0) {
            return this.mediaTimeHistory.get(0)[1];
        }
        if (i11 == this.mediaTimeHistory.size()) {
            List<long[]> list = this.mediaTimeHistory;
            return list.get(list.size() - 1)[1];
        }
        int i12 = i11 - 1;
        long j12 = this.mediaTimeHistory.get(i12)[0];
        long j13 = this.mediaTimeHistory.get(i12)[1];
        long j14 = this.mediaTimeHistory.get(i11)[0];
        long j15 = this.mediaTimeHistory.get(i11)[1];
        long j16 = j14 - j12;
        if (j16 == 0) {
            return j13;
        }
        return j13 + ((long) ((j15 - j13) * ((j11 - j12) / j16)));
    }

    public int getPlaybackStateAtTime(long j11) {
        int i11 = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j11) {
                break;
            }
            i11 = eventTimeAndPlaybackState.playbackState;
        }
        return i11;
    }

    public long getPlaybackStateDurationMs(int i11) {
        return this.playbackStateDurationsMs[i11];
    }

    public long getTotalElapsedTimeMs() {
        long j11 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            j11 += this.playbackStateDurationsMs[i11];
        }
        return j11;
    }

    public float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalAudioUnderruns * 1000.0f) / totalPlayTimeMs;
    }

    public float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalDroppedFrames * 1000.0f) / totalPlayTimeMs;
    }

    public float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.fatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalJoinTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.nonFatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalRebufferCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalRebufferTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalSeekTimeMs() / totalPlayAndWaitTimeMs;
    }

    public long getTotalPlayAndWaitTimeMs() {
        return getTotalPlayTimeMs() + getTotalWaitTimeMs();
    }

    public float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalWaitTimeMs() / totalPlayAndWaitTimeMs;
    }
}
