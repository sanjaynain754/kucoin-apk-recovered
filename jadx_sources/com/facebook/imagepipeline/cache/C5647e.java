package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p006a4.AbstractC0110a;
import p006a4.InterfaceC0117h;
import p549q5.C43620i;
import p549q5.C43628q;
import p549q5.InterfaceC43632u;
import p712w3.C45708h;
import p712w3.InterfaceC45709i;
import p712w3.InterfaceC45711k;

/* JADX INFO: renamed from: com.facebook.imagepipeline.cache.e */
/* JADX INFO: compiled from: LruCountingMemoryCache.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5647e<K, V> implements InterfaceC5645c<K, V>, InterfaceC5648f<K, V> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5645c.b<K> f8872a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final C43620i<K, InterfaceC5645c.a<K, V>> f8873b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final C43620i<K, InterfaceC5645c.a<K, V>> f8874c;

    /* JADX INFO: renamed from: e */
    public final InterfaceC43632u<V> f8876e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5648f.a f8877f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC45711k<C43628q> f8878g;

    /* JADX INFO: renamed from: h */
    public C43628q f8879h;

    /* JADX INFO: renamed from: j */
    public final boolean f8881j;

    /* JADX INFO: renamed from: k */
    public final boolean f8882k;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final Map<Bitmap, Object> f8875d = new WeakHashMap();

    /* JADX INFO: renamed from: i */
    public long f8880i = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: com.facebook.imagepipeline.cache.e$a */
    /* JADX INFO: compiled from: LruCountingMemoryCache.java */
    public class a implements InterfaceC43632u<InterfaceC5645c.a<K, V>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC43632u f8883a;

        public a(InterfaceC43632u interfaceC43632u) {
            this.f8883a = interfaceC43632u;
        }

        @Override // p549q5.InterfaceC43632u
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo9142a(InterfaceC5645c.a<K, V> aVar) {
            return C5647e.this.f8881j ? aVar.f8871g : this.f8883a.mo9142a(aVar.f8866b.m565l());
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.cache.e$b */
    /* JADX INFO: compiled from: LruCountingMemoryCache.java */
    public class b implements InterfaceC0117h<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5645c.a f8885a;

        public b(InterfaceC5645c.a aVar) {
            this.f8885a = aVar;
        }

        @Override // p006a4.InterfaceC0117h
        public void release(V v11) {
            C5647e.this.m9174y(this.f8885a);
        }
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    /* JADX INFO: renamed from: c */
    public int mo9157c(InterfaceC45709i<K> interfaceC45709i) {
        ArrayList<InterfaceC5645c.a<K, V>> arrayListM95987j;
        ArrayList<InterfaceC5645c.a<K, V>> arrayListM95987j2;
        synchronized (this) {
            arrayListM95987j = this.f8873b.m95987j(interfaceC45709i);
            arrayListM95987j2 = this.f8874c.m95987j(interfaceC45709i);
            m9166o(arrayListM95987j2);
        }
        m9168q(arrayListM95987j2);
        m9170u(arrayListM95987j);
        m9171v();
        m9169r();
        return arrayListM95987j2.size();
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    public synchronized boolean contains(K k11) {
        return this.f8874c.m95978a(k11);
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    /* JADX INFO: renamed from: f */
    public synchronized boolean mo9159f(InterfaceC45709i<K> interfaceC45709i) {
        return !this.f8874c.m95982e(interfaceC45709i).isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX INFO: renamed from: i */
    public final synchronized boolean m9160i(int i11) {
        boolean z11;
        if (i11 <= this.f8879h.maxCacheEntrySize) {
            z11 = m9162k() <= this.f8879h.maxCacheEntries - 1 && m9163l() <= this.f8879h.maxCacheSize - i11;
        }
        return z11;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m9161j(InterfaceC5645c.a<K, V> aVar) {
        C45708h.m100896g(aVar);
        C45708h.m100898i(aVar.f8867c > 0);
        aVar.f8867c--;
    }

    /* JADX INFO: renamed from: k */
    public synchronized int m9162k() {
        return this.f8874c.m95980c() - this.f8873b.m95980c();
    }

    /* JADX INFO: renamed from: l */
    public synchronized int m9163l() {
        return this.f8874c.m95983f() - this.f8873b.m95983f();
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m9164m(InterfaceC5645c.a<K, V> aVar) {
        C45708h.m100896g(aVar);
        C45708h.m100898i(!aVar.f8868d);
        aVar.f8867c++;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m9165n(InterfaceC5645c.a<K, V> aVar) {
        C45708h.m100896g(aVar);
        C45708h.m100898i(!aVar.f8868d);
        aVar.f8868d = true;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m9166o(ArrayList<InterfaceC5645c.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<InterfaceC5645c.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m9165n(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized boolean m9167p(InterfaceC5645c.a<K, V> aVar) {
        if (aVar.f8868d || aVar.f8867c != 0) {
            return false;
        }
        this.f8873b.m95985h(aVar.f8865a, aVar);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m9169r() {
        ArrayList<InterfaceC5645c.a<K, V>> arrayListM9175z;
        synchronized (this) {
            C43628q c43628q = this.f8879h;
            int iMin = Math.min(c43628q.maxEvictionQueueEntries, c43628q.maxCacheEntries - m9162k());
            C43628q c43628q2 = this.f8879h;
            arrayListM9175z = m9175z(iMin, Math.min(c43628q2.maxEvictionQueueSize, c43628q2.maxCacheSize - m9163l()));
            m9166o(arrayListM9175z);
        }
        m9168q(arrayListM9175z);
        m9170u(arrayListM9175z);
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m9171v() {
        if (this.f8880i + this.f8879h.paramsCheckIntervalMs > SystemClock.uptimeMillis()) {
            return;
        }
        this.f8880i = SystemClock.uptimeMillis();
        this.f8879h = (C43628q) C45708h.m100897h(this.f8878g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    /* JADX INFO: renamed from: w */
    public final synchronized AbstractC0110a<V> m9172w(InterfaceC5645c.a<K, V> aVar) {
        m9164m(aVar);
        return AbstractC0110a.m560u(aVar.f8866b.m565l(), new b(aVar));
    }

    /* JADX INFO: renamed from: x */
    public final synchronized AbstractC0110a<V> m9173x(InterfaceC5645c.a<K, V> aVar) {
        C45708h.m100896g(aVar);
        return (aVar.f8868d && aVar.f8867c == 0) ? aVar.f8866b : null;
    }

    /* JADX INFO: renamed from: z */
    public final synchronized ArrayList<InterfaceC5645c.a<K, V>> m9175z(int i11, int i12) {
        int iMax = Math.max(i11, 0);
        int iMax2 = Math.max(i12, 0);
        if (this.f8873b.m95980c() <= iMax && this.f8873b.m95983f() <= iMax2) {
            return null;
        }
        ArrayList<InterfaceC5645c.a<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f8873b.m95980c() <= iMax && this.f8873b.m95983f() <= iMax2) {
                break;
            }
            K kM95981d = this.f8873b.m95981d();
            if (kM95981d == null) {
                if (!this.f8882k) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f8873b.m95980c()), Integer.valueOf(this.f8873b.m95983f())));
                }
                this.f8873b.m95988k();
                break;
            }
            this.f8873b.m95986i(kM95981d);
            arrayList.add(this.f8874c.m95986i(kM95981d));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static <K, V> void m9153s(InterfaceC5645c.a<K, V> aVar) {
        InterfaceC5645c.b<K> bVar;
        if (aVar == null || (bVar = aVar.f8869e) == null) {
            return;
        }
        bVar.mo9148a(aVar.f8865a, true);
    }

    /* JADX INFO: renamed from: t */
    public static <K, V> void m9154t(InterfaceC5645c.a<K, V> aVar) {
        InterfaceC5645c.b<K> bVar;
        if (aVar == null || (bVar = aVar.f8869e) == null) {
            return;
        }
        bVar.mo9148a(aVar.f8865a, false);
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC43632u<InterfaceC5645c.a<K, V>> m9155A(InterfaceC43632u<V> interfaceC43632u) {
        return new a(interfaceC43632u);
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    /* JADX INFO: renamed from: e */
    public AbstractC0110a<V> mo9158e(K k11, AbstractC0110a<V> abstractC0110a) {
        return mo9145d(k11, abstractC0110a, this.f8872a);
    }

    /* JADX INFO: renamed from: q */
    public final void m9168q(ArrayList<InterfaceC5645c.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<InterfaceC5645c.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0110a.m555j(m9173x(it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m9170u(ArrayList<InterfaceC5645c.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<InterfaceC5645c.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m9154t(it.next());
            }
        }
    }

    public C5647e(InterfaceC43632u<V> interfaceC43632u, InterfaceC5648f.a aVar, InterfaceC45711k<C43628q> interfaceC45711k, InterfaceC5645c.b<K> bVar, boolean z11, boolean z12) {
        this.f8876e = interfaceC43632u;
        this.f8873b = new C43620i<>(m9155A(interfaceC43632u));
        this.f8874c = new C43620i<>(m9155A(interfaceC43632u));
        this.f8877f = aVar;
        this.f8878g = interfaceC45711k;
        this.f8879h = (C43628q) C45708h.m100897h(interfaceC45711k.get(), "mMemoryCacheParamsSupplier returned null");
        this.f8872a = bVar;
        this.f8881j = z11;
        this.f8882k = z12;
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    /* JADX INFO: renamed from: a */
    public void mo9156a(K k11) {
        C45708h.m100896g(k11);
        synchronized (this) {
            try {
                InterfaceC5645c.a<K, V> aVarM95986i = this.f8873b.m95986i(k11);
                if (aVarM95986i != null) {
                    this.f8873b.m95985h(k11, aVarM95986i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5645c
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<V> mo9144b(K k11) {
        InterfaceC5645c.a<K, V> aVarM95986i;
        boolean z11;
        AbstractC0110a<V> abstractC0110a;
        C45708h.m100896g(k11);
        synchronized (this) {
            try {
                aVarM95986i = this.f8873b.m95986i(k11);
                z11 = false;
                if (aVarM95986i != null) {
                    InterfaceC5645c.a<K, V> aVarM95986i2 = this.f8874c.m95986i(k11);
                    C45708h.m100896g(aVarM95986i2);
                    if (aVarM95986i2.f8867c == 0) {
                        z11 = true;
                    }
                    C45708h.m100898i(z11);
                    abstractC0110a = aVarM95986i2.f8866b;
                    z11 = true;
                } else {
                    abstractC0110a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            m9154t(aVarM95986i);
        }
        return abstractC0110a;
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5645c
    /* JADX INFO: renamed from: d */
    public AbstractC0110a<V> mo9145d(K k11, AbstractC0110a<V> abstractC0110a, InterfaceC5645c.b<K> bVar) {
        InterfaceC5645c.a<K, V> aVarM95986i;
        AbstractC0110a<V> abstractC0110aM9172w;
        AbstractC0110a<V> abstractC0110aM9173x;
        InterfaceC5645c.a<K, V> aVarM9147b;
        C45708h.m100896g(k11);
        C45708h.m100896g(abstractC0110a);
        m9171v();
        synchronized (this) {
            try {
                aVarM95986i = this.f8873b.m95986i(k11);
                InterfaceC5645c.a<K, V> aVarM95986i2 = this.f8874c.m95986i(k11);
                abstractC0110aM9172w = null;
                if (aVarM95986i2 != null) {
                    m9165n(aVarM95986i2);
                    abstractC0110aM9173x = m9173x(aVarM95986i2);
                } else {
                    abstractC0110aM9173x = null;
                }
                int iMo9142a = this.f8876e.mo9142a(abstractC0110a.m565l());
                if (m9160i(iMo9142a)) {
                    if (this.f8881j) {
                        aVarM9147b = InterfaceC5645c.a.m9146a(k11, abstractC0110a, iMo9142a, bVar);
                    } else {
                        aVarM9147b = InterfaceC5645c.a.m9147b(k11, abstractC0110a, bVar);
                    }
                    this.f8874c.m95985h(k11, aVarM9147b);
                    abstractC0110aM9172w = m9172w(aVarM9147b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC0110a.m555j(abstractC0110aM9173x);
        m9154t(aVarM95986i);
        m9169r();
        return abstractC0110aM9172w;
    }

    @Override // com.facebook.imagepipeline.cache.InterfaceC5648f
    public AbstractC0110a<V> get(K k11) {
        InterfaceC5645c.a<K, V> aVarM95986i;
        AbstractC0110a<V> abstractC0110aM9172w;
        C45708h.m100896g(k11);
        synchronized (this) {
            try {
                aVarM95986i = this.f8873b.m95986i(k11);
                InterfaceC5645c.a<K, V> aVarM95979b = this.f8874c.m95979b(k11);
                if (aVarM95979b != null) {
                    abstractC0110aM9172w = m9172w(aVarM95979b);
                } else {
                    abstractC0110aM9172w = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m9154t(aVarM95986i);
        m9171v();
        m9169r();
        return abstractC0110aM9172w;
    }

    /* JADX INFO: renamed from: y */
    public final void m9174y(InterfaceC5645c.a<K, V> aVar) {
        boolean zM9167p;
        AbstractC0110a<V> abstractC0110aM9173x;
        C45708h.m100896g(aVar);
        synchronized (this) {
            m9161j(aVar);
            zM9167p = m9167p(aVar);
            abstractC0110aM9173x = m9173x(aVar);
        }
        AbstractC0110a.m555j(abstractC0110aM9173x);
        if (!zM9167p) {
            aVar = null;
        }
        m9153s(aVar);
        m9171v();
        m9169r();
    }
}
