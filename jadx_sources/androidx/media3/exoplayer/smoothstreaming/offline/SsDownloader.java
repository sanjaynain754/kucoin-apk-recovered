package androidx.media3.exoplayer.smoothstreaming.offline;

import androidx.credentials.ExecutorC1980h;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifest;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SsDownloader extends SegmentDownloader<SsManifest> {
    public SsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new ExecutorC1980h());
    }

    public SsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem.buildUpon().setUri(Util.fixSmoothStreamingIsmManifestUri(((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri)).build(), new SsManifestParser(), factory, executor, 20000L);
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, SsManifest ssManifest, boolean z11) {
        ArrayList arrayList = new ArrayList();
        for (SsManifest.StreamElement streamElement : ssManifest.streamElements) {
            for (int i11 = 0; i11 < streamElement.formats.length; i11++) {
                for (int i12 = 0; i12 < streamElement.chunkCount; i12++) {
                    arrayList.add(new SegmentDownloader.Segment(streamElement.getStartTimeUs(i12), new DataSpec(streamElement.buildRequestUri(i11, i12))));
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    public SsDownloader(MediaItem mediaItem, ParsingLoadable.Parser<SsManifest> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    public SsDownloader(MediaItem mediaItem, ParsingLoadable.Parser<SsManifest> parser, CacheDataSource.Factory factory, Executor executor, long j11) {
        super(mediaItem, parser, factory, executor, j11);
    }
}
