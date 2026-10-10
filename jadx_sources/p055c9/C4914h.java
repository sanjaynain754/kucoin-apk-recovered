package p055c9;

import android.graphics.Rect;
import p037b9.C4519m;

/* JADX INFO: renamed from: c9.h */
/* JADX INFO: compiled from: FitXYStrategy.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4914h extends AbstractC4916j {
    /* JADX INFO: renamed from: e */
    public static float m5139e(float f11) {
        return f11 < 1.0f ? 1.0f / f11 : f11;
    }

    @Override // p055c9.AbstractC4916j
    /* JADX INFO: renamed from: c */
    public float mo5132c(C4519m c4519m, C4519m c4519m2) {
        int i11 = c4519m.f3949b;
        if (i11 <= 0 || c4519m.f3950c <= 0) {
            return 0.0f;
        }
        float fM5139e = (1.0f / m5139e((i11 * 1.0f) / c4519m2.f3949b)) / m5139e((c4519m.f3950c * 1.0f) / c4519m2.f3950c);
        float fM5139e2 = m5139e(((c4519m.f3949b * 1.0f) / c4519m.f3950c) / ((c4519m2.f3949b * 1.0f) / c4519m2.f3950c));
        return fM5139e * (((1.0f / fM5139e2) / fM5139e2) / fM5139e2);
    }

    @Override // p055c9.AbstractC4916j
    /* JADX INFO: renamed from: d */
    public Rect mo5133d(C4519m c4519m, C4519m c4519m2) {
        return new Rect(0, 0, c4519m2.f3949b, c4519m2.f3950c);
    }
}
