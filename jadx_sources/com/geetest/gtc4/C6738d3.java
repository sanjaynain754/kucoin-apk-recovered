package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.d3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6738d3 extends AbstractC6735d0 {
    public C6738d3(boolean z11, int i11, InterfaceC6752f interfaceC6752f) {
        super(z11, i11, interfaceC6752f);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int i11;
        AbstractC6905w abstractC6905wMo12601h = this.f11336d.mo12598d().mo12601h();
        boolean zM12624i = m12624i();
        int iMo12612a = abstractC6905wMo12601h.mo12612a(zM12624i);
        if (zM12624i) {
            iMo12612a += C6887u.m12720a(iMo12612a);
        }
        if (z11) {
            int i12 = this.f11335c;
            if (i12 < 31) {
                i11 = 1;
            } else {
                int i13 = 2;
                while (true) {
                    i12 >>>= 7;
                    if (i12 == 0) {
                        break;
                    }
                    i13++;
                }
                i11 = i13;
            }
        } else {
            i11 = 0;
        }
        return iMo12612a + i11;
    }

    public C6738d3(int i11, int i12, int i13, InterfaceC6752f interfaceC6752f) {
        super(i11, i12, i13, interfaceC6752f);
    }

    @Override // com.geetest.gtc4.AbstractC6735d0
    /* JADX INFO: renamed from: c */
    public final AbstractC6931z mo12623c(AbstractC6905w abstractC6905w) {
        return new C6934z2(abstractC6905w);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        if (!m12624i() && !this.f11336d.mo12598d().mo12601h().mo12610f()) {
            return false;
        }
        return true;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        AbstractC6905w abstractC6905wMo12601h = this.f11336d.mo12598d().mo12601h();
        boolean zM12624i = m12624i();
        if (z11) {
            int i11 = this.f11334b;
            if (zM12624i || abstractC6905wMo12601h.mo12610f()) {
                i11 |= 32;
            }
            c6887u.m12721a(i11, this.f11335c);
        }
        if (zM12624i) {
            c6887u.m12726b(abstractC6905wMo12601h.mo12612a(true));
        }
        abstractC6905wMo12601h.mo12613a(c6887u.mo12725b(), zM12624i);
    }

    @Override // com.geetest.gtc4.AbstractC6735d0, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        return this;
    }
}
