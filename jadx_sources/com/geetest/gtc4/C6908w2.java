package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.w2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6908w2 extends AbstractC6788j {
    @Override // com.geetest.gtc4.AbstractC6788j
    /* JADX INFO: renamed from: i */
    public final AbstractC6931z mo12602i() {
        C6761g c6761g = new C6761g(4);
        C6851q c6851q = this.f11399a;
        if (c6851q != null) {
            c6761g.m12634a(c6851q);
        }
        C6824n c6824n = this.f11400b;
        if (c6824n != null) {
            c6761g.m12634a(c6824n);
        }
        AbstractC6905w abstractC6905w = this.f11401c;
        if (abstractC6905w != null) {
            c6761g.m12634a(abstractC6905w.mo12601h());
        }
        int i11 = this.f11402d;
        c6761g.m12634a(new C6738d3(i11 == 0, i11, this.f11403e));
        return new C6934z2(c6761g);
    }

    public C6908w2(C6934z2 c6934z2) {
        super(c6934z2);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        return this;
    }
}
