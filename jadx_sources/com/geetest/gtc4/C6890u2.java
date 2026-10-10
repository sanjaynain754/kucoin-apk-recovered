package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.u2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6890u2 extends AbstractC6716b {
    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11312a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    public C6890u2(byte[] bArr) {
        super(bArr);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 3, this.f11312a);
    }

    @Override // com.geetest.gtc4.AbstractC6716b, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        return this;
    }
}
