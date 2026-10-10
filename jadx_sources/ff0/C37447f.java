package ff0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import df0.C36671a;
import qf0.AbstractC43728c;

/* JADX INFO: renamed from: ff0.f */
/* JADX INFO: compiled from: HeadingSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37447f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: b */
    public final C36671a f83055b;

    /* JADX INFO: renamed from: c */
    public final Rect f83056c = AbstractC37448g.m84242b();

    /* JADX INFO: renamed from: d */
    public final Paint f83057d = AbstractC37448g.m84241a();

    /* JADX INFO: renamed from: e */
    public final int f83058e;

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m84240a(TextPaint textPaint) {
        this.f83055b.m82061e(textPaint, this.f83058e);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int width;
        int i18 = this.f83058e;
        if ((i18 == 1 || i18 == 2) && AbstractC43728c.m96339a(i17, charSequence, this)) {
            this.f83057d.set(paint);
            this.f83055b.m82060d(this.f83057d);
            float strokeWidth = this.f83057d.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i19 = (int) ((i15 - strokeWidth) + 0.5f);
                if (i12 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i11;
                    i11 -= canvas.getWidth();
                }
                this.f83056c.set(i11, i19, width, i15);
                canvas.drawRect(this.f83056c, this.f83057d);
            }
        }
    }

    public C37447f(@NonNull C36671a c36671a, @IntRange(from = 1, m1553to = 6) int i11) {
        this.f83055b = c36671a;
        this.f83058e = i11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m84240a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m84240a(textPaint);
    }
}
