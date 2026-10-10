package p328i1;

import android.graphics.PointF;
import java.util.List;
import p248f1.AbstractC37305a;
import p248f1.C37318n;
import p522p1.C43348a;

/* JADX INFO: renamed from: i1.i */
/* JADX INFO: compiled from: AnimatableSplitDimensionPathValue.java */
/* JADX INFO: loaded from: classes.dex */
public class C38401i implements InterfaceC38405m<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final C38394b f86171a;

    /* JADX INFO: renamed from: b */
    public final C38394b f86172b;

    @Override // p328i1.InterfaceC38405m
    /* JADX INFO: renamed from: a */
    public AbstractC37305a<PointF, PointF> mo86574a() {
        return new C37318n(this.f86171a.mo86574a(), this.f86172b.mo86574a());
    }

    @Override // p328i1.InterfaceC38405m
    /* JADX INFO: renamed from: b */
    public List<C43348a<PointF>> mo86575b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p328i1.InterfaceC38405m
    public boolean isStatic() {
        return this.f86171a.isStatic() && this.f86172b.isStatic();
    }

    public C38401i(C38394b c38394b, C38394b c38394b2) {
        this.f86171a = c38394b;
        this.f86172b = c38394b2;
    }
}
