package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.presentation.country.C30877b;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30398C {

    /* JADX INFO: renamed from: a */
    public final CharSequence f61157a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f61158b;

    /* JADX INFO: renamed from: c */
    public final C30877b f61159c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30398C)) {
            return false;
        }
        C30398C c30398c = (C30398C) obj;
        return Intrinsics.areEqual(this.f61157a, c30398c.f61157a) && Intrinsics.areEqual(this.f61158b, c30398c.f61158b) && Intrinsics.areEqual(this.f61159c, c30398c.f61159c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f61157a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f61158b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        C30877b c30877b = this.f61159c;
        return iHashCode2 + (c30877b != null ? c30877b.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f61157a;
        CharSequence charSequence2 = this.f61158b;
        return "IssuerCountry(title=" + ((Object) charSequence) + ", placeholder=" + ((Object) charSequence2) + ", selectedCountry=" + this.f61159c + ")";
    }

    public C30398C(CharSequence charSequence, CharSequence charSequence2, C30877b c30877b) {
        this.f61157a = charSequence;
        this.f61158b = charSequence2;
        this.f61159c = c30877b;
    }
}
