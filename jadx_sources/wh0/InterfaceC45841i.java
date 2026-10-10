package wh0;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: wh0.i */
/* JADX INFO: compiled from: MultiValueMap.java */
/* JADX INFO: loaded from: classes61.dex */
public interface InterfaceC45841i<K, V> extends Map<K, List<V>> {
    void add(K k11, V v11);

    void addAll(InterfaceC45841i<K, V> interfaceC45841i);

    default void addIfAbsent(K k11, V v11) {
        if (!containsKey(k11)) {
            add(k11, v11);
        }
    }
}
