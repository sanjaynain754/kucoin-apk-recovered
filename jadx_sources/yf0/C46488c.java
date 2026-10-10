package yf0;

import bf0.C4587b;
import io.opencensus.trace.Span;
import uf0.InterfaceC45219h;
import uf0.InterfaceC45220i;

/* JADX INFO: renamed from: yf0.c */
/* JADX INFO: compiled from: ContextManagerImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C46488c implements InterfaceC45220i {
    /* JADX INFO: renamed from: d */
    public static C4587b m102561d(InterfaceC45219h interfaceC45219h) {
        return ((C46486a) interfaceC45219h).m102556c();
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC45219h m102562e(C4587b c4587b) {
        return new C46486a(c4587b);
    }

    @Override // uf0.InterfaceC45220i
    /* JADX INFO: renamed from: a */
    public Span mo99906a(InterfaceC45219h interfaceC45219h) {
        return C46489d.m102563a(m102561d(interfaceC45219h));
    }

    @Override // uf0.InterfaceC45220i
    /* JADX INFO: renamed from: b */
    public InterfaceC45219h mo99907b() {
        return m102562e(C4587b.m4452j());
    }

    @Override // uf0.InterfaceC45220i
    /* JADX INFO: renamed from: c */
    public InterfaceC45219h mo99908c(InterfaceC45219h interfaceC45219h, Span span) {
        return m102562e(C46489d.m102564b(m102561d(interfaceC45219h), span));
    }
}
