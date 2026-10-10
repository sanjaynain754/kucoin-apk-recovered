package p248f1;

import java.util.List;
import p355j1.C40201d;
import p522p1.C43348a;

/* JADX INFO: renamed from: f1.e */
/* JADX INFO: compiled from: GradientColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37309e extends AbstractC37311g<C40201d> {

    /* JADX INFO: renamed from: i */
    public final C40201d f82788i;

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C40201d mo83832i(C43348a<C40201d> c43348a, float f11) {
        this.f82788i.m88563g(c43348a.f95709b, c43348a.f95710c, f11);
        return this.f82788i;
    }

    public C37309e(List<C43348a<C40201d>> list) {
        super(list);
        int iMax = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C40201d c40201d = list.get(i11).f95709b;
            if (c40201d != null) {
                iMax = Math.max(iMax, c40201d.m88562f());
            }
        }
        this.f82788i = new C40201d(new float[iMax], new int[iMax]);
    }
}
