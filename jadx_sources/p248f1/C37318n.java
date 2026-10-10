package p248f1;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;
import p522p1.C43348a;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.n */
/* JADX INFO: compiled from: SplitDimensionPathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37318n extends AbstractC37305a<PointF, PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f82806i;

    /* JADX INFO: renamed from: j */
    public final PointF f82807j;

    /* JADX INFO: renamed from: k */
    public final AbstractC37305a<Float, Float> f82808k;

    /* JADX INFO: renamed from: l */
    public final AbstractC37305a<Float, Float> f82809l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public C43350c<Float> f82810m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public C43350c<Float> f82811n;

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF mo83831h() {
        return mo83832i(null, 0.0f);
    }

    public C37318n(AbstractC37305a<Float, Float> abstractC37305a, AbstractC37305a<Float, Float> abstractC37305a2) {
        super(Collections.EMPTY_LIST);
        this.f82806i = new PointF();
        this.f82807j = new PointF();
        this.f82808k = abstractC37305a;
        this.f82809l = abstractC37305a2;
        mo83837n(m83829f());
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: n */
    public void mo83837n(float f11) {
        this.f82808k.mo83837n(f11);
        this.f82809l.mo83837n(f11);
        this.f82806i.set(this.f82808k.mo83831h().floatValue(), this.f82809l.mo83831h().floatValue());
        for (int i11 = 0; i11 < this.f82765a.size(); i11++) {
            this.f82765a.get(i11).mo5788e();
        }
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF mo83832i(C43348a<PointF> c43348a, float f11) {
        float f12;
        Float fM95467b;
        C43348a<Float> c43348aM83825b;
        C43348a<Float> c43348aM83825b2;
        Float fM95467b2 = null;
        if (this.f82810m == null || (c43348aM83825b2 = this.f82808k.m83825b()) == null) {
            f12 = f11;
            fM95467b = null;
        } else {
            float fM83827d = this.f82808k.m83827d();
            Float f13 = c43348aM83825b2.f95715h;
            C43350c<Float> c43350c = this.f82810m;
            float f14 = c43348aM83825b2.f95714g;
            f12 = f11;
            fM95467b = c43350c.m95467b(f14, f13 == null ? f14 : f13.floatValue(), c43348aM83825b2.f95709b, c43348aM83825b2.f95710c, f11, f11, fM83827d);
        }
        if (this.f82811n != null && (c43348aM83825b = this.f82809l.m83825b()) != null) {
            float fM83827d2 = this.f82809l.m83827d();
            Float f15 = c43348aM83825b.f95715h;
            C43350c<Float> c43350c2 = this.f82811n;
            float f16 = c43348aM83825b.f95714g;
            fM95467b2 = c43350c2.m95467b(f16, f15 == null ? f16 : f15.floatValue(), c43348aM83825b.f95709b, c43348aM83825b.f95710c, f12, f12, fM83827d2);
        }
        if (fM95467b == null) {
            this.f82807j.set(this.f82806i.x, 0.0f);
        } else {
            this.f82807j.set(fM95467b.floatValue(), 0.0f);
        }
        if (fM95467b2 == null) {
            PointF pointF = this.f82807j;
            pointF.set(pointF.x, this.f82806i.y);
        } else {
            PointF pointF2 = this.f82807j;
            pointF2.set(pointF2.x, fM95467b2.floatValue());
        }
        return this.f82807j;
    }

    /* JADX INFO: renamed from: s */
    public void m83875s(@Nullable C43350c<Float> c43350c) {
        C43350c<Float> c43350c2 = this.f82810m;
        if (c43350c2 != null) {
            c43350c2.m95468c(null);
        }
        this.f82810m = c43350c;
        if (c43350c != null) {
            c43350c.m95468c(this);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m83876t(@Nullable C43350c<Float> c43350c) {
        C43350c<Float> c43350c2 = this.f82811n;
        if (c43350c2 != null) {
            c43350c2.m95468c(null);
        }
        this.f82811n = c43350c;
        if (c43350c != null) {
            c43350c.m95468c(this);
        }
    }
}
