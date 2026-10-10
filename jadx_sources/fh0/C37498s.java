package fh0;

import ih0.AbstractC38619a;
import ih0.C38643y;
import kh0.AbstractC41041a;
import kh0.AbstractC41042b;
import kh0.AbstractC41046f;
import kh0.C41043c;
import kh0.InterfaceC41047g;
import kh0.InterfaceC41048h;

/* JADX INFO: renamed from: fh0.s */
/* JADX INFO: compiled from: ThematicBreakParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37498s extends AbstractC41041a {

    /* JADX INFO: renamed from: a */
    public final C38643y f83190a = new C38643y();

    /* JADX INFO: renamed from: fh0.s$a */
    /* JADX INFO: compiled from: ThematicBreakParser.java */
    public static class a extends AbstractC41042b {
        @Override // kh0.InterfaceC41045e
        /* JADX INFO: renamed from: a */
        public AbstractC41046f mo84315a(InterfaceC41048h interfaceC41048h, InterfaceC41047g interfaceC41047g) {
            if (interfaceC41048h.mo84334c() >= 4) {
                return AbstractC41046f.m90005c();
            }
            int iMo84333b = interfaceC41048h.mo84333b();
            CharSequence line = interfaceC41048h.getLine();
            if (C37498s.m84427j(line, iMo84333b)) {
                return AbstractC41046f.m90006d(new C37498s()).mo84317b(line.length());
            }
            return AbstractC41046f.m90005c();
        }
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: c */
    public AbstractC38619a mo84311c() {
        return this.f83190a;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m84427j(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt != '*') {
                    if (cCharAt != '-') {
                        if (cCharAt != '_') {
                            return false;
                        }
                        i13++;
                    } else {
                        i12++;
                    }
                } else {
                    i14++;
                }
            }
            i11++;
        }
        if (i12 < 3 || i13 != 0 || i14 != 0) {
            if (i13 < 3 || i12 != 0 || i14 != 0) {
                if (i14 < 3 || i12 != 0 || i13 != 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: h */
    public C41043c mo84313h(InterfaceC41048h interfaceC41048h) {
        return C41043c.m90004d();
    }
}
