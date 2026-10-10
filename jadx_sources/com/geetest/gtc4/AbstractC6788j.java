package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.j */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6788j extends AbstractC6905w {

    /* JADX INFO: renamed from: a */
    public final C6851q f11399a;

    /* JADX INFO: renamed from: b */
    public final C6824n f11400b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6905w f11401c;

    /* JADX INFO: renamed from: d */
    public final int f11402d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6905w f11403e;

    public AbstractC6788j(AbstractC6931z abstractC6931z) {
        AbstractC6905w abstractC6905wMo12598d;
        if (abstractC6931z.mo12673k() <= 0) {
            throw new IllegalArgumentException("too few objects in input sequence");
        }
        int i11 = 0;
        AbstractC6905w abstractC6905wMo12598d2 = abstractC6931z.mo12672a(0).mo12598d();
        if (abstractC6905wMo12598d2 instanceof C6851q) {
            this.f11399a = (C6851q) abstractC6905wMo12598d2;
            if (abstractC6931z.mo12673k() <= 1) {
                throw new IllegalArgumentException("too few objects in input sequence");
            }
            abstractC6905wMo12598d2 = abstractC6931z.mo12672a(1).mo12598d();
            i11 = 1;
        }
        if (abstractC6905wMo12598d2 instanceof C6824n) {
            this.f11400b = (C6824n) abstractC6905wMo12598d2;
            i11++;
            if (abstractC6931z.mo12673k() <= i11) {
                throw new IllegalArgumentException("too few objects in input sequence");
            }
            abstractC6905wMo12598d2 = abstractC6931z.mo12672a(i11).mo12598d();
        }
        if (!(abstractC6905wMo12598d2 instanceof AbstractC6735d0)) {
            this.f11401c = abstractC6905wMo12598d2;
            i11++;
            if (abstractC6931z.mo12673k() <= i11) {
                throw new IllegalArgumentException("too few objects in input sequence");
            }
            abstractC6905wMo12598d2 = abstractC6931z.mo12672a(i11).mo12598d();
        }
        if (abstractC6931z.mo12673k() != i11 + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (!(abstractC6905wMo12598d2 instanceof AbstractC6735d0)) {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        AbstractC6735d0 abstractC6735d0 = (AbstractC6735d0) abstractC6905wMo12598d2;
        int i12 = abstractC6735d0.f11335c;
        if (i12 < 0 || i12 > 2) {
            throw new IllegalArgumentException("invalid encoding value: " + i12);
        }
        this.f11402d = i12;
        int i13 = abstractC6735d0.f11334b;
        if (i13 != 128) {
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(i13 != 64 ? i13 != 128 ? i13 != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
        }
        if (i12 != 0) {
            if (i12 == 1) {
                abstractC6905wMo12598d = (AbstractC6869s) AbstractC6869s.f11485b.m12630a(abstractC6735d0);
            } else {
                if (i12 != 2) {
                    throw new IllegalArgumentException("invalid tag: " + AbstractC6762g0.m12635a(abstractC6735d0.f11334b, abstractC6735d0.f11335c));
                }
                abstractC6905wMo12598d = (AbstractC6716b) AbstractC6716b.f11310b.m12630a(abstractC6735d0);
            }
        } else {
            if (!abstractC6735d0.m12624i()) {
                throw new IllegalStateException("object implicit - explicit expected.");
            }
            InterfaceC6752f interfaceC6752f = abstractC6735d0.f11336d;
            abstractC6905wMo12598d = interfaceC6752f instanceof AbstractC6905w ? (AbstractC6905w) interfaceC6752f : interfaceC6752f.mo12598d();
            abstractC6905wMo12598d.getClass();
        }
        this.f11403e = abstractC6905wMo12598d;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        return mo12602i().mo12612a(z11);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract AbstractC6931z mo12602i();

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12722a(z11, 40);
        mo12602i().mo12613a(c6887u, false);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public AbstractC6905w mo12600g() {
        return new C6710a2(this.f11399a, this.f11400b, this.f11401c, this.f11402d, this.f11403e);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        C6851q c6851q = this.f11399a;
        int iHashCode = c6851q == null ? 0 : c6851q.hashCode();
        C6824n c6824n = this.f11400b;
        int iHashCode2 = iHashCode ^ (c6824n == null ? 0 : c6824n.hashCode());
        AbstractC6905w abstractC6905w = this.f11401c;
        return ((iHashCode2 ^ (abstractC6905w != null ? abstractC6905w.hashCode() : 0)) ^ this.f11402d) ^ this.f11403e.hashCode();
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        C6824n c6824n;
        C6824n c6824n2;
        AbstractC6905w abstractC6905w2;
        AbstractC6905w abstractC6905w3;
        if (this == abstractC6905w) {
            return true;
        }
        if (!(abstractC6905w instanceof AbstractC6788j)) {
            return false;
        }
        AbstractC6788j abstractC6788j = (AbstractC6788j) abstractC6905w;
        C6851q c6851q = this.f11399a;
        C6851q c6851q2 = abstractC6788j.f11399a;
        return (c6851q == c6851q2 || !(c6851q == null || c6851q2 == null || !c6851q.equals(c6851q2))) && ((c6824n = this.f11400b) == (c6824n2 = abstractC6788j.f11400b) || !(c6824n == null || c6824n2 == null || !c6824n.equals(c6824n2))) && (((abstractC6905w2 = this.f11401c) == (abstractC6905w3 = abstractC6788j.f11401c) || !(abstractC6905w2 == null || abstractC6905w3 == null || !abstractC6905w2.equals(abstractC6905w3))) && this.f11402d == abstractC6788j.f11402d && this.f11403e.m12732b(abstractC6788j.f11403e));
    }

    public AbstractC6788j(C6851q c6851q, C6824n c6824n, AbstractC6905w abstractC6905w, int i11, AbstractC6905w abstractC6905w2) {
        this.f11399a = c6851q;
        this.f11400b = c6824n;
        this.f11401c = abstractC6905w;
        if (i11 >= 0 && i11 <= 2) {
            this.f11402d = i11;
            if (i11 != 1) {
                if (i11 == 2 && !AbstractC6716b.class.isInstance(abstractC6905w2)) {
                    throw new IllegalStateException("unexpected object: ".concat(abstractC6905w2.getClass().getName()));
                }
            } else if (!AbstractC6869s.class.isInstance(abstractC6905w2)) {
                throw new IllegalStateException("unexpected object: ".concat(abstractC6905w2.getClass().getName()));
            }
            this.f11403e = abstractC6905w2;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i11);
    }
}
