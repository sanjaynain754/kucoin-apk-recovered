package fh0;

import hh0.C38212d;
import ih0.AbstractC38619a;
import ih0.C38632n;
import ih0.C38639u;
import java.util.ArrayList;
import java.util.List;
import kh0.AbstractC41041a;
import kh0.AbstractC41042b;
import kh0.AbstractC41046f;
import kh0.C41043c;
import kh0.InterfaceC41047g;
import kh0.InterfaceC41048h;

/* JADX INFO: renamed from: fh0.l */
/* JADX INFO: compiled from: IndentedCodeBlockParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37491l extends AbstractC41041a {

    /* JADX INFO: renamed from: a */
    public final C38632n f83148a = new C38632n();

    /* JADX INFO: renamed from: b */
    public final List<CharSequence> f83149b = new ArrayList();

    /* JADX INFO: renamed from: fh0.l$a */
    /* JADX INFO: compiled from: IndentedCodeBlockParser.java */
    public static class a extends AbstractC41042b {
        @Override // kh0.InterfaceC41045e
        /* JADX INFO: renamed from: a */
        public AbstractC41046f mo84315a(InterfaceC41048h interfaceC41048h, InterfaceC41047g interfaceC41047g) {
            if (interfaceC41048h.mo84334c() >= C38212d.f85913a && !interfaceC41048h.mo84332a() && !(interfaceC41048h.mo84335d().mo84311c() instanceof C38639u)) {
                return AbstractC41046f.m90006d(new C37491l()).mo84316a(interfaceC41048h.getColumn() + C38212d.f85913a);
            }
            return AbstractC41046f.m90005c();
        }
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: c */
    public AbstractC38619a mo84311c() {
        return this.f83148a;
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: d */
    public void mo84328d(CharSequence charSequence) {
        this.f83149b.add(charSequence);
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: f */
    public void mo84358f() {
        int size = this.f83149b.size() - 1;
        while (size >= 0 && C38212d.m86221f(this.f83149b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < size + 1; i11++) {
            sb2.append(this.f83149b.get(i11));
            sb2.append('\n');
        }
        this.f83148a.m87347o(sb2.toString());
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: h */
    public C41043c mo84313h(InterfaceC41048h interfaceC41048h) {
        if (interfaceC41048h.mo84334c() >= C38212d.f85913a) {
            return C41043c.m90001a(interfaceC41048h.getColumn() + C38212d.f85913a);
        }
        if (interfaceC41048h.mo84332a()) {
            return C41043c.m90002b(interfaceC41048h.mo84333b());
        }
        return C41043c.m90004d();
    }
}
