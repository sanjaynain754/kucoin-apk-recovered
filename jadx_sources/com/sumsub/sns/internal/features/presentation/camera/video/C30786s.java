package com.sumsub.sns.internal.features.presentation.camera.video;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30786s {

    /* JADX INFO: renamed from: a */
    public final CharSequence f62196a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f62197b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f62198c;

    public C30786s() {
        this.f62196a = null;
        this.f62197b = null;
        this.f62198c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30786s)) {
            return false;
        }
        C30786s c30786s = (C30786s) obj;
        return Intrinsics.areEqual(this.f62196a, c30786s.f62196a) && Intrinsics.areEqual(this.f62197b, c30786s.f62197b) && Intrinsics.areEqual(this.f62198c, c30786s.f62198c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f62196a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f62197b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f62198c;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        return "ViewText(message=" + ((Object) this.f62196a) + ", description1=" + ((Object) this.f62197b) + ", description2=" + ((Object) this.f62198c) + ")";
    }

    public C30786s(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f62196a = charSequence;
        this.f62197b = charSequence2;
        this.f62198c = charSequence3;
    }
}
