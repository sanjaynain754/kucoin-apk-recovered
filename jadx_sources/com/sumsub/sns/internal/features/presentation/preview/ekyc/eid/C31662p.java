package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31662p extends C31660n {

    /* JADX INFO: renamed from: a */
    public final String f64264a;

    /* JADX INFO: renamed from: b */
    public final String f64265b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31662p)) {
            return false;
        }
        C31662p c31662p = (C31662p) obj;
        return Intrinsics.areEqual(this.f64264a, c31662p.f64264a) && Intrinsics.areEqual(this.f64265b, c31662p.f64265b);
    }

    public C31662p(String str, String str2) {
        super("Authentication is not started", null);
        this.f64264a = str;
        this.f64265b = str2;
    }

    public final int hashCode() {
        int iHashCode = this.f64264a.hashCode() * 31;
        String str = this.f64265b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SNSEidStartReadingException(cardPin=" + this.f64264a + ", cardCan=" + this.f64265b + ")";
    }
}
