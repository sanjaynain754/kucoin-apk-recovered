package com.facebook.datasource;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p251f4.InterfaceC37351b;
import p251f4.InterfaceC37353d;
import p712w3.C45708h;

/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractDataSource<T> implements InterfaceC37351b<T> {

    /* JADX INFO: renamed from: a */
    public Map<String, Object> f8182a;

    /* JADX INFO: renamed from: d */
    public T f8185d = null;

    /* JADX INFO: renamed from: e */
    public Throwable f8186e = null;

    /* JADX INFO: renamed from: f */
    public float f8187f = 0.0f;

    /* JADX INFO: renamed from: c */
    public boolean f8184c = false;

    /* JADX INFO: renamed from: b */
    public DataSourceStatus f8183b = DataSourceStatus.IN_PROGRESS;

    /* JADX INFO: renamed from: g */
    public final ConcurrentLinkedQueue<Pair<InterfaceC37353d<T>, Executor>> f8188g = new ConcurrentLinkedQueue<>();

    public enum DataSourceStatus {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* JADX INFO: renamed from: com.facebook.datasource.AbstractDataSource$a */
    public class RunnableC5568a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f8190b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC37353d f8191c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f8192d;

        public RunnableC5568a(boolean z11, InterfaceC37353d interfaceC37353d, boolean z12) {
            this.f8190b = z11;
            this.f8191c = interfaceC37353d;
            this.f8192d = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8190b) {
                this.f8191c.onFailure(AbstractDataSource.this);
            } else if (this.f8192d) {
                this.f8191c.onCancellation(AbstractDataSource.this);
            } else {
                this.f8191c.onNewResult(AbstractDataSource.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.datasource.AbstractDataSource$b */
    public class RunnableC5569b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC37353d f8194b;

        public RunnableC5569b(InterfaceC37353d interfaceC37353d) {
            this.f8194b = interfaceC37353d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8194b.onProgressUpdate(AbstractDataSource.this);
        }
    }

    /* JADX INFO: renamed from: com.facebook.datasource.AbstractDataSource$c */
    public interface InterfaceC5570c {
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC5570c m8587f() {
        return null;
    }

    @Override // p251f4.InterfaceC37351b
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo8588a() {
        return this.f8185d != null;
    }

    @Override // p251f4.InterfaceC37351b
    /* JADX INFO: renamed from: c */
    public synchronized Throwable mo8590c() {
        return this.f8186e;
    }

    @Override // p251f4.InterfaceC37351b
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f8184c) {
                    return false;
                }
                this.f8184c = true;
                T t11 = this.f8185d;
                this.f8185d = null;
                if (t11 != null) {
                    mo8592e(t11);
                }
                if (!isFinished()) {
                    m8596j();
                }
                synchronized (this) {
                    this.f8188g.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p251f4.InterfaceC37351b
    /* JADX INFO: renamed from: d */
    public boolean mo8591d() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m8593g() {
        return this.f8183b == DataSourceStatus.FAILURE;
    }

    @Override // p251f4.InterfaceC37351b
    public synchronized float getProgress() {
        return this.f8187f;
    }

    @Override // p251f4.InterfaceC37351b
    public synchronized T getResult() {
        return this.f8185d;
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m8594h() {
        return this.f8184c;
    }

    @Override // p251f4.InterfaceC37351b
    public synchronized boolean isFinished() {
        return this.f8183b != DataSourceStatus.IN_PROGRESS;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo8599m(Throwable th2) {
        return m8600n(th2, null);
    }

    /* JADX INFO: renamed from: o */
    public final synchronized boolean m8601o(Throwable th2, Map<String, Object> map) {
        if (!this.f8184c && this.f8183b == DataSourceStatus.IN_PROGRESS) {
            this.f8183b = DataSourceStatus.FAILURE;
            this.f8186e = th2;
            this.f8182a = map;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m8603q(float f11) {
        if (!this.f8184c && this.f8183b == DataSourceStatus.IN_PROGRESS) {
            if (f11 < this.f8187f) {
                return false;
            }
            this.f8187f = f11;
            return true;
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: s */
    public final boolean m8605s(T t11, boolean z11) {
        T t12;
        T t13 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f8184c && this.f8183b == DataSourceStatus.IN_PROGRESS) {
                            if (z11) {
                                this.f8183b = DataSourceStatus.SUCCESS;
                                this.f8187f = 1.0f;
                            }
                            T t14 = this.f8185d;
                            if (t14 != t11) {
                                try {
                                    this.f8185d = t11;
                                    t12 = t14;
                                } catch (Throwable th2) {
                                    th = th2;
                                    t13 = t14;
                                    throw th;
                                }
                            } else {
                                t12 = null;
                            }
                            if (t12 != null) {
                                mo8592e(t12);
                            }
                            return true;
                        }
                        if (t11 != null) {
                            mo8592e(t11);
                        }
                        return false;
                    } catch (Throwable th3) {
                        t13 = t11;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            if (t13 != null) {
                mo8592e(t13);
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: t */
    public final synchronized boolean m8606t() {
        return m8594h() && !isFinished();
    }

    @Override // p251f4.InterfaceC37351b
    public Map<String, Object> getExtras() {
        return this.f8182a;
    }

    /* JADX INFO: renamed from: i */
    public void m8595i(InterfaceC37353d<T> interfaceC37353d, Executor executor, boolean z11, boolean z12) {
        RunnableC5568a runnableC5568a = new RunnableC5568a(z11, interfaceC37353d, z12);
        m8587f();
        executor.execute(runnableC5568a);
    }

    /* JADX INFO: renamed from: k */
    public void m8597k() {
        for (Pair<InterfaceC37353d<T>, Executor> pair : this.f8188g) {
            ((Executor) pair.second).execute(new RunnableC5569b((InterfaceC37353d) pair.first));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m8598l(Map<String, Object> map) {
        this.f8182a = map;
    }

    @Override // p251f4.InterfaceC37351b
    /* JADX INFO: renamed from: b */
    public void mo8589b(InterfaceC37353d<T> interfaceC37353d, Executor executor) {
        boolean z11;
        C45708h.m100896g(interfaceC37353d);
        C45708h.m100896g(executor);
        synchronized (this) {
            try {
                if (this.f8184c) {
                    return;
                }
                if (this.f8183b == DataSourceStatus.IN_PROGRESS) {
                    this.f8188g.add(Pair.create(interfaceC37353d, executor));
                }
                if (!mo8588a() && !isFinished() && !m8606t()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    m8595i(interfaceC37353d, executor, m8593g(), m8606t());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8596j() {
        boolean zM8593g = m8593g();
        boolean zM8606t = m8606t();
        for (Pair<InterfaceC37353d<T>, Executor> pair : this.f8188g) {
            m8595i((InterfaceC37353d) pair.first, (Executor) pair.second, zM8593g, zM8606t);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m8600n(Throwable th2, Map<String, Object> map) {
        boolean zM8601o = m8601o(th2, map);
        if (zM8601o) {
            m8596j();
        }
        return zM8601o;
    }

    /* JADX INFO: renamed from: p */
    public boolean m8602p(float f11) {
        boolean zM8603q = m8603q(f11);
        if (zM8603q) {
            m8597k();
        }
        return zM8603q;
    }

    /* JADX INFO: renamed from: r */
    public boolean m8604r(T t11, boolean z11, Map<String, Object> map) {
        m8598l(map);
        boolean zM8605s = m8605s(t11, z11);
        if (zM8605s) {
            m8596j();
        }
        return zM8605s;
    }

    /* JADX INFO: renamed from: e */
    public void mo8592e(T t11) {
    }
}
