package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import p712w3.C45708h;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.l */
/* JADX INFO: compiled from: RoundedColorDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5592l extends Drawable implements InterfaceC5590j {

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public float[] f8302d;

    /* JADX INFO: renamed from: b */
    public final float[] f8300b = new float[8];

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final float[] f8301c = new float[8];

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final Paint f8303e = new Paint(1);

    /* JADX INFO: renamed from: f */
    public boolean f8304f = false;

    /* JADX INFO: renamed from: g */
    public float f8305g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f8306h = 0.0f;

    /* JADX INFO: renamed from: i */
    public int f8307i = 0;

    /* JADX INFO: renamed from: j */
    public boolean f8308j = false;

    /* JADX INFO: renamed from: k */
    public boolean f8309k = false;

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public final Path f8310l = new Path();

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public final Path f8311m = new Path();

    /* JADX INFO: renamed from: n */
    public int f8312n = 0;

    /* JADX INFO: renamed from: o */
    public final RectF f8313o = new RectF();

    /* JADX INFO: renamed from: p */
    public int f8314p = 255;

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: c */
    public void mo8645c(float f11) {
        C45708h.m100892c(f11 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f8300b, f11);
        m8692k();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public static C5592l m8691g(ColorDrawable colorDrawable) {
        return new C5592l(colorDrawable.getColor());
    }

    /* JADX INFO: renamed from: k */
    private void m8692k() {
        float[] fArr;
        float[] fArr2;
        this.f8310l.reset();
        this.f8311m.reset();
        this.f8313o.set(getBounds());
        RectF rectF = this.f8313o;
        float f11 = this.f8305g;
        rectF.inset(f11 / 2.0f, f11 / 2.0f);
        int i11 = 0;
        if (this.f8304f) {
            this.f8311m.addCircle(this.f8313o.centerX(), this.f8313o.centerY(), Math.min(this.f8313o.width(), this.f8313o.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i12 = 0;
            while (true) {
                fArr = this.f8301c;
                if (i12 >= fArr.length) {
                    break;
                }
                fArr[i12] = (this.f8300b[i12] + this.f8306h) - (this.f8305g / 2.0f);
                i12++;
            }
            this.f8311m.addRoundRect(this.f8313o, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f8313o;
        float f12 = this.f8305g;
        rectF2.inset((-f12) / 2.0f, (-f12) / 2.0f);
        float f13 = this.f8306h + (this.f8308j ? this.f8305g : 0.0f);
        this.f8313o.inset(f13, f13);
        if (this.f8304f) {
            this.f8310l.addCircle(this.f8313o.centerX(), this.f8313o.centerY(), Math.min(this.f8313o.width(), this.f8313o.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f8308j) {
            if (this.f8302d == null) {
                this.f8302d = new float[8];
            }
            while (true) {
                fArr2 = this.f8302d;
                if (i11 >= fArr2.length) {
                    break;
                }
                fArr2[i11] = this.f8300b[i11] - this.f8305g;
                i11++;
            }
            this.f8310l.addRoundRect(this.f8313o, fArr2, Path.Direction.CW);
        } else {
            this.f8310l.addRoundRect(this.f8313o, this.f8300b, Path.Direction.CW);
        }
        float f14 = -f13;
        this.f8313o.inset(f14, f14);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: a */
    public void mo8643a(boolean z11) {
        this.f8304f = z11;
        m8692k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: b */
    public void mo8644b(float f11) {
        if (this.f8306h != f11) {
            this.f8306h = f11;
            m8692k();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f8303e.setColor(C5582e.m8666c(this.f8312n, this.f8314p));
        this.f8303e.setStyle(Paint.Style.FILL);
        this.f8303e.setFilterBitmap(m8693i());
        canvas.drawPath(this.f8310l, this.f8303e);
        if (this.f8305g != 0.0f) {
            this.f8303e.setColor(C5582e.m8666c(this.f8307i, this.f8314p));
            this.f8303e.setStyle(Paint.Style.STROKE);
            this.f8303e.setStrokeWidth(this.f8305g);
            canvas.drawPath(this.f8311m, this.f8303e);
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: e */
    public void mo8647e(boolean z11) {
        if (this.f8309k != z11) {
            this.f8309k = z11;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: f */
    public void mo8648f(boolean z11) {
        if (this.f8308j != z11) {
            this.f8308j = z11;
            m8692k();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8314p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C5582e.m8665b(C5582e.m8666c(this.f8312n, this.f8314p));
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: h */
    public void mo8649h(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f8300b, 0.0f);
        } else {
            C45708h.m100892c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f8300b, 0, 8);
        }
        m8692k();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public boolean m8693i() {
        return this.f8309k;
    }

    /* JADX INFO: renamed from: j */
    public void m8694j(int i11) {
        if (this.f8312n != i11) {
            this.f8312n = i11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f8314p) {
            this.f8314p = i11;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    public void setBorder(int i11, float f11) {
        if (this.f8307i != i11) {
            this.f8307i = i11;
            invalidateSelf();
        }
        if (this.f8305g != f11) {
            this.f8305g = f11;
            m8692k();
            invalidateSelf();
        }
    }

    public C5592l(int i11) {
        m8694j(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m8692k();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: d */
    public void mo8646d(boolean z11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
