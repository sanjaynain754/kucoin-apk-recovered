package com.fasterxml.jackson.databind.util;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.j */
/* JADX INFO: compiled from: LookupCache.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6493j<K, V> {
    void clear();

    V get(Object obj);

    V putIfAbsent(K k11, V v11);
}
