package pw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.widget.chart.depth.DepthEntity;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;
import java.util.List;

/* JADX INFO: renamed from: pw.b */
/* JADX INFO: compiled from: DepthRegionRender.java */
/* JADX INFO: loaded from: classes13.dex */
public class C43544b {

    /* JADX INFO: renamed from: a */
    public Paint f96081a;

    /* JADX INFO: renamed from: b */
    public Paint f96082b;

    /* JADX INFO: renamed from: c */
    public Path f96083c = new Path();

    /* JADX INFO: renamed from: d */
    public KuCoinDepthView f96084d;

    public C43544b(KuCoinDepthView kuCoinDepthView) {
        this.f96084d = kuCoinDepthView;
        Paint paint = new Paint(1);
        this.f96081a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f96081a.setStrokeCap(Paint.Cap.ROUND);
        this.f96081a.setStrokeWidth(C5275i0.m6236a(1.0f));
        this.f96082b = new Paint(1);
    }

    /* JADX INFO: renamed from: a */
    public void m95818a(Canvas canvas, List<DepthEntity> list) {
        if (!list.isEmpty()) {
            this.f96081a.setColor(this.f96084d.f44495r);
            this.f96082b.setColor(this.f96084d.f44496s);
            this.f96083c.reset();
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (i11 == 0) {
                    this.f96083c.moveTo(list.get(i11).getX(), list.get(i11).getY());
                } else {
                    this.f96083c.lineTo(list.get(i11).getX(), list.get(i11).getY());
                }
            }
            if (!list.isEmpty()) {
                double y11 = list.get(list.size() - 1).getY();
                KuCoinDepthView kuCoinDepthView = this.f96084d;
                if (y11 < ((double) kuCoinDepthView.f44482e) + kuCoinDepthView.f44486i) {
                    Path path = this.f96083c;
                    float x11 = list.get(list.size() - 1).getX();
                    KuCoinDepthView kuCoinDepthView2 = this.f96084d;
                    path.lineTo(x11, (float) (((double) kuCoinDepthView2.f44482e) + kuCoinDepthView2.f44486i));
                }
            }
            Path path2 = this.f96083c;
            KuCoinDepthView kuCoinDepthView3 = this.f96084d;
            path2.lineTo(kuCoinDepthView3.f44481d, (float) (((double) kuCoinDepthView3.f44482e) + kuCoinDepthView3.f44486i));
            this.f96083c.close();
            canvas.drawPath(this.f96083c, this.f96082b);
            this.f96083c.reset();
            for (int i12 = 0; i12 < list.size(); i12++) {
                if (i12 == 0) {
                    this.f96083c.moveTo(list.get(i12).getX(), list.get(i12).getY());
                } else {
                    this.f96083c.lineTo(list.get(i12).getX(), list.get(i12).getY());
                }
            }
            canvas.drawPath(this.f96083c, this.f96081a);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m95819b(Canvas canvas, List<DepthEntity> list) {
        if (!list.isEmpty()) {
            this.f96081a.setColor(this.f96084d.f44497t);
            this.f96082b.setColor(this.f96084d.f44498u);
            this.f96083c.reset();
            for (int size = list.size() - 1; size >= 0; size--) {
                if (size == list.size() - 1) {
                    this.f96083c.moveTo(list.get(size).getX(), list.get(size).getY());
                } else {
                    this.f96083c.lineTo(list.get(size).getX(), list.get(size).getY());
                }
            }
            if (!list.isEmpty()) {
                float y11 = list.get(0).getY();
                KuCoinDepthView kuCoinDepthView = this.f96084d;
                if (y11 < ((float) (((double) kuCoinDepthView.f44482e) + kuCoinDepthView.f44486i))) {
                    Path path = this.f96083c;
                    float x11 = list.get(0).getX();
                    KuCoinDepthView kuCoinDepthView2 = this.f96084d;
                    path.lineTo(x11, (float) (((double) kuCoinDepthView2.f44482e) + kuCoinDepthView2.f44486i));
                }
            }
            Path path2 = this.f96083c;
            KuCoinDepthView kuCoinDepthView3 = this.f96084d;
            path2.lineTo(kuCoinDepthView3.f44483f, (float) (((double) kuCoinDepthView3.f44482e) + kuCoinDepthView3.f44486i));
            this.f96083c.close();
            canvas.drawPath(this.f96083c, this.f96082b);
            this.f96083c.reset();
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (i11 == 0) {
                    this.f96083c.moveTo(list.get(i11).getX(), list.get(i11).getY());
                } else {
                    this.f96083c.lineTo(list.get(i11).getX(), list.get(i11).getY());
                }
            }
            canvas.drawPath(this.f96083c, this.f96081a);
        }
    }
}
