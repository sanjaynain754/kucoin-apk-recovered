package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.t2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6881t2 extends AbstractC6905w {

    /* JADX INFO: renamed from: a */
    public final byte[] f11517a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11517a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return AbstractC6834o0.m12688b(this.f11517a);
    }

    public final String toString() {
        return AbstractC6832n7.m12686a(this.f11517a);
    }

    public C6881t2(byte[] bArr) {
        this.f11517a = bArr;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 26, this.f11517a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof C6881t2) {
            return Arrays.equals(this.f11517a, ((C6881t2) abstractC6905w).f11517a);
        }
        return false;
    }
}
