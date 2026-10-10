package ff0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import df0.C36671a;
import qf0.AbstractC43728c;

/* JADX INFO: renamed from: ff0.b */
/* JADX INFO: compiled from: BulletListItemSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37443b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: g */
    public static final boolean f83045g;

    /* JADX INFO: renamed from: b */
    public C36671a f83046b;

    /* JADX INFO: renamed from: c */
    public final Paint f83047c = AbstractC37448g.m84241a();

    /* JADX INFO: renamed from: d */
    public final RectF f83048d = AbstractC37448g.m84243c();

    /* JADX INFO: renamed from: e */
    public final Rect f83049e = AbstractC37448g.m84242b();

    /* JADX INFO: renamed from: f */
    public final int f83050f;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f83045g = 24 == i11 || 25 == i11;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int iMin;
        int iMax;
        if (z11 && AbstractC43728c.m96340b(i16, charSequence, this)) {
            this.f83047c.set(paint);
            this.f83046b.m82063g(this.f83047c);
            int iSave = canvas.save();
            try {
                int iM82065j = this.f83046b.m82065j();
                int iM82067l = this.f83046b.m82067l((int) ((this.f83047c.descent() - this.f83047c.ascent()) + 0.5f));
                int i18 = (iM82065j - iM82067l) / 2;
                if (f83045g) {
                    int width = i12 < 0 ? i11 - (layout.getWidth() - (iM82065j * this.f83050f)) : (iM82065j * this.f83050f) - i11;
                    int i19 = i11 + (i18 * i12);
                    int i21 = (i12 * iM82067l) + i19;
                    int i22 = i12 * width;
                    iMin = Math.min(i19, i21) + i22;
                    iMax = Math.max(i19, i21) + i22;
                } else {
                    if (i12 <= 0) {
                        i11 -= iM82065j;
                    }
                    iMin = i11 + i18;
                    iMax = iMin + iM82067l;
                }
                int iDescent = (i14 + ((int) (((this.f83047c.descent() + this.f83047c.ascent()) / 2.0f) + 0.5f))) - (iM82067l / 2);
                int i23 = iM82067l + iDescent;
                int i24 = this.f83050f;
                if (i24 == 0 || i24 == 1) {
                    this.f83048d.set(iMin, iDescent, iMax, i23);
                    this.f83047c.setStyle(this.f83050f == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(this.f83048d, this.f83047c);
                } else {
                    this.f83049e.set(iMin, iDescent, iMax, i23);
                    this.f83047c.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f83049e, this.f83047c);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return this.f83046b.m82065j();
    }

    public C37443b(@NonNull C36671a c36671a, @IntRange(from = 0) int i11) {
        this.f83046b = c36671a;
        this.f83050f = i11;
    }
}
