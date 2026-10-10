package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.G1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29475G1 {

    @NotNull
    public static final C29472F1 Companion = new C29472F1();

    /* JADX INFO: renamed from: a */
    public final String f59478a;

    /* JADX INFO: renamed from: b */
    public final String f59479b;

    /* JADX INFO: renamed from: c */
    public final String f59480c;

    /* JADX INFO: renamed from: d */
    public final Boolean f59481d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29475G1)) {
            return false;
        }
        C29475G1 c29475g1 = (C29475G1) obj;
        return Intrinsics.areEqual(this.f59478a, c29475g1.f59478a) && Intrinsics.areEqual(this.f59479b, c29475g1.f59479b) && Intrinsics.areEqual(this.f59480c, c29475g1.f59480c) && Intrinsics.areEqual(this.f59481d, c29475g1.f59481d);
    }

    public final int hashCode() {
        String str = this.f59478a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59479b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59480c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f59481d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "WorkflowStatus(workflowId=" + this.f59478a + ", runId=" + this.f59479b + ", runStatus=" + this.f59480c + ", levelChangePossible=" + this.f59481d + ")";
    }

    public /* synthetic */ C29475G1(int i11, String str, String str2, String str3, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f59478a = null;
        } else {
            this.f59478a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59479b = null;
        } else {
            this.f59479b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59480c = null;
        } else {
            this.f59480c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59481d = null;
        } else {
            this.f59481d = bool;
        }
    }
}
