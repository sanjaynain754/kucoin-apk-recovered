package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31889o extends AbstractC31897s {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64809a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64810b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64811c;

    /* JADX INFO: renamed from: d */
    public final AbstractC28978A2 f64812d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31889o)) {
            return false;
        }
        C31889o c31889o = (C31889o) obj;
        return Intrinsics.areEqual(this.f64809a, c31889o.f64809a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f64810b, c31889o.f64810b) && Intrinsics.areEqual(this.f64811c, c31889o.f64811c) && Intrinsics.areEqual(this.f64812d, c31889o.f64812d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64809a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 961;
        CharSequence charSequence2 = this.f64810b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64811c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        AbstractC28978A2 abstractC28978A2 = this.f64812d;
        return iHashCode3 + (abstractC28978A2 != null ? abstractC28978A2.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f64809a;
        CharSequence charSequence2 = this.f64810b;
        CharSequence charSequence3 = this.f64811c;
        return "Error(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) null) + ", actionRetry=" + ((Object) charSequence2) + ", actionSkip=" + ((Object) charSequence3) + ", fallbackDocument=" + this.f64812d + ")";
    }

    public C31889o(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, AbstractC28978A2 abstractC28978A2) {
        this.f64809a = charSequence;
        this.f64810b = charSequence2;
        this.f64811c = charSequence3;
        this.f64812d = abstractC28978A2;
    }
}
