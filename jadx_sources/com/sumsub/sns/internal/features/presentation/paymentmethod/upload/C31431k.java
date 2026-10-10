package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31431k {

    /* JADX INFO: renamed from: a */
    public final CharSequence f63688a;

    /* JADX INFO: renamed from: b */
    public final EnumC31420x33e3abfe f63689b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31431k)) {
            return false;
        }
        C31431k c31431k = (C31431k) obj;
        return Intrinsics.areEqual(this.f63688a, c31431k.f63688a) && this.f63689b == c31431k.f63689b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f63688a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        EnumC31420x33e3abfe enumC31420x33e3abfe = this.f63689b;
        return iHashCode + (enumC31420x33e3abfe != null ? enumC31420x33e3abfe.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f63688a;
        return "ButtonState(title=" + ((Object) charSequence) + ", action=" + this.f63689b + ")";
    }

    public C31431k(String str, EnumC31420x33e3abfe enumC31420x33e3abfe) {
        this.f63688a = str;
        this.f63689b = enumC31420x33e3abfe;
    }
}
