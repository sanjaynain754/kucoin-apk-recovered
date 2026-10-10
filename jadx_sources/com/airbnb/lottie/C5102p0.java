package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p484o1.C42924f;
import p484o1.ThreadFactoryC42925g;

/* JADX INFO: renamed from: com.airbnb.lottie.p0 */
/* JADX INFO: compiled from: LottieTask.java */
/* JADX INFO: loaded from: classes.dex */
public class C5102p0<T> {

    /* JADX INFO: renamed from: e */
    public static Executor f6180e = Executors.newCachedThreadPool(new ThreadFactoryC42925g());

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC5085j0<T>> f6181a;

    /* JADX INFO: renamed from: b */
    public final Set<InterfaceC5085j0<Throwable>> f6182b;

    /* JADX INFO: renamed from: c */
    public final Handler f6183c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public volatile C5098n0<T> f6184d;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C5102p0(Callable<C5098n0<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: renamed from: c */
    public synchronized C5102p0<T> m5815c(InterfaceC5085j0<Throwable> interfaceC5085j0) {
        try {
            C5098n0<T> c5098n0 = this.f6184d;
            if (c5098n0 != null && c5098n0.m5810a() != null) {
                interfaceC5085j0.onResult(c5098n0.m5810a());
            }
            this.f6182b.add(interfaceC5085j0);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public synchronized C5102p0<T> m5816d(InterfaceC5085j0<T> interfaceC5085j0) {
        try {
            C5098n0<T> c5098n0 = this.f6184d;
            if (c5098n0 != null && c5098n0.m5811b() != null) {
                interfaceC5085j0.onResult(c5098n0.m5811b());
            }
            this.f6181a.add(interfaceC5085j0);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m5818f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f6182b);
        if (arrayList.isEmpty()) {
            C42924f.m94159d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5085j0) it.next()).onResult(th2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m5821i(T t11) {
        Iterator it = new ArrayList(this.f6181a).iterator();
        while (it.hasNext()) {
            ((InterfaceC5085j0) it.next()).onResult(t11);
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized C5102p0<T> m5822j(InterfaceC5085j0<Throwable> interfaceC5085j0) {
        this.f6182b.remove(interfaceC5085j0);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public synchronized C5102p0<T> m5823k(InterfaceC5085j0<T> interfaceC5085j0) {
        this.f6181a.remove(interfaceC5085j0);
        return this;
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.p0$a */
    /* JADX INFO: compiled from: LottieTask.java */
    public static class a<T> extends FutureTask<C5098n0<T>> {

        /* JADX INFO: renamed from: b */
        public C5102p0<T> f6185b;

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f6185b.m5824l(get());
                } catch (InterruptedException | ExecutionException e11) {
                    this.f6185b.m5824l(new C5098n0(e11));
                }
            } finally {
                this.f6185b = null;
            }
        }

        public a(C5102p0<T> c5102p0, Callable<C5098n0<T>> callable) {
            super(callable);
            this.f6185b = c5102p0;
        }
    }

    public C5102p0(T t11) {
        this.f6181a = new LinkedHashSet(1);
        this.f6182b = new LinkedHashSet(1);
        this.f6183c = new Handler(Looper.getMainLooper());
        this.f6184d = null;
        m5824l(new C5098n0<>(t11));
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public C5098n0<T> m5817e() {
        return this.f6184d;
    }

    /* JADX INFO: renamed from: h */
    public final void m5820h() {
        C5098n0<T> c5098n0 = this.f6184d;
        if (c5098n0 == null) {
            return;
        }
        if (c5098n0.m5811b() != null) {
            m5821i(c5098n0.m5811b());
        } else {
            m5818f(c5098n0.m5810a());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5824l(@Nullable C5098n0<T> c5098n0) {
        if (this.f6184d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f6184d = c5098n0;
        m5819g();
    }

    /* JADX INFO: renamed from: g */
    public final void m5819g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m5820h();
        } else {
            this.f6183c.post(new Runnable() { // from class: com.airbnb.lottie.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6177b.m5820h();
                }
            });
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C5102p0(Callable<C5098n0<T>> callable, boolean z11) {
        this.f6181a = new LinkedHashSet(1);
        this.f6182b = new LinkedHashSet(1);
        this.f6183c = new Handler(Looper.getMainLooper());
        this.f6184d = null;
        if (z11) {
            try {
                m5824l(callable.call());
                return;
            } catch (Throwable th2) {
                m5824l(new C5098n0<>(th2));
                return;
            }
        }
        f6180e.execute(new a(this, callable));
    }
}
