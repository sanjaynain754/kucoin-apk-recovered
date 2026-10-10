package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import p523p2.C43363j;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.f */
/* JADX INFO: compiled from: DataRewinderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class C5325f {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5324e.a<?> f6753b = new a();

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, InterfaceC5324e.a<?>> f6754a = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.f$a */
    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public class a implements InterfaceC5324e.a<Object> {
        @Override // com.bumptech.glide.load.data.InterfaceC5324e.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Object> mo6663a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5324e.a
        @NonNull
        /* JADX INFO: renamed from: b */
        public InterfaceC5324e<Object> mo6664b(@NonNull Object obj) {
            return new b(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.f$b */
    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public static final class b implements InterfaceC5324e<Object> {

        /* JADX INFO: renamed from: a */
        public final Object f6755a;

        @Override // com.bumptech.glide.load.data.InterfaceC5324e
        @NonNull
        /* JADX INFO: renamed from: a */
        public Object mo6660a() {
            return this.f6755a;
        }

        public b(@NonNull Object obj) {
            this.f6755a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5324e
        /* JADX INFO: renamed from: b */
        public void mo6661b() {
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public synchronized <T> InterfaceC5324e<T> m6676a(@NonNull T t11) {
        InterfaceC5324e.a<?> aVar;
        try {
            C43363j.m95506d(t11);
            aVar = this.f6754a.get(t11.getClass());
            if (aVar == null) {
                for (InterfaceC5324e.a<?> aVar2 : this.f6754a.values()) {
                    if (aVar2.mo6663a().isAssignableFrom(t11.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f6753b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC5324e<T>) aVar.mo6664b(t11);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m6677b(@NonNull InterfaceC5324e.a<?> aVar) {
        this.f6754a.put(aVar.mo6663a(), aVar);
    }
}
