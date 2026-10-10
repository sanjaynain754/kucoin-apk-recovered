package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.a3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6711a3 implements InterfaceC6752f, InterfaceC6785i5 {

    /* JADX INFO: renamed from: a */
    public final C6726c0 f11305a;

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() {
        C6761g c6761gM12617a = this.f11305a.m12617a();
        C6934z2 c6934z2 = AbstractC6917x2.f11550a;
        return c6761gM12617a.f11365b < 1 ? AbstractC6917x2.f11550a : new C6934z2(c6761gM12617a);
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        try {
            C6761g c6761gM12617a = this.f11305a.m12617a();
            C6934z2 c6934z2 = AbstractC6917x2.f11550a;
            return c6761gM12617a.f11365b < 1 ? AbstractC6917x2.f11550a : new C6934z2(c6761gM12617a);
        } catch (IOException e11) {
            throw new IllegalStateException(e11.getMessage());
        }
    }

    public C6711a3(C6726c0 c6726c0) {
        this.f11305a = c6726c0;
    }
}
