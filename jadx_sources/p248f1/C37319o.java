package p248f1;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;
import p522p1.C43348a;
import p522p1.C43349b;
import p522p1.C43350c;

/* JADX INFO: renamed from: f1.o */
/* JADX INFO: compiled from: TextKeyframeAnimation.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37319o extends AbstractC37311g<DocumentData> {

    /* JADX INFO: renamed from: f1.o$a */
    /* JADX INFO: compiled from: TextKeyframeAnimation.java */
    public class a extends C43350c<DocumentData> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C43349b f82812d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C43350c f82813e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DocumentData f82814f;

        public a(C43349b c43349b, C43350c c43350c, DocumentData documentData) {
            this.f82812d = c43349b;
            this.f82813e = c43350c;
            this.f82814f = documentData;
        }

        @Override // p522p1.C43350c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DocumentData mo5530a(C43349b<DocumentData> c43349b) {
            this.f82812d.m95466h(c43349b.m95464f(), c43349b.m95459a(), c43349b.m95465g().f6033a, c43349b.m95460b().f6033a, c43349b.m95462d(), c43349b.m95461c(), c43349b.m95463e());
            String str = (String) this.f82813e.mo5530a(this.f82812d);
            DocumentData documentDataM95460b = c43349b.m95461c() == 1.0f ? c43349b.m95460b() : c43349b.m95465g();
            this.f82814f.m5683a(str, documentDataM95460b.f6034b, documentDataM95460b.f6035c, documentDataM95460b.f6036d, documentDataM95460b.f6037e, documentDataM95460b.f6038f, documentDataM95460b.f6039g, documentDataM95460b.f6040h, documentDataM95460b.f6041i, documentDataM95460b.f6042j, documentDataM95460b.f6043k, documentDataM95460b.f6044l, documentDataM95460b.f6045m);
            return this.f82814f;
        }
    }

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
    public DocumentData mo83832i(C43348a<DocumentData> c43348a, float f11) {
        DocumentData documentData;
        C43350c<A> c43350c = this.f82769e;
        if (c43350c == 0) {
            return (f11 != 1.0f || (documentData = c43348a.f95710c) == null) ? c43348a.f95709b : documentData;
        }
        float f12 = c43348a.f95714g;
        Float f13 = c43348a.f95715h;
        float fFloatValue = f13 == null ? Float.MAX_VALUE : f13.floatValue();
        DocumentData documentData2 = c43348a.f95709b;
        DocumentData documentData3 = documentData2;
        DocumentData documentData4 = c43348a.f95710c;
        return (DocumentData) c43350c.m95467b(f12, fFloatValue, documentData3, documentData4 == null ? documentData2 : documentData4, f11, m83827d(), m83829f());
    }

    /* JADX INFO: renamed from: r */
    public void m83878r(C43350c<String> c43350c) {
        super.m83838o(new a(new C43349b(), c43350c, new DocumentData()));
    }

    public C37319o(List<C43348a<DocumentData>> list) {
        super(list);
    }
}
