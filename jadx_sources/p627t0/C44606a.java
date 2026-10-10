package p627t0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: t0.a */
/* JADX INFO: compiled from: LinkedMultimap.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\b\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J/\u0010\u0015\u001a\u00020\b\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016RH\u0010\u001b\u001a6\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u0018j\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, m90084d2 = {"Lt0/a;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "<init>", "()V", "key", "value", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)V", "e", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lt0/a$a;", "entry", "b", "(Lt0/a$a;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "d", "Lt0/a$a;", TtmlNode.TAG_HEAD, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C44606a<K, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final a<K, V> head = new a<>(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HashMap<K, a<K, V>> entries = new HashMap<>();

    /* JADX INFO: renamed from: t0.a$a */
    /* JADX INFO: compiled from: LinkedMultimap.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0004\b\u000b\u0010\u0006R\u0019\u0010\u0004\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\bR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR.\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lt0/a$a;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "key", "<init>", "(Ljava/lang/Object;)V", "f", "()Ljava/lang/Object;", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "b", "", "Ljava/util/List;", "values", "c", "Lt0/a$a;", "d", "()Lt0/a$a;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lt0/a$a;)V", "prev", "g", "next", "", "e", "()I", "size", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a<K, V> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final K key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public List<V> values;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public a<K, V> prev = this;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public a<K, V> next = this;

        /* JADX INFO: renamed from: a */
        public final void m98710a(V value) {
            ArrayList arrayList = this.values;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.values = arrayList;
            }
            arrayList.add(value);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final K m98711b() {
            return this.key;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a<K, V> m98712c() {
            return this.next;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a<K, V> m98713d() {
            return this.prev;
        }

        /* JADX INFO: renamed from: e */
        public final int m98714e() {
            List<V> list = this.values;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final V m98715f() {
            List<V> list = this.values;
            if (list == null) {
                return null;
            }
            return (V) CollectionsKt.removeLastOrNull(list);
        }

        /* JADX INFO: renamed from: g */
        public final void m98716g(@NotNull a<K, V> aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.next = aVar;
        }

        /* JADX INFO: renamed from: h */
        public final void m98717h(@NotNull a<K, V> aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.prev = aVar;
        }

        public a(@Nullable K k11) {
            this.key = k11;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m98707c(K key, V value) {
        HashMap<K, a<K, V>> map = this.entries;
        a<K, V> aVar = map.get(key);
        if (aVar == null) {
            aVar = new a<>(key);
            m98706b(aVar);
            map.put(key, aVar);
        }
        aVar.m98710a(value);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final V m98709e() {
        for (a<K, V> aVarM98713d = this.head.m98713d(); !Intrinsics.areEqual(aVarM98713d, this.head); aVarM98713d = aVarM98713d.m98713d()) {
            V vM98715f = aVarM98713d.m98715f();
            if (vM98715f != null) {
                return vM98715f;
            }
            m98708d(aVarM98713d);
            HashMap<K, a<K, V>> map = this.entries;
            K kM98711b = aVarM98713d.m98711b();
            if (map == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            TypeIntrinsics.asMutableMap(map).remove(kM98711b);
        }
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LinkedMultimap( ");
        a<K, V> aVarM98712c = this.head.m98712c();
        while (!Intrinsics.areEqual(aVarM98712c, this.head)) {
            sb2.append('{');
            sb2.append(aVarM98712c.m98711b());
            sb2.append(':');
            sb2.append(aVarM98712c.m98714e());
            sb2.append('}');
            aVarM98712c = aVarM98712c.m98712c();
            if (!Intrinsics.areEqual(aVarM98712c, this.head)) {
                sb2.append(", ");
            }
        }
        sb2.append(" )");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: a */
    public final <K, V> void m98705a(a<K, V> entry) {
        entry.m98712c().m98717h(entry);
        entry.m98713d().m98716g(entry);
    }

    /* JADX INFO: renamed from: b */
    public final void m98706b(a<K, V> entry) {
        m98708d(entry);
        entry.m98717h(this.head.m98713d());
        entry.m98716g(this.head);
        m98705a(entry);
    }

    /* JADX INFO: renamed from: d */
    public final <K, V> void m98708d(a<K, V> entry) {
        entry.m98713d().m98716g(entry.m98712c());
        entry.m98712c().m98717h(entry.m98713d());
    }
}
