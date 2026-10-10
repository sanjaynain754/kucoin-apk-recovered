package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.datasource.cache.ContentMetadata;
import androidx.media3.exoplayer.offline.FilterableManifest;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final ArrayList<RunnableFutureTask<?, ?>> activeRunnables;
    private final Cache cache;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final CacheKeyFactory cacheKeyFactory;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final DataSpec manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;

    @Nullable
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<StreamKey> streamKeys;

    public static final class ProgressNotifier implements CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        private float getPercentDownloaded() {
            long j11 = this.contentLength;
            if (j11 != -1 && j11 != 0) {
                return (this.bytesDownloaded * 100.0f) / j11;
            }
            int i11 = this.totalSegments;
            if (i11 != 0) {
                return (this.segmentsDownloaded * 100.0f) / i11;
            }
            return -1.0f;
        }

        @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
        public void onProgress(long j11, long j12, long j13) {
            long j14 = this.bytesDownloaded + j13;
            this.bytesDownloaded = j14;
            this.progressListener.onProgress(this.contentLength, j14, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }

        public ProgressNotifier(Downloader.ProgressListener progressListener, long j11, int i11, long j12, int i12) {
            this.progressListener = progressListener;
            this.contentLength = j11;
            this.totalSegments = i11;
            this.bytesDownloaded = j12;
            this.segmentsDownloaded = i12;
        }
    }

    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return Util.compareLong(this.startTimeUs, segment.startTimeUs);
        }

        public Segment(long j11, DataSpec dataSpec) {
            this.startTimeUs = j11;
            this.dataSpec = dataSpec;
        }
    }

    public static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        private final CacheWriter cacheWriter;
        public final CacheDataSource dataSource;

        @Nullable
        private final ProgressNotifier progressNotifier;
        public final Segment segment;
        public final byte[] temporaryBuffer;

        @Override // androidx.media3.common.util.RunnableFutureTask
        public void cancelWork() {
            this.cacheWriter.cancel();
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        public Void doWork() throws IOException {
            this.cacheWriter.cache();
            ProgressNotifier progressNotifier = this.progressNotifier;
            if (progressNotifier == null) {
                return null;
            }
            progressNotifier.onSegmentDownloaded();
            return null;
        }

        public SegmentDownloadRunnable(Segment segment, CacheDataSource cacheDataSource, @Nullable ProgressNotifier progressNotifier, byte[] bArr) {
            this.segment = segment;
            this.dataSource = cacheDataSource;
            this.progressNotifier = progressNotifier;
            this.temporaryBuffer = bArr;
            this.cacheWriter = new CacheWriter(cacheDataSource, segment.dataSpec, bArr, progressNotifier);
        }
    }

    @Deprecated
    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    private void removeActiveRunnable(RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    public abstract List<Segment> getSegments(DataSource dataSource, M m11, boolean z11) throws InterruptedException, IOException;

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor, long j11) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.cache = (Cache) Assertions.checkNotNull(factory.getCache());
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new ArrayList<>();
        this.maxMergedSegmentStartTimeDiffUs = Util.msToUs(j11);
    }

    private <T> void addActiveRunnable(RunnableFutureTask<T, ?> runnableFutureTask) throws InterruptedException {
        synchronized (this.activeRunnables) {
            try {
                if (this.isCanceled) {
                    throw new InterruptedException();
                }
                this.activeRunnables.add(runnableFutureTask);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean canMergeSegments(DataSpec dataSpec, DataSpec dataSpec2) {
        if (!dataSpec.uri.equals(dataSpec2.uri)) {
            return false;
        }
        long j11 = dataSpec.length;
        return j11 != -1 && dataSpec.position + j11 == dataSpec2.position && Util.areEqual(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders);
    }

    public static DataSpec getCompressibleDataSpec(Uri uri) {
        return new DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    private static void mergeSegments(List<Segment> list, CacheKeyFactory cacheKeyFactory, long j11) {
        HashMap map = new HashMap();
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Segment segment = list.get(i12);
            String strBuildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            Integer num = (Integer) map.get(strBuildCacheKey);
            Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + j11 || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                map.put(strBuildCacheKey, Integer.valueOf(i11));
                list.set(i11, segment);
                i11++;
            } else {
                long j12 = segment.dataSpec.length;
                list.set(((Integer) Assertions.checkNotNull(num)).intValue(), new Segment(segment2.startTimeUs, segment2.dataSpec.subrange(0L, j12 != -1 ? segment2.dataSpec.length + j12 : -1L)));
            }
        }
        Util.removeRange(list, i11, list.size());
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            try {
                this.isCanceled = true;
                for (int i11 = 0; i11 < this.activeRunnables.size(); i11++) {
                    this.activeRunnables.get(i11).cancel(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0034 */
    @Override // androidx.media3.exoplayer.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void download(@Nullable Downloader.ProgressListener progressListener) throws InterruptedException, IOException {
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading2 = this.cacheDataSourceFactory.createDataSourceForDownloading();
        FilterableManifest manifest = getManifest(cacheDataSourceCreateDataSourceForDownloading2, this.manifestDataSpec, false);
        if (!this.streamKeys.isEmpty()) {
            manifest = (FilterableManifest) manifest.copy(this.streamKeys);
        }
        List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForDownloading2, manifest, false);
        Collections.sort(segments);
        mergeSegments(segments, this.cacheKeyFactory, this.maxMergedSegmentStartTimeDiffUs);
        int size = segments.size();
        int i11 = 0;
        long j11 = 0;
        long j12 = 0;
        for (int size2 = segments.size() - 1; size2 >= 0; size2--) {
            DataSpec dataSpec = segments.get(size2).dataSpec;
            String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
            long j13 = dataSpec.length;
            if (j13 == -1) {
                long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(strBuildCacheKey));
                if (contentLength != -1) {
                    j13 = contentLength - dataSpec.position;
                }
            }
            long j14 = j13;
            long cachedBytes = this.cache.getCachedBytes(strBuildCacheKey, dataSpec.position, j14);
            j12 += cachedBytes;
            if (j14 != -1) {
                if (j14 == cachedBytes) {
                    i11++;
                    segments.remove(size2);
                }
                if (j11 != -1) {
                    j11 += j14;
                }
            } else {
                j11 = -1;
            }
        }
        ProgressNotifier progressNotifier = progressListener != null ? new ProgressNotifier(progressListener, j11, size, j12, i11) : null;
        arrayDeque.addAll(segments);
        while (!this.isCanceled && !arrayDeque.isEmpty()) {
            PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
            if (priorityTaskManager2 != null) {
                priorityTaskManager2.proceed(-4000);
            }
            if (arrayDeque2.isEmpty()) {
                cacheDataSourceCreateDataSourceForDownloading = this.cacheDataSourceFactory.createDataSourceForDownloading();
                bArr = new byte[131072];
            } else {
                SegmentDownloadRunnable segmentDownloadRunnable = (SegmentDownloadRunnable) arrayDeque2.removeFirst();
                cacheDataSourceCreateDataSourceForDownloading = segmentDownloadRunnable.dataSource;
                bArr = segmentDownloadRunnable.temporaryBuffer;
            }
            SegmentDownloadRunnable segmentDownloadRunnable2 = new SegmentDownloadRunnable((Segment) arrayDeque.removeFirst(), cacheDataSourceCreateDataSourceForDownloading, progressNotifier, bArr);
            addActiveRunnable(segmentDownloadRunnable2);
            this.executor.execute(segmentDownloadRunnable2);
            for (int size3 = this.activeRunnables.size() - 1; size3 >= 0; size3--) {
                SegmentDownloadRunnable segmentDownloadRunnable3 = (SegmentDownloadRunnable) this.activeRunnables.get(size3);
                if (arrayDeque.isEmpty() || segmentDownloadRunnable3.isDone()) {
                    try {
                        segmentDownloadRunnable3.get();
                        removeActiveRunnable(size3);
                        arrayDeque2.addLast(segmentDownloadRunnable3);
                    } catch (ExecutionException e11) {
                        Throwable th2 = (Throwable) Assertions.checkNotNull(e11.getCause());
                        if (th2 instanceof PriorityTaskManager.PriorityTooLowException) {
                            arrayDeque.addFirst(segmentDownloadRunnable3.segment);
                            removeActiveRunnable(size3);
                            arrayDeque2.addLast(segmentDownloadRunnable3);
                        } else {
                            if (th2 instanceof IOException) {
                                throw ((IOException) th2);
                            }
                            Util.sneakyThrow(th2);
                        }
                    }
                }
            }
            segmentDownloadRunnable2.blockUntilStarted();
        }
        for (int i12 = 0; i12 < this.activeRunnables.size(); i12++) {
            this.activeRunnables.get(i12).cancel(true);
        }
        for (int size4 = this.activeRunnables.size() - 1; size4 >= 0; size4--) {
            this.activeRunnables.get(size4).blockUntilFinished();
            removeActiveRunnable(size4);
        }
        PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
        if (priorityTaskManager3 != null) {
            priorityTaskManager3.remove(-4000);
        }
    }

    public final <T> T execute(RunnableFutureTask<T, ?> runnableFutureTask, boolean z11) throws Throwable {
        if (z11) {
            runnableFutureTask.run();
            try {
                return runnableFutureTask.get();
            } catch (ExecutionException e11) {
                Throwable th2 = (Throwable) Assertions.checkNotNull(e11.getCause());
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                Util.sneakyThrow(e11);
            }
        }
        while (!this.isCanceled) {
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-4000);
            }
            addActiveRunnable(runnableFutureTask);
            this.executor.execute(runnableFutureTask);
            try {
                T t11 = runnableFutureTask.get();
                runnableFutureTask.blockUntilFinished();
                removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask);
                return t11;
            } catch (ExecutionException e12) {
                try {
                    Throwable th3 = (Throwable) Assertions.checkNotNull(e12.getCause());
                    if (!(th3 instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (th3 instanceof IOException) {
                            throw ((IOException) th3);
                        }
                        Util.sneakyThrow(e12);
                    }
                    runnableFutureTask.blockUntilFinished();
                    removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask);
                } catch (Throwable th4) {
                    runnableFutureTask.blockUntilFinished();
                    removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask);
                    throw th4;
                }
            }
        }
        throw new InterruptedException();
    }

    public final M getManifest(final DataSource dataSource, final DataSpec dataSpec, boolean z11) throws InterruptedException, IOException {
        return (M) execute(new RunnableFutureTask<M, IOException>() { // from class: androidx.media3.exoplayer.offline.SegmentDownloader.1
            @Override // androidx.media3.common.util.RunnableFutureTask
            public M doWork() throws IOException {
                return (M) ParsingLoadable.load(dataSource, SegmentDownloader.this.manifestParser, dataSpec, 4);
            }
        }, z11);
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void remove() {
        CacheDataSource cacheDataSourceCreateDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForRemovingDownload, getManifest(cacheDataSourceCreateDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
            for (int i11 = 0; i11 < segments.size(); i11++) {
                this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(segments.get(i11).dataSpec));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        } finally {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
        }
    }

    private void removeActiveRunnable(int i11) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i11);
        }
    }
}
