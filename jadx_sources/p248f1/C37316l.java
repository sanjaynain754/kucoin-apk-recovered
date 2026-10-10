package p248f1;

import java.util.List;
import p484o1.C42929k;
import p522p1.C43348a;
import p522p1.C43350c;
import p522p1.C43351d;

/* JADX INFO: renamed from: f1.l */
/* JADX INFO: compiled from: ScaleKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37316l extends AbstractC37311g<C43351d> {

    /* JADX INFO: renamed from: i */
    public final C43351d f82800i;

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
    public C43351d mo83832i(C43348a<C43351d> c43348a, float f11) {
        C43351d c43351d;
        float f12;
        C43351d c43351d2 = c43348a.f95709b;
        if (c43351d2 == null || (c43351d = c43348a.f95710c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C43351d c43351d3 = c43351d2;
        C43351d c43351d4 = c43351d;
        C43350c<A> c43350c = this.f82769e;
        if (c43350c != 0) {
            f12 = f11;
            C43351d c43351d5 = (C43351d) c43350c.m95467b(c43348a.f95714g, c43348a.f95715h.floatValue(), c43351d3, c43351d4, f12, m83828e(), m83829f());
            if (c43351d5 != null) {
                return c43351d5;
            }
        } else {
            f12 = f11;
        }
        this.f82800i.m95472d(C42929k.m94195i(c43351d3.m95470b(), c43351d4.m95470b(), f12), C42929k.m94195i(c43351d3.m95471c(), c43351d4.m95471c(), f12));
        return this.f82800i;
    }

    public C37316l(List<C43348a<C43351d>> list) {
        super(list);
        this.f82800i = new C43351d();
    }
}
