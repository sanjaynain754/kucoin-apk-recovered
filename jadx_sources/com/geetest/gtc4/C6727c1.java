package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.c1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6727c1 implements InterfaceC6725c {

    /* JADX INFO: renamed from: a */
    public final C6726c0 f11326a;

    /* JADX INFO: renamed from: b */
    public C6880t1 f11327b;

    @Override // com.geetest.gtc4.InterfaceC6725c
    /* JADX INFO: renamed from: a */
    public final InputStream mo12605a() {
        C6880t1 c6880t1 = new C6880t1(this.f11326a);
        this.f11327b = c6880t1;
        return c6880t1;
    }

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() throws IOException {
        C6880t1 c6880t1 = new C6880t1(this.f11326a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i11 = c6880t1.read(bArr, 0, 4096);
            if (i11 < 0) {
                return new C6718b1(byteArrayOutputStream.toByteArray(), c6880t1.f11514c);
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        try {
            C6880t1 c6880t1 = new C6880t1(this.f11326a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i11 = c6880t1.read(bArr, 0, 4096);
                if (i11 < 0) {
                    return new C6718b1(byteArrayOutputStream.toByteArray(), c6880t1.f11514c);
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        } catch (IOException e11) {
            throw new C6896v("IOException converting stream to byte array: " + e11.getMessage(), e11);
        }
    }

    @Override // com.geetest.gtc4.InterfaceC6725c
    /* JADX INFO: renamed from: e */
    public final int mo12607e() {
        return this.f11327b.f11514c;
    }

    public C6727c1(C6726c0 c6726c0) {
        this.f11326a = c6726c0;
    }
}
