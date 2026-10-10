package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import p712w3.C45706f;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.o */
/* JADX INFO: compiled from: ScaleTypeDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5595o extends C5586g {

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public InterfaceC5597q f8344b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public Object f8345c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public PointF f8346d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public int f8347e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public int f8348f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public Matrix f8349g;

    /* JADX INFO: renamed from: h */
    public Matrix f8350h;

    /* JADX INFO: renamed from: j */
    private void m8699j() {
        InterfaceC5597q interfaceC5597q = this.f8344b;
        boolean z11 = false;
        if (interfaceC5597q instanceof InterfaceC5579c0) {
            Object state = ((InterfaceC5579c0) interfaceC5597q).getState();
            z11 = state == null || !state.equals(this.f8345c);
            this.f8345c = state;
        }
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f8347e == current.getIntrinsicWidth() && this.f8348f == current.getIntrinsicHeight() && !z11) {
            return;
        }
        m8700i();
    }

    /* JADX INFO: renamed from: k */
    public PointF m8701k() {
        return this.f8346d;
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC5597q m8702l() {
        return this.f8344b;
    }

    /* JADX INFO: renamed from: m */
    public void m8703m(PointF pointF) {
        if (C45706f.m100883a(this.f8346d, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f8346d = null;
        } else {
            if (this.f8346d == null) {
                this.f8346d = new PointF();
            }
            this.f8346d.set(pointF);
        }
        m8700i();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: n */
    public void m8704n(InterfaceC5597q interfaceC5597q) {
        if (C45706f.m100883a(this.f8344b, interfaceC5597q)) {
            return;
        }
        this.f8344b = interfaceC5597q;
        this.f8345c = null;
        m8700i();
        invalidateSelf();
    }

    public C5595o(Drawable drawable, InterfaceC5597q interfaceC5597q) {
        super(drawable);
        this.f8346d = null;
        this.f8347e = 0;
        this.f8348f = 0;
        this.f8350h = new Matrix();
        this.f8344b = interfaceC5597q;
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m8699j();
        if (this.f8349g != null) {
            int iSave = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f8349g);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.C5586g, com.facebook.drawee.drawable.InterfaceC5583e0
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        m8699j();
        Matrix matrix2 = this.f8349g;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public void m8700i() {
        float f11;
        Drawable current = getCurrent();
        if (current == null) {
            this.f8348f = 0;
            this.f8347e = 0;
            this.f8349g = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f8347e = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f8348f = intrinsicHeight;
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
                current.setBounds(bounds);
                this.f8349g = null;
                return;
            }
            if (this.f8344b == InterfaceC5597q.f8351a) {
                current.setBounds(bounds);
                this.f8349g = null;
                return;
            }
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f8350h.reset();
            InterfaceC5597q interfaceC5597q = this.f8344b;
            Matrix matrix = this.f8350h;
            PointF pointF = this.f8346d;
            float f12 = 0.5f;
            if (pointF != null) {
                f11 = pointF.x;
            } else {
                f11 = 0.5f;
            }
            if (pointF != null) {
                f12 = pointF.y;
            }
            interfaceC5597q.getTransform(matrix, bounds, intrinsicWidth, intrinsicHeight, f11, f12);
            this.f8349g = this.f8350h;
            return;
        }
        current.setBounds(bounds);
        this.f8349g = null;
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        m8700i();
    }

    @Override // com.facebook.drawee.drawable.C5586g
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m8700i();
        return current;
    }
}
