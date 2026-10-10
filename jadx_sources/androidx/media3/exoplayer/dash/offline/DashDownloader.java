package androidx.media3.exoplayer.dash.offline;

import androidx.annotation.Nullable;
import androidx.credentials.ExecutorC1980h;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.DashUtil;
import androidx.media3.exoplayer.dash.DashWrappingSegmentIndex;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.offline.DownloadException;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.ChunkIndex;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new ExecutorC1980h());
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j11, RangedUri rangedUri) {
        return new SegmentDownloader.Segment(j11, DashUtil.buildDataSpec(representation, str, rangedUri, 0, ImmutableMap.m13458of()));
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new DashManifestParser(), factory, executor, 20000L);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8 A[SYNTHETIC] */
    private void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j11, long j12, boolean z11, ArrayList<SegmentDownloader.Segment> arrayList) throws InterruptedException, IOException {
        for (int i11 = 0; i11 < adaptationSet.representations.size(); i11++) {
            Representation representation = adaptationSet.representations.get(i11);
            try {
                try {
                    DashSegmentIndex segmentIndex = getSegmentIndex(dataSource, adaptationSet.type, representation, z11);
                    if (segmentIndex != null) {
                        long segmentCount = segmentIndex.getSegmentCount(j12);
                        if (segmentCount == -1) {
                            throw new DownloadException("Unbounded segment index");
                        }
                        String str = ((BaseUrl) Util.castNonNull(this.baseUrlExclusionList.selectBaseUrl(representation.baseUrls))).url;
                        RangedUri initializationUri = representation.getInitializationUri();
                        if (initializationUri != null) {
                            arrayList.add(createSegment(representation, str, j11, initializationUri));
                        }
                        RangedUri indexUri = representation.getIndexUri();
                        if (indexUri != null) {
                            arrayList.add(createSegment(representation, str, j11, indexUri));
                        }
                        long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                        long j13 = (segmentCount + firstSegmentNum) - 1;
                        while (firstSegmentNum <= j13) {
                            arrayList.add(createSegment(representation, str, j11 + segmentIndex.getTimeUs(firstSegmentNum), segmentIndex.getSegmentUrl(firstSegmentNum)));
                            firstSegmentNum++;
                        }
                    } else {
                        try {
                            throw new DownloadException("Missing segment index");
                        } catch (IOException e11) {
                            e = e11;
                            if (z11) {
                                throw e;
                            }
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                    if (z11) {
                        throw e;
                    }
                }
            } catch (IOException e13) {
                e = e13;
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z11) throws InterruptedException, IOException {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < dashManifest.getPeriodCount(); i11++) {
            Period period = dashManifest.getPeriod(i11);
            long jMsToUs = Util.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i11);
            List<AdaptationSet> list = period.adaptationSets;
            for (int i12 = 0; i12 < list.size(); i12++) {
                addSegmentsForAdaptationSet(dataSource, list.get(i12), jMsToUs, periodDurationUs, z11, arrayList);
            }
        }
        return arrayList;
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    @Nullable
    private DashSegmentIndex getSegmentIndex(final DataSource dataSource, final int i11, final Representation representation, boolean z11) throws InterruptedException, IOException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndex = (ChunkIndex) execute(new RunnableFutureTask<ChunkIndex, IOException>() { // from class: androidx.media3.exoplayer.dash.offline.DashDownloader.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.common.util.RunnableFutureTask
            public ChunkIndex doWork() throws IOException {
                return DashUtil.loadChunkIndex(dataSource, i11, representation);
            }
        }, z11);
        if (chunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor, long j11) {
        super(mediaItem, parser, factory, executor, j11);
        this.baseUrlExclusionList = new BaseUrlExclusionList();
    }
}
