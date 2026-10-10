package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import p192d6.C36621b;
import p712w3.C45708h;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.m */
/* JADX INFO: compiled from: RoundedDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC5593m extends Drawable implements InterfaceC5590j, InterfaceC5581d0 {

    /* JADX INFO: renamed from: D */
    @Nullable
    public InterfaceC5583e0 f8318D;

    /* JADX INFO: renamed from: b */
    public final Drawable f8319b;

    /* JADX INFO: renamed from: l */
    @Nullable
    @VisibleForTesting
    public float[] f8329l;

    /* JADX INFO: renamed from: q */
    @Nullable
    @VisibleForTesting
    public RectF f8334q;

    /* JADX INFO: renamed from: w */
    @Nullable
    @VisibleForTesting
    public Matrix f8340w;

    /* JADX INFO: renamed from: x */
    @Nullable
    @VisibleForTesting
    public Matrix f8341x;

    /* JADX INFO: renamed from: c */
    public boolean f8320c = false;

    /* JADX INFO: renamed from: d */
    public boolean f8321d = false;

    /* JADX INFO: renamed from: e */
    public float f8322e = 0.0f;

    /* JADX INFO: renamed from: f */
    public final Path f8323f = new Path();

    /* JADX INFO: renamed from: g */
    public boolean f8324g = true;

    /* JADX INFO: renamed from: h */
    public int f8325h = 0;

    /* JADX INFO: renamed from: i */
    public final Path f8326i = new Path();

    /* JADX INFO: renamed from: j */
    public final float[] f8327j = new float[8];

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public final float[] f8328k = new float[8];

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public final RectF f8330m = new RectF();

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public final RectF f8331n = new RectF();

    /* JADX INFO: renamed from: o */
    @VisibleForTesting
    public final RectF f8332o = new RectF();

    /* JADX INFO: renamed from: p */
    @VisibleForTesting
    public final RectF f8333p = new RectF();

    /* JADX INFO: renamed from: r */
    @VisibleForTesting
    public final Matrix f8335r = new Matrix();

    /* JADX INFO: renamed from: s */
    @VisibleForTesting
    public final Matrix f8336s = new Matrix();

    /* JADX INFO: renamed from: t */
    @VisibleForTesting
    public final Matrix f8337t = new Matrix();

    /* JADX INFO: renamed from: u */
    @VisibleForTesting
    public final Matrix f8338u = new Matrix();

    /* JADX INFO: renamed from: v */
    @VisibleForTesting
    public final Matrix f8339v = new Matrix();

    /* JADX INFO: renamed from: y */
    @VisibleForTesting
    public final Matrix f8342y = new Matrix();

    /* JADX INFO: renamed from: z */
    public float f8343z = 0.0f;

    /* JADX INFO: renamed from: A */
    public boolean f8315A = false;

    /* JADX INFO: renamed from: B */
    public boolean f8316B = false;

    /* JADX INFO: renamed from: C */
    public boolean f8317C = true;

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: c */
    public void mo8645c(float f11) {
        C45708h.m100898i(f11 >= 0.0f);
        Arrays.fill(this.f8327j, f11);
        this.f8321d = f11 != 0.0f;
        this.f8317C = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: h */
    public void mo8649h(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f8327j, 0.0f);
            this.f8321d = false;
        } else {
            C45708h.m100892c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f8327j, 0, 8);
            this.f8321d = false;
            for (int i11 = 0; i11 < 8; i11++) {
                this.f8321d |= fArr[i11] > 0.0f;
            }
        }
        this.f8317C = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i11, PorterDuff.Mode mode) {
        this.f8319b.setColorFilter(i11, mode);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static Matrix m8695g(@Nullable Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m8696j(@Nullable Matrix matrix, @Nullable Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: a */
    public void mo8643a(boolean z11) {
        this.f8320c = z11;
        this.f8317C = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: b */
    public void mo8644b(float f11) {
        if (this.f8343z != f11) {
            this.f8343z = f11;
            this.f8317C = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f8319b.clearColorFilter();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: e */
    public void mo8647e(boolean z11) {
        if (this.f8316B != z11) {
            this.f8316B = z11;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: f */
    public void mo8648f(boolean z11) {
        if (this.f8315A != z11) {
            this.f8315A = z11;
            this.f8317C = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
        return this.f8319b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        return this.f8319b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8319b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8319b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f8319b.getOpacity();
    }

    /* JADX INFO: renamed from: i */
    public boolean m8697i() {
        return this.f8316B;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public boolean mo8688k() {
        return this.f8320c || this.f8321d || this.f8322e > 0.0f;
    }

    /* JADX INFO: renamed from: l */
    public void m8698l() {
        float[] fArr;
        if (this.f8317C) {
            this.f8326i.reset();
            RectF rectF = this.f8330m;
            float f11 = this.f8322e;
            rectF.inset(f11 / 2.0f, f11 / 2.0f);
            if (this.f8320c) {
                this.f8326i.addCircle(this.f8330m.centerX(), this.f8330m.centerY(), Math.min(this.f8330m.width(), this.f8330m.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i11 = 0;
                while (true) {
                    fArr = this.f8328k;
                    if (i11 >= fArr.length) {
                        break;
                    }
                    fArr[i11] = (this.f8327j[i11] + this.f8343z) - (this.f8322e / 2.0f);
                    i11++;
                }
                this.f8326i.addRoundRect(this.f8330m, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f8330m;
            float f12 = this.f8322e;
            rectF2.inset((-f12) / 2.0f, (-f12) / 2.0f);
            this.f8323f.reset();
            float f13 = this.f8343z + (this.f8315A ? this.f8322e : 0.0f);
            this.f8330m.inset(f13, f13);
            if (this.f8320c) {
                this.f8323f.addCircle(this.f8330m.centerX(), this.f8330m.centerY(), Math.min(this.f8330m.width(), this.f8330m.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f8315A) {
                if (this.f8329l == null) {
                    this.f8329l = new float[8];
                }
                for (int i12 = 0; i12 < this.f8328k.length; i12++) {
                    this.f8329l[i12] = this.f8327j[i12] - this.f8322e;
                }
                this.f8323f.addRoundRect(this.f8330m, this.f8329l, Path.Direction.CW);
            } else {
                this.f8323f.addRoundRect(this.f8330m, this.f8327j, Path.Direction.CW);
            }
            float f14 = -f13;
            this.f8330m.inset(f14, f14);
            this.f8323f.setFillType(Path.FillType.WINDING);
            this.f8317C = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo8689m() {
        Matrix matrix;
        Matrix matrix2;
        InterfaceC5583e0 interfaceC5583e0 = this.f8318D;
        if (interfaceC5583e0 != null) {
            interfaceC5583e0.getTransform(this.f8337t);
            this.f8318D.getRootBounds(this.f8330m);
        } else {
            this.f8337t.reset();
            this.f8330m.set(getBounds());
        }
        this.f8332o.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f8333p.set(this.f8319b.getBounds());
        Matrix matrix3 = this.f8335r;
        RectF rectF = this.f8332o;
        RectF rectF2 = this.f8333p;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f8315A) {
            RectF rectF3 = this.f8334q;
            if (rectF3 == null) {
                this.f8334q = new RectF(this.f8330m);
            } else {
                rectF3.set(this.f8330m);
            }
            RectF rectF4 = this.f8334q;
            float f11 = this.f8322e;
            rectF4.inset(f11, f11);
            if (this.f8340w == null) {
                this.f8340w = new Matrix();
            }
            this.f8340w.setRectToRect(this.f8330m, this.f8334q, scaleToFit);
        } else {
            Matrix matrix4 = this.f8340w;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.f8337t.equals(this.f8338u) || !this.f8335r.equals(this.f8336s) || ((matrix2 = this.f8340w) != null && !m8696j(matrix2, this.f8341x))) {
            this.f8324g = true;
            this.f8337t.invert(this.f8339v);
            this.f8342y.set(this.f8337t);
            if (this.f8315A && (matrix = this.f8340w) != null) {
                this.f8342y.postConcat(matrix);
            }
            this.f8342y.preConcat(this.f8335r);
            this.f8338u.set(this.f8337t);
            this.f8336s.set(this.f8335r);
            if (this.f8315A) {
                Matrix matrix5 = this.f8341x;
                if (matrix5 == null) {
                    this.f8341x = m8695g(this.f8340w);
                } else {
                    matrix5.set(this.f8340w);
                }
            } else {
                Matrix matrix6 = this.f8341x;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (this.f8330m.equals(this.f8331n)) {
            return;
        }
        this.f8317C = true;
        this.f8331n.set(this.f8330m);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f8319b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f8319b.setAlpha(i11);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    public void setBorder(int i11, float f11) {
        if (this.f8325h == i11 && this.f8322e == f11) {
            return;
        }
        this.f8325h = i11;
        this.f8322e = f11;
        this.f8317C = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f8319b.setColorFilter(colorFilter);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5581d0
    public void setTransformCallback(@Nullable InterfaceC5583e0 interfaceC5583e0) {
        this.f8318D = interfaceC5583e0;
    }

    public AbstractC5593m(Drawable drawable) {
        this.f8319b = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C36621b.m81959d()) {
            C36621b.m81957a("RoundedDrawable#draw");
        }
        this.f8319b.draw(canvas);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo8646d(boolean z11) {
    }
}
