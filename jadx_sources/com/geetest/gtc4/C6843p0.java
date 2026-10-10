package com.geetest.gtc4;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

/* JADX INFO: renamed from: com.geetest.gtc4.p0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6843p0 extends AbstractC6879t0 {

    /* JADX INFO: renamed from: h */
    public final int f11455h;

    @Override // com.geetest.gtc4.AbstractC6879t0
    /* JADX INFO: renamed from: a */
    public final int mo12670a() {
        return this.f11455h;
    }

    @Override // com.geetest.gtc4.AbstractC6879t0
    /* JADX INFO: renamed from: b */
    public final C6867r6 mo12671b() {
        C6867r6 c6867r6 = this.f11511g.f11297s;
        return c6867r6 != null ? c6867r6 : this.f11510f.f11297s;
    }

    public C6843p0(X509Certificate x509Certificate) throws CertificateParsingException {
        super(x509Certificate);
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
        if (extensionValue != null && extensionValue.length != 0) {
            AbstractC6931z abstractC6931zM12697b = AbstractC6852q0.m12697b(extensionValue);
            this.f11505a = AbstractC6852q0.m12696b(abstractC6931zM12697b.mo12672a(0));
            this.f11455h = AbstractC6852q0.m12696b(abstractC6931zM12697b.mo12672a(1));
            this.f11506b = AbstractC6852q0.m12696b(abstractC6931zM12697b.mo12672a(2));
            this.f11507c = AbstractC6852q0.m12696b(abstractC6931zM12697b.mo12672a(3));
            this.f11508d = AbstractC6852q0.m12695a(abstractC6931zM12697b.mo12672a(4));
            this.f11509e = AbstractC6852q0.m12695a(abstractC6931zM12697b.mo12672a(5));
            this.f11510f = new C6709a1(abstractC6931zM12697b.mo12672a(6));
            this.f11511g = new C6709a1(abstractC6931zM12697b.mo12672a(7));
            return;
        }
        throw new CertificateParsingException("Did not find extension with OID 1.3.6.1.4.1.11129.2.1.17");
    }
}
