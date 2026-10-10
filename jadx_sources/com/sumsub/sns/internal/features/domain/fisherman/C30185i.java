package com.sumsub.sns.internal.features.domain.fisherman;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.fisherman.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C30185i {

    @NotNull
    public static final C30184h Companion = new C30184h();

    /* JADX INFO: renamed from: a */
    public final String f60667a;

    /* JADX INFO: renamed from: b */
    public final String f60668b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30185i)) {
            return false;
        }
        C30185i c30185i = (C30185i) obj;
        return Intrinsics.areEqual(this.f60667a, c30185i.f60667a) && Intrinsics.areEqual(this.f60668b, c30185i.f60668b);
    }

    public final int hashCode() {
        String str = this.f60667a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60668b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FishermanSimulationConfigDto(visitorId=" + this.f60667a + ", requestId=" + this.f60668b + ")";
    }

    public /* synthetic */ C30185i(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f60667a = null;
        } else {
            this.f60667a = str;
        }
        if ((i11 & 2) == 0) {
            this.f60668b = null;
        } else {
            this.f60668b = str2;
        }
    }
}
