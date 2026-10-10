package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.l1 */
/* JADX INFO: loaded from: classes45.dex */
public class C6808l1 implements InterfaceC6752f, InterfaceC6785i5 {

    /* JADX INFO: renamed from: a */
    public final int f11422a;

    /* JADX INFO: renamed from: b */
    public final int f11423b;

    /* JADX INFO: renamed from: c */
    public final C6726c0 f11424c;

    /* JADX INFO: renamed from: b */
    public AbstractC6905w mo12597b() {
        return this.f11424c.m12618a(this.f11422a, this.f11423b);
    }

    public C6808l1(int i11, int i12, C6726c0 c6726c0) {
        this.f11422a = i11;
        this.f11423b = i12;
        this.f11424c = c6726c0;
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        try {
            return mo12597b();
        } catch (IOException e11) {
            throw new C6896v(e11.getMessage());
        }
    }
}
