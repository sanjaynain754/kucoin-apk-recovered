package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;
import tg0.InterfaceC44951d;
import vg0.AbstractC45542o;
import vg0.C45528a;
import vg0.C45540m;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.i1 */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0017B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lkotlinx/serialization/internal/i1;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/serialization/internal/y0;", "", "Ltg0/d;", "keySerializer", "valueSerializer", "<init>", "(Ltg0/d;Ltg0/d;)V", "key", "value", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lvg0/f;", "c", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "i", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41830i1<K, V> extends AbstractC41903y0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    /* JADX INFO: renamed from: kotlinx.serialization.internal.i1$a, reason: from toString */
    /* JADX INFO: compiled from: Tuples.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lkotlinx/serialization/internal/i1$a;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "key", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "getValue", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final /* data */ class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final K key;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public final V value;

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) other;
            return Intrinsics.areEqual(this.key, mapEntry.key) && Intrinsics.areEqual(this.value, mapEntry.value);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.key;
            int iHashCode = (k11 == null ? 0 : k11.hashCode()) * 31;
            V v11 = this.value;
            return iHashCode + (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @NotNull
        public String toString() {
            return "MapEntry(key=" + this.key + ", value=" + this.value + ')';
        }

        public MapEntry(K k11, V v11) {
            this.key = k11;
            this.value = v11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41830i1(@NotNull final InterfaceC44951d<K> keySerializer, @NotNull final InterfaceC44951d<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.descriptor = C45540m.m100547h("kotlin.collections.Map.Entry", AbstractC45542o.c.f102632a, new InterfaceC45533f[0], new Function1() { // from class: kotlinx.serialization.internal.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41830i1.m91594g(keySerializer, valueSerializer, (C45528a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m91594g(InterfaceC44951d interfaceC44951d, InterfaceC44951d interfaceC44951d2, C45528a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C45528a.m100517b(buildSerialDescriptor, "key", interfaceC44951d.getDescriptor(), null, false, 12, null);
        C45528a.m100517b(buildSerialDescriptor, "value", interfaceC44951d2.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractC41903y0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public K mo91595a(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @Override // kotlinx.serialization.internal.AbstractC41903y0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public V mo91596c(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.AbstractC41903y0
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> mo91597e(K key, V value) {
        return new MapEntry(key, value);
    }
}
