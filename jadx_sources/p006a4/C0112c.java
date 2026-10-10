package p006a4;

import p747x3.C45999a;

/* JADX INFO: renamed from: a4.c */
/* JADX INFO: compiled from: FinalizerCloseableReference.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0112c<T> extends AbstractC0110a<T> {
    public C0112c(T t11, InterfaceC0117h<T> interfaceC0117h, AbstractC0110a.c cVar, Throwable th2) {
        super(t11, interfaceC0117h, cVar, th2, true);
    }

    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f439b) {
                    super.finalize();
                    return;
                }
                T tM8547f = this.f440c.m8547f();
                C45999a.m101490K("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f440c)), tM8547f == null ? null : tM8547f.getClass().getName());
                this.f440c.m8545d();
                super.finalize();
            }
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // p006a4.AbstractC0110a
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<T> clone() {
        return this;
    }

    @Override // p006a4.AbstractC0110a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
