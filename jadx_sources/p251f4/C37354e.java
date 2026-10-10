package p251f4;

import com.facebook.datasource.AbstractDataSource;
import java.util.List;
import p651u3.C45098a;
import p712w3.C45706f;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;

/* JADX INFO: renamed from: f4.e */
/* JADX INFO: compiled from: FirstAvailableDataSourceSupplier.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37354e<T> implements InterfaceC45711k<InterfaceC37351b<T>> {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC45711k<InterfaceC37351b<T>>> f82869a;

    /* JADX INFO: renamed from: f4.e$a */
    /* JADX INFO: compiled from: FirstAvailableDataSourceSupplier.java */
    public class a extends AbstractDataSource<T> {

        /* JADX INFO: renamed from: h */
        public int f82870h = 0;

        /* JADX INFO: renamed from: i */
        public InterfaceC37351b<T> f82871i = null;

        /* JADX INFO: renamed from: j */
        public InterfaceC37351b<T> f82872j = null;

        /* JADX INFO: renamed from: f4.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FirstAvailableDataSourceSupplier.java */
        public class C47006a implements InterfaceC37353d<T> {
            public C47006a() {
            }

            @Override // p251f4.InterfaceC37353d
            public void onFailure(InterfaceC37351b<T> interfaceC37351b) {
                a.this.m83960B(interfaceC37351b);
            }

            @Override // p251f4.InterfaceC37353d
            public void onProgressUpdate(InterfaceC37351b<T> interfaceC37351b) {
                a.this.m8602p(Math.max(a.this.getProgress(), interfaceC37351b.getProgress()));
            }

            @Override // p251f4.InterfaceC37353d
            public void onNewResult(InterfaceC37351b<T> interfaceC37351b) {
                if (interfaceC37351b.mo8588a()) {
                    a.this.m83961C(interfaceC37351b);
                } else if (interfaceC37351b.isFinished()) {
                    a.this.m83960B(interfaceC37351b);
                }
            }

            @Override // p251f4.InterfaceC37353d
            public void onCancellation(InterfaceC37351b<T> interfaceC37351b) {
            }
        }

        /* JADX INFO: renamed from: A */
        public final void m83959A(InterfaceC37351b<T> interfaceC37351b, boolean z11) {
            InterfaceC37351b<T> interfaceC37351b2;
            synchronized (this) {
                if (interfaceC37351b == this.f82871i && interfaceC37351b != (interfaceC37351b2 = this.f82872j)) {
                    if (interfaceC37351b2 == null || z11) {
                        this.f82872j = interfaceC37351b;
                    } else {
                        interfaceC37351b2 = null;
                    }
                    m83965x(interfaceC37351b2);
                }
            }
        }

        /* JADX INFO: renamed from: D */
        public final synchronized boolean m83962D(InterfaceC37351b<T> interfaceC37351b) {
            if (m8594h()) {
                return false;
            }
            this.f82871i = interfaceC37351b;
            return true;
        }

        @Override // com.facebook.datasource.AbstractDataSource, p251f4.InterfaceC37351b
        /* JADX INFO: renamed from: a */
        public synchronized boolean mo8588a() {
            InterfaceC37351b<T> interfaceC37351bM83966y;
            interfaceC37351bM83966y = m83966y();
            return interfaceC37351bM83966y != null && interfaceC37351bM83966y.mo8588a();
        }

        @Override // com.facebook.datasource.AbstractDataSource, p251f4.InterfaceC37351b
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    InterfaceC37351b<T> interfaceC37351b = this.f82871i;
                    this.f82871i = null;
                    InterfaceC37351b<T> interfaceC37351b2 = this.f82872j;
                    this.f82872j = null;
                    m83965x(interfaceC37351b2);
                    m83965x(interfaceC37351b);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, p251f4.InterfaceC37351b
        public synchronized T getResult() {
            InterfaceC37351b<T> interfaceC37351bM83966y;
            interfaceC37351bM83966y = m83966y();
            return interfaceC37351bM83966y != null ? interfaceC37351bM83966y.getResult() : null;
        }

        /* JADX INFO: renamed from: w */
        public final synchronized boolean m83964w(InterfaceC37351b<T> interfaceC37351b) {
            if (!m8594h() && interfaceC37351b == this.f82871i) {
                this.f82871i = null;
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: y */
        public final synchronized InterfaceC37351b<T> m83966y() {
            return this.f82872j;
        }

        /* JADX INFO: renamed from: z */
        public final synchronized InterfaceC45711k<InterfaceC37351b<T>> m83967z() {
            if (m8594h() || this.f82870h >= C37354e.this.f82869a.size()) {
                return null;
            }
            List list = C37354e.this.f82869a;
            int i11 = this.f82870h;
            this.f82870h = i11 + 1;
            return (InterfaceC45711k) list.get(i11);
        }

        public a() {
            if (m83963E()) {
                return;
            }
            mo8599m(new RuntimeException("No data source supplier or supplier returned null."));
        }

        /* JADX INFO: renamed from: x */
        public final void m83965x(InterfaceC37351b<T> interfaceC37351b) {
            if (interfaceC37351b != null) {
                interfaceC37351b.close();
            }
        }

        /* JADX INFO: renamed from: B */
        public final void m83960B(InterfaceC37351b<T> interfaceC37351b) {
            if (m83964w(interfaceC37351b)) {
                if (interfaceC37351b != m83966y()) {
                    m83965x(interfaceC37351b);
                }
                if (!m83963E()) {
                    m8600n(interfaceC37351b.mo8590c(), interfaceC37351b.getExtras());
                }
            }
        }

        /* JADX INFO: renamed from: C */
        public final void m83961C(InterfaceC37351b<T> interfaceC37351b) {
            m83959A(interfaceC37351b, interfaceC37351b.isFinished());
            if (interfaceC37351b == m83966y()) {
                m8604r(null, interfaceC37351b.isFinished(), interfaceC37351b.getExtras());
            }
        }

        /* JADX INFO: renamed from: E */
        public final boolean m83963E() {
            InterfaceC37351b<T> interfaceC37351b;
            InterfaceC45711k<InterfaceC37351b<T>> interfaceC45711kM83967z = m83967z();
            if (interfaceC45711kM83967z != null) {
                interfaceC37351b = interfaceC45711kM83967z.get();
            } else {
                interfaceC37351b = null;
            }
            if (m83962D(interfaceC37351b) && interfaceC37351b != null) {
                interfaceC37351b.mo8589b(new C47006a(), C45098a.m99711a());
                return true;
            }
            m83965x(interfaceC37351b);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> C37354e<T> m83955b(List<InterfaceC45711k<InterfaceC37351b<T>>> list) {
        return new C37354e<>(list);
    }

    @Override // p712w3.InterfaceC45711k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC37351b<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37354e) {
            return C45706f.m100883a(this.f82869a, ((C37354e) obj).f82869a);
        }
        return false;
    }

    public int hashCode() {
        return this.f82869a.hashCode();
    }

    public C37354e(List<InterfaceC45711k<InterfaceC37351b<T>>> list) {
        C45708h.m100892c(!list.isEmpty(), "List of suppliers is empty!");
        this.f82869a = list;
    }

    public String toString() {
        return C45706f.m100884b(this).m100886b("list", this.f82869a).toString();
    }
}
