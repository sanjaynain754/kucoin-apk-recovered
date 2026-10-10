package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.h1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6772h1 implements InterfaceC6752f, InterfaceC6785i5 {

    /* JADX INFO: renamed from: a */
    public final C6726c0 f11378a;

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() {
        return new C6763g1(this.f11378a.m12617a());
    }

    public C6772h1(C6726c0 c6726c0) {
        this.f11378a = c6726c0;
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        try {
            return mo12597b();
        } catch (IOException e11) {
            throw new IllegalStateException(e11.getMessage());
        }
    }
}
