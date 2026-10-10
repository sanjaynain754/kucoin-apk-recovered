package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import p712w3.C45708h;

/* JADX INFO: loaded from: classes34.dex */
public class RoundedCornersDrawable extends C5586g implements InterfaceC5590j {

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public Type f8226b;

    /* JADX INFO: renamed from: c */
    public final RectF f8227c;

    /* JADX INFO: renamed from: d */
    public RectF f8228d;

    /* JADX INFO: renamed from: e */
    public Matrix f8229e;

    /* JADX INFO: renamed from: f */
    public final float[] f8230f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public final float[] f8231g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public final Paint f8232h;

    /* JADX INFO: renamed from: i */
    public boolean f8233i;

    /* JADX INFO: renamed from: j */
    public float f8234j;

    /* JADX INFO: renamed from: k */
    public int f8235k;

    /* JADX INFO: renamed from: l */
    public int f8236l;

    /* JADX INFO: renamed from: m */
    public float f8237m;

    /* JADX INFO: renamed from: n */
    public boolean f8238n;

    /* JADX INFO: renamed from: o */
    public boolean f8239o;

    /* JADX INFO: renamed from: p */
    public final Path f8240p;

    /* JADX INFO: renamed from: q */
    public final Path f8241q;

    /* JADX INFO: renamed from: r */
    public final RectF f8242r;

    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* JADX INFO: renamed from: com.facebook.drawee.drawable.RoundedCornersDrawable$a */
    public static /* synthetic */ class C5573a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8244a;

        static {
            int[] iArr = new int[Type.values().length];
            f8244a = iArr;
            try {
                iArr[Type.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8244a[Type.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m8642k() {
        float[] fArr;
        this.f8240p.reset();
        this.f8241q.reset();
        this.f8242r.set(getBounds());
        RectF rectF = this.f8242r;
        float f11 = this.f8237m;
        rectF.inset(f11, f11);
        if (this.f8226b == Type.OVERLAY_COLOR) {
            this.f8240p.addRect(this.f8242r, Path.Direction.CW);
        }
        if (this.f8233i) {
            this.f8240p.addCircle(this.f8242r.centerX(), this.f8242r.centerY(), Math.min(this.f8242r.width(), this.f8242r.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f8240p.addRoundRect(this.f8242r, this.f8230f, Path.Direction.CW);
        }
        RectF rectF2 = this.f8242r;
        float f12 = this.f8237m;
        rectF2.inset(-f12, -f12);
        RectF rectF3 = this.f8242r;
        float f13 = this.f8234j;
        rectF3.inset(f13 / 2.0f, f13 / 2.0f);
        if (this.f8233i) {
            this.f8241q.addCircle(this.f8242r.centerX(), this.f8242r.centerY(), Math.min(this.f8242r.width(), this.f8242r.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.f8231g;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.f8230f[i11] + this.f8237m) - (this.f8234j / 2.0f);
                i11++;
            }
            this.f8241q.addRoundRect(this.f8242r, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f8242r;
        float f14 = this.f8234j;
        rectF4.inset((-f14) / 2.0f, (-f14) / 2.0f);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: a */
    public void mo8643a(boolean z11) {
        this.f8233i = z11;
        m8642k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: b */
    public void mo8644b(float f11) {
        this.f8237m = f11;
        m8642k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: c */
    public void mo8645c(float f11) {
        Arrays.fill(this.f8230f, f11);
        m8642k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f8227c.set(getBounds());
        int i11 = C5573a.f8244a[this.f8226b.ordinal()];
        if (i11 == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f8240p);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i11 == 2) {
            if (this.f8238n) {
                RectF rectF = this.f8228d;
                if (rectF == null) {
                    this.f8228d = new RectF(this.f8227c);
                    this.f8229e = new Matrix();
                } else {
                    rectF.set(this.f8227c);
                }
                RectF rectF2 = this.f8228d;
                float f11 = this.f8234j;
                rectF2.inset(f11, f11);
                Matrix matrix = this.f8229e;
                if (matrix != null) {
                    matrix.setRectToRect(this.f8227c, this.f8228d, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f8227c);
                canvas.concat(this.f8229e);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f8232h.setStyle(Paint.Style.FILL);
            this.f8232h.setColor(this.f8236l);
            this.f8232h.setStrokeWidth(0.0f);
            this.f8232h.setFilterBitmap(m8650i());
            this.f8240p.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f8240p, this.f8232h);
            if (this.f8233i) {
                float fWidth = ((this.f8227c.width() - this.f8227c.height()) + this.f8234j) / 2.0f;
                float fHeight = ((this.f8227c.height() - this.f8227c.width()) + this.f8234j) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f8227c;
                    float f12 = rectF3.left;
                    canvas.drawRect(f12, rectF3.top, f12 + fWidth, rectF3.bottom, this.f8232h);
                    RectF rectF4 = this.f8227c;
                    float f13 = rectF4.right;
                    canvas.drawRect(f13 - fWidth, rectF4.top, f13, rectF4.bottom, this.f8232h);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f8227c;
                    float f14 = rectF5.left;
                    float f15 = rectF5.top;
                    canvas.drawRect(f14, f15, rectF5.right, f15 + fHeight, this.f8232h);
                    RectF rectF6 = this.f8227c;
                    float f16 = rectF6.left;
                    float f17 = rectF6.bottom;
                    canvas.drawRect(f16, f17 - fHeight, rectF6.right, f17, this.f8232h);
                }
            }
        }
        if (this.f8235k != 0) {
            this.f8232h.setStyle(Paint.Style.STROKE);
            this.f8232h.setColor(this.f8235k);
            this.f8232h.setStrokeWidth(this.f8234j);
            this.f8240p.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f8241q, this.f8232h);
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: e */
    public void mo8647e(boolean z11) {
        if (this.f8239o != z11) {
            this.f8239o = z11;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: f */
    public void mo8648f(boolean z11) {
        this.f8238n = z11;
        m8642k();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: h */
    public void mo8649h(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f8230f, 0.0f);
        } else {
            C45708h.m100892c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f8230f, 0, 8);
        }
        m8642k();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public boolean m8650i() {
        return this.f8239o;
    }

    /* JADX INFO: renamed from: j */
    public void m8651j(int i11) {
        this.f8236l = i11;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    public void setBorder(int i11, float f11) {
        this.f8235k = i11;
        this.f8234j = f11;
        m8642k();
        invalidateSelf();
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) C45708h.m100896g(drawable));
        this.f8226b = Type.OVERLAY_COLOR;
        this.f8227c = new RectF();
        this.f8230f = new float[8];
        this.f8231g = new float[8];
        this.f8232h = new Paint(1);
        this.f8233i = false;
        this.f8234j = 0.0f;
        this.f8235k = 0;
        this.f8236l = 0;
        this.f8237m = 0.0f;
        this.f8238n = false;
        this.f8239o = false;
        this.f8240p = new Path();
        this.f8241q = new Path();
        this.f8242r = new RectF();
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m8642k();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: d */
    public void mo8646d(boolean z11) {
    }
}
