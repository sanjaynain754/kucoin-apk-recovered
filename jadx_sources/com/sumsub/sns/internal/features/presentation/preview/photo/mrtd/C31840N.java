package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31840N extends AbstractC31844S {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64702a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64703b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64704c;

    /* JADX INFO: renamed from: d */
    public final AbstractC28978A2 f64705d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31840N)) {
            return false;
        }
        C31840N c31840n = (C31840N) obj;
        return Intrinsics.areEqual(this.f64702a, c31840n.f64702a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f64703b, c31840n.f64703b) && Intrinsics.areEqual(this.f64704c, c31840n.f64704c) && Intrinsics.areEqual(this.f64705d, c31840n.f64705d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64702a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 961;
        CharSequence charSequence2 = this.f64703b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64704c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        AbstractC28978A2 abstractC28978A2 = this.f64705d;
        return iHashCode3 + (abstractC28978A2 != null ? abstractC28978A2.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f64702a;
        CharSequence charSequence2 = this.f64703b;
        CharSequence charSequence3 = this.f64704c;
        return "Error(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) null) + ", actionRetry=" + ((Object) charSequence2) + ", actionSkip=" + ((Object) charSequence3) + ", fallbackDocument=" + this.f64705d + ")";
    }

    public C31840N(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, AbstractC28978A2 abstractC28978A2) {
        this.f64702a = charSequence;
        this.f64703b = charSequence2;
        this.f64704c = charSequence3;
        this.f64705d = abstractC28978A2;
    }
}
