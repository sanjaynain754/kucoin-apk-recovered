package n10;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: n10.c */
/* JADX INFO: compiled from: MultiFontSpan.java */
/* JADX INFO: loaded from: classes43.dex */
public class C42701c extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public float f94512b;

    /* JADX INFO: renamed from: c */
    public final List<ReplacementSpan> f94513c;

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, @NonNull Paint paint) {
        Iterator<ReplacementSpan> it = this.f94513c.iterator();
        while (it.hasNext()) {
            it.next().draw(canvas, charSequence, i11, i12, f11, i13, i14, i15, paint);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        Iterator<ReplacementSpan> it = this.f94513c.iterator();
        while (it.hasNext()) {
            Paint paint2 = paint;
            CharSequence charSequence2 = charSequence;
            this.f94512b = Math.max(this.f94512b, it.next().getSize(paint2, charSequence2, i11, i12, fontMetricsInt));
            paint = paint2;
            charSequence = charSequence2;
        }
        return (int) this.f94512b;
    }

    public C42701c(ReplacementSpan... replacementSpanArr) {
        this.f94513c = Arrays.asList(replacementSpanArr);
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Iterator<ReplacementSpan> it = this.f94513c.iterator();
        while (it.hasNext()) {
            it.next().updateDrawState(textPaint);
        }
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        Iterator<ReplacementSpan> it = this.f94513c.iterator();
        while (it.hasNext()) {
            it.next().updateMeasureState(textPaint);
        }
    }
}
