package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import p712w3.C45708h;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.b */
/* JADX INFO: compiled from: AutoRotateDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC5576b extends C5586g implements Runnable {

    /* JADX INFO: renamed from: b */
    public int f8256b;

    /* JADX INFO: renamed from: c */
    public boolean f8257c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public float f8258d;

    /* JADX INFO: renamed from: e */
    public boolean f8259e;

    public RunnableC5576b(Drawable drawable, int i11) {
        this(drawable, i11, true);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8259e = false;
        this.f8258d += m8657i();
        invalidateSelf();
    }

    public RunnableC5576b(Drawable drawable, int i11, boolean z11) {
        super((Drawable) C45708h.m100896g(drawable));
        this.f8258d = 0.0f;
        this.f8259e = false;
        this.f8256b = i11;
        this.f8257c = z11;
    }

    /* JADX INFO: renamed from: i */
    public final int m8657i() {
        return (int) ((20.0f / this.f8256b) * 360.0f);
    }

    /* JADX INFO: renamed from: j */
    public final void m8658j() {
        if (this.f8259e) {
            return;
        }
        this.f8259e = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i11 = bounds.right;
        int i12 = bounds.left;
        int i13 = i11 - i12;
        int i14 = bounds.bottom;
        int i15 = bounds.top;
        int i16 = i14 - i15;
        float f11 = this.f8258d;
        if (!this.f8257c) {
            f11 = 360.0f - f11;
        }
        canvas.rotate(f11, i12 + (i13 / 2), i15 + (i16 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        m8658j();
    }
}
