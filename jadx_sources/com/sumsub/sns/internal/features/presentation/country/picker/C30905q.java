package com.sumsub.sns.internal.features.presentation.country.picker;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30905q {

    /* JADX INFO: renamed from: a */
    public final boolean f62437a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30905q) && this.f62437a == ((C30905q) obj).f62437a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62437a);
    }

    public final String toString() {
        return "Config(showCheckboxes=" + this.f62437a + ")";
    }

    public C30905q(boolean z11) {
        this.f62437a = z11;
    }
}
