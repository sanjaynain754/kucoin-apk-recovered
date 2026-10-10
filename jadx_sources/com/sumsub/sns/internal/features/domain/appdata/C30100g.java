package com.sumsub.sns.internal.features.domain.appdata;

import com.sumsub.sns.internal.features.data.model.common.remote.C29285T3;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.appdata.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30100g {

    /* JADX INFO: renamed from: a */
    public final CharSequence f60512a;

    /* JADX INFO: renamed from: b */
    public final C29285T3 f60513b;

    /* JADX INFO: renamed from: c */
    public final String f60514c;

    /* JADX INFO: renamed from: d */
    public final String f60515d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30100g)) {
            return false;
        }
        C30100g c30100g = (C30100g) obj;
        return Intrinsics.areEqual(this.f60512a, c30100g.f60512a) && Intrinsics.areEqual(this.f60513b, c30100g.f60513b) && Intrinsics.areEqual(this.f60514c, c30100g.f60514c) && Intrinsics.areEqual(this.f60515d, c30100g.f60515d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f60512a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        C29285T3 c29285t3 = this.f60513b;
        return this.f60515d.hashCode() + ((this.f60514c.hashCode() + ((iHashCode + (c29285t3 != null ? c29285t3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f60512a;
        return "Tin(label=" + ((Object) charSequence) + ", tinInfo=" + this.f60513b + ", hint=" + ((Object) this.f60514c) + ", example=" + ((Object) this.f60515d) + ")";
    }

    public C30100g(String str, C29285T3 c29285t3, String str2, String str3) {
        this.f60512a = str;
        this.f60513b = c29285t3;
        this.f60514c = str2;
        this.f60515d = str3;
    }
}
