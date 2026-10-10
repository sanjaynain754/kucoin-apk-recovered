package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.f1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29546f1 {

    @NotNull
    public static final C29541e1 Companion = new C29541e1();

    /* JADX INFO: renamed from: a */
    public final Boolean f59565a;

    /* JADX INFO: renamed from: b */
    public final String f59566b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29546f1)) {
            return false;
        }
        C29546f1 c29546f1 = (C29546f1) obj;
        return Intrinsics.areEqual(this.f59565a, c29546f1.f59565a) && Intrinsics.areEqual(this.f59566b, c29546f1.f59566b);
    }

    public final int hashCode() {
        Boolean bool = this.f59565a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f59566b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BankCard(allowed=" + this.f59565a + ", countImages=" + this.f59566b + ")";
    }

    public /* synthetic */ C29546f1(int i11, Boolean bool, String str) {
        if ((i11 & 1) == 0) {
            this.f59565a = null;
        } else {
            this.f59565a = bool;
        }
        if ((i11 & 2) == 0) {
            this.f59566b = null;
        } else {
            this.f59566b = str;
        }
    }
}
