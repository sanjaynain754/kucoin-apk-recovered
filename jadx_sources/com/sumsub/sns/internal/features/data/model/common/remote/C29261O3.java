package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.O3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29261O3 {

    @NotNull
    public static final C29256N3 Companion = new C29256N3();

    /* JADX INFO: renamed from: a */
    public final String f59250a;

    /* JADX INFO: renamed from: b */
    public final Boolean f59251b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29261O3)) {
            return false;
        }
        C29261O3 c29261o3 = (C29261O3) obj;
        return Intrinsics.areEqual(this.f59250a, c29261o3.f59250a) && Intrinsics.areEqual(this.f59251b, c29261o3.f59251b);
    }

    public final int hashCode() {
        String str = this.f59250a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f59251b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "SumsubIdRemoteConfig(type=" + this.f59250a + ", enabledByDefault=" + this.f59251b + ")";
    }

    public /* synthetic */ C29261O3(int i11, Boolean bool, String str) {
        if ((i11 & 1) == 0) {
            this.f59250a = null;
        } else {
            this.f59250a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59251b = null;
        } else {
            this.f59251b = bool;
        }
    }
}
