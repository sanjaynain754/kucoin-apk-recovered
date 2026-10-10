package n10;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: n10.a */
/* JADX INFO: compiled from: CommonFontSpan.java */
/* JADX INFO: loaded from: classes43.dex */
public abstract class AbstractC42699a extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public float f94508b;

    /* JADX INFO: renamed from: b */
    public abstract void mo93588b(@NonNull Canvas canvas, @NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, float f11, int i13, int i14, int i15);

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i11, int i12, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        this.f94508b = mo93589c(paint, fontMetricsInt, charSequence, i11, i12);
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return (int) this.f94508b;
    }

    /* JADX INFO: renamed from: a */
    public float m93587a() {
        return this.f94508b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, @NonNull Paint paint) {
        int alpha = paint.getAlpha();
        if (alpha != 255) {
            paint.setAlpha(255);
        }
        mo93588b(canvas, paint, charSequence, i11, i12, f11, i13, i14, i15);
        paint.setAlpha(alpha);
    }

    /* JADX INFO: renamed from: c */
    public float mo93589c(@NonNull Paint paint, @Nullable Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        return paint.measureText(charSequence, i11, i12);
    }
}
