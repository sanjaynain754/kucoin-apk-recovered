package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.p1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30610p1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC29180q2 f61840a;

    /* JADX INFO: renamed from: b */
    public final IdentitySide f61841b;

    /* JADX INFO: renamed from: c */
    public final Float f61842c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30610p1)) {
            return false;
        }
        C30610p1 c30610p1 = (C30610p1) obj;
        return Intrinsics.areEqual(this.f61840a, c30610p1.f61840a) && this.f61841b == c30610p1.f61841b && Intrinsics.areEqual((Object) this.f61842c, (Object) c30610p1.f61842c);
    }

    public final int hashCode() {
        AbstractC29180q2 abstractC29180q2 = this.f61840a;
        int iHashCode = (abstractC29180q2 == null ? 0 : abstractC29180q2.hashCode()) * 31;
        IdentitySide identitySide = this.f61841b;
        int iHashCode2 = (iHashCode + (identitySide == null ? 0 : identitySide.hashCode())) * 31;
        Float f11 = this.f61842c;
        return iHashCode2 + (f11 != null ? f11.hashCode() : 0);
    }

    public final String toString() {
        return "TiltHint(type=" + this.f61840a + ", currentSide=" + this.f61841b + ", cycleDurationSec=" + this.f61842c + ")";
    }

    public C30610p1(AbstractC29180q2 abstractC29180q2, IdentitySide identitySide, Float f11) {
        this.f61840a = abstractC29180q2;
        this.f61841b = identitySide;
        this.f61842c = f11;
    }
}
