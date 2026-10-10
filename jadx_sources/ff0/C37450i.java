package ff0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: ff0.i */
/* JADX INFO: compiled from: StrongEmphasisSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37450i extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }
}
