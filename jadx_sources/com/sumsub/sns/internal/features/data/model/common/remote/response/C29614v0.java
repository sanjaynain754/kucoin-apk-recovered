package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29614v0 {

    @NotNull
    public static final C29610u0 Companion = new C29610u0();

    /* JADX INFO: renamed from: b */
    public static final Lazy[] f59668b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.i3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EKycFlowStatus.Companion.serializer();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final EKycFlowStatus f59669a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29614v0) && this.f59669a == ((C29614v0) obj).f59669a;
    }

    public final int hashCode() {
        EKycFlowStatus eKycFlowStatus = this.f59669a;
        if (eKycFlowStatus == null) {
            return 0;
        }
        return eKycFlowStatus.hashCode();
    }

    public final String toString() {
        return "SkipEKycResponse(status=" + this.f59669a + ")";
    }

    public /* synthetic */ C29614v0(int i11, EKycFlowStatus eKycFlowStatus) {
        if ((i11 & 1) == 0) {
            this.f59669a = null;
        } else {
            this.f59669a = eKycFlowStatus;
        }
    }
}
