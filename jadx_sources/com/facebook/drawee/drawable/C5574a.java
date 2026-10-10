package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p712w3.C45708h;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.a */
/* JADX INFO: compiled from: ArrayDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5574a extends Drawable implements Drawable.Callback, InterfaceC5583e0, InterfaceC5581d0 {

    /* JADX INFO: renamed from: b */
    public InterfaceC5583e0 f8245b;

    /* JADX INFO: renamed from: d */
    public final Drawable[] f8247d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5578c[] f8248e;

    /* JADX INFO: renamed from: c */
    public final C5580d f8246c = new C5580d();

    /* JADX INFO: renamed from: f */
    public final Rect f8249f = new Rect();

    /* JADX INFO: renamed from: g */
    public boolean f8250g = false;

    /* JADX INFO: renamed from: h */
    public boolean f8251h = false;

    /* JADX INFO: renamed from: i */
    public boolean f8252i = false;

    /* JADX INFO: renamed from: com.facebook.drawee.drawable.a$a */
    /* JADX INFO: compiled from: ArrayDrawable.java */
    public class a implements InterfaceC5578c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f8253b;

        public a(int i11) {
            this.f8253b = i11;
        }

        @Override // com.facebook.drawee.drawable.InterfaceC5578c
        public Drawable getDrawable() {
            return C5574a.this.m8653b(this.f8253b);
        }

        @Override // com.facebook.drawee.drawable.InterfaceC5578c
        public Drawable setDrawable(Drawable drawable) {
            return C5574a.this.m8656e(this.f8253b, drawable);
        }
    }

    /* JADX INFO: renamed from: b */
    public Drawable m8653b(int i11) {
        C45708h.m100891b(Boolean.valueOf(i11 >= 0));
        C45708h.m100891b(Boolean.valueOf(i11 < this.f8247d.length));
        return this.f8247d[i11];
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC5578c m8654c(int i11) {
        C45708h.m100891b(Boolean.valueOf(i11 >= 0));
        C45708h.m100891b(Boolean.valueOf(i11 < this.f8248e.length));
        InterfaceC5578c[] interfaceC5578cArr = this.f8248e;
        if (interfaceC5578cArr[i11] == null) {
            interfaceC5578cArr[i11] = m8652a(i11);
        }
        return this.f8248e[i11];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: e */
    public Drawable m8656e(int i11, Drawable drawable) {
        C45708h.m100891b(Boolean.valueOf(i11 >= 0));
        C45708h.m100891b(Boolean.valueOf(i11 < this.f8247d.length));
        Drawable drawable2 = this.f8247d[i11];
        if (drawable != drawable2) {
            if (drawable != null && this.f8252i) {
                drawable.mutate();
            }
            C5582e.m8667d(this.f8247d[i11], null, null);
            C5582e.m8667d(drawable, null, null);
            C5582e.m8668e(drawable, this.f8246c);
            C5582e.m8664a(drawable, this);
            C5582e.m8667d(drawable, this, this);
            this.f8251h = false;
            this.f8247d[i11] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i11 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i11++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i11 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i11++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i11 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f8249f;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                this.f8252i = true;
                return this;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.mutate();
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i12 >= drawableArr.length) {
                return z11;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null && drawable.setLevel(i11)) {
                z11 = true;
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                return z11;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setState(iArr)) {
                z11 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f11, float f12) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setHotspot(f11, f12);
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC5578c m8652a(int i11) {
        return new a(i11);
    }

    /* JADX INFO: renamed from: d */
    public int m8655d() {
        return this.f8247d.length;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f8247d.length == 0) {
            return -2;
        }
        int i11 = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i11++;
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5583e0
    public void getRootBounds(RectF rectF) {
        InterfaceC5583e0 interfaceC5583e0 = this.f8245b;
        if (interfaceC5583e0 != null) {
            interfaceC5583e0.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5583e0
    public void getTransform(Matrix matrix) {
        InterfaceC5583e0 interfaceC5583e0 = this.f8245b;
        if (interfaceC5583e0 != null) {
            interfaceC5583e0.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f8251h) {
            this.f8250g = false;
            int i11 = 0;
            while (true) {
                Drawable[] drawableArr = this.f8247d;
                boolean z11 = true;
                if (i11 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i11];
                boolean z12 = this.f8250g;
                if (drawable == null || !drawable.isStateful()) {
                    z11 = false;
                }
                this.f8250g = z12 | z11;
                i11++;
            }
            this.f8251h = true;
        }
        return this.f8250g;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f8246c.m8660b(i11);
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i12 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                drawable.setAlpha(i11);
            }
            i12++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8246c.m8661c(colorFilter);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f8246c.m8662d(z11);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setDither(z11);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f8246c.m8663e(z11);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setFilterBitmap(z11);
            }
            i11++;
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5581d0
    public void setTransformCallback(InterfaceC5583e0 interfaceC5583e0) {
        this.f8245b = interfaceC5583e0;
    }

    public C5574a(Drawable[] drawableArr) {
        int i11 = 0;
        C45708h.m100896g(drawableArr);
        this.f8247d = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f8247d;
            if (i11 < drawableArr2.length) {
                C5582e.m8667d(drawableArr2[i11], this, this);
                i11++;
            } else {
                this.f8248e = new InterfaceC5578c[drawableArr2.length];
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f8247d;
            if (i11 < drawableArr.length) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    drawable.setVisible(z11, z12);
                }
                i11++;
            } else {
                return visible;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
