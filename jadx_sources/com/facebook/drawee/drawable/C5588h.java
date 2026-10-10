package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.h */
/* JADX INFO: compiled from: MatrixDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5588h extends C5586g {

    /* JADX INFO: renamed from: b */
    public Matrix f8284b;

    /* JADX INFO: renamed from: c */
    public Matrix f8285c;

    /* JADX INFO: renamed from: d */
    public int f8286d;

    /* JADX INFO: renamed from: e */
    public int f8287e;

    /* JADX INFO: renamed from: i */
    private void m8685i() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f8286d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f8287e = intrinsicHeight;
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f8285c = this.f8284b;
        } else {
            current.setBounds(bounds);
            this.f8285c = null;
        }
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m8686j();
        if (this.f8285c != null) {
            int iSave = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f8285c);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.C5586g, com.facebook.drawee.drawable.InterfaceC5583e0
    public void getTransform(Matrix matrix) {
        super.getTransform(matrix);
        Matrix matrix2 = this.f8285c;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8686j() {
        Drawable current = getCurrent();
        if (current != null) {
            if (this.f8286d == current.getIntrinsicWidth() && this.f8287e == current.getIntrinsicHeight()) {
                return;
            }
            m8685i();
        }
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m8685i();
    }

    @Override // com.facebook.drawee.drawable.C5586g
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m8685i();
        return current;
    }
}
