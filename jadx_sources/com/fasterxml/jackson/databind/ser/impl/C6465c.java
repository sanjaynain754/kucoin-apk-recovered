package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.C6501r;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.c */
/* JADX INFO: compiled from: ReadOnlyClassToSerializerMap.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6465c {

    /* JADX INFO: renamed from: a */
    public final a[] f10637a;

    /* JADX INFO: renamed from: b */
    public final int f10638b;

    /* JADX INFO: renamed from: c */
    public final int f10639c;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.c$a */
    /* JADX INFO: compiled from: ReadOnlyClassToSerializerMap.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC6393h<Object> f10640a;

        /* JADX INFO: renamed from: b */
        public final a f10641b;

        /* JADX INFO: renamed from: c */
        public final Class<?> f10642c;

        /* JADX INFO: renamed from: d */
        public final JavaType f10643d;

        /* JADX INFO: renamed from: e */
        public final boolean f10644e;

        /* JADX INFO: renamed from: a */
        public boolean m11815a(JavaType javaType) {
            return this.f10644e && javaType.equals(this.f10643d);
        }

        /* JADX INFO: renamed from: b */
        public boolean m11816b(Class<?> cls) {
            return this.f10642c == cls && this.f10644e;
        }

        /* JADX INFO: renamed from: c */
        public boolean m11817c(JavaType javaType) {
            return !this.f10644e && javaType.equals(this.f10643d);
        }

        /* JADX INFO: renamed from: d */
        public boolean m11818d(Class<?> cls) {
            return this.f10642c == cls && !this.f10644e;
        }

        public a(a aVar, C6501r c6501r, AbstractC6393h<Object> abstractC6393h) {
            this.f10641b = aVar;
            this.f10640a = abstractC6393h;
            this.f10644e = c6501r.m12059c();
            this.f10642c = c6501r.m12057a();
            this.f10643d = c6501r.m12058b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m11809a(int i11) {
        int i12 = 8;
        while (i12 < (i11 <= 64 ? i11 + i11 : i11 + (i11 >> 2))) {
            i12 += i12;
        }
        return i12;
    }

    /* JADX INFO: renamed from: b */
    public static C6465c m11810b(HashMap<C6501r, AbstractC6393h<Object>> map) {
        return new C6465c(map);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC6393h<Object> m11811c(JavaType javaType) {
        a aVar = this.f10637a[C6501r.m12053d(javaType) & this.f10639c];
        if (aVar == null) {
            return null;
        }
        if (aVar.m11815a(javaType)) {
            return aVar.f10640a;
        }
        do {
            aVar = aVar.f10641b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.m11815a(javaType));
        return aVar.f10640a;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC6393h<Object> m11812d(Class<?> cls) {
        a aVar = this.f10637a[C6501r.m12054e(cls) & this.f10639c];
        if (aVar == null) {
            return null;
        }
        if (aVar.m11816b(cls)) {
            return aVar.f10640a;
        }
        do {
            aVar = aVar.f10641b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.m11816b(cls));
        return aVar.f10640a;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC6393h<Object> m11813e(JavaType javaType) {
        a aVar = this.f10637a[C6501r.m12055f(javaType) & this.f10639c];
        if (aVar == null) {
            return null;
        }
        if (aVar.m11817c(javaType)) {
            return aVar.f10640a;
        }
        do {
            aVar = aVar.f10641b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.m11817c(javaType));
        return aVar.f10640a;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC6393h<Object> m11814f(Class<?> cls) {
        a aVar = this.f10637a[C6501r.m12056g(cls) & this.f10639c];
        if (aVar == null) {
            return null;
        }
        if (aVar.m11818d(cls)) {
            return aVar.f10640a;
        }
        do {
            aVar = aVar.f10641b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.m11818d(cls));
        return aVar.f10640a;
    }

    public C6465c(Map<C6501r, AbstractC6393h<Object>> map) {
        int iM11809a = m11809a(map.size());
        this.f10638b = iM11809a;
        this.f10639c = iM11809a - 1;
        a[] aVarArr = new a[iM11809a];
        for (Map.Entry<C6501r, AbstractC6393h<Object>> entry : map.entrySet()) {
            C6501r key = entry.getKey();
            int iHashCode = key.hashCode() & this.f10639c;
            aVarArr[iHashCode] = new a(aVarArr[iHashCode], key, entry.getValue());
        }
        this.f10637a = aVarArr;
    }
}
