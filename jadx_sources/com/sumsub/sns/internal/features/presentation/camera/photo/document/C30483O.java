package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30483O {

    /* JADX INFO: renamed from: a */
    public final Boolean f61526a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f61527b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f61528c;

    /* JADX INFO: renamed from: d */
    public final Boolean f61529d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30483O)) {
            return false;
        }
        C30483O c30483o = (C30483O) obj;
        return Intrinsics.areEqual(this.f61526a, c30483o.f61526a) && Intrinsics.areEqual(this.f61527b, c30483o.f61527b) && Intrinsics.areEqual(this.f61528c, c30483o.f61528c) && Intrinsics.areEqual(this.f61529d, c30483o.f61529d);
    }

    /* JADX INFO: renamed from: a */
    public static C30483O m70402a(C30483O c30483o, Boolean bool, Boolean bool2, int i11) {
        if ((i11 & 1) != 0) {
            bool = c30483o.f61526a;
        }
        return new C30483O(bool, c30483o.f61527b, c30483o.f61528c, bool2);
    }

    public final int hashCode() {
        Boolean bool = this.f61526a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        CharSequence charSequence = this.f61527b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f61528c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Boolean bool2 = this.f61529d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f61526a;
        CharSequence charSequence = this.f61527b;
        CharSequence charSequence2 = this.f61528c;
        return "AutoManualSwitch(auto=" + bool + ", autoText=" + ((Object) charSequence) + ", manualText=" + ((Object) charSequence2) + ", visible=" + this.f61529d + ")";
    }

    public C30483O(Boolean bool, CharSequence charSequence, CharSequence charSequence2, Boolean bool2) {
        this.f61526a = bool;
        this.f61527b = charSequence;
        this.f61528c = charSequence2;
        this.f61529d = bool2;
    }
}
