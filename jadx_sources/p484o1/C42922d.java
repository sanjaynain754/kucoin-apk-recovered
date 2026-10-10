package p484o1;

/* JADX INFO: renamed from: o1.d */
/* JADX INFO: compiled from: GammaEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public class C42922d {
    /* JADX INFO: renamed from: c */
    public static int m94154c(float f11, int i11, int i12) {
        if (i11 == i12 || f11 <= 0.0f) {
            return i11;
        }
        if (f11 >= 1.0f) {
            return i12;
        }
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float fM94152a = m94152a(((i11 >> 16) & 255) / 255.0f);
        float fM94152a2 = m94152a(((i11 >> 8) & 255) / 255.0f);
        float fM94152a3 = m94152a((i11 & 255) / 255.0f);
        float fM94152a4 = m94152a(((i12 >> 16) & 255) / 255.0f);
        float f13 = f12 + (((((i12 >> 24) & 255) / 255.0f) - f12) * f11);
        float fM94152a5 = fM94152a2 + ((m94152a(((i12 >> 8) & 255) / 255.0f) - fM94152a2) * f11);
        float fM94152a6 = fM94152a3 + (f11 * (m94152a((i12 & 255) / 255.0f) - fM94152a3));
        return (Math.round(m94153b(fM94152a + ((fM94152a4 - fM94152a) * f11)) * 255.0f) << 16) | (Math.round(f13 * 255.0f) << 24) | (Math.round(m94153b(fM94152a5) * 255.0f) << 8) | Math.round(m94153b(fM94152a6) * 255.0f);
    }

    /* JADX INFO: renamed from: a */
    public static float m94152a(float f11) {
        if (f11 <= 0.04045f) {
            return f11 / 12.92f;
        }
        return (float) Math.pow((f11 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: b */
    public static float m94153b(float f11) {
        if (f11 <= 0.0031308f) {
            return f11 * 12.92f;
        }
        return (float) ((Math.pow(f11, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
