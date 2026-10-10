package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.impl.C6465c;
import com.fasterxml.jackson.databind.util.C6501r;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.i */
/* JADX INFO: compiled from: SerializerCache.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6460i {

    /* JADX INFO: renamed from: a */
    public final HashMap<C6501r, AbstractC6393h<Object>> f10613a = new HashMap<>(64);

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C6465c> f10614b = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final synchronized C6465c m11777a() {
        C6465c c6465cM11810b;
        c6465cM11810b = this.f10614b.get();
        if (c6465cM11810b == null) {
            c6465cM11810b = C6465c.m11810b(this.f10613a);
            this.f10614b.set(c6465cM11810b);
        }
        return c6465cM11810b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public void m11778b(JavaType javaType, AbstractC6393h<Object> abstractC6393h, AbstractC6446m abstractC6446m) throws JsonMappingException {
        synchronized (this) {
            try {
                if (this.f10613a.put(new C6501r(javaType, false), abstractC6393h) == null) {
                    this.f10614b.set(null);
                }
                if (abstractC6393h instanceof InterfaceC6459h) {
                    ((InterfaceC6459h) abstractC6393h).resolve(abstractC6446m);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m11779c(Class<?> cls, JavaType javaType, AbstractC6393h<Object> abstractC6393h, AbstractC6446m abstractC6446m) throws JsonMappingException {
        synchronized (this) {
            try {
                AbstractC6393h<Object> abstractC6393hPut = this.f10613a.put(new C6501r(cls, false), abstractC6393h);
                AbstractC6393h<Object> abstractC6393hPut2 = this.f10613a.put(new C6501r(javaType, false), abstractC6393h);
                if (abstractC6393hPut == null || abstractC6393hPut2 == null) {
                    this.f10614b.set(null);
                }
                if (abstractC6393h instanceof InterfaceC6459h) {
                    ((InterfaceC6459h) abstractC6393h).resolve(abstractC6446m);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11780d(JavaType javaType, AbstractC6393h<Object> abstractC6393h) {
        synchronized (this) {
            try {
                if (this.f10613a.put(new C6501r(javaType, true), abstractC6393h) == null) {
                    this.f10614b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11781e(Class<?> cls, AbstractC6393h<Object> abstractC6393h) {
        synchronized (this) {
            try {
                if (this.f10613a.put(new C6501r(cls, true), abstractC6393h) == null) {
                    this.f10614b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m11782f() {
        this.f10613a.clear();
    }

    /* JADX INFO: renamed from: h */
    public synchronized int m11784h() {
        return this.f10613a.size();
    }

    /* JADX INFO: renamed from: i */
    public AbstractC6393h<Object> m11785i(JavaType javaType) {
        AbstractC6393h<Object> abstractC6393h;
        synchronized (this) {
            abstractC6393h = this.f10613a.get(new C6501r(javaType, true));
        }
        return abstractC6393h;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC6393h<Object> m11786j(Class<?> cls) {
        AbstractC6393h<Object> abstractC6393h;
        synchronized (this) {
            abstractC6393h = this.f10613a.get(new C6501r(cls, true));
        }
        return abstractC6393h;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC6393h<Object> m11787k(JavaType javaType) {
        AbstractC6393h<Object> abstractC6393h;
        synchronized (this) {
            abstractC6393h = this.f10613a.get(new C6501r(javaType, false));
        }
        return abstractC6393h;
    }

    /* JADX INFO: renamed from: l */
    public AbstractC6393h<Object> m11788l(Class<?> cls) {
        AbstractC6393h<Object> abstractC6393h;
        synchronized (this) {
            abstractC6393h = this.f10613a.get(new C6501r(cls, false));
        }
        return abstractC6393h;
    }

    /* JADX INFO: renamed from: g */
    public C6465c m11783g() {
        C6465c c6465c = this.f10614b.get();
        return c6465c != null ? c6465c : m11777a();
    }
}
