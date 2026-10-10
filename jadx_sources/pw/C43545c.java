package pw;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.regulations.FinancialRegulationsEx;
import com.kubi.resources.widget.chart.depth.DepthEntity;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;
import com.kubi.sdk.res.R$font;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: pw.c */
/* JADX INFO: compiled from: DepthTextRender.java */
/* JADX INFO: loaded from: classes13.dex */
public class C43545c {

    /* JADX INFO: renamed from: c */
    public Paint f96087c;

    /* JADX INFO: renamed from: d */
    public KuCoinDepthView f96088d;

    /* JADX INFO: renamed from: e */
    public int f96089e;

    /* JADX INFO: renamed from: f */
    public int f96090f;

    /* JADX INFO: renamed from: a */
    public List<String> f96085a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<String> f96086b = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<DepthEntity> f96091g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final String m95820a(double d11, double d12, int i11) {
        return FinancialRegulationsEx.f21492a.formatNumber(new BigDecimal(String.valueOf(d11)).divide(new BigDecimal(String.valueOf(d12)), i11, RoundingMode.DOWN), i11, i11);
    }

    /* JADX INFO: renamed from: c */
    public float m95822c() {
        Paint.FontMetrics fontMetrics = this.f96087c.getFontMetrics();
        return Math.abs(fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: e */
    public void m95824e(Canvas canvas, float f11, float f12) {
        this.f96087c.setTextAlign(Paint.Align.LEFT);
        for (int i11 = 0; i11 < this.f96085a.size(); i11++) {
            if (i11 == 0) {
                canvas.drawText(this.f96085a.get(i11), 0.0f, f12 - C5275i0.m6236a(3.0f), this.f96087c);
            } else if (i11 == this.f96085a.size() - 1) {
                List<String> list = this.f96085a;
                String str = list.get(list.size() - 1);
                Paint paint = this.f96087c;
                List<String> list2 = this.f96085a;
                canvas.drawText(str, f11 - paint.measureText(list2.get(list2.size() - 1)), f12 - C5275i0.m6236a(3.0f), this.f96087c);
            } else {
                canvas.drawText(this.f96085a.get(i11), ((i11 * f11) / (this.f96085a.size() - 1)) - (this.f96087c.measureText(this.f96085a.get(i11)) / 2.0f), f12 - C5275i0.m6236a(3.0f), this.f96087c);
            }
        }
        float fM95822c = (f12 - m95822c()) / this.f96086b.size();
        for (int i12 = 0; i12 < this.f96086b.size(); i12++) {
            if (i12 == 0) {
                canvas.drawText(this.f96086b.get(i12), this.f96088d.f44481d + C5275i0.m6236a(3.0f), m95822c() - C5275i0.m6236a(2.0f), this.f96087c);
            } else {
                canvas.drawText(this.f96086b.get(i12), this.f96088d.f44481d + C5275i0.m6236a(3.0f), (i12 * fM95822c) + (m95822c() / 4.0f), this.f96087c);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m95825f(int i11) {
        this.f96089e = i11;
    }

    /* JADX INFO: renamed from: g */
    public void m95826g(int i11) {
        this.f96090f = i11;
    }

    public C43545c(KuCoinDepthView kuCoinDepthView) {
        this.f96088d = kuCoinDepthView;
        Paint paint = new Paint(1);
        this.f96087c = paint;
        paint.setTextSize(C5275i0.m6236a(10.0f));
        this.f96087c.setColor(this.f96088d.f44499v);
        this.f96087c.setTypeface(ResourcesCompat.getFont(this.f96088d.getContext(), R$font.medium));
    }

    /* JADX INFO: renamed from: d */
    public void m95823d(List<DepthEntity> list, List<DepthEntity> list2) {
        if (!list.isEmpty() || !list2.isEmpty()) {
            this.f96085a.clear();
            this.f96086b.clear();
            this.f96091g.clear();
            this.f96091g.addAll(list);
            this.f96091g.addAll(list2);
            for (int i11 = 0; i11 < 2; i11++) {
                List<DepthEntity> list3 = this.f96091g;
                double price = list3.get((list3.size() / 2) * i11).getPrice();
                List<String> list4 = this.f96085a;
                FinancialRegulationsEx.Companion companion = FinancialRegulationsEx.f21492a;
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(price));
                int i12 = this.f96090f;
                list4.add(companion.formatNumber(bigDecimal, i12, i12));
            }
            List<DepthEntity> list5 = this.f96091g;
            double price2 = list5.get(list5.size() - 1).getPrice();
            List<String> list6 = this.f96085a;
            FinancialRegulationsEx.Companion companion2 = FinancialRegulationsEx.f21492a;
            BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(price2));
            int i13 = this.f96090f;
            list6.add(companion2.formatNumber(bigDecimal2, i13, i13));
            float f11 = (float) (this.f96088d.f44485h / ((double) 6));
            for (int i14 = 0; i14 < 6; i14++) {
                this.f96086b.add(m95821b(this.f96088d.f44485h - ((double) (i14 * f11))));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m95821b(double d11) {
        if (d11 >= 1000.0d && d11 < 1000000.0d) {
            return m95820a(d11, 1000.0d, 2) + "K";
        }
        if (d11 >= 1000000.0d && d11 < 1.0E9d) {
            return m95820a(d11, 1000000.0d, 2) + "M";
        }
        if (d11 >= 1.0E9d && d11 < 1.0E12d) {
            return m95820a(d11, 1.0E9d, 3) + "B";
        }
        if (d11 >= 1.0E12d) {
            return m95820a(d11, 1.0E12d, 3) + ExifInterface.GPS_DIRECTION_TRUE;
        }
        return m95820a(d11, 1.0d, this.f96089e);
    }
}
