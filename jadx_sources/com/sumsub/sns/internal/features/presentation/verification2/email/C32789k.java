package com.sumsub.sns.internal.features.presentation.verification2.email;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32789k {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67094a;

    /* JADX INFO: renamed from: b */
    public final boolean f67095b;

    public C32789k() {
        this.f67094a = null;
        this.f67095b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32789k)) {
            return false;
        }
        C32789k c32789k = (C32789k) obj;
        return Intrinsics.areEqual(this.f67094a, c32789k.f67094a) && this.f67095b == c32789k.f67095b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f67094a;
        return Boolean.hashCode(this.f67095b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f67094a;
        return "ButtonState(text=" + ((Object) charSequence) + ", enabled=" + this.f67095b + ")";
    }

    public C32789k(String str, boolean z11) {
        this.f67094a = str;
        this.f67095b = z11;
    }
}
