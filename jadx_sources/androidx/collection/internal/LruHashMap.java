package androidx.collection.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LruHashMap.jvm.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001d\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Landroidx/collection/internal/LruHashMap;", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "original", "(Landroidx/collection/internal/LruHashMap;)V", "initialCapacity", "", "loadFactor", "", "(IF)V", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", "isEmpty", "", "()Z", "map", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LruHashMap<K, V> {

    @NotNull
    private final LinkedHashMap<K, V> map;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    public LruHashMap(int i11, float f11) {
        this.map = new LinkedHashMap<>(i11, f11, true);
    }

    @NotNull
    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> setEntrySet = this.map.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Nullable
    public final V get(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.get(key);
    }

    @Nullable
    public final V put(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.map.put(key, value);
    }

    @Nullable
    public final V remove(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.remove(key);
    }

    public /* synthetic */ LruHashMap(int i11, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 16 : i11, (i12 & 2) != 0 ? 0.75f : f11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LruHashMap(@NotNull LruHashMap<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        Intrinsics.checkNotNullParameter(original, "original");
        for (Map.Entry<? extends K, V> entry : original.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
