package com.geetest.gtc4;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateParsingException;
import java.util.HashSet;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.geetest.gtc4.q0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6852q0 {
    /* JADX INFO: renamed from: a */
    public static byte[] m12695a(InterfaceC6752f interfaceC6752f) throws CertificateParsingException {
        if (interfaceC6752f == null || !(interfaceC6752f instanceof C6782i2)) {
            throw new CertificateParsingException("Expected DEROctetString");
        }
        return ((AbstractC6869s) interfaceC6752f).f11487a;
    }

    /* JADX INFO: renamed from: b */
    public static int m12696b(InterfaceC6752f interfaceC6752f) {
        if (interfaceC6752f instanceof C6824n) {
            C6824n c6824n = (C6824n) interfaceC6752f;
            c6824n.getClass();
            BigInteger bigInteger = new BigInteger(c6824n.f11439a);
            if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) > 0 || bigInteger.compareTo(BigInteger.ZERO) < 0) {
                throw new CertificateParsingException("INTEGER out of bounds");
            }
            return bigInteger.intValue();
        }
        if (!(interfaceC6752f instanceof C6770h)) {
            throw new CertificateParsingException("Integer value expected, " + interfaceC6752f.getClass().getName() + " found.");
        }
        C6770h c6770h = (C6770h) interfaceC6752f;
        c6770h.getClass();
        BigInteger bigInteger2 = new BigInteger(c6770h.f11376a);
        if (bigInteger2.compareTo(BigInteger.valueOf(2147483647L)) > 0 || bigInteger2.compareTo(BigInteger.ZERO) < 0) {
            throw new CertificateParsingException("INTEGER out of bounds");
        }
        return bigInteger2.intValue();
    }

    /* JADX INFO: renamed from: c */
    public static Long m12698c(InterfaceC6752f interfaceC6752f) throws CertificateParsingException {
        if (!(interfaceC6752f instanceof C6824n)) {
            throw new CertificateParsingException("Integer value expected, " + interfaceC6752f.getClass().getName() + " found.");
        }
        C6824n c6824n = (C6824n) interfaceC6752f;
        c6824n.getClass();
        BigInteger bigInteger = new BigInteger(c6824n.f11439a);
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            throw new CertificateParsingException("INTEGER out of bounds");
        }
        return Long.valueOf(bigInteger.longValue());
    }

    /* JADX INFO: renamed from: d */
    public static String m12699d(InterfaceC6752f interfaceC6752f) throws CertificateParsingException {
        if (interfaceC6752f instanceof AbstractC6869s) {
            return new String(((AbstractC6869s) interfaceC6752f).f11487a, StandardCharsets.UTF_8);
        }
        throw new CertificateParsingException("Expected octet string, found ".concat(interfaceC6752f.getClass().getName()));
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6905w m12692a(byte[] bArr) throws CertificateParsingException {
        try {
            C6815m c6815m = new C6815m(bArr);
            try {
                AbstractC6905w abstractC6905wM12681a = c6815m.m12681a();
                c6815m.close();
                return abstractC6905wM12681a;
            } catch (Throwable th2) {
                try {
                    c6815m.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new CertificateParsingException("Failed to parse Encodable", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6931z m12693a(C6815m c6815m) throws CertificateParsingException, IOException {
        AbstractC6905w abstractC6905wM12681a = c6815m.m12681a();
        if (abstractC6905wM12681a instanceof AbstractC6869s) {
            C6815m c6815m2 = new C6815m(((AbstractC6869s) abstractC6905wM12681a).f11487a);
            try {
                AbstractC6905w abstractC6905wM12681a2 = c6815m2.m12681a();
                if (abstractC6905wM12681a2 instanceof AbstractC6931z) {
                    AbstractC6931z abstractC6931z = (AbstractC6931z) abstractC6905wM12681a2;
                    c6815m2.close();
                    return abstractC6931z;
                }
                throw new CertificateParsingException("Expected sequence, found ".concat(abstractC6905wM12681a2.getClass().getName()));
            } catch (Throwable th2) {
                try {
                    c6815m2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        throw new CertificateParsingException("Expected octet stream, found ".concat(abstractC6905wM12681a.getClass().getName()));
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC6931z m12697b(byte[] bArr) {
        try {
            C6815m c6815m = new C6815m(bArr);
            try {
                AbstractC6931z abstractC6931zM12693a = m12693a(c6815m);
                c6815m.close();
                return abstractC6931zM12693a;
            } catch (Throwable th2) {
                try {
                    c6815m.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new CertificateParsingException("Failed to parse SEQUENCE", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12694a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof AbstractC6717b0) {
            HashSet hashSet = new HashSet();
            AbstractC6717b0 abstractC6717b0 = (AbstractC6717b0) abstractC6905w;
            int i11 = 0;
            while (true) {
                InterfaceC6752f[] interfaceC6752fArr = abstractC6717b0.f11313a;
                if (i11 >= interfaceC6752fArr.length) {
                    return;
                }
                if (i11 < interfaceC6752fArr.length) {
                    hashSet.add(Integer.valueOf(m12696b((C6824n) interfaceC6752fArr[i11])));
                    i11++;
                } else {
                    throw new NoSuchElementException();
                }
            }
        } else {
            throw new CertificateParsingException("Expected set, found ".concat(abstractC6905w.getClass().getName()));
        }
    }
}
