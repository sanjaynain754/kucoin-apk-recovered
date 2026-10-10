package com.bumptech.glide.load.engine;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p419l2.InterfaceC42033g;
import p523p2.C43358e;
import p523p2.C43363j;
import p546q2.AbstractC43593c;
import p546q2.C43591a;
import p628t1.InterfaceC44610b;
import p680v1.InterfaceC45353d;
import p680v1.InterfaceC45359j;
import p782y1.ExecutorServiceC46362a;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.g */
/* JADX INFO: compiled from: EngineJob.java */
/* JADX INFO: loaded from: classes.dex */
public class C5347g<R> implements DecodeJob.InterfaceC5335b<R>, C43591a.f {

    /* JADX INFO: renamed from: A */
    public static final c f6892A = new c();

    /* JADX INFO: renamed from: b */
    public final e f6893b;

    /* JADX INFO: renamed from: c */
    public final AbstractC43593c f6894c;

    /* JADX INFO: renamed from: d */
    public final C5348h.a f6895d;

    /* JADX INFO: renamed from: e */
    public final Pools.Pool<C5347g<?>> f6896e;

    /* JADX INFO: renamed from: f */
    public final c f6897f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC45353d f6898g;

    /* JADX INFO: renamed from: h */
    public final ExecutorServiceC46362a f6899h;

    /* JADX INFO: renamed from: i */
    public final ExecutorServiceC46362a f6900i;

    /* JADX INFO: renamed from: j */
    public final ExecutorServiceC46362a f6901j;

    /* JADX INFO: renamed from: k */
    public final ExecutorServiceC46362a f6902k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f6903l;

    /* JADX INFO: renamed from: m */
    public InterfaceC44610b f6904m;

    /* JADX INFO: renamed from: n */
    public boolean f6905n;

    /* JADX INFO: renamed from: o */
    public boolean f6906o;

    /* JADX INFO: renamed from: p */
    public boolean f6907p;

    /* JADX INFO: renamed from: q */
    public boolean f6908q;

    /* JADX INFO: renamed from: r */
    public InterfaceC45359j<?> f6909r;

    /* JADX INFO: renamed from: s */
    public DataSource f6910s;

    /* JADX INFO: renamed from: t */
    public boolean f6911t;

    /* JADX INFO: renamed from: u */
    public GlideException f6912u;

    /* JADX INFO: renamed from: v */
    public boolean f6913v;

    /* JADX INFO: renamed from: w */
    public C5348h<?> f6914w;

    /* JADX INFO: renamed from: x */
    public DecodeJob<R> f6915x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f6916y;

    /* JADX INFO: renamed from: z */
    public boolean f6917z;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.g$a */
    /* JADX INFO: compiled from: EngineJob.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final InterfaceC42033g f6918b;

        public a(InterfaceC42033g interfaceC42033g) {
            this.f6918b = interfaceC42033g;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f6918b.mo6941g()) {
                synchronized (C5347g.this) {
                    try {
                        if (C5347g.this.f6893b.m6817b(this.f6918b)) {
                            C5347g.this.m6801f(this.f6918b);
                        }
                        C5347g.this.m6804i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.g$b */
    /* JADX INFO: compiled from: EngineJob.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final InterfaceC42033g f6920b;

        public b(InterfaceC42033g interfaceC42033g) {
            this.f6920b = interfaceC42033g;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f6920b.mo6941g()) {
                synchronized (C5347g.this) {
                    try {
                        if (C5347g.this.f6893b.m6817b(this.f6920b)) {
                            C5347g.this.f6914w.m6820b();
                            C5347g.this.m6802g(this.f6920b);
                            C5347g.this.m6812r(this.f6920b);
                        }
                        C5347g.this.m6804i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.g$c */
    /* JADX INFO: compiled from: EngineJob.java */
    @VisibleForTesting
    public static class c {
        /* JADX INFO: renamed from: a */
        public <R> C5348h<R> m6814a(InterfaceC45359j<R> interfaceC45359j, boolean z11, InterfaceC44610b interfaceC44610b, C5348h.a aVar) {
            return new C5348h<>(interfaceC45359j, z11, true, interfaceC44610b, aVar);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.g$d */
    /* JADX INFO: compiled from: EngineJob.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final InterfaceC42033g f6922a;

        /* JADX INFO: renamed from: b */
        public final Executor f6923b;

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f6922a.equals(((d) obj).f6922a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6922a.hashCode();
        }

        public d(InterfaceC42033g interfaceC42033g, Executor executor) {
            this.f6922a = interfaceC42033g;
            this.f6923b = executor;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.g$e */
    /* JADX INFO: compiled from: EngineJob.java */
    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: b */
        public final List<d> f6924b;

        public e() {
            this(new ArrayList(2));
        }

        public e(List<d> list) {
            this.f6924b = list;
        }

        /* JADX INFO: renamed from: d */
        public static d m6815d(InterfaceC42033g interfaceC42033g) {
            return new d(interfaceC42033g, C43358e.m95487a());
        }

        /* JADX INFO: renamed from: a */
        public void m6816a(InterfaceC42033g interfaceC42033g, Executor executor) {
            this.f6924b.add(new d(interfaceC42033g, executor));
        }

        /* JADX INFO: renamed from: b */
        public boolean m6817b(InterfaceC42033g interfaceC42033g) {
            return this.f6924b.contains(m6815d(interfaceC42033g));
        }

        /* JADX INFO: renamed from: c */
        public e m6818c() {
            return new e(new ArrayList(this.f6924b));
        }

        public void clear() {
            this.f6924b.clear();
        }

        /* JADX INFO: renamed from: e */
        public void m6819e(InterfaceC42033g interfaceC42033g) {
            this.f6924b.remove(m6815d(interfaceC42033g));
        }

        public boolean isEmpty() {
            return this.f6924b.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.f6924b.iterator();
        }

        public int size() {
            return this.f6924b.size();
        }
    }

    public C5347g(ExecutorServiceC46362a executorServiceC46362a, ExecutorServiceC46362a executorServiceC46362a2, ExecutorServiceC46362a executorServiceC46362a3, ExecutorServiceC46362a executorServiceC46362a4, InterfaceC45353d interfaceC45353d, C5348h.a aVar, Pools.Pool<C5347g<?>> pool) {
        this(executorServiceC46362a, executorServiceC46362a2, executorServiceC46362a3, executorServiceC46362a4, interfaceC45353d, aVar, pool, f6892A);
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m6799q() {
        if (this.f6904m == null) {
            throw new IllegalArgumentException();
        }
        this.f6893b.clear();
        this.f6904m = null;
        this.f6914w = null;
        this.f6909r = null;
        this.f6913v = false;
        this.f6916y = false;
        this.f6911t = false;
        this.f6917z = false;
        this.f6915x.m6721v(false);
        this.f6915x = null;
        this.f6912u = null;
        this.f6910s = null;
        this.f6896e.release(this);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m6800a(InterfaceC42033g interfaceC42033g, Executor executor) {
        try {
            this.f6894c.mo95947c();
            this.f6893b.m6816a(interfaceC42033g, executor);
            if (this.f6911t) {
                m6806k(1);
                executor.execute(new b(interfaceC42033g));
            } else if (this.f6913v) {
                m6806k(1);
                executor.execute(new a(interfaceC42033g));
            } else {
                C43363j.m95503a(!this.f6916y, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5335b
    /* JADX INFO: renamed from: b */
    public void mo6726b(GlideException glideException) {
        synchronized (this) {
            this.f6912u = glideException;
        }
        m6809n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5335b
    /* JADX INFO: renamed from: c */
    public void mo6727c(InterfaceC45359j<R> interfaceC45359j, DataSource dataSource, boolean z11) {
        synchronized (this) {
            this.f6909r = interfaceC45359j;
            this.f6910s = dataSource;
            this.f6917z = z11;
        }
        m6810o();
    }

    /* JADX INFO: renamed from: i */
    public void m6804i() {
        C5348h<?> c5348h;
        synchronized (this) {
            try {
                this.f6894c.mo95947c();
                C43363j.m95503a(m6808m(), "Not yet complete!");
                int iDecrementAndGet = this.f6903l.decrementAndGet();
                C43363j.m95503a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c5348h = this.f6914w;
                    m6799q();
                } else {
                    c5348h = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c5348h != null) {
            c5348h.m6823e();
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m6806k(int i11) {
        C5348h<?> c5348h;
        C43363j.m95503a(m6808m(), "Not yet complete!");
        if (this.f6903l.getAndAdd(i11) == 0 && (c5348h = this.f6914w) != null) {
            c5348h.m6820b();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public synchronized C5347g<R> m6807l(InterfaceC44610b interfaceC44610b, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f6904m = interfaceC44610b;
        this.f6905n = z11;
        this.f6906o = z12;
        this.f6907p = z13;
        this.f6908q = z14;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public void m6809n() {
        synchronized (this) {
            try {
                this.f6894c.mo95947c();
                if (this.f6916y) {
                    m6799q();
                    return;
                }
                if (this.f6893b.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f6913v) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f6913v = true;
                InterfaceC44610b interfaceC44610b = this.f6904m;
                e eVarM6818c = this.f6893b.m6818c();
                m6806k(eVarM6818c.size() + 1);
                this.f6898g.mo6783a(this, interfaceC44610b, null);
                for (d dVar : eVarM6818c) {
                    dVar.f6923b.execute(new a(dVar.f6922a));
                }
                m6804i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public void m6810o() {
        synchronized (this) {
            try {
                this.f6894c.mo95947c();
                if (this.f6916y) {
                    this.f6909r.recycle();
                    m6799q();
                    return;
                }
                if (this.f6893b.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f6911t) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f6914w = this.f6897f.m6814a(this.f6909r, this.f6905n, this.f6904m, this.f6895d);
                this.f6911t = true;
                e eVarM6818c = this.f6893b.m6818c();
                m6806k(eVarM6818c.size() + 1);
                this.f6898g.mo6783a(this, this.f6904m, this.f6914w);
                for (d dVar : eVarM6818c) {
                    dVar.f6923b.execute(new b(dVar.f6922a));
                }
                m6804i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m6812r(InterfaceC42033g interfaceC42033g) {
        try {
            this.f6894c.mo95947c();
            this.f6893b.m6819e(interfaceC42033g);
            if (this.f6893b.isEmpty()) {
                m6803h();
                if (this.f6911t || this.f6913v) {
                    if (this.f6903l.get() == 0) {
                        m6799q();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m6813s(DecodeJob<R> decodeJob) {
        try {
            this.f6915x = decodeJob;
            (decodeJob.m6699C() ? this.f6899h : m6805j()).execute(decodeJob);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    public C5347g(ExecutorServiceC46362a executorServiceC46362a, ExecutorServiceC46362a executorServiceC46362a2, ExecutorServiceC46362a executorServiceC46362a3, ExecutorServiceC46362a executorServiceC46362a4, InterfaceC45353d interfaceC45353d, C5348h.a aVar, Pools.Pool<C5347g<?>> pool, c cVar) {
        this.f6893b = new e();
        this.f6894c = AbstractC43593c.m95945a();
        this.f6903l = new AtomicInteger();
        this.f6899h = executorServiceC46362a;
        this.f6900i = executorServiceC46362a2;
        this.f6901j = executorServiceC46362a3;
        this.f6902k = executorServiceC46362a4;
        this.f6898g = interfaceC45353d;
        this.f6895d = aVar;
        this.f6896e = pool;
        this.f6897f = cVar;
    }

    @Override // p546q2.C43591a.f
    @NonNull
    /* JADX INFO: renamed from: e */
    public AbstractC43593c mo6704e() {
        return this.f6894c;
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: f */
    public void m6801f(InterfaceC42033g interfaceC42033g) {
        try {
            interfaceC42033g.mo6936b(this.f6912u);
        } catch (Throwable th2) {
            throw new CallbackException(th2);
        }
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: g */
    public void m6802g(InterfaceC42033g interfaceC42033g) {
        try {
            interfaceC42033g.mo6937c(this.f6914w, this.f6910s, this.f6917z);
        } catch (Throwable th2) {
            throw new CallbackException(th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final ExecutorServiceC46362a m6805j() {
        if (this.f6906o) {
            return this.f6901j;
        }
        return this.f6907p ? this.f6902k : this.f6900i;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6808m() {
        return this.f6913v || this.f6911t || this.f6916y;
    }

    /* JADX INFO: renamed from: p */
    public boolean m6811p() {
        return this.f6908q;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5335b
    /* JADX INFO: renamed from: d */
    public void mo6728d(DecodeJob<?> decodeJob) {
        m6805j().execute(decodeJob);
    }

    /* JADX INFO: renamed from: h */
    public void m6803h() {
        if (m6808m()) {
            return;
        }
        this.f6916y = true;
        this.f6915x.m6700a();
        this.f6898g.mo6784b(this, this.f6904m);
    }
}
