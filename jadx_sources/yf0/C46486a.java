package yf0;

import bf0.C4587b;
import uf0.InterfaceC45219h;

/* JADX INFO: renamed from: yf0.a */
/* JADX INFO: compiled from: ContextHandleImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C46486a implements InterfaceC45219h {

    /* JADX INFO: renamed from: a */
    public final C4587b f104247a;

    @Override // uf0.InterfaceC45219h
    /* JADX INFO: renamed from: a */
    public void mo99904a(InterfaceC45219h interfaceC45219h) {
        this.f104247a.mo4459k(((C46486a) interfaceC45219h).f104247a);
    }

    @Override // uf0.InterfaceC45219h
    /* JADX INFO: renamed from: b */
    public InterfaceC45219h mo99905b() {
        return new C46486a(this.f104247a.mo4456a());
    }

    /* JADX INFO: renamed from: c */
    public C4587b m102556c() {
        return this.f104247a;
    }

    public C46486a(C4587b c4587b) {
        this.f104247a = c4587b;
    }
}
