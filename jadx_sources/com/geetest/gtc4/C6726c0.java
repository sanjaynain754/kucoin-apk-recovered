package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.c0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6726c0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC6839o5 f11323a;

    /* JADX INFO: renamed from: b */
    public final int f11324b;

    /* JADX INFO: renamed from: c */
    public final byte[][] f11325c;

    /* JADX INFO: renamed from: a */
    public final C6799k1 m12618a(int i11, int i12) {
        C6761g c6761gM12617a = m12617a();
        int i13 = c6761gM12617a.f11365b;
        if (i13 == 1) {
            return new C6799k1(3, i11, i12, c6761gM12617a.m12633a(0));
        }
        C6763g1 c6763g1 = AbstractC6736d1.f11337a;
        return new C6799k1(4, i11, i12, i13 < 1 ? AbstractC6736d1.f11337a : new C6763g1(c6761gM12617a));
    }

    public C6726c0(AbstractC6839o5 abstractC6839o5, int i11, byte[][] bArr) {
        this.f11323a = abstractC6839o5;
        this.f11324b = i11;
        this.f11325c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final C6761g m12617a() {
        int i11 = this.f11323a.read();
        if (i11 < 0) {
            return new C6761g(0);
        }
        C6761g c6761g = new C6761g(10);
        do {
            InterfaceC6752f interfaceC6752fM12616a = m12616a(i11);
            if (interfaceC6752fM12616a instanceof InterfaceC6785i5) {
                c6761g.m12634a(((InterfaceC6785i5) interfaceC6752fM12616a).mo12597b());
            } else {
                c6761g.m12634a(interfaceC6752fM12616a.mo12598d());
            }
            i11 = this.f11323a.read();
        } while (i11 >= 0);
        return c6761g;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC6752f m12616a(int i11) throws IOException {
        AbstractC6839o5 abstractC6839o5 = this.f11323a;
        if (abstractC6839o5 instanceof C6794j5) {
            C6794j5 c6794j5 = (C6794j5) abstractC6839o5;
            c6794j5.f11412f = false;
            c6794j5.m12663b();
        }
        int iM12676a = C6815m.m12676a(this.f11323a, i11);
        int iM12677a = C6815m.m12677a(this.f11323a, this.f11324b, iM12676a == 3 || iM12676a == 4 || iM12676a == 16 || iM12676a == 17 || iM12676a == 8);
        if (iM12677a < 0) {
            if ((i11 & 32) != 0) {
                C6726c0 c6726c0 = new C6726c0(new C6794j5(this.f11323a, this.f11324b), this.f11324b, this.f11325c);
                int i12 = i11 & 192;
                if (i12 != 0) {
                    return new C6808l1(i12, iM12676a, c6726c0);
                }
                if (iM12676a == 3) {
                    return new C6727c1(c6726c0);
                }
                if (iM12676a == 4) {
                    return new C6754f1(c6726c0);
                }
                if (iM12676a == 8) {
                    return new C6719b2(c6726c0);
                }
                if (iM12676a == 16) {
                    return new C6772h1(c6726c0);
                }
                if (iM12676a == 17) {
                    return new C6790j1(c6726c0);
                }
                throw new C6779i("unknown BER object encountered: 0x" + Integer.toHexString(iM12676a));
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        C6774h3 c6774h3 = new C6774h3(this.f11323a, iM12677a, this.f11324b);
        if ((i11 & 224) == 0) {
            if (iM12676a == 3) {
                return new C6899v2(c6774h3);
            }
            if (iM12676a == 4) {
                return new C6791j2(c6774h3);
            }
            if (iM12676a == 8) {
                throw new C6779i("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iM12676a == 16) {
                throw new C6779i("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iM12676a != 17) {
                try {
                    return C6815m.m12678a(iM12676a, c6774h3, this.f11325c);
                } catch (IllegalArgumentException e11) {
                    throw new C6779i("corrupted stream detected", e11);
                }
            }
            throw new C6779i("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        C6726c0 c6726c1 = new C6726c0(c6774h3, c6774h3.f11451b, this.f11325c);
        int i13 = i11 & 192;
        if (i13 != 0) {
            return new C6747e3(i13, iM12676a, (i11 & 32) != 0, c6726c1);
        }
        if (iM12676a == 3) {
            return new C6727c1(c6726c1);
        }
        if (iM12676a == 4) {
            return new C6754f1(c6726c1);
        }
        if (iM12676a == 8) {
            return new C6719b2(c6726c1);
        }
        if (iM12676a == 16) {
            return new C6711a3(c6726c1);
        }
        if (iM12676a == 17) {
            return new C6729c3(c6726c1);
        }
        throw new C6779i("unknown DL object encountered: 0x" + Integer.toHexString(iM12676a));
    }
}
