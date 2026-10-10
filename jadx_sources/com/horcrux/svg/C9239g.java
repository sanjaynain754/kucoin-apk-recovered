package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.g */
/* JADX INFO: compiled from: PathParser.java */
/* JADX INFO: loaded from: classes56.dex */
public class C9239g {

    /* JADX INFO: renamed from: a */
    public static float f13228a;

    /* JADX INFO: renamed from: b */
    public static int f13229b;

    /* JADX INFO: renamed from: c */
    public static int f13230c;

    /* JADX INFO: renamed from: d */
    public static String f13231d;

    /* JADX INFO: renamed from: e */
    public static Path f13232e;

    /* JADX INFO: renamed from: f */
    public static ArrayList<C9238f> f13233f;

    /* JADX INFO: renamed from: g */
    public static float f13234g;

    /* JADX INFO: renamed from: h */
    public static float f13235h;

    /* JADX INFO: renamed from: i */
    public static float f13236i;

    /* JADX INFO: renamed from: j */
    public static float f13237j;

    /* JADX INFO: renamed from: k */
    public static float f13238k;

    /* JADX INFO: renamed from: l */
    public static float f13239l;

    /* JADX INFO: renamed from: m */
    public static boolean f13240m;

    /* JADX INFO: renamed from: A */
    public static void m14237A(float f11, float f12, float f13, float f14) {
        float f15 = (f13234g * 2.0f) - f13236i;
        float f16 = (f13235h * 2.0f) - f13237j;
        f13236i = f11;
        f13237j = f12;
        m14244e(f15, f16, f11, f12, f13, f14);
    }

    /* JADX INFO: renamed from: B */
    public static void m14238B(float f11, float f12) {
        m14239C(f11 + f13234g, f12 + f13235h);
    }

    /* JADX INFO: renamed from: C */
    public static void m14239C(float f11, float f12) {
        m14260u((f13234g * 2.0f) - f13236i, (f13235h * 2.0f) - f13237j, f11, f12);
    }

    /* JADX INFO: renamed from: a */
    public static void m14240a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        m14241b(f11, f12, f13, z11, z12, f14 + f13234g, f15 + f13235h);
    }

    /* JADX INFO: renamed from: b */
    public static void m14241b(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        float f16;
        float f17;
        float f18;
        float f19;
        float f21 = f13234g;
        float f22 = f13235h;
        if (f12 == 0.0f) {
            f16 = f11 == 0.0f ? f15 - f22 : f11;
        } else {
            f16 = f12;
        }
        float fAbs = Math.abs(f16);
        float fAbs2 = Math.abs(f11 == 0.0f ? f14 - f21 : f11);
        if (fAbs2 == 0.0f || fAbs == 0.0f || (f14 == f21 && f15 == f22)) {
            m14251l(f14, f15);
            return;
        }
        float radians = (float) Math.toRadians(f13);
        double d11 = radians;
        float fCos = (float) Math.cos(d11);
        float fSin = (float) Math.sin(d11);
        float f23 = f14 - f21;
        float f24 = f15 - f22;
        float f25 = ((fCos * f23) / 2.0f) + ((fSin * f24) / 2.0f);
        float f26 = -fSin;
        float f27 = ((f26 * f23) / 2.0f) + ((fCos * f24) / 2.0f);
        float f28 = fAbs2 * fAbs2;
        float f29 = f28 * fAbs * fAbs;
        float f31 = fAbs * fAbs * f25 * f25;
        float f32 = f28 * f27 * f27;
        float f33 = (f29 - f32) - f31;
        if (f33 < 0.0f) {
            float fSqrt = (float) Math.sqrt(1.0f - (f33 / f29));
            fAbs2 *= fSqrt;
            f19 = fAbs * fSqrt;
            f18 = f23 / 2.0f;
            f17 = f24 / 2.0f;
        } else {
            float fSqrt2 = (float) Math.sqrt(f33 / (f32 + f31));
            if (z11 == z12) {
                fSqrt2 = -fSqrt2;
            }
            float f34 = (((-fSqrt2) * f27) * fAbs2) / fAbs;
            float f35 = ((fSqrt2 * f25) * fAbs) / fAbs2;
            f17 = (f24 / 2.0f) + (f34 * fSin) + (f35 * fCos);
            f18 = ((fCos * f34) - (fSin * f35)) + (f23 / 2.0f);
            f19 = fAbs;
        }
        float f36 = fCos / fAbs2;
        float f37 = fSin / fAbs2;
        float f38 = f26 / f19;
        float f39 = fCos / f19;
        float f41 = -f18;
        float f42 = -f17;
        float f43 = f18;
        float fAtan2 = (float) Math.atan2((f38 * f41) + (f39 * f42), (f41 * f36) + (f37 * f42));
        float f44 = f23 - f43;
        float f45 = f24 - f17;
        float fAtan3 = (float) Math.atan2((f38 * f44) + (f39 * f45), (f36 * f44) + (f37 * f45));
        float f46 = f43 + f21;
        float f47 = f17 + f22;
        float f48 = f23 + f21;
        float f49 = f24 + f22;
        m14262w();
        f13236i = f48;
        f13234g = f48;
        f13237j = f49;
        f13235h = f49;
        if (fAbs2 != f19 || radians != 0) {
            m14242c(f46, f47, fAbs2, f19, fAtan2, fAtan3, z12, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(fAtan2);
        float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan3))) % 360.0f);
        if (!z11 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
            fAbs3 = 360.0f - fAbs3;
        }
        if (!z12) {
            fAbs3 = -fAbs3;
        }
        float f51 = f13228a;
        f13232e.arcTo(new RectF((f46 - fAbs2) * f51, (f47 - fAbs2) * f51, (f46 + fAbs2) * f51, (f47 + fAbs2) * f51), degrees, fAbs3);
        f13233f.add(new C9238f(ElementType.kCGPathElementAddCurveToPoint, new C9240h[]{new C9240h(f48, f49)}));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0067 A[LOOP:0: B:12:0x0065->B:13:0x0067, LOOP_END] */
    /* JADX INFO: renamed from: c */
    public static void m14242c(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, float f17) {
        double d11;
        int iCeil;
        float f18;
        float fTan;
        float fCos;
        float fSin;
        int i11;
        float f19 = f15;
        double d12 = f17;
        float fCos2 = (float) Math.cos(d12);
        float fSin2 = (float) Math.sin(d12);
        float f21 = fCos2 * f13;
        float f22 = (-fSin2) * f14;
        float f23 = fSin2 * f13;
        float f24 = fCos2 * f14;
        float f25 = f16 - f19;
        if (f25 >= 0.0f || !z11) {
            if (f25 > 0.0f && !z11) {
                d11 = ((double) f25) - 6.283185307179586d;
            }
            iCeil = (int) Math.ceil(Math.abs(m14261v(((double) f25) / 1.5707963267948966d)));
            f18 = f25 / iCeil;
            fTan = (float) (Math.tan(f18 / 4.0f) * 1.3333333333333333d);
            double d13 = f19;
            fCos = (float) Math.cos(d13);
            fSin = (float) Math.sin(d13);
            i11 = 0;
            while (i11 < iCeil) {
                float f26 = fCos - (fTan * fSin);
                float f27 = fSin + (fCos * fTan);
                float f28 = f19 + f18;
                double d14 = f28;
                float fCos3 = (float) Math.cos(d14);
                float fSin3 = (float) Math.sin(d14);
                float f29 = (fTan * fSin3) + fCos3;
                float f31 = fSin3 - (fTan * fCos3);
                float f32 = f11 + (f21 * f26) + (f22 * f27);
                float f33 = f12 + (f26 * f23) + (f27 * f24);
                float f34 = f11 + (f21 * f29) + (f22 * f31);
                float f35 = f12 + (f29 * f23) + (f31 * f24);
                float f36 = f11 + (f21 * fCos3) + (f22 * fSin3);
                float f37 = f12 + (f23 * fCos3) + (f24 * fSin3);
                Path path = f13232e;
                float f38 = f13228a;
                path.cubicTo(f32 * f38, f33 * f38, f34 * f38, f35 * f38, f36 * f38, f38 * f37);
                float f39 = f18;
                f13233f.add(new C9238f(ElementType.kCGPathElementAddCurveToPoint, new C9240h[]{new C9240h(f32, f33), new C9240h(f34, f35), new C9240h(f36, f37)}));
                i11++;
                f19 = f28;
                f24 = f24;
                f18 = f39;
                f23 = f23;
                fSin = fSin3;
                f21 = f21;
                f22 = f22;
                iCeil = iCeil;
                fCos = fCos3;
            }
        }
        d11 = ((double) f25) + 6.283185307179586d;
        f25 = (float) d11;
        iCeil = (int) Math.ceil(Math.abs(m14261v(((double) f25) / 1.5707963267948966d)));
        f18 = f25 / iCeil;
        fTan = (float) (Math.tan(f18 / 4.0f) * 1.3333333333333333d);
        double d15 = f19;
        fCos = (float) Math.cos(d15);
        fSin = (float) Math.sin(d15);
        i11 = 0;
        while (i11 < iCeil) {
            float f210 = fCos - (fTan * fSin);
            float f211 = fSin + (fCos * fTan);
            float f212 = f19 + f18;
            double d16 = f212;
            float fCos4 = (float) Math.cos(d16);
            float fSin4 = (float) Math.sin(d16);
            float f213 = (fTan * fSin4) + fCos4;
            float f310 = fSin4 - (fTan * fCos4);
            float f311 = f11 + (f21 * f210) + (f22 * f211);
            float f312 = f12 + (f210 * f23) + (f211 * f24);
            float f313 = f11 + (f21 * f213) + (f22 * f310);
            float f314 = f12 + (f213 * f23) + (f310 * f24);
            float f315 = f11 + (f21 * fCos4) + (f22 * fSin4);
            float f316 = f12 + (f23 * fCos4) + (f24 * fSin4);
            Path path2 = f13232e;
            float f317 = f13228a;
            path2.cubicTo(f311 * f317, f312 * f317, f313 * f317, f314 * f317, f315 * f317, f317 * f316);
            float f318 = f18;
            f13233f.add(new C9238f(ElementType.kCGPathElementAddCurveToPoint, new C9240h[]{new C9240h(f311, f312), new C9240h(f313, f314), new C9240h(f315, f316)}));
            i11++;
            f19 = f212;
            f24 = f24;
            f18 = f318;
            f23 = f23;
            fSin = fSin4;
            f21 = f21;
            f22 = f22;
            iCeil = iCeil;
            fCos = fCos4;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m14243d() {
        if (f13240m) {
            f13234g = f13238k;
            f13235h = f13239l;
            f13240m = false;
            f13232e.close();
            f13233f.add(new C9238f(ElementType.kCGPathElementCloseSubpath, new C9240h[]{new C9240h(f13234g, f13235h)}));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14245f(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f13234g;
        float f18 = f13235h;
        m14246g(f11 + f17, f12 + f18, f13 + f17, f14 + f18, f15 + f17, f16 + f18);
    }

    /* JADX INFO: renamed from: g */
    public static void m14246g(float f11, float f12, float f13, float f14, float f15, float f16) {
        f13236i = f13;
        f13237j = f14;
        m14244e(f11, f12, f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m14249j(char c11) {
        return (c11 >= '0' && c11 <= '9') || c11 == '.' || c11 == '-' || c11 == '+';
    }

    /* JADX INFO: renamed from: k */
    public static void m14250k(float f11, float f12) {
        m14251l(f11 + f13234g, f12 + f13235h);
    }

    /* JADX INFO: renamed from: m */
    public static void m14252m(float f11, float f12) {
        m14253n(f11 + f13234g, f12 + f13235h);
    }

    /* JADX INFO: renamed from: n */
    public static void m14253n(float f11, float f12) {
        f13234g = f11;
        f13236i = f11;
        f13238k = f11;
        f13235h = f12;
        f13237j = f12;
        f13239l = f12;
        Path path = f13232e;
        float f13 = f13228a;
        path.moveTo(f11 * f13, f13 * f12);
        f13233f.add(new C9238f(ElementType.kCGPathElementMoveToPoint, new C9240h[]{new C9240h(f11, f12)}));
    }

    /* JADX INFO: renamed from: o */
    public static Path m14254o(String str) {
        f13233f = new ArrayList<>();
        Path path = new Path();
        f13232e = path;
        if (str == null) {
            return path;
        }
        f13230c = str.length();
        f13231d = str;
        f13229b = 0;
        f13234g = 0.0f;
        f13235h = 0.0f;
        f13236i = 0.0f;
        f13237j = 0.0f;
        f13238k = 0.0f;
        f13239l = 0.0f;
        f13240m = false;
        char c11 = ' ';
        while (f13229b < f13230c) {
            m14264y();
            int i11 = f13229b;
            if (i11 >= f13230c) {
                return f13232e;
            }
            boolean z11 = true;
            boolean z12 = c11 != ' ';
            char cCharAt = f13231d.charAt(i11);
            if (!z12 && cCharAt != 'M' && cCharAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f13229b), f13231d));
            }
            if (m14248i(cCharAt)) {
                f13229b++;
                z11 = false;
                c11 = cCharAt;
            } else {
                if (!m14249j(cCharAt) || !z12) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f13229b), f13231d));
                }
                if (c11 == 'Z' || c11 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f13231d));
                }
                if (c11 == 'M' || c11 == 'm') {
                    c11 = m14247h(c11) ? 'L' : 'l';
                } else {
                    z11 = false;
                }
            }
            boolean zM14247h = m14247h(c11);
            switch (c11) {
                case 'A':
                    m14241b(m14256q(), m14256q(), m14256q(), m14255p(), m14255p(), m14256q(), m14256q());
                    break;
                case 'C':
                    m14246g(m14256q(), m14256q(), m14256q(), m14256q(), m14256q(), m14256q());
                    break;
                case 'H':
                    m14251l(m14256q(), f13235h);
                    break;
                case 'L':
                    m14251l(m14256q(), m14256q());
                    break;
                case 'M':
                    m14253n(m14256q(), m14256q());
                    break;
                case 'Q':
                    m14260u(m14256q(), m14256q(), m14256q(), m14256q());
                    break;
                case 'S':
                    m14237A(m14256q(), m14256q(), m14256q(), m14256q());
                    break;
                case 'T':
                    m14239C(m14256q(), m14256q());
                    break;
                case 'V':
                    m14251l(f13234g, m14256q());
                    break;
                case 'Z':
                case 'z':
                    m14243d();
                    break;
                case 'a':
                    m14240a(m14256q(), m14256q(), m14256q(), m14255p(), m14255p(), m14256q(), m14256q());
                    break;
                case 'c':
                    m14245f(m14256q(), m14256q(), m14256q(), m14256q(), m14256q(), m14256q());
                    break;
                case 'h':
                    m14250k(m14256q(), 0.0f);
                    break;
                case 'l':
                    m14250k(m14256q(), m14256q());
                    break;
                case 'm':
                    m14252m(m14256q(), m14256q());
                    break;
                case 'q':
                    m14259t(m14256q(), m14256q(), m14256q(), m14256q());
                    break;
                case 's':
                    m14265z(m14256q(), m14256q(), m14256q(), m14256q());
                    break;
                case 't':
                    m14238B(m14256q(), m14256q());
                    break;
                case 'v':
                    m14250k(0.0f, m14256q());
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c11), f13231d));
            }
            if (z11) {
                c11 = zM14247h ? 'M' : 'm';
            }
        }
        return f13232e;
    }

    /* JADX INFO: renamed from: q */
    public static float m14256q() {
        if (f13229b == f13230c) {
            throw new Error(String.format("Unexpected end (s=%s)", f13231d));
        }
        float fM14258s = m14258s();
        m14264y();
        m14257r();
        return fM14258s;
    }

    /* JADX INFO: renamed from: r */
    public static void m14257r() {
        int i11 = f13229b;
        if (i11 >= f13230c || f13231d.charAt(i11) != ',') {
            return;
        }
        f13229b++;
    }

    /* JADX INFO: renamed from: t */
    public static void m14259t(float f11, float f12, float f13, float f14) {
        float f15 = f13234g;
        float f16 = f13235h;
        m14260u(f11 + f15, f12 + f16, f13 + f15, f14 + f16);
    }

    /* JADX INFO: renamed from: u */
    public static void m14260u(float f11, float f12, float f13, float f14) {
        f13236i = f11;
        f13237j = f12;
        float f15 = f11 * 2.0f;
        float f16 = f12 * 2.0f;
        m14244e((f13234g + f15) / 3.0f, (f13235h + f16) / 3.0f, (f13 + f15) / 3.0f, (f14 + f16) / 3.0f, f13, f14);
    }

    /* JADX INFO: renamed from: v */
    public static double m14261v(double d11) {
        double dPow = Math.pow(10.0d, 4.0d);
        return Math.round(d11 * dPow) / dPow;
    }

    /* JADX INFO: renamed from: w */
    public static void m14262w() {
        if (f13240m) {
            return;
        }
        f13238k = f13234g;
        f13239l = f13235h;
        f13240m = true;
    }

    /* JADX INFO: renamed from: x */
    public static void m14263x() {
        while (true) {
            int i11 = f13229b;
            if (i11 >= f13230c || !Character.isDigit(f13231d.charAt(i11))) {
                return;
            } else {
                f13229b++;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m14264y() {
        while (true) {
            int i11 = f13229b;
            if (i11 >= f13230c || !Character.isWhitespace(f13231d.charAt(i11))) {
                return;
            } else {
                f13229b++;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m14265z(float f11, float f12, float f13, float f14) {
        float f15 = f13234g;
        float f16 = f13235h;
        m14237A(f11 + f15, f12 + f16, f13 + f15, f14 + f16);
    }

    /* JADX INFO: renamed from: e */
    public static void m14244e(float f11, float f12, float f13, float f14, float f15, float f16) {
        m14262w();
        f13234g = f15;
        f13235h = f16;
        Path path = f13232e;
        float f17 = f13228a;
        path.cubicTo(f11 * f17, f12 * f17, f13 * f17, f14 * f17, f15 * f17, f17 * f16);
        f13233f.add(new C9238f(ElementType.kCGPathElementAddCurveToPoint, new C9240h[]{new C9240h(f11, f12), new C9240h(f13, f14), new C9240h(f15, f16)}));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14247h(char c11) {
        return Character.isUpperCase(c11);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m14248i(char c11) {
        switch (c11) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m14251l(float f11, float f12) {
        m14262w();
        f13234g = f11;
        f13236i = f11;
        f13235h = f12;
        f13237j = f12;
        Path path = f13232e;
        float f13 = f13228a;
        path.lineTo(f11 * f13, f13 * f12);
        f13233f.add(new C9238f(ElementType.kCGPathElementAddLineToPoint, new C9240h[]{new C9240h(f11, f12)}));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m14255p() {
        m14264y();
        char cCharAt = f13231d.charAt(f13229b);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f13229b), f13231d));
        }
        int i11 = f13229b + 1;
        f13229b = i11;
        if (i11 < f13230c && f13231d.charAt(i11) == ',') {
            f13229b++;
        }
        m14264y();
        if (cCharAt == '1') {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static float m14258s() {
        char cCharAt;
        m14264y();
        int i11 = f13229b;
        if (i11 != f13230c) {
            char cCharAt2 = f13231d.charAt(i11);
            if (cCharAt2 == '-' || cCharAt2 == '+') {
                int i12 = f13229b + 1;
                f13229b = i12;
                cCharAt2 = f13231d.charAt(i12);
            }
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                m14263x();
                int i13 = f13229b;
                if (i13 < f13230c) {
                    cCharAt2 = f13231d.charAt(i13);
                }
            } else if (cCharAt2 != '.') {
                throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f13229b), f13231d));
            }
            if (cCharAt2 == '.') {
                f13229b++;
                m14263x();
                int i14 = f13229b;
                if (i14 < f13230c) {
                    cCharAt2 = f13231d.charAt(i14);
                }
            }
            if (cCharAt2 == 'e' || cCharAt2 == 'E') {
                int i15 = f13229b;
                if (i15 + 1 < f13230c && (cCharAt = f13231d.charAt(i15 + 1)) != 'm' && cCharAt != 'x') {
                    int i16 = f13229b + 1;
                    f13229b = i16;
                    char cCharAt3 = f13231d.charAt(i16);
                    if (cCharAt3 != '+' && cCharAt3 != '-') {
                        if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                            m14263x();
                        } else {
                            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f13229b), f13231d));
                        }
                    } else {
                        f13229b++;
                        m14263x();
                    }
                }
            }
            String strSubstring = f13231d.substring(i11, f13229b);
            float f11 = Float.parseFloat(strSubstring);
            if (!Float.isInfinite(f11) && !Float.isNaN(f11)) {
                return f11;
            }
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i11), Integer.valueOf(f13229b), f13231d));
        }
        throw new Error(String.format("Unexpected end (s=%s)", f13231d));
    }
}
