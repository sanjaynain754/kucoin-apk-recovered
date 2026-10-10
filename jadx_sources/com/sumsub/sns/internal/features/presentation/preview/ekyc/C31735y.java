package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31735y extends AbstractC31514B {

    /* JADX INFO: renamed from: a */
    public final String f64459a;

    /* JADX INFO: renamed from: b */
    public final String f64460b;

    /* JADX INFO: renamed from: c */
    public final boolean f64461c;

    /* JADX INFO: renamed from: d */
    public final String f64462d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31735y)) {
            return false;
        }
        C31735y c31735y = (C31735y) obj;
        return Intrinsics.areEqual(this.f64459a, c31735y.f64459a) && Intrinsics.areEqual(this.f64460b, c31735y.f64460b) && this.f64461c == c31735y.f64461c && Intrinsics.areEqual(this.f64462d, c31735y.f64462d);
    }

    public final int hashCode() {
        String str = this.f64459a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64460b;
        int iM69001a = AbstractC27920h.m69001a(this.f64461c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f64462d;
        return iM69001a + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "OAuth(url=" + this.f64459a + ", callbackUrl=" + this.f64460b + ", externalBrowserMode=" + this.f64461c + ", title=" + this.f64462d + ")";
    }

    public C31735y(String str, String str2, boolean z11, String str3) {
        this.f64459a = str;
        this.f64460b = str2;
        this.f64461c = z11;
        this.f64462d = str3;
    }
}
