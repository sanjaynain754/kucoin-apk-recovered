package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.o0 */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u001c*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m90084d2 = {"Lkotlinx/serialization/internal/o0;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/serialization/internal/k1;", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ltg0/d;", "kSerializer", "vSerializer", "<init>", "(Ltg0/d;Ltg0/d;)V", "", "u", "(Ljava/util/Map;)I", "", "", "t", "(Ljava/util/Map;)Ljava/util/Iterator;", "q", "()Ljava/util/HashMap;", "r", "(Ljava/util/HashMap;)I", "w", "(Ljava/util/HashMap;)Ljava/util/Map;", "v", "(Ljava/util/Map;)Ljava/util/HashMap;", "size", "", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/util/HashMap;I)V", "Lvg0/f;", "c", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41859o0<K, V> extends AbstractC41840k1<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41859o0(@NotNull InterfaceC44951d<K> kSerializer, @NotNull InterfaceC44951d<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.descriptor = new C41854n0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractC41840k1, tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> mo91423a() {
        return new HashMap<>();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo91424b(@NotNull HashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size() * 2;
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo91425c(@NotNull HashMap<K, V> map, int i11) {
        Intrinsics.checkNotNullParameter(map, "<this>");
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> mo91426d(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int mo91427e(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> mo91432k(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map<K, V> mo91433l(@NotNull HashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map;
    }
}
