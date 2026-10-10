package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.S0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29504S0 {

    @NotNull
    public static final C29502R0 Companion = new C29502R0();

    /* JADX INFO: renamed from: a */
    public final Boolean f59524a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29504S0) && Intrinsics.areEqual(this.f59524a, ((C29504S0) obj).f59524a);
    }

    public final int hashCode() {
        Boolean bool = this.f59524a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "EmailVerificationSettings(immutableEmailIfPresent=" + this.f59524a + ")";
    }

    public /* synthetic */ C29504S0(int i11, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f59524a = null;
        } else {
            this.f59524a = bool;
        }
    }
}
