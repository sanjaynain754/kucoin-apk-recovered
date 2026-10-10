package p248f1;

import java.util.List;
import p484o1.C42922d;
import p484o1.C42929k;
import p522p1.C43348a;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.b */
/* JADX INFO: compiled from: ColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37306b extends AbstractC37311g<Integer> {
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
    /* JADX INFO: renamed from: r */
    public int m83846r(C43348a<Integer> c43348a, float f11) {
        float f12;
        Float f13;
        if (c43348a.f95709b == null || c43348a.f95710c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C43350c<A> c43350c = this.f82769e;
        if (c43350c == 0 || (f13 = c43348a.f95715h) == null) {
            f12 = f11;
        } else {
            f12 = f11;
            Integer num = (Integer) c43350c.m95467b(c43348a.f95714g, f13.floatValue(), c43348a.f95709b, c43348a.f95710c, f12, m83828e(), m83829f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C42922d.m94154c(C42929k.m94188b(f12, 0.0f, 1.0f), c43348a.f95709b.intValue(), c43348a.f95710c.intValue());
    }

    public C37306b(List<C43348a<Integer>> list) {
        super(list);
    }

    /* JADX INFO: renamed from: q */
    public int m83845q() {
        return m83846r(m83825b(), m83827d());
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer mo83832i(C43348a<Integer> c43348a, float f11) {
        return Integer.valueOf(m83846r(c43348a, f11));
    }
}
