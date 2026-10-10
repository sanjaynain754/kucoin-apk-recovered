package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.r1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30622r1 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f61868a;

    /* JADX INFO: renamed from: b */
    public final int f61869b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30622r1)) {
            return false;
        }
        C30622r1 c30622r1 = (C30622r1) obj;
        return Intrinsics.areEqual(this.f61868a, c30622r1.f61868a) && this.f61869b == c30622r1.f61869b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61869b) + (this.f61868a.hashCode() * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f61868a;
        return "UploadProgress(text=" + ((Object) charSequence) + ", progress=" + this.f61869b + ")";
    }

    public C30622r1(int i11, CharSequence charSequence) {
        this.f61868a = charSequence;
        this.f61869b = i11;
    }
}
