package com.sumsub.sns.internal.features.domain.navigation.model;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30274C {

    /* JADX INFO: renamed from: a */
    public final C30277b f60864a;

    /* JADX INFO: renamed from: b */
    public final C30278c f60865b;

    /* JADX INFO: renamed from: c */
    public final String f60866c;

    /* JADX INFO: renamed from: d */
    public final C30272A f60867d;

    /* JADX INFO: renamed from: e */
    public final C30276a f60868e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30274C)) {
            return false;
        }
        C30274C c30274c = (C30274C) obj;
        return Intrinsics.areEqual(this.f60864a, c30274c.f60864a) && Intrinsics.areEqual(this.f60865b, c30274c.f60865b) && Intrinsics.areEqual(this.f60866c, c30274c.f60866c) && Intrinsics.areEqual(this.f60867d, c30274c.f60867d) && Intrinsics.areEqual(this.f60868e, c30274c.f60868e);
    }

    public final int hashCode() {
        int iHashCode = (this.f60865b.hashCode() + (this.f60864a.hashCode() * 31)) * 31;
        String str = this.f60866c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C30272A c30272a = this.f60867d;
        int iHashCode3 = (iHashCode2 + (c30272a == null ? 0 : c30272a.hashCode())) * 31;
        C30276a c30276a = this.f60868e;
        return iHashCode3 + (c30276a != null ? c30276a.hashCode() : 0);
    }

    public final String toString() {
        return "ServerNavigationState(navigation=" + this.f60864a + ", step=" + this.f60865b + ", version=" + this.f60866c + ", params=" + this.f60867d + ", applicantReview=" + this.f60868e + ")";
    }

    public C30274C(C30277b c30277b, C30278c c30278c, String str, C30272A c30272a, C30276a c30276a) {
        this.f60864a = c30277b;
        this.f60865b = c30278c;
        this.f60866c = str;
        this.f60867d = c30272a;
        this.f60868e = c30276a;
    }
}
