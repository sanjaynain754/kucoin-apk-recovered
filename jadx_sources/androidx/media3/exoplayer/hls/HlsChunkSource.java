package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.DataChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;
import com.tencent.bugly.proguard.C33820nf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
class HlsChunkSource {
    public static final int CHUNK_PUBLICATION_STATE_PRELOAD = 0;
    public static final int CHUNK_PUBLICATION_STATE_PUBLISHED = 1;
    public static final int CHUNK_PUBLICATION_STATE_REMOVED = 2;
    private static final int KEY_CACHE_SIZE = 4;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final DataSource encryptionDataSource;

    @Nullable
    private Uri expectedPlaylistUrl;
    private final HlsExtractorFactory extractorFactory;

    @Nullable
    private IOException fatalError;
    private boolean independentSegments;
    private boolean isPrimaryTimestampSource;
    private final DataSource mediaDataSource;

    @Nullable
    private final List<Format> muxedCaptionFormats;
    private final PlayerId playerId;
    private final Format[] playlistFormats;
    private final HlsPlaylistTracker playlistTracker;
    private final Uri[] playlistUrls;
    private boolean seenExpectedPlaylistError;
    private final long timestampAdjusterInitializationTimeoutMs;
    private final TimestampAdjusterProvider timestampAdjusterProvider;
    private final TrackGroup trackGroup;
    private ExoTrackSelection trackSelection;
    private long lastChunkRequestRealtimeMs = C2711C.TIME_UNSET;
    private final FullSegmentEncryptionKeyCache keyCache = new FullSegmentEncryptionKeyCache(4);
    private byte[] scratchSpace = Util.EMPTY_BYTE_ARRAY;
    private long liveEdgeInPeriodTimeUs = C2711C.TIME_UNSET;

    public static final class EncryptionKeyChunk extends DataChunk {
        private byte[] result;

        public EncryptionKeyChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i11, @Nullable Object obj, byte[] bArr) {
            super(dataSource, dataSpec, 3, format, i11, obj, bArr);
        }

        @Nullable
        public byte[] getResult() {
            return this.result;
        }

        @Override // androidx.media3.exoplayer.source.chunk.DataChunk
        public void consume(byte[] bArr, int i11) {
            this.result = Arrays.copyOf(bArr, i11);
        }
    }

    public static final class InitializationTrackSelection extends BaseTrackSelection {
        private int selectedIndex;

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.selectedIndex;
        }

        public InitializationTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.selectedIndex = indexOf(trackGroup.getFormat(iArr[0]));
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j11, long j12, long j13, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!isTrackExcluded(this.selectedIndex, jElapsedRealtime)) {
                return;
            }
            for (int i11 = this.length - 1; i11 >= 0; i11--) {
                if (!isTrackExcluded(i11, jElapsedRealtime)) {
                    this.selectedIndex = i11;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    private Pair<Long, Integer> getNextMediaSequenceAndPartIndex(@Nullable HlsMediaChunk hlsMediaChunk, boolean z11, HlsMediaPlaylist hlsMediaPlaylist, long j11, long j12) {
        int i11 = -1;
        if (hlsMediaChunk != null && !z11) {
            if (!hlsMediaChunk.isLoadCompleted()) {
                return new Pair<>(Long.valueOf(hlsMediaChunk.chunkIndex), Integer.valueOf(hlsMediaChunk.partIndex));
            }
            Long lValueOf = Long.valueOf(hlsMediaChunk.partIndex == -1 ? hlsMediaChunk.getNextChunkIndex() : hlsMediaChunk.chunkIndex);
            int i12 = hlsMediaChunk.partIndex;
            return new Pair<>(lValueOf, Integer.valueOf(i12 != -1 ? i12 + 1 : -1));
        }
        long j13 = hlsMediaPlaylist.durationUs + j11;
        if (hlsMediaChunk != null && !this.independentSegments) {
            j12 = hlsMediaChunk.startTimeUs;
        }
        if (!hlsMediaPlaylist.hasEndTag && j12 >= j13) {
            return new Pair<>(Long.valueOf(hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size())), -1);
        }
        long j14 = j12 - j11;
        int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) hlsMediaPlaylist.segments, Long.valueOf(j14), true, !this.playlistTracker.isLive() || hlsMediaChunk == null);
        long j15 = ((long) iBinarySearchFloor) + hlsMediaPlaylist.mediaSequence;
        if (iBinarySearchFloor >= 0) {
            HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(iBinarySearchFloor);
            List<HlsMediaPlaylist.Part> list = j14 < segment.relativeStartTimeUs + segment.durationUs ? segment.parts : hlsMediaPlaylist.trailingParts;
            for (int i13 = 0; i13 < list.size(); i13++) {
                HlsMediaPlaylist.Part part = list.get(i13);
                if (j14 < part.relativeStartTimeUs + part.durationUs) {
                    if (!part.isIndependent) {
                        break;
                    }
                    j15 += list == hlsMediaPlaylist.trailingParts ? 1L : 0L;
                    i11 = i13;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j15), Integer.valueOf(i11));
    }

    @Nullable
    private Chunk maybeCreateEncryptionChunkFor(@Nullable Uri uri, int i11, boolean z11, @Nullable CmcdData.Factory factory) {
        if (uri == null) {
            return null;
        }
        byte[] bArrRemove = this.keyCache.remove(uri);
        if (bArrRemove != null) {
            this.keyCache.put(uri, bArrRemove);
            return null;
        }
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(uri).setFlags(1).build();
        if (factory != null) {
            if (z11) {
                factory.setObjectType("i");
            }
            dataSpecBuild = factory.createCmcdData().addToDataSpec(dataSpecBuild);
        }
        return new EncryptionKeyChunk(this.encryptionDataSource, dataSpecBuild, this.playlistFormats[i11], this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.scratchSpace);
    }

    public void getNextChunk(LoadingInfo loadingInfo, long j11, List<HlsMediaChunk> list, boolean z11, HlsChunkHolder hlsChunkHolder) {
        HlsMediaChunk hlsMediaChunk;
        long j12;
        CmcdData.Factory objectType;
        HlsMediaChunk hlsMediaChunk2 = list.isEmpty() ? null : (HlsMediaChunk) Iterables.getLast(list);
        int iIndexOf = hlsMediaChunk2 == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk2.trackFormat);
        long j13 = loadingInfo.playbackPositionUs;
        long jMax = j11 - j13;
        long jResolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j13);
        if (hlsMediaChunk2 != null && !this.independentSegments) {
            long durationUs = hlsMediaChunk2.getDurationUs();
            jMax = Math.max(0L, jMax - durationUs);
            if (jResolveTimeToLiveEdgeUs != C2711C.TIME_UNSET) {
                jResolveTimeToLiveEdgeUs = Math.max(0L, jResolveTimeToLiveEdgeUs - durationUs);
            }
        }
        long j14 = jMax;
        this.trackSelection.updateSelectedTrack(j13, j14, jResolveTimeToLiveEdgeUs, list, createMediaChunkIterators(hlsMediaChunk2, j11));
        int selectedIndexInTrackGroup = this.trackSelection.getSelectedIndexInTrackGroup();
        boolean z12 = iIndexOf != selectedIndexInTrackGroup;
        Uri uri = this.playlistUrls[selectedIndexInTrackGroup];
        if (!this.playlistTracker.isSnapshotValid(uri)) {
            hlsChunkHolder.playlistUrl = uri;
            this.seenExpectedPlaylistError &= uri.equals(this.expectedPlaylistUrl);
            this.expectedPlaylistUrl = uri;
            return;
        }
        HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri, true);
        Assertions.checkNotNull(playlistSnapshot);
        this.independentSegments = playlistSnapshot.hasIndependentSegments;
        updateLiveEdgeTimeUs(playlistSnapshot);
        HlsMediaPlaylist playlistSnapshot2 = playlistSnapshot;
        Uri uri2 = uri;
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(hlsMediaChunk2, z12, playlistSnapshot2, initialStartTimeUs, j11);
        long jLongValue = ((Long) nextMediaSequenceAndPartIndex.first).longValue();
        int iIntValue = ((Integer) nextMediaSequenceAndPartIndex.second).intValue();
        HlsMediaChunk hlsMediaChunk3 = hlsMediaChunk2;
        boolean z13 = z12;
        if (jLongValue >= playlistSnapshot2.mediaSequence || hlsMediaChunk3 == null || !z13) {
            hlsMediaChunk = hlsMediaChunk3;
        } else {
            uri2 = this.playlistUrls[iIndexOf];
            playlistSnapshot2 = this.playlistTracker.getPlaylistSnapshot(uri2, true);
            Assertions.checkNotNull(playlistSnapshot2);
            initialStartTimeUs = playlistSnapshot2.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
            hlsMediaChunk = hlsMediaChunk3;
            Pair<Long, Integer> nextMediaSequenceAndPartIndex2 = getNextMediaSequenceAndPartIndex(hlsMediaChunk, false, playlistSnapshot2, initialStartTimeUs, j11);
            jLongValue = ((Long) nextMediaSequenceAndPartIndex2.first).longValue();
            iIntValue = ((Integer) nextMediaSequenceAndPartIndex2.second).intValue();
            selectedIndexInTrackGroup = iIndexOf;
        }
        int i11 = iIntValue;
        long j15 = initialStartTimeUs;
        HlsMediaPlaylist hlsMediaPlaylist = playlistSnapshot2;
        Uri uri3 = uri2;
        if (selectedIndexInTrackGroup != iIndexOf && iIndexOf != -1) {
            this.playlistTracker.deactivatePlaylistForPlayback(this.playlistUrls[iIndexOf]);
        }
        if (jLongValue < hlsMediaPlaylist.mediaSequence) {
            this.fatalError = new BehindLiveWindowException();
            return;
        }
        SegmentBaseHolder nextSegmentHolder = getNextSegmentHolder(hlsMediaPlaylist, jLongValue, i11);
        if (nextSegmentHolder != null) {
            j12 = 1;
        } else if (!hlsMediaPlaylist.hasEndTag) {
            hlsChunkHolder.playlistUrl = uri3;
            this.seenExpectedPlaylistError &= uri3.equals(this.expectedPlaylistUrl);
            this.expectedPlaylistUrl = uri3;
            return;
        } else if (z11 || hlsMediaPlaylist.segments.isEmpty()) {
            hlsChunkHolder.endOfStream = true;
            return;
        } else {
            j12 = 1;
            nextSegmentHolder = new SegmentBaseHolder((HlsMediaPlaylist.SegmentBase) Iterables.getLast(hlsMediaPlaylist.segments), (hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size())) - 1, -1);
        }
        SegmentBaseHolder segmentBaseHolder = nextSegmentHolder;
        this.seenExpectedPlaylistError = false;
        this.expectedPlaylistUrl = null;
        if (this.cmcdConfiguration != null) {
            objectType = new CmcdData.Factory(this.cmcdConfiguration, this.trackSelection, Math.max(0L, j14), loadingInfo.playbackSpeed, CmcdData.Factory.STREAMING_FORMAT_HLS, !hlsMediaPlaylist.hasEndTag, loadingInfo.rebufferedSince(this.lastChunkRequestRealtimeMs), list.isEmpty()).setObjectType(getIsMuxedAudioAndVideo() ? CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO : CmcdData.Factory.getObjectType(this.trackSelection));
            int i12 = segmentBaseHolder.partIndex;
            SegmentBaseHolder nextSegmentHolder2 = getNextSegmentHolder(hlsMediaPlaylist, i12 == -1 ? segmentBaseHolder.mediaSequence + j12 : segmentBaseHolder.mediaSequence, i12 == -1 ? -1 : i12 + 1);
            if (nextSegmentHolder2 != null) {
                objectType.setNextObjectRequest(UriUtil.getRelativePath(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segmentBaseHolder.segmentBase.url), UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, nextSegmentHolder2.segmentBase.url)));
                String string = nextSegmentHolder2.segmentBase.byteRangeOffset + C33820nf.f71144W;
                if (nextSegmentHolder2.segmentBase.byteRangeLength != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    HlsMediaPlaylist.SegmentBase segmentBase = nextSegmentHolder2.segmentBase;
                    sb2.append(segmentBase.byteRangeOffset + segmentBase.byteRangeLength);
                    string = sb2.toString();
                }
                objectType.setNextRangeRequest(string);
            }
        } else {
            objectType = null;
        }
        this.lastChunkRequestRealtimeMs = SystemClock.elapsedRealtime();
        Uri fullEncryptionKeyUri = getFullEncryptionKeyUri(hlsMediaPlaylist, segmentBaseHolder.segmentBase.initializationSegment);
        Chunk chunkMaybeCreateEncryptionChunkFor = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri, selectedIndexInTrackGroup, true, objectType);
        hlsChunkHolder.chunk = chunkMaybeCreateEncryptionChunkFor;
        if (chunkMaybeCreateEncryptionChunkFor != null) {
            return;
        }
        Uri fullEncryptionKeyUri2 = getFullEncryptionKeyUri(hlsMediaPlaylist, segmentBaseHolder.segmentBase);
        Chunk chunkMaybeCreateEncryptionChunkFor2 = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri2, selectedIndexInTrackGroup, false, objectType);
        hlsChunkHolder.chunk = chunkMaybeCreateEncryptionChunkFor2;
        if (chunkMaybeCreateEncryptionChunkFor2 != null) {
            return;
        }
        boolean zShouldSpliceIn = HlsMediaChunk.shouldSpliceIn(hlsMediaChunk, uri3, hlsMediaPlaylist, segmentBaseHolder, j15);
        if (zShouldSpliceIn && segmentBaseHolder.isPreload) {
            return;
        }
        hlsChunkHolder.chunk = HlsMediaChunk.createInstance(this.extractorFactory, this.mediaDataSource, this.playlistFormats[selectedIndexInTrackGroup], j15, hlsMediaPlaylist, segmentBaseHolder, uri3, this.muxedCaptionFormats, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.isPrimaryTimestampSource, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, hlsMediaChunk, this.keyCache.get(fullEncryptionKeyUri2), this.keyCache.get(fullEncryptionKeyUri), zShouldSpliceIn, this.playerId, objectType);
    }

    public boolean onPlaylistError(Uri uri, long j11) {
        int iIndexOf;
        int i11 = 0;
        while (true) {
            Uri[] uriArr = this.playlistUrls;
            if (i11 >= uriArr.length) {
                i11 = -1;
                break;
            }
            if (uriArr[i11].equals(uri)) {
                break;
            }
            i11++;
        }
        if (i11 == -1 || (iIndexOf = this.trackSelection.indexOf(i11)) == -1) {
            return true;
        }
        this.seenExpectedPlaylistError |= uri.equals(this.expectedPlaylistUrl);
        return j11 == C2711C.TIME_UNSET || (this.trackSelection.excludeTrack(iIndexOf, j11) && this.playlistTracker.excludeMediaPlaylist(uri, j11));
    }

    public static final class HlsChunkHolder {

        @Nullable
        public Chunk chunk;
        public boolean endOfStream;

        @Nullable
        public Uri playlistUrl;

        public void clear() {
            this.chunk = null;
            this.endOfStream = false;
            this.playlistUrl = null;
        }

        public HlsChunkHolder() {
            clear();
        }
    }

    @VisibleForTesting
    public static final class HlsMediaPlaylistSegmentIterator extends BaseMediaChunkIterator {
        private final String playlistBaseUri;
        private final List<HlsMediaPlaylist.SegmentBase> segmentBases;
        private final long startOfPlaylistInPeriodUs;

        public HlsMediaPlaylistSegmentIterator(String str, long j11, List<HlsMediaPlaylist.SegmentBase> list) {
            super(0L, list.size() - 1);
            this.playlistBaseUri = str;
            this.startOfPlaylistInPeriodUs = j11;
            this.segmentBases = list;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return this.startOfPlaylistInPeriodUs + segmentBase.relativeStartTimeUs + segmentBase.durationUs;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.startOfPlaylistInPeriodUs + this.segmentBases.get((int) getCurrentIndex()).relativeStartTimeUs;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return new DataSpec(UriUtil.resolveToUri(this.playlistBaseUri, segmentBase.url), segmentBase.byteRangeOffset, segmentBase.byteRangeLength);
        }
    }

    public static final class SegmentBaseHolder {
        public final boolean isPreload;
        public final long mediaSequence;
        public final int partIndex;
        public final HlsMediaPlaylist.SegmentBase segmentBase;

        public SegmentBaseHolder(HlsMediaPlaylist.SegmentBase segmentBase, long j11, int i11) {
            boolean z11;
            this.segmentBase = segmentBase;
            this.mediaSequence = j11;
            this.partIndex = i11;
            if ((segmentBase instanceof HlsMediaPlaylist.Part) && ((HlsMediaPlaylist.Part) segmentBase).isPreload) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.isPreload = z11;
        }
    }

    private void deactivatePlaylistForSelectedTrack() {
        this.playlistTracker.deactivatePlaylistForPlayback(this.playlistUrls[this.trackSelection.getSelectedIndexInTrackGroup()]);
    }

    @Nullable
    private static Uri getFullEncryptionKeyUri(HlsMediaPlaylist hlsMediaPlaylist, @Nullable HlsMediaPlaylist.SegmentBase segmentBase) {
        String str;
        if (segmentBase == null || (str = segmentBase.fullSegmentEncryptionKeyUri) == null) {
            return null;
        }
        return UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, str);
    }

    private boolean getIsMuxedAudioAndVideo() {
        Format format = this.trackGroup.getFormat(this.trackSelection.getSelectedIndex());
        return (MimeTypes.getAudioMediaMimeType(format.codecs) == null || MimeTypes.getVideoMediaMimeType(format.codecs) == null) ? false : true;
    }

    @Nullable
    private static SegmentBaseHolder getNextSegmentHolder(HlsMediaPlaylist hlsMediaPlaylist, long j11, int i11) {
        int i12 = (int) (j11 - hlsMediaPlaylist.mediaSequence);
        if (i12 == hlsMediaPlaylist.segments.size()) {
            if (i11 == -1) {
                i11 = 0;
            }
            if (i11 < hlsMediaPlaylist.trailingParts.size()) {
                return new SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(i11), j11, i11);
            }
            return null;
        }
        HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i12);
        if (i11 == -1) {
            return new SegmentBaseHolder(segment, j11, -1);
        }
        if (i11 < segment.parts.size()) {
            return new SegmentBaseHolder(segment.parts.get(i11), j11, i11);
        }
        int i13 = i12 + 1;
        if (i13 < hlsMediaPlaylist.segments.size()) {
            return new SegmentBaseHolder(hlsMediaPlaylist.segments.get(i13), j11 + 1, -1);
        }
        if (hlsMediaPlaylist.trailingParts.isEmpty()) {
            return null;
        }
        return new SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(0), j11 + 1, 0);
    }

    @VisibleForTesting
    public static List<HlsMediaPlaylist.SegmentBase> getSegmentBaseList(HlsMediaPlaylist hlsMediaPlaylist, long j11, int i11) {
        int i12 = (int) (j11 - hlsMediaPlaylist.mediaSequence);
        if (i12 < 0 || hlsMediaPlaylist.segments.size() < i12) {
            return ImmutableList.m13439of();
        }
        ArrayList arrayList = new ArrayList();
        if (i12 < hlsMediaPlaylist.segments.size()) {
            if (i11 != -1) {
                HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i12);
                if (i11 == 0) {
                    arrayList.add(segment);
                } else if (i11 < segment.parts.size()) {
                    List<HlsMediaPlaylist.Part> list = segment.parts;
                    arrayList.addAll(list.subList(i11, list.size()));
                }
                i12++;
            }
            List<HlsMediaPlaylist.Segment> list2 = hlsMediaPlaylist.segments;
            arrayList.addAll(list2.subList(i12, list2.size()));
            i11 = 0;
        }
        if (hlsMediaPlaylist.partTargetDurationUs != C2711C.TIME_UNSET) {
            int i13 = i11 != -1 ? i11 : 0;
            if (i13 < hlsMediaPlaylist.trailingParts.size()) {
                List<HlsMediaPlaylist.Part> list3 = hlsMediaPlaylist.trailingParts;
                arrayList.addAll(list3.subList(i13, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private long resolveTimeToLiveEdgeUs(long j11) {
        long j12 = this.liveEdgeInPeriodTimeUs;
        return j12 != C2711C.TIME_UNSET ? j12 - j11 : C2711C.TIME_UNSET;
    }

    private void updateLiveEdgeTimeUs(HlsMediaPlaylist hlsMediaPlaylist) {
        this.liveEdgeInPeriodTimeUs = hlsMediaPlaylist.hasEndTag ? C2711C.TIME_UNSET : hlsMediaPlaylist.getEndTimeUs() - this.playlistTracker.getInitialStartTimeUs();
    }

    public MediaChunkIterator[] createMediaChunkIterators(@Nullable HlsMediaChunk hlsMediaChunk, long j11) {
        int iIndexOf = hlsMediaChunk == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk.trackFormat);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        for (int i11 = 0; i11 < length; i11++) {
            int indexInTrackGroup = this.trackSelection.getIndexInTrackGroup(i11);
            Uri uri = this.playlistUrls[indexInTrackGroup];
            if (this.playlistTracker.isSnapshotValid(uri)) {
                HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri, false);
                Assertions.checkNotNull(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
                Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(hlsMediaChunk, indexInTrackGroup != iIndexOf, playlistSnapshot, initialStartTimeUs, j11);
                mediaChunkIteratorArr[i11] = new HlsMediaPlaylistSegmentIterator(playlistSnapshot.baseUri, initialStartTimeUs, getSegmentBaseList(playlistSnapshot, ((Long) nextMediaSequenceAndPartIndex.first).longValue(), ((Integer) nextMediaSequenceAndPartIndex.second).intValue()));
            } else {
                mediaChunkIteratorArr[i11] = MediaChunkIterator.EMPTY;
            }
        }
        return mediaChunkIteratorArr;
    }

    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        int selectedIndex = this.trackSelection.getSelectedIndex();
        Uri[] uriArr = this.playlistUrls;
        HlsMediaPlaylist playlistSnapshot = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : this.playlistTracker.getPlaylistSnapshot(uriArr[this.trackSelection.getSelectedIndexInTrackGroup()], true);
        if (playlistSnapshot == null || playlistSnapshot.segments.isEmpty() || !playlistSnapshot.hasIndependentSegments) {
            return j11;
        }
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        long j12 = j11 - initialStartTimeUs;
        int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) playlistSnapshot.segments, Long.valueOf(j12), true, true);
        long j13 = playlistSnapshot.segments.get(iBinarySearchFloor).relativeStartTimeUs;
        return seekParameters.resolveSeekPositionUs(j12, j13, iBinarySearchFloor != playlistSnapshot.segments.size() - 1 ? playlistSnapshot.segments.get(iBinarySearchFloor + 1).relativeStartTimeUs : j13) + initialStartTimeUs;
    }

    public int getChunkPublicationState(HlsMediaChunk hlsMediaChunk) {
        if (hlsMediaChunk.partIndex == -1) {
            return 1;
        }
        HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) Assertions.checkNotNull(this.playlistTracker.getPlaylistSnapshot(this.playlistUrls[this.trackGroup.indexOf(hlsMediaChunk.trackFormat)], false));
        int i11 = (int) (hlsMediaChunk.chunkIndex - hlsMediaPlaylist.mediaSequence);
        if (i11 < 0) {
            return 1;
        }
        List<HlsMediaPlaylist.Part> list = i11 < hlsMediaPlaylist.segments.size() ? hlsMediaPlaylist.segments.get(i11).parts : hlsMediaPlaylist.trailingParts;
        if (hlsMediaChunk.partIndex >= list.size()) {
            return 2;
        }
        HlsMediaPlaylist.Part part = list.get(hlsMediaChunk.partIndex);
        if (part.isPreload) {
            return 0;
        }
        return Util.areEqual(Uri.parse(UriUtil.resolve(hlsMediaPlaylist.baseUri, part.url)), hlsMediaChunk.dataSpec.uri) ? 1 : 2;
    }

    public int getPreferredQueueSize(long j11, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j11, list);
    }

    public TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public ExoTrackSelection getTrackSelection() {
        return this.trackSelection;
    }

    public boolean hasIndependentSegments() {
        return this.independentSegments;
    }

    public boolean maybeExcludeTrack(Chunk chunk, long j11) {
        ExoTrackSelection exoTrackSelection = this.trackSelection;
        return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(this.trackGroup.indexOf(chunk.trackFormat)), j11);
    }

    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.expectedPlaylistUrl;
        if (uri == null || !this.seenExpectedPlaylistError) {
            return;
        }
        this.playlistTracker.maybeThrowPlaylistRefreshError(uri);
    }

    public boolean obtainsChunksForPlaylist(Uri uri) {
        return Util.contains(this.playlistUrls, uri);
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        if (chunk instanceof EncryptionKeyChunk) {
            EncryptionKeyChunk encryptionKeyChunk = (EncryptionKeyChunk) chunk;
            this.scratchSpace = encryptionKeyChunk.getDataHolder();
            this.keyCache.put(encryptionKeyChunk.dataSpec.uri, (byte[]) Assertions.checkNotNull(encryptionKeyChunk.getResult()));
        }
    }

    public void setIsPrimaryTimestampSource(boolean z11) {
        this.isPrimaryTimestampSource = z11;
    }

    public boolean shouldCancelLoad(long j11, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j11, chunk, list);
    }

    public HlsChunkSource(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, TimestampAdjusterProvider timestampAdjusterProvider, long j11, @Nullable List<Format> list, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.playlistUrls = uriArr;
        this.playlistFormats = formatArr;
        this.timestampAdjusterProvider = timestampAdjusterProvider;
        this.timestampAdjusterInitializationTimeoutMs = j11;
        this.muxedCaptionFormats = list;
        this.playerId = playerId;
        this.cmcdConfiguration = cmcdConfiguration;
        DataSource dataSourceCreateDataSource = hlsDataSourceFactory.createDataSource(1);
        this.mediaDataSource = dataSourceCreateDataSource;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        this.encryptionDataSource = hlsDataSourceFactory.createDataSource(3);
        this.trackGroup = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < uriArr.length; i11++) {
            if ((formatArr[i11].roleFlags & 16384) == 0) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        this.trackSelection = new InitializationTrackSelection(this.trackGroup, Ints.toArray(arrayList));
    }

    public void reset() {
        deactivatePlaylistForSelectedTrack();
        this.fatalError = null;
    }

    public void setTrackSelection(ExoTrackSelection exoTrackSelection) {
        deactivatePlaylistForSelectedTrack();
        this.trackSelection = exoTrackSelection;
    }
}
