package com.tencent.liteav.videoconsumer.p138a;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.C34912b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.a.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34910a {

    /* JADX INFO: renamed from: a */
    private boolean f74448a = false;

    /* JADX INFO: renamed from: a */
    public static byte[] m76569a(byte[] bArr) {
        byte b11;
        byte[] bArr2 = new byte[(bArr.length * 3) / 2];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            if (i11 < bArr.length - 2 && (b11 = bArr[i11]) == 0) {
                int i13 = i11 + 1;
                if (bArr[i13] == 0) {
                    int i14 = i11 + 2;
                    if (bArr[i14] <= 3) {
                        bArr2[i12] = b11;
                        int i15 = i12 + 2;
                        bArr2[i12 + 1] = bArr[i13];
                        i12 += 3;
                        bArr2[i15] = 3;
                        i11 = i14;
                    }
                }
            }
            bArr2[i12] = bArr[i11];
            i11++;
            i12++;
        }
        if (i12 == bArr.length) {
            return bArr;
        }
        byte[] bArr3 = new byte[i12];
        System.arraycopy(bArr2, 0, bArr3, 0, i12);
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m76570a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C34912b c34912b = new C34912b(inputStream, byteArrayOutputStream);
        c34912b.m76582b(8);
        int iM76578a = (int) c34912b.m76578a();
        c34912b.m76582b(8);
        c34912b.m76578a();
        c34912b.m76586d();
        if (iM76578a == 100 || iM76578a == 110 || iM76578a == 122 || iM76578a == 144) {
            if (c34912b.m76584c() == 3) {
                c34912b.m76582b(1);
            }
            c34912b.m76586d();
            c34912b.m76586d();
            c34912b.m76582b(1);
            if (c34912b.m76580a(true)) {
                for (int i11 = 0; i11 < 8; i11++) {
                    if (c34912b.m76580a(true)) {
                        if (i11 < 6) {
                            c34912b.m76585c(16);
                        } else {
                            c34912b.m76585c(64);
                        }
                    }
                }
            }
        }
        c34912b.m76586d();
        int iM76584c = c34912b.m76584c();
        if (iM76584c == 0) {
            c34912b.m76586d();
        } else if (iM76584c == 1) {
            c34912b.m76582b(1);
            c34912b.m76586d();
            c34912b.m76586d();
            int iM76584c2 = c34912b.m76584c();
            for (int i12 = 0; i12 < iM76584c2; i12++) {
                c34912b.m76586d();
            }
        }
        c34912b.m76584c();
        c34912b.m76582b(1);
        c34912b.m76586d();
        c34912b.m76586d();
        if (!c34912b.m76580a(true)) {
            c34912b.m76582b(1);
        }
        c34912b.m76582b(1);
        if (c34912b.m76580a(true)) {
            c34912b.m76586d();
            c34912b.m76586d();
            c34912b.m76586d();
            c34912b.m76586d();
        }
        if (c34912b.m76580a(false)) {
            c34912b.m76583b(true);
            if (c34912b.m76580a(true) && ((int) c34912b.m76578a()) == 255) {
                c34912b.m76582b(16);
                c34912b.m76582b(16);
            }
            if (c34912b.m76580a(true)) {
                c34912b.m76582b(1);
            }
            if (c34912b.m76580a(true)) {
                c34912b.m76582b(3);
                c34912b.m76582b(1);
                if (c34912b.m76580a(true)) {
                    c34912b.m76582b(8);
                    c34912b.m76582b(8);
                    c34912b.m76582b(8);
                }
            }
            if (c34912b.m76580a(true)) {
                c34912b.m76586d();
                c34912b.m76586d();
            }
            if (c34912b.m76580a(true)) {
                c34912b.m76582b(32);
                c34912b.m76582b(32);
                c34912b.m76582b(1);
            }
            boolean zM76580a = c34912b.m76580a(true);
            if (zM76580a) {
                m76568a(c34912b);
            }
            boolean zM76580a2 = c34912b.m76580a(true);
            if (zM76580a2) {
                m76568a(c34912b);
            }
            if (zM76580a || zM76580a2) {
                c34912b.m76582b(1);
            }
            c34912b.m76582b(1);
            if (c34912b.m76580a(false)) {
                c34912b.m76583b(true);
                c34912b.m76580a(true);
                c34912b.m76586d();
                c34912b.m76586d();
                c34912b.m76586d();
                c34912b.m76586d();
                c34912b.m76586d();
                if (this.f74448a) {
                    return null;
                }
                LiteavLog.m76093w("H264SPSModifier", "decode: do not add max_dec_frame_buffering when it is ".concat(String.valueOf(c34912b.m76581b())));
                this.f74448a = true;
                return null;
            }
            c34912b.m76583b(true);
            c34912b.m76583b(true);
            c34912b.m76587d(0);
            c34912b.m76587d(0);
            c34912b.m76587d(10);
            c34912b.m76587d(10);
            c34912b.m76587d(0);
            c34912b.m76587d(1);
            if (!this.f74448a) {
                LiteavLog.m76093w("H264SPSModifier", "decode: add max_dec_frame_buffering 1 when it is no exist");
                this.f74448a = true;
            }
        } else {
            c34912b.m76583b(true);
            c34912b.m76583b(false);
            c34912b.m76583b(false);
            c34912b.m76583b(false);
            c34912b.m76583b(false);
            c34912b.m76583b(false);
            c34912b.m76583b(false);
            c34912b.m76583b(false);
            c34912b.m76583b(false);
            c34912b.m76583b(true);
            c34912b.m76583b(true);
            c34912b.m76587d(0);
            c34912b.m76587d(0);
            c34912b.m76587d(10);
            c34912b.m76587d(10);
            c34912b.m76587d(0);
            c34912b.m76587d(1);
            if (!this.f74448a) {
                LiteavLog.m76093w("H264SPSModifier", "decode: add max_dec_frame_buffering 1 when vui is no exist");
                this.f74448a = true;
            }
        }
        c34912b.m76588e();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: a */
    private static void m76568a(C34912b c34912b) throws IOException {
        int iM76584c = c34912b.m76584c();
        c34912b.m76579a(4);
        c34912b.m76579a(4);
        for (int i11 = 0; i11 <= iM76584c; i11++) {
            c34912b.m76586d();
            c34912b.m76586d();
            c34912b.m76579a(1);
        }
        c34912b.m76579a(5);
        c34912b.m76579a(5);
        c34912b.m76579a(5);
        c34912b.m76579a(5);
    }
}
