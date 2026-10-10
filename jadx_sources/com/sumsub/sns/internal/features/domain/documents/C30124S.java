package com.sumsub.sns.internal.features.domain.documents;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30124S extends AbstractC30125T {

    /* JADX INFO: renamed from: a */
    public final int f60564a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30124S) && this.f60564a == ((C30124S) obj).f60564a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60564a);
    }

    public final String toString() {
        return "Uploading(percentage=" + this.f60564a + ")";
    }

    public C30124S(int i11) {
        this.f60564a = i11;
    }
}
