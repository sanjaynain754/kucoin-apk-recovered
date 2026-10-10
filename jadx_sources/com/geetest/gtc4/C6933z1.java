package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.z1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6933z1 extends AbstractC6716b {
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

    public C6933z1(byte[] bArr) {
        super(bArr);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        byte[] bArr = this.f11312a;
        int i11 = bArr[0] & 255;
        int length = bArr.length;
        int i12 = length - 1;
        byte b11 = bArr[i12];
        byte b12 = (byte) ((255 << i11) & b11);
        if (b11 == b12) {
            c6887u.m12723a(z11, 3, bArr);
            return;
        }
        c6887u.m12722a(z11, 3);
        c6887u.m12726b(length);
        c6887u.f11520a.write(bArr, 0, i12);
        c6887u.f11520a.write(b12);
    }

    @Override // com.geetest.gtc4.AbstractC6716b, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public final AbstractC6905w mo12600g() {
        return this;
    }

    @Override // com.geetest.gtc4.AbstractC6716b, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        return this;
    }
}
