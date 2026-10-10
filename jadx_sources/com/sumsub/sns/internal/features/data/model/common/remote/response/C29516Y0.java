package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.Y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29516Y0 {

    @NotNull
    public static final C29514X0 Companion = new C29514X0();

    /* JADX INFO: renamed from: a */
    public final Boolean f59537a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29516Y0) && Intrinsics.areEqual(this.f59537a, ((C29516Y0) obj).f59537a);
    }

    public final int hashCode() {
        Boolean bool = this.f59537a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "PhoneVerificationSettings(immutablePhoneIfPresent=" + this.f59537a + ")";
    }

    public /* synthetic */ C29516Y0(int i11, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f59537a = null;
        } else {
            this.f59537a = bool;
        }
    }
}
