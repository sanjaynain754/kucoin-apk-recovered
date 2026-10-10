package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30996n {

    /* JADX INFO: renamed from: a */
    public final String f62636a;

    /* JADX INFO: renamed from: b */
    public final String f62637b;

    /* JADX INFO: renamed from: c */
    public final boolean f62638c;

    /* JADX INFO: renamed from: d */
    public final String f62639d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30996n)) {
            return false;
        }
        C30996n c30996n = (C30996n) obj;
        return Intrinsics.areEqual(this.f62636a, c30996n.f62636a) && Intrinsics.areEqual(this.f62637b, c30996n.f62637b) && this.f62638c == c30996n.f62638c && Intrinsics.areEqual(this.f62639d, c30996n.f62639d);
    }

    public final int hashCode() {
        String str = this.f62636a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62637b;
        int iM69001a = AbstractC27920h.m69001a(this.f62638c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f62639d;
        return iM69001a + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "BottomSheet(title=" + this.f62636a + ", errorMessage=" + this.f62637b + ", progress=" + this.f62638c + ", button=" + this.f62639d + ")";
    }

    public C30996n(String str, String str2, boolean z11, String str3) {
        this.f62636a = str;
        this.f62637b = str2;
        this.f62638c = z11;
        this.f62639d = str3;
    }
}
