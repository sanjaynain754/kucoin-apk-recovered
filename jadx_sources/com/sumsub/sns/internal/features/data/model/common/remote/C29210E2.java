package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.E2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29210E2 {

    @NotNull
    public static final C29205D2 Companion = new C29205D2();

    /* JADX INFO: renamed from: a */
    public final String f59198a;

    /* JADX INFO: renamed from: b */
    public final String f59199b;

    /* JADX INFO: renamed from: c */
    public final String f59200c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29210E2)) {
            return false;
        }
        C29210E2 c29210e2 = (C29210E2) obj;
        return Intrinsics.areEqual(this.f59198a, c29210e2.f59198a) && Intrinsics.areEqual(this.f59199b, c29210e2.f59199b) && Intrinsics.areEqual(this.f59200c, c29210e2.f59200c);
    }

    public final int hashCode() {
        String str = this.f59198a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59199b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59200c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Payload(sessionId=" + this.f59198a + ", status=" + this.f59199b + ", newToken=" + this.f59200c + ")";
    }

    public /* synthetic */ C29210E2(int i11, String str, String str2, String str3) {
        if ((i11 & 1) == 0) {
            this.f59198a = null;
        } else {
            this.f59198a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59199b = null;
        } else {
            this.f59199b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59200c = null;
        } else {
            this.f59200c = str3;
        }
    }
}
