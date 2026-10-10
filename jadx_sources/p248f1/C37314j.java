package p248f1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p522p1.C43348a;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.j */
/* JADX INFO: compiled from: PathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37314j extends AbstractC37311g<PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f82794i;

    /* JADX INFO: renamed from: j */
    public final float[] f82795j;

    /* JADX INFO: renamed from: k */
    public final float[] f82796k;

    /* JADX INFO: renamed from: l */
    public final PathMeasure f82797l;

    /* JADX INFO: renamed from: m */
    public C37313i f82798m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF mo83832i(C43348a<PointF> c43348a, float f11) {
        float f12;
        C37313i c37313i = (C37313i) c43348a;
        Path pathM83866k = c37313i.m83866k();
        if (pathM83866k == null) {
            return c43348a.f95709b;
        }
        C43350c<A> c43350c = this.f82769e;
        if (c43350c != 0) {
            f12 = f11;
            PointF pointF = (PointF) c43350c.m95467b(c37313i.f95714g, c37313i.f95715h.floatValue(), (PointF) c37313i.f95709b, (PointF) c37313i.f95710c, m83828e(), f12, m83829f());
            if (pointF != null) {
                return pointF;
            }
        } else {
            f12 = f11;
        }
        if (this.f82798m != c37313i) {
            this.f82797l.setPath(pathM83866k, false);
            this.f82798m = c37313i;
        }
        float length = this.f82797l.getLength();
        float f13 = f12 * length;
        this.f82797l.getPosTan(f13, this.f82795j, this.f82796k);
        PointF pointF2 = this.f82794i;
        float[] fArr = this.f82795j;
        pointF2.set(fArr[0], fArr[1]);
        if (f13 < 0.0f) {
            PointF pointF3 = this.f82794i;
            float[] fArr2 = this.f82796k;
            pointF3.offset(fArr2[0] * f13, fArr2[1] * f13);
        } else if (f13 > length) {
            PointF pointF4 = this.f82794i;
            float[] fArr3 = this.f82796k;
            float f14 = f13 - length;
            pointF4.offset(fArr3[0] * f14, fArr3[1] * f14);
        }
        return this.f82794i;
    }

    public C37314j(List<? extends C43348a<PointF>> list) {
        super(list);
        this.f82794i = new PointF();
        this.f82795j = new float[2];
        this.f82796k = new float[2];
        this.f82797l = new PathMeasure();
    }
}
