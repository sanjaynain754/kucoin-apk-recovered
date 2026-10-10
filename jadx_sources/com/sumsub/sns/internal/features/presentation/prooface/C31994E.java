package com.sumsub.sns.internal.features.presentation.prooface;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31994E extends AbstractC32018M {

    /* JADX INFO: renamed from: a */
    public final float f65041a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31994E) && Float.compare(this.f65041a, ((C31994E) obj).f65041a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65041a);
    }

    public final String toString() {
        return "EndCalibration(value=" + this.f65041a + ")";
    }

    public C31994E(float f11) {
        this.f65041a = f11;
    }
}
