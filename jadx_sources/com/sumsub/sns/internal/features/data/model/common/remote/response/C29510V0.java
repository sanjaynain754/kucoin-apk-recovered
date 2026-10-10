package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.V0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29510V0 {

    @NotNull
    public static final C29508U0 Companion = new C29508U0();

    /* JADX INFO: renamed from: a */
    public final String f59531a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29510V0) && Intrinsics.areEqual(this.f59531a, ((C29510V0) obj).f59531a);
    }

    public final int hashCode() {
        String str = this.f59531a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "NfcVerificationSettings(mode=" + this.f59531a + ")";
    }

    public /* synthetic */ C29510V0(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f59531a = null;
        } else {
            this.f59531a = str;
        }
    }
}
