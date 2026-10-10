package com.sumsub.sns.internal.features.presentation.prooface;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32000G extends AbstractC32018M {

    /* JADX INFO: renamed from: a */
    public final float f65051a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32000G) && Float.compare(this.f65051a, ((C32000G) obj).f65051a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65051a);
    }

    public final String toString() {
        return "Progress(progress=" + this.f65051a + ")";
    }

    public C32000G(float f11) {
        this.f65051a = f11;
    }
}
