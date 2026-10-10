package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30735v {

    /* JADX INFO: renamed from: a */
    public final CharSequence f62085a;

    /* JADX INFO: renamed from: b */
    public final C30679l f62086b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30735v)) {
            return false;
        }
        C30735v c30735v = (C30735v) obj;
        return Intrinsics.areEqual(this.f62085a, c30735v.f62085a) && Intrinsics.areEqual(this.f62086b, c30735v.f62086b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f62085a;
        return this.f62086b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f62085a;
        return "Footer(text=" + ((Object) charSequence) + ", continueButton=" + this.f62086b + ")";
    }

    public C30735v(CharSequence charSequence, C30679l c30679l) {
        this.f62085a = charSequence;
        this.f62086b = c30679l;
    }
}
