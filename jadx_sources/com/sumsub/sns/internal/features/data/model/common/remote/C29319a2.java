package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.a2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29319a2 {

    @NotNull
    public static final C29313Z1 Companion = new C29313Z1();

    /* JADX INFO: renamed from: a */
    public final String f59331a;

    /* JADX INFO: renamed from: b */
    public final String f59332b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29319a2)) {
            return false;
        }
        C29319a2 c29319a2 = (C29319a2) obj;
        return Intrinsics.areEqual(this.f59331a, c29319a2.f59331a) && Intrinsics.areEqual(this.f59332b, c29319a2.f59332b);
    }

    public final int hashCode() {
        String str = this.f59331a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59332b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Payload(imageId=" + this.f59331a + ", sessionId=" + this.f59332b + ")";
    }

    public /* synthetic */ C29319a2(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f59331a = null;
        } else {
            this.f59331a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59332b = null;
        } else {
            this.f59332b = str2;
        }
    }
}
