package p006a4;

import com.facebook.common.references.SharedReference;
import p712w3.C45708h;
import p747x3.C45999a;

/* JADX INFO: renamed from: a4.b */
/* JADX INFO: compiled from: DefaultCloseableReference.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0111b<T> extends AbstractC0110a<T> {
    public C0111b(SharedReference<T> sharedReference, AbstractC0110a.c cVar, Throwable th2) {
        super(sharedReference, cVar, th2);
    }

    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f439b) {
                    super.finalize();
                    return;
                }
                T tM8547f = this.f440c.m8547f();
                C45999a.m101490K("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f440c)), tM8547f == null ? null : tM8547f.getClass().getName());
                AbstractC0110a.c cVar = this.f441d;
                if (cVar != null) {
                    cVar.mo570b(this.f440c, this.f442e);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public C0111b(T t11, InterfaceC0117h<T> interfaceC0117h, AbstractC0110a.c cVar, Throwable th2) {
        super(t11, interfaceC0117h, cVar, th2, true);
    }

    @Override // p006a4.AbstractC0110a
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<T> clone() {
        Throwable th2;
        C45708h.m100898i(mo567n());
        SharedReference<T> sharedReference = this.f440c;
        AbstractC0110a.c cVar = this.f441d;
        if (this.f442e != null) {
            th2 = new Throwable();
        } else {
            th2 = null;
        }
        return new C0111b(sharedReference, cVar, th2);
    }
}
