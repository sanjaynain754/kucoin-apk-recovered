package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.Descriptor;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.EmptySampleStream;
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
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import com.tencent.bugly.proguard.C33844oi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
final class DashMediaPeriod implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<DashChunkSource>>, ChunkSampleStream.ReleaseCallback<DashChunkSource> {
    private static final Pattern CEA608_SERVICE_DESCRIPTOR_REGEX = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern CEA708_SERVICE_DESCRIPTOR_REGEX = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final Allocator allocator;
    private final BaseUrlExclusionList baseUrlExclusionList;

    @Nullable
    private MediaPeriod.Callback callback;
    private final DashChunkSource.Factory chunkSourceFactory;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final long elapsedRealtimeOffsetMs;
    private List<EventStream> eventStreams;

    /* JADX INFO: renamed from: id */
    final int f3160id;
    private long initialStartTimeUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private int periodIndex;
    private final PlayerEmsgHandler playerEmsgHandler;
    private final PlayerId playerId;
    private final TrackGroupInfo[] trackGroupInfos;
    private final TrackGroupArray trackGroups;

    @Nullable
    private final TransferListener transferListener;
    private boolean canReportInitialDiscontinuity = true;
    private ChunkSampleStream<DashChunkSource>[] sampleStreams = newSampleStreamArray(0);
    private EventSampleStream[] eventSampleStreams = new EventSampleStream[0];
    private final IdentityHashMap<ChunkSampleStream<DashChunkSource>, PlayerEmsgHandler.PlayerTrackEmsgHandler> trackEmsgHandlerBySampleStream = new IdentityHashMap<>();

    public static final class TrackGroupInfo {
        private static final int CATEGORY_EMBEDDED = 1;
        private static final int CATEGORY_MANIFEST_EVENTS = 2;
        private static final int CATEGORY_PRIMARY = 0;
        public final int[] adaptationSetIndices;
        public final int embeddedClosedCaptionTrackGroupIndex;
        public final ImmutableList<Format> embeddedClosedCaptionTrackOriginalFormats;
        public final int embeddedEventMessageTrackGroupIndex;
        public final int eventStreamGroupIndex;
        public final int primaryTrackGroupIndex;
        public final int trackGroupCategory;
        public final int trackType;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }

        public static TrackGroupInfo embeddedClosedCaptionTrack(int[] iArr, int i11, ImmutableList<Format> immutableList) {
            return new TrackGroupInfo(3, 1, iArr, i11, -1, -1, -1, immutableList);
        }

        public static TrackGroupInfo embeddedEmsgTrack(int[] iArr, int i11) {
            return new TrackGroupInfo(5, 1, iArr, i11, -1, -1, -1, ImmutableList.m13439of());
        }

        public static TrackGroupInfo mpdEventTrack(int i11) {
            return new TrackGroupInfo(5, 2, new int[0], -1, -1, -1, i11, ImmutableList.m13439of());
        }

        public static TrackGroupInfo primaryTrack(int i11, int[] iArr, int i12, int i13, int i14) {
            return new TrackGroupInfo(i11, 0, iArr, i12, i13, i14, -1, ImmutableList.m13439of());
        }

        private TrackGroupInfo(int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, ImmutableList<Format> immutableList) {
            this.trackType = i11;
            this.adaptationSetIndices = iArr;
            this.trackGroupCategory = i12;
            this.primaryTrackGroupIndex = i13;
            this.embeddedEventMessageTrackGroupIndex = i14;
            this.embeddedClosedCaptionTrackGroupIndex = i15;
            this.eventStreamGroupIndex = i16;
            this.embeddedClosedCaptionTrackOriginalFormats = immutableList;
        }
    }

    public DashMediaPeriod(int i11, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i12, DashChunkSource.Factory factory, @Nullable TransferListener transferListener, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, long j11, LoaderErrorThrower loaderErrorThrower, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback, PlayerId playerId) {
        this.f3160id = i11;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.periodIndex = i12;
        this.chunkSourceFactory = factory;
        this.transferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.elapsedRealtimeOffsetMs = j11;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.playerId = playerId;
        this.playerEmsgHandler = new PlayerEmsgHandler(dashManifest, playerEmsgCallback, allocator);
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
        Period period = dashManifest.getPeriod(i12);
        List<EventStream> list = period.eventStreams;
        this.eventStreams = list;
        Pair<TrackGroupArray, TrackGroupInfo[]> pairBuildTrackGroups = buildTrackGroups(drmSessionManager, factory, period.adaptationSets, list);
        this.trackGroups = (TrackGroupArray) pairBuildTrackGroups.first;
        this.trackGroupInfos = (TrackGroupInfo[]) pairBuildTrackGroups.second;
    }

    private static void buildManifestEventTrackGroupInfos(List<EventStream> list, TrackGroup[] trackGroupArr, TrackGroupInfo[] trackGroupInfoArr, int i11) {
        int i12 = 0;
        while (i12 < list.size()) {
            EventStream eventStream = list.get(i12);
            trackGroupArr[i11] = new TrackGroup(eventStream.m3273id() + C33844oi.f71346o + i12, new Format.Builder().setId(eventStream.m3273id()).setSampleMimeType(MimeTypes.APPLICATION_EMSG).build());
            trackGroupInfoArr[i11] = TrackGroupInfo.mpdEventTrack(i12);
            i12++;
            i11++;
        }
    }

    @Nullable
    private static Descriptor findDescriptor(List<Descriptor> list, String str) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            Descriptor descriptor = list.get(i11);
            if (str.equals(descriptor.schemeIdUri)) {
                return descriptor;
            }
        }
        return null;
    }

    private static Format[] getClosedCaptionTrackFormats(List<AdaptationSet> list, int[] iArr) {
        for (int i11 : iArr) {
            AdaptationSet adaptationSet = list.get(i11);
            List<Descriptor> list2 = list.get(i11).accessibilityDescriptors;
            for (int i12 = 0; i12 < list2.size(); i12++) {
                Descriptor descriptor = list2.get(i12);
                if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA608_SERVICE_DESCRIPTOR_REGEX, new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).setId(adaptationSet.f3164id + ":cea608").build());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA708_SERVICE_DESCRIPTOR_REGEX, new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA708).setId(adaptationSet.f3164id + ":cea708").build());
                }
            }
        }
        return new Format[0];
    }

    private int[] getStreamIndexToTrackGroupIndex(ExoTrackSelection[] exoTrackSelectionArr) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i11];
            if (exoTrackSelection != null) {
                iArr[i11] = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
            } else {
                iArr[i11] = -1;
            }
        }
        return iArr;
    }

    private static boolean hasEventMessageTrack(List<AdaptationSet> list, int[] iArr) {
        for (int i11 : iArr) {
            List<Representation> list2 = list.get(i11).representations;
            for (int i12 = 0; i12 < list2.size(); i12++) {
                if (!list2.get(i12).inbandEventStreams.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int identifyEmbeddedTracks(int i11, List<AdaptationSet> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (hasEventMessageTrack(list, iArr[i13])) {
                zArr[i13] = true;
                i12++;
            }
            Format[] closedCaptionTrackFormats = getClosedCaptionTrackFormats(list, iArr[i13]);
            formatArr[i13] = closedCaptionTrackFormats;
            if (closedCaptionTrackFormats.length != 0) {
                i12++;
            }
        }
        return i12;
    }

    private static void maybeUpdateFormatsForParsedText(DashChunkSource.Factory factory, Format[] formatArr) {
        for (int i11 = 0; i11 < formatArr.length; i11++) {
            formatArr[i11] = factory.getOutputTextFormat(formatArr[i11]);
        }
    }

    private void releaseDisabledStreams(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr) {
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            if (exoTrackSelectionArr[i11] == null || !zArr[i11]) {
                SampleStream sampleStream = sampleStreamArr[i11];
                if (sampleStream instanceof ChunkSampleStream) {
                    ((ChunkSampleStream) sampleStream).release(this);
                } else if (sampleStream instanceof ChunkSampleStream.EmbeddedSampleStream) {
                    ((ChunkSampleStream.EmbeddedSampleStream) sampleStream).release();
                }
                sampleStreamArr[i11] = null;
            }
        }
    }

    private void releaseOrphanEmbeddedStreams(ExoTrackSelection[] exoTrackSelectionArr, SampleStream[] sampleStreamArr, int[] iArr) {
        boolean z11;
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            SampleStream sampleStream = sampleStreamArr[i11];
            if ((sampleStream instanceof EmptySampleStream) || (sampleStream instanceof ChunkSampleStream.EmbeddedSampleStream)) {
                int primaryStreamIndex = getPrimaryStreamIndex(i11, iArr);
                if (primaryStreamIndex == -1) {
                    z11 = sampleStreamArr[i11] instanceof EmptySampleStream;
                } else {
                    SampleStream sampleStream2 = sampleStreamArr[i11];
                    z11 = (sampleStream2 instanceof ChunkSampleStream.EmbeddedSampleStream) && ((ChunkSampleStream.EmbeddedSampleStream) sampleStream2).parent == sampleStreamArr[primaryStreamIndex];
                }
                if (!z11) {
                    SampleStream sampleStream3 = sampleStreamArr[i11];
                    if (sampleStream3 instanceof ChunkSampleStream.EmbeddedSampleStream) {
                        ((ChunkSampleStream.EmbeddedSampleStream) sampleStream3).release();
                    }
                    sampleStreamArr[i11] = null;
                }
            }
        }
    }

    private void selectNewStreams(ExoTrackSelection[] exoTrackSelectionArr, SampleStream[] sampleStreamArr, boolean[] zArr, long j11, int[] iArr) {
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i11];
            if (exoTrackSelection != null) {
                SampleStream sampleStream = sampleStreamArr[i11];
                if (sampleStream == null) {
                    zArr[i11] = true;
                    TrackGroupInfo trackGroupInfo = this.trackGroupInfos[iArr[i11]];
                    int i12 = trackGroupInfo.trackGroupCategory;
                    if (i12 == 0) {
                        sampleStreamArr[i11] = buildSampleStream(trackGroupInfo, exoTrackSelection, j11);
                    } else if (i12 == 2) {
                        sampleStreamArr[i11] = new EventSampleStream(this.eventStreams.get(trackGroupInfo.eventStreamGroupIndex), exoTrackSelection.getTrackGroup().getFormat(0), this.manifest.dynamic);
                    }
                } else if (sampleStream instanceof ChunkSampleStream) {
                    ((DashChunkSource) ((ChunkSampleStream) sampleStream).getChunkSource()).updateTrackSelection(exoTrackSelection);
                }
            }
        }
        for (int i13 = 0; i13 < exoTrackSelectionArr.length; i13++) {
            if (sampleStreamArr[i13] == null && exoTrackSelectionArr[i13] != null) {
                TrackGroupInfo trackGroupInfo2 = this.trackGroupInfos[iArr[i13]];
                if (trackGroupInfo2.trackGroupCategory == 1) {
                    int primaryStreamIndex = getPrimaryStreamIndex(i13, iArr);
                    if (primaryStreamIndex == -1) {
                        sampleStreamArr[i13] = new EmptySampleStream();
                    } else {
                        sampleStreamArr[i13] = ((ChunkSampleStream) sampleStreamArr[primaryStreamIndex]).selectEmbeddedTrack(j11, trackGroupInfo2.trackType);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback
    public synchronized void onSampleStreamReleased(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerRemove = this.trackEmsgHandlerBySampleStream.remove(chunkSampleStream);
        if (playerTrackEmsgHandlerRemove != null) {
            playerTrackEmsgHandlerRemove.release();
        }
    }

    private static int buildPrimaryAndEmbeddedTrackGroupInfos(DrmSessionManager drmSessionManager, DashChunkSource.Factory factory, List<AdaptationSet> list, int[][] iArr, int i11, boolean[] zArr, Format[][] formatArr, TrackGroup[] trackGroupArr, TrackGroupInfo[] trackGroupInfoArr) {
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11) {
            int[] iArr2 = iArr[i14];
            ArrayList arrayList = new ArrayList();
            for (int i16 : iArr2) {
                arrayList.addAll(list.get(i16).representations);
            }
            int size = arrayList.size();
            Format[] formatArr2 = new Format[size];
            for (int i17 = 0; i17 < size; i17++) {
                Format format = ((Representation) arrayList.get(i17)).format;
                formatArr2[i17] = format.buildUpon().setCryptoType(drmSessionManager.getCryptoType(format)).build();
            }
            AdaptationSet adaptationSet = list.get(iArr2[0]);
            long j11 = adaptationSet.f3164id;
            String string = j11 != -1 ? Long.toString(j11) : "unset:" + i14;
            int i18 = i15 + 1;
            if (zArr[i14]) {
                i12 = i15 + 2;
            } else {
                i12 = i18;
                i18 = -1;
            }
            if (formatArr[i14].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            maybeUpdateFormatsForParsedText(factory, formatArr2);
            trackGroupArr[i15] = new TrackGroup(string, formatArr2);
            trackGroupInfoArr[i15] = TrackGroupInfo.primaryTrack(adaptationSet.type, iArr2, i15, i18, i12);
            if (i18 != -1) {
                String str = string + ":emsg";
                trackGroupArr[i18] = new TrackGroup(str, new Format.Builder().setId(str).setSampleMimeType(MimeTypes.APPLICATION_EMSG).build());
                trackGroupInfoArr[i18] = TrackGroupInfo.embeddedEmsgTrack(iArr2, i15);
            }
            if (i12 != -1) {
                trackGroupInfoArr[i12] = TrackGroupInfo.embeddedClosedCaptionTrack(iArr2, i15, ImmutableList.copyOf(formatArr[i14]));
                maybeUpdateFormatsForParsedText(factory, formatArr[i14]);
                trackGroupArr[i12] = new TrackGroup(string + ":cc", formatArr[i14]);
            }
            i14++;
            i15 = i13;
        }
        return i15;
    }

    private ChunkSampleStream<DashChunkSource> buildSampleStream(TrackGroupInfo trackGroupInfo, ExoTrackSelection exoTrackSelection, long j11) {
        int i11;
        TrackGroup trackGroup;
        int i12;
        int i13 = trackGroupInfo.embeddedEventMessageTrackGroupIndex;
        boolean z11 = i13 != -1;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = null;
        if (z11) {
            trackGroup = this.trackGroups.get(i13);
            i11 = 1;
        } else {
            i11 = 0;
            trackGroup = null;
        }
        int i14 = trackGroupInfo.embeddedClosedCaptionTrackGroupIndex;
        ImmutableList<Format> immutableListM13439of = i14 != -1 ? this.trackGroupInfos[i14].embeddedClosedCaptionTrackOriginalFormats : ImmutableList.m13439of();
        int size = i11 + immutableListM13439of.size();
        Format[] formatArr = new Format[size];
        int[] iArr = new int[size];
        if (z11) {
            formatArr[0] = trackGroup.getFormat(0);
            iArr[0] = 5;
            i12 = 1;
        } else {
            i12 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < immutableListM13439of.size(); i15++) {
            Format format = immutableListM13439of.get(i15);
            formatArr[i12] = format;
            iArr[i12] = 3;
            arrayList.add(format);
            i12++;
        }
        if (this.manifest.dynamic && z11) {
            playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = this.playerEmsgHandler.newPlayerTrackEmsgHandler();
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = playerTrackEmsgHandlerNewPlayerTrackEmsgHandler;
        ChunkSampleStream<DashChunkSource> chunkSampleStream = new ChunkSampleStream<>(trackGroupInfo.trackType, iArr, formatArr, this.chunkSourceFactory.createDashChunkSource(this.manifestLoaderErrorThrower, this.manifest, this.baseUrlExclusionList, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection, trackGroupInfo.trackType, this.elapsedRealtimeOffsetMs, z11, arrayList, playerTrackEmsgHandler, this.transferListener, this.playerId, this.cmcdConfiguration), this, this.allocator, j11, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.mediaSourceEventDispatcher, this.canReportInitialDiscontinuity, null);
        synchronized (this) {
            this.trackEmsgHandlerBySampleStream.put(chunkSampleStream, playerTrackEmsgHandler);
        }
        return chunkSampleStream;
    }

    @Nullable
    private static Descriptor findTrickPlayProperty(List<Descriptor> list) {
        return findDescriptor(list, "http://dashif.org/guidelines/trickmode");
    }

    private int getPrimaryStreamIndex(int i11, int[] iArr) {
        int i12 = iArr[i11];
        if (i12 == -1) {
            return -1;
        }
        int i13 = this.trackGroupInfos[i12].primaryTrackGroupIndex;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 == i13 && this.trackGroupInfos[i15].trackGroupCategory == 0) {
                return i14;
            }
        }
        return -1;
    }

    private static ChunkSampleStream<DashChunkSource>[] newSampleStreamArray(int i11) {
        return new ChunkSampleStream[i11];
    }

    private static Format[] parseClosedCaptionDescriptor(Descriptor descriptor, Pattern pattern, Format format) {
        String str = descriptor.value;
        if (str == null) {
            return new Format[]{format};
        }
        String[] strArrSplit = Util.split(str, ";");
        Format[] formatArr = new Format[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = pattern.matcher(strArrSplit[i11]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            formatArr[i11] = format.buildUpon().setId(format.f2788id + C33844oi.f71346o + i12).setAccessibilityChannel(i12).setLanguage(matcher.group(2)).build();
        }
        return formatArr;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.compositeSequenceableLoader.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.discardBuffer(j11, z11);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
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
        List<AdaptationSet> list2 = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection exoTrackSelection : list) {
            TrackGroupInfo trackGroupInfo = this.trackGroupInfos[this.trackGroups.indexOf(exoTrackSelection.getTrackGroup())];
            if (trackGroupInfo.trackGroupCategory == 0) {
                int[] iArr = trackGroupInfo.adaptationSetIndices;
                int length = exoTrackSelection.length();
                int[] iArr2 = new int[length];
                for (int i11 = 0; i11 < exoTrackSelection.length(); i11++) {
                    iArr2[i11] = exoTrackSelection.getIndexInTrackGroup(i11);
                }
                Arrays.sort(iArr2);
                int size = list2.get(iArr[0]).representations.size();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = iArr2[i14];
                    while (true) {
                        int i16 = i13 + size;
                        if (i15 >= i16) {
                            i12++;
                            size = list2.get(iArr[i12]).representations.size();
                            i13 = i16;
                        }
                    }
                    arrayList.add(new StreamKey(this.periodIndex, iArr[i12], i15 - i13));
                }
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
    public void onContinueLoadingRequested(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.consumeInitialDiscontinuity()) {
                return this.initialStartTimeUs;
            }
        }
        return C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        this.compositeSequenceableLoader.reevaluateBuffer(j11);
    }

    public void release() {
        this.playerEmsgHandler.release();
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.release(this);
        }
        this.callback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) throws Throwable {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.seekToUs(j11);
        }
        for (EventSampleStream eventSampleStream : this.eventSampleStreams) {
            eventSampleStream.seekToUs(j11);
        }
        return j11;
    }

    public void updateManifest(DashManifest dashManifest, int i11) {
        this.manifest = dashManifest;
        this.periodIndex = i11;
        this.playerEmsgHandler.updateManifest(dashManifest);
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr = this.sampleStreams;
        if (chunkSampleStreamArr != null) {
            for (ChunkSampleStream<DashChunkSource> chunkSampleStream : chunkSampleStreamArr) {
                ((DashChunkSource) chunkSampleStream.getChunkSource()).updateManifest(dashManifest, i11);
            }
            this.callback.onContinueLoadingRequested(this);
        }
        this.eventStreams = dashManifest.getPeriod(i11).eventStreams;
        for (EventSampleStream eventSampleStream : this.eventSampleStreams) {
            for (EventStream eventStream : this.eventStreams) {
                if (eventStream.m3273id().equals(eventSampleStream.eventStreamId())) {
                    eventSampleStream.updateEventStream(eventStream, dashManifest.dynamic && i11 == dashManifest.getPeriodCount() - 1);
                    break;
                }
            }
        }
    }

    private static Pair<TrackGroupArray, TrackGroupInfo[]> buildTrackGroups(DrmSessionManager drmSessionManager, DashChunkSource.Factory factory, List<AdaptationSet> list, List<EventStream> list2) {
        int[][] groupedAdaptationSetIndices = getGroupedAdaptationSetIndices(list);
        int length = groupedAdaptationSetIndices.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length][];
        int iIdentifyEmbeddedTracks = identifyEmbeddedTracks(length, list, groupedAdaptationSetIndices, zArr, formatArr) + length + list2.size();
        TrackGroup[] trackGroupArr = new TrackGroup[iIdentifyEmbeddedTracks];
        TrackGroupInfo[] trackGroupInfoArr = new TrackGroupInfo[iIdentifyEmbeddedTracks];
        buildManifestEventTrackGroupInfos(list2, trackGroupArr, trackGroupInfoArr, buildPrimaryAndEmbeddedTrackGroupInfos(drmSessionManager, factory, list, groupedAdaptationSetIndices, length, zArr, formatArr, trackGroupArr, trackGroupInfoArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), trackGroupInfoArr);
    }

    @Nullable
    private static Descriptor findAdaptationSetSwitchingProperty(List<Descriptor> list) {
        return findDescriptor(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static int[][] getGroupedAdaptationSetIndices(List<AdaptationSet> list) {
        int iMin;
        Descriptor descriptorFindAdaptationSetSwitchingProperty;
        Integer num;
        int size = list.size();
        HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            mapNewHashMapWithExpectedSize.put(Long.valueOf(list.get(i11).f3164id), Integer.valueOf(i11));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            AdaptationSet adaptationSet = list.get(i12);
            Descriptor descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.essentialProperties);
            if (descriptorFindTrickPlayProperty == null) {
                descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.supplementalProperties);
            }
            if (descriptorFindTrickPlayProperty != null && (num = (Integer) mapNewHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(descriptorFindTrickPlayProperty.value)))) != null) {
                iMin = num.intValue();
            } else {
                iMin = i12;
            }
            if (iMin == i12 && (descriptorFindAdaptationSetSwitchingProperty = findAdaptationSetSwitchingProperty(adaptationSet.supplementalProperties)) != null) {
                for (String str : Util.split(descriptorFindAdaptationSetSwitchingProperty.value, ",")) {
                    Integer num2 = (Integer) mapNewHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        iMin = Math.min(iMin, num2.intValue());
                    }
                }
            }
            if (iMin != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(iMin);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i13 = 0; i13 < size2; i13++) {
            int[] array = Ints.toArray((Collection) arrayList.get(i13));
            iArr[i13] = array;
            Arrays.sort(array);
        }
        return iArr;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        int[] streamIndexToTrackGroupIndex = getStreamIndexToTrackGroupIndex(exoTrackSelectionArr);
        releaseDisabledStreams(exoTrackSelectionArr, zArr, sampleStreamArr);
        releaseOrphanEmbeddedStreams(exoTrackSelectionArr, sampleStreamArr, streamIndexToTrackGroupIndex);
        selectNewStreams(exoTrackSelectionArr, sampleStreamArr, zArr2, j11, streamIndexToTrackGroupIndex);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream instanceof ChunkSampleStream) {
                arrayList.add((ChunkSampleStream) sampleStream);
            } else if (sampleStream instanceof EventSampleStream) {
                arrayList2.add((EventSampleStream) sampleStream);
            }
        }
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArrNewSampleStreamArray = newSampleStreamArray(arrayList.size());
        this.sampleStreams = chunkSampleStreamArrNewSampleStreamArray;
        arrayList.toArray(chunkSampleStreamArrNewSampleStreamArray);
        EventSampleStream[] eventSampleStreamArr = new EventSampleStream[arrayList2.size()];
        this.eventSampleStreams = eventSampleStreamArr;
        arrayList2.toArray(eventSampleStreamArr);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(arrayList, Lists.transform(arrayList, new Function() { // from class: androidx.media3.exoplayer.dash.b
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ImmutableList.m13440of(Integer.valueOf(((ChunkSampleStream) obj).primaryTrackType));
            }
        }));
        if (this.canReportInitialDiscontinuity) {
            this.canReportInitialDiscontinuity = false;
            this.initialStartTimeUs = j11;
        }
        return j11;
    }
}
