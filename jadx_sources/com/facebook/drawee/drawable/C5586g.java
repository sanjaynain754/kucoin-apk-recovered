package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.g */
/* JADX INFO: compiled from: ForwardingDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5586g extends Drawable implements Drawable.Callback, InterfaceC5583e0, InterfaceC5581d0, InterfaceC5578c {
    private static final Matrix sTempTransform = new Matrix();
    private Drawable mCurrentDelegate;
    private final C5580d mDrawableProperties = new C5580d();
    protected InterfaceC5583e0 mTransformCallback;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.mCurrentDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    public void getParentTransform(Matrix matrix) {
        InterfaceC5583e0 interfaceC5583e0 = this.mTransformCallback;
        if (interfaceC5583e0 != null) {
            interfaceC5583e0.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5583e0
    public void getRootBounds(RectF rectF) {
        InterfaceC5583e0 interfaceC5583e0 = this.mTransformCallback;
        if (interfaceC5583e0 != null) {
            interfaceC5583e0.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void getTransformedBounds(RectF rectF) {
        Matrix matrix = sTempTransform;
        getParentTransform(matrix);
        rectF.set(getBounds());
        matrix.mapRect(rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.onLevelChange(i11) : drawable.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.mDrawableProperties.m8660b(i11);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawableProperties.m8661c(colorFilter);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public Drawable setCurrentWithoutInvalidate(Drawable drawable) {
        Drawable drawable2 = this.mCurrentDelegate;
        C5582e.m8667d(drawable2, null, null);
        C5582e.m8667d(drawable, null, null);
        C5582e.m8668e(drawable, this.mDrawableProperties);
        C5582e.m8664a(drawable, this);
        C5582e.m8667d(drawable, this, this);
        this.mCurrentDelegate = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.mDrawableProperties.m8662d(z11);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setDither(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.mDrawableProperties.m8663e(z11);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setFilterBitmap(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f11, float f12) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setHotspot(f11, f12);
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5581d0
    public void setTransformCallback(InterfaceC5583e0 interfaceC5583e0) {
        this.mTransformCallback = interfaceC5583e0;
    }

    public C5586g(Drawable drawable) {
        this.mCurrentDelegate = drawable;
        C5582e.m8667d(drawable, this, this);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5578c
    public Drawable getDrawable() {
        return getCurrent();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5583e0
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    public Drawable setCurrent(Drawable drawable) {
        Drawable currentWithoutInvalidate = setCurrentWithoutInvalidate(drawable);
        invalidateSelf();
        return currentWithoutInvalidate;
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5578c
    public Drawable setDrawable(Drawable drawable) {
        return setCurrent(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
