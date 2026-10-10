package com.facebook.imagepipeline.cache;

import androidx.annotation.VisibleForTesting;
import p006a4.AbstractC0110a;
import p712w3.C45708h;
import p819z3.InterfaceC46674c;

/* JADX INFO: renamed from: com.facebook.imagepipeline.cache.c */
/* JADX INFO: compiled from: CountingMemoryCache.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC5645c<K, V> extends InterfaceC5648f<K, V>, InterfaceC46674c {

    /* JADX INFO: renamed from: com.facebook.imagepipeline.cache.c$a */
    /* JADX INFO: compiled from: CountingMemoryCache.java */
    @VisibleForTesting
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f8865a;

        /* JADX INFO: renamed from: b */
        public final AbstractC0110a<V> f8866b;

        /* JADX INFO: renamed from: e */
        public final b<K> f8869e;

        /* JADX INFO: renamed from: g */
        public int f8871g;

        /* JADX INFO: renamed from: c */
        public int f8867c = 0;

        /* JADX INFO: renamed from: d */
        public boolean f8868d = false;

        /* JADX INFO: renamed from: f */
        public int f8870f = 0;

        @VisibleForTesting
        /* JADX INFO: renamed from: b */
        public static <K, V> a<K, V> m9147b(K k11, AbstractC0110a<V> abstractC0110a, b<K> bVar) {
            return m9146a(k11, abstractC0110a, -1, bVar);
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: a */
        public static <K, V> a<K, V> m9146a(K k11, AbstractC0110a<V> abstractC0110a, int i11, b<K> bVar) {
            return new a<>(k11, abstractC0110a, bVar, i11);
        }

        public a(K k11, AbstractC0110a<V> abstractC0110a, b<K> bVar, int i11) {
            this.f8865a = (K) C45708h.m100896g(k11);
            this.f8866b = (AbstractC0110a) C45708h.m100896g(AbstractC0110a.m553h(abstractC0110a));
            this.f8869e = bVar;
            this.f8871g = i11;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.cache.c$b */
    /* JADX INFO: compiled from: CountingMemoryCache.java */
    public interface b<K> {
        /* JADX INFO: renamed from: a */
        void mo9148a(K k11, boolean z11);
    }

    /* JADX INFO: renamed from: b */
    AbstractC0110a<V> mo9144b(K k11);

    /* JADX INFO: renamed from: d */
    AbstractC0110a<V> mo9145d(K k11, AbstractC0110a<V> abstractC0110a, b<K> bVar);
}
