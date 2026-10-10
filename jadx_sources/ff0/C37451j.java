package ff0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import df0.C36671a;

/* JADX INFO: renamed from: ff0.j */
/* JADX INFO: compiled from: ThematicBreakSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37451j implements LeadingMarginSpan {

    /* JADX INFO: renamed from: b */
    public final C36671a f83066b;

    /* JADX INFO: renamed from: c */
    public final Rect f83067c = AbstractC37448g.m84242b();

    /* JADX INFO: renamed from: d */
    public final Paint f83068d = AbstractC37448g.m84241a();

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int width;
        int i18 = i13 + ((i15 - i13) / 2);
        this.f83068d.set(paint);
        this.f83066b.m82064h(this.f83068d);
        int strokeWidth = (int) ((((int) (this.f83068d.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i12 > 0) {
            width = canvas.getWidth();
        } else {
            width = i11;
            i11 -= canvas.getWidth();
        }
        this.f83067c.set(i11, i18 - strokeWidth, width, i18 + strokeWidth);
        canvas.drawRect(this.f83067c, this.f83068d);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return 0;
    }

    public C37451j(@NonNull C36671a c36671a) {
        this.f83066b = c36671a;
    }
}
