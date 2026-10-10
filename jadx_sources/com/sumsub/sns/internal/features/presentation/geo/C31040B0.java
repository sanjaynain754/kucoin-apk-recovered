package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.B0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31040B0 {

    /* JADX INFO: renamed from: a */
    public final SNSIconHandler.SNSCommonIcons f62738a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f62739b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f62740c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f62741d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f62742e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31040B0)) {
            return false;
        }
        C31040B0 c31040b0 = (C31040B0) obj;
        return this.f62738a == c31040b0.f62738a && Intrinsics.areEqual(this.f62739b, c31040b0.f62739b) && Intrinsics.areEqual(this.f62740c, c31040b0.f62740c) && Intrinsics.areEqual(this.f62741d, c31040b0.f62741d) && Intrinsics.areEqual(this.f62742e, c31040b0.f62742e);
    }

    public final int hashCode() {
        int iHashCode = this.f62738a.hashCode() * 31;
        CharSequence charSequence = this.f62739b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f62740c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f62741d;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f62742e;
        return iHashCode4 + (charSequence4 != null ? charSequence4.hashCode() : 0);
    }

    public final String toString() {
        return "InfoPanel(icon=" + this.f62738a + ", title=" + ((Object) this.f62739b) + ", subtitle1=" + ((Object) this.f62740c) + ", dividerText=" + ((Object) this.f62741d) + ", subtitle2=" + ((Object) this.f62742e) + ")";
    }

    public C31040B0(SNSIconHandler.SNSCommonIcons sNSCommonIcons, String str, String str2, String str3, String str4) {
        this.f62738a = sNSCommonIcons;
        this.f62739b = str;
        this.f62740c = str2;
        this.f62741d = str3;
        this.f62742e = str4;
    }
}
