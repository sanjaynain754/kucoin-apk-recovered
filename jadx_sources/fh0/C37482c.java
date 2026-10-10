package fh0;

import hh0.C38212d;
import ih0.AbstractC38619a;
import ih0.C38620b;
import kh0.AbstractC41041a;
import kh0.AbstractC41042b;
import kh0.AbstractC41046f;
import kh0.C41043c;
import kh0.InterfaceC41047g;
import kh0.InterfaceC41048h;

/* JADX INFO: renamed from: fh0.c */
/* JADX INFO: compiled from: BlockQuoteParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37482c extends AbstractC41041a {

    /* JADX INFO: renamed from: a */
    public final C38620b f83099a = new C38620b();

    /* JADX INFO: renamed from: fh0.c$a */
    /* JADX INFO: compiled from: BlockQuoteParser.java */
    public static class a extends AbstractC41042b {
        @Override // kh0.InterfaceC41045e
        /* JADX INFO: renamed from: a */
        public AbstractC41046f mo84315a(InterfaceC41048h interfaceC41048h, InterfaceC41047g interfaceC41047g) {
            int iMo84333b = interfaceC41048h.mo84333b();
            if (!C37482c.m84309k(interfaceC41048h, iMo84333b)) {
                return AbstractC41046f.m90005c();
            }
            int column = interfaceC41048h.getColumn() + interfaceC41048h.mo84334c();
            int i11 = column + 1;
            if (C38212d.m86224i(interfaceC41048h.getLine(), iMo84333b + 1)) {
                i11 = column + 2;
            }
            return AbstractC41046f.m90006d(new C37482c()).mo84316a(i11);
        }
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: a */
    public boolean mo84310a() {
        return true;
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: g */
    public boolean mo84312g(AbstractC38619a abstractC38619a) {
        return true;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C38620b mo84311c() {
        return this.f83099a;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m84309k(InterfaceC41048h interfaceC41048h, int i11) {
        CharSequence line = interfaceC41048h.getLine();
        if (interfaceC41048h.mo84334c() < C38212d.f85913a && i11 < line.length() && line.charAt(i11) == '>') {
            return true;
        }
        return false;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: h */
    public C41043c mo84313h(InterfaceC41048h interfaceC41048h) {
        int iMo84333b = interfaceC41048h.mo84333b();
        if (m84309k(interfaceC41048h, iMo84333b)) {
            int column = interfaceC41048h.getColumn() + interfaceC41048h.mo84334c();
            int i11 = column + 1;
            if (C38212d.m86224i(interfaceC41048h.getLine(), iMo84333b + 1)) {
                i11 = column + 2;
            }
            return C41043c.m90001a(i11);
        }
        return C41043c.m90004d();
    }
}
