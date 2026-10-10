package com.sumsub.sns.internal.features.presentation.exitsurvey;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.exitsurvey.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31025i extends AbstractC31027k {

    /* JADX INFO: renamed from: a */
    public final String f62711a;

    /* JADX INFO: renamed from: b */
    public final String f62712b;

    /* JADX INFO: renamed from: c */
    public final boolean f62713c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31025i)) {
            return false;
        }
        C31025i c31025i = (C31025i) obj;
        return Intrinsics.areEqual(this.f62711a, c31025i.f62711a) && Intrinsics.areEqual(this.f62712b, c31025i.f62712b) && this.f62713c == c31025i.f62713c;
    }

    public final int hashCode() {
        String str = this.f62711a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62712b;
        return Boolean.hashCode(this.f62713c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Showing(continueText=" + this.f62711a + ", skipText=" + this.f62712b + ", buttonEnabled=" + this.f62713c + ")";
    }

    public C31025i(String str, boolean z11, String str2) {
        this.f62711a = str;
        this.f62712b = str2;
        this.f62713c = z11;
    }
}
