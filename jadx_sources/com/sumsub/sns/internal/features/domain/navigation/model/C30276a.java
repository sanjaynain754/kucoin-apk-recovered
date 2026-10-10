package com.sumsub.sns.internal.features.domain.navigation.model;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30276a {

    /* JADX INFO: renamed from: a */
    public final String f60869a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30276a) && Intrinsics.areEqual(this.f60869a, ((C30276a) obj).f60869a);
    }

    public final int hashCode() {
        String str = this.f60869a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "ApplicantReview(levelName=" + this.f60869a + ")";
    }

    public C30276a(String str) {
        this.f60869a = str;
    }
}
