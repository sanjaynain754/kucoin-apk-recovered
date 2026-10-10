package ff0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import df0.C36671a;

/* JADX INFO: renamed from: ff0.a */
/* JADX INFO: compiled from: BlockQuoteSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37442a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: b */
    public final C36671a f83042b;

    /* JADX INFO: renamed from: c */
    public final Rect f83043c = AbstractC37448g.m84242b();

    /* JADX INFO: renamed from: d */
    public final Paint f83044d = AbstractC37448g.m84241a();

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int iM82066k = this.f83042b.m82066k();
        this.f83044d.set(paint);
        this.f83042b.m82057a(this.f83044d);
        int i18 = i12 * iM82066k;
        int i19 = i11 + i18;
        int i21 = i18 + i19;
        this.f83043c.set(Math.min(i19, i21), i13, Math.max(i19, i21), i15);
        canvas.drawRect(this.f83043c, this.f83044d);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return this.f83042b.m82065j();
    }

    public C37442a(@NonNull C36671a c36671a) {
        this.f83042b = c36671a;
    }
}
