package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import com.facebook.react.uimanager.FilterHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: OutsetBoxShadowDrawable.kt */
/* JADX INFO: loaded from: classes45.dex */
@RequiresApi(28)
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0017J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J(\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/facebook/react/uimanager/drawable/OutsetBoxShadowDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", ViewProps.SHADOW_COLOR, "", "offsetX", "", "offsetY", "blurRadius", "spread", "borderRadius", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "<init>", "(Landroid/content/Context;IFFFFLcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "shadowPaint", "Landroid/graphics/Paint;", "setAlpha", "", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "draw", "canvas", "Landroid/graphics/Canvas;", "drawShadowRoundRect", "shadowRect", "Landroid/graphics/RectF;", "spreadExtent", "computedBorderRadii", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "drawShadowRect", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOutsetBoxShadowDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutsetBoxShadowDrawable.kt\ncom/facebook/react/uimanager/drawable/OutsetBoxShadowDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
public final class OutsetBoxShadowDrawable extends Drawable {
    private final float blurRadius;

    @Nullable
    private BorderRadiusStyle borderRadius;

    @NotNull
    private final Context context;
    private final float offsetX;
    private final float offsetY;
    private final int shadowColor;

    @NotNull
    private final Paint shadowPaint;
    private final float spread;

    public /* synthetic */ OutsetBoxShadowDrawable(Context context, int i11, float f11, float f12, float f13, float f14, BorderRadiusStyle borderRadiusStyle, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i11, f11, f12, f13, f14, (i12 & 64) != 0 ? null : borderRadiusStyle);
    }

    public OutsetBoxShadowDrawable(@NotNull Context context, int i11, float f11, float f12, float f13, float f14, @Nullable BorderRadiusStyle borderRadiusStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.shadowColor = i11;
        this.offsetX = f11;
        this.offsetY = f12;
        this.blurRadius = f13;
        this.spread = f14;
        this.borderRadius = borderRadiusStyle;
        Paint paint = new Paint();
        paint.setColor(i11);
        if (f13 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(f13 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.shadowPaint = paint;
    }

    private final void drawShadowRoundRect(Canvas canvas, RectF shadowRect, float spreadExtent, ComputedBorderRadius computedBorderRadii) {
        RectF rectF = new RectF(getBounds());
        rectF.inset(0.4f, 0.4f);
        Path path = new Path();
        float[] fArr = {computedBorderRadii.getTopLeft().getHorizontal(), computedBorderRadii.getTopLeft().getVertical(), computedBorderRadii.getTopRight().getHorizontal(), computedBorderRadii.getTopRight().getVertical(), computedBorderRadii.getBottomRight().getHorizontal(), computedBorderRadii.getBottomRight().getVertical(), computedBorderRadii.getBottomLeft().getHorizontal(), computedBorderRadii.getBottomLeft().getVertical()};
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        canvas.clipOutPath(path);
        Path path2 = new Path();
        path2.addRoundRect(shadowRect, new float[]{BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getTopLeft().getHorizontal(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getTopLeft().getVertical(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getTopRight().getHorizontal(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getTopRight().getVertical(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getBottomRight().getHorizontal(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getBottomRight().getVertical(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getBottomLeft().getHorizontal(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getBottomLeft().getVertical(), spreadExtent)}, direction);
        canvas.drawPath(path2, this.shadowPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        ComputedBorderRadius computedBorderRadiusResolve;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        float fPxToDp = pixelUtil.pxToDp(getBounds().width());
        float fPxToDp2 = pixelUtil.pxToDp(getBounds().height());
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        ComputedBorderRadius computedBorderRadius = (borderRadiusStyle == null || (computedBorderRadiusResolve = borderRadiusStyle.resolve(getLayoutDirection(), this.context, fPxToDp, fPxToDp2)) == null) ? null : new ComputedBorderRadius(new CornerRadii(pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getHorizontal()), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getVertical())), new CornerRadii(pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getHorizontal()), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getVertical())), new CornerRadii(pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getHorizontal()), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getVertical())), new CornerRadii(pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getHorizontal()), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getVertical())));
        float fDpToPx = pixelUtil.dpToPx(this.spread);
        RectF rectF = new RectF(getBounds());
        float f11 = -fDpToPx;
        rectF.inset(f11, f11);
        rectF.offset(pixelUtil.dpToPx(this.offsetX), pixelUtil.dpToPx(this.offsetY));
        int iSave = canvas.save();
        if (computedBorderRadius == null || !computedBorderRadius.hasRoundedBorders()) {
            drawShadowRect(canvas, rectF);
        } else {
            drawShadowRoundRect(canvas, rectF, fDpToPx, computedBorderRadius);
        }
        canvas.restoreToCount(iSave);
    }

    @Nullable
    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        int alpha = this.shadowPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.shadowPaint.setAlpha(MathKt.roundToInt((alpha / 255.0f) * (Color.alpha(this.shadowColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public final void setBorderRadius(@Nullable BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.shadowPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private final void drawShadowRect(Canvas canvas, RectF shadowRect) {
        canvas.clipOutRect(getBounds());
        canvas.drawRect(shadowRect, this.shadowPaint);
    }
}
