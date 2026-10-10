package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.o */
/* JADX INFO: loaded from: classes45.dex */
public final class C6833o extends AbstractC6905w {

    /* JADX INFO: renamed from: a */
    public final C6746e2 f11445a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        return this.f11445a.mo12612a(z11);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12722a(z11, 7);
        c6887u.m12723a(false, 25, this.f11445a.f11346a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return ~AbstractC6834o0.m12688b(this.f11445a.f11346a);
    }

    public C6833o(C6746e2 c6746e2) {
        this.f11445a = c6746e2;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof C6833o) {
            return this.f11445a.mo12606a(((C6833o) abstractC6905w).f11445a);
        }
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public final AbstractC6905w mo12600g() {
        return this;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        return this;
    }
}
