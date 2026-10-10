package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.b3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6720b3 extends AbstractC6717b0 {

    /* JADX INFO: renamed from: c */
    public int f11318c;

    public C6720b3() {
        this.f11318c = -1;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        if (this.f11318c < 0) {
            int length = this.f11313a.length;
            int iMo12612a = 0;
            for (int i11 = 0; i11 < length; i11++) {
                iMo12612a += this.f11313a[i11].mo12598d().mo12601h().mo12612a(true);
            }
            this.f11318c = iMo12612a;
        }
        int i12 = this.f11318c;
        return AbstractC6734d.m12622a(i12, z11 ? 1 : 0, i12);
    }

    public C6720b3(C6761g c6761g) {
        super(c6761g);
        this.f11318c = -1;
    }

    public C6720b3(InterfaceC6752f[] interfaceC6752fArr, InterfaceC6752f[] interfaceC6752fArr2) {
        super(interfaceC6752fArr, interfaceC6752fArr2);
        this.f11318c = -1;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12722a(z11, 49);
        C6926y2 c6926y2Mo12725b = c6887u.mo12725b();
        InterfaceC6752f[] interfaceC6752fArr = this.f11313a;
        int length = interfaceC6752fArr.length;
        int i11 = this.f11318c;
        int i12 = 0;
        if (i11 < 0 && length <= 16) {
            AbstractC6905w[] abstractC6905wArr = new AbstractC6905w[length];
            int iMo12612a = 0;
            for (int i13 = 0; i13 < length; i13++) {
                AbstractC6905w abstractC6905wMo12601h = this.f11313a[i13].mo12598d().mo12601h();
                abstractC6905wArr[i13] = abstractC6905wMo12601h;
                iMo12612a += abstractC6905wMo12601h.mo12612a(true);
            }
            this.f11318c = iMo12612a;
            c6887u.m12726b(iMo12612a);
            while (i12 < length) {
                c6926y2Mo12725b.mo12666a(abstractC6905wArr[i12]);
                i12++;
            }
            return;
        }
        if (i11 < 0) {
            int length2 = interfaceC6752fArr.length;
            int iMo12612a2 = 0;
            for (int i14 = 0; i14 < length2; i14++) {
                iMo12612a2 += this.f11313a[i14].mo12598d().mo12601h().mo12612a(true);
            }
            this.f11318c = iMo12612a2;
        }
        c6887u.m12726b(this.f11318c);
        while (i12 < length) {
            c6926y2Mo12725b.mo12666a(this.f11313a[i12].mo12598d());
            i12++;
        }
    }

    @Override // com.geetest.gtc4.AbstractC6717b0, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        return this;
    }
}
