package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.i */
/* JADX INFO: compiled from: AnnotationMap.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6412i implements InterfaceC6484a {

    /* JADX INFO: renamed from: b */
    public HashMap<Class<?>, Annotation> f10440b;

    public C6412i() {
    }

    public C6412i(HashMap<Class<?>, Annotation> map) {
        this.f10440b = map;
    }

    /* JADX INFO: renamed from: d */
    public static C6412i m11512d(C6412i c6412i, C6412i c6412i2) {
        HashMap<Class<?>, Annotation> map;
        HashMap<Class<?>, Annotation> map2;
        if (c6412i == null || (map = c6412i.f10440b) == null || map.isEmpty()) {
            return c6412i2;
        }
        if (c6412i2 == null || (map2 = c6412i2.f10440b) == null || map2.isEmpty()) {
            return c6412i;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : c6412i2.f10440b.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : c6412i.f10440b.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new C6412i(map3);
    }

    /* JADX INFO: renamed from: e */
    public static C6412i m11513e(Class<?> cls, Annotation annotation) {
        HashMap map = new HashMap(4);
        map.put(cls, annotation);
        return new C6412i(map);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11514a(Annotation annotation) {
        if (this.f10440b == null) {
            this.f10440b = new HashMap<>();
        }
        Annotation annotationPut = this.f10440b.put(annotation.annotationType(), annotation);
        return annotationPut == null || !annotationPut.equals(annotation);
    }

    /* JADX INFO: renamed from: c */
    public Iterable<Annotation> m11516c() {
        HashMap<Class<?>, Annotation> map = this.f10440b;
        return (map == null || map.size() == 0) ? Collections.EMPTY_LIST : this.f10440b.values();
    }

    @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
    public <A extends Annotation> A get(Class<A> cls) {
        HashMap<Class<?>, Annotation> map = this.f10440b;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
    public boolean has(Class<?> cls) {
        HashMap<Class<?>, Annotation> map = this.f10440b;
        if (map == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this.f10440b != null) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (this.f10440b.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
    public int size() {
        HashMap<Class<?>, Annotation> map = this.f10440b;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> map = this.f10440b;
        return map == null ? "[null]" : map.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m11515b(Annotation annotation) {
        return m11514a(annotation);
    }
}
