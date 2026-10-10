package com.sumsub.sns.internal.features.presentation.prooface;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31988C extends AbstractC32018M {

    /* JADX INFO: renamed from: a */
    public final float f65031a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31988C) && Float.compare(this.f65031a, ((C31988C) obj).f65031a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65031a);
    }

    public final String toString() {
        return "Calibration(value=" + this.f65031a + ")";
    }

    public C31988C(float f11) {
        this.f65031a = f11;
    }
}
