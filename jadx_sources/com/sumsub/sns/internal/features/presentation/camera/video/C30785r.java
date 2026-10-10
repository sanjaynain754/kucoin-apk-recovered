package com.sumsub.sns.internal.features.presentation.camera.video;

import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30785r implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final C30786s f62194a;

    /* JADX INFO: renamed from: b */
    public final SNSVideoSelfieViewModel$State f62195b;

    public C30785r(C30786s c30786s, SNSVideoSelfieViewModel$State sNSVideoSelfieViewModel$State) {
        this.f62194a = c30786s;
        this.f62195b = sNSVideoSelfieViewModel$State;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30785r)) {
            return false;
        }
        C30785r c30785r = (C30785r) obj;
        return Intrinsics.areEqual(this.f62194a, c30785r.f62194a) && this.f62195b == c30785r.f62195b;
    }

    /* JADX INFO: renamed from: a */
    public static C30785r m70456a(C30785r c30785r, C30786s c30786s, SNSVideoSelfieViewModel$State sNSVideoSelfieViewModel$State, int i11) {
        if ((i11 & 1) != 0) {
            c30786s = c30785r.f62194a;
        }
        if ((i11 & 2) != 0) {
            sNSVideoSelfieViewModel$State = c30785r.f62195b;
        }
        c30785r.getClass();
        return new C30785r(c30786s, sNSVideoSelfieViewModel$State);
    }

    public final int hashCode() {
        int iHashCode = this.f62194a.hashCode() * 31;
        SNSVideoSelfieViewModel$State sNSVideoSelfieViewModel$State = this.f62195b;
        return iHashCode + (sNSVideoSelfieViewModel$State == null ? 0 : sNSVideoSelfieViewModel$State.hashCode());
    }

    public final String toString() {
        return "ViewState(viewText=" + this.f62194a + ", state=" + this.f62195b + ")";
    }

    public C30785r() {
        this.f62194a = new C30786s();
        this.f62195b = null;
    }
}
