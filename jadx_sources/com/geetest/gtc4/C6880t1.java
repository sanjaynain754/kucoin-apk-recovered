package com.geetest.gtc4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.t1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6880t1 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final C6726c0 f11512a;

    /* JADX INFO: renamed from: b */
    public boolean f11513b = true;

    /* JADX INFO: renamed from: c */
    public int f11514c = 0;

    /* JADX INFO: renamed from: d */
    public InterfaceC6725c f11515d;

    /* JADX INFO: renamed from: e */
    public InputStream f11516e;

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        if (this.f11516e == null) {
            if (!this.f11513b) {
                return -1;
            }
            InterfaceC6725c interfaceC6725cM12715a = m12715a();
            this.f11515d = interfaceC6725cM12715a;
            if (interfaceC6725cM12715a == null) {
                return -1;
            }
            this.f11513b = false;
            this.f11516e = interfaceC6725cM12715a.mo12605a();
        }
        while (true) {
            int i14 = this.f11516e.read(bArr, i11 + i13, i12 - i13);
            if (i14 >= 0) {
                i13 += i14;
                if (i13 == i12) {
                    return i13;
                }
            } else {
                this.f11514c = this.f11515d.mo12607e();
                InterfaceC6725c interfaceC6725cM12715a2 = m12715a();
                this.f11515d = interfaceC6725cM12715a2;
                if (interfaceC6725cM12715a2 == null) {
                    this.f11516e = null;
                    if (i13 < 1) {
                        return -1;
                    }
                    return i13;
                }
                this.f11516e = interfaceC6725cM12715a2.mo12605a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC6725c m12715a() throws IOException {
        C6726c0 c6726c0 = this.f11512a;
        int i11 = c6726c0.f11323a.read();
        InterfaceC6752f interfaceC6752fM12616a = i11 < 0 ? null : c6726c0.m12616a(i11);
        if (interfaceC6752fM12616a == null) {
            return null;
        }
        if (interfaceC6752fM12616a instanceof InterfaceC6725c) {
            if (this.f11514c == 0) {
                return (InterfaceC6725c) interfaceC6752fM12616a;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + interfaceC6752fM12616a.getClass());
    }

    public C6880t1(C6726c0 c6726c0) {
        this.f11512a = c6726c0;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f11516e == null) {
            if (!this.f11513b) {
                return -1;
            }
            InterfaceC6725c interfaceC6725cM12715a = m12715a();
            this.f11515d = interfaceC6725cM12715a;
            if (interfaceC6725cM12715a == null) {
                return -1;
            }
            this.f11513b = false;
            this.f11516e = interfaceC6725cM12715a.mo12605a();
        }
        while (true) {
            int i11 = this.f11516e.read();
            if (i11 >= 0) {
                return i11;
            }
            this.f11514c = this.f11515d.mo12607e();
            InterfaceC6725c interfaceC6725cM12715a2 = m12715a();
            this.f11515d = interfaceC6725cM12715a2;
            if (interfaceC6725cM12715a2 == null) {
                this.f11516e = null;
                return -1;
            }
            this.f11516e = interfaceC6725cM12715a2.mo12605a();
        }
    }
}
