package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.l1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32114l1 extends AbstractC32118m1 {

    /* JADX INFO: renamed from: a */
    public final SNSLiveness3dFaceViewModel$Icon f65385a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC32110k1 f65386b;

    /* JADX INFO: renamed from: c */
    public final C32081e1 f65387c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32114l1)) {
            return false;
        }
        C32114l1 c32114l1 = (C32114l1) obj;
        return this.f65385a == c32114l1.f65385a && Intrinsics.areEqual(this.f65386b, c32114l1.f65386b) && Intrinsics.areEqual(this.f65387c, c32114l1.f65387c);
    }

    public final int hashCode() {
        int iHashCode = (this.f65386b.hashCode() + (this.f65385a.hashCode() * 31)) * 31;
        C32081e1 c32081e1 = this.f65387c;
        return iHashCode + (c32081e1 == null ? 0 : c32081e1.hashCode());
    }

    public final String toString() {
        return "SessionResult(icon=" + this.f65385a + ", content=" + this.f65386b + ", tryAgainButtonState=" + this.f65387c + ")";
    }

    public C32114l1(SNSLiveness3dFaceViewModel$Icon sNSLiveness3dFaceViewModel$Icon, InterfaceC32110k1 interfaceC32110k1, C32081e1 c32081e1) {
        this.f65385a = sNSLiveness3dFaceViewModel$Icon;
        this.f65386b = interfaceC32110k1;
        this.f65387c = c32081e1;
    }
}
