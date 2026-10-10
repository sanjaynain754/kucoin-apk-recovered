package com.sumsub.sns.internal.features.presentation.prooface.session;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32200c implements InterfaceC32203d {

    /* JADX INFO: renamed from: a */
    public final float f65576a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32200c) && Float.compare(this.f65576a, ((C32200c) obj).f65576a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65576a);
    }

    public final String toString() {
        return "Requirement(exposure=" + this.f65576a + ")";
    }

    public C32200c(float f11) {
        this.f65576a = f11;
    }
}
