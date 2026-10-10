package zw;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: zw.e */
/* JADX INFO: compiled from: MathUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class C46934e {
    /* JADX INFO: renamed from: a */
    public static void m103408a(PointF pointF, float f11, Double d11, List<PointF> list) {
        float fSin;
        if (d11 != null) {
            double dAtan = (float) Math.atan(d11.doubleValue());
            double d12 = f11;
            float fCos = (float) (Math.cos(dAtan) * d12);
            fSin = (float) (Math.sin(dAtan) * d12);
            f11 = fCos;
        } else {
            fSin = 0.0f;
        }
        list.add(new PointF(pointF.x + f11, pointF.y + fSin));
        list.add(new PointF(pointF.x - f11, pointF.y - fSin));
    }

    /* JADX INFO: renamed from: b */
    public static float m103409b(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    /* JADX INFO: renamed from: c */
    public static int m103410c(PointF pointF, PointF pointF2) {
        float f11 = pointF.x;
        float f12 = pointF2.x;
        if (f11 > f12) {
            float f13 = pointF.y;
            float f14 = pointF2.y;
            if (f13 > f14) {
                return 4;
            }
            return f13 < f14 ? 1 : -1;
        }
        if (f11 >= f12) {
            return -1;
        }
        float f15 = pointF.y;
        float f16 = pointF2.y;
        if (f15 > f16) {
            return 3;
        }
        return f15 < f16 ? 2 : -1;
    }

    /* JADX INFO: renamed from: d */
    public static double m103411d(double d11, int i11) {
        if (d11 < 0.0d) {
            d11 += 1.5707963267948966d;
        }
        return d11 + (((double) (i11 - 1)) * 1.5707963267948966d);
    }

    /* JADX INFO: renamed from: e */
    public static double m103412e(double d11) {
        return (d11 / 6.283185307179586d) * 360.0d;
    }
}
