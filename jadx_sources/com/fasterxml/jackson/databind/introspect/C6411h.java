package com.fasterxml.jackson.databind.introspect;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.h */
/* JADX INFO: compiled from: AnnotatedMethodMap.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6411h implements Iterable<AnnotatedMethod> {

    /* JADX INFO: renamed from: b */
    public Map<C6417n, AnnotatedMethod> f10439b;

    public C6411h() {
    }

    public C6411h(Map<C6417n, AnnotatedMethod> map) {
        this.f10439b = map;
    }

    /* JADX INFO: renamed from: a */
    public AnnotatedMethod m11511a(String str, Class<?>[] clsArr) {
        Map<C6417n, AnnotatedMethod> map = this.f10439b;
        if (map == null) {
            return null;
        }
        return map.get(new C6417n(str, clsArr));
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotatedMethod> iterator() {
        Map<C6417n, AnnotatedMethod> map = this.f10439b;
        return map == null ? Collections.emptyIterator() : map.values().iterator();
    }
}
