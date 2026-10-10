package fh0;

import ih0.AbstractC38619a;
import ih0.AbstractC38635q;
import ih0.C38636r;
import ih0.C38639u;
import kh0.AbstractC41041a;
import kh0.C41043c;
import kh0.InterfaceC41048h;

/* JADX INFO: renamed from: fh0.p */
/* JADX INFO: compiled from: ListItemParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37495p extends AbstractC41041a {

    /* JADX INFO: renamed from: a */
    public final C38636r f83182a = new C38636r();

    /* JADX INFO: renamed from: b */
    public int f83183b;

    /* JADX INFO: renamed from: c */
    public boolean f83184c;

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: a */
    public boolean mo84310a() {
        return true;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: c */
    public AbstractC38619a mo84311c() {
        return this.f83182a;
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: g */
    public boolean mo84312g(AbstractC38619a abstractC38619a) {
        if (!this.f83184c) {
            return true;
        }
        AbstractC38619a abstractC38619aMo87320f = this.f83182a.mo87320f();
        if (!(abstractC38619aMo87320f instanceof AbstractC38635q)) {
            return true;
        }
        ((AbstractC38635q) abstractC38619aMo87320f).m87353o(false);
        return true;
    }

    public C37495p(int i11) {
        this.f83183b = i11;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: h */
    public C41043c mo84313h(InterfaceC41048h interfaceC41048h) {
        boolean z11;
        if (interfaceC41048h.mo84332a()) {
            if (this.f83182a.m87355c() == null) {
                return C41043c.m90004d();
            }
            AbstractC38619a abstractC38619aMo84311c = interfaceC41048h.mo84335d().mo84311c();
            if (!(abstractC38619aMo84311c instanceof C38639u) && !(abstractC38619aMo84311c instanceof C38636r)) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f83184c = z11;
            return C41043c.m90002b(interfaceC41048h.mo84333b());
        }
        if (interfaceC41048h.mo84334c() >= this.f83183b) {
            return C41043c.m90001a(interfaceC41048h.getColumn() + this.f83183b);
        }
        return C41043c.m90004d();
    }
}
