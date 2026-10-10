package com.sumsub.sns.internal.features.presentation.prooface;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.a1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32061a1 implements InterfaceC32071c1 {

    /* JADX INFO: renamed from: a */
    public final float f65231a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32061a1) && Float.compare(this.f65231a, ((C32061a1) obj).f65231a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65231a);
    }

    public final String toString() {
        return "Custom(exposure=" + this.f65231a + ")";
    }

    public C32061a1(float f11) {
        this.f65231a = f11;
    }
}
