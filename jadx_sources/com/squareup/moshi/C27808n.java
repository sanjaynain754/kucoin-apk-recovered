package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.squareup.moshi.n */
/* JADX INFO: compiled from: MapJsonAdapter.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27808n<K, V> extends AbstractC27800f<Map<K, V>> {

    /* JADX INFO: renamed from: c */
    public static final AbstractC27800f.d f56627c = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC27800f<K> f56628a;

    /* JADX INFO: renamed from: b */
    public final AbstractC27800f<V> f56629b;

    /* JADX INFO: renamed from: com.squareup.moshi.n$a */
    /* JADX INFO: compiled from: MapJsonAdapter.java */
    public class a implements AbstractC27800f.d {
        @Override // com.squareup.moshi.AbstractC27800f.d
        /* JADX INFO: renamed from: a */
        public AbstractC27800f<?> mo68668a(Type type, Set<? extends Annotation> set, C27809o c27809o) {
            Class<?> clsM68774g;
            if (!set.isEmpty() || (clsM68774g = C27811q.m68774g(type)) != Map.class) {
                return null;
            }
            Type[] typeArrM68776i = C27811q.m68776i(type, clsM68774g);
            return new C27808n(c27809o, typeArrM68776i[0], typeArrM68776i[1]).m68684d();
        }
    }

    @Override // com.squareup.moshi.AbstractC27800f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map<K, V> mo68666b(JsonReader jsonReader) throws IOException {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.mo68632b();
        while (jsonReader.mo68636j()) {
            jsonReader.mo68645w();
            K kMo68666b = this.f56628a.mo68666b(jsonReader);
            V vMo68666b = this.f56629b.mo68666b(jsonReader);
            V vPut = linkedHashTreeMap.put(kMo68666b, vMo68666b);
            if (vPut != null) {
                throw new JsonDataException("Map key '" + kMo68666b + "' has multiple values at path " + jsonReader.getPath() + ": " + vPut + " and " + vMo68666b);
            }
        }
        jsonReader.mo68634h();
        return linkedHashTreeMap;
    }

    public String toString() {
        return "JsonAdapter(" + this.f56628a + "=" + this.f56629b + ")";
    }

    public C27808n(C27809o c27809o, Type type, Type type2) {
        this.f56628a = c27809o.m68737d(type);
        this.f56629b = c27809o.m68737d(type2);
    }

    @Override // com.squareup.moshi.AbstractC27800f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo68667f(AbstractC27807m abstractC27807m, Map<K, V> map) throws IOException {
        abstractC27807m.mo68714b();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                abstractC27807m.m68727p();
                this.f56628a.mo68667f(abstractC27807m, entry.getKey());
                this.f56629b.mo68667f(abstractC27807m, entry.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + abstractC27807m.getPath());
            }
        }
        abstractC27807m.mo68716i();
    }
}
