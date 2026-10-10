package wh0;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import org.springframework.util.MultiValueMapAdapter;

/* JADX INFO: renamed from: wh0.g */
/* JADX INFO: compiled from: CollectionUtils.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC45839g {
    /* JADX INFO: renamed from: b */
    public static int m101259b(int i11) {
        return (int) Math.ceil(((double) i11) / 0.75d);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m101260c(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> LinkedHashMap<K, V> m101261d(int i11) {
        return new LinkedHashMap<>(m101259b(i11), 0.75f);
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> InterfaceC45841i<K, V> m101262e(Map<K, List<V>> map) {
        return new MultiValueMapAdapter(map);
    }

    /* JADX INFO: renamed from: f */
    public static <K, V> InterfaceC45841i<K, V> m101263f(InterfaceC45841i<? extends K, ? extends V> interfaceC45841i) {
        AbstractC45833a.m101250a(interfaceC45841i, "'targetMap' must not be null");
        final LinkedHashMap linkedHashMapM101261d = m101261d(interfaceC45841i.size());
        interfaceC45841i.forEach(new BiConsumer() { // from class: wh0.f
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                linkedHashMapM101261d.put(obj, Collections.unmodifiableList((List) obj2));
            }
        });
        return m101262e(Collections.unmodifiableMap(linkedHashMapM101261d));
    }
}
