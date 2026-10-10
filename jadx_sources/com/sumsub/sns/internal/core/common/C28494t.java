package com.sumsub.sns.internal.core.common;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28494t extends AbstractC28503w {

    /* JADX INFO: renamed from: b */
    public final boolean f58028b;

    public C28494t() {
        super("Completed");
        this.f58028b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28494t) && this.f58028b == ((C28494t) obj).f58028b;
    }

    public C28494t(boolean z11) {
        super("Completed");
        this.f58028b = z11;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58028b);
    }

    @Override // com.sumsub.sns.internal.core.common.AbstractC28503w
    public final String toString() {
        return "Completed(goToNextDocument=" + this.f58028b + ")";
    }
}
