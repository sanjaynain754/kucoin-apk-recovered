package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.C5310d;
import com.bumptech.glide.C5311e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5346f;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p219e2.C37045a;
import p419l2.AbstractC42027a;
import p419l2.InterfaceC42029c;
import p419l2.InterfaceC42031e;
import p419l2.InterfaceC42033g;
import p445m2.InterfaceC42398i;
import p445m2.InterfaceC42399j;
import p460n2.InterfaceC42705c;
import p523p2.C43359f;
import p523p2.C43364k;
import p546q2.AbstractC43593c;
import p628t1.C44613e;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44616h;
import p680v1.AbstractC45352c;
import p680v1.InterfaceC45359j;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest<R> implements InterfaceC42029c, InterfaceC42398i, InterfaceC42033g {

    /* JADX INFO: renamed from: D */
    public static final boolean f7025D = Log.isLoggable("Request", 2);

    /* JADX INFO: renamed from: A */
    @GuardedBy("requestLock")
    public int f7026A;

    /* JADX INFO: renamed from: B */
    @GuardedBy("requestLock")
    public boolean f7027B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public RuntimeException f7028C;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f7029a;

    /* JADX INFO: renamed from: b */
    public final AbstractC43593c f7030b;

    /* JADX INFO: renamed from: c */
    public final Object f7031c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final InterfaceC42031e<R> f7032d;

    /* JADX INFO: renamed from: e */
    public final RequestCoordinator f7033e;

    /* JADX INFO: renamed from: f */
    public final Context f7034f;

    /* JADX INFO: renamed from: g */
    public final C5311e f7035g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final Object f7036h;

    /* JADX INFO: renamed from: i */
    public final Class<R> f7037i;

    /* JADX INFO: renamed from: j */
    public final AbstractC42027a<?> f7038j;

    /* JADX INFO: renamed from: k */
    public final int f7039k;

    /* JADX INFO: renamed from: l */
    public final int f7040l;

    /* JADX INFO: renamed from: m */
    public final Priority f7041m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC42399j<R> f7042n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final List<InterfaceC42031e<R>> f7043o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC42705c<? super R> f7044p;

    /* JADX INFO: renamed from: q */
    public final Executor f7045q;

    /* JADX INFO: renamed from: r */
    @GuardedBy("requestLock")
    public InterfaceC45359j<R> f7046r;

    /* JADX INFO: renamed from: s */
    @GuardedBy("requestLock")
    public C5346f.d f7047s;

    /* JADX INFO: renamed from: t */
    @GuardedBy("requestLock")
    public long f7048t;

    /* JADX INFO: renamed from: u */
    public volatile C5346f f7049u;

    /* JADX INFO: renamed from: v */
    @GuardedBy("requestLock")
    public Status f7050v;

    /* JADX INFO: renamed from: w */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f7051w;

    /* JADX INFO: renamed from: x */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f7052x;

    /* JADX INFO: renamed from: y */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f7053y;

    /* JADX INFO: renamed from: z */
    @GuardedBy("requestLock")
    public int f7054z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    @Override // p419l2.InterfaceC42033g
    /* JADX INFO: renamed from: b */
    public void mo6936b(GlideException glideException) {
        m6956x(glideException, 5);
    }

    /* JADX INFO: renamed from: t */
    public static int m6934t(int i11, float f11) {
        return i11 == Integer.MIN_VALUE ? i11 : Math.round(f11 * i11);
    }

    /* JADX INFO: renamed from: w */
    public static <R> SingleRequest<R> m6935w(Context context, C5311e c5311e, Object obj, Object obj2, Class<R> cls, AbstractC42027a<?> abstractC42027a, int i11, int i12, Priority priority, InterfaceC42399j<R> interfaceC42399j, InterfaceC42031e<R> interfaceC42031e, @Nullable List<InterfaceC42031e<R>> list, RequestCoordinator requestCoordinator, C5346f c5346f, InterfaceC42705c<? super R> interfaceC42705c, Executor executor) {
        return new SingleRequest<>(context, c5311e, obj, obj2, cls, abstractC42027a, i11, i12, priority, interfaceC42399j, interfaceC42031e, list, requestCoordinator, c5346f, interfaceC42705c, executor);
    }

    @Override // p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: a */
    public boolean mo6928a() {
        boolean z11;
        synchronized (this.f7031c) {
            z11 = this.f7050v == Status.COMPLETE;
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p419l2.InterfaceC42033g
    /* JADX INFO: renamed from: c */
    public void mo6937c(InterfaceC45359j<?> interfaceC45359j, DataSource dataSource, boolean z11) {
        this.f7030b.mo95947c();
        InterfaceC45359j<?> interfaceC45359j2 = null;
        try {
            synchronized (this.f7031c) {
                try {
                    this.f7047s = null;
                    if (interfaceC45359j == null) {
                        mo6936b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f7037i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC45359j.get();
                    try {
                        if (obj == null || !this.f7037i.isAssignableFrom(obj.getClass())) {
                            this.f7046r = null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.f7037i);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(interfaceC45359j);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            mo6936b(new GlideException(sb2.toString()));
                        } else if (m6946l()) {
                            m6957y(interfaceC45359j, obj, dataSource, z11);
                            return;
                        } else {
                            this.f7046r = null;
                            this.f7050v = Status.COMPLETE;
                        }
                        this.f7049u.m6792k(interfaceC45359j);
                    } catch (Throwable th2) {
                        interfaceC45359j2 = interfaceC45359j;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (interfaceC45359j2 != null) {
                this.f7049u.m6792k(interfaceC45359j2);
            }
            throw th4;
        }
    }

    @Override // p419l2.InterfaceC42029c
    public void clear() {
        synchronized (this.f7031c) {
            try {
                m6942h();
                this.f7030b.mo95947c();
                Status status = this.f7050v;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m6947m();
                InterfaceC45359j<R> interfaceC45359j = this.f7046r;
                if (interfaceC45359j != null) {
                    this.f7046r = null;
                } else {
                    interfaceC45359j = null;
                }
                if (m6944j()) {
                    this.f7042n.mo59882c(m6950p());
                }
                this.f7050v = status2;
                if (interfaceC45359j != null) {
                    this.f7049u.m6792k(interfaceC45359j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: d */
    public boolean mo6938d(InterfaceC42029c interfaceC42029c) {
        int i11;
        int i12;
        Object obj;
        Class<R> cls;
        AbstractC42027a<?> abstractC42027a;
        Priority priority;
        int size;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        AbstractC42027a<?> abstractC42027a2;
        Priority priority2;
        int size2;
        if (!(interfaceC42029c instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f7031c) {
            try {
                i11 = this.f7039k;
                i12 = this.f7040l;
                obj = this.f7036h;
                cls = this.f7037i;
                abstractC42027a = this.f7038j;
                priority = this.f7041m;
                List<InterfaceC42031e<R>> list = this.f7043o;
                size = list != null ? list.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        SingleRequest singleRequest = (SingleRequest) interfaceC42029c;
        synchronized (singleRequest.f7031c) {
            try {
                i13 = singleRequest.f7039k;
                i14 = singleRequest.f7040l;
                obj2 = singleRequest.f7036h;
                cls2 = singleRequest.f7037i;
                abstractC42027a2 = singleRequest.f7038j;
                priority2 = singleRequest.f7041m;
                List<InterfaceC42031e<R>> list2 = singleRequest.f7043o;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i11 == i13 && i12 == i14 && C43364k.m95510c(obj, obj2) && cls.equals(cls2) && abstractC42027a.equals(abstractC42027a2) && priority == priority2 && size == size2;
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
    @Override // p445m2.InterfaceC42398i
    /* JADX INFO: renamed from: e */
    public void mo6939e(int i11, int i12) throws Throwable {
        Object obj;
        SingleRequest<R> singleRequest = this;
        singleRequest.f7030b.mo95947c();
        Object obj2 = singleRequest.f7031c;
        synchronized (obj2) {
            try {
                try {
                    boolean z11 = f7025D;
                    if (z11) {
                        singleRequest.m6953s("Got onSizeReady in " + C43359f.m95489a(singleRequest.f7048t));
                    }
                    if (singleRequest.f7050v == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        singleRequest.f7050v = status;
                        float fM92165E = singleRequest.f7038j.m92165E();
                        singleRequest.f7054z = m6934t(i11, fM92165E);
                        singleRequest.f7026A = m6934t(i12, fM92165E);
                        if (z11) {
                            singleRequest.m6953s("finished setup for calling load in " + C43359f.m95489a(singleRequest.f7048t));
                        }
                        try {
                            C5346f c5346f = singleRequest.f7049u;
                            C5311e c5311e = singleRequest.f7035g;
                            try {
                                Object obj3 = singleRequest.f7036h;
                                InterfaceC44610b interfaceC44610bM92164D = singleRequest.f7038j.m92164D();
                                try {
                                    int i13 = singleRequest.f7054z;
                                    int i14 = singleRequest.f7026A;
                                    Class<?> clsM92163C = singleRequest.f7038j.m92163C();
                                    Class<R> cls = singleRequest.f7037i;
                                    try {
                                        Priority priority = singleRequest.f7041m;
                                        AbstractC45352c abstractC45352cM92216q = singleRequest.f7038j.m92216q();
                                        Map<Class<?>, InterfaceC44616h<?>> mapM92167G = singleRequest.f7038j.m92167G();
                                        boolean zM92176Q = singleRequest.f7038j.m92176Q();
                                        boolean zM92173M = singleRequest.f7038j.m92173M();
                                        C44613e c44613eM92224w = singleRequest.f7038j.m92224w();
                                        boolean zM92171K = singleRequest.f7038j.m92171K();
                                        boolean zM92169I = singleRequest.f7038j.m92169I();
                                        boolean zM92168H = singleRequest.f7038j.m92168H();
                                        boolean zM92223v = singleRequest.f7038j.m92223v();
                                        Executor executor = singleRequest.f7045q;
                                        Object obj4 = obj2;
                                        try {
                                            singleRequest.f7047s = c5346f.m6788f(c5311e, obj3, interfaceC44610bM92164D, i13, i14, clsM92163C, cls, priority, abstractC45352cM92216q, mapM92167G, zM92176Q, zM92173M, c44613eM92224w, zM92171K, zM92169I, zM92168H, zM92223v, singleRequest, executor);
                                            if (singleRequest.f7050v != status) {
                                                singleRequest.f7047s = null;
                                            }
                                            if (z11) {
                                                singleRequest.m6953s("finished onSizeReady in " + C43359f.m95489a(singleRequest.f7048t));
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj = obj2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj = obj2;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    obj = obj2;
                }
            } catch (Throwable th8) {
                th = th8;
                obj = singleRequest;
            }
        }
    }

    @Override // p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: f */
    public boolean mo6940f() {
        boolean z11;
        synchronized (this.f7031c) {
            z11 = this.f7050v == Status.CLEARED;
        }
        return z11;
    }

    @Override // p419l2.InterfaceC42033g
    /* JADX INFO: renamed from: g */
    public Object mo6941g() {
        this.f7030b.mo95947c();
        return this.f7031c;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: h */
    public final void m6942h() {
        if (this.f7027B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // p419l2.InterfaceC42029c
    /* JADX INFO: renamed from: i */
    public void mo6943i() {
        synchronized (this.f7031c) {
            try {
                m6942h();
                this.f7030b.mo95947c();
                this.f7048t = C43359f.m95490b();
                if (this.f7036h == null) {
                    if (C43364k.m95528u(this.f7039k, this.f7040l)) {
                        this.f7054z = this.f7039k;
                        this.f7026A = this.f7040l;
                    }
                    m6956x(new GlideException("Received null model"), m6949o() == null ? 5 : 3);
                    return;
                }
                Status status = this.f7050v;
                Status status2 = Status.RUNNING;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    mo6937c(this.f7046r, DataSource.MEMORY_CACHE, false);
                    return;
                }
                Status status3 = Status.WAITING_FOR_SIZE;
                this.f7050v = status3;
                if (C43364k.m95528u(this.f7039k, this.f7040l)) {
                    mo6939e(this.f7039k, this.f7040l);
                } else {
                    this.f7042n.mo92228a(this);
                }
                Status status4 = this.f7050v;
                if ((status4 == status2 || status4 == status3) && m6945k()) {
                    this.f7042n.mo92231h(m6950p());
                }
                if (f7025D) {
                    m6953s("finished run method in " + C43359f.m95489a(this.f7048t));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p419l2.InterfaceC42029c
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f7031c) {
            z11 = this.f7050v == Status.COMPLETE;
        }
        return z11;
    }

    @Override // p419l2.InterfaceC42029c
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f7031c) {
            try {
                Status status = this.f7050v;
                z11 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: j */
    public final boolean m6944j() {
        RequestCoordinator requestCoordinator = this.f7033e;
        return requestCoordinator == null || requestCoordinator.mo6933h(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: k */
    public final boolean m6945k() {
        RequestCoordinator requestCoordinator = this.f7033e;
        return requestCoordinator == null || requestCoordinator.mo6930c(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: l */
    public final boolean m6946l() {
        RequestCoordinator requestCoordinator = this.f7033e;
        return requestCoordinator == null || requestCoordinator.mo6931e(this);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: n */
    public final Drawable m6948n() {
        if (this.f7051w == null) {
            Drawable drawableM92220s = this.f7038j.m92220s();
            this.f7051w = drawableM92220s;
            if (drawableM92220s == null && this.f7038j.m92218r() > 0) {
                this.f7051w = m6952r(this.f7038j.m92218r());
            }
        }
        return this.f7051w;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: o */
    public final Drawable m6949o() {
        if (this.f7053y == null) {
            Drawable drawableM92221t = this.f7038j.m92221t();
            this.f7053y = drawableM92221t;
            if (drawableM92221t == null && this.f7038j.m92222u() > 0) {
                this.f7053y = m6952r(this.f7038j.m92222u());
            }
        }
        return this.f7053y;
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: p */
    public final Drawable m6950p() {
        if (this.f7052x == null) {
            Drawable drawableM92227z = this.f7038j.m92227z();
            this.f7052x = drawableM92227z;
            if (drawableM92227z == null && this.f7038j.m92161A() > 0) {
                this.f7052x = m6952r(this.f7038j.m92161A());
            }
        }
        return this.f7052x;
    }

    @Override // p419l2.InterfaceC42029c
    public void pause() {
        synchronized (this.f7031c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: q */
    public final boolean m6951q() {
        RequestCoordinator requestCoordinator = this.f7033e;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo6928a();
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: r */
    public final Drawable m6952r(@DrawableRes int i11) {
        return C37045a.m82890a(this.f7035g, i11, this.f7038j.m92166F() != null ? this.f7038j.m92166F() : this.f7034f.getTheme());
    }

    /* JADX INFO: renamed from: s */
    public final void m6953s(String str) {
        Log.v("Request", str + " this: " + this.f7029a);
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: u */
    public final void m6954u() {
        RequestCoordinator requestCoordinator = this.f7033e;
        if (requestCoordinator != null) {
            requestCoordinator.mo6932g(this);
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: v */
    public final void m6955v() {
        RequestCoordinator requestCoordinator = this.f7033e;
        if (requestCoordinator != null) {
            requestCoordinator.mo6929b(this);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m6956x(GlideException glideException, int i11) {
        boolean zMo20018d;
        this.f7030b.mo95947c();
        synchronized (this.f7031c) {
            try {
                glideException.setOrigin(this.f7028C);
                int iM6585h = this.f7035g.m6585h();
                if (iM6585h <= i11) {
                    Log.w("Glide", "Load failed for " + this.f7036h + " with size [" + this.f7054z + "x" + this.f7026A + "]", glideException);
                    if (iM6585h <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f7047s = null;
                this.f7050v = Status.FAILED;
                boolean z11 = true;
                this.f7027B = true;
                try {
                    List<InterfaceC42031e<R>> list = this.f7043o;
                    if (list != null) {
                        Iterator<InterfaceC42031e<R>> it = list.iterator();
                        zMo20018d = false;
                        while (it.hasNext()) {
                            zMo20018d |= it.next().mo20018d(glideException, this.f7036h, this.f7042n, m6951q());
                        }
                    } else {
                        zMo20018d = false;
                    }
                    InterfaceC42031e<R> interfaceC42031e = this.f7032d;
                    if (interfaceC42031e == null || !interfaceC42031e.mo20018d(glideException, this.f7036h, this.f7042n, m6951q())) {
                        z11 = false;
                    }
                    if (!(zMo20018d | z11)) {
                        m6958z();
                    }
                    this.f7027B = false;
                    m6954u();
                } catch (Throwable th2) {
                    this.f7027B = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public SingleRequest(Context context, C5311e c5311e, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, AbstractC42027a<?> abstractC42027a, int i11, int i12, Priority priority, InterfaceC42399j<R> interfaceC42399j, @Nullable InterfaceC42031e<R> interfaceC42031e, @Nullable List<InterfaceC42031e<R>> list, RequestCoordinator requestCoordinator, C5346f c5346f, InterfaceC42705c<? super R> interfaceC42705c, Executor executor) {
        String strValueOf;
        if (f7025D) {
            strValueOf = String.valueOf(super.hashCode());
        } else {
            strValueOf = null;
        }
        this.f7029a = strValueOf;
        this.f7030b = AbstractC43593c.m95945a();
        this.f7031c = obj;
        this.f7034f = context;
        this.f7035g = c5311e;
        this.f7036h = obj2;
        this.f7037i = cls;
        this.f7038j = abstractC42027a;
        this.f7039k = i11;
        this.f7040l = i12;
        this.f7041m = priority;
        this.f7042n = interfaceC42399j;
        this.f7032d = interfaceC42031e;
        this.f7043o = list;
        this.f7033e = requestCoordinator;
        this.f7049u = c5346f;
        this.f7044p = interfaceC42705c;
        this.f7045q = executor;
        this.f7050v = Status.PENDING;
        if (this.f7028C == null && c5311e.m6584g().m6587a(C5310d.d.class)) {
            this.f7028C = new RuntimeException("Glide request origin trace");
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: m */
    public final void m6947m() {
        m6942h();
        this.f7030b.mo95947c();
        this.f7042n.mo92229f(this);
        C5346f.d dVar = this.f7047s;
        if (dVar != null) {
            dVar.m6798a();
            this.f7047s = null;
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: y */
    public final void m6957y(InterfaceC45359j<R> interfaceC45359j, R r11, DataSource dataSource, boolean z11) {
        boolean zMo20017b;
        boolean zM6951q = m6951q();
        this.f7050v = Status.COMPLETE;
        this.f7046r = interfaceC45359j;
        if (this.f7035g.m6585h() <= 3) {
            Log.d("Glide", "Finished loading " + r11.getClass().getSimpleName() + " from " + dataSource + " for " + this.f7036h + " with size [" + this.f7054z + "x" + this.f7026A + "] in " + C43359f.m95489a(this.f7048t) + " ms");
        }
        boolean z12 = true;
        this.f7027B = true;
        try {
            List<InterfaceC42031e<R>> list = this.f7043o;
            if (list != null) {
                Iterator<InterfaceC42031e<R>> it = list.iterator();
                zMo20017b = false;
                while (it.hasNext()) {
                    R r12 = r11;
                    DataSource dataSource2 = dataSource;
                    zMo20017b |= it.next().mo20017b(r12, this.f7036h, this.f7042n, dataSource2, zM6951q);
                    r11 = r12;
                    dataSource = dataSource2;
                }
            } else {
                zMo20017b = false;
            }
            R r13 = r11;
            DataSource dataSource3 = dataSource;
            InterfaceC42031e<R> interfaceC42031e = this.f7032d;
            if (interfaceC42031e == null || !interfaceC42031e.mo20017b(r13, this.f7036h, this.f7042n, dataSource3, zM6951q)) {
                z12 = false;
            }
            if (!(z12 | zMo20017b)) {
                this.f7042n.mo6639e(r13, this.f7044p.mo93597a(dataSource3, zM6951q));
            }
            this.f7027B = false;
            m6955v();
        } catch (Throwable th2) {
            this.f7027B = false;
            throw th2;
        }
    }

    @GuardedBy("requestLock")
    /* JADX INFO: renamed from: z */
    public final void m6958z() {
        Drawable drawableM6950p;
        if (!m6945k()) {
            return;
        }
        if (this.f7036h == null) {
            drawableM6950p = m6949o();
        } else {
            drawableM6950p = null;
        }
        if (drawableM6950p == null) {
            drawableM6950p = m6948n();
        }
        if (drawableM6950p == null) {
            drawableM6950p = m6950p();
        }
        this.f7042n.mo6640i(drawableM6950p);
    }
}
