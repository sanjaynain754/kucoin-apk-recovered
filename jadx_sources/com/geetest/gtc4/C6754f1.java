package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.f1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6754f1 implements InterfaceC6878t {

    /* JADX INFO: renamed from: a */
    public final C6726c0 f11354a;

    @Override // com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() throws IOException {
        C6889u1 c6889u1 = new C6889u1(this.f11354a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i11 = c6889u1.read(bArr, 0, 4096);
            if (i11 < 0) {
                return new C6745e1(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    @Override // com.geetest.gtc4.InterfaceC6878t
    /* JADX INFO: renamed from: c */
    public final InputStream mo12631c() {
        return new C6889u1(this.f11354a);
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        try {
            C6889u1 c6889u1 = new C6889u1(this.f11354a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i11 = c6889u1.read(bArr, 0, 4096);
                if (i11 < 0) {
                    return new C6745e1(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        } catch (IOException e11) {
            throw new C6896v("IOException converting stream to byte array: " + e11.getMessage(), e11);
        }
    }

    public C6754f1(C6726c0 c6726c0) {
        this.f11354a = c6726c0;
    }
}
