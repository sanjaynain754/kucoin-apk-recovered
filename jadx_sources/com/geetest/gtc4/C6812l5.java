package com.geetest.gtc4;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.geetest.gtc4.l5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6812l5 extends AbstractC6931z {

    /* JADX INFO: renamed from: b */
    public byte[] f11429b;

    @Override // com.geetest.gtc4.AbstractC6931z
    /* JADX INFO: renamed from: a */
    public final InterfaceC6752f mo12672a(int i11) {
        m12674n();
        return this.f11562a[i11];
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m12674n() {
        C6761g c6761g;
        InterfaceC6752f[] interfaceC6752fArr;
        try {
            if (this.f11429b != null) {
                byte[] bArr = this.f11429b;
                C6815m c6815m = new C6815m(new ByteArrayInputStream(bArr), bArr.length, true);
                try {
                    AbstractC6905w abstractC6905wM12681a = c6815m.m12681a();
                    if (abstractC6905wM12681a == null) {
                        c6761g = new C6761g(0);
                    } else {
                        C6761g c6761g2 = new C6761g(10);
                        do {
                            c6761g2.m12634a(abstractC6905wM12681a);
                            abstractC6905wM12681a = c6815m.m12681a();
                        } while (abstractC6905wM12681a != null);
                        c6761g = c6761g2;
                    }
                    c6815m.close();
                    int i11 = c6761g.f11365b;
                    if (i11 == 0) {
                        interfaceC6752fArr = C6761g.f11363d;
                    } else {
                        InterfaceC6752f[] interfaceC6752fArr2 = c6761g.f11364a;
                        if (interfaceC6752fArr2.length == i11) {
                            c6761g.f11366c = true;
                            interfaceC6752fArr = interfaceC6752fArr2;
                        } else {
                            InterfaceC6752f[] interfaceC6752fArr3 = new InterfaceC6752f[i11];
                            System.arraycopy(interfaceC6752fArr2, 0, interfaceC6752fArr3, 0, i11);
                            interfaceC6752fArr = interfaceC6752fArr3;
                        }
                    }
                    this.f11562a = interfaceC6752fArr;
                    this.f11429b = null;
                } catch (IOException e11) {
                    throw new C6896v("malformed ASN.1: " + e11, e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C6812l5(byte[] bArr) {
        this.f11429b = bArr;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f11429b;
        }
        if (bArr != null) {
            int length = bArr.length;
            return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
        }
        return new C6934z2(this.f11562a).mo12612a(z11);
    }

    @Override // com.geetest.gtc4.AbstractC6931z, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public final AbstractC6905w mo12600g() {
        m12674n();
        return new C6818m2(this.f11562a);
    }

    @Override // com.geetest.gtc4.AbstractC6931z, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        m12674n();
        return new C6934z2(this.f11562a);
    }

    @Override // com.geetest.gtc4.AbstractC6931z, com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        m12674n();
        return super.hashCode();
    }

    @Override // com.geetest.gtc4.AbstractC6931z, java.lang.Iterable
    public final Iterator iterator() {
        m12674n();
        return new C6825n0(this.f11562a);
    }

    @Override // com.geetest.gtc4.AbstractC6931z
    /* JADX INFO: renamed from: k */
    public final int mo12673k() {
        m12674n();
        return this.f11562a.length;
    }

    @Override // com.geetest.gtc4.AbstractC6931z
    /* JADX INFO: renamed from: l */
    public final AbstractC6716b mo12636l() {
        return ((AbstractC6931z) mo12601h()).mo12636l();
    }

    @Override // com.geetest.gtc4.AbstractC6931z
    /* JADX INFO: renamed from: m */
    public final AbstractC6869s mo12637m() {
        return ((AbstractC6931z) mo12601h()).mo12637m();
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f11429b;
        }
        if (bArr != null) {
            c6887u.m12723a(z11, 48, bArr);
        } else {
            new C6934z2(this.f11562a).mo12613a(c6887u, z11);
        }
    }
}
