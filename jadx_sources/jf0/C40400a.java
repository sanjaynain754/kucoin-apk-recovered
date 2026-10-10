package jf0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: jf0.a */
/* JADX INFO: compiled from: SubScriptSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C40400a extends MetricAffectingSpan {
    /* JADX INFO: renamed from: a */
    public final void m89027a(TextPaint textPaint) {
        textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
        textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m89027a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NonNull TextPaint textPaint) {
        m89027a(textPaint);
    }
}
