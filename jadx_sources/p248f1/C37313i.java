package p248f1;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import p484o1.C42930l;
import p522p1.C43348a;

/* JADX INFO: renamed from: f1.i */
/* JADX INFO: compiled from: PathKeyframe.java */
/* JADX INFO: loaded from: classes.dex */
public class C37313i extends C43348a<PointF> {

    /* JADX INFO: renamed from: q */
    @Nullable
    public Path f82792q;

    /* JADX INFO: renamed from: r */
    public final C43348a<PointF> f82793r;

    public C37313i(C5080h c5080h, C43348a<PointF> c43348a) {
        super(c5080h, c43348a.f95709b, c43348a.f95710c, c43348a.f95711d, c43348a.f95712e, c43348a.f95713f, c43348a.f95714g, c43348a.f95715h);
        this.f82793r = c43348a;
        m83865j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public void m83865j() {
        T t11;
        T t12;
        T t13 = this.f95710c;
        boolean z11 = (t13 == 0 || (t12 = this.f95709b) == 0 || !((PointF) t12).equals(((PointF) t13).x, ((PointF) t13).y)) ? false : true;
        T t14 = this.f95709b;
        if (t14 == 0 || (t11 = this.f95710c) == 0 || z11) {
            return;
        }
        C43348a<PointF> c43348a = this.f82793r;
        this.f82792q = C42930l.m94201d((PointF) t14, (PointF) t11, c43348a.f95722o, c43348a.f95723p);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public Path m83866k() {
        return this.f82792q;
    }
}
