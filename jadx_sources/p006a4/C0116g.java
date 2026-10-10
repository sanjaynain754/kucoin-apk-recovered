package p006a4;

import com.facebook.common.references.SharedReference;
import p712w3.C45708h;

/* JADX INFO: renamed from: a4.g */
/* JADX INFO: compiled from: RefCountCloseableReference.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0116g<T> extends AbstractC0110a<T> {
    public C0116g(SharedReference<T> sharedReference, AbstractC0110a.c cVar, Throwable th2) {
        super(sharedReference, cVar, th2);
    }

    public C0116g(T t11, InterfaceC0117h<T> interfaceC0117h, AbstractC0110a.c cVar, Throwable th2) {
        super(t11, interfaceC0117h, cVar, th2, false);
    }

    @Override // p006a4.AbstractC0110a
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<T> clone() {
        C45708h.m100898i(mo567n());
        return new C0116g(this.f440c, this.f441d, this.f442e);
    }
}
