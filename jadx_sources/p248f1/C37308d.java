package p248f1;

import java.util.List;
import p484o1.C42929k;
import p522p1.C43348a;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.d */
/* JADX INFO: compiled from: FloatKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37308d extends AbstractC37311g<Float> {
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
    public float m83856r(C43348a<Float> c43348a, float f11) {
        float f12;
        if (c43348a.f95709b == null || c43348a.f95710c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C43350c<A> c43350c = this.f82769e;
        if (c43350c != 0) {
            f12 = f11;
            Float f13 = (Float) c43350c.m95467b(c43348a.f95714g, c43348a.f95715h.floatValue(), c43348a.f95709b, c43348a.f95710c, f12, m83828e(), m83829f());
            if (f13 != null) {
                return f13.floatValue();
            }
        } else {
            f12 = f11;
        }
        return C42929k.m94195i(c43348a.m95456g(), c43348a.m95453d(), f12);
    }

    public C37308d(List<C43348a<Float>> list) {
        super(list);
    }

    /* JADX INFO: renamed from: q */
    public float m83855q() {
        return m83856r(m83825b(), m83827d());
    }

    @Override // p248f1.AbstractC37305a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float mo83832i(C43348a<Float> c43348a, float f11) {
        return Float.valueOf(m83856r(c43348a, f11));
    }
}
