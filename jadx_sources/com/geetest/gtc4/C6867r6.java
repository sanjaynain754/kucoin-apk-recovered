package com.geetest.gtc4;

import android.util.Base64;
import java.security.cert.CertificateParsingException;

/* JADX INFO: renamed from: com.geetest.gtc4.r6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6867r6 {

    /* JADX INFO: renamed from: a */
    public final byte[] f11480a;

    /* JADX INFO: renamed from: b */
    public final boolean f11481b;

    /* JADX INFO: renamed from: c */
    public final int f11482c;

    /* JADX INFO: renamed from: d */
    public final byte[] f11483d;

    public C6867r6(AbstractC6905w abstractC6905w) throws CertificateParsingException {
        if (!(abstractC6905w instanceof AbstractC6931z)) {
            throw new CertificateParsingException("Expected sequence for root of trust, found ".concat(abstractC6905w.getClass().getName()));
        }
        AbstractC6931z abstractC6931z = (AbstractC6931z) abstractC6905w;
        boolean z11 = false;
        this.f11480a = AbstractC6852q0.m12695a(abstractC6931z.mo12672a(0));
        InterfaceC6752f interfaceC6752fMo12672a = abstractC6931z.mo12672a(1);
        if (!(interfaceC6752fMo12672a instanceof C6743e)) {
            throw new CertificateParsingException("Expected boolean, found ".concat(interfaceC6752fMo12672a.getClass().getName()));
        }
        C6743e c6743e = (C6743e) interfaceC6752fMo12672a;
        if (c6743e.m12732b(C6743e.f11341c)) {
            z11 = true;
        } else if (!c6743e.m12732b(C6743e.f11340b)) {
            throw new CertificateParsingException("DER-encoded boolean values must contain either 0x00 or 0xFF");
        }
        this.f11481b = z11;
        this.f11482c = AbstractC6852q0.m12696b(abstractC6931z.mo12672a(2));
        if (abstractC6931z.mo12673k() == 3) {
            this.f11483d = null;
        } else {
            this.f11483d = AbstractC6852q0.m12695a(abstractC6931z.mo12672a(3));
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Verified boot Key: ");
        sb2.append(Base64.encodeToString(this.f11480a, 0));
        sb2.append(" (base64)\nDevice locked: ");
        sb2.append(this.f11481b);
        sb2.append("\nVerified boot state: ");
        int i11 = this.f11482c;
        if (i11 == 0) {
            str = "Verified";
        } else if (i11 == 1) {
            str = "Self-signed";
        } else if (i11 == 2) {
            str = "Unverified";
        } else if (i11 != 3) {
            str = "Unknown (" + i11 + ")";
        } else {
            str = "Failed";
        }
        sb2.append(str);
        sb2.append('\n');
        if (this.f11483d != null) {
            sb2.append("Verified boot hash: ");
            sb2.append(Base64.encodeToString(this.f11483d, 0));
            sb2.append(" (base64)");
        }
        return sb2.toString();
    }

    public C6867r6(byte[] bArr, boolean z11, int i11, byte[] bArr2) {
        this.f11480a = bArr;
        this.f11481b = z11;
        this.f11482c = i11;
        this.f11483d = bArr2;
    }
}
