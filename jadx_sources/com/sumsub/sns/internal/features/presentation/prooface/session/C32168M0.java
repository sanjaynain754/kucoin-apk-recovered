package com.sumsub.sns.internal.features.presentation.prooface.session;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.M0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32168M0 {

    /* JADX INFO: renamed from: a */
    public final float f65494a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32168M0) && Float.compare(this.f65494a, ((C32168M0) obj).f65494a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65494a);
    }

    public final String toString() {
        return "Progress(progress=" + this.f65494a + ")";
    }

    public C32168M0(float f11) {
        this.f65494a = f11;
    }
}
