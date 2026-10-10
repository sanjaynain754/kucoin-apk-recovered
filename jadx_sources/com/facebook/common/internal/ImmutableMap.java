package com.facebook.common.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class ImmutableMap<K, V> extends HashMap<K, V> {
    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8532of() {
        return Collections.unmodifiableMap(new HashMap());
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return new ImmutableMap<>(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8533of(K k11, V v11) {
        HashMap map = new HashMap(1);
        map.put(k11, v11);
        return Collections.unmodifiableMap(map);
    }

    public ImmutableMap(Map<? extends K, ? extends V> map) {
        super(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8534of(K k11, V v11, K k12, V v12) {
        HashMap map = new HashMap(2);
        map.put(k11, v11);
        map.put(k12, v12);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8535of(K k11, V v11, K k12, V v12, K k13, V v13) {
        HashMap map = new HashMap(3);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8536of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        HashMap map = new HashMap(4);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8537of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        HashMap map = new HashMap(5);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m8538of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        HashMap map = new HashMap(6);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        return Collections.unmodifiableMap(map);
    }
}
