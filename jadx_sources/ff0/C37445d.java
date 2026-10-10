package ff0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import df0.C36671a;

/* JADX INFO: renamed from: ff0.d */
/* JADX INFO: compiled from: CodeSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37445d extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b */
    public final C36671a f83054b;

    /* JADX INFO: renamed from: a */
    public final void m84239a(TextPaint textPaint) {
        this.f83054b.m82059c(textPaint);
    }

    public C37445d(@NonNull C36671a c36671a) {
        this.f83054b = c36671a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m84239a(textPaint);
        textPaint.bgColor = this.f83054b.m82068m(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m84239a(textPaint);
    }
}
