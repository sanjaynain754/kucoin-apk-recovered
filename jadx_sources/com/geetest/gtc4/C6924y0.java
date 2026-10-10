package com.geetest.gtc4;

import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateParsingException;

/* JADX INFO: renamed from: com.geetest.gtc4.y0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6924y0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final String f11557a;

    /* JADX INFO: renamed from: b */
    public final long f11558b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6924y0 c6924y0 = (C6924y0) obj;
        int iCompareTo = this.f11557a.compareTo(c6924y0.f11557a);
        return iCompareTo != 0 ? iCompareTo : Long.compare(this.f11558b, c6924y0.f11558b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6924y0)) {
            return false;
        }
        C6924y0 c6924y0 = (C6924y0) obj;
        int iCompareTo = this.f11557a.compareTo(c6924y0.f11557a);
        if (iCompareTo == 0) {
            iCompareTo = Long.compare(this.f11558b, c6924y0.f11558b);
        }
        return iCompareTo == 0;
    }

    public final String toString() {
        return this.f11557a + " (version code " + this.f11558b + ")\n";
    }

    public C6924y0(InterfaceC6752f interfaceC6752f) throws CertificateParsingException {
        if (interfaceC6752f instanceof AbstractC6931z) {
            AbstractC6931z abstractC6931z = (AbstractC6931z) interfaceC6752f;
            try {
                this.f11557a = AbstractC6852q0.m12699d(abstractC6931z.mo12672a(0));
                this.f11558b = AbstractC6852q0.m12698c(abstractC6931z.mo12672a(1)).longValue();
                return;
            } catch (UnsupportedEncodingException e11) {
                throw new CertificateParsingException("Converting octet stream to String triggered an UnsupportedEncodingException", e11);
            }
        }
        throw new CertificateParsingException("Expected sequence for AttestationPackageInfo, found ".concat(interfaceC6752f.getClass().getName()));
    }
}
