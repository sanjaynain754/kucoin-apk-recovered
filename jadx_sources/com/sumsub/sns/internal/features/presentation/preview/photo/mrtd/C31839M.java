package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31839M extends AbstractC31844S {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64701a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31839M) && Intrinsics.areEqual(this.f64701a, ((C31839M) obj).f64701a) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64701a;
        return (charSequence == null ? 0 : charSequence.hashCode()) * 31;
    }

    public final String toString() {
        return "Complete(title=" + ((Object) this.f64701a) + ", subtitle=" + ((Object) null) + ")";
    }

    public C31839M(CharSequence charSequence) {
        this.f64701a = charSequence;
    }
}
