package p248f1;

import android.graphics.Path;
import androidx.annotation.Nullable;
import java.util.List;
import p218e1.InterfaceC37039s;
import p355j1.C40206i;
import p484o1.C42929k;
import p522p1.C43348a;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.m */
/* JADX INFO: compiled from: ShapeKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37317m extends AbstractC37305a<C40206i, Path> {

    /* JADX INFO: renamed from: i */
    public final C40206i f82801i;

    /* JADX INFO: renamed from: j */
    public final Path f82802j;

    /* JADX INFO: renamed from: k */
    public Path f82803k;

    /* JADX INFO: renamed from: l */
    public Path f82804l;

    /* JADX INFO: renamed from: m */
    public List<InterfaceC37039s> f82805m;

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
    public Path mo83832i(C43348a<C40206i> c43348a, float f11) {
        C40206i c40206i = c43348a.f95709b;
        C40206i c40206i2 = c43348a.f95710c;
        this.f82801i.m88586c(c40206i, c40206i2 == null ? c40206i : c40206i2, f11);
        C40206i c40206iMo82881h = this.f82801i;
        List<InterfaceC37039s> list = this.f82805m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c40206iMo82881h = this.f82805m.get(size).mo82881h(c40206iMo82881h);
            }
        }
        C42929k.m94194h(c40206iMo82881h, this.f82802j);
        if (this.f82769e == null) {
            return this.f82802j;
        }
        if (this.f82803k == null) {
            this.f82803k = new Path();
            this.f82804l = new Path();
        }
        C42929k.m94194h(c40206i, this.f82803k);
        if (c40206i2 != null) {
            C42929k.m94194h(c40206i2, this.f82804l);
        }
        C43350c<A> c43350c = this.f82769e;
        float f12 = c43348a.f95714g;
        float fFloatValue = c43348a.f95715h.floatValue();
        Path path = this.f82803k;
        return (Path) c43350c.m95467b(f12, fFloatValue, path, c40206i2 == null ? path : this.f82804l, f11, m83828e(), m83829f());
    }

    /* JADX INFO: renamed from: r */
    public void m83872r(@Nullable List<InterfaceC37039s> list) {
        this.f82805m = list;
    }

    public C37317m(List<C43348a<C40206i>> list) {
        super(list);
        this.f82801i = new C40206i();
        this.f82802j = new Path();
    }
}
