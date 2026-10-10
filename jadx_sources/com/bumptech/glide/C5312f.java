package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bumptech.glide.f */
/* JADX INFO: compiled from: GlideExperiments.java */
/* JADX INFO: loaded from: classes.dex */
public class C5312f {

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, Object> f6692a;

    /* JADX INFO: renamed from: com.bumptech.glide.f$a */
    /* JADX INFO: compiled from: GlideExperiments.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Map<Class<?>, Object> f6693a = new HashMap();

        /* JADX INFO: renamed from: b */
        public C5312f m6589b() {
            return new C5312f(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m6587a(Class<Object> cls) {
        return this.f6692a.containsKey(cls);
    }

    public C5312f(a aVar) {
        this.f6692a = Collections.unmodifiableMap(new HashMap(aVar.f6693a));
    }
}
