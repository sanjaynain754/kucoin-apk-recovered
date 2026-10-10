package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {
    private volatile transient CacheEntry<K, V> cacheEntry1;
    private volatile transient CacheEntry<K, V> cacheEntry2;

    private void addToCache(K k11, V v11) {
        addToCache(new CacheEntry<>(k11, v11));
    }

    public static final class CacheEntry<K, V> {
        final K key;
        final V value;

        public CacheEntry(K k11, V v11) {
            this.key = k11;
            this.value = v11;
        }
    }

    private void addToCache(CacheEntry<K, V> cacheEntry) {
        this.cacheEntry2 = this.cacheEntry1;
        this.cacheEntry1 = cacheEntry;
    }

    public MapRetrievalCache(Map<K, V> map) {
        super(map);
    }

    @Override // com.google.common.graph.MapIteratorCache
    public void clearCache() {
        super.clearCache();
        this.cacheEntry1 = null;
        this.cacheEntry2 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.MapIteratorCache
    public V get(Object obj) {
        Preconditions.checkNotNull(obj);
        V ifCached = getIfCached(obj);
        if (ifCached != null) {
            return ifCached;
        }
        V withoutCaching = getWithoutCaching(obj);
        if (withoutCaching != null) {
            addToCache(obj, withoutCaching);
        }
        return withoutCaching;
    }

    @Override // com.google.common.graph.MapIteratorCache
    public V getIfCached(Object obj) {
        V v11 = (V) super.getIfCached(obj);
        if (v11 != null) {
            return v11;
        }
        CacheEntry<K, V> cacheEntry = this.cacheEntry1;
        if (cacheEntry != null && cacheEntry.key == obj) {
            return cacheEntry.value;
        }
        CacheEntry<K, V> cacheEntry2 = this.cacheEntry2;
        if (cacheEntry2 != null && cacheEntry2.key == obj) {
            addToCache(cacheEntry2);
            return cacheEntry2.value;
        }
        return null;
    }
}
