package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p523p2.C43363j;
import p628t1.InterfaceC44610b;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.a */
/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5341a {

    /* JADX INFO: renamed from: a */
    public final boolean f6822a;

    /* JADX INFO: renamed from: b */
    public final Executor f6823b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final Map<InterfaceC44610b, c> f6824c;

    /* JADX INFO: renamed from: d */
    public final ReferenceQueue<C5348h<?>> f6825d;

    /* JADX INFO: renamed from: e */
    public C5348h.a f6826e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f6827f;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a */
    /* JADX INFO: compiled from: ActiveResources.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActiveResources.java */
        public class RunnableC46960a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Runnable f6828b;

            public RunnableC46960a(Runnable runnable) {
                this.f6828b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f6828b.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC46960a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$b */
    /* JADX INFO: compiled from: ActiveResources.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5341a.this.m6747b();
        }
    }

    public C5341a(boolean z11) {
        this(z11, Executors.newSingleThreadExecutor(new a()));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m6746a(InterfaceC44610b interfaceC44610b, C5348h<?> c5348h) {
        c cVarPut = this.f6824c.put(interfaceC44610b, new c(interfaceC44610b, c5348h, this.f6825d, this.f6822a));
        if (cVarPut != null) {
            cVarPut.m6752a();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m6748c(@NonNull c cVar) {
        InterfaceC45359j<?> interfaceC45359j;
        synchronized (this) {
            this.f6824c.remove(cVar.f6831a);
            if (cVar.f6832b && (interfaceC45359j = cVar.f6833c) != null) {
                this.f6826e.mo6785c(cVar.f6831a, new C5348h<>(interfaceC45359j, true, false, cVar.f6831a, this.f6826e));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m6749d(InterfaceC44610b interfaceC44610b) {
        c cVarRemove = this.f6824c.remove(interfaceC44610b);
        if (cVarRemove != null) {
            cVarRemove.m6752a();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public synchronized C5348h<?> m6750e(InterfaceC44610b interfaceC44610b) {
        c cVar = this.f6824c.get(interfaceC44610b);
        if (cVar == null) {
            return null;
        }
        C5348h<?> c5348h = cVar.get();
        if (c5348h == null) {
            m6748c(cVar);
        }
        return c5348h;
    }

    /* JADX INFO: renamed from: f */
    public void m6751f(C5348h.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f6826e = aVar;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$c */
    /* JADX INFO: compiled from: ActiveResources.java */
    @VisibleForTesting
    public static final class c extends WeakReference<C5348h<?>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC44610b f6831a;

        /* JADX INFO: renamed from: b */
        public final boolean f6832b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public InterfaceC45359j<?> f6833c;

        /* JADX INFO: renamed from: a */
        public void m6752a() {
            this.f6833c = null;
            clear();
        }

        public c(@NonNull InterfaceC44610b interfaceC44610b, @NonNull C5348h<?> c5348h, @NonNull ReferenceQueue<? super C5348h<?>> referenceQueue, boolean z11) {
            InterfaceC45359j<?> interfaceC45359j;
            super(c5348h, referenceQueue);
            this.f6831a = (InterfaceC44610b) C43363j.m95506d(interfaceC44610b);
            if (c5348h.m6822d() && z11) {
                interfaceC45359j = (InterfaceC45359j) C43363j.m95506d(c5348h.m6821c());
            } else {
                interfaceC45359j = null;
            }
            this.f6833c = interfaceC45359j;
            this.f6832b = c5348h.m6822d();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6747b() {
        while (!this.f6827f) {
            try {
                m6748c((c) this.f6825d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @VisibleForTesting
    public C5341a(boolean z11, Executor executor) {
        this.f6824c = new HashMap();
        this.f6825d = new ReferenceQueue<>();
        this.f6822a = z11;
        this.f6823b = executor;
        executor.execute(new b());
    }
}
