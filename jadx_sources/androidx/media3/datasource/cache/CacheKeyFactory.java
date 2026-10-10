package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: androidx.media3.datasource.cache.a
        @Override // androidx.media3.datasource.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            return CacheKeyFactory.m2998a(dataSpec);
        }
    };

    String buildCacheKey(DataSpec dataSpec);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ String m2998a(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }
}
