package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.g2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29367g2 {

    @NotNull
    public static final C29359f2 Companion = new C29359f2();

    /* JADX INFO: renamed from: a */
    public final String f59378a;

    /* JADX INFO: renamed from: b */
    public final String f59379b;

    /* JADX INFO: renamed from: c */
    public final String f59380c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29367g2)) {
            return false;
        }
        C29367g2 c29367g2 = (C29367g2) obj;
        return Intrinsics.areEqual(this.f59378a, c29367g2.f59378a) && Intrinsics.areEqual(this.f59379b, c29367g2.f59379b) && Intrinsics.areEqual(this.f59380c, c29367g2.f59380c);
    }

    public final int hashCode() {
        String str = this.f59378a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59379b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59380c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Payload(sessionId=" + this.f59378a + ", status=" + this.f59379b + ", newToken=" + this.f59380c + ")";
    }

    public /* synthetic */ C29367g2(int i11, String str, String str2, String str3) {
        if ((i11 & 1) == 0) {
            this.f59378a = null;
        } else {
            this.f59378a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59379b = null;
        } else {
            this.f59379b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59380c = null;
        } else {
            this.f59380c = str3;
        }
    }
}
