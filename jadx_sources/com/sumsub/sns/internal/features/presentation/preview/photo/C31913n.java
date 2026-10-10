package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31913n {

    /* JADX INFO: renamed from: a */
    public final SNSPreviewPhotoDocumentViewModel$Content$ButtonAction f64873a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64874b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31913n)) {
            return false;
        }
        C31913n c31913n = (C31913n) obj;
        return this.f64873a == c31913n.f64873a && Intrinsics.areEqual(this.f64874b, c31913n.f64874b);
    }

    public final int hashCode() {
        int iHashCode = this.f64873a.hashCode() * 31;
        CharSequence charSequence = this.f64874b;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "ButtonDescription(action=" + this.f64873a + ", text=" + ((Object) this.f64874b) + ")";
    }

    public C31913n(SNSPreviewPhotoDocumentViewModel$Content$ButtonAction sNSPreviewPhotoDocumentViewModel$Content$ButtonAction, CharSequence charSequence) {
        this.f64873a = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction;
        this.f64874b = charSequence;
    }
}
