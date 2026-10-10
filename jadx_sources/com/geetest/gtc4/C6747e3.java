package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.e3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6747e3 extends C6808l1 {

    /* JADX INFO: renamed from: d */
    public final boolean f11347d;

    @Override // com.geetest.gtc4.C6808l1, com.geetest.gtc4.InterfaceC6785i5
    /* JADX INFO: renamed from: b */
    public final AbstractC6905w mo12597b() {
        C6726c0 c6726c0 = this.f11424c;
        int i11 = this.f11422a;
        int i12 = this.f11423b;
        if (!this.f11347d) {
            return new C6738d3(4, i11, i12, new C6782i2(((C6774h3) c6726c0.f11323a).m12654b()));
        }
        C6761g c6761gM12617a = c6726c0.m12617a();
        int i13 = c6761gM12617a.f11365b;
        if (i13 == 1) {
            return new C6738d3(3, i11, i12, c6761gM12617a.m12633a(0));
        }
        C6934z2 c6934z2 = AbstractC6917x2.f11550a;
        return new C6738d3(4, i11, i12, i13 < 1 ? AbstractC6917x2.f11550a : new C6934z2(c6761gM12617a));
    }

    public C6747e3(int i11, int i12, boolean z11, C6726c0 c6726c0) {
        super(i11, i12, c6726c0);
        this.f11347d = z11;
    }
}
