package com.sumsub.sns.internal.features.domain.appdata;

import com.sumsub.sns.internal.features.data.model.common.AbstractC28990D;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.appdata.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30094a {

    /* JADX INFO: renamed from: a */
    public final AbstractC28990D f60488a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f60489b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30094a)) {
            return false;
        }
        C30094a c30094a = (C30094a) obj;
        return Intrinsics.areEqual(this.f60488a, c30094a.f60488a) && Intrinsics.areEqual(this.f60489b, c30094a.f60489b);
    }

    public final int hashCode() {
        int iHashCode = this.f60488a.hashCode() * 31;
        CharSequence charSequence = this.f60489b;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "ApplicantDataError(field=" + this.f60488a + ", text=" + ((Object) this.f60489b) + ")";
    }

    public C30094a(AbstractC28990D abstractC28990D, String str) {
        this.f60488a = abstractC28990D;
        this.f60489b = str;
    }
}
