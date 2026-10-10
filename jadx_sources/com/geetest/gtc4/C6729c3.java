package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.c3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6729c3 implements InterfaceC6752f, InterfaceC6785i5 {

    /* JADX INFO: renamed from: a */
    public final C6726c0 f11329a;

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() {
        return AbstractC6917x2.m12743a(this.f11329a.m12617a());
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        try {
            return AbstractC6917x2.m12743a(this.f11329a.m12617a());
        } catch (IOException e11) {
            throw new C6896v(e11.getMessage(), e11);
        }
    }

    public C6729c3(C6726c0 c6726c0) {
        this.f11329a = c6726c0;
    }
}
