package fh0;

import hh0.C38209a;
import hh0.C38212d;
import ih0.AbstractC38619a;
import ih0.C38626h;
import kh0.AbstractC41041a;
import kh0.AbstractC41042b;
import kh0.AbstractC41046f;
import kh0.C41043c;
import kh0.InterfaceC41047g;
import kh0.InterfaceC41048h;

/* JADX INFO: renamed from: fh0.i */
/* JADX INFO: compiled from: FencedCodeBlockParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37488i extends AbstractC41041a {

    /* JADX INFO: renamed from: a */
    public final C38626h f83138a;

    /* JADX INFO: renamed from: b */
    public String f83139b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f83140c;

    /* JADX INFO: renamed from: fh0.i$a */
    /* JADX INFO: compiled from: FencedCodeBlockParser.java */
    public static class a extends AbstractC41042b {
        @Override // kh0.InterfaceC41045e
        /* JADX INFO: renamed from: a */
        public AbstractC41046f mo84315a(InterfaceC41048h interfaceC41048h, InterfaceC41047g interfaceC41047g) {
            int iMo84334c = interfaceC41048h.mo84334c();
            if (iMo84334c >= C38212d.f85913a) {
                return AbstractC41046f.m90005c();
            }
            int iMo84333b = interfaceC41048h.mo84333b();
            C37488i c37488iM84357k = C37488i.m84357k(interfaceC41048h.getLine(), iMo84333b, iMo84334c);
            if (c37488iM84357k != null) {
                return AbstractC41046f.m90006d(c37488iM84357k).mo84317b(iMo84333b + c37488iM84357k.f83138a.m87330p());
            }
            return AbstractC41046f.m90005c();
        }
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: c */
    public AbstractC38619a mo84311c() {
        return this.f83138a;
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: d */
    public void mo84328d(CharSequence charSequence) {
        if (this.f83139b == null) {
            this.f83139b = charSequence.toString();
        } else {
            this.f83140c.append(charSequence);
            this.f83140c.append('\n');
        }
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: f */
    public void mo84358f() {
        this.f83138a.m87336v(C38209a.m86207e(this.f83139b.trim()));
        this.f83138a.m87337w(this.f83140c.toString());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m84359l(CharSequence charSequence, int i11) {
        char cM87328n = this.f83138a.m87328n();
        int iM87330p = this.f83138a.m87330p();
        int iM86226k = C38212d.m86226k(cM87328n, charSequence, i11, charSequence.length()) - i11;
        return iM86226k >= iM87330p && C38212d.m86228m(charSequence, i11 + iM86226k, charSequence.length()) == charSequence.length();
    }

    public C37488i(char c11, int i11, int i12) {
        C38626h c38626h = new C38626h();
        this.f83138a = c38626h;
        this.f83140c = new StringBuilder();
        c38626h.m87333s(c11);
        c38626h.m87335u(i11);
        c38626h.m87334t(i12);
    }

    /* JADX INFO: renamed from: k */
    public static C37488i m84357k(CharSequence charSequence, int i11, int i12) {
        int length = charSequence.length();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = i11; i15 < length; i15++) {
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt != '`') {
                if (cCharAt != '~') {
                    break;
                }
                i14++;
            } else {
                i13++;
            }
        }
        if (i13 >= 3 && i14 == 0) {
            if (C38212d.m86217b('`', charSequence, i11 + i13) != -1) {
                return null;
            }
            return new C37488i('`', i13, i12);
        }
        if (i14 < 3 || i13 != 0) {
            return null;
        }
        return new C37488i('~', i14, i12);
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: h */
    public C41043c mo84313h(InterfaceC41048h interfaceC41048h) {
        int iMo84333b = interfaceC41048h.mo84333b();
        int index = interfaceC41048h.getIndex();
        CharSequence line = interfaceC41048h.getLine();
        if (interfaceC41048h.mo84334c() < C38212d.f85913a && m84359l(line, iMo84333b)) {
            return C41043c.m90003c();
        }
        int length = line.length();
        for (int iM87329o = this.f83138a.m87329o(); iM87329o > 0 && index < length && line.charAt(index) == ' '; iM87329o--) {
            index++;
        }
        return C41043c.m90002b(index);
    }
}
