package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30679l {

    /* JADX INFO: renamed from: a */
    public final CharSequence f61997a;

    /* JADX INFO: renamed from: b */
    public final boolean f61998b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30679l)) {
            return false;
        }
        C30679l c30679l = (C30679l) obj;
        return Intrinsics.areEqual(this.f61997a, c30679l.f61997a) && this.f61998b == c30679l.f61998b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f61997a;
        return Boolean.hashCode(this.f61998b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f61997a;
        return "ButtonState(text=" + ((Object) charSequence) + ", enabled=" + this.f61998b + ")";
    }

    public C30679l(CharSequence charSequence, boolean z11) {
        this.f61997a = charSequence;
        this.f61998b = z11;
    }
}
