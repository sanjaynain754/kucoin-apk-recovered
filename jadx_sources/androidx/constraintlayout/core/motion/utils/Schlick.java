package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes23.dex */
public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double mEps;

    /* JADX INFO: renamed from: mS */
    double f2194mS;

    /* JADX INFO: renamed from: mT */
    double f2195mT;

    private double dfunc(double d11) {
        double d12 = this.f2195mT;
        if (d11 < d12) {
            double d13 = this.f2194mS;
            return ((d13 * d12) * d12) / ((((d12 - d11) * d13) + d11) * ((d13 * (d12 - d11)) + d11));
        }
        double d14 = this.f2194mS;
        return (((d12 - 1.0d) * d14) * (d12 - 1.0d)) / (((((-d14) * (d12 - d11)) - d11) + 1.0d) * ((((-d14) * (d12 - d11)) - d11) + 1.0d));
    }

    private double func(double d11) {
        double d12 = this.f2195mT;
        return d11 < d12 ? (d12 * d11) / (d11 + (this.f2194mS * (d12 - d11))) : ((1.0d - d12) * (d11 - 1.0d)) / ((1.0d - d11) - (this.f2194mS * (d12 - d11)));
    }

    public Schlick(String str) {
        this.mStr = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f2194mS = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i11 = iIndexOf2 + 1;
        this.f2195mT = Double.parseDouble(str.substring(i11, str.indexOf(44, i11)).trim());
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d11) {
        return func(d11);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d11) {
        return dfunc(d11);
    }
}
