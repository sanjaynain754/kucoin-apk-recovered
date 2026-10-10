package p483o0;

import bolts.ExecutorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: o0.e */
/* JADX INFO: compiled from: Task.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42908e<TResult> {

    /* JADX INFO: renamed from: i */
    public static final ExecutorService f94991i = C42905b.m94087a();

    /* JADX INFO: renamed from: j */
    public static final Executor f94992j = C42905b.m94088b();

    /* JADX INFO: renamed from: k */
    public static final Executor f94993k = C42904a.m94086c();

    /* JADX INFO: renamed from: l */
    public static C42908e<?> f94994l = new C42908e<>((Object) null);

    /* JADX INFO: renamed from: m */
    public static C42908e<Boolean> f94995m = new C42908e<>(Boolean.TRUE);

    /* JADX INFO: renamed from: n */
    public static C42908e<Boolean> f94996n = new C42908e<>(Boolean.FALSE);

    /* JADX INFO: renamed from: o */
    public static C42908e<?> f94997o = new C42908e<>(true);

    /* JADX INFO: renamed from: b */
    public boolean f94999b;

    /* JADX INFO: renamed from: c */
    public boolean f95000c;

    /* JADX INFO: renamed from: d */
    public TResult f95001d;

    /* JADX INFO: renamed from: e */
    public Exception f95002e;

    /* JADX INFO: renamed from: f */
    public boolean f95003f;

    /* JADX INFO: renamed from: g */
    public C42910g f95004g;

    /* JADX INFO: renamed from: a */
    public final Object f94998a = new Object();

    /* JADX INFO: renamed from: h */
    public List<InterfaceC42907d<TResult, Void>> f95005h = new ArrayList();

    /* JADX INFO: renamed from: o0.e$a */
    /* JADX INFO: compiled from: Task.java */
    public class a implements InterfaceC42907d<TResult, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C42909f f95006a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC42907d f95007b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Executor f95008c;

        public a(C42909f c42909f, InterfaceC42907d interfaceC42907d, Executor executor, C42906c c42906c) {
            this.f95006a = c42909f;
            this.f95007b = interfaceC42907d;
            this.f95008c = executor;
        }

        @Override // p483o0.InterfaceC42907d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo9793a(C42908e<TResult> c42908e) {
            C42908e.m94095d(this.f95006a, this.f95007b, c42908e, this.f95008c, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: o0.e$b */
    /* JADX INFO: compiled from: Task.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C42909f f95010b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC42907d f95011c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C42908e f95012d;

        public b(C42906c c42906c, C42909f c42909f, InterfaceC42907d interfaceC42907d, C42908e c42908e) {
            this.f95010b = c42909f;
            this.f95011c = interfaceC42907d;
            this.f95012d = c42908e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f95010b.m94114d(this.f95011c.mo9793a(this.f95012d));
            } catch (CancellationException unused) {
                this.f95010b.m94112b();
            } catch (Exception e11) {
                this.f95010b.m94113c(e11);
            }
        }
    }

    /* JADX INFO: renamed from: o0.e$c */
    /* JADX INFO: compiled from: Task.java */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C42909f f95013b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Callable f95014c;

        public c(C42906c c42906c, C42909f c42909f, Callable callable) {
            this.f95013b = c42909f;
            this.f95014c = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f95013b.m94114d(this.f95014c.call());
            } catch (CancellationException unused) {
                this.f95013b.m94112b();
            } catch (Exception e11) {
                this.f95013b.m94113c(e11);
            }
        }
    }

    /* JADX INFO: renamed from: o0.e$d */
    /* JADX INFO: compiled from: Task.java */
    public interface d {
    }

    public C42908e() {
    }

    /* JADX INFO: renamed from: b */
    public static <TResult> C42908e<TResult> m94093b(Callable<TResult> callable, Executor executor) {
        return m94094c(callable, executor, null);
    }

    /* JADX INFO: renamed from: k */
    public static d m94098k() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static <TResult> C42908e<TResult> m94094c(Callable<TResult> callable, Executor executor, C42906c c42906c) {
        C42909f c42909f = new C42909f();
        try {
            executor.execute(new c(c42906c, c42909f, callable));
        } catch (Exception e11) {
            c42909f.m94113c(new ExecutorException(e11));
        }
        return c42909f.m94111a();
    }

    /* JADX INFO: renamed from: d */
    public static <TContinuationResult, TResult> void m94095d(C42909f<TContinuationResult> c42909f, InterfaceC42907d<TResult, TContinuationResult> interfaceC42907d, C42908e<TResult> c42908e, Executor executor, C42906c c42906c) {
        try {
            executor.execute(new b(c42906c, c42909f, interfaceC42907d, c42908e));
        } catch (Exception e11) {
            c42909f.m94113c(new ExecutorException(e11));
        }
    }

    /* JADX INFO: renamed from: g */
    public static <TResult> C42908e<TResult> m94096g(Exception exc) {
        C42909f c42909f = new C42909f();
        c42909f.m94113c(exc);
        return c42909f.m94111a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static <TResult> C42908e<TResult> m94097h(TResult tresult) {
        if (tresult == 0) {
            return (C42908e<TResult>) f94994l;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (C42908e<TResult>) f94995m : (C42908e<TResult>) f94996n;
        }
        C42909f c42909f = new C42909f();
        c42909f.m94114d(tresult);
        return c42909f.m94111a();
    }

    /* JADX INFO: renamed from: e */
    public <TContinuationResult> C42908e<TContinuationResult> m94099e(InterfaceC42907d<TResult, TContinuationResult> interfaceC42907d) {
        return m94100f(interfaceC42907d, f94992j, null);
    }

    /* JADX INFO: renamed from: f */
    public <TContinuationResult> C42908e<TContinuationResult> m94100f(InterfaceC42907d<TResult, TContinuationResult> interfaceC42907d, Executor executor, C42906c c42906c) throws Throwable {
        InterfaceC42907d<TResult, TContinuationResult> interfaceC42907d2;
        Executor executor2;
        C42906c c42906c2;
        C42909f c42909f = new C42909f();
        synchronized (this.f94998a) {
            try {
                try {
                    boolean zM94104m = m94104m();
                    if (zM94104m) {
                        interfaceC42907d2 = interfaceC42907d;
                        executor2 = executor;
                        c42906c2 = c42906c;
                    } else {
                        interfaceC42907d2 = interfaceC42907d;
                        executor2 = executor;
                        c42906c2 = c42906c;
                        this.f95005h.add(new a(c42909f, interfaceC42907d2, executor2, c42906c2));
                    }
                    if (zM94104m) {
                        m94095d(c42909f, interfaceC42907d2, this, executor2, c42906c2);
                    }
                    return c42909f.m94111a();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public Exception m94101i() {
        Exception exc;
        synchronized (this.f94998a) {
            try {
                if (this.f95002e != null) {
                    this.f95003f = true;
                }
                exc = this.f95002e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return exc;
    }

    /* JADX INFO: renamed from: j */
    public TResult m94102j() {
        TResult tresult;
        synchronized (this.f94998a) {
            tresult = this.f95001d;
        }
        return tresult;
    }

    /* JADX INFO: renamed from: l */
    public boolean m94103l() {
        boolean z11;
        synchronized (this.f94998a) {
            z11 = this.f95000c;
        }
        return z11;
    }

    /* JADX INFO: renamed from: m */
    public boolean m94104m() {
        boolean z11;
        synchronized (this.f94998a) {
            z11 = this.f94999b;
        }
        return z11;
    }

    /* JADX INFO: renamed from: n */
    public boolean m94105n() {
        boolean z11;
        synchronized (this.f94998a) {
            z11 = m94101i() != null;
        }
        return z11;
    }

    /* JADX INFO: renamed from: o */
    public final void m94106o() {
        synchronized (this.f94998a) {
            Iterator<InterfaceC42907d<TResult, Void>> it = this.f95005h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo9793a(this);
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception e12) {
                    throw new RuntimeException(e12);
                }
            }
            this.f95005h = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m94107p() {
        synchronized (this.f94998a) {
            try {
                if (this.f94999b) {
                    return false;
                }
                this.f94999b = true;
                this.f95000c = true;
                this.f94998a.notifyAll();
                m94106o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m94108q(Exception exc) {
        synchronized (this.f94998a) {
            try {
                if (this.f94999b) {
                    return false;
                }
                this.f94999b = true;
                this.f95002e = exc;
                this.f95003f = false;
                this.f94998a.notifyAll();
                m94106o();
                if (!this.f95003f) {
                    m94098k();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m94109r(TResult tresult) {
        synchronized (this.f94998a) {
            try {
                if (this.f94999b) {
                    return false;
                }
                this.f94999b = true;
                this.f95001d = tresult;
                this.f94998a.notifyAll();
                m94106o();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C42908e(TResult tresult) {
        m94109r(tresult);
    }

    public C42908e(boolean z11) {
        if (z11) {
            m94107p();
        } else {
            m94109r(null);
        }
    }
}
