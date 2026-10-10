package com.geetest.gtc4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.j2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6791j2 implements InterfaceC6878t {

    /* JADX INFO: renamed from: a */
    public final C6774h3 f11406a;

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() {
        return new C6782i2(this.f11406a.m12654b());
    }

    @Override // com.geetest.gtc4.InterfaceC6878t
    /* JADX INFO: renamed from: c */
    public final InputStream mo12631c() {
        return this.f11406a;
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        try {
            return new C6782i2(this.f11406a.m12654b());
        } catch (IOException e11) {
            throw new C6896v("IOException converting stream to byte array: " + e11.getMessage(), e11);
        }
    }

    public C6791j2(C6774h3 c6774h3) {
        this.f11406a = c6774h3;
    }
}
