package org.springframework.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.springframework.util.MultiValueMapAdapter;
import wh0.AbstractC45833a;
import wh0.AbstractC45839g;
import wh0.InterfaceC45841i;

/* JADX INFO: loaded from: classes61.dex */
public class MultiValueMapAdapter<K, V> implements InterfaceC45841i<K, V>, Serializable {
    private final Map<K, List<V>> targetMap;

    public void addAll(K k11, List<? extends V> list) {
        this.targetMap.computeIfAbsent(k11, new Function() { // from class: wh0.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MultiValueMapAdapter.m95316b(obj);
            }
        }).addAll(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m95315a(Map map, Object obj, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        map.put(obj, list.get(0));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m95316b(Object obj) {
        return new ArrayList(1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ List m95317c(Object obj) {
        return new ArrayList(1);
    }

    @Override // wh0.InterfaceC45841i
    public void add(K k11, V v11) {
        this.targetMap.computeIfAbsent(k11, new Function() { // from class: wh0.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MultiValueMapAdapter.m95317c(obj);
            }
        }).add(v11);
    }

    @Override // java.util.Map
    public void clear() {
        this.targetMap.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.targetMap.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.targetMap.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, List<V>>> entrySet() {
        return this.targetMap.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this == obj || this.targetMap.equals(obj);
    }

    @Override // java.util.Map
    public List<V> get(Object obj) {
        return this.targetMap.get(obj);
    }

    public V getFirst(K k11) {
        List<V> list = this.targetMap.get(k11);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.targetMap.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.targetMap.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.targetMap.keySet();
    }

    @Override // java.util.Map
    public List<V> put(K k11, List<V> list) {
        return this.targetMap.put(k11, list);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends List<V>> map) {
        this.targetMap.putAll(map);
    }

    @Override // java.util.Map
    public List<V> remove(Object obj) {
        return this.targetMap.remove(obj);
    }

    public void set(K k11, V v11) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(v11);
        this.targetMap.put(k11, arrayList);
    }

    public void setAll(Map<K, V> map) {
        map.forEach(new BiConsumer() { // from class: wh0.m
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f103316a.set(obj, obj2);
            }
        });
    }

    @Override // java.util.Map
    public int size() {
        return this.targetMap.size();
    }

    public Map<K, V> toSingleValueMap() {
        final LinkedHashMap linkedHashMapM101261d = AbstractC45839g.m101261d(this.targetMap.size());
        this.targetMap.forEach(new BiConsumer() { // from class: wh0.j
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MultiValueMapAdapter.m95315a(linkedHashMapM101261d, obj, (List) obj2);
            }
        });
        return linkedHashMapM101261d;
    }

    public String toString() {
        return this.targetMap.toString();
    }

    @Override // java.util.Map
    public Collection<List<V>> values() {
        return this.targetMap.values();
    }

    public MultiValueMapAdapter(Map<K, List<V>> map) {
        AbstractC45833a.m101250a(map, "'targetMap' must not be null");
        this.targetMap = map;
    }

    @Override // wh0.InterfaceC45841i
    public void addAll(InterfaceC45841i<K, V> interfaceC45841i) {
        for (Map.Entry<K, V> entry : interfaceC45841i.entrySet()) {
            addAll(entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wh0.InterfaceC45841i
    public /* bridge */ /* synthetic */ void addIfAbsent(Object obj, Object obj2) {
        super.addIfAbsent(obj, obj2);
    }
}
