package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
final class SimpleCacheSpan extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    static final String COMMON_SUFFIX = ".exo";
    private static final String SUFFIX = ".v3.exo";

    @Nullable
    public static SimpleCacheSpan createCacheEntry(File file, long j11, CachedContentIndex cachedContentIndex) {
        return createCacheEntry(file, j11, C2711C.TIME_UNSET, cachedContentIndex);
    }

    @Nullable
    public static SimpleCacheSpan createCacheEntry(File file, long j11, long j12, CachedContentIndex cachedContentIndex) {
        String keyForId;
        String name = file.getName();
        if (!name.endsWith(SUFFIX)) {
            file = upgradeFile(file, cachedContentIndex);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches() || (keyForId = cachedContentIndex.getKeyForId(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        if (j11 == -1) {
            j11 = file2.length();
        }
        long j13 = j11;
        if (j13 == 0) {
            return null;
        }
        return new SimpleCacheSpan(keyForId, Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), j13, j12 == C2711C.TIME_UNSET ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))) : j12, file2);
    }

    public static SimpleCacheSpan createHole(String str, long j11, long j12) {
        return new SimpleCacheSpan(str, j11, j12, C2711C.TIME_UNSET, null);
    }

    public static SimpleCacheSpan createLookup(String str, long j11) {
        return new SimpleCacheSpan(str, j11, -1L, C2711C.TIME_UNSET, null);
    }

    public static File getCacheFile(File file, int i11, long j11, long j12) {
        return new File(file, i11 + C33978va.f72339h + j11 + C33978va.f72339h + j12 + SUFFIX);
    }

    public SimpleCacheSpan copyWithFileAndLastTouchTimestamp(File file, long j11) {
        Assertions.checkState(this.isCached);
        return new SimpleCacheSpan(this.key, this.position, this.length, j11, file);
    }

    private SimpleCacheSpan(String str, long j11, long j12, long j13, @Nullable File file) {
        super(str, j11, j12, j13, file);
    }

    @Nullable
    private static File upgradeFile(File file, CachedContentIndex cachedContentIndex) {
        String strUnescapeFileName;
        String name = file.getName();
        Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            strUnescapeFileName = Util.unescapeFileName((String) Assertions.checkNotNull(matcher.group(1)));
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            if (matcher.matches()) {
                strUnescapeFileName = (String) Assertions.checkNotNull(matcher.group(1));
            } else {
                strUnescapeFileName = null;
            }
        }
        if (strUnescapeFileName == null) {
            return null;
        }
        File cacheFile = getCacheFile((File) Assertions.checkStateNotNull(file.getParentFile()), cachedContentIndex.assignIdForKey(strUnescapeFileName), Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))));
        if (!file.renameTo(cacheFile)) {
            return null;
        }
        return cacheFile;
    }
}
