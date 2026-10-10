package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.g1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6763g1 extends AbstractC6931z {
    public C6763g1() {
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int iMo12612a = z11 ? 4 : 3;
        int length = this.f11562a.length;
        for (int i11 = 0; i11 < length; i11++) {
            iMo12612a += this.f11562a[i11].mo12598d().mo12612a(true);
        }
        return iMo12612a;
    }

    public C6763g1(AbstractC6905w abstractC6905w) {
        super(abstractC6905w);
    }

    @Override // com.geetest.gtc4.AbstractC6931z
    /* JADX INFO: renamed from: l */
    public final AbstractC6716b mo12636l() {
        return new C6718b1(m12744i());
    }

    @Override // com.geetest.gtc4.AbstractC6931z
    /* JADX INFO: renamed from: m */
    public final AbstractC6869s mo12637m() {
        return new C6745e1(m12745j());
    }

    public C6763g1(C6761g c6761g) {
        super(c6761g);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12724a(z11, 48, this.f11562a);
    }
}
