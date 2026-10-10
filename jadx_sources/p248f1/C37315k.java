package p248f1;

import android.graphics.PointF;
import java.util.List;
import p522p1.C43348a;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.k */
/* JADX INFO: compiled from: PointKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37315k extends AbstractC37311g<PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f82799i;

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
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF mo83833j(C43348a<PointF> c43348a, float f11, float f12, float f13) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c43348a.f95709b;
        if (pointF3 == null || (pointF = c43348a.f95710c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C43350c<A> c43350c = this.f82769e;
        if (c43350c != 0 && (pointF2 = (PointF) c43350c.m95467b(c43348a.f95714g, c43348a.f95715h.floatValue(), pointF4, pointF5, f11, m83828e(), m83829f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f82799i;
        float f14 = pointF4.x;
        float f15 = f14 + (f12 * (pointF5.x - f14));
        float f16 = pointF4.y;
        pointF6.set(f15, f16 + (f13 * (pointF5.y - f16)));
        return this.f82799i;
    }

    public C37315k(List<C43348a<PointF>> list) {
        super(list);
        this.f82799i = new PointF();
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF mo83832i(C43348a<PointF> c43348a, float f11) {
        return mo83833j(c43348a, f11, f11, f11);
    }
}
