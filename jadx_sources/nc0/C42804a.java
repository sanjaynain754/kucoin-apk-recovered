package nc0;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import oc0.C43014a;

/* JADX INFO: renamed from: nc0.a */
/* JADX INFO: compiled from: CaseInsensitiveMap.java */
/* JADX INFO: loaded from: classes2.dex */
public class C42804a<V> implements Map<String, V> {

    /* JADX INFO: renamed from: b */
    public Map<String, V> f94820b;

    public C42804a() {
        this(new HashMap());
    }

    public C42804a(Map<String, V> map) {
        C43014a.m94481a(map, "wrappedMap");
        this.f94820b = map;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public V put(String str, V v11) {
        return this.f94820b.put(str.toLowerCase(), v11);
    }

    @Override // java.util.Map
    public void clear() {
        this.f94820b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f94820b.containsKey(obj.toString().toLowerCase());
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f94820b.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, V>> entrySet() {
        return this.f94820b.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.f94820b.get(obj.toString().toLowerCase());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f94820b.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.f94820b.keySet();
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.f94820b.remove(obj.toString().toLowerCase());
    }

    @Override // java.util.Map
    public int size() {
        return this.f94820b.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f94820b.values();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends V> map) {
        for (Map.Entry<? extends String, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
