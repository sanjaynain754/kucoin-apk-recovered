package fh0;

import hh0.C38212d;
import ih0.AbstractC38619a;
import ih0.C38628j;
import jh0.InterfaceC40405a;
import kh0.AbstractC41041a;
import kh0.AbstractC41042b;
import kh0.AbstractC41046f;
import kh0.C41043c;
import kh0.InterfaceC41047g;
import kh0.InterfaceC41048h;

/* JADX INFO: renamed from: fh0.j */
/* JADX INFO: compiled from: HeadingParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37489j extends AbstractC41041a {

    /* JADX INFO: renamed from: a */
    public final C38628j f83141a;

    /* JADX INFO: renamed from: b */
    public final String f83142b;

    /* JADX INFO: renamed from: fh0.j$a */
    /* JADX INFO: compiled from: HeadingParser.java */
    public static class a extends AbstractC41042b {
        @Override // kh0.InterfaceC41045e
        /* JADX INFO: renamed from: a */
        public AbstractC41046f mo84315a(InterfaceC41048h interfaceC41048h, InterfaceC41047g interfaceC41047g) {
            CharSequence charSequenceMo84354b;
            if (interfaceC41048h.mo84334c() >= C38212d.f85913a) {
                return AbstractC41046f.m90005c();
            }
            CharSequence line = interfaceC41048h.getLine();
            int iMo84333b = interfaceC41048h.mo84333b();
            C37489j c37489jM84362k = C37489j.m84362k(line, iMo84333b);
            if (c37489jM84362k != null) {
                return AbstractC41046f.m90006d(c37489jM84362k).mo84317b(line.length());
            }
            int iM84363l = C37489j.m84363l(line, iMo84333b);
            return (iM84363l <= 0 || (charSequenceMo84354b = interfaceC41047g.mo84354b()) == null) ? AbstractC41046f.m90005c() : AbstractC41046f.m90006d(new C37489j(iM84363l, charSequenceMo84354b.toString())).mo84317b(line.length()).mo84318e();
        }
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: c */
    public AbstractC38619a mo84311c() {
        return this.f83141a;
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: e */
    public void mo84365e(InterfaceC40405a interfaceC40405a) {
        interfaceC40405a.mo84387a(this.f83142b, this.f83141a);
    }

    public C37489j(int i11, String str) {
        C38628j c38628j = new C38628j();
        this.f83141a = c38628j;
        c38628j.m87339o(i11);
        this.f83142b = str;
    }

    /* JADX INFO: renamed from: k */
    public static C37489j m84362k(CharSequence charSequence, int i11) {
        int iM86226k = C38212d.m86226k('#', charSequence, i11, charSequence.length()) - i11;
        if (iM86226k == 0 || iM86226k > 6) {
            return null;
        }
        int i12 = i11 + iM86226k;
        if (i12 >= charSequence.length()) {
            return new C37489j(iM86226k, "");
        }
        char cCharAt = charSequence.charAt(i12);
        if (cCharAt != ' ' && cCharAt != '\t') {
            return null;
        }
        int iM86229n = C38212d.m86229n(charSequence, charSequence.length() - 1, i12);
        int iM86227l = C38212d.m86227l('#', charSequence, iM86229n, i12);
        int iM86229n2 = C38212d.m86229n(charSequence, iM86227l, i12);
        if (iM86229n2 != iM86227l) {
            return new C37489j(iM86226k, charSequence.subSequence(i12, iM86229n2 + 1).toString());
        }
        return new C37489j(iM86226k, charSequence.subSequence(i12, iM86229n + 1).toString());
    }

    /* JADX INFO: renamed from: l */
    public static int m84363l(CharSequence charSequence, int i11) {
        char cCharAt = charSequence.charAt(i11);
        if (cCharAt != '-') {
            if (cCharAt == '=') {
                if (m84364m(charSequence, i11 + 1, '=')) {
                    return 1;
                }
            } else {
                return 0;
            }
        }
        if (m84364m(charSequence, i11 + 1, '-')) {
            return 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m84364m(CharSequence charSequence, int i11, char c11) {
        if (C38212d.m86228m(charSequence, C38212d.m86226k(c11, charSequence, i11, charSequence.length()), charSequence.length()) >= charSequence.length()) {
            return true;
        }
        return false;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: h */
    public C41043c mo84313h(InterfaceC41048h interfaceC41048h) {
        return C41043c.m90004d();
    }
}
