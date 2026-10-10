package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.u */
/* JADX INFO: loaded from: classes45.dex */
public class C6887u {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f11520a;

    /* JADX INFO: renamed from: a */
    public static int m12720a(int i11) {
        if (i11 < 128) {
            return 1;
        }
        int i12 = 2;
        while (true) {
            i11 >>>= 8;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    /* JADX INFO: renamed from: b */
    public C6926y2 mo12725b() {
        return new C6926y2(this.f11520a);
    }

    /* JADX INFO: renamed from: a */
    public C6800k2 mo12665a() {
        return new C6800k2(this.f11520a);
    }

    /* JADX INFO: renamed from: b */
    public final void m12726b(int i11) throws IOException {
        if (i11 < 128) {
            this.f11520a.write(i11);
            return;
        }
        int i12 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i13 = i12 - 1;
            bArr[i13] = (byte) i11;
            i11 >>>= 8;
            if (i11 == 0) {
                int i14 = i12 - 2;
                bArr[i14] = (byte) ((5 - i13) | 128);
                this.f11520a.write(bArr, i14, 6 - i13);
                return;
            }
            i12 = i13;
        }
    }

    public C6887u(ByteArrayOutputStream byteArrayOutputStream) {
        this.f11520a = byteArrayOutputStream;
    }

    /* JADX INFO: renamed from: a */
    public final void m12721a(int i11, int i12) throws IOException {
        if (i12 < 31) {
            this.f11520a.write(i11 | i12);
            return;
        }
        byte[] bArr = new byte[6];
        int i13 = 5;
        bArr[5] = (byte) (i12 & 127);
        while (i12 > 127) {
            i12 >>>= 7;
            i13--;
            bArr[i13] = (byte) ((i12 & 127) | 128);
        }
        int i14 = i13 - 1;
        bArr[i14] = (byte) (i11 | 31);
        this.f11520a.write(bArr, i14, 6 - i14);
    }

    /* JADX INFO: renamed from: a */
    public final void m12722a(boolean z11, int i11) throws IOException {
        if (z11) {
            this.f11520a.write(i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo12667a(InterfaceC6752f[] interfaceC6752fArr) {
        for (InterfaceC6752f interfaceC6752f : interfaceC6752fArr) {
            interfaceC6752f.mo12598d().mo12613a(this, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12723a(boolean z11, int i11, byte[] bArr) throws IOException {
        m12722a(z11, i11);
        m12726b(bArr.length);
        this.f11520a.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public final void m12724a(boolean z11, int i11, InterfaceC6752f[] interfaceC6752fArr) throws IOException {
        m12722a(z11, i11);
        this.f11520a.write(128);
        mo12667a(interfaceC6752fArr);
        this.f11520a.write(0);
        this.f11520a.write(0);
    }

    /* JADX INFO: renamed from: a */
    public void mo12668a(AbstractC6905w[] abstractC6905wArr) {
        for (AbstractC6905w abstractC6905w : abstractC6905wArr) {
            abstractC6905w.mo12613a(this, true);
        }
    }
}
