package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sentry.android.AbstractC27920h;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.F2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29002F2 {

    /* JADX INFO: renamed from: a */
    public final boolean f58946a;

    /* JADX INFO: renamed from: b */
    public final boolean f58947b;

    /* JADX INFO: renamed from: c */
    public final boolean f58948c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29002F2)) {
            return false;
        }
        C29002F2 c29002f2 = (C29002F2) obj;
        return this.f58946a == c29002f2.f58946a && this.f58947b == c29002f2.f58947b && this.f58948c == c29002f2.f58948c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58948c) + AbstractC27920h.m69001a(this.f58947b, Boolean.hashCode(this.f58946a) * 31, 31);
    }

    public final String toString() {
        return "BankAccount(allowed=" + this.f58946a + ", allowExternalSourcesCheck=" + this.f58947b + ", allowBankStatementUpload=" + this.f58948c + ")";
    }

    public C29002F2(boolean z11, boolean z12, boolean z13) {
        this.f58946a = z11;
        this.f58947b = z12;
        this.f58948c = z13;
    }
}
