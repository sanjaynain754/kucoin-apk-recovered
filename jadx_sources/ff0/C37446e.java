package ff0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: ff0.e */
/* JADX INFO: compiled from: EmphasisSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37446e extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(-0.25f);
    }
}
