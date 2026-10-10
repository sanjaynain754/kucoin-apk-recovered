package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.type.a */
/* JADX INFO: compiled from: ClassStack.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6479a {

    /* JADX INFO: renamed from: a */
    public final C6479a f10698a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f10699b;

    /* JADX INFO: renamed from: c */
    public ArrayList<ResolvedRecursiveType> f10700c;

    public C6479a(Class<?> cls) {
        this(null, cls);
    }

    public C6479a(C6479a c6479a, Class<?> cls) {
        this.f10698a = c6479a;
        this.f10699b = cls;
    }

    /* JADX INFO: renamed from: a */
    public void m11859a(ResolvedRecursiveType resolvedRecursiveType) {
        if (this.f10700c == null) {
            this.f10700c = new ArrayList<>();
        }
        this.f10700c.add(resolvedRecursiveType);
    }

    /* JADX INFO: renamed from: b */
    public C6479a m11860b(Class<?> cls) {
        return new C6479a(this, cls);
    }

    /* JADX INFO: renamed from: c */
    public C6479a m11861c(Class<?> cls) {
        if (this.f10699b == cls) {
            return this;
        }
        for (C6479a c6479a = this.f10698a; c6479a != null; c6479a = c6479a.f10698a) {
            if (c6479a.f10699b == cls) {
                return c6479a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m11862d(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this.f10700c;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this.f10700c;
        sb2.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb2.append(')');
        for (C6479a c6479a = this; c6479a != null; c6479a = c6479a.f10698a) {
            sb2.append(' ');
            sb2.append(c6479a.f10699b.getName());
        }
        sb2.append(']');
        return sb2.toString();
    }
}
