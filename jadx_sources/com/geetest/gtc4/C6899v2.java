package com.geetest.gtc4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.v2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6899v2 implements InterfaceC6725c {

    /* JADX INFO: renamed from: a */
    public final C6774h3 f11535a;

    /* JADX INFO: renamed from: b */
    public int f11536b = 0;

    @Override // com.geetest.gtc4.InterfaceC6725c
    /* JADX INFO: renamed from: a */
    public final InputStream mo12605a() throws IOException {
        C6774h3 c6774h3 = this.f11535a;
        int i11 = c6774h3.f11382d;
        if (i11 < 1) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int i12 = c6774h3.read();
        this.f11536b = i12;
        if (i12 > 0) {
            if (i11 < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i12 > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        return this.f11535a;
    }

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() {
        return AbstractC6716b.m12604a(this.f11535a.m12654b());
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        try {
            return AbstractC6716b.m12604a(this.f11535a.m12654b());
        } catch (IOException e11) {
            throw new C6896v("IOException converting stream to byte array: " + e11.getMessage(), e11);
        }
    }

    @Override // com.geetest.gtc4.InterfaceC6725c
    /* JADX INFO: renamed from: e */
    public final int mo12607e() {
        return this.f11536b;
    }

    public C6899v2(C6774h3 c6774h3) {
        this.f11535a = c6774h3;
    }
}
