package c20;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$font;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27040e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c20.a */
/* JADX INFO: compiled from: PerpSpan.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016JP\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/span/PerpSpan;", "Landroid/text/style/ReplacementSpan;", "<init>", "()V", "regularFont", "Landroid/graphics/Typeface;", "getSize", "", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", ViewProps.TOP, "y", ViewProps.BOTTOM, "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4810a extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Typeface f4835b = ResourcesCompat.getFont(C27017c.f54310a.m66513b(), R$font.regular);

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x11, int top, int y11, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        int color = paint.getColor();
        float textSize = paint.getTextSize();
        Typeface typeface = paint.getTypeface();
        paint.setTextSize((textSize / 3.0f) * 2.0f);
        paint.setTypeface(this.f4835b);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float fMeasureText = paint.measureText(text, start, end);
        float f11 = top + ((bottom - top) / 2.0f);
        float f12 = fontMetrics.descent;
        float f13 = fontMetrics.ascent;
        float f14 = f12 - f13;
        float f15 = f12 + f13;
        float f16 = 2;
        float f17 = f15 / f16;
        float f18 = f14 / f16;
        float fM66658b = (f11 - f18) - C27040e.m66658b(1);
        float fM66658b2 = f18 + f11 + C27040e.m66658b(1);
        paint.setColor(C27017c.f54310a.m66512a(R$color.c_cover4));
        canvas.drawRoundRect(new RectF(x11, fM66658b, fMeasureText + x11 + C27040e.m66658b(6), fM66658b2), C27040e.m66658b(4), C27040e.m66658b(4), paint);
        paint.setColor(ColorUtils.setAlphaComponent(color, 153));
        canvas.drawText(text, start, end, x11 + C27040e.m66658b(3), f11 - f17, paint);
        paint.setColor(color);
        paint.setTextSize(textSize);
        paint.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        float textSize = paint.getTextSize();
        Typeface typeface = paint.getTypeface();
        paint.setTextSize((textSize / 3.0f) * 2.0f);
        paint.setTypeface(this.f4835b);
        int iMeasureText = ((int) paint.measureText(text, start, end)) + C27040e.m66658b(6);
        if (fontMetricsInt != null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            fontMetricsInt.ascent = Math.min(fontMetricsInt.ascent, (int) fontMetrics.ascent);
            fontMetricsInt.descent = Math.max(fontMetricsInt.descent, (int) fontMetrics.descent);
        }
        paint.setTextSize(textSize);
        paint.setTypeface(typeface);
        return iMeasureText;
    }
}
