package p248f1;

import java.util.List;
import p484o1.C42929k;
import p522p1.C43348a;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.f */
/* JADX INFO: compiled from: IntegerKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37310f extends AbstractC37311g<Integer> {
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
    public int m83860r(C43348a<Integer> c43348a, float f11) {
        float f12;
        if (c43348a.f95709b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iM95457h = c43348a.f95710c == null ? c43348a.m95457h() : c43348a.m95454e();
        C43350c<A> c43350c = this.f82769e;
        if (c43350c != 0) {
            f12 = f11;
            Integer num = (Integer) c43350c.m95467b(c43348a.f95714g, c43348a.f95715h.floatValue(), c43348a.f95709b, Integer.valueOf(iM95457h), f12, m83828e(), m83829f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f12 = f11;
        }
        return C42929k.m94196j(c43348a.m95457h(), iM95457h, f12);
    }

    public C37310f(List<C43348a<Integer>> list) {
        super(list);
    }

    /* JADX INFO: renamed from: q */
    public int m83859q() {
        return m83860r(m83825b(), m83827d());
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer mo83832i(C43348a<Integer> c43348a, float f11) {
        return Integer.valueOf(m83860r(c43348a, f11));
    }
}
