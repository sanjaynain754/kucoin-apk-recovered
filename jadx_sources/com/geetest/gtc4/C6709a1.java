package com.geetest.gtc4;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateParsingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: renamed from: com.geetest.gtc4.a1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6709a1 {

    /* JADX INFO: renamed from: A */
    public final String f11267A;

    /* JADX INFO: renamed from: B */
    public final String f11268B;

    /* JADX INFO: renamed from: C */
    public final String f11269C;

    /* JADX INFO: renamed from: D */
    public final String f11270D;

    /* JADX INFO: renamed from: E */
    public final String f11271E;

    /* JADX INFO: renamed from: F */
    public final String f11272F;

    /* JADX INFO: renamed from: G */
    public final String f11273G;

    /* JADX INFO: renamed from: H */
    public final Boolean f11274H;

    /* JADX INFO: renamed from: I */
    public final Boolean f11275I;

    /* JADX INFO: renamed from: J */
    public final Boolean f11276J;

    /* JADX INFO: renamed from: K */
    public final Boolean f11277K;

    /* JADX INFO: renamed from: L */
    public final Boolean f11278L;

    /* JADX INFO: renamed from: a */
    public final Integer f11279a;

    /* JADX INFO: renamed from: b */
    public final Integer f11280b;

    /* JADX INFO: renamed from: c */
    public final Integer f11281c;

    /* JADX INFO: renamed from: d */
    public final Integer f11282d;

    /* JADX INFO: renamed from: e */
    public final Long f11283e;

    /* JADX INFO: renamed from: f */
    public final Boolean f11284f;

    /* JADX INFO: renamed from: g */
    public final Date f11285g;

    /* JADX INFO: renamed from: h */
    public final Date f11286h;

    /* JADX INFO: renamed from: i */
    public final Date f11287i;

    /* JADX INFO: renamed from: j */
    public final Integer f11288j;

    /* JADX INFO: renamed from: k */
    public final Boolean f11289k;

    /* JADX INFO: renamed from: l */
    public final Integer f11290l;

    /* JADX INFO: renamed from: m */
    public final Boolean f11291m;

    /* JADX INFO: renamed from: n */
    public final Boolean f11292n;

    /* JADX INFO: renamed from: o */
    public final String f11293o;

    /* JADX INFO: renamed from: p */
    public final Date f11294p;

    /* JADX INFO: renamed from: q */
    public final Boolean f11295q;

    /* JADX INFO: renamed from: r */
    public final Boolean f11296r;

    /* JADX INFO: renamed from: s */
    public final C6867r6 f11297s;

    /* JADX INFO: renamed from: t */
    public final Integer f11298t;

    /* JADX INFO: renamed from: u */
    public final Integer f11299u;

    /* JADX INFO: renamed from: v */
    public final Integer f11300v;

    /* JADX INFO: renamed from: w */
    public final Integer f11301w;

    /* JADX INFO: renamed from: x */
    public final C6897v0 f11302x;

    /* JADX INFO: renamed from: y */
    public final String f11303y;

    /* JADX INFO: renamed from: z */
    public final String f11304z;

    public C6709a1(InterfaceC6752f interfaceC6752f) throws CertificateParsingException {
        InterfaceC6752f c6708a0;
        int i11;
        InterfaceC6752f c6708a1;
        if (!(interfaceC6752f instanceof AbstractC6931z)) {
            throw new CertificateParsingException("Expected sequence for authorization list, found ".concat(interfaceC6752f.getClass().getName()));
        }
        AbstractC6931z abstractC6931z = (AbstractC6931z) interfaceC6752f;
        int iMo12673k = abstractC6931z.mo12673k();
        if (iMo12673k == 0) {
            i11 = 0;
            c6708a0 = null;
        } else {
            try {
                c6708a0 = abstractC6931z.f11562a[0];
                if (c6708a0 instanceof AbstractC6931z) {
                    AbstractC6931z abstractC6931z2 = (AbstractC6931z) c6708a0;
                    i11 = 1;
                    c6708a0 = new C6923y(abstractC6931z2, abstractC6931z2.mo12673k());
                } else {
                    if (c6708a0 instanceof AbstractC6717b0) {
                        AbstractC6717b0 abstractC6717b0 = (AbstractC6717b0) c6708a0;
                        int length = abstractC6717b0.f11313a.length;
                        c6708a0 = new C6708a0(abstractC6717b0);
                    }
                    i11 = 1;
                }
            } catch (IOException e11) {
                throw new CertificateParsingException("Failed to parse ASN1 sequence", e11);
            }
        }
        if (c6708a0 != null && !(c6708a0 instanceof AbstractC6735d0)) {
            throw new CertificateParsingException("Expected tagged object, found ".concat(c6708a0.getClass().getName()));
        }
        AbstractC6735d0 abstractC6735d0 = (AbstractC6735d0) c6708a0;
        while (abstractC6735d0 != null) {
            int i12 = abstractC6735d0.f11335c;
            InterfaceC6752f interfaceC6752f2 = abstractC6735d0.f11336d;
            AbstractC6905w abstractC6905wMo12598d = interfaceC6752f2 instanceof AbstractC6905w ? (AbstractC6905w) interfaceC6752f2 : interfaceC6752f2.mo12598d();
            abstractC6905wMo12598d.getClass();
            if (i12 == 1) {
                AbstractC6852q0.m12694a(abstractC6905wMo12598d);
            } else if (i12 == 2) {
                this.f11280b = Integer.valueOf(AbstractC6852q0.m12696b(abstractC6905wMo12598d));
            } else if (i12 == 3) {
                this.f11281c = Integer.valueOf(AbstractC6852q0.m12696b(abstractC6905wMo12598d));
            } else if (i12 == 5 || i12 == 6) {
                AbstractC6852q0.m12694a(abstractC6905wMo12598d);
            } else if (i12 == 600) {
                this.f11292n = Boolean.TRUE;
            } else if (i12 == 601) {
                this.f11293o = new String(AbstractC6852q0.m12695a((InterfaceC6752f) abstractC6905wMo12598d));
            } else if (i12 == 10) {
                this.f11282d = Integer.valueOf(AbstractC6852q0.m12696b(abstractC6905wMo12598d));
            } else if (i12 == 200) {
                this.f11283e = AbstractC6852q0.m12698c(abstractC6905wMo12598d);
            } else if (i12 == 203) {
                AbstractC6852q0.m12694a(abstractC6905wMo12598d);
            } else if (i12 == 303) {
                this.f11296r = Boolean.TRUE;
            } else if (i12 == 305) {
                this.f11284f = Boolean.TRUE;
            } else if (i12 == 405) {
                this.f11288j = Integer.valueOf(AbstractC6852q0.m12696b(abstractC6905wMo12598d));
            } else if (i12 != 723) {
                switch (i12) {
                    case 400:
                        this.f11285g = new Date(AbstractC6852q0.m12698c(abstractC6905wMo12598d).longValue());
                        break;
                    case 401:
                        this.f11286h = new Date(AbstractC6852q0.m12698c(abstractC6905wMo12598d).longValue());
                        break;
                    case 402:
                        this.f11287i = new Date(AbstractC6852q0.m12698c(abstractC6905wMo12598d).longValue());
                        break;
                    default:
                        switch (i12) {
                            case 503:
                                this.f11289k = Boolean.TRUE;
                                break;
                            case 504:
                                AbstractC6852q0.m12696b(abstractC6905wMo12598d);
                                break;
                            case 505:
                                this.f11290l = Integer.valueOf(AbstractC6852q0.m12696b(abstractC6905wMo12598d));
                                break;
                            case 506:
                                this.f11291m = Boolean.TRUE;
                                break;
                            case 507:
                                this.f11274H = Boolean.TRUE;
                                break;
                            case 508:
                                this.f11275I = Boolean.TRUE;
                                break;
                            case 509:
                                this.f11276J = Boolean.TRUE;
                                break;
                            default:
                                switch (i12) {
                                    case TypedValues.TransitionType.TYPE_FROM /* 701 */:
                                        this.f11294p = new Date(AbstractC6852q0.m12698c(abstractC6905wMo12598d).longValue());
                                        break;
                                    case TypedValues.TransitionType.TYPE_TO /* 702 */:
                                        AbstractC6852q0.m12696b(abstractC6905wMo12598d);
                                        break;
                                    case 703:
                                        this.f11295q = Boolean.TRUE;
                                        break;
                                    case TypedValues.TransitionType.TYPE_AUTO_TRANSITION /* 704 */:
                                        this.f11297s = new C6867r6(abstractC6905wMo12598d);
                                        break;
                                    case TypedValues.TransitionType.TYPE_INTERPOLATOR /* 705 */:
                                        this.f11298t = Integer.valueOf(AbstractC6852q0.m12696b(abstractC6905wMo12598d));
                                        break;
                                    case TypedValues.TransitionType.TYPE_STAGGERED /* 706 */:
                                        this.f11299u = Integer.valueOf(AbstractC6852q0.m12696b(abstractC6905wMo12598d));
                                        break;
                                    default:
                                        switch (i12) {
                                            case 709:
                                                this.f11302x = new C6897v0(AbstractC6852q0.m12692a(AbstractC6852q0.m12695a((InterfaceC6752f) abstractC6905wMo12598d)));
                                                break;
                                            case 710:
                                                this.f11303y = m12599a(abstractC6905wMo12598d);
                                                break;
                                            case 711:
                                                this.f11304z = m12599a(abstractC6905wMo12598d);
                                                break;
                                            case 712:
                                                this.f11271E = m12599a(abstractC6905wMo12598d);
                                                break;
                                            case 713:
                                                this.f11267A = m12599a(abstractC6905wMo12598d);
                                                break;
                                            case 714:
                                                this.f11268B = m12599a(abstractC6905wMo12598d);
                                                break;
                                            case 715:
                                                this.f11270D = m12599a(abstractC6905wMo12598d);
                                                break;
                                            case 716:
                                                this.f11272F = m12599a(abstractC6905wMo12598d);
                                                break;
                                            case 717:
                                                this.f11273G = m12599a(abstractC6905wMo12598d);
                                                break;
                                            case 718:
                                                this.f11300v = Integer.valueOf(AbstractC6852q0.m12696b(abstractC6905wMo12598d));
                                                break;
                                            case AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD /* 719 */:
                                                this.f11301w = Integer.valueOf(AbstractC6852q0.m12696b(abstractC6905wMo12598d));
                                                break;
                                            case 720:
                                                this.f11277K = Boolean.TRUE;
                                                break;
                                            case 721:
                                                this.f11278L = Boolean.TRUE;
                                                break;
                                            default:
                                                throw new CertificateParsingException("Unknown tag " + i12 + " found");
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.f11269C = m12599a(abstractC6905wMo12598d);
            }
            if (iMo12673k == i11) {
                c6708a1 = null;
            } else {
                try {
                    int i13 = i11 + 1;
                    c6708a1 = abstractC6931z.f11562a[i11];
                    if (c6708a1 instanceof AbstractC6931z) {
                        AbstractC6931z abstractC6931z3 = (AbstractC6931z) c6708a1;
                        i11 = i13;
                        c6708a1 = new C6923y(abstractC6931z3, abstractC6931z3.mo12673k());
                    } else {
                        if (c6708a1 instanceof AbstractC6717b0) {
                            AbstractC6717b0 abstractC6717b1 = (AbstractC6717b0) c6708a1;
                            int length2 = abstractC6717b1.f11313a.length;
                            c6708a1 = new C6708a0(abstractC6717b1);
                        }
                        i11 = i13;
                    }
                } catch (IOException e12) {
                    throw new CertificateParsingException("Failed to parse ASN1 sequence", e12);
                }
            }
            if (c6708a1 != null && !(c6708a1 instanceof AbstractC6735d0)) {
                throw new CertificateParsingException("Expected tagged object, found ".concat(c6708a1.getClass().getName()));
            }
            abstractC6735d0 = (AbstractC6735d0) c6708a1;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(1, "NONE");
        map.put(2, "OAEP");
        map.put(3, "PSS");
        map.put(4, "PKCS1 ENCRYPT");
        map.put(5, "PKCS1 SIGN");
        map.put(64, "PKCS7");
        HashMap map2 = new HashMap();
        map2.put(0, "NONE");
        map2.put(1, "MD5");
        map2.put(2, "SHA1");
        map2.put(3, "SHA224");
        map2.put(4, "SHA256");
        map2.put(5, "SHA384");
        map2.put(6, "SHA512");
        HashMap map3 = new HashMap();
        map3.put(1, "DECRYPT");
        map3.put(0, "ENCRYPT");
        map3.put(2, "SIGN");
        map3.put(3, "VERIFY");
        map3.put(5, "WRAP");
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f11280b != null) {
            sb2.append("\nAlgorithm: ");
            int iIntValue = this.f11280b.intValue();
            if (iIntValue == 1) {
                str2 = "RSA";
            } else if (iIntValue == 3) {
                str2 = "ECDSA";
            } else if (iIntValue == 128) {
                str2 = "HMAC";
            } else if (iIntValue == 32) {
                str2 = "AES";
            } else if (iIntValue != 33) {
                str2 = "Unknown (" + iIntValue + ")";
            } else {
                str2 = "3DES";
            }
            sb2.append(str2);
        }
        if (this.f11281c != null) {
            sb2.append("\nKeySize: ");
            sb2.append(this.f11281c);
        }
        if (this.f11282d != null) {
            sb2.append("\nEC Curve: ");
            Integer num = this.f11282d;
            if (num == null) {
                str = "NULL";
            } else {
                int iIntValue2 = num.intValue();
                if (iIntValue2 == 0) {
                    str = "secp224r1";
                } else if (iIntValue2 == 1) {
                    str = "secp256r1";
                } else if (iIntValue2 == 2) {
                    str = "secp384r1";
                } else if (iIntValue2 == 3) {
                    str = "secp521r1";
                } else if (iIntValue2 != 4) {
                    str = "unknown (" + num + ")";
                } else {
                    str = "CURVE_25519";
                }
            }
            sb2.append(str);
        }
        if (this.f11283e != null) {
            sb2.append("\nRSA exponent: ");
            sb2.append(this.f11283e);
        }
        if (this.f11284f != null) {
            sb2.append("\nEarly boot only");
        }
        if (this.f11285g != null) {
            sb2.append("\nActive: ");
            sb2.append(DateFormat.getDateTimeInstance().format(this.f11285g));
        }
        if (this.f11286h != null) {
            sb2.append("\nOrigination expire: ");
            sb2.append(DateFormat.getDateTimeInstance().format(this.f11286h));
        }
        if (this.f11287i != null) {
            sb2.append("\nUsage expire: ");
            sb2.append(DateFormat.getDateTimeInstance().format(this.f11287i));
        }
        if (this.f11288j != null) {
            sb2.append("\nUsage count limit: ");
            sb2.append(this.f11288j);
        }
        if (this.f11289k != null) {
            sb2.append("\nNo Auth Required");
        }
        if (this.f11290l != null) {
            sb2.append("\nAuth timeout: ");
            sb2.append(this.f11290l);
        }
        if (this.f11291m != null) {
            sb2.append("\nAllow While On Body");
        }
        if (this.f11292n != null) {
            sb2.append("\nAll Applications");
        }
        if (this.f11293o != null) {
            sb2.append("\nApplication ID: ");
            sb2.append(this.f11293o);
        }
        if (this.f11294p != null) {
            sb2.append("\nCreated: ");
            sb2.append(DateFormat.getDateTimeInstance().format(this.f11294p));
        }
        if (this.f11295q != null) {
            sb2.append("\nRollback resistant");
        }
        if (this.f11296r != null) {
            sb2.append("\nRollback resistance");
        }
        if (this.f11297s != null) {
            sb2.append("\nRoot of Trust:\n");
            sb2.append(this.f11297s);
        }
        if (this.f11298t != null) {
            sb2.append("\nOS Version: ");
            sb2.append(this.f11298t);
        }
        if (this.f11299u != null) {
            sb2.append("\nOS Patchlevel: ");
            sb2.append(this.f11299u);
        }
        if (this.f11300v != null) {
            sb2.append("\nVendor Patchlevel: ");
            sb2.append(this.f11300v);
        }
        if (this.f11301w != null) {
            sb2.append("\nBoot Patchlevel: ");
            sb2.append(this.f11301w);
        }
        if (this.f11302x != null) {
            sb2.append("\nAttestation Application Id:\n");
            sb2.append(this.f11302x);
        }
        if (this.f11274H != null) {
            sb2.append("\nUser presence required");
        }
        if (this.f11275I != null) {
            sb2.append("\nConfirmation required");
        }
        if (this.f11276J != null) {
            sb2.append("\nUnlocked Device Required");
        }
        if (this.f11277K != null) {
            sb2.append("\nDevice unique attestation");
        }
        if (this.f11278L != null) {
            sb2.append("\nIdentity Credential Key");
        }
        if (this.f11303y != null) {
            sb2.append("\nBrand: ");
            sb2.append(this.f11303y);
        }
        if (this.f11304z != null) {
            sb2.append("\nDevice type: ");
            sb2.append(this.f11304z);
        }
        if (this.f11271E != null) {
            sb2.append("\nProduct: ");
            sb2.append(this.f11271E);
        }
        if (this.f11267A != null) {
            sb2.append("\nSerial: ");
            sb2.append(this.f11267A);
        }
        if (this.f11268B != null) {
            sb2.append("\nIMEI: ");
            sb2.append(this.f11268B);
        }
        if (this.f11269C != null) {
            sb2.append("\nSecond IMEI:");
            sb2.append(this.f11269C);
        }
        if (this.f11270D != null) {
            sb2.append("\nMEID: ");
            sb2.append(this.f11270D);
        }
        if (this.f11272F != null) {
            sb2.append("\nManufacturer: ");
            sb2.append(this.f11272F);
        }
        if (this.f11273G != null) {
            sb2.append("\nModel: ");
            sb2.append(this.f11273G);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m12599a(AbstractC6905w abstractC6905w) throws CertificateParsingException {
        try {
            return AbstractC6852q0.m12699d(abstractC6905w);
        } catch (UnsupportedEncodingException e11) {
            throw new CertificateParsingException("Error parsing ASN.1 value", e11);
        }
    }

    public C6709a1(C6857q5 c6857q5) throws CertificateParsingException {
        for (AbstractC6756f3 abstractC6756f3 : c6857q5.f11474e) {
            int iIntValue = ((AbstractC6741d6) abstractC6756f3).f11339c.intValue();
            if (iIntValue == -80706) {
                this.f11299u = Integer.valueOf(AbstractC6862r1.m12704d(c6857q5, abstractC6756f3));
            } else if (iIntValue == -80705) {
                this.f11298t = Integer.valueOf(AbstractC6862r1.m12704d(c6857q5, abstractC6756f3));
            } else if (iIntValue == -80703) {
                this.f11295q = Boolean.TRUE;
            } else if (iIntValue == -80702) {
                AbstractC6862r1.m12704d(c6857q5, abstractC6756f3);
            } else if (iIntValue == -80006) {
                AbstractC6862r1.m12705e(c6857q5, abstractC6756f3);
            } else if (iIntValue != -80005) {
                switch (iIntValue) {
                    case -80720:
                        this.f11277K = Boolean.TRUE;
                        break;
                    case -80719:
                        this.f11301w = Integer.valueOf(AbstractC6862r1.m12704d(c6857q5, abstractC6756f3));
                        break;
                    case -80718:
                        this.f11300v = Integer.valueOf(AbstractC6862r1.m12704d(c6857q5, abstractC6756f3));
                        break;
                    case -80717:
                        this.f11273G = AbstractC6862r1.m12706f(c6857q5, abstractC6756f3);
                        break;
                    case -80716:
                        this.f11272F = AbstractC6862r1.m12706f(c6857q5, abstractC6756f3);
                        break;
                    case -80715:
                        this.f11270D = AbstractC6862r1.m12706f(c6857q5, abstractC6756f3);
                        break;
                    default:
                        switch (iIntValue) {
                            case -80713:
                                this.f11267A = AbstractC6862r1.m12706f(c6857q5, abstractC6756f3);
                                break;
                            case -80712:
                                this.f11271E = AbstractC6862r1.m12706f(c6857q5, abstractC6756f3);
                                break;
                            case -80711:
                                this.f11304z = AbstractC6862r1.m12706f(c6857q5, abstractC6756f3);
                                break;
                            case -80710:
                                this.f11303y = AbstractC6862r1.m12706f(c6857q5, abstractC6756f3);
                                break;
                            case -80709:
                                this.f11302x = new C6897v0(AbstractC6852q0.m12692a(AbstractC6862r1.m12702b(c6857q5, abstractC6756f3)));
                                break;
                            default:
                                switch (iIntValue) {
                                    case -80601:
                                        this.f11293o = AbstractC6862r1.m12706f(c6857q5, abstractC6756f3);
                                        break;
                                    case -80305:
                                        break;
                                    case -80303:
                                        this.f11296r = Boolean.TRUE;
                                        continue;
                                    case -80203:
                                        AbstractC6862r1.m12705e(c6857q5, abstractC6756f3);
                                        continue;
                                    case -80200:
                                        this.f11283e = Long.valueOf(((AbstractC6741d6) ((AbstractC6756f3) c6857q5.f11473d.get(abstractC6756f3))).f11339c.longValue());
                                        continue;
                                    case -80010:
                                        this.f11282d = Integer.valueOf(AbstractC6862r1.m12704d(c6857q5, abstractC6756f3));
                                        continue;
                                    case -76002:
                                        int iM12704d = AbstractC6862r1.m12704d(c6857q5, abstractC6756f3);
                                        int i11 = 1;
                                        if (iM12704d == 1) {
                                            i11 = 0;
                                        } else if (iM12704d != 3) {
                                            if (iM12704d != 4) {
                                                throw new RuntimeException("Invalid EAT security level: " + iM12704d);
                                            }
                                            i11 = 2;
                                        }
                                        this.f11279a = Integer.valueOf(i11);
                                        continue;
                                    case -75009:
                                        this.f11268B = AbstractC6862r1.m12706f(c6857q5, abstractC6756f3);
                                        continue;
                                    case 6:
                                        this.f11294p = AbstractC6862r1.m12703c(c6857q5, abstractC6756f3);
                                        continue;
                                    default:
                                        switch (iIntValue) {
                                            case -80509:
                                                this.f11276J = Boolean.TRUE;
                                                break;
                                            case -80508:
                                                this.f11275I = Boolean.TRUE;
                                                break;
                                            case -80507:
                                                this.f11274H = AbstractC6862r1.m12701a(c6857q5, abstractC6756f3);
                                                break;
                                            case -80506:
                                                this.f11291m = Boolean.TRUE;
                                                break;
                                            case -80505:
                                                this.f11290l = Integer.valueOf(AbstractC6862r1.m12704d(c6857q5, abstractC6756f3));
                                                break;
                                            case -80504:
                                                AbstractC6862r1.m12704d(c6857q5, abstractC6756f3);
                                                break;
                                            case -80503:
                                                this.f11289k = Boolean.TRUE;
                                                continue;
                                            default:
                                                switch (iIntValue) {
                                                    case -80402:
                                                        this.f11287i = AbstractC6862r1.m12703c(c6857q5, abstractC6756f3);
                                                        break;
                                                    case -80401:
                                                        this.f11286h = AbstractC6862r1.m12703c(c6857q5, abstractC6756f3);
                                                        break;
                                                    case -80400:
                                                        this.f11285g = AbstractC6862r1.m12703c(c6857q5, abstractC6756f3);
                                                        break;
                                                    default:
                                                        switch (iIntValue) {
                                                            case -80003:
                                                                this.f11281c = Integer.valueOf(AbstractC6862r1.m12704d(c6857q5, abstractC6756f3));
                                                                break;
                                                            case -80002:
                                                                this.f11280b = Integer.valueOf(AbstractC6862r1.m12704d(c6857q5, abstractC6756f3));
                                                                break;
                                                            case -80001:
                                                                AbstractC6862r1.m12705e(c6857q5, abstractC6756f3);
                                                                break;
                                                            default:
                                                                throw new CertificateParsingException("Unknown EAT tag: " + abstractC6756f3);
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                this.f11284f = Boolean.TRUE;
                                break;
                        }
                        break;
                }
            } else {
                AbstractC6862r1.m12705e(c6857q5, abstractC6756f3);
            }
        }
    }
}
