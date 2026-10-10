package com.sumsub.sns.core.presentation.base;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28152u implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final boolean f57394a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28152u) && this.f57394a == ((C28152u) obj).f57394a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57394a);
    }

    public final String toString() {
        return "ShowProgressEvent(show=" + this.f57394a + ")";
    }

    public C28152u(boolean z11) {
        this.f57394a = z11;
    }
}
