package com.kubi.payment.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.utils.extensions.C27040e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.util.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RoundedBackgroundSpan.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016JP\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/util/RoundedBackgroundSpan;", "Landroid/text/style/ReplacementSpan;", "backgroundColor", "", "textColor", "radius", "", "size", "marginH", "<init>", "(IIFFF)V", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", ViewProps.TOP, "y", ViewProps.BOTTOM, "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RoundedBackgroundSpan extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final int f40388b;

    /* JADX INFO: renamed from: c */
    public final int f40389c;

    /* JADX INFO: renamed from: d */
    public final float f40390d;

    /* JADX INFO: renamed from: e */
    public final float f40391e;

    /* JADX INFO: renamed from: f */
    public final float f40392f;

    public /* synthetic */ RoundedBackgroundSpan(int i11, int i12, float f11, float f12, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, (i13 & 4) != 0 ? C27040e.m66657a(2.0f) : f11, (i13 & 8) != 0 ? C27040e.m66657a(20.0f) : f12, (i13 & 16) != 0 ? C27040e.m66657a(4.0f) : f13);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x11, int top, int y11, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        int color = paint.getColor();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f11 = y11 + ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
        float f12 = this.f40392f + x11;
        float f13 = this.f40391e;
        RectF rectF = new RectF(f12, f11 - (f13 / 2.0f), f12 + f13, f11 + (f13 / 2.0f));
        paint.setColor(this.f40388b);
        float f14 = this.f40390d;
        canvas.drawRoundRect(rectF, f14, f14, paint);
        paint.setColor(this.f40389c);
        canvas.drawText(text, start, end, rectF.centerX() - (paint.measureText(text, start, end) / 2.0f), rectF.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), paint);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @Nullable CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm2) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (fm2 != null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f11 = (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
            float f12 = this.f40391e;
            float f13 = f11 - (f12 / 2.0f);
            float f14 = f11 + (f12 / 2.0f);
            int i11 = ((int) f13) - 1;
            if (i11 < fm2.ascent) {
                fm2.ascent = i11;
                fm2.top = i11;
            }
            int i12 = ((int) f14) + 1;
            if (i12 > fm2.descent) {
                fm2.descent = i12;
                fm2.bottom = i12;
            }
        }
        return (int) (this.f40391e + (this.f40392f * 2));
    }

    public RoundedBackgroundSpan(int i11, int i12, float f11, float f12, float f13) {
        this.f40388b = i11;
        this.f40389c = i12;
        this.f40390d = f11;
        this.f40391e = f12;
        this.f40392f = f13;
    }
}
