package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.i1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6781i1 extends AbstractC6717b0 {
    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int iMo12612a = z11 ? 4 : 3;
        int length = this.f11313a.length;
        for (int i11 = 0; i11 < length; i11++) {
            iMo12612a += this.f11313a[i11].mo12598d().mo12612a(true);
        }
        return iMo12612a;
    }

    public C6781i1(C6761g c6761g) {
        super(c6761g);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12724a(z11, 49, this.f11313a);
    }
}
