package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    void onStartFile(Cache cache, String str, long j11, long j12);

    boolean requiresCacheSpanTouches();
}
