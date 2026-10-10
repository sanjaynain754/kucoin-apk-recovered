package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sentry.AbstractC27897U;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29724z {

    /* JADX INFO: renamed from: a */
    public final String f59791a;

    /* JADX INFO: renamed from: b */
    public final String f59792b;

    /* JADX INFO: renamed from: c */
    public final String f59793c;

    public C29724z(String str, String str2) {
        this.f59791a = str;
        this.f59792b = str2;
        this.f59793c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29724z)) {
            return false;
        }
        C29724z c29724z = (C29724z) obj;
        return Intrinsics.areEqual(this.f59791a, c29724z.f59791a) && Intrinsics.areEqual(this.f59792b, c29724z.f59792b) && Intrinsics.areEqual(this.f59793c, c29724z.f59793c);
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f59792b, this.f59791a.hashCode() * 31, 31);
        String str = this.f59793c;
        return iM68983a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DropDownItem(id=" + this.f59791a + ", label=" + this.f59792b + ", description=" + this.f59793c + ")";
    }

    public C29724z(String str, String str2, String str3) {
        this.f59791a = str;
        this.f59792b = str2;
        this.f59793c = str3;
    }
}
