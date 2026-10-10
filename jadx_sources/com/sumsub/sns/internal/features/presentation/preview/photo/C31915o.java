package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31915o {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64877a;

    /* JADX INFO: renamed from: b */
    public final int f64878b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31915o)) {
            return false;
        }
        C31915o c31915o = (C31915o) obj;
        return Intrinsics.areEqual(this.f64877a, c31915o.f64877a) && this.f64878b == c31915o.f64878b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64877a;
        return Integer.hashCode(this.f64878b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f64877a;
        return "Progress(title=" + ((Object) charSequence) + ", value=" + this.f64878b + ")";
    }

    public C31915o(int i11, CharSequence charSequence) {
        this.f64877a = charSequence;
        this.f64878b = i11;
    }
}
