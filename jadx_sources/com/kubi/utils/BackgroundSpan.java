package com.kubi.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import androidx.annotation.ColorInt;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BackgroundSpan.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JW\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0007*\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010 \u001a\u00020\u0007*\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0007*\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u001fJ1\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010#2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000$H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b1\u00102¨\u00063"}, m90084d2 = {"Lcom/kubi/utils/BackgroundSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/drawable/Drawable;", "textBg", "", "textColor", ViewProps.PADDING, "", "heightPercent", "<init>", "(Landroid/graphics/drawable/Drawable;IIF)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", ViewProps.TOP, "y", ViewProps.BOTTOM, "", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "f", "(Landroid/graphics/Paint;)F", "g", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;II)F", "e", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "block", "c", "(Landroid/graphics/Paint;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "b", "Landroid/graphics/drawable/Drawable;", "getTextBg", "()Landroid/graphics/drawable/Drawable;", "I", "getTextColor", "()I", "d", "F", "getHeightPercent", "()F", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class BackgroundSpan extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Drawable textBg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int textColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int padding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float heightPercent;

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull final Canvas canvas, @NotNull final CharSequence text, final int start, final int end, final float x11, final int top, int y11, int bottom, @NotNull final Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        final int i11 = bottom - top;
        final int size = getSize(paint, text, start, end, paint.getFontMetricsInt());
        int iM66360e = (int) m66360e(paint);
        final float fFloatValue = ((Number) m66358c(paint, new Function1<Paint, Float>() { // from class: com.kubi.utils.BackgroundSpan$draw$newTextTop$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Float invoke(@NotNull Paint it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(Math.abs(it.getFontMetrics().top));
            }
        })).floatValue();
        final float fFloatValue2 = ((Number) m66358c(paint, new Function1<Paint, Float>() { // from class: com.kubi.utils.BackgroundSpan$draw$newTextHeight$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Float invoke(@NotNull Paint it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(this.this$0.m66361f(it));
            }

            {
                super(1);
            }
        })).floatValue();
        final float fFloatValue3 = ((Number) m66358c(paint, new Function1<Paint, Float>() { // from class: com.kubi.utils.BackgroundSpan$draw$newTextWidth$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Float invoke(@NotNull Paint it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(this.this$0.m66362g(it, text, start, end));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        })).floatValue();
        canvas.save();
        canvas.translate(x11, top + ((i11 - iM66360e) / 2));
        this.textBg.setBounds(0, 0, size, iM66360e);
        this.textBg.draw(canvas);
        canvas.restore();
        canvas.save();
        m66358c(paint, new Function1<Paint, Unit>() { // from class: com.kubi.utils.BackgroundSpan.draw.1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Paint paint2) {
                invoke2(paint2);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Paint it) {
                Intrinsics.checkNotNullParameter(it, "it");
                float f11 = 2;
                canvas.drawText(text, start, end, x11 + ((size - fFloatValue3) / f11), top + ((i11 - fFloatValue2) / f11) + fFloatValue, paint);
            }
        });
        canvas.restore();
    }

    public BackgroundSpan(@NotNull Drawable textBg, @ColorInt int i11, int i12, float f11) {
        Intrinsics.checkNotNullParameter(textBg, "textBg");
        this.textBg = textBg;
        this.textColor = i11;
        this.padding = i12;
        this.heightPercent = f11;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @Nullable final CharSequence text, final int start, final int end, @Nullable Paint.FontMetricsInt fm2) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        return (int) Math.max(m66360e(paint), ((Number) m66358c(paint, new Function1<Paint, Float>() { // from class: com.kubi.utils.BackgroundSpan.getSize.1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Float invoke(@NotNull Paint it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(BackgroundSpan.this.m66362g(it, text, start, end) + (BackgroundSpan.this.getPadding() * 2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        })).floatValue());
    }

    /* JADX INFO: renamed from: c */
    public final <T> T m66358c(Paint paint, Function1<? super Paint, ? extends T> block) {
        int color = paint.getColor();
        float textSize = paint.getTextSize();
        paint.setColor(this.textColor);
        paint.setTextSize(paint.getTextSize() - (this.padding * 2));
        T tInvoke = block.invoke(paint);
        paint.setColor(color);
        paint.setTextSize(textSize);
        return tInvoke;
    }

    /* JADX INFO: renamed from: e */
    public final float m66360e(Paint paint) {
        return m66361f(paint) * this.heightPercent;
    }

    /* JADX INFO: renamed from: f */
    public final float m66361f(Paint paint) {
        return Math.abs(paint.getFontMetrics().bottom) + Math.abs(paint.getFontMetrics().top);
    }

    /* JADX INFO: renamed from: g */
    public final float m66362g(Paint paint, CharSequence charSequence, int i11, int i12) {
        return paint.measureText(charSequence, i11, i12);
    }
}
