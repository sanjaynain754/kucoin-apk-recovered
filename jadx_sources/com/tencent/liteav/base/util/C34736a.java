package com.tencent.liteav.base.util;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34736a<T> {

    /* JADX INFO: renamed from: b */
    private final a<T> f73523b;

    /* JADX INFO: renamed from: a */
    private final ThreadLocal<T> f73522a = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    private WeakReference<T> f73524c = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.a$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo76102a();
    }

    /* JADX INFO: renamed from: b */
    private T m76100b() {
        T tMo76102a;
        T t11 = this.f73524c.get();
        if (t11 != null) {
            return t11;
        }
        synchronized (this) {
            try {
                tMo76102a = this.f73524c.get();
                if (tMo76102a == null) {
                    tMo76102a = this.f73523b.mo76102a();
                    this.f73524c = new WeakReference<>(tMo76102a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tMo76102a;
    }

    /* JADX INFO: renamed from: a */
    public final T m76101a() {
        T t11 = this.f73522a.get();
        if (t11 != null) {
            return t11;
        }
        T tM76100b = m76100b();
        this.f73522a.set(tM76100b);
        return tM76100b;
    }

    public C34736a(a<T> aVar) {
        this.f73523b = aVar;
    }
}
