package androidx.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.credentials.ExecutorC1980h;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ProgressiveDownloader implements Downloader {
    private final CacheWriter cacheWriter;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private volatile RunnableFutureTask<Void, IOException> downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;

    @Nullable
    private final PriorityTaskManager priorityTaskManager;

    @Nullable
    private Downloader.ProgressListener progressListener;

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new ExecutorC1980h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(long j11, long j12, long j13) {
        Downloader.ProgressListener progressListener = this.progressListener;
        if (progressListener == null) {
            return;
        }
        progressListener.onProgress(j11, j12, (j11 == -1 || j11 == 0) ? -1.0f : (j12 * 100.0f) / j11);
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        RunnableFutureTask<Void, IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this.executor = (Executor) Assertions.checkNotNull(executor);
        Assertions.checkNotNull(mediaItem.localConfiguration);
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(mediaItem.localConfiguration.uri).setKey(mediaItem.localConfiguration.customCacheKey).setFlags(4).build();
        this.dataSpec = dataSpecBuild;
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = cacheDataSourceCreateDataSourceForDownloading;
        this.cacheWriter = new CacheWriter(cacheDataSourceCreateDataSourceForDownloading, dataSpecBuild, null, new CacheWriter.ProgressListener() { // from class: androidx.media3.exoplayer.offline.n
            @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
            public final void onProgress(long j11, long j12, long j13) {
                this.f3291a.onProgress(j11, j12, j13);
            }
        });
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0021 */
    @Override // androidx.media3.exoplayer.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void download(@Nullable Downloader.ProgressListener progressListener) throws InterruptedException, IOException {
        this.progressListener = progressListener;
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        boolean z11 = false;
        while (!z11) {
            if (this.isCanceled) {
                break;
            }
            this.downloadRunnable = new RunnableFutureTask<Void, IOException>() { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader.1
                @Override // androidx.media3.common.util.RunnableFutureTask
                public void cancelWork() {
                    ProgressiveDownloader.this.cacheWriter.cancel();
                }

                @Override // androidx.media3.common.util.RunnableFutureTask
                public Void doWork() throws IOException {
                    ProgressiveDownloader.this.cacheWriter.cache();
                    return null;
                }
            };
            PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
            if (priorityTaskManager2 != null) {
                priorityTaskManager2.proceed(-4000);
            }
            this.executor.execute(this.downloadRunnable);
            try {
                this.downloadRunnable.get();
                z11 = true;
            } catch (ExecutionException e11) {
                Throwable th2 = (Throwable) Assertions.checkNotNull(e11.getCause());
                if (!(th2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                    if (th2 instanceof IOException) {
                        throw ((IOException) th2);
                    }
                    Util.sneakyThrow(th2);
                }
            }
        }
        ((RunnableFutureTask) Assertions.checkNotNull(this.downloadRunnable)).blockUntilFinished();
        PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
        if (priorityTaskManager3 != null) {
            priorityTaskManager3.remove(-4000);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void remove() {
        this.dataSource.getCache().removeResource(this.dataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }
}
