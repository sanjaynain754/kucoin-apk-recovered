package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.w */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6905w implements InterfaceC6752f {
    /* JADX INFO: renamed from: a */
    public abstract int mo12612a(boolean z11);

    /* JADX INFO: renamed from: a */
    public abstract void mo12613a(C6887u c6887u, boolean z11);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo12606a(AbstractC6905w abstractC6905w);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC6752f) && mo12606a(((InterfaceC6752f) obj).mo12598d());
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo12610f();

    public abstract int hashCode();

    /* JADX INFO: renamed from: b */
    public final boolean m12732b(AbstractC6905w abstractC6905w) {
        return this == abstractC6905w || mo12606a(abstractC6905w);
    }

    @Override // com.geetest.gtc4.InterfaceC6752f
    /* JADX INFO: renamed from: d */
    public final AbstractC6905w mo12598d() {
        return this;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC6905w mo12600g() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC6905w mo12601h() {
        return this;
    }
}
