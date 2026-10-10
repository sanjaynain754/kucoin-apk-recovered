package ff0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import df0.C36671a;
import qf0.AbstractC43728c;

/* JADX INFO: renamed from: ff0.h */
/* JADX INFO: compiled from: OrderedListItemSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37449h implements LeadingMarginSpan {

    /* JADX INFO: renamed from: b */
    public final C36671a f83062b;

    /* JADX INFO: renamed from: c */
    public final String f83063c;

    /* JADX INFO: renamed from: d */
    public final Paint f83064d = AbstractC37448g.m84241a();

    /* JADX INFO: renamed from: e */
    public int f83065e;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        if (z11 && AbstractC43728c.m96340b(i16, charSequence, this)) {
            this.f83064d.set(paint);
            this.f83062b.m82063g(this.f83064d);
            int iMeasureText = (int) (this.f83064d.measureText(this.f83063c) + 0.5f);
            int iM82065j = this.f83062b.m82065j();
            if (iMeasureText > iM82065j) {
                this.f83065e = iMeasureText;
                iM82065j = iMeasureText;
            } else {
                this.f83065e = 0;
            }
            canvas.drawText(this.f83063c, i12 > 0 ? (i11 + (iM82065j * i12)) - iMeasureText : i11 + (i12 * iM82065j) + (iM82065j - iMeasureText), i14, this.f83064d);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return Math.max(this.f83065e, this.f83062b.m82065j());
    }

    public C37449h(@NonNull C36671a c36671a, @NonNull String str) {
        this.f83062b = c36671a;
        this.f83063c = str;
    }
}
