package pw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.regulations.FinancialRegulationsEx;
import com.kubi.resources.widget.chart.depth.DepthEntity;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: pw.d */
/* JADX INFO: compiled from: DepthTouchRender.java */
/* JADX INFO: loaded from: classes13.dex */
public class C43546d {

    /* JADX INFO: renamed from: e */
    public Context f96096e;

    /* JADX INFO: renamed from: f */
    public KuCoinDepthView f96097f;

    /* JADX INFO: renamed from: g */
    public boolean f96098g;

    /* JADX INFO: renamed from: k */
    public DepthEntity f96102k;

    /* JADX INFO: renamed from: l */
    public Rect f96103l;

    /* JADX INFO: renamed from: n */
    public int f96105n;

    /* JADX INFO: renamed from: o */
    public int f96106o;

    /* JADX INFO: renamed from: a */
    public int f96092a = C5275i0.m6241f(4.0f);

    /* JADX INFO: renamed from: b */
    public int f96093b = C5275i0.m6241f(9.0f);

    /* JADX INFO: renamed from: c */
    public int f96094c = C5275i0.m6241f(10.0f);

    /* JADX INFO: renamed from: d */
    public int f96095d = C5275i0.m6241f(5.0f);

    /* JADX INFO: renamed from: m */
    public float f96104m = -1.0f;

    /* JADX INFO: renamed from: h */
    public Paint f96099h = new Paint(1);

    /* JADX INFO: renamed from: i */
    public Paint f96100i = new Paint(1);

    /* JADX INFO: renamed from: j */
    public Paint f96101j = new Paint(1);

    /* JADX INFO: renamed from: a */
    public final String m95827a(double d11, double d12, int i11) {
        return FinancialRegulationsEx.f21492a.formatNumber(new BigDecimal(String.valueOf(d11)).divide(new BigDecimal(String.valueOf(d12)), i11, RoundingMode.DOWN), i11, i11);
    }

    /* JADX INFO: renamed from: b */
    public void m95828b(Canvas canvas) {
        float f11 = this.f96104m;
        if (f11 > 0.0f) {
            m95830d(f11);
        }
        if (!this.f96098g || this.f96102k == null) {
            return;
        }
        m95829c(canvas);
    }

    /* JADX INFO: renamed from: c */
    public final void m95829c(Canvas canvas) {
        float x11;
        float x12;
        float x13;
        float y11;
        float f11;
        float fM6236a;
        float fM6236a2;
        this.f96099h.setColor(this.f96102k.isSell() ? this.f96097f.f44498u : this.f96097f.f44496s);
        canvas.drawCircle(this.f96102k.getX(), this.f96102k.getY(), this.f96093b, this.f96099h);
        this.f96099h.setColor(this.f96102k.isSell() ? this.f96097f.f44497t : this.f96097f.f44495r);
        canvas.drawCircle(this.f96102k.getX(), this.f96102k.getY(), this.f96092a, this.f96099h);
        Context context = this.f96096e;
        int i11 = R$string.price_stub;
        FinancialRegulationsEx.Companion companion = FinancialRegulationsEx.f21492a;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(this.f96102k.getPrice()));
        int i12 = this.f96106o;
        String string = context.getString(i11, companion.formatNumber(bigDecimal, i12, i12));
        String string2 = this.f96096e.getString(this.f96102k.isSell() ? R$string.depth_amount_sell_stub : R$string.depth_amount_buy_stub, m95831e(this.f96102k.getVolume()));
        this.f96101j.getTextBounds(string, 0, string.length(), this.f96103l);
        int iWidth = this.f96103l.width();
        int iHeight = this.f96103l.height();
        this.f96101j.getTextBounds(string2, 0, string2.length(), this.f96103l);
        int iMax = Math.max(iWidth, this.f96103l.width());
        int i13 = (this.f96094c * 2) + iMax;
        if (this.f96102k.getX() <= this.f96093b + i13) {
            x13 = this.f96102k.getX() + this.f96093b;
            x11 = this.f96102k.getX() + i13 + this.f96093b;
            x12 = this.f96102k.getX() + this.f96093b + this.f96094c;
        } else {
            float f12 = iMax;
            float x14 = ((this.f96102k.getX() - f12) - this.f96093b) - (this.f96094c * 2);
            x11 = this.f96102k.getX() - this.f96093b;
            x12 = ((this.f96102k.getX() - f12) - this.f96093b) - this.f96094c;
            x13 = x14;
        }
        int iM6236a = iHeight * 2;
        int iM6236a2 = (this.f96095d * 2) + iM6236a + C5275i0.m6236a(5.0f);
        float y12 = this.f96102k.getY();
        float y13 = this.f96097f.f44482e;
        float f13 = iM6236a2;
        if (y12 >= y13 + f13) {
            double y14 = this.f96102k.getY();
            KuCoinDepthView kuCoinDepthView = this.f96097f;
            float f14 = kuCoinDepthView.f44482e;
            double d11 = kuCoinDepthView.f44486i;
            if (y14 > (((double) f14) + d11) - ((double) iM6236a2)) {
                y13 = (((float) d11) + f14) - f13;
                y11 = f14 + ((float) d11);
                float f15 = iHeight;
                f11 = this.f96095d + y13 + f15;
                fM6236a2 = f15 + C5275i0.m6236a(5.0f) + f11;
            } else {
                float f16 = iM6236a2 >> 1;
                y13 = this.f96102k.getY() - f16;
                y11 = this.f96102k.getY() + f16;
                float f17 = iHeight;
                f11 = this.f96095d + y13 + f17;
                fM6236a = f17 + f11;
                iM6236a = C5275i0.m6236a(5.0f);
            }
            canvas.drawRoundRect(new RectF(x13, y13, x11, y11), 6.0f, 6.0f, this.f96100i);
            canvas.drawText(string, x12, f11, this.f96101j);
            canvas.drawText(string2, x12, fM6236a2, this.f96101j);
        }
        y11 = f13 + y13;
        int i14 = this.f96095d;
        f11 = i14 + y13 + iHeight;
        fM6236a = i14 + y13 + C5275i0.m6236a(5.0f);
        fM6236a2 = fM6236a + iM6236a;
        canvas.drawRoundRect(new RectF(x13, y13, x11, y11), 6.0f, 6.0f, this.f96100i);
        canvas.drawText(string, x12, f11, this.f96101j);
        canvas.drawText(string2, x12, fM6236a2, this.f96101j);
    }

    /* JADX INFO: renamed from: d */
    public void m95830d(float f11) {
        this.f96104m = f11;
        int i11 = 0;
        if (this.f96097f.f44480c.isEmpty()) {
            while (i11 < this.f96097f.f44479b.size()) {
                int i12 = i11 + 1;
                if (i12 < this.f96097f.f44479b.size() && f11 >= this.f96097f.f44479b.get(i11).getX() && f11 < this.f96097f.f44479b.get(i12).getX()) {
                    this.f96102k = this.f96097f.f44479b.get(i11);
                    return;
                } else {
                    if (i11 == this.f96097f.f44479b.size() - 1 && f11 >= this.f96097f.f44479b.get(i11).getX()) {
                        this.f96102k = this.f96097f.f44479b.get(i11);
                        return;
                    }
                    i11 = i12;
                }
            }
            return;
        }
        if (f11 >= this.f96097f.f44480c.get(0).getX()) {
            while (i11 < this.f96097f.f44480c.size()) {
                int i13 = i11 + 1;
                if (i13 < this.f96097f.f44480c.size() && f11 >= this.f96097f.f44480c.get(i11).getX() && f11 < this.f96097f.f44480c.get(i13).getX()) {
                    this.f96102k = this.f96097f.f44480c.get(i11);
                    return;
                }
                i11 = i13;
            }
            return;
        }
        int i14 = 0;
        while (i14 < this.f96097f.f44479b.size()) {
            int i15 = i14 + 1;
            if (i15 < this.f96097f.f44479b.size() && f11 >= this.f96097f.f44479b.get(i14).getX() && f11 < this.f96097f.f44479b.get(i15).getX()) {
                this.f96102k = this.f96097f.f44479b.get(i14);
                return;
            } else {
                if (i14 == this.f96097f.f44479b.size() - 1 && f11 >= this.f96097f.f44479b.get(i14).getX() && f11 < this.f96097f.f44480c.get(0).getX()) {
                    this.f96102k = this.f96097f.f44479b.get(i14);
                    return;
                }
                i14 = i15;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m95832f() {
        return this.f96098g;
    }

    /* JADX INFO: renamed from: g */
    public void m95833g(int i11) {
        this.f96105n = i11;
    }

    /* JADX INFO: renamed from: h */
    public void m95834h(boolean z11) {
        if (this.f96098g == z11) {
            return;
        }
        this.f96098g = z11;
        this.f96097f.invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m95835i(int i11) {
        this.f96106o = i11;
    }

    public C43546d(KuCoinDepthView kuCoinDepthView) {
        this.f96097f = kuCoinDepthView;
        this.f96096e = kuCoinDepthView.getContext();
        this.f96100i.setColor(kuCoinDepthView.f44500w);
        this.f96101j.setColor(kuCoinDepthView.f44499v);
        this.f96101j.setTextSize(C5275i0.m6241f(10.0f));
        this.f96101j.setTypeface(ResourcesCompat.getFont(kuCoinDepthView.getContext(), R$font.medium));
        this.f96103l = new Rect();
    }

    /* JADX INFO: renamed from: e */
    public final String m95831e(double d11) {
        if (d11 >= 1000.0d && d11 < 1000000.0d) {
            return m95827a(d11, 1000.0d, 2) + "K";
        }
        if (d11 >= 1000000.0d && d11 < 1.0E9d) {
            return m95827a(d11, 1000000.0d, 2) + "M";
        }
        if (d11 >= 1.0E9d && d11 < 1.0E12d) {
            return m95827a(d11, 1.0E9d, 3) + "B";
        }
        if (d11 >= 1.0E12d) {
            return m95827a(d11, 1.0E12d, 3) + ExifInterface.GPS_DIRECTION_TRUE;
        }
        return m95827a(d11, 1.0d, this.f96105n);
    }
}
