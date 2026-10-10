package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29142k {

    /* JADX INFO: renamed from: a */
    public final String f59121a;

    /* JADX INFO: renamed from: b */
    public final String f59122b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29142k)) {
            return false;
        }
        C29142k c29142k = (C29142k) obj;
        return Intrinsics.areEqual(this.f59121a, c29142k.f59121a) && Intrinsics.areEqual(this.f59122b, c29142k.f59122b);
    }

    public final int hashCode() {
        int iHashCode = this.f59121a.hashCode() * 31;
        String str = this.f59122b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MetaValue(key=" + this.f59121a + ", value=" + this.f59122b + ")";
    }

    public C29142k(String str, String str2) {
        this.f59121a = str;
        this.f59122b = str2;
    }
}
