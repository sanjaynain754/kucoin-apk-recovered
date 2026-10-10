package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import com.tencent.bugly.proguard.C33844oi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
final class HlsMediaPeriod implements MediaPeriod, HlsPlaylistTracker.PlaylistEventListener {
    private final Allocator allocator;
    private final boolean allowChunklessPreparation;
    private int audioVideoSampleStreamWrapperCount;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final HlsExtractorFactory extractorFactory;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    private MediaPeriod.Callback mediaPeriodCallback;

    @Nullable
    private final TransferListener mediaTransferListener;
    private final int metadataType;
    private int pendingPrepareCount;
    private final PlayerId playerId;
    private final HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private TrackGroupArray trackGroups;
    private final boolean useSessionKeys;
    private final HlsSampleStreamWrapper.Callback sampleStreamWrapperCallback = new SampleStreamWrapperCallback();
    private final IdentityHashMap<SampleStream, Integer> streamWrapperIndices = new IdentityHashMap<>();
    private final TimestampAdjusterProvider timestampAdjusterProvider = new TimestampAdjusterProvider();
    private HlsSampleStreamWrapper[] sampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private HlsSampleStreamWrapper[] enabledSampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private int[][] manifestUrlIndicesPerWrapper = new int[0][];

    public class SampleStreamWrapperCallback implements HlsSampleStreamWrapper.Callback {
        private SampleStreamWrapperCallback() {
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
            HlsMediaPeriod.this.mediaPeriodCallback.onContinueLoadingRequested(HlsMediaPeriod.this);
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPlaylistRefreshRequired(Uri uri) {
            HlsMediaPeriod.this.playlistTracker.refreshPlaylist(uri);
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPrepared() {
            if (HlsMediaPeriod.access$106(HlsMediaPeriod.this) > 0) {
                return;
            }
            int i11 = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper : HlsMediaPeriod.this.sampleStreamWrappers) {
                i11 += hlsSampleStreamWrapper.getTrackGroups().length;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i11];
            int i12 = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : HlsMediaPeriod.this.sampleStreamWrappers) {
                int i13 = hlsSampleStreamWrapper2.getTrackGroups().length;
                int i14 = 0;
                while (i14 < i13) {
                    trackGroupArr[i12] = hlsSampleStreamWrapper2.getTrackGroups().get(i14);
                    i14++;
                    i12++;
                }
            }
            HlsMediaPeriod.this.trackGroups = new TrackGroupArray(trackGroupArr);
            HlsMediaPeriod.this.mediaPeriodCallback.onPrepared(HlsMediaPeriod.this);
        }
    }

    public HlsMediaPeriod(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z11, int i11, boolean z12, PlayerId playerId, long j11) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.mediaTransferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher2;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.allowChunklessPreparation = z11;
        this.metadataType = i11;
        this.useSessionKeys = z12;
        this.playerId = playerId;
        this.timestampAdjusterInitializationTimeoutMs = j11;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
    }

    private void buildAndPrepareMainSampleStreamWrapper(HlsMultivariantPlaylist hlsMultivariantPlaylist, long j11, List<HlsSampleStreamWrapper> list, List<int[]> list2, Map<String, DrmInitData> map) {
        int i11;
        boolean z11;
        boolean z12;
        int size = hlsMultivariantPlaylist.variants.size();
        int[] iArr = new int[size];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < hlsMultivariantPlaylist.variants.size(); i14++) {
            Format format = hlsMultivariantPlaylist.variants.get(i14).format;
            if (format.height > 0 || Util.getCodecsOfType(format.codecs, 2) != null) {
                iArr[i14] = 2;
                i12++;
            } else if (Util.getCodecsOfType(format.codecs, 1) != null) {
                iArr[i14] = 1;
                i13++;
            } else {
                iArr[i14] = -1;
            }
        }
        if (i12 > 0) {
            i11 = i12;
            z12 = false;
            z11 = true;
        } else if (i13 < size) {
            i11 = size - i13;
            z11 = false;
            z12 = true;
        } else {
            i11 = size;
            z11 = false;
            z12 = false;
        }
        Uri[] uriArr = new Uri[i11];
        Format[] formatArr = new Format[i11];
        int[] iArr2 = new int[i11];
        int i15 = 0;
        for (int i16 = 0; i16 < hlsMultivariantPlaylist.variants.size(); i16++) {
            if ((!z11 || iArr[i16] == 2) && (!z12 || iArr[i16] != 1)) {
                HlsMultivariantPlaylist.Variant variant = hlsMultivariantPlaylist.variants.get(i16);
                uriArr[i15] = variant.url;
                formatArr[i15] = variant.format;
                iArr2[i15] = i16;
                i15++;
            }
        }
        String str = formatArr[0].codecs;
        int codecCountOfType = Util.getCodecCountOfType(str, 2);
        int codecCountOfType2 = Util.getCodecCountOfType(str, 1);
        boolean z13 = (codecCountOfType2 == 1 || (codecCountOfType2 == 0 && hlsMultivariantPlaylist.audios.isEmpty())) && codecCountOfType <= 1 && codecCountOfType2 + codecCountOfType > 0;
        HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper("main", (z11 || codecCountOfType2 <= 0) ? 0 : 1, uriArr, formatArr, hlsMultivariantPlaylist.muxedAudioFormat, hlsMultivariantPlaylist.muxedCaptionFormats, map, j11);
        list.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
        list2.add(iArr2);
        if (this.allowChunklessPreparation && z13) {
            ArrayList arrayList = new ArrayList();
            if (codecCountOfType > 0) {
                Format[] formatArr2 = new Format[i11];
                for (int i17 = 0; i17 < i11; i17++) {
                    formatArr2[i17] = deriveVideoFormat(formatArr[i17]);
                }
                arrayList.add(new TrackGroup("main", formatArr2));
                if (codecCountOfType2 > 0 && (hlsMultivariantPlaylist.muxedAudioFormat != null || hlsMultivariantPlaylist.audios.isEmpty())) {
                    arrayList.add(new TrackGroup("main:audio", deriveAudioFormat(formatArr[0], hlsMultivariantPlaylist.muxedAudioFormat, false)));
                }
                List<Format> list3 = hlsMultivariantPlaylist.muxedCaptionFormats;
                if (list3 != null) {
                    for (int i18 = 0; i18 < list3.size(); i18++) {
                        arrayList.add(new TrackGroup("main:cc:" + i18, this.extractorFactory.getOutputTextFormat(list3.get(i18))));
                    }
                }
            } else {
                Format[] formatArr3 = new Format[i11];
                for (int i19 = 0; i19 < i11; i19++) {
                    formatArr3[i19] = deriveAudioFormat(formatArr[i19], hlsMultivariantPlaylist.muxedAudioFormat, true);
                }
                arrayList.add(new TrackGroup("main", formatArr3));
            }
            TrackGroup trackGroup = new TrackGroup("main:id3", new Format.Builder().setId("ID3").setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
            arrayList.add(trackGroup);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
        }
    }

    public static /* synthetic */ int access$106(HlsMediaPeriod hlsMediaPeriod) {
        int i11 = hlsMediaPeriod.pendingPrepareCount - 1;
        hlsMediaPeriod.pendingPrepareCount = i11;
        return i11;
    }

    private void buildAndPrepareAudioSampleStreamWrappers(long j11, List<HlsMultivariantPlaylist.Rendition> list, List<HlsSampleStreamWrapper> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = list.get(i11).name;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z11 = true;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    if (Util.areEqual(str, list.get(i12).name)) {
                        HlsMultivariantPlaylist.Rendition rendition = list.get(i12);
                        arrayList3.add(Integer.valueOf(i12));
                        arrayList.add(rendition.url);
                        arrayList2.add(rendition.format);
                        z11 &= Util.getCodecCountOfType(rendition.format.codecs, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(str2, 1, (Uri[]) arrayList.toArray((Uri[]) Util.castNonNullTypeArray(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.EMPTY_LIST, map, j11);
                list3.add(Ints.toArray(arrayList3));
                list2.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
                if (this.allowChunklessPreparation && z11) {
                    hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new TrackGroup[]{new TrackGroup(str2, (Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void buildAndPrepareSampleStreamWrappers(long j11) {
        HlsMultivariantPlaylist hlsMultivariantPlaylist = (HlsMultivariantPlaylist) Assertions.checkNotNull(this.playlistTracker.getMultivariantPlaylist());
        Map<String, DrmInitData> mapDeriveOverridingDrmInitData = this.useSessionKeys ? deriveOverridingDrmInitData(hlsMultivariantPlaylist.sessionKeyDrmInitData) : Collections.EMPTY_MAP;
        boolean zIsEmpty = hlsMultivariantPlaylist.variants.isEmpty();
        List<HlsMultivariantPlaylist.Rendition> list = hlsMultivariantPlaylist.audios;
        List<HlsMultivariantPlaylist.Rendition> list2 = hlsMultivariantPlaylist.subtitles;
        this.pendingPrepareCount = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            buildAndPrepareMainSampleStreamWrapper(hlsMultivariantPlaylist, j11, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        }
        buildAndPrepareAudioSampleStreamWrappers(j11, list, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        this.audioVideoSampleStreamWrapperCount = arrayList.size();
        for (int i11 = 0; i11 < list2.size(); i11++) {
            HlsMultivariantPlaylist.Rendition rendition = list2.get(i11);
            String str = "subtitle:" + i11 + C33844oi.f71346o + rendition.name;
            Format format = rendition.format;
            Map<String, DrmInitData> map = mapDeriveOverridingDrmInitData;
            HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(str, 3, new Uri[]{rendition.url}, new Format[]{format}, null, Collections.EMPTY_LIST, map, j11);
            mapDeriveOverridingDrmInitData = map;
            arrayList2.add(new int[]{i11});
            arrayList.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new TrackGroup[]{new TrackGroup(str, this.extractorFactory.getOutputTextFormat(format))}, 0, new int[0]);
        }
        this.sampleStreamWrappers = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[0]);
        this.manifestUrlIndicesPerWrapper = (int[][]) arrayList2.toArray(new int[0][]);
        this.pendingPrepareCount = this.sampleStreamWrappers.length;
        for (int i12 = 0; i12 < this.audioVideoSampleStreamWrapperCount; i12++) {
            this.sampleStreamWrappers[i12].setIsPrimaryTimestampSource(true);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        this.enabledSampleStreamWrappers = this.sampleStreamWrappers;
    }

    private HlsSampleStreamWrapper buildSampleStreamWrapper(String str, int i11, Uri[] uriArr, Format[] formatArr, @Nullable Format format, @Nullable List<Format> list, Map<String, DrmInitData> map, long j11) {
        return new HlsSampleStreamWrapper(str, i11, this.sampleStreamWrapperCallback, new HlsChunkSource(this.extractorFactory, this.playlistTracker, uriArr, formatArr, this.dataSourceFactory, this.mediaTransferListener, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, list, this.playerId, this.cmcdConfiguration), map, this.allocator, j11, format, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.eventDispatcher, this.metadataType);
    }

    private static Map<String, DrmInitData> deriveOverridingDrmInitData(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            DrmInitData drmInitDataMerge = list.get(i11);
            String str = drmInitDataMerge.schemeType;
            i11++;
            int i12 = i11;
            while (i12 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i12);
                if (TextUtils.equals(drmInitData.schemeType, str)) {
                    drmInitDataMerge = drmInitDataMerge.merge(drmInitData);
                    arrayList.remove(i12);
                } else {
                    i12++;
                }
            }
            map.put(str, drmInitDataMerge);
        }
        return map;
    }

    private static Format deriveVideoFormat(Format format) {
        String codecsOfType = Util.getCodecsOfType(format.codecs, 2);
        return new Format.Builder().setId(format.f2788id).setLabel(format.label).setLabels(format.labels).setContainerMimeType(format.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(format.metadata).setAverageBitrate(format.averageBitrate).setPeakBitrate(format.peakBitrate).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).build();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.trackGroups != null) {
            return this.compositeSequenceableLoader.continueLoading(loadingInfo);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            hlsSampleStreamWrapper.discardBuffer(j11, z11);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            if (hlsSampleStreamWrapper.isVideoSampleStream()) {
                return hlsSampleStreamWrapper.getAdjustedSeekPositionUs(j11, seekParameters);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        int[] iArr;
        TrackGroupArray trackGroups;
        int primaryTrackGroupIndex;
        int i11;
        HlsMediaPeriod hlsMediaPeriod = this;
        HlsMultivariantPlaylist hlsMultivariantPlaylist = (HlsMultivariantPlaylist) Assertions.checkNotNull(hlsMediaPeriod.playlistTracker.getMultivariantPlaylist());
        boolean zIsEmpty = hlsMultivariantPlaylist.variants.isEmpty();
        boolean z11 = !zIsEmpty;
        int length = hlsMediaPeriod.sampleStreamWrappers.length - hlsMultivariantPlaylist.subtitles.size();
        int i12 = 0;
        if (zIsEmpty) {
            iArr = new int[0];
            trackGroups = TrackGroupArray.EMPTY;
            primaryTrackGroupIndex = 0;
        } else {
            HlsSampleStreamWrapper hlsSampleStreamWrapper = hlsMediaPeriod.sampleStreamWrappers[0];
            iArr = hlsMediaPeriod.manifestUrlIndicesPerWrapper[0];
            trackGroups = hlsSampleStreamWrapper.getTrackGroups();
            primaryTrackGroupIndex = hlsSampleStreamWrapper.getPrimaryTrackGroupIndex();
        }
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        boolean z13 = false;
        for (ExoTrackSelection exoTrackSelection : list) {
            TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
            int iIndexOf = trackGroups.indexOf(trackGroup);
            if (iIndexOf == -1) {
                ?? r15 = z11;
                i11 = i12;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = hlsMediaPeriod.sampleStreamWrappers;
                    if (r15 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[r15].getTrackGroups().indexOf(trackGroup) != -1) {
                        int i13 = r15 < length ? 1 : 2;
                        int[] iArr2 = hlsMediaPeriod.manifestUrlIndicesPerWrapper[r15];
                        for (int i14 = i11; i14 < exoTrackSelection.length(); i14++) {
                            arrayList.add(new StreamKey(i13, iArr2[exoTrackSelection.getIndexInTrackGroup(i14)]));
                        }
                        break;
                    }
                    hlsMediaPeriod = this;
                    r15++;
                }
            } else if (iIndexOf == primaryTrackGroupIndex) {
                for (int i15 = i12; i15 < exoTrackSelection.length(); i15++) {
                    arrayList.add(new StreamKey(i12, iArr[exoTrackSelection.getIndexInTrackGroup(i15)]));
                }
                i11 = i12;
                z13 = true;
            } else {
                i11 = i12;
                z12 = true;
            }
            hlsMediaPeriod = this;
            i12 = i11;
        }
        int i16 = i12;
        if (z12 && !z13) {
            int i17 = iArr[i16];
            int i18 = hlsMultivariantPlaylist.variants.get(i17).format.bitrate;
            for (int i19 = 1; i19 < iArr.length; i19++) {
                int i21 = hlsMultivariantPlaylist.variants.get(iArr[i19]).format.bitrate;
                if (i21 < i18) {
                    i17 = iArr[i19];
                    i18 = i21;
                }
            }
            arrayList.add(new StreamKey(i16, i17));
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.trackGroups);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.onPlaylistUpdated();
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z11) {
        boolean zOnPlaylistError = true;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            zOnPlaylistError &= hlsSampleStreamWrapper.onPlaylistError(uri, loadErrorInfo, z11);
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
        return zOnPlaylistError;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.mediaPeriodCallback = callback;
        this.playlistTracker.addListener(this);
        buildAndPrepareSampleStreamWrappers(j11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        this.compositeSequenceableLoader.reevaluateBuffer(j11);
    }

    public void release() {
        this.playlistTracker.removeListener(this);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.release();
        }
        this.mediaPeriodCallback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.enabledSampleStreamWrappers;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean zSeekToUs = hlsSampleStreamWrapperArr[0].seekToUs(j11, false);
            int i11 = 1;
            while (true) {
                HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.enabledSampleStreamWrappers;
                if (i11 >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i11].seekToUs(j11, zSeekToUs);
                i11++;
            }
            if (zSeekToUs) {
                this.timestampAdjusterProvider.reset();
            }
        }
        return j11;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            SampleStream sampleStream = sampleStreamArr[i11];
            iArr[i11] = sampleStream == null ? -1 : this.streamWrapperIndices.get(sampleStream).intValue();
            iArr2[i11] = -1;
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i11];
            if (exoTrackSelection != null) {
                TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                int i12 = 0;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
                    if (i12 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[i12].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i11] = i12;
                        break;
                    }
                    i12++;
                }
            }
        }
        this.streamWrapperIndices.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = new HlsSampleStreamWrapper[this.sampleStreamWrappers.length];
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        while (i13 < this.sampleStreamWrappers.length) {
            for (int i15 = 0; i15 < exoTrackSelectionArr.length; i15++) {
                ExoTrackSelection exoTrackSelection2 = null;
                sampleStreamArr3[i15] = iArr[i15] == i13 ? sampleStreamArr[i15] : null;
                if (iArr2[i15] == i13) {
                    exoTrackSelection2 = exoTrackSelectionArr[i15];
                }
                exoTrackSelectionArr2[i15] = exoTrackSelection2;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.sampleStreamWrappers[i13];
            int[] iArr3 = iArr;
            int i16 = i13;
            int i17 = i14;
            boolean zSelectTracks = hlsSampleStreamWrapper.selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j11, z11);
            boolean z12 = false;
            for (int i18 = 0; i18 < exoTrackSelectionArr.length; i18++) {
                SampleStream sampleStream2 = sampleStreamArr3[i18];
                if (iArr2[i18] == i16) {
                    Assertions.checkNotNull(sampleStream2);
                    sampleStreamArr2[i18] = sampleStream2;
                    this.streamWrapperIndices.put(sampleStream2, Integer.valueOf(i16));
                    z12 = true;
                } else if (iArr3[i18] == i16) {
                    Assertions.checkState(sampleStream2 == null);
                }
            }
            if (z12) {
                hlsSampleStreamWrapperArr2[i17] = hlsSampleStreamWrapper;
                i14 = i17 + 1;
                if (i17 == 0) {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(true);
                    if (zSelectTracks) {
                        this.timestampAdjusterProvider.reset();
                        z11 = true;
                    } else {
                        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr3 = this.enabledSampleStreamWrappers;
                        if (hlsSampleStreamWrapperArr3.length == 0 || hlsSampleStreamWrapper != hlsSampleStreamWrapperArr3[0]) {
                            this.timestampAdjusterProvider.reset();
                            z11 = true;
                        }
                    }
                } else {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(i16 < this.audioVideoSampleStreamWrapperCount);
                }
            } else {
                i14 = i17;
            }
            i13 = i16 + 1;
            iArr = iArr3;
        }
        System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, length);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr4 = (HlsSampleStreamWrapper[]) Util.nullSafeArrayCopy(hlsSampleStreamWrapperArr2, i14);
        this.enabledSampleStreamWrappers = hlsSampleStreamWrapperArr4;
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(hlsSampleStreamWrapperArr4);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(immutableListCopyOf, Lists.transform(immutableListCopyOf, new Function() { // from class: androidx.media3.exoplayer.hls.a
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ((HlsSampleStreamWrapper) obj).getTrackGroups().getTrackTypes();
            }
        }));
        return j11;
    }

    private static Format deriveAudioFormat(Format format, @Nullable Format format2, boolean z11) {
        Metadata metadata;
        int i11;
        String str;
        String str2;
        List<Label> list;
        int i12;
        int i13;
        String str3;
        int i14;
        ImmutableList immutableListM13439of = ImmutableList.m13439of();
        int i15 = -1;
        if (format2 != null) {
            str2 = format2.codecs;
            metadata = format2.metadata;
            i12 = format2.channelCount;
            i11 = format2.selectionFlags;
            i13 = format2.roleFlags;
            str = format2.language;
            str3 = format2.label;
            list = format2.labels;
        } else {
            String codecsOfType = Util.getCodecsOfType(format.codecs, 1);
            metadata = format.metadata;
            if (z11) {
                i12 = format.channelCount;
                i11 = format.selectionFlags;
                i13 = format.roleFlags;
                str = format.language;
                str3 = format.label;
                str2 = codecsOfType;
                list = format.labels;
            } else {
                i11 = 0;
                str = null;
                str2 = codecsOfType;
                list = immutableListM13439of;
                i12 = -1;
                i13 = 0;
                str3 = null;
            }
        }
        String mediaMimeType = MimeTypes.getMediaMimeType(str2);
        if (z11) {
            i14 = format.averageBitrate;
        } else {
            i14 = -1;
        }
        if (z11) {
            i15 = format.peakBitrate;
        }
        return new Format.Builder().setId(format.f2788id).setLabel(str3).setLabels(list).setContainerMimeType(format.containerMimeType).setSampleMimeType(mediaMimeType).setCodecs(str2).setMetadata(metadata).setAverageBitrate(i14).setPeakBitrate(i15).setChannelCount(i12).setSelectionFlags(i11).setRoleFlags(i13).setLanguage(str).build();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return C2711C.TIME_UNSET;
    }
}
