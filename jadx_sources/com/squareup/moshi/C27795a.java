package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: com.squareup.moshi.a */
/* JADX INFO: compiled from: ArrayJsonAdapter.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27795a extends AbstractC27800f<Object> {

    /* JADX INFO: renamed from: c */
    public static final AbstractC27800f.d f56573c = new a();

    /* JADX INFO: renamed from: a */
    public final Class<?> f56574a;

    /* JADX INFO: renamed from: b */
    public final AbstractC27800f<Object> f56575b;

    /* JADX INFO: renamed from: com.squareup.moshi.a$a */
    /* JADX INFO: compiled from: ArrayJsonAdapter.java */
    public class a implements AbstractC27800f.d {
        @Override // com.squareup.moshi.AbstractC27800f.d
        /* JADX INFO: renamed from: a */
        public AbstractC27800f<?> mo68668a(Type type, Set<? extends Annotation> set, C27809o c27809o) {
            Type typeM68768a = C27811q.m68768a(type);
            if (typeM68768a == null || !set.isEmpty()) {
                return null;
            }
            return new C27795a(C27811q.m68774g(typeM68768a), c27809o.m68737d(typeM68768a)).m68684d();
        }
    }

    @Override // com.squareup.moshi.AbstractC27800f
    /* JADX INFO: renamed from: b */
    public Object mo68666b(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo68631a();
        while (jsonReader.mo68636j()) {
            arrayList.add(this.f56575b.mo68666b(jsonReader));
        }
        jsonReader.mo68633g();
        Object objNewInstance = Array.newInstance(this.f56574a, arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Array.set(objNewInstance, i11, arrayList.get(i11));
        }
        return objNewInstance;
    }

    public String toString() {
        return this.f56575b + ".array()";
    }

    public C27795a(Class<?> cls, AbstractC27800f<Object> abstractC27800f) {
        this.f56574a = cls;
        this.f56575b = abstractC27800f;
    }

    @Override // com.squareup.moshi.AbstractC27800f
    /* JADX INFO: renamed from: f */
    public void mo68667f(AbstractC27807m abstractC27807m, Object obj) throws IOException {
        abstractC27807m.mo68713a();
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            this.f56575b.mo68667f(abstractC27807m, Array.get(obj, i11));
        }
        abstractC27807m.mo68715h();
    }
}
