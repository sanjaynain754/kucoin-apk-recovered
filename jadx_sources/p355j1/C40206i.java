package p355j1;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;
import p297h1.C38071a;
import p484o1.C42924f;
import p484o1.C42929k;

/* JADX INFO: renamed from: j1.i */
/* JADX INFO: compiled from: ShapeData.java */
/* JADX INFO: loaded from: classes.dex */
public class C40206i {

    /* JADX INFO: renamed from: a */
    public final List<C38071a> f89359a;

    /* JADX INFO: renamed from: b */
    public PointF f89360b;

    /* JADX INFO: renamed from: c */
    public boolean f89361c;

    public C40206i(PointF pointF, boolean z11, List<C38071a> list) {
        this.f89360b = pointF;
        this.f89361c = z11;
        this.f89359a = new ArrayList(list);
    }

    /* JADX INFO: renamed from: a */
    public List<C38071a> m88584a() {
        return this.f89359a;
    }

    /* JADX INFO: renamed from: b */
    public PointF m88585b() {
        return this.f89360b;
    }

    /* JADX INFO: renamed from: c */
    public void m88586c(C40206i c40206i, C40206i c40206i2, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        if (this.f89360b == null) {
            this.f89360b = new PointF();
        }
        this.f89361c = c40206i.m88587d() || c40206i2.m88587d();
        if (c40206i.m88584a().size() != c40206i2.m88584a().size()) {
            C42924f.m94158c("Curves must have the same number of control points. Shape 1: " + c40206i.m88584a().size() + "\tShape 2: " + c40206i2.m88584a().size());
        }
        int iMin = Math.min(c40206i.m88584a().size(), c40206i2.m88584a().size());
        if (this.f89359a.size() < iMin) {
            for (int size = this.f89359a.size(); size < iMin; size++) {
                this.f89359a.add(new C38071a());
            }
        } else if (this.f89359a.size() > iMin) {
            for (int size2 = this.f89359a.size() - 1; size2 >= iMin; size2--) {
                List<C38071a> list = this.f89359a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFM88585b = c40206i.m88585b();
        PointF pointFM88585b2 = c40206i2.m88585b();
        m88589f(C42929k.m94195i(pointFM88585b.x, pointFM88585b2.x, f11), C42929k.m94195i(pointFM88585b.y, pointFM88585b2.y, f11));
        for (int size3 = this.f89359a.size() - 1; size3 >= 0; size3--) {
            C38071a c38071a = c40206i.m88584a().get(size3);
            C38071a c38071a2 = c40206i2.m88584a().get(size3);
            PointF pointFM85951a = c38071a.m85951a();
            PointF pointFM85952b = c38071a.m85952b();
            PointF pointFM85953c = c38071a.m85953c();
            PointF pointFM85951a2 = c38071a2.m85951a();
            PointF pointFM85952b2 = c38071a2.m85952b();
            PointF pointFM85953c2 = c38071a2.m85953c();
            this.f89359a.get(size3).m85954d(C42929k.m94195i(pointFM85951a.x, pointFM85951a2.x, f11), C42929k.m94195i(pointFM85951a.y, pointFM85951a2.y, f11));
            this.f89359a.get(size3).m85955e(C42929k.m94195i(pointFM85952b.x, pointFM85952b2.x, f11), C42929k.m94195i(pointFM85952b.y, pointFM85952b2.y, f11));
            this.f89359a.get(size3).m85956f(C42929k.m94195i(pointFM85953c.x, pointFM85953c2.x, f11), C42929k.m94195i(pointFM85953c.y, pointFM85953c2.y, f11));
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m88587d() {
        return this.f89361c;
    }

    /* JADX INFO: renamed from: e */
    public void m88588e(boolean z11) {
        this.f89361c = z11;
    }

    /* JADX INFO: renamed from: f */
    public void m88589f(float f11, float f12) {
        if (this.f89360b == null) {
            this.f89360b = new PointF();
        }
        this.f89360b.set(f11, f12);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f89359a.size() + "closed=" + this.f89361c + '}';
    }

    public C40206i() {
        this.f89359a = new ArrayList();
    }
}
