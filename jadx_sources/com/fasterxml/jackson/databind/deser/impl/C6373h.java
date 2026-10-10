package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.InterfaceC6269a0;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.h */
/* JADX INFO: compiled from: ReadableObjectId.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6373h {

    /* JADX INFO: renamed from: a */
    public Object f10326a;

    /* JADX INFO: renamed from: b */
    public final ObjectIdGenerator.IdKey f10327b;

    /* JADX INFO: renamed from: c */
    public LinkedList<a> f10328c;

    /* JADX INFO: renamed from: d */
    public InterfaceC6269a0 f10329d;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.h$a */
    /* JADX INFO: compiled from: ReadableObjectId.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public final UnresolvedForwardReference f10330a;

        /* JADX INFO: renamed from: b */
        public final Class<?> f10331b;

        public a(UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            this.f10330a = unresolvedForwardReference;
            this.f10331b = cls;
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo11205c(Object obj, Object obj2) throws IOException;

        /* JADX INFO: renamed from: a */
        public Class<?> m11381a() {
            return this.f10331b;
        }

        /* JADX INFO: renamed from: b */
        public JsonLocation m11382b() {
            return this.f10330a.getLocation();
        }

        /* JADX INFO: renamed from: d */
        public boolean m11383d(Object obj) {
            return obj.equals(this.f10330a.getUnresolvedId());
        }

        public a(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this.f10330a = unresolvedForwardReference;
            this.f10331b = javaType.getRawClass();
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m11380h(DeserializationContext deserializationContext) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m11373a(a aVar) {
        if (this.f10328c == null) {
            this.f10328c = new LinkedList<>();
        }
        this.f10328c.add(aVar);
    }

    /* JADX INFO: renamed from: b */
    public void m11374b(Object obj) throws IOException {
        this.f10329d.mo10778a(this.f10327b, obj);
        this.f10326a = obj;
        Object obj2 = this.f10327b.key;
        LinkedList<a> linkedList = this.f10328c;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            this.f10328c = null;
            while (it.hasNext()) {
                it.next().mo11205c(obj2, obj);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ObjectIdGenerator.IdKey m11375c() {
        return this.f10327b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m11376d() {
        LinkedList<a> linkedList = this.f10328c;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public Iterator<a> m11377e() {
        LinkedList<a> linkedList = this.f10328c;
        return linkedList == null ? Collections.EMPTY_LIST.iterator() : linkedList.iterator();
    }

    /* JADX INFO: renamed from: f */
    public Object m11378f() {
        Object objMo10779b = this.f10329d.mo10779b(this.f10327b);
        this.f10326a = objMo10779b;
        return objMo10779b;
    }

    /* JADX INFO: renamed from: g */
    public void m11379g(InterfaceC6269a0 interfaceC6269a0) {
        this.f10329d = interfaceC6269a0;
    }

    public String toString() {
        return String.valueOf(this.f10327b);
    }

    public C6373h(ObjectIdGenerator.IdKey idKey) {
        this.f10327b = idKey;
    }
}
