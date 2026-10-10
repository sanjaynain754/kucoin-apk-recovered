package com.sumsub.sns.internal.features.domain;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30318v {

    /* JADX INFO: renamed from: a */
    public final String f60949a;

    /* JADX INFO: renamed from: b */
    public final List f60950b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30318v)) {
            return false;
        }
        C30318v c30318v = (C30318v) obj;
        return Intrinsics.areEqual(this.f60949a, c30318v.f60949a) && Intrinsics.areEqual(this.f60950b, c30318v.f60950b);
    }

    public final int hashCode() {
        String str = this.f60949a;
        return this.f60950b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Result(currentCountryKey=" + this.f60949a + ", documents=" + this.f60950b + ")";
    }

    public C30318v(String str, List list) {
        this.f60949a = str;
        this.f60950b = list;
    }
}
