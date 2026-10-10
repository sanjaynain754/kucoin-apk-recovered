package androidx.media3.common;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class SimpleBasePlayer extends BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final HandlerWrapper applicationHandler;
    private final Looper applicationLooper;
    private final ListenerSet<Player.Listener> listeners;
    private final HashSet<ListenableFuture<?>> pendingOperations;
    private final Timeline.Period period;
    private boolean released;
    private State state;

    public static final class MediaItemData {
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;

        @Nullable
        public final MediaItem.LiveConfiguration liveConfiguration;

        @Nullable
        public final Object manifest;
        public final MediaItem mediaItem;

        @Nullable
        public final MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final ImmutableList<PeriodData> periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final Tracks tracks;
        public final Object uid;
        public final long windowStartTimeMs;

        public static final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;

            @Nullable
            private MediaItem.LiveConfiguration liveConfiguration;

            @Nullable
            private Object manifest;
            private MediaItem mediaItem;

            @Nullable
            private MediaMetadata mediaMetadata;
            private ImmutableList<PeriodData> periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private Tracks tracks;
            private Object uid;
            private long windowStartTimeMs;

            public Builder(Object obj) {
                this.uid = obj;
                this.tracks = Tracks.EMPTY;
                this.mediaItem = MediaItem.EMPTY;
                this.mediaMetadata = null;
                this.manifest = null;
                this.liveConfiguration = null;
                this.presentationStartTimeMs = C2711C.TIME_UNSET;
                this.windowStartTimeMs = C2711C.TIME_UNSET;
                this.elapsedRealtimeEpochOffsetMs = C2711C.TIME_UNSET;
                this.isSeekable = false;
                this.isDynamic = false;
                this.defaultPositionUs = 0L;
                this.durationUs = C2711C.TIME_UNSET;
                this.positionInFirstPeriodUs = 0L;
                this.isPlaceholder = false;
                this.periods = ImmutableList.m13439of();
            }

            public MediaItemData build() {
                return new MediaItemData(this);
            }

            @CanIgnoreReturnValue
            public Builder setDefaultPositionUs(long j11) {
                Assertions.checkArgument(j11 >= 0);
                this.defaultPositionUs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setElapsedRealtimeEpochOffsetMs(long j11) {
                this.elapsedRealtimeEpochOffsetMs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsDynamic(boolean z11) {
                this.isDynamic = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsPlaceholder(boolean z11) {
                this.isPlaceholder = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsSeekable(boolean z11) {
                this.isSeekable = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLiveConfiguration(@Nullable MediaItem.LiveConfiguration liveConfiguration) {
                this.liveConfiguration = liveConfiguration;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setManifest(@Nullable Object obj) {
                this.manifest = obj;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMediaItem(MediaItem mediaItem) {
                this.mediaItem = mediaItem;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMediaMetadata(@Nullable MediaMetadata mediaMetadata) {
                this.mediaMetadata = mediaMetadata;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPositionInFirstPeriodUs(long j11) {
                Assertions.checkArgument(j11 >= 0);
                this.positionInFirstPeriodUs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPresentationStartTimeMs(long j11) {
                this.presentationStartTimeMs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTracks(Tracks tracks) {
                this.tracks = tracks;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setWindowStartTimeMs(long j11) {
                this.windowStartTimeMs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPeriods(List<PeriodData> list) {
                boolean z11;
                int size = list.size();
                int i11 = 0;
                while (i11 < size - 1) {
                    if (list.get(i11).durationUs != C2711C.TIME_UNSET) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Assertions.checkArgument(z11, "Periods other than last need a duration");
                    int i12 = i11 + 1;
                    for (int i13 = i12; i13 < size; i13++) {
                        Assertions.checkArgument(!list.get(i11).uid.equals(list.get(i13).uid), "Duplicate PeriodData UIDs in period list");
                    }
                    i11 = i12;
                }
                this.periods = ImmutableList.copyOf((Collection) list);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDurationUs(long j11) {
                boolean z11;
                if (j11 != C2711C.TIME_UNSET && j11 < 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                Assertions.checkArgument(z11);
                this.durationUs = j11;
                return this;
            }

            private Builder(MediaItemData mediaItemData) {
                this.uid = mediaItemData.uid;
                this.tracks = mediaItemData.tracks;
                this.mediaItem = mediaItemData.mediaItem;
                this.mediaMetadata = mediaItemData.mediaMetadata;
                this.manifest = mediaItemData.manifest;
                this.liveConfiguration = mediaItemData.liveConfiguration;
                this.presentationStartTimeMs = mediaItemData.presentationStartTimeMs;
                this.windowStartTimeMs = mediaItemData.windowStartTimeMs;
                this.elapsedRealtimeEpochOffsetMs = mediaItemData.elapsedRealtimeEpochOffsetMs;
                this.isSeekable = mediaItemData.isSeekable;
                this.isDynamic = mediaItemData.isDynamic;
                this.defaultPositionUs = mediaItemData.defaultPositionUs;
                this.durationUs = mediaItemData.durationUs;
                this.positionInFirstPeriodUs = mediaItemData.positionInFirstPeriodUs;
                this.isPlaceholder = mediaItemData.isPlaceholder;
                this.periods = mediaItemData.periods;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemData)) {
                return false;
            }
            MediaItemData mediaItemData = (MediaItemData) obj;
            return this.uid.equals(mediaItemData.uid) && this.tracks.equals(mediaItemData.tracks) && this.mediaItem.equals(mediaItemData.mediaItem) && Util.areEqual(this.mediaMetadata, mediaItemData.mediaMetadata) && Util.areEqual(this.manifest, mediaItemData.manifest) && Util.areEqual(this.liveConfiguration, mediaItemData.liveConfiguration) && this.presentationStartTimeMs == mediaItemData.presentationStartTimeMs && this.windowStartTimeMs == mediaItemData.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == mediaItemData.elapsedRealtimeEpochOffsetMs && this.isSeekable == mediaItemData.isSeekable && this.isDynamic == mediaItemData.isDynamic && this.defaultPositionUs == mediaItemData.defaultPositionUs && this.durationUs == mediaItemData.durationUs && this.positionInFirstPeriodUs == mediaItemData.positionInFirstPeriodUs && this.isPlaceholder == mediaItemData.isPlaceholder && this.periods.equals(mediaItemData.periods);
        }

        private MediaItemData(Builder builder) {
            int i11 = 0;
            if (builder.liveConfiguration == null) {
                Assertions.checkArgument(builder.presentationStartTimeMs == C2711C.TIME_UNSET, "presentationStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.windowStartTimeMs == C2711C.TIME_UNSET, "windowStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.elapsedRealtimeEpochOffsetMs == C2711C.TIME_UNSET, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (builder.presentationStartTimeMs != C2711C.TIME_UNSET && builder.windowStartTimeMs != C2711C.TIME_UNSET) {
                Assertions.checkArgument(builder.windowStartTimeMs >= builder.presentationStartTimeMs, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = builder.periods.size();
            if (builder.durationUs != C2711C.TIME_UNSET) {
                Assertions.checkArgument(builder.defaultPositionUs <= builder.durationUs, "defaultPositionUs can't be greater than durationUs");
            }
            this.uid = builder.uid;
            this.tracks = builder.tracks;
            this.mediaItem = builder.mediaItem;
            this.mediaMetadata = builder.mediaMetadata;
            this.manifest = builder.manifest;
            this.liveConfiguration = builder.liveConfiguration;
            this.presentationStartTimeMs = builder.presentationStartTimeMs;
            this.windowStartTimeMs = builder.windowStartTimeMs;
            this.elapsedRealtimeEpochOffsetMs = builder.elapsedRealtimeEpochOffsetMs;
            this.isSeekable = builder.isSeekable;
            this.isDynamic = builder.isDynamic;
            this.defaultPositionUs = builder.defaultPositionUs;
            this.durationUs = builder.durationUs;
            long j11 = builder.positionInFirstPeriodUs;
            this.positionInFirstPeriodUs = j11;
            this.isPlaceholder = builder.isPlaceholder;
            ImmutableList<PeriodData> immutableList = builder.periods;
            this.periods = immutableList;
            long[] jArr = new long[immutableList.size()];
            this.periodPositionInWindowUs = jArr;
            if (immutableList.isEmpty()) {
                return;
            }
            jArr[0] = -j11;
            while (i11 < size - 1) {
                long[] jArr2 = this.periodPositionInWindowUs;
                int i12 = i11 + 1;
                jArr2[i12] = jArr2[i11] + this.periods.get(i11).durationUs;
                i11 = i12;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Period getPeriod(int i11, int i12, Timeline.Period period) {
            if (this.periods.isEmpty()) {
                Object obj = this.uid;
                period.set(obj, obj, i11, this.positionInFirstPeriodUs + this.durationUs, 0L, AdPlaybackState.NONE, this.isPlaceholder);
                return period;
            }
            PeriodData periodData = this.periods.get(i12);
            Object obj2 = periodData.uid;
            period.set(obj2, Pair.create(this.uid, obj2), i11, periodData.durationUs, this.periodPositionInWindowUs[i12], periodData.adPlaybackState, periodData.isPlaceholder);
            return period;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getPeriodUid(int i11) {
            if (this.periods.isEmpty()) {
                return this.uid;
            }
            return Pair.create(this.uid, this.periods.get(i11).uid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Window getWindow(int i11, Timeline.Window window) {
            int size;
            boolean z11;
            if (this.periods.isEmpty()) {
                size = 1;
                z11 = true;
            } else {
                size = this.periods.size();
                z11 = true;
            }
            window.set(this.uid, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, this.defaultPositionUs, this.durationUs, i11, (i11 + size) - 1, this.positionInFirstPeriodUs);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public int hashCode() {
            int iHashCode = (((((217 + this.uid.hashCode()) * 31) + this.tracks.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            MediaMetadata mediaMetadata = this.mediaMetadata;
            int iHashCode2 = (iHashCode + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
            Object obj = this.manifest;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode4 = (iHashCode3 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j11 = this.presentationStartTimeMs;
            int i11 = (iHashCode4 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.windowStartTimeMs;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.elapsedRealtimeEpochOffsetMs;
            int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31;
            long j14 = this.defaultPositionUs;
            int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.durationUs;
            int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
            long j16 = this.positionInFirstPeriodUs;
            return ((((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.periods.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MediaItemData buildFromState(State state, int i11, Timeline.Period period, Timeline.Window window) {
            boolean z11;
            MediaMetadata mediaMetadata;
            Tracks tracks;
            if (SimpleBasePlayer.getCurrentMediaItemIndexInternal(state) == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            state.timeline.getWindow(i11, window);
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i12 = window.firstPeriodIndex; i12 <= window.lastPeriodIndex; i12++) {
                state.timeline.getPeriod(i12, period, true);
                builder.add(new PeriodData.Builder(Assertions.checkNotNull(period.uid)).setAdPlaybackState(period.adPlaybackState).setDurationUs(period.durationUs).setIsPlaceholder(period.isPlaceholder).build());
            }
            Builder mediaItem = new Builder(window.uid).setDefaultPositionUs(window.defaultPositionUs).setDurationUs(window.durationUs).setElapsedRealtimeEpochOffsetMs(window.elapsedRealtimeEpochOffsetMs).setIsDynamic(window.isDynamic).setIsPlaceholder(window.isPlaceholder).setIsSeekable(window.isSeekable).setLiveConfiguration(window.liveConfiguration).setManifest(window.manifest).setMediaItem(window.mediaItem);
            if (z11) {
                mediaMetadata = state.currentMetadata;
            } else {
                mediaMetadata = null;
            }
            Builder presentationStartTimeMs = mediaItem.setMediaMetadata(mediaMetadata).setPeriods(builder.build()).setPositionInFirstPeriodUs(window.positionInFirstPeriodUs).setPresentationStartTimeMs(window.presentationStartTimeMs);
            if (z11) {
                tracks = state.currentTracks;
            } else {
                tracks = Tracks.EMPTY;
            }
            return presentationStartTimeMs.setTracks(tracks).setWindowStartTimeMs(window.windowStartTimeMs).build();
        }
    }

    public static final class PeriodData {
        public final AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final Object uid;

        public static final class Builder {
            private AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private Object uid;

            public Builder(Object obj) {
                this.uid = obj;
                this.durationUs = 0L;
                this.adPlaybackState = AdPlaybackState.NONE;
                this.isPlaceholder = false;
            }

            public PeriodData build() {
                return new PeriodData(this);
            }

            @CanIgnoreReturnValue
            public Builder setAdPlaybackState(AdPlaybackState adPlaybackState) {
                this.adPlaybackState = adPlaybackState;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsPlaceholder(boolean z11) {
                this.isPlaceholder = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDurationUs(long j11) {
                boolean z11;
                if (j11 != C2711C.TIME_UNSET && j11 < 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                Assertions.checkArgument(z11);
                this.durationUs = j11;
                return this;
            }

            private Builder(PeriodData periodData) {
                this.uid = periodData.uid;
                this.durationUs = periodData.durationUs;
                this.adPlaybackState = periodData.adPlaybackState;
                this.isPlaceholder = periodData.isPlaceholder;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodData)) {
                return false;
            }
            PeriodData periodData = (PeriodData) obj;
            return this.uid.equals(periodData.uid) && this.durationUs == periodData.durationUs && this.adPlaybackState.equals(periodData.adPlaybackState) && this.isPlaceholder == periodData.isPlaceholder;
        }

        private PeriodData(Builder builder) {
            this.uid = builder.uid;
            this.durationUs = builder.durationUs;
            this.adPlaybackState = builder.adPlaybackState;
            this.isPlaceholder = builder.isPlaceholder;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public int hashCode() {
            int iHashCode = (217 + this.uid.hashCode()) * 31;
            long j11 = this.durationUs;
            return ((((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.adPlaybackState.hashCode()) * 31) + (this.isPlaceholder ? 1 : 0);
        }
    }

    public static final class PlaceholderUid {
        private PlaceholderUid() {
        }
    }

    public static final class PlaylistTimeline extends Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final HashMap<Object, Integer> periodIndexByUid;
        private final ImmutableList<MediaItemData> playlist;
        private final int[] windowIndexByPeriodIndex;

        private static int getPeriodCountInMediaItem(MediaItemData mediaItemData) {
            if (mediaItemData.periods.isEmpty()) {
                return 1;
            }
            return mediaItemData.periods.size();
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            Integer num = this.periodIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
            int i12 = this.windowIndexByPeriodIndex[i11];
            return this.playlist.get(i12).getPeriod(i12, i11 - this.firstPeriodIndexByWindowIndex[i12], period);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            return getPeriod(((Integer) Assertions.checkNotNull(this.periodIndexByUid.get(obj))).intValue(), period, true);
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.windowIndexByPeriodIndex.length;
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i11) {
            int i12 = this.windowIndexByPeriodIndex[i11];
            return this.playlist.get(i12).getPeriodUid(i11 - this.firstPeriodIndexByWindowIndex[i12]);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
            return this.playlist.get(i11).getWindow(this.firstPeriodIndexByWindowIndex[i11], window);
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.playlist.size();
        }

        public PlaylistTimeline(List<MediaItemData> list) {
            int size = list.size();
            this.playlist = ImmutableList.copyOf((Collection) list);
            this.firstPeriodIndexByWindowIndex = new int[size];
            int periodCountInMediaItem = 0;
            for (int i11 = 0; i11 < size; i11++) {
                MediaItemData mediaItemData = list.get(i11);
                this.firstPeriodIndexByWindowIndex[i11] = periodCountInMediaItem;
                periodCountInMediaItem += getPeriodCountInMediaItem(mediaItemData);
            }
            this.windowIndexByPeriodIndex = new int[periodCountInMediaItem];
            this.periodIndexByUid = new HashMap<>();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                MediaItemData mediaItemData2 = list.get(i13);
                for (int i14 = 0; i14 < getPeriodCountInMediaItem(mediaItemData2); i14++) {
                    this.periodIndexByUid.put(mediaItemData2.getPeriodUid(i14), Integer.valueOf(i12));
                    this.windowIndexByPeriodIndex[i12] = i13;
                    i12++;
                }
            }
        }

        @Override // androidx.media3.common.Timeline
        public int getFirstWindowIndex(boolean z11) {
            return super.getFirstWindowIndex(z11);
        }

        @Override // androidx.media3.common.Timeline
        public int getLastWindowIndex(boolean z11) {
            return super.getLastWindowIndex(z11);
        }

        @Override // androidx.media3.common.Timeline
        public int getNextWindowIndex(int i11, int i12, boolean z11) {
            return super.getNextWindowIndex(i11, i12, z11);
        }

        @Override // androidx.media3.common.Timeline
        public int getPreviousWindowIndex(int i11, int i12, boolean z11) {
            return super.getPreviousWindowIndex(i11, i12, z11);
        }
    }

    public interface PositionSupplier {
        public static final PositionSupplier ZERO = getConstant(0);

        long get();

        static PositionSupplier getConstant(final long j11) {
            return new PositionSupplier() { // from class: androidx.media3.common.g2
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return SimpleBasePlayer.PositionSupplier.m2948a(j11);
                }
            };
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ long m2949b(long j11, long j12, float f11) {
            return j11 + ((long) ((SystemClock.elapsedRealtime() - j12) * f11));
        }

        static PositionSupplier getExtrapolating(final long j11, final float f11) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            return new PositionSupplier() { // from class: androidx.media3.common.f2
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return SimpleBasePlayer.PositionSupplier.m2949b(j11, jElapsedRealtime, f11);
                }
            };
        }

        /* JADX INFO: renamed from: a */
        static /* synthetic */ long m2948a(long j11) {
            return j11;
        }
    }

    public static final class State {
        public final PositionSupplier adBufferedPositionMsSupplier;
        public final PositionSupplier adPositionMsSupplier;
        public final AudioAttributes audioAttributes;
        public final Player.Commands availableCommands;
        public final PositionSupplier contentBufferedPositionMsSupplier;
        public final PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final MediaMetadata currentMetadata;
        public final Tracks currentTracks;
        public final DeviceInfo deviceInfo;

        @IntRange(from = 0)
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;

        @Nullable
        public final PlaybackException playerError;
        public final MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final Size surfaceSize;
        public final Metadata timedMetadata;
        public final Timeline timeline;
        public final PositionSupplier totalBufferedDurationMsSupplier;
        public final TrackSelectionParameters trackSelectionParameters;
        public final VideoSize videoSize;

        @FloatRange(from = 0.0d, m1552to = 1.0d)
        public final float volume;

        public static final class Builder {
            private PositionSupplier adBufferedPositionMsSupplier;

            @Nullable
            private Long adPositionMs;
            private PositionSupplier adPositionMsSupplier;
            private AudioAttributes audioAttributes;
            private Player.Commands availableCommands;
            private PositionSupplier contentBufferedPositionMsSupplier;

            @Nullable
            private Long contentPositionMs;
            private PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private CueGroup currentCues;
            private int currentMediaItemIndex;

            @Nullable
            private MediaMetadata currentMetadata;

            @Nullable
            private Tracks currentTracks;
            private DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;

            @Nullable
            private PlaybackException playerError;

            @Nullable
            private ImmutableList<MediaItemData> playlist;
            private MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private Size surfaceSize;
            private Metadata timedMetadata;
            private Timeline timeline;
            private PositionSupplier totalBufferedDurationMsSupplier;
            private TrackSelectionParameters trackSelectionParameters;
            private VideoSize videoSize;
            private float volume;

            @CanIgnoreReturnValue
            public Builder clearPositionDiscontinuity() {
                this.hasPositionDiscontinuity = false;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAdPositionMs(long j11) {
                this.adPositionMs = Long.valueOf(j11);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setContentPositionMs(long j11) {
                this.contentPositionMs = Long.valueOf(j11);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCurrentAd(int i11, int i12) {
                Assertions.checkArgument((i11 == -1) == (i12 == -1));
                this.currentAdGroupIndex = i11;
                this.currentAdIndexInAdGroup = i12;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaylist(List<MediaItemData> list) {
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    Assertions.checkArgument(hashSet.add(list.get(i11).uid), "Duplicate MediaItemData UID in playlist");
                }
                this.playlist = ImmutableList.copyOf((Collection) list);
                this.timeline = new PlaylistTimeline(this.playlist);
                this.currentTracks = null;
                this.currentMetadata = null;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPositionDiscontinuity(int i11, long j11) {
                this.hasPositionDiscontinuity = true;
                this.positionDiscontinuityReason = i11;
                this.discontinuityPositionMs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVolume(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
                Assertions.checkArgument(f11 >= 0.0f && f11 <= 1.0f);
                this.volume = f11;
                return this;
            }

            public Builder() {
                this.availableCommands = Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
                this.playbackState = 1;
                this.playbackSuppressionReason = 0;
                this.playerError = null;
                this.repeatMode = 0;
                this.shuffleModeEnabled = false;
                this.isLoading = false;
                this.seekBackIncrementMs = 5000L;
                this.seekForwardIncrementMs = C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
                this.maxSeekToPreviousPositionMs = 3000L;
                this.playbackParameters = PlaybackParameters.DEFAULT;
                this.trackSelectionParameters = TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT;
                this.audioAttributes = AudioAttributes.DEFAULT;
                this.volume = 1.0f;
                this.videoSize = VideoSize.UNKNOWN;
                this.currentCues = CueGroup.EMPTY_TIME_ZERO;
                this.deviceInfo = DeviceInfo.UNKNOWN;
                this.deviceVolume = 0;
                this.isDeviceMuted = false;
                this.surfaceSize = Size.UNKNOWN;
                this.newlyRenderedFirstFrame = false;
                this.timedMetadata = new Metadata(C2711C.TIME_UNSET, new Metadata.Entry[0]);
                this.playlist = ImmutableList.m13439of();
                this.timeline = Timeline.EMPTY;
                this.currentTracks = null;
                this.currentMetadata = null;
                this.playlistMetadata = MediaMetadata.EMPTY;
                this.currentMediaItemIndex = -1;
                this.currentAdGroupIndex = -1;
                this.currentAdIndexInAdGroup = -1;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = PositionSupplier.getConstant(C2711C.TIME_UNSET);
                this.adPositionMs = null;
                PositionSupplier positionSupplier = PositionSupplier.ZERO;
                this.adPositionMsSupplier = positionSupplier;
                this.contentBufferedPositionMsSupplier = PositionSupplier.getConstant(C2711C.TIME_UNSET);
                this.adBufferedPositionMsSupplier = positionSupplier;
                this.totalBufferedDurationMsSupplier = positionSupplier;
                this.hasPositionDiscontinuity = false;
                this.positionDiscontinuityReason = 5;
                this.discontinuityPositionMs = 0L;
            }

            public State build() {
                return new State(this);
            }

            @CanIgnoreReturnValue
            public Builder setAdBufferedPositionMs(PositionSupplier positionSupplier) {
                this.adBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAdPositionMs(PositionSupplier positionSupplier) {
                this.adPositionMs = null;
                this.adPositionMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAudioAttributes(AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAvailableCommands(Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setContentBufferedPositionMs(PositionSupplier positionSupplier) {
                this.contentBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setContentPositionMs(PositionSupplier positionSupplier) {
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCurrentCues(CueGroup cueGroup) {
                this.currentCues = cueGroup;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCurrentMediaItemIndex(int i11) {
                this.currentMediaItemIndex = i11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDeviceInfo(DeviceInfo deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDeviceVolume(@IntRange(from = 0) int i11) {
                Assertions.checkArgument(i11 >= 0);
                this.deviceVolume = i11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsDeviceMuted(boolean z11) {
                this.isDeviceMuted = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsLoading(boolean z11) {
                this.isLoading = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMaxSeekToPreviousPositionMs(long j11) {
                this.maxSeekToPreviousPositionMs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setNewlyRenderedFirstFrame(boolean z11) {
                this.newlyRenderedFirstFrame = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlayWhenReady(boolean z11, int i11) {
                this.playWhenReady = z11;
                this.playWhenReadyChangeReason = i11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaybackParameters(PlaybackParameters playbackParameters) {
                this.playbackParameters = playbackParameters;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaybackState(int i11) {
                this.playbackState = i11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaybackSuppressionReason(int i11) {
                this.playbackSuppressionReason = i11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlayerError(@Nullable PlaybackException playbackException) {
                this.playerError = playbackException;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaylistMetadata(MediaMetadata mediaMetadata) {
                this.playlistMetadata = mediaMetadata;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRepeatMode(int i11) {
                this.repeatMode = i11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSeekBackIncrementMs(long j11) {
                this.seekBackIncrementMs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSeekForwardIncrementMs(long j11) {
                this.seekForwardIncrementMs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setShuffleModeEnabled(boolean z11) {
                this.shuffleModeEnabled = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSurfaceSize(Size size) {
                this.surfaceSize = size;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTimedMetadata(Metadata metadata) {
                this.timedMetadata = metadata;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTotalBufferedDurationMs(PositionSupplier positionSupplier) {
                this.totalBufferedDurationMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
                this.trackSelectionParameters = trackSelectionParameters;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVideoSize(VideoSize videoSize) {
                this.videoSize = videoSize;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaylist(Timeline timeline, Tracks tracks, @Nullable MediaMetadata mediaMetadata) {
                this.playlist = null;
                this.timeline = timeline;
                this.currentTracks = tracks;
                this.currentMetadata = mediaMetadata;
                return this;
            }

            private Builder(State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
                this.playbackState = state.playbackState;
                this.playbackSuppressionReason = state.playbackSuppressionReason;
                this.playerError = state.playerError;
                this.repeatMode = state.repeatMode;
                this.shuffleModeEnabled = state.shuffleModeEnabled;
                this.isLoading = state.isLoading;
                this.seekBackIncrementMs = state.seekBackIncrementMs;
                this.seekForwardIncrementMs = state.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = state.maxSeekToPreviousPositionMs;
                this.playbackParameters = state.playbackParameters;
                this.trackSelectionParameters = state.trackSelectionParameters;
                this.audioAttributes = state.audioAttributes;
                this.volume = state.volume;
                this.videoSize = state.videoSize;
                this.currentCues = state.currentCues;
                this.deviceInfo = state.deviceInfo;
                this.deviceVolume = state.deviceVolume;
                this.isDeviceMuted = state.isDeviceMuted;
                this.surfaceSize = state.surfaceSize;
                this.newlyRenderedFirstFrame = state.newlyRenderedFirstFrame;
                this.timedMetadata = state.timedMetadata;
                Timeline timeline = state.timeline;
                this.timeline = timeline;
                if (timeline instanceof PlaylistTimeline) {
                    this.playlist = ((PlaylistTimeline) timeline).playlist;
                } else {
                    this.currentTracks = state.currentTracks;
                    this.currentMetadata = state.currentMetadata;
                }
                this.playlistMetadata = state.playlistMetadata;
                this.currentMediaItemIndex = state.currentMediaItemIndex;
                this.currentAdGroupIndex = state.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = state.currentAdIndexInAdGroup;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = state.contentPositionMsSupplier;
                this.adPositionMs = null;
                this.adPositionMsSupplier = state.adPositionMsSupplier;
                this.contentBufferedPositionMsSupplier = state.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = state.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = state.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = state.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = state.positionDiscontinuityReason;
                this.discontinuityPositionMs = state.discontinuityPositionMs;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands) && this.playbackState == state.playbackState && this.playbackSuppressionReason == state.playbackSuppressionReason && Objects.equals(this.playerError, state.playerError) && this.repeatMode == state.repeatMode && this.shuffleModeEnabled == state.shuffleModeEnabled && this.isLoading == state.isLoading && this.seekBackIncrementMs == state.seekBackIncrementMs && this.seekForwardIncrementMs == state.seekForwardIncrementMs && this.maxSeekToPreviousPositionMs == state.maxSeekToPreviousPositionMs && this.playbackParameters.equals(state.playbackParameters) && this.trackSelectionParameters.equals(state.trackSelectionParameters) && this.audioAttributes.equals(state.audioAttributes) && this.volume == state.volume && this.videoSize.equals(state.videoSize) && this.currentCues.equals(state.currentCues) && this.deviceInfo.equals(state.deviceInfo) && this.deviceVolume == state.deviceVolume && this.isDeviceMuted == state.isDeviceMuted && this.surfaceSize.equals(state.surfaceSize) && this.newlyRenderedFirstFrame == state.newlyRenderedFirstFrame && this.timedMetadata.equals(state.timedMetadata) && this.timeline.equals(state.timeline) && this.currentTracks.equals(state.currentTracks) && this.currentMetadata.equals(state.currentMetadata) && this.playlistMetadata.equals(state.playlistMetadata) && this.currentMediaItemIndex == state.currentMediaItemIndex && this.currentAdGroupIndex == state.currentAdGroupIndex && this.currentAdIndexInAdGroup == state.currentAdIndexInAdGroup && this.contentPositionMsSupplier.equals(state.contentPositionMsSupplier) && this.adPositionMsSupplier.equals(state.adPositionMsSupplier) && this.contentBufferedPositionMsSupplier.equals(state.contentBufferedPositionMsSupplier) && this.adBufferedPositionMsSupplier.equals(state.adBufferedPositionMsSupplier) && this.totalBufferedDurationMsSupplier.equals(state.totalBufferedDurationMsSupplier) && this.hasPositionDiscontinuity == state.hasPositionDiscontinuity && this.positionDiscontinuityReason == state.positionDiscontinuityReason && this.discontinuityPositionMs == state.discontinuityPositionMs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private State(Builder builder) {
            int i11;
            Tracks tracks = builder.currentTracks;
            MediaMetadata combinedMediaMetadata = builder.currentMetadata;
            if (builder.timeline.isEmpty()) {
                Assertions.checkArgument(builder.playbackState == 1 || builder.playbackState == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
                Assertions.checkArgument(builder.currentAdGroupIndex == -1 && builder.currentAdIndexInAdGroup == -1, "Ads not allowed if playlist is empty");
                tracks = tracks == null ? Tracks.EMPTY : tracks;
                if (combinedMediaMetadata == null) {
                    combinedMediaMetadata = MediaMetadata.EMPTY;
                }
            } else {
                int i12 = builder.currentMediaItemIndex;
                if (i12 == -1) {
                    i11 = 0;
                } else {
                    Assertions.checkArgument(builder.currentMediaItemIndex < builder.timeline.getWindowCount(), "currentMediaItemIndex must be less than playlist.size()");
                    i11 = i12;
                }
                if (builder.currentAdGroupIndex != -1) {
                    Timeline.Period period = new Timeline.Period();
                    builder.timeline.getPeriod(SimpleBasePlayer.getPeriodIndexFromWindowPosition(builder.timeline, i11, builder.contentPositionMs != null ? builder.contentPositionMs.longValue() : builder.contentPositionMsSupplier.get(), new Timeline.Window(), period), period);
                    Assertions.checkArgument(builder.currentAdGroupIndex < period.getAdGroupCount(), "PeriodData has less ad groups than adGroupIndex");
                    int adCountInAdGroup = period.getAdCountInAdGroup(builder.currentAdGroupIndex);
                    if (adCountInAdGroup != -1) {
                        Assertions.checkArgument(builder.currentAdIndexInAdGroup < adCountInAdGroup, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
                if (builder.playlist != null) {
                    MediaItemData mediaItemData = (MediaItemData) builder.playlist.get(i11);
                    Tracks tracks2 = mediaItemData.tracks;
                    combinedMediaMetadata = mediaItemData.mediaMetadata;
                    tracks = tracks2;
                }
                if (combinedMediaMetadata == null) {
                    combinedMediaMetadata = SimpleBasePlayer.getCombinedMediaMetadata(builder.timeline.getWindow(i11, new Timeline.Window()).mediaItem, (Tracks) Assertions.checkNotNull(tracks));
                }
            }
            if (builder.playerError != null) {
                Assertions.checkArgument(builder.playbackState == 1, "Player error only allowed in STATE_IDLE");
            }
            if (builder.playbackState == 1 || builder.playbackState == 4) {
                Assertions.checkArgument(!builder.isLoading, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            }
            PositionSupplier extrapolating = builder.contentPositionMs != null ? (builder.currentAdGroupIndex == -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0 && builder.contentPositionMs.longValue() != C2711C.TIME_UNSET) ? PositionSupplier.getExtrapolating(builder.contentPositionMs.longValue(), builder.playbackParameters.speed) : PositionSupplier.getConstant(builder.contentPositionMs.longValue()) : builder.contentPositionMsSupplier;
            PositionSupplier extrapolating2 = builder.adPositionMs != null ? (builder.currentAdGroupIndex != -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0) ? PositionSupplier.getExtrapolating(builder.adPositionMs.longValue(), 1.0f) : PositionSupplier.getConstant(builder.adPositionMs.longValue()) : builder.adPositionMsSupplier;
            this.availableCommands = builder.availableCommands;
            this.playWhenReady = builder.playWhenReady;
            this.playWhenReadyChangeReason = builder.playWhenReadyChangeReason;
            this.playbackState = builder.playbackState;
            this.playbackSuppressionReason = builder.playbackSuppressionReason;
            this.playerError = builder.playerError;
            this.repeatMode = builder.repeatMode;
            this.shuffleModeEnabled = builder.shuffleModeEnabled;
            this.isLoading = builder.isLoading;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.playbackParameters = builder.playbackParameters;
            this.trackSelectionParameters = builder.trackSelectionParameters;
            this.audioAttributes = builder.audioAttributes;
            this.volume = builder.volume;
            this.videoSize = builder.videoSize;
            this.currentCues = builder.currentCues;
            this.deviceInfo = builder.deviceInfo;
            this.deviceVolume = builder.deviceVolume;
            this.isDeviceMuted = builder.isDeviceMuted;
            this.surfaceSize = builder.surfaceSize;
            this.newlyRenderedFirstFrame = builder.newlyRenderedFirstFrame;
            this.timedMetadata = builder.timedMetadata;
            this.timeline = builder.timeline;
            this.currentTracks = (Tracks) Assertions.checkNotNull(tracks);
            this.currentMetadata = combinedMediaMetadata;
            this.playlistMetadata = builder.playlistMetadata;
            this.currentMediaItemIndex = builder.currentMediaItemIndex;
            this.currentAdGroupIndex = builder.currentAdGroupIndex;
            this.currentAdIndexInAdGroup = builder.currentAdIndexInAdGroup;
            this.contentPositionMsSupplier = extrapolating;
            this.adPositionMsSupplier = extrapolating2;
            this.contentBufferedPositionMsSupplier = builder.contentBufferedPositionMsSupplier;
            this.adBufferedPositionMsSupplier = builder.adBufferedPositionMsSupplier;
            this.totalBufferedDurationMsSupplier = builder.totalBufferedDurationMsSupplier;
            this.hasPositionDiscontinuity = builder.hasPositionDiscontinuity;
            this.positionDiscontinuityReason = builder.positionDiscontinuityReason;
            this.discontinuityPositionMs = builder.discontinuityPositionMs;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public ImmutableList<MediaItemData> getPlaylist() {
            Timeline timeline = this.timeline;
            if (timeline instanceof PlaylistTimeline) {
                return ((PlaylistTimeline) timeline).playlist;
            }
            Timeline.Window window = new Timeline.Window();
            Timeline.Period period = new Timeline.Period();
            ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(this.timeline.getWindowCount());
            for (int i11 = 0; i11 < this.timeline.getWindowCount(); i11++) {
                builderBuilderWithExpectedSize.add(MediaItemData.buildFromState(this, i11, period, window));
            }
            return builderBuilderWithExpectedSize.build();
        }

        public int hashCode() {
            int iHashCode = (((((((((217 + this.availableCommands.hashCode()) * 31) + (this.playWhenReady ? 1 : 0)) * 31) + this.playWhenReadyChangeReason) * 31) + this.playbackState) * 31) + this.playbackSuppressionReason) * 31;
            PlaybackException playbackException = this.playerError;
            int iHashCode2 = (((((((iHashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.repeatMode) * 31) + (this.shuffleModeEnabled ? 1 : 0)) * 31) + (this.isLoading ? 1 : 0)) * 31;
            long j11 = this.seekBackIncrementMs;
            int i11 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.seekForwardIncrementMs;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.maxSeekToPreviousPositionMs;
            int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.playbackParameters.hashCode()) * 31) + this.trackSelectionParameters.hashCode()) * 31) + this.audioAttributes.hashCode()) * 31) + Float.floatToRawIntBits(this.volume)) * 31) + this.videoSize.hashCode()) * 31) + this.currentCues.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31) + this.deviceVolume) * 31) + (this.isDeviceMuted ? 1 : 0)) * 31) + this.surfaceSize.hashCode()) * 31) + (this.newlyRenderedFirstFrame ? 1 : 0)) * 31) + this.timedMetadata.hashCode()) * 31) + this.timeline.hashCode()) * 31) + this.currentTracks.hashCode()) * 31) + this.currentMetadata.hashCode()) * 31) + this.playlistMetadata.hashCode()) * 31) + this.currentMediaItemIndex) * 31) + this.currentAdGroupIndex) * 31) + this.currentAdIndexInAdGroup) * 31) + this.contentPositionMsSupplier.hashCode()) * 31) + this.adPositionMsSupplier.hashCode()) * 31) + this.contentBufferedPositionMsSupplier.hashCode()) * 31) + this.adBufferedPositionMsSupplier.hashCode()) * 31) + this.totalBufferedDurationMsSupplier.hashCode()) * 31) + (this.hasPositionDiscontinuity ? 1 : 0)) * 31) + this.positionDiscontinuityReason) * 31;
            long j14 = this.discontinuityPositionMs;
            return iHashCode3 + ((int) (j14 ^ (j14 >>> 32)));
        }
    }

    public SimpleBasePlayer(Looper looper) {
        this(looper, Clock.DEFAULT);
    }

    private void setMediaItemsInternal(final List<MediaItem> list, final int i11, final long j11) {
        Assertions.checkArgument(i11 == -1 || i11 >= 0);
        final State state = this.state;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(handleSetMediaItems(list, i11, j11), new Supplier() { // from class: androidx.media3.common.u0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return SimpleBasePlayer.m2910a(this.f2882b, list, state, i11, j11);
                }
            });
        }
    }

    private void updateStateAndInformListeners(final State state, boolean z11, boolean z12) {
        State state2 = this.state;
        this.state = state;
        if (state.hasPositionDiscontinuity || state.newlyRenderedFirstFrame) {
            this.state = state.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        boolean z13 = state2.playWhenReady != state.playWhenReady;
        boolean z14 = state2.playbackState != state.playbackState;
        final int positionDiscontinuityReason = getPositionDiscontinuityReason(state2, state, z11, this.window, this.period);
        boolean zEquals = state2.timeline.equals(state.timeline);
        final int mediaItemTransitionReason = getMediaItemTransitionReason(state2, state, positionDiscontinuityReason, z12, this.window);
        if (!zEquals) {
            final int timelineChangeReason = getTimelineChangeReason(state2.timeline, state.timeline, this.window);
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: androidx.media3.common.z0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    Player.Listener listener = (Player.Listener) obj;
                    listener.onTimelineChanged(state.timeline, timelineChangeReason);
                }
            });
        }
        if (positionDiscontinuityReason != -1) {
            final Player.PositionInfo positionInfo = getPositionInfo(state2, false, this.window, this.period);
            final Player.PositionInfo positionInfo2 = getPositionInfo(state, state.hasPositionDiscontinuity, this.window, this.period);
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: androidx.media3.common.x
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.m2889F(positionDiscontinuityReason, positionInfo, positionInfo2, (Player.Listener) obj);
                }
            });
        }
        if (mediaItemTransitionReason != -1) {
            final MediaItem mediaItem = state.timeline.isEmpty() ? null : state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), this.window).mediaItem;
            this.listeners.queueEvent(1, new ListenerSet.Event() { // from class: androidx.media3.common.j0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaItemTransition(mediaItem, mediaItemTransitionReason);
                }
            });
        }
        if (!Util.areEqual(state2.playerError, state.playerError)) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.l0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerErrorChanged(state.playerError);
                }
            });
            if (state.playerError != null) {
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.m0
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onPlayerError((PlaybackException) Util.castNonNull(state.playerError));
                    }
                });
            }
        }
        if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
            this.listeners.queueEvent(19, new ListenerSet.Event() { // from class: androidx.media3.common.n0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTrackSelectionParametersChanged(state.trackSelectionParameters);
                }
            });
        }
        if (!state2.currentTracks.equals(state.currentTracks)) {
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: androidx.media3.common.p0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTracksChanged(state.currentTracks);
                }
            });
        }
        if (!state2.currentMetadata.equals(state.currentMetadata)) {
            this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: androidx.media3.common.q0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaMetadataChanged(state.currentMetadata);
                }
            });
        }
        if (state2.isLoading != state.isLoading) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: androidx.media3.common.r0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.m2885B(state, (Player.Listener) obj);
                }
            });
        }
        if (z13 || z14) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.common.s0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onPlayerStateChanged(state3.playWhenReady, state3.playbackState);
                }
            });
        }
        if (z14) {
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: androidx.media3.common.k1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackStateChanged(state.playbackState);
                }
            });
        }
        if (z13 || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: androidx.media3.common.v1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onPlayWhenReadyChanged(state3.playWhenReady, state3.playWhenReadyChangeReason);
                }
            });
        }
        if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: androidx.media3.common.b2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackSuppressionReasonChanged(state.playbackSuppressionReason);
                }
            });
        }
        if (isPlaying(state2) != isPlaying(state)) {
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: androidx.media3.common.c2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onIsPlayingChanged(SimpleBasePlayer.isPlaying(state));
                }
            });
        }
        if (!state2.playbackParameters.equals(state.playbackParameters)) {
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: androidx.media3.common.d2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackParametersChanged(state.playbackParameters);
                }
            });
        }
        if (state2.repeatMode != state.repeatMode) {
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: androidx.media3.common.e2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onRepeatModeChanged(state.repeatMode);
                }
            });
        }
        if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: androidx.media3.common.t
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onShuffleModeEnabledChanged(state.shuffleModeEnabled);
                }
            });
        }
        if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
            this.listeners.queueEvent(16, new ListenerSet.Event() { // from class: androidx.media3.common.u
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekBackIncrementChanged(state.seekBackIncrementMs);
                }
            });
        }
        if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
            this.listeners.queueEvent(17, new ListenerSet.Event() { // from class: androidx.media3.common.v
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekForwardIncrementChanged(state.seekForwardIncrementMs);
                }
            });
        }
        if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
            this.listeners.queueEvent(18, new ListenerSet.Event() { // from class: androidx.media3.common.w
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMaxSeekToPreviousPositionChanged(state.maxSeekToPreviousPositionMs);
                }
            });
        }
        if (!state2.audioAttributes.equals(state.audioAttributes)) {
            this.listeners.queueEvent(20, new ListenerSet.Event() { // from class: androidx.media3.common.y
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAudioAttributesChanged(state.audioAttributes);
                }
            });
        }
        if (!state2.videoSize.equals(state.videoSize)) {
            this.listeners.queueEvent(25, new ListenerSet.Event() { // from class: androidx.media3.common.z
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVideoSizeChanged(state.videoSize);
                }
            });
        }
        if (!state2.deviceInfo.equals(state.deviceInfo)) {
            this.listeners.queueEvent(29, new ListenerSet.Event() { // from class: androidx.media3.common.a0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceInfoChanged(state.deviceInfo);
                }
            });
        }
        if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
            this.listeners.queueEvent(15, new ListenerSet.Event() { // from class: androidx.media3.common.b0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaylistMetadataChanged(state.playlistMetadata);
                }
            });
        }
        if (state.newlyRenderedFirstFrame) {
            this.listeners.queueEvent(26, new C2737c0());
        }
        if (!state2.surfaceSize.equals(state.surfaceSize)) {
            this.listeners.queueEvent(24, new ListenerSet.Event() { // from class: androidx.media3.common.e0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onSurfaceSizeChanged(state3.surfaceSize.getWidth(), state3.surfaceSize.getHeight());
                }
            });
        }
        if (state2.volume != state.volume) {
            this.listeners.queueEvent(22, new ListenerSet.Event() { // from class: androidx.media3.common.f0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVolumeChanged(state.volume);
                }
            });
        }
        if (state2.deviceVolume != state.deviceVolume || state2.isDeviceMuted != state.isDeviceMuted) {
            this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.common.g0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onDeviceVolumeChanged(state3.deviceVolume, state3.isDeviceMuted);
                }
            });
        }
        if (!state2.currentCues.equals(state.currentCues)) {
            this.listeners.queueEvent(27, new ListenerSet.Event() { // from class: androidx.media3.common.h0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.m2901R(state, (Player.Listener) obj);
                }
            });
        }
        if (!state2.timedMetadata.equals(state.timedMetadata) && state.timedMetadata.presentationTimeUs != C2711C.TIME_UNSET) {
            this.listeners.queueEvent(28, new ListenerSet.Event() { // from class: androidx.media3.common.i0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMetadata(state.timedMetadata);
                }
            });
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: androidx.media3.common.k0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAvailableCommandsChanged(state.availableCommands);
                }
            });
        }
        this.listeners.flushEvents();
    }

    private void updateStateForPendingOperation(ListenableFuture<?> listenableFuture, Supplier<State> supplier) {
        updateStateForPendingOperation(listenableFuture, supplier, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(1), new Supplier() { // from class: androidx.media3.common.d1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(Math.max(0, state2.deviceVolume - 1)).build();
                }
            });
        }
    }

    @ForOverride
    public abstract State getState();

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(1), new Supplier() { // from class: androidx.media3.common.p1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(state2.deviceVolume + 1).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceMuted(final boolean z11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z11, 1), new Supplier() { // from class: androidx.media3.common.m1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return state.buildUpon().setIsDeviceMuted(z11).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceVolume(final int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i11, 1), new Supplier() { // from class: androidx.media3.common.d0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(i11).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, boolean z11) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z11 ? -1 : this.state.currentMediaItemIndex, z11 ? C2711C.TIME_UNSET : this.state.contentPositionMsSupplier.get());
    }

    public SimpleBasePlayer(Looper looper, Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = new HashSet<>();
        this.period = new Timeline.Period();
        this.listeners = new ListenerSet<>(looper, clock, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.common.e1
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                SimpleBasePlayer.m2940s(this.f2813a, (Player.Listener) obj, flagSet);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m2885B(State state, Player.Listener listener) {
        listener.onLoadingChanged(state.isLoading);
        listener.onIsLoadingChanged(state.isLoading);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ State m2887D(SimpleBasePlayer simpleBasePlayer, State state, List list, int i11) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        for (int i12 = 0; i12 < list.size(); i12++) {
            listBuildMutablePlaylistFromState.add(i12 + i11, simpleBasePlayer.getPlaceholderMediaItemData((MediaItem) list.get(i12)));
        }
        return !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window) : getStateWithNewPlaylistAndPosition(state, listBuildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), simpleBasePlayer.window);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ State m2892I(SimpleBasePlayer simpleBasePlayer, State state, int i11, int i12, int i13) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        Util.moveItems(listBuildMutablePlaylistFromState, i11, i12, i13);
        return getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m2901R(State state, Player.Listener listener) {
        listener.onCues(state.currentCues.cues);
        listener.onCues(state.currentCues);
    }

    private static List<MediaItemData> buildMutablePlaylistFromState(State state, Timeline.Period period, Timeline.Window window) {
        if (state.timeline instanceof PlaylistTimeline) {
            return new ArrayList(((PlaylistTimeline) state.timeline).playlist);
        }
        ArrayList arrayList = new ArrayList(state.timeline.getWindowCount());
        for (int i11 = 0; i11 < state.timeline.getWindowCount(); i11++) {
            arrayList.add(MediaItemData.buildFromState(state, i11, period, window));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static State buildStateForNewPosition(State.Builder builder, State state, long j11, Timeline timeline, int i11, long j12, boolean z11, Timeline.Window window) {
        long defaultPositionMs;
        int i12 = i11;
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j11, state, window);
        boolean z12 = false;
        if (timeline.isEmpty() || (i12 != -1 && i12 < timeline.getWindowCount())) {
            defaultPositionMs = j12;
        } else {
            defaultPositionMs = -9223372036854775807L;
            i12 = 0;
        }
        if (!timeline.isEmpty() && defaultPositionMs == C2711C.TIME_UNSET) {
            defaultPositionMs = timeline.getWindow(i12, window).getDefaultPositionMs();
        }
        boolean z13 = state.timeline.isEmpty() || timeline.isEmpty();
        boolean z14 = (z13 || state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid.equals(timeline.getWindow(i12, window).uid)) ? false : true;
        if (timeline.isEmpty()) {
            builder.setPlaylist(timeline, Tracks.EMPTY, null);
        } else if (timeline instanceof PlaylistTimeline) {
            MediaItemData mediaItemData = (MediaItemData) ((PlaylistTimeline) timeline).playlist.get(i12);
            builder.setPlaylist(timeline, mediaItemData.tracks, mediaItemData.mediaMetadata);
        } else {
            if (!z13 && !z14) {
                z12 = true;
            }
            builder.setPlaylist(timeline, z12 ? state.currentTracks : Tracks.EMPTY, z12 ? state.currentMetadata : null);
        }
        if (z13 || z14 || defaultPositionMs < positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i12).setCurrentAd(-1, -1).setContentPositionMs(defaultPositionMs).setContentBufferedPositionMs(PositionSupplier.getConstant(defaultPositionMs)).setTotalBufferedDurationMs(PositionSupplier.ZERO);
        } else if (defaultPositionMs == positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i12);
            if (state.currentAdGroupIndex == -1 || !z11) {
                builder.setCurrentAd(-1, -1).setTotalBufferedDurationMs(PositionSupplier.getConstant(getContentBufferedPositionMsInternal(state, window) - positionOrDefaultInMediaItem));
            } else {
                builder.setTotalBufferedDurationMs(PositionSupplier.getConstant(state.adBufferedPositionMsSupplier.get() - state.adPositionMsSupplier.get()));
            }
        } else {
            builder.setCurrentMediaItemIndex(i12).setCurrentAd(-1, -1).setContentPositionMs(defaultPositionMs).setContentBufferedPositionMs(PositionSupplier.getConstant(Math.max(getContentBufferedPositionMsInternal(state, window), defaultPositionMs))).setTotalBufferedDurationMs(PositionSupplier.getConstant(Math.max(0L, state.totalBufferedDurationMsSupplier.get() - (defaultPositionMs - positionOrDefaultInMediaItem))));
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ State m2914c(SimpleBasePlayer simpleBasePlayer, State state, int i11, int i12) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        Util.removeRange(listBuildMutablePlaylistFromState, i11, i12);
        return getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ State m2918e(SimpleBasePlayer simpleBasePlayer, boolean z11, State state, int i11, long j11) {
        if (!z11) {
            return getStateWithNewPlaylistAndPosition(state, null, i11, j11, simpleBasePlayer.window);
        }
        simpleBasePlayer.getClass();
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaMetadata getCombinedMediaMetadata(MediaItem mediaItem, Tracks tracks) {
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        int size = tracks.getGroups().size();
        for (int i11 = 0; i11 < size; i11++) {
            Tracks.Group group = tracks.getGroups().get(i11);
            for (int i12 = 0; i12 < group.length; i12++) {
                if (group.isTrackSelected(i12)) {
                    Format trackFormat = group.getTrackFormat(i12);
                    if (trackFormat.metadata != null) {
                        for (int i13 = 0; i13 < trackFormat.metadata.length(); i13++) {
                            trackFormat.metadata.get(i13).populateMediaMetadata(builder);
                        }
                    }
                }
            }
        }
        return builder.populate(mediaItem.mediaMetadata).build();
    }

    private static long getContentBufferedPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentBufferedPositionMsSupplier.get(), state, window);
    }

    private static long getContentPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentPositionMsSupplier.get(), state, window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCurrentMediaItemIndexInternal(State state) {
        int i11 = state.currentMediaItemIndex;
        if (i11 != -1) {
            return i11;
        }
        return 0;
    }

    private static long getCurrentPeriodOrAdPositionMs(State state, Object obj, Timeline.Period period, Timeline.Window window) {
        return state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : getContentPositionMsInternal(state, window) - state.timeline.getPeriodByUid(obj, period).getPositionInWindowMs();
    }

    private static int getMediaItemTransitionReason(State state, State state2, int i11, boolean z11, Timeline.Window window) {
        Timeline timeline = state.timeline;
        Timeline timeline2 = state2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return -1;
        }
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return 3;
        }
        Object obj = state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid;
        Object obj2 = state2.timeline.getWindow(getCurrentMediaItemIndexInternal(state2), window).uid;
        if ((obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i11 == 0) {
                return 1;
            }
            return i11 == 1 ? 2 : 3;
        }
        if (i11 == 0) {
            if (getContentPositionMsInternal(state, window) > getContentPositionMsInternal(state2, window)) {
                return 0;
            }
            if (state2.hasPositionDiscontinuity && state2.discontinuityPositionMs == C2711C.TIME_UNSET && z11) {
                return 0;
            }
        }
        return (i11 == 1 && z11) ? 2 : -1;
    }

    private static long getPeriodOrAdDurationMs(State state, Object obj, Timeline.Period period) {
        state.timeline.getPeriodByUid(obj, period);
        int i11 = state.currentAdGroupIndex;
        return Util.usToMs(i11 == -1 ? period.durationUs : period.getAdDurationUs(i11, state.currentAdIndexInAdGroup));
    }

    private static int getPositionDiscontinuityReason(State state, State state2, boolean z11, Timeline.Window window, Timeline.Period period) {
        if (state2.hasPositionDiscontinuity) {
            return state2.positionDiscontinuityReason;
        }
        if (z11) {
            return 1;
        }
        if (state.timeline.isEmpty()) {
            return -1;
        }
        if (state2.timeline.isEmpty()) {
            return 4;
        }
        Object uidOfPeriod = state.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state, window, period));
        Object uidOfPeriod2 = state2.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state2, window, period));
        if ((uidOfPeriod instanceof PlaceholderUid) && !(uidOfPeriod2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (uidOfPeriod2.equals(uidOfPeriod) && state.currentAdGroupIndex == state2.currentAdGroupIndex && state.currentAdIndexInAdGroup == state2.currentAdIndexInAdGroup) {
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
            if (Math.abs(currentPeriodOrAdPositionMs - getCurrentPeriodOrAdPositionMs(state2, uidOfPeriod2, period, window)) < 1000) {
                return -1;
            }
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
            return (periodOrAdDurationMs == C2711C.TIME_UNSET || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 5 : 0;
        }
        if (state2.timeline.getIndexOfPeriod(uidOfPeriod) == -1) {
            return 4;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
        return (periodOrAdDurationMs2 == C2711C.TIME_UNSET || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 3 : 0;
    }

    private static boolean isPlaying(State state) {
        return state.playWhenReady && state.playbackState == 3 && state.playbackSuppressionReason == 0;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ State m2936o(SimpleBasePlayer simpleBasePlayer, State state, List list, int i11, int i12) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        for (int i13 = 0; i13 < list.size(); i13++) {
            listBuildMutablePlaylistFromState.add(i13 + i11, simpleBasePlayer.getPlaceholderMediaItemData((MediaItem) list.get(i13)));
        }
        State stateWithNewPlaylist = !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window) : getStateWithNewPlaylistAndPosition(state, listBuildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), simpleBasePlayer.window);
        if (i12 >= i11) {
            return stateWithNewPlaylist;
        }
        Util.removeRange(listBuildMutablePlaylistFromState, i12, i11);
        return getStateWithNewPlaylist(stateWithNewPlaylist, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m2937p(SimpleBasePlayer simpleBasePlayer, ListenableFuture listenableFuture) {
        Util.castNonNull(simpleBasePlayer.state);
        simpleBasePlayer.pendingOperations.remove(listenableFuture);
        if (!simpleBasePlayer.pendingOperations.isEmpty() || simpleBasePlayer.released) {
            return;
        }
        simpleBasePlayer.updateStateAndInformListeners(simpleBasePlayer.getState(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.applicationHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    private boolean shouldHandleCommand(int i11) {
        return !this.released && this.state.availableCommands.contains(i11);
    }

    private void updateStateForPendingOperation(final ListenableFuture<?> listenableFuture, Supplier<State> supplier, boolean z11, boolean z12) {
        if (listenableFuture.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState(), z11, z12);
            return;
        }
        this.pendingOperations.add(listenableFuture);
        updateStateAndInformListeners(getPlaceholderState(supplier.get()), z11, z12);
        listenableFuture.addListener(new Runnable() { // from class: androidx.media3.common.w0
            @Override // java.lang.Runnable
            public final void run() {
                SimpleBasePlayer.m2937p(this.f2910b, listenableFuture);
            }
        }, new Executor() { // from class: androidx.media3.common.x0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f2916b.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void addListener(Player.Listener listener) {
        this.listeners.add((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(@Nullable Surface surface) {
        clearVideoOutput(surface);
    }

    @Override // androidx.media3.common.Player
    public final Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @ForOverride
    public MediaItemData getPlaceholderMediaItemData(MediaItem mediaItem) {
        return new MediaItemData.Builder(new PlaceholderUid()).setMediaItem(mediaItem).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    @ForOverride
    public ListenableFuture<?> handleAddMediaItems(int i11, List<MediaItem> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @ForOverride
    public ListenableFuture<?> handleClearVideoOutput(@Nullable Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @ForOverride
    public ListenableFuture<?> handleDecreaseDeviceVolume(int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @ForOverride
    public ListenableFuture<?> handleIncreaseDeviceVolume(int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @ForOverride
    public ListenableFuture<?> handleMoveMediaItems(int i11, int i12, int i13) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @ForOverride
    public ListenableFuture<?> handlePrepare() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    @ForOverride
    public ListenableFuture<?> handleRelease() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    @ForOverride
    public ListenableFuture<?> handleRemoveMediaItems(int i11, int i12) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @ForOverride
    public ListenableFuture<?> handleSeek(int i11, long j11, int i12) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    @ForOverride
    public ListenableFuture<?> handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    @ForOverride
    public ListenableFuture<?> handleSetDeviceMuted(boolean z11, int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @ForOverride
    public ListenableFuture<?> handleSetDeviceVolume(@IntRange(from = 0) int i11, int i12) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    @ForOverride
    public ListenableFuture<?> handleSetMediaItems(List<MediaItem> list, int i11, long j11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    @ForOverride
    public ListenableFuture<?> handleSetPlayWhenReady(boolean z11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    @ForOverride
    public ListenableFuture<?> handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    @ForOverride
    public ListenableFuture<?> handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    @ForOverride
    public ListenableFuture<?> handleSetRepeatMode(int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    @ForOverride
    public ListenableFuture<?> handleSetShuffleModeEnabled(boolean z11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    @ForOverride
    public ListenableFuture<?> handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    @ForOverride
    public ListenableFuture<?> handleSetVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @ForOverride
    public ListenableFuture<?> handleSetVolume(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    @ForOverride
    public ListenableFuture<?> handleStop() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m2889F(int i11, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i11);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i11);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ State m2900Q(SimpleBasePlayer simpleBasePlayer, State state) {
        simpleBasePlayer.getClass();
        return state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO).setContentBufferedPositionMs(PositionSupplier.getConstant(getContentPositionMsInternal(state, simpleBasePlayer.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ State m2910a(SimpleBasePlayer simpleBasePlayer, List list, State state, int i11, long j11) {
        simpleBasePlayer.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayList.add(simpleBasePlayer.getPlaceholderMediaItemData((MediaItem) list.get(i12)));
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, i11, j11, simpleBasePlayer.window);
    }

    private void clearVideoOutput(@Nullable Object obj) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        updateStateForPendingOperation(handleClearVideoOutput(obj), new Supplier() { // from class: androidx.media3.common.n1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setSurfaceSize(Size.ZERO).build();
            }
        });
    }

    private static int getCurrentPeriodIndexInternal(State state, Timeline.Window window, Timeline.Period period) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        if (state.timeline.isEmpty()) {
            return currentMediaItemIndexInternal;
        }
        return getPeriodIndexFromWindowPosition(state.timeline, currentMediaItemIndexInternal, getContentPositionMsInternal(state, window), window, period);
    }

    private static int getMediaItemIndexInNewPlaylist(Timeline timeline, Timeline timeline2, int i11, Timeline.Period period, Timeline.Window window) {
        if (timeline.isEmpty()) {
            if (i11 >= timeline2.getWindowCount()) {
                return -1;
            }
            return i11;
        }
        Object objCheckNotNull = Assertions.checkNotNull(timeline.getPeriod(timeline.getWindow(i11, window).firstPeriodIndex, period, true).uid);
        if (timeline2.getIndexOfPeriod(objCheckNotNull) == -1) {
            return -1;
        }
        return timeline2.getPeriodByUid(objCheckNotNull, period).windowIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(Timeline timeline, int i11, long j11, Timeline.Window window, Timeline.Period period) {
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i11, Util.msToUs(j11)).first);
    }

    private static Player.PositionInfo getPositionInfo(State state, boolean z11, Timeline.Window window, Timeline.Period period) {
        MediaItem mediaItem;
        Object obj;
        Object obj2;
        int i11;
        long contentPositionMsInternal;
        long j11;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        if (!state.timeline.isEmpty()) {
            int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(state, window, period);
            Object obj3 = state.timeline.getPeriod(currentPeriodIndexInternal, period, true).uid;
            obj = state.timeline.getWindow(currentMediaItemIndexInternal, window).uid;
            obj2 = obj3;
            mediaItem = window.mediaItem;
            i11 = currentPeriodIndexInternal;
        } else {
            mediaItem = null;
            obj = null;
            obj2 = null;
            i11 = -1;
        }
        if (z11) {
            j11 = state.discontinuityPositionMs;
            contentPositionMsInternal = state.currentAdGroupIndex == -1 ? j11 : getContentPositionMsInternal(state, window);
        } else {
            contentPositionMsInternal = getContentPositionMsInternal(state, window);
            j11 = state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : contentPositionMsInternal;
        }
        return new Player.PositionInfo(obj, currentMediaItemIndexInternal, mediaItem, obj2, i11, j11, contentPositionMsInternal, state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
    }

    private static State getStateWithNewPlaylist(State state, List<MediaItemData> list, Timeline.Period period, Timeline.Window window) {
        long j11;
        State.Builder builderBuildUpon = state.buildUpon();
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(list);
        Timeline timeline = state.timeline;
        long j12 = state.contentPositionMsSupplier.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, currentMediaItemIndexInternal, period, window);
        if (mediaItemIndexInNewPlaylist == -1) {
            j11 = C2711C.TIME_UNSET;
        } else {
            j11 = j12;
        }
        for (int i11 = currentMediaItemIndexInternal + 1; mediaItemIndexInNewPlaylist == -1 && i11 < timeline.getWindowCount(); i11++) {
            mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, i11, period, window);
        }
        if (state.playbackState != 1 && mediaItemIndexInNewPlaylist == -1) {
            builderBuildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return buildStateForNewPosition(builderBuildUpon, state, j12, playlistTimeline, mediaItemIndexInNewPlaylist, j11, true, window);
    }

    private static State getStateWithNewPlaylistAndPosition(State state, @Nullable List<MediaItemData> list, int i11, long j11, Timeline.Window window) {
        Timeline playlistTimeline;
        State.Builder builderBuildUpon = state.buildUpon();
        if (list == null) {
            playlistTimeline = state.timeline;
        } else {
            playlistTimeline = new PlaylistTimeline(list);
        }
        if (state.playbackState != 1) {
            if (!playlistTimeline.isEmpty() && (i11 == -1 || i11 < playlistTimeline.getWindowCount())) {
                builderBuildUpon.setPlaybackState(2);
            } else {
                builderBuildUpon.setPlaybackState(4).setIsLoading(false);
            }
        }
        return buildStateForNewPosition(builderBuildUpon, state, state.contentPositionMsSupplier.get(), playlistTimeline, i11, j11, false, window);
    }

    private static Size getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return Size.ZERO;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new Size(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getTimelineChangeReason(Timeline timeline, Timeline timeline2, Timeline.Window window) {
        if (timeline.getWindowCount() != timeline2.getWindowCount()) {
            return 0;
        }
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= timeline.getWindowCount()) {
                return 1;
            }
            Object obj = timeline.getWindow(i11, window).uid;
            Object obj2 = timeline2.getWindow(i11, window).uid;
            if (!(obj instanceof PlaceholderUid) || (obj2 instanceof PlaceholderUid)) {
                z11 = false;
            }
            if (!obj.equals(obj2) && !z11) {
                return 0;
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ State m2935n(State state) {
        int i11;
        State.Builder playerError = state.buildUpon().setPlayerError(null);
        if (state.timeline.isEmpty()) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        return playerError.setPlaybackState(i11).build();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m2940s(SimpleBasePlayer simpleBasePlayer, Player.Listener listener, FlagSet flagSet) {
        simpleBasePlayer.getClass();
        listener.onEvents(simpleBasePlayer, new Player.Events(flagSet));
    }

    private void verifyApplicationThreadAndInitState() {
        verifyApplicationThread();
        if (this.state == null) {
            this.state = getState();
        }
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i11, final List<MediaItem> list) {
        boolean z11;
        verifyApplicationThreadAndInitState();
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (shouldHandleCommand(20) && !list.isEmpty()) {
            final int iMin = Math.min(i11, windowCount);
            updateStateForPendingOperation(handleAddMediaItems(iMin, list), new Supplier() { // from class: androidx.media3.common.a1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return SimpleBasePlayer.m2887D(this.f2795b, state, list, iMin);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(@Nullable TextureView textureView) {
        clearVideoOutput(textureView);
    }

    @Override // androidx.media3.common.Player
    public final AudioAttributes getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.state.audioAttributes;
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            return Math.max(this.state.adBufferedPositionMsSupplier.get(), this.state.adPositionMsSupplier.get());
        }
        return getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return Math.max(getContentBufferedPositionMsInternal(this.state, this.window), getContentPositionMsInternal(this.state, this.window));
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.state, this.window);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdIndexInAdGroup;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.state.currentCues;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.state, this.window, this.period);
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            return this.state.adPositionMsSupplier.get();
        }
        return getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public final Timeline getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.state.timeline;
    }

    @Override // androidx.media3.common.Player
    public final Tracks getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return this.state.currentTracks;
    }

    @Override // androidx.media3.common.Player
    public final DeviceInfo getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceVolume;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            this.state.timeline.getPeriod(getCurrentPeriodIndex(), this.period);
            Timeline.Period period = this.period;
            State state = this.state;
            return Util.usToMs(period.getAdDurationUs(state.currentAdGroupIndex, state.currentAdIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.state.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.currentMetadata;
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackState;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public final PlaybackException getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.state.playerError;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.playlistMetadata;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.state.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekForwardIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.state.shuffleModeEnabled;
    }

    @Override // androidx.media3.common.Player
    public final Size getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.state.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.state.totalBufferedDurationMsSupplier.get();
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.trackSelectionParameters;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.state.videoSize;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.volume;
    }

    @ForOverride
    public ListenableFuture<?> handleReplaceMediaItems(int i11, int i12, List<MediaItem> list) {
        ListenableFuture<?> listenableFutureHandleAddMediaItems = handleAddMediaItems(i12, list);
        final ListenableFuture<?> listenableFutureHandleRemoveMediaItems = handleRemoveMediaItems(i11, i12);
        return Util.transformFutureAsync(listenableFutureHandleAddMediaItems, new AsyncFunction() { // from class: androidx.media3.common.t1
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return SimpleBasePlayer.m2939r(listenableFutureHandleRemoveMediaItems, obj);
            }
        });
    }

    public final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (this.pendingOperations.isEmpty() && !this.released) {
            updateStateAndInformListeners(getState(), false, false);
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.state.isDeviceMuted;
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.state.isLoading;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        if (this.state.currentAdGroupIndex != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(final int i11, int i12, int i13) {
        boolean z11;
        verifyApplicationThreadAndInitState();
        if (i11 >= 0 && i12 >= i11 && i13 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (shouldHandleCommand(20) && windowCount != 0 && i11 < windowCount) {
            final int iMin = Math.min(i12, windowCount);
            final int iMin2 = Math.min(i13, windowCount - (iMin - i11));
            if (i11 != iMin && iMin2 != i11) {
                updateStateForPendingOperation(handleMoveMediaItems(i11, iMin, iMin2), new Supplier() { // from class: androidx.media3.common.o1
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        return SimpleBasePlayer.m2892I(this.f2851b, state, i11, iMin, iMin2);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(2)) {
            return;
        }
        updateStateForPendingOperation(handlePrepare(), new Supplier() { // from class: androidx.media3.common.w1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return SimpleBasePlayer.m2935n(state);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(32)) {
            return;
        }
        updateStateForPendingOperation(handleRelease(), new Supplier() { // from class: androidx.media3.common.j1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return SimpleBasePlayer.m2933l0(state);
            }
        });
        this.released = true;
        this.listeners.release();
        this.state = this.state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO).setContentBufferedPositionMs(PositionSupplier.getConstant(getContentPositionMsInternal(state, this.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(Player.Listener listener) {
        verifyApplicationThreadAndInitState();
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(final int i11, int i12) {
        boolean z11;
        final int iMin;
        verifyApplicationThreadAndInitState();
        if (i11 >= 0 && i12 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (shouldHandleCommand(20) && windowCount != 0 && i11 < windowCount && i11 != (iMin = Math.min(i12, windowCount))) {
            updateStateForPendingOperation(handleRemoveMediaItems(i11, iMin), new Supplier() { // from class: androidx.media3.common.s1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return SimpleBasePlayer.m2914c(this.f2870b, state, i11, iMin);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(final int i11, int i12, final List<MediaItem> list) {
        boolean z11;
        verifyApplicationThreadAndInitState();
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (shouldHandleCommand(20) && i11 <= windowCount) {
            final int iMin = Math.min(i12, windowCount);
            updateStateForPendingOperation(handleReplaceMediaItems(i11, iMin, list), new Supplier() { // from class: androidx.media3.common.t0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return SimpleBasePlayer.m2936o(this.f2875b, state, list, iMin, i11);
                }
            });
        }
    }

    @Override // androidx.media3.common.BasePlayer
    @VisibleForTesting(otherwise = 4)
    public final void seekTo(final int i11, final long j11, int i12, boolean z11) {
        boolean z12;
        final boolean z13;
        verifyApplicationThreadAndInitState();
        if (i11 != -1 && i11 < 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        Assertions.checkArgument(z12);
        final State state = this.state;
        if (!shouldHandleCommand(i12)) {
            return;
        }
        if (i11 != -1 && !isPlayingAd() && (state.timeline.isEmpty() || i11 < state.timeline.getWindowCount())) {
            z13 = false;
        } else {
            z13 = true;
        }
        updateStateForPendingOperation(handleSeek(i11, j11, i12), new Supplier() { // from class: androidx.media3.common.r1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return SimpleBasePlayer.m2918e(this.f2862b, z13, state, i11, j11);
            }
        }, !z13, z11);
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(final AudioAttributes audioAttributes, boolean z11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(35)) {
            return;
        }
        updateStateForPendingOperation(handleSetAudioAttributes(audioAttributes, z11), new Supplier() { // from class: androidx.media3.common.q1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setAudioAttributes(audioAttributes).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(final boolean z11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(1)) {
            return;
        }
        updateStateForPendingOperation(handleSetPlayWhenReady(z11), new Supplier() { // from class: androidx.media3.common.s
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setPlayWhenReady(z11, 1).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(final PlaybackParameters playbackParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(13)) {
            return;
        }
        updateStateForPendingOperation(handleSetPlaybackParameters(playbackParameters), new Supplier() { // from class: androidx.media3.common.y1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setPlaybackParameters(playbackParameters).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(final MediaMetadata mediaMetadata) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(19)) {
            return;
        }
        updateStateForPendingOperation(handleSetPlaylistMetadata(mediaMetadata), new Supplier() { // from class: androidx.media3.common.f1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setPlaylistMetadata(mediaMetadata).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(final int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(15)) {
            return;
        }
        updateStateForPendingOperation(handleSetRepeatMode(i11), new Supplier() { // from class: androidx.media3.common.g1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setRepeatMode(i11).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(final boolean z11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(14)) {
            return;
        }
        updateStateForPendingOperation(handleSetShuffleModeEnabled(z11), new Supplier() { // from class: androidx.media3.common.b1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setShuffleModeEnabled(z11).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(final TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(29)) {
            return;
        }
        updateStateForPendingOperation(handleSetTrackSelectionParameters(trackSelectionParameters), new Supplier() { // from class: androidx.media3.common.a2
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setTrackSelectionParameters(trackSelectionParameters).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(@Nullable Surface surface) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        if (surface == null) {
            clearVideoSurface();
        } else {
            updateStateForPendingOperation(handleSetVideoOutput(surface), new Supplier() { // from class: androidx.media3.common.v0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return state.buildUpon().setSurfaceSize(Size.UNKNOWN).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(@Nullable final SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        if (surfaceHolder == null) {
            clearVideoSurface();
        } else {
            updateStateForPendingOperation(handleSetVideoOutput(surfaceHolder), new Supplier() { // from class: androidx.media3.common.i1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return state.buildUpon().setSurfaceSize(SimpleBasePlayer.getSurfaceHolderSize(surfaceHolder)).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(@Nullable final SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        if (surfaceView == null) {
            clearVideoSurface();
        } else {
            updateStateForPendingOperation(handleSetVideoOutput(surfaceView), new Supplier() { // from class: androidx.media3.common.l1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return state.buildUpon().setSurfaceSize(SimpleBasePlayer.getSurfaceHolderSize(surfaceView.getHolder())).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(@Nullable TextureView textureView) {
        final Size size;
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        if (textureView.isAvailable()) {
            size = new Size(textureView.getWidth(), textureView.getHeight());
        } else {
            size = Size.ZERO;
        }
        updateStateForPendingOperation(handleSetVideoOutput(textureView), new Supplier() { // from class: androidx.media3.common.o0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setSurfaceSize(size).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(final float f11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(24)) {
            return;
        }
        updateStateForPendingOperation(handleSetVolume(f11), new Supplier() { // from class: androidx.media3.common.h1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return state.buildUpon().setVolume(f11).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(3)) {
            return;
        }
        updateStateForPendingOperation(handleStop(), new Supplier() { // from class: androidx.media3.common.u1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return SimpleBasePlayer.m2900Q(this.f2887b, state);
            }
        });
    }

    public final void verifyApplicationThread() {
        if (Thread.currentThread() == this.applicationLooper.getThread()) {
        } else {
            throw new IllegalStateException(Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
        }
    }

    private static long getPositionOrDefaultInMediaItem(long j11, State state, Timeline.Window window) {
        if (j11 != C2711C.TIME_UNSET) {
            return j11;
        }
        if (state.timeline.isEmpty()) {
            return 0L;
        }
        return state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).getDefaultPositionMs();
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, int i11, long j11) {
        verifyApplicationThreadAndInitState();
        if (i11 == -1) {
            State state = this.state;
            int i12 = state.currentMediaItemIndex;
            long j12 = state.contentPositionMsSupplier.get();
            i11 = i12;
            j11 = j12;
        }
        setMediaItemsInternal(list, i11, j11);
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(i11), new Supplier() { // from class: androidx.media3.common.x1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(Math.max(0, state2.deviceVolume - 1)).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(i11), new Supplier() { // from class: androidx.media3.common.y0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(state2.deviceVolume + 1).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(final boolean z11, int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z11, i11), new Supplier() { // from class: androidx.media3.common.z1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return state.buildUpon().setIsDeviceMuted(z11).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(final int i11, int i12) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i11, i12), new Supplier() { // from class: androidx.media3.common.c1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(i11).build();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ State m2933l0(State state) {
        return state;
    }

    @ForOverride
    public State getPlaceholderState(State state) {
        return state;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ ListenableFuture m2939r(ListenableFuture listenableFuture, Object obj) {
        return listenableFuture;
    }
}
