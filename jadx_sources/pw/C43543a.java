package pw;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;

/* JADX INFO: renamed from: pw.a */
/* JADX INFO: compiled from: DepthGridRender.java */
/* JADX INFO: loaded from: classes13.dex */
public class C43543a {

    /* JADX INFO: renamed from: a */
    public Paint f96080a;

    /* JADX INFO: renamed from: a */
    public void m95817a(Canvas canvas, int i11, float f11) {
        float f12 = f11 / 6.0f;
        this.f96080a.setPathEffect(null);
        for (int i12 = 0; i12 < 6; i12++) {
            float f13 = f12 * i12;
            canvas.drawLine(0.0f, f13, i11, f13, this.f96080a);
        }
        int i13 = i11 / 5;
        for (int i14 = 1; i14 < 5; i14++) {
            float f14 = i13 * i14;
            canvas.drawLine(f14, 0.0f, f14, f11, this.f96080a);
        }
    }

    public C43543a(KuCoinDepthView kuCoinDepthView) {
        Paint paint = new Paint(1);
        this.f96080a = paint;
        paint.setColor(kuCoinDepthView.f44494q);
        this.f96080a.setStyle(Paint.Style.STROKE);
        this.f96080a.setStrokeWidth(1.0f);
    }
}
