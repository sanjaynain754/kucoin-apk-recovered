package com.kubi.kumex.utils;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.utils.h0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RotateDrawable.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/utils/RotateDrawable;", "Landroid/graphics/drawable/Drawable;", "drawable", "degrees", "", "<init>", "(Landroid/graphics/drawable/Drawable;F)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "", "getOpacity", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getMinimumWidth", "getMinimumHeight", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RotateDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Drawable f30800a;

    /* JADX INFO: renamed from: b */
    public final float f30801b;

    public RotateDrawable(@NotNull Drawable drawable, float f11) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f30800a = drawable;
        this.f30801b = f11;
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.rotate(this.f30801b, (getBounds().right - getBounds().left) / 2.0f, (getBounds().bottom - getBounds().top) / 2.0f);
        this.f30800a.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f30800a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f30800a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30800a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f30800a.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f30800a.setColorFilter(colorFilter);
    }
}
