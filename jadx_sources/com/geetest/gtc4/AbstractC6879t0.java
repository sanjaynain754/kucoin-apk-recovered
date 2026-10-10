package com.geetest.gtc4;

import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.geetest.gtc4.AbstractC6879t0;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: renamed from: com.geetest.gtc4.t0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6879t0 {

    /* JADX INFO: renamed from: a */
    public int f11505a;

    /* JADX INFO: renamed from: b */
    public int f11506b;

    /* JADX INFO: renamed from: c */
    public int f11507c;

    /* JADX INFO: renamed from: d */
    public byte[] f11508d;

    /* JADX INFO: renamed from: e */
    public byte[] f11509e;

    /* JADX INFO: renamed from: f */
    public C6709a1 f11510f;

    /* JADX INFO: renamed from: g */
    public C6709a1 f11511g;

    /* JADX INFO: renamed from: a */
    public static AbstractC6879t0 m12711a(X509Certificate x509Certificate) throws CertificateParsingException {
        if (x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.25") == null && x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17") == null) {
            throw new CertificateParsingException("No attestation extensions found");
        }
        if (x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.25") == null) {
            if (x509Certificate.getExtensionValue("2.5.29.31") == null) {
                return new C6843p0(x509Certificate);
            }
            throw new CertificateParsingException("CRL Distribution Points extension found in leaf certificate.");
        }
        if (x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17") != null) {
            throw new CertificateParsingException("Multiple attestation extensions found");
        }
        try {
            return new C6810l3(x509Certificate);
        } catch (C6853q1 e11) {
            throw new CertificateParsingException("Unable to parse EAT extension", e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12713b(X509Certificate x509Certificate) {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Collection) x509Certificate.getCriticalExtensionOIDs().stream().filter(new Predicate() { // from class: v7.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC6879t0.m12712a((String) obj);
            }
        }).collect(Collectors.toSet()));
        hashSet.addAll((Collection) x509Certificate.getNonCriticalExtensionOIDs().stream().filter(new Predicate() { // from class: v7.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC6879t0.m12714b((String) obj);
            }
        }).collect(Collectors.toSet()));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo12670a();

    /* JADX INFO: renamed from: b */
    public abstract C6867r6 mo12671b();

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Extension type: ");
        sb2.append(getClass());
        sb2.append("\nAttest version: ");
        int i11 = this.f11505a;
        String str3 = "KeyMint version 1.0";
        if (i11 == 100) {
            str = "KeyMint version 1.0";
        } else if (i11 == 200) {
            str = "KeyMint version 2.0";
        } else if (i11 == 300) {
            str = "KeyMint version 3.0";
        } else if (i11 == 1) {
            str = "Keymaster version 2.0";
        } else if (i11 == 2) {
            str = "Keymaster version 3.0";
        } else if (i11 == 3) {
            str = "Keymaster version 4.0";
        } else if (i11 != 4) {
            str = "Unkown (" + i11 + ")";
        } else {
            str = "Keymaster version 4.1";
        }
        sb2.append(str);
        sb2.append("\nAttest security: ");
        int iMo12670a = mo12670a();
        String str4 = ExifInterface.TAG_SOFTWARE;
        if (iMo12670a == 0) {
            str2 = ExifInterface.TAG_SOFTWARE;
        } else if (iMo12670a == 1) {
            str2 = "TEE";
        } else if (iMo12670a != 2) {
            str2 = "Unknown (" + iMo12670a + ")";
        } else {
            str2 = "StrongBox";
        }
        sb2.append(str2);
        sb2.append("\nKM version: ");
        int i12 = this.f11506b;
        if (i12 == 41) {
            str3 = "Keymaster version 4.1";
        } else if (i12 != 100) {
            if (i12 == 200) {
                str3 = "KeyMint version 2.0";
            } else if (i12 == 300) {
                str3 = "KeyMint version 3.0";
            } else if (i12 == 0) {
                str3 = "Keymaster version 0.2 or 0.3";
            } else if (i12 == 1) {
                str3 = "Keymaster version 1.0";
            } else if (i12 == 2) {
                str3 = "Keymaster version 2.0";
            } else if (i12 == 3) {
                str3 = "Keymaster version 3.0";
            } else if (i12 != 4) {
                str3 = "Unkown (" + i12 + ")";
            } else {
                str3 = "Keymaster version 4.0";
            }
        }
        sb2.append(str3);
        sb2.append("\nKM security: ");
        int i13 = this.f11507c;
        if (i13 != 0) {
            if (i13 == 1) {
                str4 = "TEE";
            } else if (i13 != 2) {
                str4 = "Unknown (" + i13 + ")";
            } else {
                str4 = "StrongBox";
            }
        }
        sb2.append(str4);
        sb2.append("\nChallenge");
        byte[] bArr = this.f11508d;
        String str5 = bArr != null ? new String(bArr) : "null";
        char[] charArray = str5.toCharArray();
        int length = charArray.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                sb2.append(": [");
                sb2.append(str5);
                sb2.append("]");
                break;
            }
            if (charArray[i14] > 127) {
                sb2.append(" (base64): [");
                sb2.append(Base64.encodeToString(this.f11508d, 0));
                sb2.append("]");
                break;
            }
            i14++;
        }
        if (this.f11509e != null) {
            sb2.append("\nUnique ID (base64): [");
            sb2.append(Base64.encodeToString(this.f11509e, 0));
            sb2.append("]");
        }
        sb2.append("\n-- SW enforced --");
        sb2.append(this.f11510f);
        sb2.append("\n-- TEE enforced --");
        sb2.append(this.f11511g);
        return sb2.toString();
    }

    public AbstractC6879t0(X509Certificate x509Certificate) {
        m12713b(x509Certificate);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m12714b(String str) {
        return ("1.3.6.1.4.1.11129.2.1.17".equals(str) || "1.3.6.1.4.1.11129.2.1.25".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m12712a(String str) {
        return !"2.5.29.15".equals(str);
    }
}
