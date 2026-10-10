package com.sumsub.sns.core.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.uimanager.ViewProps;
import com.sumsub.sns.R$id;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J(\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0016\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSFrameDrawable;", "Landroid/graphics/drawable/Drawable;", TypedValues.AttributesType.S_FRAME, "fillColor", "", ViewProps.PADDING_LEFT, "", ViewProps.PADDING_RIGHT, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, "<init>", "(Landroid/graphics/drawable/Drawable;IFFFF)V", "buffer", "Landroid/graphics/Bitmap;", "border", "mask", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "getOpacity", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setBounds", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "redrawBuffer", "setStroke", "width", "color", "setFillColor", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSFrameDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSFrameDrawable.kt\ncom/sumsub/sns/core/widget/SNSFrameDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class SNSFrameDrawable extends Drawable {

    @Nullable
    private final Drawable border;

    @Nullable
    private Bitmap buffer;
    private int fillColor;

    @Nullable
    private final Drawable mask;
    private final float paddingBottom;
    private final float paddingLeft;
    private final float paddingRight;
    private final float paddingTop;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Bitmap bitmap = this.buffer;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().left, getBounds().top, (Paint) null);
        }
    }

    public final void setFillColor(int color) {
        this.fillColor = color;
        redrawBuffer();
        invalidateSelf();
    }

    public final void setStroke(int width, int color) {
        Drawable drawable = this.border;
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(width, color);
        }
        redrawBuffer();
        invalidateSelf();
    }

    public SNSFrameDrawable(@Nullable Drawable drawable, int i11, float f11, float f12, float f13, float f14) {
        LayerDrawable layerDrawable;
        Drawable drawableFindDrawableByLayerId;
        Drawable drawableFindDrawableByLayerId2;
        this.fillColor = i11;
        this.paddingLeft = f11;
        this.paddingRight = f12;
        this.paddingTop = f13;
        this.paddingBottom = f14;
        boolean z11 = drawable instanceof LayerDrawable;
        if (z11) {
            layerDrawable = (LayerDrawable) drawable;
        } else {
            layerDrawable = null;
        }
        if (layerDrawable != null) {
            drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R$id.sns_frame_border);
        } else {
            drawableFindDrawableByLayerId = null;
        }
        this.border = drawableFindDrawableByLayerId;
        LayerDrawable layerDrawable2 = z11 ? (LayerDrawable) drawable : null;
        if (layerDrawable2 != null && (drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R$id.sns_frame_mask)) != null) {
            drawable = drawableFindDrawableByLayerId2;
        }
        this.mask = drawable;
    }

    private final void redrawBuffer() {
        int i11;
        Bitmap bitmap;
        Pair pairM90091to;
        int i12 = getBounds().left;
        int i13 = getBounds().right;
        int i14 = getBounds().top;
        int i15 = getBounds().bottom;
        Drawable drawable = this.mask;
        if (drawable != null) {
            float fCoerceAtLeast = RangesKt.coerceAtLeast(((i13 - i12) - this.paddingLeft) - this.paddingRight, 0.0f);
            float fCoerceAtLeast2 = RangesKt.coerceAtLeast(((i15 - i14) - this.paddingTop) - this.paddingBottom, 0.0f);
            if (fCoerceAtLeast2 / RangesKt.coerceAtLeast(drawable.getIntrinsicHeight(), 1) > fCoerceAtLeast / RangesKt.coerceAtLeast(drawable.getIntrinsicWidth(), 1)) {
                pairM90091to = TuplesKt.m90091to(Float.valueOf(fCoerceAtLeast), Float.valueOf((drawable.getIntrinsicHeight() * fCoerceAtLeast) / RangesKt.coerceAtLeast(drawable.getIntrinsicWidth(), 1)));
            } else {
                pairM90091to = TuplesKt.m90091to(Float.valueOf((drawable.getIntrinsicWidth() * fCoerceAtLeast2) / RangesKt.coerceAtLeast(drawable.getIntrinsicHeight(), 1)), Float.valueOf(fCoerceAtLeast2));
            }
            float fFloatValue = ((Number) pairM90091to.component1()).floatValue();
            float fFloatValue2 = ((Number) pairM90091to.component2()).floatValue();
            float f11 = 2;
            float f12 = ((fCoerceAtLeast - fFloatValue) / f11) + i12 + this.paddingLeft;
            float f13 = ((fCoerceAtLeast2 - fFloatValue2) / f11) + i14 + this.paddingTop;
            drawable.setBounds((int) f12, (int) f13, (int) (f12 + fFloatValue), (int) (f13 + fFloatValue2));
            Drawable drawable2 = this.border;
            if (drawable2 != null) {
                drawable2.setBounds(drawable.getBounds());
            }
        }
        int i16 = i13 - i12;
        if (i16 > 0 && (i11 = i15 - i14) > 0) {
            Bitmap bitmap2 = this.buffer;
            if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.buffer) != null) {
                bitmap.recycle();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i16, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Drawable drawable3 = this.mask;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
            canvas.drawColor(this.fillColor, PorterDuff.Mode.SRC_OUT);
            Drawable drawable4 = this.border;
            if (drawable4 != null) {
                drawable4.draw(canvas);
            }
            this.buffer = bitmapCreateBitmap;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int left, int top, int right, int bottom) {
        super.setBounds(left, top, right, bottom);
        redrawBuffer();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        invalidateSelf();
    }
}
