package com.sumsub.sns.internal.features.presentation.support;

import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.support.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32617h implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66537a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66538b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66539c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f66540d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f66541e;

    /* JADX INFO: renamed from: f */
    public final List f66542f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32617h)) {
            return false;
        }
        C32617h c32617h = (C32617h) obj;
        return Intrinsics.areEqual(this.f66537a, c32617h.f66537a) && Intrinsics.areEqual(this.f66538b, c32617h.f66538b) && Intrinsics.areEqual(this.f66539c, c32617h.f66539c) && Intrinsics.areEqual(this.f66540d, c32617h.f66540d) && Intrinsics.areEqual(this.f66541e, c32617h.f66541e) && Intrinsics.areEqual(this.f66542f, c32617h.f66542f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66537a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66538b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f66539c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f66540d;
        int iHashCode4 = (iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.f66541e;
        return this.f66542f.hashCode() + ((iHashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66537a;
        CharSequence charSequence2 = this.f66538b;
        CharSequence charSequence3 = this.f66539c;
        CharSequence charSequence4 = this.f66540d;
        CharSequence charSequence5 = this.f66541e;
        return "ViewState(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", infoTitle=" + ((Object) charSequence3) + ", copyAction=" + ((Object) charSequence4) + ", applicantId=" + ((Object) charSequence5) + ", supportItems=" + this.f66542f + ")";
    }

    public C32617h(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, List list) {
        this.f66537a = charSequence;
        this.f66538b = charSequence2;
        this.f66539c = charSequence3;
        this.f66540d = charSequence4;
        this.f66541e = charSequence5;
        this.f66542f = list;
    }
}
