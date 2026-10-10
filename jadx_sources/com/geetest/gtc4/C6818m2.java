package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.m2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6818m2 extends AbstractC6931z {

    /* JADX INFO: renamed from: b */
    public int f11435b;

    public C6818m2(AbstractC6905w abstractC6905w) {
        super(abstractC6905w);
        this.f11435b = -1;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        if (this.f11435b < 0) {
            int length = this.f11562a.length;
            int iMo12612a = 0;
            for (int i11 = 0; i11 < length; i11++) {
                iMo12612a += this.f11562a[i11].mo12598d().mo12600g().mo12612a(true);
            }
            this.f11435b = iMo12612a;
        }
        int i12 = this.f11435b;
        return AbstractC6734d.m12622a(i12, z11 ? 1 : 0, i12);
    }

    @Override // com.geetest.gtc4.AbstractC6931z
    /* JADX INFO: renamed from: l */
    public final AbstractC6716b mo12636l() {
        return new C6933z1(C6718b1.m12611a(m12744i()));
    }

    @Override // com.geetest.gtc4.AbstractC6931z
    /* JADX INFO: renamed from: m */
    public final AbstractC6869s mo12637m() {
        return new C6782i2(C6745e1.m12628a(m12745j()));
    }

    public C6818m2(C6761g c6761g) {
        super(c6761g);
        this.f11435b = -1;
    }

    public C6818m2(InterfaceC6752f[] interfaceC6752fArr) {
        super(interfaceC6752fArr);
        this.f11435b = -1;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12722a(z11, 48);
        C6800k2 c6800k2Mo12665a = c6887u.mo12665a();
        InterfaceC6752f[] interfaceC6752fArr = this.f11562a;
        int length = interfaceC6752fArr.length;
        int i11 = this.f11435b;
        int i12 = 0;
        if (i11 < 0 && length <= 16) {
            AbstractC6905w[] abstractC6905wArr = new AbstractC6905w[length];
            int iMo12612a = 0;
            for (int i13 = 0; i13 < length; i13++) {
                AbstractC6905w abstractC6905wMo12600g = this.f11562a[i13].mo12598d().mo12600g();
                abstractC6905wArr[i13] = abstractC6905wMo12600g;
                iMo12612a += abstractC6905wMo12600g.mo12612a(true);
            }
            this.f11435b = iMo12612a;
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
                iMo12612a2 += this.f11562a[i14].mo12598d().mo12600g().mo12612a(true);
            }
            this.f11435b = iMo12612a2;
        }
        c6887u.m12726b(this.f11435b);
        while (i12 < length) {
            this.f11562a[i12].mo12598d().mo12600g().mo12613a(c6800k2Mo12665a, true);
            i12++;
        }
    }

    @Override // com.geetest.gtc4.AbstractC6931z, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public final AbstractC6905w mo12600g() {
        return this;
    }

    @Override // com.geetest.gtc4.AbstractC6931z, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        return this;
    }
}
