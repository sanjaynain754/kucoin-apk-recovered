package p328i1;

import android.graphics.PointF;
import java.util.List;
import p248f1.AbstractC37305a;
import p248f1.C37314j;
import p248f1.C37315k;
import p522p1.C43348a;

/* JADX INFO: renamed from: i1.e */
/* JADX INFO: compiled from: AnimatablePathValue.java */
/* JADX INFO: loaded from: classes.dex */
public class C38397e implements InterfaceC38405m<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final List<C43348a<PointF>> f86170a;

    @Override // p328i1.InterfaceC38405m
    /* JADX INFO: renamed from: a */
    public AbstractC37305a<PointF, PointF> mo86574a() {
        return this.f86170a.get(0).m95458i() ? new C37315k(this.f86170a) : new C37314j(this.f86170a);
    }

    @Override // p328i1.InterfaceC38405m
    /* JADX INFO: renamed from: b */
    public List<C43348a<PointF>> mo86575b() {
        return this.f86170a;
    }

    @Override // p328i1.InterfaceC38405m
    public boolean isStatic() {
        return this.f86170a.size() == 1 && this.f86170a.get(0).m95458i();
    }

    public C38397e(List<C43348a<PointF>> list) {
        this.f86170a = list;
    }
}
