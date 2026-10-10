package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import p283g5.InterfaceC37814g;
import p712w3.C45708h;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.f */
/* JADX INFO: compiled from: FadeDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5584f extends C5574a {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f8267z = 0;

    /* JADX INFO: renamed from: j */
    public final Drawable[] f8268j;

    /* JADX INFO: renamed from: k */
    public final boolean f8269k;

    /* JADX INFO: renamed from: l */
    public final int f8270l;

    /* JADX INFO: renamed from: m */
    public final int f8271m;

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public int f8272n;

    /* JADX INFO: renamed from: o */
    @VisibleForTesting
    public int f8273o;

    /* JADX INFO: renamed from: p */
    @VisibleForTesting
    public long f8274p;

    /* JADX INFO: renamed from: q */
    @VisibleForTesting
    public int[] f8275q;

    /* JADX INFO: renamed from: r */
    @VisibleForTesting
    public int[] f8276r;

    /* JADX INFO: renamed from: s */
    @VisibleForTesting
    public int f8277s;

    /* JADX INFO: renamed from: t */
    @VisibleForTesting
    public boolean[] f8278t;

    /* JADX INFO: renamed from: u */
    @VisibleForTesting
    public int f8279u;

    /* JADX INFO: renamed from: v */
    public InterfaceC37814g f8280v;

    /* JADX INFO: renamed from: w */
    public boolean f8281w;

    /* JADX INFO: renamed from: x */
    public boolean f8282x;

    /* JADX INFO: renamed from: y */
    public boolean f8283y;

    /* JADX INFO: renamed from: i */
    public void m8672i() {
        this.f8272n = 0;
        Arrays.fill(this.f8278t, true);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: j */
    public void m8673j(int i11) {
        this.f8272n = 0;
        this.f8278t[i11] = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m8674k(int i11) {
        this.f8272n = 0;
        this.f8278t[i11] = false;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m8675l() {
        this.f8272n = 2;
        for (int i11 = 0; i11 < this.f8268j.length; i11++) {
            this.f8276r[i11] = this.f8278t[i11] ? 255 : 0;
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: q */
    public final void m8680q() {
        this.f8272n = 2;
        Arrays.fill(this.f8275q, this.f8270l);
        this.f8275q[0] = 255;
        Arrays.fill(this.f8276r, this.f8270l);
        this.f8276r[0] = 255;
        Arrays.fill(this.f8278t, this.f8269k);
        this.f8278t[0] = true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8682s(float f11) {
        boolean z11 = true;
        for (int i11 = 0; i11 < this.f8268j.length; i11++) {
            boolean z12 = this.f8278t[i11];
            int i12 = z12 ? 1 : -1;
            int[] iArr = this.f8276r;
            int i13 = (int) (this.f8275q[i11] + (i12 * 255 * f11));
            iArr[i11] = i13;
            if (i13 < 0) {
                iArr[i11] = 0;
            }
            if (iArr[i11] > 255) {
                iArr[i11] = 255;
            }
            if (z12 && iArr[i11] < 255) {
                z11 = false;
            }
            if (!z12 && iArr[i11] > 0) {
                z11 = false;
            }
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[EDGE_INSN: B:33:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // com.facebook.drawee.drawable.C5574a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zM8682s;
        Drawable[] drawableArr;
        int i11 = this.f8272n;
        int i12 = 0;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                C45708h.m100898i(this.f8273o > 0);
                zM8682s = m8682s((m8676m() - this.f8274p) / this.f8273o);
                this.f8272n = zM8682s ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f8268j;
                if (i12 < drawableArr.length) {
                    break;
                }
                m8670g(canvas, drawableArr[i12], (int) Math.ceil(((double) (this.f8276r[i12] * this.f8277s)) / 255.0d));
                i12++;
            }
            if (z11) {
                invalidateSelf();
            } else {
                m8677n();
                m8679p();
            }
        }
        System.arraycopy(this.f8276r, 0, this.f8275q, 0, this.f8268j.length);
        this.f8274p = m8676m();
        zM8682s = m8682s(this.f8273o == 0 ? 1.0f : 0.0f);
        m8678o();
        this.f8272n = zM8682s ? 2 : 1;
        z11 = zM8682s;
        while (true) {
            drawableArr = this.f8268j;
            if (i12 < drawableArr.length) {
                break;
                break;
            } else {
                m8670g(canvas, drawableArr[i12], (int) Math.ceil(((double) (this.f8276r[i12] * this.f8277s)) / 255.0d));
                i12++;
            }
        }
        if (z11) {
            invalidateSelf();
        } else {
            m8677n();
            m8679p();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8669f() {
        this.f8279u++;
    }

    /* JADX INFO: renamed from: g */
    public final void m8670g(Canvas canvas, Drawable drawable, int i11) {
        if (drawable == null || i11 <= 0) {
            return;
        }
        this.f8279u++;
        if (this.f8283y) {
            drawable.mutate();
        }
        drawable.setAlpha(i11);
        this.f8279u--;
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8277s;
    }

    /* JADX INFO: renamed from: h */
    public void m8671h() {
        this.f8279u--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f8279u == 0) {
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8677n() {
        if (this.f8281w) {
            this.f8281w = false;
            InterfaceC37814g interfaceC37814g = this.f8280v;
            if (interfaceC37814g != null) {
                interfaceC37814g.m85329a();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m8678o() {
        int i11;
        if (!this.f8281w && (i11 = this.f8271m) >= 0) {
            boolean[] zArr = this.f8278t;
            if (i11 < zArr.length && zArr[i11]) {
                this.f8281w = true;
                InterfaceC37814g interfaceC37814g = this.f8280v;
                if (interfaceC37814g != null) {
                    interfaceC37814g.m85330b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m8679p() {
        if (this.f8282x && this.f8272n == 2 && this.f8278t[this.f8271m]) {
            InterfaceC37814g interfaceC37814g = this.f8280v;
            if (interfaceC37814g != null) {
                interfaceC37814g.m85331c();
            }
            this.f8282x = false;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m8681r(int i11) {
        this.f8273o = i11;
        if (this.f8272n == 1) {
            this.f8272n = 0;
        }
    }

    @Override // com.facebook.drawee.drawable.C5574a, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f8277s != i11) {
            this.f8277s = i11;
            invalidateSelf();
        }
    }

    public void setOnFadeListener(InterfaceC37814g interfaceC37814g) {
        this.f8280v = interfaceC37814g;
    }

    public C5584f(Drawable[] drawableArr, boolean z11, int i11) {
        super(drawableArr);
        this.f8283y = true;
        C45708h.m100899j(drawableArr.length >= 1, "At least one layer required!");
        this.f8268j = drawableArr;
        this.f8275q = new int[drawableArr.length];
        this.f8276r = new int[drawableArr.length];
        this.f8277s = 255;
        this.f8278t = new boolean[drawableArr.length];
        this.f8279u = 0;
        this.f8269k = z11;
        this.f8270l = z11 ? 255 : 0;
        this.f8271m = i11;
        m8680q();
    }

    /* JADX INFO: renamed from: m */
    public long m8676m() {
        return SystemClock.uptimeMillis();
    }
}
