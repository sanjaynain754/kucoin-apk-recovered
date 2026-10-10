package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FadeThroughDrawable extends Drawable {
    private final float[] alphas;
    private final Drawable fadeInDrawable;
    private final Drawable fadeOutDrawable;
    private float progress;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.fadeOutDrawable.draw(canvas);
        this.fadeInDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.fadeOutDrawable.getIntrinsicHeight(), this.fadeInDrawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.fadeOutDrawable.getIntrinsicWidth(), this.fadeInDrawable.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.fadeOutDrawable.getMinimumHeight(), this.fadeInDrawable.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.fadeOutDrawable.getMinimumWidth(), this.fadeInDrawable.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.fadeOutDrawable.isStateful() || this.fadeInDrawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.progress <= 0.5f) {
            this.fadeOutDrawable.setAlpha(i11);
            this.fadeInDrawable.setAlpha(0);
        } else {
            this.fadeOutDrawable.setAlpha(0);
            this.fadeInDrawable.setAlpha(i11);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.fadeOutDrawable.setColorFilter(colorFilter);
        this.fadeInDrawable.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        if (this.progress != f11) {
            this.progress = f11;
            FadeThroughUtils.calculateFadeOutAndInAlphas(f11, this.alphas);
            this.fadeOutDrawable.setAlpha((int) (this.alphas[0] * 255.0f));
            this.fadeInDrawable.setAlpha((int) (this.alphas[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.fadeOutDrawable.setState(iArr) || this.fadeInDrawable.setState(iArr);
    }

    public FadeThroughDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        Drawable emptyDrawable;
        Drawable emptyDrawable2;
        int layoutDirection;
        if (drawable != null) {
            emptyDrawable = drawable.getConstantState().newDrawable().mutate();
        } else {
            emptyDrawable = new EmptyDrawable();
        }
        this.fadeOutDrawable = emptyDrawable;
        if (drawable2 != null) {
            emptyDrawable2 = drawable2.getConstantState().newDrawable().mutate();
        } else {
            emptyDrawable2 = new EmptyDrawable();
        }
        this.fadeInDrawable = emptyDrawable2;
        if (drawable != null) {
            layoutDirection = DrawableCompat.getLayoutDirection(drawable);
        } else {
            layoutDirection = 3;
        }
        int layoutDirection2 = drawable2 != null ? DrawableCompat.getLayoutDirection(drawable2) : 3;
        DrawableCompat.setLayoutDirection(emptyDrawable, layoutDirection);
        DrawableCompat.setLayoutDirection(emptyDrawable2, layoutDirection2);
        emptyDrawable2.setAlpha(0);
        this.alphas = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        this.fadeOutDrawable.setBounds(i11, i12, i13, i14);
        this.fadeInDrawable.setBounds(i11, i12, i13, i14);
    }

    public static class EmptyDrawable extends Drawable {
        private EmptyDrawable() {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i11) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }
}
