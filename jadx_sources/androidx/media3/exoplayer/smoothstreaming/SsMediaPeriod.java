package androidx.media3.exoplayer.smoothstreaming;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifest;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStream;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class SsMediaPeriod implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<SsChunkSource>> {
    private final Allocator allocator;

    @Nullable
    private MediaPeriod.Callback callback;
    private final SsChunkSource.Factory chunkSourceFactory;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private SsManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private ChunkSampleStream<SsChunkSource>[] sampleStreams = newSampleStreamArray(0);
    private final TrackGroupArray trackGroups;

    @Nullable
    private final TransferListener transferListener;

    private ChunkSampleStream<SsChunkSource> buildSampleStream(ExoTrackSelection exoTrackSelection, long j11) {
        int iIndexOf = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
        return new ChunkSampleStream<>(this.manifest.streamElements[iIndexOf].type, null, null, this.chunkSourceFactory.createChunkSource(this.manifestLoaderErrorThrower, this.manifest, iIndexOf, exoTrackSelection, this.transferListener, this.cmcdConfiguration), this, this.allocator, j11, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.mediaSourceEventDispatcher, false, null);
    }

    private static TrackGroupArray buildTrackGroups(SsManifest ssManifest, DrmSessionManager drmSessionManager, SsChunkSource.Factory factory) {
        TrackGroup[] trackGroupArr = new TrackGroup[ssManifest.streamElements.length];
        int i11 = 0;
        while (true) {
            SsManifest.StreamElement[] streamElementArr = ssManifest.streamElements;
            if (i11 >= streamElementArr.length) {
                return new TrackGroupArray(trackGroupArr);
            }
            Format[] formatArr = streamElementArr[i11].formats;
            Format[] formatArr2 = new Format[formatArr.length];
            for (int i12 = 0; i12 < formatArr.length; i12++) {
                Format format = formatArr[i12];
                formatArr2[i12] = factory.getOutputTextFormat(format.buildUpon().setCryptoType(drmSessionManager.getCryptoType(format)).build());
            }
            trackGroupArr[i11] = new TrackGroup(Integer.toString(i11), formatArr2);
            i11++;
        }
    }

    private static ChunkSampleStream<SsChunkSource>[] newSampleStreamArray(int i11) {
        return new ChunkSampleStream[i11];
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.compositeSequenceableLoader.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.discardBuffer(j11, z11);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(j11, seekParameters);
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ExoTrackSelection exoTrackSelection = list.get(i11);
            int iIndexOf = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
            for (int i12 = 0; i12 < exoTrackSelection.length(); i12++) {
                arrayList.add(new StreamKey(iIndexOf, exoTrackSelection.getIndexInTrackGroup(i12)));
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(ChunkSampleStream<SsChunkSource> chunkSampleStream) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        this.compositeSequenceableLoader.reevaluateBuffer(j11);
    }

    public void release() {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.release();
        }
        this.callback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) throws Throwable {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.seekToUs(j11);
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        ExoTrackSelection exoTrackSelection;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            SampleStream sampleStream = sampleStreamArr[i11];
            if (sampleStream != null) {
                ChunkSampleStream chunkSampleStream = (ChunkSampleStream) sampleStream;
                if (exoTrackSelectionArr[i11] == null || !zArr[i11]) {
                    chunkSampleStream.release();
                    sampleStreamArr[i11] = null;
                } else {
                    ((SsChunkSource) chunkSampleStream.getChunkSource()).updateTrackSelection((ExoTrackSelection) Assertions.checkNotNull(exoTrackSelectionArr[i11]));
                    arrayList.add(chunkSampleStream);
                }
            }
            if (sampleStreamArr[i11] == null && (exoTrackSelection = exoTrackSelectionArr[i11]) != null) {
                ChunkSampleStream<SsChunkSource> chunkSampleStreamBuildSampleStream = buildSampleStream(exoTrackSelection, j11);
                arrayList.add(chunkSampleStreamBuildSampleStream);
                sampleStreamArr[i11] = chunkSampleStreamBuildSampleStream;
                zArr2[i11] = true;
            }
        }
        ChunkSampleStream<SsChunkSource>[] chunkSampleStreamArrNewSampleStreamArray = newSampleStreamArray(arrayList.size());
        this.sampleStreams = chunkSampleStreamArrNewSampleStreamArray;
        arrayList.toArray(chunkSampleStreamArrNewSampleStreamArray);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(arrayList, Lists.transform(arrayList, new Function() { // from class: androidx.media3.exoplayer.smoothstreaming.a
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ImmutableList.m13440of(Integer.valueOf(((ChunkSampleStream) obj).primaryTrackType));
            }
        }));
        return j11;
    }

    public void updateManifest(SsManifest ssManifest) {
        this.manifest = ssManifest;
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            ((SsChunkSource) chunkSampleStream.getChunkSource()).updateManifest(ssManifest);
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    public SsMediaPeriod(SsManifest ssManifest, SsChunkSource.Factory factory, @Nullable TransferListener transferListener, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, LoaderErrorThrower loaderErrorThrower, Allocator allocator) {
        this.manifest = ssManifest;
        this.chunkSourceFactory = factory;
        this.transferListener = transferListener;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.trackGroups = buildTrackGroups(ssManifest, drmSessionManager, factory);
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return C2711C.TIME_UNSET;
    }
}
