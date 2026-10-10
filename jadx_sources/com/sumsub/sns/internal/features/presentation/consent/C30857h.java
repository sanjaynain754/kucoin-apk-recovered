package com.sumsub.sns.internal.features.presentation.consent;

import com.sumsub.sns.internal.features.presentation.country.C30877b;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30857h {

    /* JADX INFO: renamed from: a */
    public final int f62320a;

    /* JADX INFO: renamed from: b */
    public final C30877b f62321b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30857h)) {
            return false;
        }
        C30857h c30857h = (C30857h) obj;
        return this.f62320a == c30857h.f62320a && Intrinsics.areEqual(this.f62321b, c30857h.f62321b);
    }

    public final int hashCode() {
        return this.f62321b.hashCode() + (Integer.hashCode(this.f62320a) * 31);
    }

    public final String toString() {
        return "CountryWrapperItem(id=" + this.f62320a + ", country=" + this.f62321b + ")";
    }

    public C30857h(int i11, C30877b c30877b) {
        this.f62320a = i11;
        this.f62321b = c30877b;
    }
}
