package bf0;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: bf0.b */
/* JADX INFO: compiled from: Context.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4587b {

    /* JADX INFO: renamed from: g */
    public static final Logger f4067g = Logger.getLogger(C4587b.class.getName());

    /* JADX INFO: renamed from: h */
    public static final C4588c<d<?>, Object> f4068h;

    /* JADX INFO: renamed from: i */
    public static final C4587b f4069i;

    /* JADX INFO: renamed from: b */
    public ArrayList<c> f4070b;

    /* JADX INFO: renamed from: c */
    public b f4071c = new f(this, null);

    /* JADX INFO: renamed from: d */
    public final a f4072d;

    /* JADX INFO: renamed from: e */
    public final C4588c<d<?>, Object> f4073e;

    /* JADX INFO: renamed from: f */
    public final int f4074f;

    /* JADX INFO: renamed from: bf0.b$a */
    /* JADX INFO: compiled from: Context.java */
    public static final class a extends C4587b implements Closeable {

        /* JADX INFO: renamed from: j */
        public final C4587b f4075j;

        /* JADX INFO: renamed from: k */
        public boolean f4076k;

        /* JADX INFO: renamed from: l */
        public Throwable f4077l;

        /* JADX INFO: renamed from: m */
        public ScheduledFuture<?> f4078m;

        @Override // bf0.C4587b
        /* JADX INFO: renamed from: b */
        public boolean mo4457b() {
            return true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m4465w(null);
        }

        @Override // bf0.C4587b
        /* JADX INFO: renamed from: l */
        public boolean mo4460l() {
            synchronized (this) {
                try {
                    if (this.f4076k) {
                        return true;
                    }
                    if (!super.mo4460l()) {
                        return false;
                    }
                    m4465w(super.mo4458h());
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: w */
        public boolean m4465w(Throwable th2) {
            boolean z11;
            synchronized (this) {
                try {
                    z11 = false;
                    if (!this.f4076k) {
                        this.f4076k = true;
                        ScheduledFuture<?> scheduledFuture = this.f4078m;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            this.f4078m = null;
                        }
                        this.f4077l = th2;
                        z11 = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z11) {
                m4462o();
            }
            return z11;
        }

        @Override // bf0.C4587b
        /* JADX INFO: renamed from: a */
        public C4587b mo4456a() {
            return this.f4075j.mo4456a();
        }

        @Override // bf0.C4587b
        /* JADX INFO: renamed from: k */
        public void mo4459k(C4587b c4587b) {
            this.f4075j.mo4459k(c4587b);
        }

        @Override // bf0.C4587b
        /* JADX INFO: renamed from: h */
        public Throwable mo4458h() {
            if (mo4460l()) {
                return this.f4077l;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: bf0.b$b */
    /* JADX INFO: compiled from: Context.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo4466a(C4587b c4587b);
    }

    /* JADX INFO: renamed from: bf0.b$c */
    /* JADX INFO: compiled from: Context.java */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final Executor f4079b;

        /* JADX INFO: renamed from: c */
        public final b f4080c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C4587b f4081d;

        /* JADX INFO: renamed from: a */
        public void m4467a() {
            try {
                this.f4079b.execute(this);
            } catch (Throwable th2) {
                C4587b.f4067g.log(Level.INFO, "Exception notifying context listener", th2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4080c.mo4466a(this.f4081d);
        }
    }

    /* JADX INFO: renamed from: bf0.b$d */
    /* JADX INFO: compiled from: Context.java */
    public static final class d<T> {

        /* JADX INFO: renamed from: a */
        public final String f4082a;

        /* JADX INFO: renamed from: b */
        public final T f4083b;

        public d(String str) {
            this(str, null);
        }

        public d(String str, T t11) {
            this.f4082a = (String) C4587b.m4451i(str, "name");
            this.f4083b = t11;
        }

        public String toString() {
            return this.f4082a;
        }

        /* JADX INFO: renamed from: a */
        public T m4468a(C4587b c4587b) {
            T t11 = (T) c4587b.m4461n(this);
            if (t11 == null) {
                return this.f4083b;
            }
            return t11;
        }
    }

    /* JADX INFO: renamed from: bf0.b$e */
    /* JADX INFO: compiled from: Context.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public static final g f4084a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f4084a = m4469a(atomicReference);
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                C4587b.f4067g.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }

        /* JADX INFO: renamed from: a */
        public static g m4469a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (g) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e11) {
                atomicReference.set(e11);
                return new C4589d();
            } catch (Exception e12) {
                throw new RuntimeException("Storage override failed to initialize", e12);
            }
        }
    }

    /* JADX INFO: renamed from: bf0.b$f */
    /* JADX INFO: compiled from: Context.java */
    public final class f implements b {
        public f() {
        }

        public /* synthetic */ f(C4587b c4587b, RunnableC4586a runnableC4586a) {
            this();
        }

        @Override // bf0.C4587b.b
        /* JADX INFO: renamed from: a */
        public void mo4466a(C4587b c4587b) {
            C4587b c4587b2 = C4587b.this;
            if (c4587b2 instanceof a) {
                ((a) c4587b2).m4465w(c4587b.mo4458h());
            } else {
                c4587b2.m4462o();
            }
        }
    }

    /* JADX INFO: renamed from: bf0.b$g */
    /* JADX INFO: compiled from: Context.java */
    public static abstract class g {
        /* JADX INFO: renamed from: b */
        public abstract C4587b mo4471b();

        /* JADX INFO: renamed from: c */
        public abstract void mo4472c(C4587b c4587b, C4587b c4587b2);

        @Deprecated
        /* JADX INFO: renamed from: a */
        public void m4470a(C4587b c4587b) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        /* JADX INFO: renamed from: d */
        public C4587b mo4473d(C4587b c4587b) {
            C4587b c4587bMo4471b = mo4471b();
            m4470a(c4587b);
            return c4587bMo4471b;
        }
    }

    static {
        C4588c<d<?>, Object> c4588c = new C4588c<>();
        f4068h = c4588c;
        f4069i = new C4587b(null, c4588c);
    }

    /* JADX INFO: renamed from: g */
    public static a m4450g(C4587b c4587b) {
        if (c4587b == null) {
            return null;
        }
        return c4587b instanceof a ? (a) c4587b : c4587b.f4072d;
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m4451i(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: m */
    public static <T> d<T> m4453m(String str) {
        return new d<>(str);
    }

    /* JADX INFO: renamed from: q */
    public static g m4454q() {
        return e.f4084a;
    }

    /* JADX INFO: renamed from: u */
    public static void m4455u(int i11) {
        if (i11 == 1000) {
            f4067g.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo4457b() {
        return this.f4072d != null;
    }

    /* JADX INFO: renamed from: h */
    public Throwable mo4458h() {
        a aVar = this.f4072d;
        if (aVar == null) {
            return null;
        }
        return aVar.mo4458h();
    }

    /* JADX INFO: renamed from: k */
    public void mo4459k(C4587b c4587b) {
        m4451i(c4587b, "toAttach");
        m4454q().mo4472c(this, c4587b);
    }

    /* JADX INFO: renamed from: l */
    public boolean mo4460l() {
        a aVar = this.f4072d;
        if (aVar == null) {
            return false;
        }
        return aVar.mo4460l();
    }

    /* JADX INFO: renamed from: n */
    public Object m4461n(d<?> dVar) {
        return this.f4073e.m4474a(dVar);
    }

    /* JADX INFO: renamed from: v */
    public <V> C4587b m4464v(d<V> dVar, V v11) {
        return new C4587b(this, this.f4073e.m4475b(dVar, v11));
    }

    public C4587b(C4587b c4587b, C4588c<d<?>, Object> c4588c) {
        int i11;
        this.f4072d = m4450g(c4587b);
        this.f4073e = c4588c;
        if (c4587b == null) {
            i11 = 0;
        } else {
            i11 = c4587b.f4074f + 1;
        }
        this.f4074f = i11;
        m4455u(i11);
    }

    /* JADX INFO: renamed from: j */
    public static C4587b m4452j() {
        C4587b c4587bMo4471b = m4454q().mo4471b();
        if (c4587bMo4471b == null) {
            return f4069i;
        }
        return c4587bMo4471b;
    }

    /* JADX INFO: renamed from: a */
    public C4587b mo4456a() {
        C4587b c4587bMo4473d = m4454q().mo4473d(this);
        if (c4587bMo4473d == null) {
            return f4069i;
        }
        return c4587bMo4473d;
    }

    /* JADX INFO: renamed from: o */
    public void m4462o() {
        if (mo4457b()) {
            synchronized (this) {
                try {
                    ArrayList<c> arrayList = this.f4070b;
                    if (arrayList == null) {
                        return;
                    }
                    this.f4070b = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (!(arrayList.get(i11).f4080c instanceof f)) {
                            arrayList.get(i11).m4467a();
                        }
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (arrayList.get(i12).f4080c instanceof f) {
                            arrayList.get(i12).m4467a();
                        }
                    }
                    a aVar = this.f4072d;
                    if (aVar != null) {
                        aVar.m4463p(this.f4071c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m4463p(b bVar) {
        if (!mo4457b()) {
            return;
        }
        synchronized (this) {
            try {
                ArrayList<c> arrayList = this.f4070b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (this.f4070b.get(size).f4080c == bVar) {
                            this.f4070b.remove(size);
                            break;
                        }
                    }
                    if (this.f4070b.isEmpty()) {
                        a aVar = this.f4072d;
                        if (aVar != null) {
                            aVar.m4463p(this.f4071c);
                        }
                        this.f4070b = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
