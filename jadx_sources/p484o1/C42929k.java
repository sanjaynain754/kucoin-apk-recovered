package p484o1;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.List;
import p218e1.InterfaceC37031k;
import p297h1.C38071a;
import p297h1.C38074d;
import p355j1.C40206i;

/* JADX INFO: renamed from: o1.k */
/* JADX INFO: compiled from: MiscUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C42929k {

    /* JADX INFO: renamed from: a */
    public static final PointF f95049a = new PointF();

    /* JADX INFO: renamed from: f */
    public static int m94192f(float f11, float f12) {
        return m94193g((int) f11, (int) f12);
    }

    /* JADX INFO: renamed from: i */
    public static float m94195i(float f11, float f12, @FloatRange(from = 0.0d, m1552to = 1.0d) float f13) {
        return f11 + (f13 * (f12 - f11));
    }

    /* JADX INFO: renamed from: j */
    public static int m94196j(int i11, int i12, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        return (int) (i11 + (f11 * (i12 - i11)));
    }

    /* JADX INFO: renamed from: a */
    public static PointF m94187a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m94190d(float f11, float f12, float f13) {
        return f11 >= f12 && f11 <= f13;
    }

    /* JADX INFO: renamed from: e */
    public static int m94191e(int i11, int i12) {
        int i13 = i11 / i12;
        return (((i11 ^ i12) >= 0) || i11 % i12 == 0) ? i13 : i13 - 1;
    }

    /* JADX INFO: renamed from: b */
    public static float m94188b(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f13, f11));
    }

    /* JADX INFO: renamed from: c */
    public static int m94189c(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i13, i11));
    }

    /* JADX INFO: renamed from: g */
    public static int m94193g(int i11, int i12) {
        return i11 - (i12 * m94191e(i11, i12));
    }

    /* JADX INFO: renamed from: h */
    public static void m94194h(C40206i c40206i, Path path) {
        Path path2;
        path.reset();
        PointF pointFM88585b = c40206i.m88585b();
        path.moveTo(pointFM88585b.x, pointFM88585b.y);
        f95049a.set(pointFM88585b.x, pointFM88585b.y);
        int i11 = 0;
        while (i11 < c40206i.m88584a().size()) {
            C38071a c38071a = c40206i.m88584a().get(i11);
            PointF pointFM85951a = c38071a.m85951a();
            PointF pointFM85952b = c38071a.m85952b();
            PointF pointFM85953c = c38071a.m85953c();
            PointF pointF = f95049a;
            if (pointFM85951a.equals(pointF) && pointFM85952b.equals(pointFM85953c)) {
                path.lineTo(pointFM85953c.x, pointFM85953c.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFM85951a.x, pointFM85951a.y, pointFM85952b.x, pointFM85952b.y, pointFM85953c.x, pointFM85953c.y);
            }
            pointF.set(pointFM85953c.x, pointFM85953c.y);
            i11++;
            path = path2;
        }
        Path path3 = path;
        if (c40206i.m88587d()) {
            path3.close();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m94197k(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2, InterfaceC37031k interfaceC37031k) {
        if (c38074d.m85967c(interfaceC37031k.getName(), i11)) {
            list.add(c38074d2.m85965a(interfaceC37031k.getName()).m85973i(interfaceC37031k));
        }
    }
}
