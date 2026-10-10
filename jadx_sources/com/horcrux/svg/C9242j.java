package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.horcrux.svg.j */
/* JADX INFO: compiled from: RNSVGMarkerPosition.java */
/* JADX INFO: loaded from: classes56.dex */
public class C9242j {

    /* JADX INFO: renamed from: d */
    public static ArrayList<C9242j> f13244d;

    /* JADX INFO: renamed from: e */
    public static int f13245e;

    /* JADX INFO: renamed from: f */
    public static C9240h f13246f;

    /* JADX INFO: renamed from: g */
    public static C9240h f13247g;

    /* JADX INFO: renamed from: h */
    public static C9240h f13248h;

    /* JADX INFO: renamed from: i */
    public static C9240h f13249i;

    /* JADX INFO: renamed from: j */
    public static boolean f13250j;

    /* JADX INFO: renamed from: a */
    public RNSVGMarkerType f13251a;

    /* JADX INFO: renamed from: b */
    public C9240h f13252b;

    /* JADX INFO: renamed from: c */
    public double f13253c;

    /* JADX INFO: renamed from: com.horcrux.svg.j$a */
    /* JADX INFO: compiled from: RNSVGMarkerPosition.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13254a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f13255b;

        static {
            int[] iArr = new int[ElementType.values().length];
            f13255b = iArr;
            try {
                iArr[ElementType.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13255b[ElementType.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13255b[ElementType.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13255b[ElementType.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13255b[ElementType.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[RNSVGMarkerType.values().length];
            f13254a = iArr2;
            try {
                iArr2[RNSVGMarkerType.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13254a[RNSVGMarkerType.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13254a[RNSVGMarkerType.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static double m14269a(double d11, double d12) {
        if (Math.abs(d11 - d12) > 180.0d) {
            d11 += 360.0d;
        }
        return (d11 + d12) / 2.0d;
    }

    /* JADX INFO: renamed from: c */
    public static double m14271c(RNSVGMarkerType rNSVGMarkerType) {
        double dM14278j = m14278j(m14274f(f13248h));
        double dM14278j2 = m14278j(m14274f(f13249i));
        int i11 = a.f13254a[rNSVGMarkerType.ordinal()];
        if (i11 == 1) {
            return f13250j ? dM14278j2 + 180.0d : dM14278j2;
        }
        if (i11 == 2) {
            return m14269a(dM14278j, dM14278j2);
        }
        if (i11 != 3) {
            return 0.0d;
        }
        return dM14278j;
    }

    /* JADX INFO: renamed from: d */
    public static C9243k m14272d(C9238f c9238f) {
        C9243k c9243k = new C9243k();
        C9240h[] c9240hArr = c9238f.f13227b;
        int i11 = a.f13255b[c9238f.f13226a.ordinal()];
        if (i11 == 1) {
            c9243k.f13258c = c9240hArr[2];
            c9243k.f13256a = m14279k(c9240hArr[0], f13246f);
            c9243k.f13257b = m14279k(c9240hArr[2], c9240hArr[1]);
            if (m14277i(c9243k.f13256a)) {
                m14270b(c9243k, c9240hArr[0], c9240hArr[1], c9240hArr[2]);
                return c9243k;
            }
            if (m14277i(c9243k.f13257b)) {
                m14270b(c9243k, f13246f, c9240hArr[0], c9240hArr[1]);
            }
        } else {
            if (i11 == 2) {
                C9240h c9240h = c9240hArr[1];
                c9243k.f13258c = c9240h;
                m14270b(c9243k, f13246f, c9240hArr[0], c9240h);
                return c9243k;
            }
            if (i11 == 3 || i11 == 4) {
                C9240h c9240h2 = c9240hArr[0];
                c9243k.f13258c = c9240h2;
                c9243k.f13256a = m14279k(c9240h2, f13246f);
                c9243k.f13257b = m14279k(c9243k.f13258c, f13246f);
                return c9243k;
            }
            if (i11 == 5) {
                C9240h c9240h3 = f13247g;
                c9243k.f13258c = c9240h3;
                c9243k.f13256a = m14279k(c9240h3, f13246f);
                c9243k.f13257b = m14279k(c9243k.f13258c, f13246f);
                return c9243k;
            }
        }
        return c9243k;
    }

    /* JADX INFO: renamed from: e */
    public static void m14273e() {
        RNSVGMarkerType rNSVGMarkerType = RNSVGMarkerType.kEndMarker;
        f13244d.add(new C9242j(rNSVGMarkerType, f13246f, m14271c(rNSVGMarkerType)));
    }

    /* JADX INFO: renamed from: f */
    public static double m14274f(C9240h c9240h) {
        return Math.atan2(c9240h.f13242b, c9240h.f13241a);
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList<C9242j> m14276h(ArrayList<C9238f> arrayList) {
        f13244d = new ArrayList<>();
        f13245e = 0;
        f13246f = new C9240h(0.0d, 0.0d);
        f13247g = new C9240h(0.0d, 0.0d);
        Iterator<C9238f> it = arrayList.iterator();
        while (it.hasNext()) {
            m14275g(it.next());
        }
        m14273e();
        return f13244d;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m14277i(C9240h c9240h) {
        return c9240h.f13241a == 0.0d && c9240h.f13242b == 0.0d;
    }

    /* JADX INFO: renamed from: k */
    public static C9240h m14279k(C9240h c9240h, C9240h c9240h2) {
        return new C9240h(c9240h2.f13241a - c9240h.f13241a, c9240h2.f13242b - c9240h.f13242b);
    }

    public C9242j(RNSVGMarkerType rNSVGMarkerType, C9240h c9240h, double d11) {
        this.f13251a = rNSVGMarkerType;
        this.f13252b = c9240h;
        this.f13253c = d11;
    }

    /* JADX INFO: renamed from: b */
    public static void m14270b(C9243k c9243k, C9240h c9240h, C9240h c9240h2, C9240h c9240h3) {
        c9243k.f13256a = m14279k(c9240h2, c9240h);
        c9243k.f13257b = m14279k(c9240h3, c9240h2);
        if (m14277i(c9243k.f13256a)) {
            c9243k.f13256a = c9243k.f13257b;
        } else if (m14277i(c9243k.f13257b)) {
            c9243k.f13257b = c9243k.f13256a;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m14275g(C9238f c9238f) {
        RNSVGMarkerType rNSVGMarkerType;
        C9243k c9243kM14272d = m14272d(c9238f);
        f13249i = c9243kM14272d.f13256a;
        int i11 = f13245e;
        if (i11 > 0) {
            if (i11 == 1) {
                rNSVGMarkerType = RNSVGMarkerType.kStartMarker;
            } else {
                rNSVGMarkerType = RNSVGMarkerType.kMidMarker;
            }
            f13244d.add(new C9242j(rNSVGMarkerType, f13246f, m14271c(rNSVGMarkerType)));
        }
        f13248h = c9243kM14272d.f13257b;
        f13246f = c9243kM14272d.f13258c;
        ElementType elementType = c9238f.f13226a;
        if (elementType == ElementType.kCGPathElementMoveToPoint) {
            f13247g = c9238f.f13227b[0];
        } else if (elementType == ElementType.kCGPathElementCloseSubpath) {
            f13247g = new C9240h(0.0d, 0.0d);
        }
        f13245e++;
    }

    /* JADX INFO: renamed from: j */
    public static double m14278j(double d11) {
        return d11 * 57.29577951308232d;
    }
}
