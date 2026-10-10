package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29301X {

    @NotNull
    public static final C29296W Companion = new C29296W();

    /* JADX INFO: renamed from: a */
    public final String f59310a;

    /* JADX INFO: renamed from: b */
    public final String f59311b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29301X)) {
            return false;
        }
        C29301X c29301x = (C29301X) obj;
        return Intrinsics.areEqual(this.f59310a, c29301x.f59310a) && Intrinsics.areEqual(this.f59311b, c29301x.f59311b);
    }

    public final int hashCode() {
        String str = this.f59310a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59311b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Kinegram(clientUrl=" + this.f59310a + ", clientId=" + this.f59311b + ")";
    }

    public /* synthetic */ C29301X(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f59310a = null;
        } else {
            this.f59310a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59311b = null;
        } else {
            this.f59311b = str2;
        }
    }
}
