package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes34.dex */
final class CachedContent {
    private static final String TAG = "CachedContent";
    private final TreeSet<SimpleCacheSpan> cachedSpans;

    /* JADX INFO: renamed from: id */
    public final int f2928id;
    public final String key;
    private final ArrayList<Range> lockedRanges;
    private DefaultContentMetadata metadata;

    public static final class Range {
        public final long length;
        public final long position;

        public boolean contains(long j11, long j12) {
            long j13 = this.length;
            if (j13 == -1) {
                return j11 >= this.position;
            }
            if (j12 == -1) {
                return false;
            }
            long j14 = this.position;
            return j14 <= j11 && j11 + j12 <= j14 + j13;
        }

        public boolean intersects(long j11, long j12) {
            long j13 = this.position;
            if (j13 > j11) {
                return j12 == -1 || j11 + j12 > j13;
            }
            long j14 = this.length;
            return j14 == -1 || j13 + j14 > j11;
        }

        public Range(long j11, long j12) {
            this.position = j11;
            this.length = j12;
        }
    }

    public CachedContent(int i11, String str) {
        this(i11, str, DefaultContentMetadata.EMPTY);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CachedContent.class == obj.getClass()) {
            CachedContent cachedContent = (CachedContent) obj;
            if (this.f2928id == cachedContent.f2928id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyLocked(long j11, long j12) {
        for (int i11 = 0; i11 < this.lockedRanges.size(); i11++) {
            if (this.lockedRanges.get(i11).contains(j11, j12)) {
                return true;
            }
        }
        return false;
    }

    public boolean lockRange(long j11, long j12) {
        for (int i11 = 0; i11 < this.lockedRanges.size(); i11++) {
            if (this.lockedRanges.get(i11).intersects(j11, j12)) {
                return false;
            }
        }
        this.lockedRanges.add(new Range(j11, j12));
        return true;
    }

    public void unlockRange(long j11) {
        for (int i11 = 0; i11 < this.lockedRanges.size(); i11++) {
            if (this.lockedRanges.get(i11).position == j11) {
                this.lockedRanges.remove(i11);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public CachedContent(int i11, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f2928id = i11;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new TreeSet<>();
        this.lockedRanges = new ArrayList<>();
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        DefaultContentMetadata defaultContentMetadata = this.metadata;
        DefaultContentMetadata defaultContentMetadataCopyWithMutationsApplied = defaultContentMetadata.copyWithMutationsApplied(contentMetadataMutations);
        this.metadata = defaultContentMetadataCopyWithMutationsApplied;
        return !defaultContentMetadataCopyWithMutationsApplied.equals(defaultContentMetadata);
    }

    public long getCachedBytesLength(long j11, long j12) {
        Assertions.checkArgument(j11 >= 0);
        Assertions.checkArgument(j12 >= 0);
        SimpleCacheSpan span = getSpan(j11, j12);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j12);
        }
        long j13 = j11 + j12;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long jMax = span.position + span.length;
        if (jMax < j14) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j15 = simpleCacheSpan.position;
                if (j15 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j15 + simpleCacheSpan.length);
                if (jMax >= j14) {
                    break;
                }
            }
        }
        return Math.min(jMax - j11, j12);
    }

    public DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public SimpleCacheSpan getSpan(long j11, long j12) {
        SimpleCacheSpan simpleCacheSpanCreateLookup = SimpleCacheSpan.createLookup(this.key, j11);
        SimpleCacheSpan simpleCacheSpanFloor = this.cachedSpans.floor(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanFloor != null && simpleCacheSpanFloor.position + simpleCacheSpanFloor.length > j11) {
            return simpleCacheSpanFloor;
        }
        SimpleCacheSpan simpleCacheSpanCeiling = this.cachedSpans.ceiling(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanCeiling != null) {
            long j13 = simpleCacheSpanCeiling.position - j11;
            j12 = j12 == -1 ? j13 : Math.min(j13, j12);
        }
        return SimpleCacheSpan.createHole(this.key, j11, j12);
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return (((this.f2928id * 31) + this.key.hashCode()) * 31) + this.metadata.hashCode();
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isFullyUnlocked() {
        return this.lockedRanges.isEmpty();
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        File file = cacheSpan.file;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j11, boolean z11) {
        long j12;
        Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        File file = (File) Assertions.checkNotNull(simpleCacheSpan.file);
        if (z11) {
            j12 = j11;
            File cacheFile = SimpleCacheSpan.getCacheFile((File) Assertions.checkNotNull(file.getParentFile()), this.f2928id, simpleCacheSpan.position, j12);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                Log.m2961w(TAG, "Failed to rename " + file + " to " + cacheFile);
            }
        } else {
            j12 = j11;
        }
        SimpleCacheSpan simpleCacheSpanCopyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j12);
        this.cachedSpans.add(simpleCacheSpanCopyWithFileAndLastTouchTimestamp);
        return simpleCacheSpanCopyWithFileAndLastTouchTimestamp;
    }
}
