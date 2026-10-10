package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31810n implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f64634a;

    /* JADX INFO: renamed from: b */
    public final String f64635b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31810n)) {
            return false;
        }
        C31810n c31810n = (C31810n) obj;
        return Intrinsics.areEqual(this.f64634a, c31810n.f64634a) && Intrinsics.areEqual(this.f64635b, c31810n.f64635b);
    }

    public final int hashCode() {
        int iHashCode = this.f64634a.hashCode() * 31;
        String str = this.f64635b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SelectorRequest(documentType=" + this.f64634a + ", prefillCountry=" + this.f64635b + ")";
    }

    public C31810n(String str, String str2) {
        this.f64634a = str;
        this.f64635b = str2;
    }
}
