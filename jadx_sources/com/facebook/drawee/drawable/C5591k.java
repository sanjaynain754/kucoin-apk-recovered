package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import p192d6.C36621b;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.k */
/* JADX INFO: compiled from: RoundedBitmapDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5591k extends AbstractC5593m {

    /* JADX INFO: renamed from: K */
    public static boolean f8293K;

    /* JADX INFO: renamed from: E */
    public final Paint f8294E;

    /* JADX INFO: renamed from: F */
    public final Paint f8295F;

    /* JADX INFO: renamed from: G */
    public final Bitmap f8296G;

    /* JADX INFO: renamed from: H */
    public WeakReference<Bitmap> f8297H;

    /* JADX INFO: renamed from: I */
    public boolean f8298I;

    /* JADX INFO: renamed from: J */
    public RectF f8299J;

    public C5591k(Resources resources, Bitmap bitmap, Paint paint, boolean z11) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f8294E = paint2;
        Paint paint3 = new Paint(1);
        this.f8295F = paint3;
        this.f8299J = null;
        this.f8296G = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f8298I = z11;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m8687n() {
        return f8293K;
    }

    @Override // com.facebook.drawee.drawable.AbstractC5593m, com.facebook.drawee.drawable.InterfaceC5590j
    /* JADX INFO: renamed from: d */
    public void mo8646d(boolean z11) {
        this.f8298I = z11;
    }

    /* JADX INFO: renamed from: o */
    public final void m8690o() {
        Shader shader;
        WeakReference<Bitmap> weakReference = this.f8297H;
        if (weakReference == null || weakReference.get() != this.f8296G) {
            this.f8297H = new WeakReference<>(this.f8296G);
            if (this.f8296G != null) {
                Paint paint = this.f8294E;
                Bitmap bitmap = this.f8296G;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f8324g = true;
            }
        }
        if (this.f8324g && (shader = this.f8294E.getShader()) != null) {
            shader.setLocalMatrix(this.f8342y);
            this.f8324g = false;
        }
        this.f8294E.setFilterBitmap(m8697i());
    }

    @Override // com.facebook.drawee.drawable.AbstractC5593m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C36621b.m81959d()) {
            C36621b.m81957a("RoundedBitmapDrawable#draw");
        }
        if (!mo8688k()) {
            super.draw(canvas);
            if (C36621b.m81959d()) {
                C36621b.m81958b();
                return;
            }
            return;
        }
        mo8689m();
        m8698l();
        m8690o();
        int iSave = canvas.save();
        canvas.concat(this.f8339v);
        if (!this.f8298I && this.f8299J != null) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f8299J);
            canvas.drawPath(this.f8323f, this.f8294E);
            canvas.restoreToCount(iSave2);
        } else {
            canvas.drawPath(this.f8323f, this.f8294E);
        }
        float f11 = this.f8322e;
        if (f11 > 0.0f) {
            this.f8295F.setStrokeWidth(f11);
            this.f8295F.setColor(C5582e.m8666c(this.f8325h, this.f8294E.getAlpha()));
            canvas.drawPath(this.f8326i, this.f8295F);
        }
        canvas.restoreToCount(iSave);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC5593m
    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public boolean mo8688k() {
        if (super.mo8688k() && this.f8296G != null) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.drawee.drawable.AbstractC5593m
    /* JADX INFO: renamed from: m */
    public void mo8689m() {
        super.mo8689m();
        if (!this.f8298I) {
            if (this.f8299J == null) {
                this.f8299J = new RectF();
            }
            this.f8342y.mapRect(this.f8299J, this.f8332o);
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC5593m, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        super.setAlpha(i11);
        if (i11 != this.f8294E.getAlpha()) {
            this.f8294E.setAlpha(i11);
            super.setAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC5593m, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f8294E.setColorFilter(colorFilter);
    }
}
