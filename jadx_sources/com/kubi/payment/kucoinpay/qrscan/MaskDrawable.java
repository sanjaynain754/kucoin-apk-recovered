package com.kubi.payment.kucoinpay.qrscan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.kucoinpay.qrscan.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MaskDrawable.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/qrscan/MaskDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "holeRect", "Landroid/graphics/Rect;", "cornerRadius", "", "<init>", "(Landroid/content/Context;Landroid/graphics/Rect;F)V", "maskPaint", "Landroid/graphics/Paint;", "holePaint", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MaskDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f39624a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Rect f39625b;

    /* JADX INFO: renamed from: c */
    public final float f39626c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Paint f39627d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Paint f39628e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Path f39629f;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public MaskDrawable(@NotNull Context context, @NotNull Rect holeRect, float f11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(holeRect, "holeRect");
        this.f39624a = context;
        this.f39625b = holeRect;
        this.f39626c = f11;
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(context, R$color.c_60_black));
        paint.setAntiAlias(true);
        this.f39627d = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f39628e = paint2;
        Path path = new Path();
        path.addRoundRect(new RectF(holeRect), f11, f11, Path.Direction.CW);
        this.f39629f = path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSaveLayer = canvas.saveLayer(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, null);
        canvas.drawRect(getBounds(), this.f39627d);
        canvas.drawPath(this.f39629f, this.f39628e);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f39627d.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f39627d.setColorFilter(colorFilter);
    }
}
