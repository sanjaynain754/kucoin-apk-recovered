package p055c9;

import android.graphics.Rect;
import java.util.List;
import p037b9.C4519m;

/* JADX INFO: renamed from: c9.f */
/* JADX INFO: compiled from: DisplayConfiguration.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4912f {

    /* JADX INFO: renamed from: a */
    public C4519m f5448a;

    /* JADX INFO: renamed from: b */
    public int f5449b;

    /* JADX INFO: renamed from: c */
    public boolean f5450c = false;

    /* JADX INFO: renamed from: d */
    public AbstractC4916j f5451d = new C4913g();

    /* JADX INFO: renamed from: b */
    public C4519m m5135b(boolean z11) {
        C4519m c4519m = this.f5448a;
        if (c4519m == null) {
            return null;
        }
        return z11 ? c4519m.m4351b() : c4519m;
    }

    /* JADX INFO: renamed from: c */
    public int m5136c() {
        return this.f5449b;
    }

    /* JADX INFO: renamed from: d */
    public Rect m5137d(C4519m c4519m) {
        return this.f5451d.mo5133d(c4519m, this.f5448a);
    }

    /* JADX INFO: renamed from: e */
    public void m5138e(AbstractC4916j abstractC4916j) {
        this.f5451d = abstractC4916j;
    }

    public C4912f(int i11, C4519m c4519m) {
        this.f5449b = i11;
        this.f5448a = c4519m;
    }

    /* JADX INFO: renamed from: a */
    public C4519m m5134a(List<C4519m> list, boolean z11) {
        return this.f5451d.m5141b(list, m5135b(z11));
    }
}
