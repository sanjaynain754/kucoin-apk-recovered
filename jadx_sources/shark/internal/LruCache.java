package shark.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33590cg;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\t\u001a\u0004\u0018\u00018\u00012\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R$\u0010 \u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\""}, m90084d2 = {"Lshark/internal/LruCache;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "maxSize", "<init>", "(I)V", "key", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Ljava/util/LinkedHashMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/LinkedHashMap;", C33590cg.f69440j, "<set-?>", "I", "getPutCount", "()I", "putCount", "c", "evictionCount", "d", "getHitCount", "hitCount", "getMissCount", "missCount", "f", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class LruCache<K, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final LinkedHashMap<K, V> cache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int putCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int evictionCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int hitCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int missCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int maxSize;

    @Nullable
    /* JADX INFO: renamed from: b */
    public final V m98251b(@Nullable K key) {
        V v11 = this.cache.get(key);
        if (v11 != null) {
            this.hitCount++;
            return v11;
        }
        this.missCount++;
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEvictionCount() {
        return this.evictionCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxSize() {
        return this.maxSize;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final V m98254e(K key, V value) {
        this.putCount++;
        return this.cache.put(key, value);
    }

    @NotNull
    public String toString() {
        int i11 = this.hitCount;
        int i12 = this.missCount + i11;
        int i13 = i12 != 0 ? (i11 * 100) / i12 : 0;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Arrays.copyOf(new Object[]{Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i13)}, 4));
        Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public LruCache(int i11) {
        boolean z11;
        this.maxSize = i11;
        boolean z12 = true;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.cache = new LinkedHashMap<K, V>(i11, 0.75f, z12) { // from class: shark.internal.LruCache.2
                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
                    return getEntries();
                }

                public /* bridge */ Set getEntries() {
                    return super.entrySet();
                }

                public /* bridge */ Set getKeys() {
                    return super.keySet();
                }

                public /* bridge */ int getSize() {
                    return super.size();
                }

                public /* bridge */ Collection getValues() {
                    return super.values();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ Set<K> keySet() {
                    return getKeys();
                }

                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(@Nullable Map.Entry<K, V> eldest) {
                    if (size() > LruCache.this.getMaxSize()) {
                        LruCache lruCache = LruCache.this;
                        lruCache.evictionCount = lruCache.getEvictionCount() + 1;
                        return true;
                    }
                    return false;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ int size() {
                    return getSize();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ Collection<V> values() {
                    return getValues();
                }
            };
            return;
        }
        throw new IllegalArgumentException(("maxSize=" + i11 + " <= 0").toString());
    }
}
