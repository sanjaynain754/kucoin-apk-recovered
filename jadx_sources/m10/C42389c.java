package m10;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.kubi.sdk.widget.shape.drawable.ShapeGradientOrientation;

/* JADX INFO: renamed from: m10.c */
/* JADX INFO: compiled from: ShapeState.java */
/* JADX INFO: loaded from: classes43.dex */
public class C42389c extends Drawable.ConstantState {

    /* JADX INFO: renamed from: A */
    public int f93947A;

    /* JADX INFO: renamed from: B */
    public float f93948B;

    /* JADX INFO: renamed from: C */
    public float f93949C;

    /* JADX INFO: renamed from: D */
    public float f93950D;

    /* JADX INFO: renamed from: E */
    public boolean f93951E;

    /* JADX INFO: renamed from: F */
    public boolean f93952F;

    /* JADX INFO: renamed from: G */
    public boolean f93953G;

    /* JADX INFO: renamed from: H */
    public int f93954H;

    /* JADX INFO: renamed from: I */
    public int f93955I;

    /* JADX INFO: renamed from: J */
    public int f93956J;

    /* JADX INFO: renamed from: K */
    public int f93957K;

    /* JADX INFO: renamed from: L */
    public int f93958L;

    /* JADX INFO: renamed from: a */
    public int f93959a;

    /* JADX INFO: renamed from: b */
    public int f93960b;

    /* JADX INFO: renamed from: c */
    public int f93961c;

    /* JADX INFO: renamed from: d */
    public ShapeGradientOrientation f93962d;

    /* JADX INFO: renamed from: e */
    public int[] f93963e;

    /* JADX INFO: renamed from: f */
    public int[] f93964f;

    /* JADX INFO: renamed from: g */
    public int[] f93965g;

    /* JADX INFO: renamed from: h */
    public int[] f93966h;

    /* JADX INFO: renamed from: i */
    public float[] f93967i;

    /* JADX INFO: renamed from: j */
    public float[] f93968j;

    /* JADX INFO: renamed from: k */
    public float[] f93969k;

    /* JADX INFO: renamed from: l */
    public boolean f93970l;

    /* JADX INFO: renamed from: m */
    public boolean f93971m;

    /* JADX INFO: renamed from: n */
    public int f93972n;

    /* JADX INFO: renamed from: o */
    public int f93973o;

    /* JADX INFO: renamed from: p */
    public int f93974p;

    /* JADX INFO: renamed from: q */
    public float f93975q;

    /* JADX INFO: renamed from: r */
    public float f93976r;

    /* JADX INFO: renamed from: s */
    public float f93977s;

    /* JADX INFO: renamed from: t */
    public float[] f93978t;

    /* JADX INFO: renamed from: u */
    public Rect f93979u;

    /* JADX INFO: renamed from: v */
    public int f93980v;

    /* JADX INFO: renamed from: w */
    public int f93981w;

    /* JADX INFO: renamed from: x */
    public float f93982x;

    /* JADX INFO: renamed from: y */
    public float f93983y;

    /* JADX INFO: renamed from: z */
    public int f93984z;

    public C42389c() {
        this.f93960b = 0;
        this.f93961c = 0;
        this.f93962d = ShapeGradientOrientation.TOP_BOTTOM;
        this.f93973o = -1;
        this.f93980v = -1;
        this.f93981w = -1;
        this.f93948B = 0.5f;
        this.f93949C = 0.5f;
        this.f93950D = 0.5f;
        this.f93958L = 17;
    }

    /* JADX INFO: renamed from: d */
    public void m93049d(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        this.f93977s = f11;
        this.f93978t = null;
    }

    /* JADX INFO: renamed from: n */
    public void m93059n(int... iArr) {
        if (iArr == null) {
            this.f93972n = 0;
            this.f93970l = true;
            m93047a();
            return;
        }
        if (iArr.length == 1) {
            this.f93970l = true;
            this.f93972n = iArr[0];
            this.f93963e = null;
        } else {
            this.f93970l = false;
            this.f93972n = 0;
            this.f93963e = iArr;
        }
        m93047a();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C42388b(this);
    }

    /* JADX INFO: renamed from: o */
    public void m93060o(int... iArr) {
        if (iArr == null) {
            this.f93974p = 0;
            this.f93971m = true;
            m93047a();
            return;
        }
        if (iArr.length == 1) {
            this.f93971m = true;
            this.f93974p = iArr[0];
            this.f93964f = null;
        } else {
            this.f93971m = false;
            this.f93974p = 0;
            this.f93964f = iArr;
        }
        m93047a();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m93046b(int i11) {
        return ((i11 >> 24) & 255) == 255;
    }

    /* JADX INFO: renamed from: a */
    public final void m93047a() {
        if (this.f93960b != 0) {
            this.f93953G = false;
            return;
        }
        if (this.f93977s > 0.0f || this.f93978t != null) {
            this.f93953G = false;
            return;
        }
        if (this.f93954H > 0) {
            this.f93953G = false;
            return;
        }
        if (this.f93973o > 0 && !m93046b(this.f93974p)) {
            this.f93953G = false;
            return;
        }
        if (this.f93970l) {
            this.f93953G = m93046b(this.f93972n);
            return;
        }
        int[] iArr = this.f93963e;
        if (iArr != null) {
            for (int i11 : iArr) {
                if (!m93046b(i11)) {
                    this.f93953G = false;
                    return;
                }
            }
        }
        if (this.f93971m) {
            this.f93953G = m93046b(this.f93974p);
            return;
        }
        int[] iArr2 = this.f93964f;
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                if (!m93046b(i12)) {
                    this.f93953G = false;
                    return;
                }
            }
        }
        this.f93953G = true;
    }

    /* JADX INFO: renamed from: c */
    public void m93048c(float[] fArr) {
        this.f93978t = fArr;
        if (fArr == null) {
            this.f93977s = 0.0f;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m93050e(float f11, float f12) {
        this.f93948B = f11;
        this.f93949C = f12;
    }

    /* JADX INFO: renamed from: f */
    public void m93051f(float f11) {
        this.f93950D = f11;
    }

    /* JADX INFO: renamed from: g */
    public void m93052g(int i11) {
        this.f93961c = i11;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f93959a;
    }

    /* JADX INFO: renamed from: h */
    public void m93053h(int i11) {
        this.f93955I = i11;
    }

    /* JADX INFO: renamed from: i */
    public void m93054i(int i11) {
        this.f93956J = i11;
    }

    /* JADX INFO: renamed from: j */
    public void m93055j(int i11) {
        this.f93957K = i11;
    }

    /* JADX INFO: renamed from: k */
    public void m93056k(int i11) {
        this.f93954H = i11;
    }

    /* JADX INFO: renamed from: l */
    public void m93057l(int i11) {
        this.f93960b = i11;
        m93047a();
    }

    /* JADX INFO: renamed from: m */
    public void m93058m(int i11, int i12) {
        this.f93980v = i11;
        this.f93981w = i12;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C42388b(this);
    }

    /* JADX INFO: renamed from: p */
    public void m93061p(float f11, float f12) {
        this.f93975q = f11;
        this.f93976r = f12;
        m93047a();
    }

    /* JADX INFO: renamed from: q */
    public void m93062q(int i11) {
        this.f93973o = i11;
        m93047a();
    }

    public C42389c(C42389c c42389c) {
        this.f93960b = 0;
        this.f93961c = 0;
        this.f93962d = ShapeGradientOrientation.TOP_BOTTOM;
        this.f93973o = -1;
        this.f93980v = -1;
        this.f93981w = -1;
        this.f93948B = 0.5f;
        this.f93949C = 0.5f;
        this.f93950D = 0.5f;
        this.f93958L = 17;
        this.f93959a = c42389c.f93959a;
        this.f93960b = c42389c.f93960b;
        this.f93961c = c42389c.f93961c;
        this.f93962d = c42389c.f93962d;
        int[] iArr = c42389c.f93963e;
        if (iArr != null) {
            this.f93963e = (int[]) iArr.clone();
        }
        int[] iArr2 = c42389c.f93964f;
        if (iArr2 != null) {
            this.f93964f = (int[]) iArr2.clone();
        }
        float[] fArr = c42389c.f93969k;
        if (fArr != null) {
            this.f93969k = (float[]) fArr.clone();
        }
        this.f93970l = c42389c.f93970l;
        this.f93971m = c42389c.f93971m;
        this.f93972n = c42389c.f93972n;
        this.f93973o = c42389c.f93973o;
        this.f93974p = c42389c.f93974p;
        this.f93975q = c42389c.f93975q;
        this.f93976r = c42389c.f93976r;
        this.f93977s = c42389c.f93977s;
        float[] fArr2 = c42389c.f93978t;
        if (fArr2 != null) {
            this.f93978t = (float[]) fArr2.clone();
        }
        if (c42389c.f93979u != null) {
            this.f93979u = new Rect(c42389c.f93979u);
        }
        this.f93980v = c42389c.f93980v;
        this.f93981w = c42389c.f93981w;
        this.f93982x = c42389c.f93982x;
        this.f93983y = c42389c.f93983y;
        this.f93984z = c42389c.f93984z;
        this.f93947A = c42389c.f93947A;
        this.f93948B = c42389c.f93948B;
        this.f93949C = c42389c.f93949C;
        this.f93950D = c42389c.f93950D;
        this.f93951E = c42389c.f93951E;
        this.f93952F = c42389c.f93952F;
        this.f93953G = c42389c.f93953G;
        this.f93954H = c42389c.f93954H;
        this.f93955I = c42389c.f93955I;
        this.f93956J = c42389c.f93956J;
        this.f93957K = c42389c.f93957K;
        this.f93958L = c42389c.f93958L;
    }
}
