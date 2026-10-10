package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.e */
/* JADX INFO: loaded from: classes45.dex */
public final class C6743e extends AbstractC6905w {

    /* JADX INFO: renamed from: b */
    public static final C6743e f11340b = new C6743e((byte) 0);

    /* JADX INFO: renamed from: c */
    public static final C6743e f11341c = new C6743e((byte) -1);

    /* JADX INFO: renamed from: a */
    public final byte f11342a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        return AbstractC6734d.m12622a(1, z11 ? 1 : 0, 1);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        byte b11 = this.f11342a;
        c6887u.m12722a(z11, 1);
        c6887u.m12726b(1);
        c6887u.f11520a.write(b11);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public final AbstractC6905w mo12600g() {
        return this.f11342a != 0 ? f11341c : f11340b;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return this.f11342a != 0 ? 1 : 0;
    }

    public final String toString() {
        return this.f11342a != 0 ? "TRUE" : "FALSE";
    }

    public C6743e(byte b11) {
        this.f11342a = b11;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (!(abstractC6905w instanceof C6743e)) {
            return false;
        }
        return (this.f11342a != 0) == (((C6743e) abstractC6905w).f11342a != 0);
    }
}
