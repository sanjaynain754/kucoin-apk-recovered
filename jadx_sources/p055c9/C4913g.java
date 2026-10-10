package p055c9;

import android.graphics.Rect;
import android.util.Log;
import p037b9.C4519m;

/* JADX INFO: renamed from: c9.g */
/* JADX INFO: compiled from: FitCenterStrategy.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4913g extends AbstractC4916j {

    /* JADX INFO: renamed from: b */
    public static final String f5452b = "g";

    @Override // p055c9.AbstractC4916j
    /* JADX INFO: renamed from: c */
    public float mo5132c(C4519m c4519m, C4519m c4519m2) {
        if (c4519m.f3949b <= 0 || c4519m.f3950c <= 0) {
            return 0.0f;
        }
        C4519m c4519mM4353d = c4519m.m4353d(c4519m2);
        float fPow = (c4519mM4353d.f3949b * 1.0f) / c4519m.f3949b;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f11 = ((c4519m2.f3949b * 1.0f) / c4519mM4353d.f3949b) * ((c4519m2.f3950c * 1.0f) / c4519mM4353d.f3950c);
        return fPow * (((1.0f / f11) / f11) / f11);
    }

    @Override // p055c9.AbstractC4916j
    /* JADX INFO: renamed from: d */
    public Rect mo5133d(C4519m c4519m, C4519m c4519m2) {
        C4519m c4519mM4353d = c4519m.m4353d(c4519m2);
        Log.i(f5452b, "Preview: " + c4519m + "; Scaled: " + c4519mM4353d + "; Want: " + c4519m2);
        int i11 = (c4519mM4353d.f3949b - c4519m2.f3949b) / 2;
        int i12 = (c4519mM4353d.f3950c - c4519m2.f3950c) / 2;
        return new Rect(-i11, -i12, c4519mM4353d.f3949b - i11, c4519mM4353d.f3950c - i12);
    }
}
