package p251f4;

import com.facebook.datasource.AbstractDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p651u3.C45098a;
import p712w3.C45706f;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;

/* JADX INFO: renamed from: f4.g */
/* JADX INFO: compiled from: IncreasingQualityDataSourceSupplier.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37356g<T> implements InterfaceC45711k<InterfaceC37351b<T>> {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC45711k<InterfaceC37351b<T>>> f82875a;

    /* JADX INFO: renamed from: b */
    public final boolean f82876b;

    /* JADX INFO: renamed from: f4.g$a */
    /* JADX INFO: compiled from: IncreasingQualityDataSourceSupplier.java */
    public class a extends AbstractDataSource<T> {

        /* JADX INFO: renamed from: h */
        public ArrayList<InterfaceC37351b<T>> f82877h;

        /* JADX INFO: renamed from: i */
        public int f82878i;

        /* JADX INFO: renamed from: j */
        public int f82879j;

        /* JADX INFO: renamed from: k */
        public AtomicInteger f82880k;

        /* JADX INFO: renamed from: l */
        public Throwable f82881l;

        /* JADX INFO: renamed from: m */
        public Map<String, Object> f82882m;

        /* JADX INFO: renamed from: f4.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IncreasingQualityDataSourceSupplier.java */
        public class C47007a implements InterfaceC37353d<T> {

            /* JADX INFO: renamed from: a */
            public int f82884a;

            public C47007a(int i11) {
                this.f82884a = i11;
            }

            @Override // p251f4.InterfaceC37353d
            public void onFailure(InterfaceC37351b<T> interfaceC37351b) {
                a.this.m83978D(this.f82884a, interfaceC37351b);
            }

            @Override // p251f4.InterfaceC37353d
            public void onProgressUpdate(InterfaceC37351b<T> interfaceC37351b) {
                if (this.f82884a == 0) {
                    a.this.m8602p(interfaceC37351b.getProgress());
                }
            }

            @Override // p251f4.InterfaceC37353d
            public void onNewResult(InterfaceC37351b<T> interfaceC37351b) {
                if (interfaceC37351b.mo8588a()) {
                    a.this.m83979E(this.f82884a, interfaceC37351b);
                } else if (interfaceC37351b.isFinished()) {
                    a.this.m83978D(this.f82884a, interfaceC37351b);
                }
            }

            @Override // p251f4.InterfaceC37353d
            public void onCancellation(InterfaceC37351b<T> interfaceC37351b) {
            }
        }

        /* JADX INFO: renamed from: A */
        private synchronized InterfaceC37351b<T> m83972A() {
            return m83983z(this.f82878i);
        }

        /* JADX INFO: renamed from: C */
        public final void m83977C(int i11, InterfaceC37351b<T> interfaceC37351b, boolean z11) {
            synchronized (this) {
                try {
                    int i12 = this.f82878i;
                    if (interfaceC37351b == m83983z(i11) && i11 != this.f82878i) {
                        if (m83972A() == null || (z11 && i11 < this.f82878i)) {
                            this.f82878i = i11;
                        } else {
                            i11 = i12;
                        }
                        while (i12 > i11) {
                            m83975w(m83982y(i12));
                            i12--;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: F */
        public final synchronized InterfaceC37351b<T> m83980F(int i11, InterfaceC37351b<T> interfaceC37351b) {
            if (interfaceC37351b == m83972A()) {
                return null;
            }
            if (interfaceC37351b != m83983z(i11)) {
                return interfaceC37351b;
            }
            return m83982y(i11);
        }

        @Override // com.facebook.datasource.AbstractDataSource, p251f4.InterfaceC37351b
        /* JADX INFO: renamed from: a */
        public synchronized boolean mo8588a() {
            InterfaceC37351b<T> interfaceC37351bM83972A;
            try {
                if (C37356g.this.f82876b) {
                    m83981x();
                }
                interfaceC37351bM83972A = m83972A();
            } catch (Throwable th2) {
                throw th2;
            }
            return interfaceC37351bM83972A != null && interfaceC37351bM83972A.mo8588a();
        }

        @Override // com.facebook.datasource.AbstractDataSource, p251f4.InterfaceC37351b
        public synchronized T getResult() {
            InterfaceC37351b<T> interfaceC37351bM83972A;
            try {
                if (C37356g.this.f82876b) {
                    m83981x();
                }
                interfaceC37351bM83972A = m83972A();
            } catch (Throwable th2) {
                throw th2;
            }
            return interfaceC37351bM83972A != null ? interfaceC37351bM83972A.getResult() : null;
        }

        /* JADX INFO: renamed from: y */
        public final synchronized InterfaceC37351b<T> m83982y(int i11) {
            InterfaceC37351b<T> interfaceC37351b;
            ArrayList<InterfaceC37351b<T>> arrayList = this.f82877h;
            interfaceC37351b = null;
            if (arrayList != null && i11 < arrayList.size()) {
                interfaceC37351b = this.f82877h.set(i11, null);
            }
            return interfaceC37351b;
        }

        /* JADX INFO: renamed from: z */
        public final synchronized InterfaceC37351b<T> m83983z(int i11) {
            ArrayList<InterfaceC37351b<T>> arrayList;
            arrayList = this.f82877h;
            return (arrayList == null || i11 >= arrayList.size()) ? null : this.f82877h.get(i11);
        }

        public a() {
            if (C37356g.this.f82876b) {
                return;
            }
            m83981x();
        }

        /* JADX INFO: renamed from: w */
        private void m83975w(InterfaceC37351b<T> interfaceC37351b) {
            if (interfaceC37351b != null) {
                interfaceC37351b.close();
            }
        }

        /* JADX INFO: renamed from: B */
        public final void m83976B() {
            Throwable th2;
            if (this.f82880k.incrementAndGet() != this.f82879j || (th2 = this.f82881l) == null) {
                return;
            }
            m8600n(th2, this.f82882m);
        }

        @Override // com.facebook.datasource.AbstractDataSource, p251f4.InterfaceC37351b
        public boolean close() {
            if (C37356g.this.f82876b) {
                m83981x();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList<InterfaceC37351b<T>> arrayList = this.f82877h;
                    this.f82877h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        m83975w(arrayList.get(i11));
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: x */
        public final void m83981x() {
            if (this.f82880k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f82880k == null) {
                        this.f82880k = new AtomicInteger(0);
                        int size = C37356g.this.f82875a.size();
                        this.f82879j = size;
                        this.f82878i = size;
                        this.f82877h = new ArrayList<>(size);
                        for (int i11 = 0; i11 < size; i11++) {
                            InterfaceC37351b<T> interfaceC37351b = (InterfaceC37351b) ((InterfaceC45711k) C37356g.this.f82875a.get(i11)).get();
                            this.f82877h.add(interfaceC37351b);
                            interfaceC37351b.mo8589b(new C47007a(i11), C45098a.m99711a());
                            if (interfaceC37351b.mo8588a()) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m83978D(int i11, InterfaceC37351b<T> interfaceC37351b) {
            m83975w(m83980F(i11, interfaceC37351b));
            if (i11 == 0) {
                this.f82881l = interfaceC37351b.mo8590c();
                this.f82882m = interfaceC37351b.getExtras();
            }
            m83976B();
        }

        /* JADX INFO: renamed from: E */
        public final void m83979E(int i11, InterfaceC37351b<T> interfaceC37351b) {
            boolean z11;
            m83977C(i11, interfaceC37351b, interfaceC37351b.isFinished());
            if (interfaceC37351b == m83972A()) {
                if (i11 == 0 && interfaceC37351b.isFinished()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m8604r(null, z11, interfaceC37351b.getExtras());
            }
            m83976B();
        }
    }

    /* JADX INFO: renamed from: c */
    public static <T> C37356g<T> m83970c(List<InterfaceC45711k<InterfaceC37351b<T>>> list, boolean z11) {
        return new C37356g<>(list, z11);
    }

    @Override // p712w3.InterfaceC45711k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC37351b<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37356g) {
            return C45706f.m100883a(this.f82875a, ((C37356g) obj).f82875a);
        }
        return false;
    }

    public int hashCode() {
        return this.f82875a.hashCode();
    }

    public C37356g(List<InterfaceC45711k<InterfaceC37351b<T>>> list, boolean z11) {
        C45708h.m100892c(!list.isEmpty(), "List of suppliers is empty!");
        this.f82875a = list;
        this.f82876b = z11;
    }

    public String toString() {
        return C45706f.m100884b(this).m100886b("list", this.f82875a).toString();
    }
}
