package ff0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import df0.C36671a;

/* JADX INFO: renamed from: ff0.c */
/* JADX INFO: compiled from: CodeBlockSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37444c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: b */
    public final C36671a f83051b;

    /* JADX INFO: renamed from: c */
    public final Rect f83052c = AbstractC37448g.m84242b();

    /* JADX INFO: renamed from: d */
    public final Paint f83053d = AbstractC37448g.m84241a();

    /* JADX INFO: renamed from: a */
    public final void m84238a(TextPaint textPaint) {
        this.f83051b.m82058b(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int width;
        this.f83053d.setStyle(Paint.Style.FILL);
        this.f83053d.setColor(this.f83051b.m82069n(paint));
        if (i12 > 0) {
            width = canvas.getWidth();
        } else {
            i11 -= canvas.getWidth();
            width = i11;
        }
        this.f83052c.set(i11, i13, width, i15);
        canvas.drawRect(this.f83052c, this.f83053d);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return this.f83051b.m82070o();
    }

    public C37444c(@NonNull C36671a c36671a) {
        this.f83051b = c36671a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m84238a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m84238a(textPaint);
    }
}
