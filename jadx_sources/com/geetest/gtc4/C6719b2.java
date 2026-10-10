package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.b2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6719b2 implements InterfaceC6752f, InterfaceC6785i5 {

    /* JADX INFO: renamed from: a */
    public final C6726c0 f11317a;

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() throws C6779i {
        try {
            return new C6908w2(new C6934z2(this.f11317a.m12617a()));
        } catch (IllegalArgumentException e11) {
            throw new C6779i(e11.getMessage(), e11);
        }
    }

    public C6719b2(C6726c0 c6726c0) {
        this.f11317a = c6726c0;
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        try {
            return mo12597b();
        } catch (IOException e11) {
            throw new C6896v("unable to get DER object", e11);
        } catch (IllegalArgumentException e12) {
            throw new C6896v("unable to get DER object", e12);
        }
    }
}
