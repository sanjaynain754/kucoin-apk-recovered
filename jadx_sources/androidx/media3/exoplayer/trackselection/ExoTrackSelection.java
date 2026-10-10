package androidx.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface ExoTrackSelection extends TrackSelection {

    public static final class Definition {
        private static final String TAG = "ETSDefinition";
        public final TrackGroup group;
        public final int[] tracks;
        public final int type;

        public Definition(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0);
        }

        public Definition(TrackGroup trackGroup, int[] iArr, int i11) {
            if (iArr.length == 0) {
                Log.m2958e(TAG, "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.group = trackGroup;
            this.tracks = iArr;
            this.type = i11;
        }
    }

    public interface Factory {
        ExoTrackSelection[] createTrackSelections(Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);
    }

    void disable();

    void enable();

    int evaluateQueueSize(long j11, List<? extends MediaChunk> list);

    boolean excludeTrack(int i11, long j11);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    boolean isTrackExcluded(int i11, long j11);

    void onPlaybackSpeed(float f11);

    default boolean shouldCancelChunkLoad(long j11, Chunk chunk, List<? extends MediaChunk> list) {
        return false;
    }

    void updateSelectedTrack(long j11, long j12, long j13, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);

    default long getLatestBitrateEstimate() {
        return -2147483647L;
    }

    default void onDiscontinuity() {
    }

    default void onRebuffer() {
    }

    default void onPlayWhenReadyChanged(boolean z11) {
    }
}
