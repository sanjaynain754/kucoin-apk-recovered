package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {
    private long currentSize;
    private final TreeSet<CacheSpan> leastRecentlyUsed = new TreeSet<>(new Comparator() { // from class: androidx.media3.datasource.cache.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
        }
    });
    private final long maxBytes;

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compare(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j11 = cacheSpan.lastTouchTimestamp;
        long j12 = cacheSpan2.lastTouchTimestamp;
        if (j11 - j12 == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        return j11 < j12 ? -1 : 1;
    }

    private void evictCache(Cache cache, long j11) {
        while (this.currentSize + j11 > this.maxBytes && !this.leastRecentlyUsed.isEmpty()) {
            cache.removeSpan(this.leastRecentlyUsed.first());
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.add(cacheSpan);
        this.currentSize += cacheSpan.length;
        evictCache(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.remove(cacheSpan);
        this.currentSize -= cacheSpan.length;
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onStartFile(Cache cache, String str, long j11, long j12) {
        if (j12 != -1) {
            evictCache(cache, j12);
        }
    }

    public LeastRecentlyUsedCacheEvictor(long j11) {
        this.maxBytes = j11;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onCacheInitialized() {
    }
}
