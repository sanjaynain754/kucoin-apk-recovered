package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.i */
/* JADX INFO: compiled from: OrientedDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5589i extends C5586g {

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final Matrix f8288b;

    /* JADX INFO: renamed from: c */
    public int f8289c;

    /* JADX INFO: renamed from: d */
    public int f8290d;

    /* JADX INFO: renamed from: e */
    public final Matrix f8291e;

    /* JADX INFO: renamed from: f */
    public final RectF f8292f;

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11;
        if (this.f8289c <= 0 && ((i11 = this.f8290d) == 0 || i11 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f8288b);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i11 = this.f8290d;
        return (i11 == 5 || i11 == 7 || this.f8289c % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i11 = this.f8290d;
        return (i11 == 5 || i11 == 7 || this.f8289c % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    public C5589i(Drawable drawable, int i11, int i12) {
        super(drawable);
        this.f8291e = new Matrix();
        this.f8292f = new RectF();
        this.f8288b = new Matrix();
        this.f8289c = i11 - (i11 % 90);
        this.f8290d = (i12 < 0 || i12 > 8) ? 0 : i12;
    }

    @Override // com.facebook.drawee.drawable.C5586g, com.facebook.drawee.drawable.InterfaceC5583e0
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        if (!this.f8288b.isIdentity()) {
            matrix.preConcat(this.f8288b);
        }
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i11;
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i12 = this.f8289c;
        if (i12 <= 0 && ((i11 = this.f8290d) == 0 || i11 == 1)) {
            current.setBounds(rect);
            return;
        }
        int i13 = this.f8290d;
        if (i13 != 2) {
            if (i13 != 7) {
                if (i13 != 4) {
                    if (i13 != 5) {
                        this.f8288b.setRotate(i12, rect.centerX(), rect.centerY());
                    } else {
                        this.f8288b.setRotate(270.0f, rect.centerX(), rect.centerY());
                        this.f8288b.postScale(1.0f, -1.0f);
                    }
                } else {
                    this.f8288b.setScale(1.0f, -1.0f);
                }
            } else {
                this.f8288b.setRotate(270.0f, rect.centerX(), rect.centerY());
                this.f8288b.postScale(-1.0f, 1.0f);
            }
        } else {
            this.f8288b.setScale(-1.0f, 1.0f);
        }
        this.f8291e.reset();
        this.f8288b.invert(this.f8291e);
        this.f8292f.set(rect);
        this.f8291e.mapRect(this.f8292f);
        RectF rectF = this.f8292f;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
