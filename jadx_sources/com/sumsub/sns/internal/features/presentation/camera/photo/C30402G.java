package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30402G extends AbstractC28081V {

    /* JADX INFO: renamed from: a */
    public final C30683n f61164a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f61165b;

    /* JADX INFO: renamed from: c */
    public final C30398C f61166c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30731t f61167d;

    /* JADX INFO: renamed from: e */
    public final C30735v f61168e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30402G)) {
            return false;
        }
        C30402G c30402g = (C30402G) obj;
        return Intrinsics.areEqual(this.f61164a, c30402g.f61164a) && Intrinsics.areEqual(this.f61165b, c30402g.f61165b) && Intrinsics.areEqual(this.f61166c, c30402g.f61166c) && Intrinsics.areEqual(this.f61167d, c30402g.f61167d) && Intrinsics.areEqual(this.f61168e, c30402g.f61168e);
    }

    public final int hashCode() {
        C30683n c30683n = this.f61164a;
        return this.f61168e.hashCode() + ((this.f61167d.hashCode() + ((this.f61166c.hashCode() + ((this.f61165b.hashCode() + ((c30683n == null ? 0 : c30683n.f62005a.hashCode()) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        C30683n c30683n = this.f61164a;
        CharSequence charSequence = this.f61165b;
        return "ViewState(countryPickerDialog=" + c30683n + ", titleText=" + ((Object) charSequence) + ", issuerCountry=" + this.f61166c + ", documents=" + this.f61167d + ", footer=" + this.f61168e + ")";
    }

    public C30402G(C30683n c30683n, CharSequence charSequence, C30398C c30398c, InterfaceC30731t interfaceC30731t, C30735v c30735v) {
        this.f61164a = c30683n;
        this.f61165b = charSequence;
        this.f61166c = c30398c;
        this.f61167d = interfaceC30731t;
        this.f61168e = c30735v;
    }
}
