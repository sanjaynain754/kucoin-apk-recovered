package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29549g {

    @NotNull
    public static final C29544f Companion = new C29544f();

    /* JADX INFO: renamed from: a */
    public final String f59567a;

    /* JADX INFO: renamed from: b */
    public final String f59568b;

    /* JADX INFO: renamed from: c */
    public final String f59569c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29549g)) {
            return false;
        }
        C29549g c29549g = (C29549g) obj;
        return Intrinsics.areEqual(this.f59567a, c29549g.f59567a) && Intrinsics.areEqual(this.f59568b, c29549g.f59568b) && Intrinsics.areEqual(this.f59569c, c29549g.f59569c);
    }

    public final int hashCode() {
        int iHashCode = this.f59567a.hashCode() * 31;
        String str = this.f59568b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59569c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Applicant(id=" + this.f59567a + ", externalUserId=" + this.f59568b + ", lang=" + this.f59569c + ")";
    }

    public /* synthetic */ C29549g(int i11, String str, String str2, String str3) {
        this.f59567a = (i11 & 1) == 0 ? "" : str;
        if ((i11 & 2) == 0) {
            this.f59568b = null;
        } else {
            this.f59568b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59569c = null;
        } else {
            this.f59569c = str3;
        }
    }
}
