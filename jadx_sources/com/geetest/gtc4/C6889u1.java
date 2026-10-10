package com.geetest.gtc4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.u1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6889u1 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final C6726c0 f11521a;

    /* JADX INFO: renamed from: b */
    public boolean f11522b = true;

    /* JADX INFO: renamed from: c */
    public InputStream f11523c;

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        InterfaceC6878t interfaceC6878tM12727a;
        int i13 = 0;
        if (this.f11523c == null) {
            if (!this.f11522b || (interfaceC6878tM12727a = m12727a()) == null) {
                return -1;
            }
            this.f11522b = false;
            this.f11523c = interfaceC6878tM12727a.mo12631c();
        }
        while (true) {
            int i14 = this.f11523c.read(bArr, i11 + i13, i12 - i13);
            if (i14 >= 0) {
                i13 += i14;
                if (i13 == i12) {
                    return i13;
                }
            } else {
                InterfaceC6878t interfaceC6878tM12727a2 = m12727a();
                if (interfaceC6878tM12727a2 == null) {
                    this.f11523c = null;
                    if (i13 < 1) {
                        return -1;
                    }
                    return i13;
                }
                this.f11523c = interfaceC6878tM12727a2.mo12631c();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC6878t m12727a() throws IOException {
        C6726c0 c6726c0 = this.f11521a;
        int i11 = c6726c0.f11323a.read();
        InterfaceC6752f interfaceC6752fM12616a = i11 < 0 ? null : c6726c0.m12616a(i11);
        if (interfaceC6752fM12616a == null) {
            return null;
        }
        if (interfaceC6752fM12616a instanceof InterfaceC6878t) {
            return (InterfaceC6878t) interfaceC6752fM12616a;
        }
        throw new IOException("unknown object encountered: " + interfaceC6752fM12616a.getClass());
    }

    public C6889u1(C6726c0 c6726c0) {
        this.f11521a = c6726c0;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InterfaceC6878t interfaceC6878tM12727a;
        if (this.f11523c == null) {
            if (!this.f11522b || (interfaceC6878tM12727a = m12727a()) == null) {
                return -1;
            }
            this.f11522b = false;
            this.f11523c = interfaceC6878tM12727a.mo12631c();
        }
        while (true) {
            int i11 = this.f11523c.read();
            if (i11 >= 0) {
                return i11;
            }
            InterfaceC6878t interfaceC6878tM12727a2 = m12727a();
            if (interfaceC6878tM12727a2 == null) {
                this.f11523c = null;
                return -1;
            }
            this.f11523c = interfaceC6878tM12727a2.mo12631c();
        }
    }
}
