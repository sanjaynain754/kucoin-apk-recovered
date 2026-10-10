package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.n2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6827n2 extends AbstractC6717b0 {

    /* JADX INFO: renamed from: c */
    public int f11442c;

    public C6827n2(InterfaceC6752f[] interfaceC6752fArr) {
        super(true, interfaceC6752fArr);
        this.f11442c = -1;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        if (this.f11442c < 0) {
            int length = this.f11313a.length;
            int iMo12612a = 0;
            for (int i11 = 0; i11 < length; i11++) {
                iMo12612a += this.f11313a[i11].mo12598d().mo12600g().mo12612a(true);
            }
            this.f11442c = iMo12612a;
        }
        int i12 = this.f11442c;
        return AbstractC6734d.m12622a(i12, z11 ? 1 : 0, i12);
    }

    @Override // com.geetest.gtc4.AbstractC6717b0, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public final AbstractC6905w mo12600g() {
        return this.f11314b != null ? this : super.mo12600g();
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12722a(z11, 49);
        C6800k2 c6800k2Mo12665a = c6887u.mo12665a();
        InterfaceC6752f[] interfaceC6752fArr = this.f11313a;
        int length = interfaceC6752fArr.length;
        int i11 = this.f11442c;
        int i12 = 0;
        if (i11 < 0 && length <= 16) {
            AbstractC6905w[] abstractC6905wArr = new AbstractC6905w[length];
            int iMo12612a = 0;
            for (int i13 = 0; i13 < length; i13++) {
                AbstractC6905w abstractC6905wMo12600g = this.f11313a[i13].mo12598d().mo12600g();
                abstractC6905wArr[i13] = abstractC6905wMo12600g;
                iMo12612a += abstractC6905wMo12600g.mo12612a(true);
            }
            this.f11442c = iMo12612a;
            c6887u.m12726b(iMo12612a);
            while (i12 < length) {
                abstractC6905wArr[i12].mo12613a(c6800k2Mo12665a, true);
                i12++;
            }
            return;
        }
        if (i11 < 0) {
            int length2 = interfaceC6752fArr.length;
            int iMo12612a2 = 0;
            for (int i14 = 0; i14 < length2; i14++) {
                iMo12612a2 += this.f11313a[i14].mo12598d().mo12600g().mo12612a(true);
            }
            this.f11442c = iMo12612a2;
        }
        c6887u.m12726b(this.f11442c);
        while (i12 < length) {
            this.f11313a[i12].mo12598d().mo12600g().mo12613a(c6800k2Mo12665a, true);
            i12++;
        }
    }

    @Override // com.geetest.gtc4.AbstractC6717b0, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        return this;
    }
}
