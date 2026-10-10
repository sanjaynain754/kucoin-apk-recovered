package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.widget.AbstractC28250a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32523g implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f66346a;

    /* JADX INFO: renamed from: b */
    public final int f66347b;

    /* JADX INFO: renamed from: c */
    public final String f66348c;

    /* JADX INFO: renamed from: d */
    public final Long f66349d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32523g)) {
            return false;
        }
        C32523g c32523g = (C32523g) obj;
        return Intrinsics.areEqual(this.f66346a, c32523g.f66346a) && this.f66347b == c32523g.f66347b && Intrinsics.areEqual(this.f66348c, c32523g.f66348c) && Intrinsics.areEqual(this.f66349d, c32523g.f66349d);
    }

    public final int hashCode() {
        int iM69223a = AbstractC28250a.m69223a(this.f66347b, this.f66346a.hashCode() * 31, 31);
        String str = this.f66348c;
        int iHashCode = (iM69223a + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f66349d;
        return iHashCode + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdConfirmEmailEvent(email=" + this.f66346a + ", codeLength=" + this.f66347b + ", errorText=" + this.f66348c + ", lastTimestamp=" + this.f66349d + ")";
    }

    public C32523g(int i11, Long l11, String str, String str2) {
        this.f66346a = str;
        this.f66347b = i11;
        this.f66348c = str2;
        this.f66349d = l11;
    }
}
