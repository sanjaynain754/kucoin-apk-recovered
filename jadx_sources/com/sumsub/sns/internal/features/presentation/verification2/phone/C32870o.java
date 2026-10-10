package com.sumsub.sns.internal.features.presentation.verification2.phone;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32870o {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67250a;

    /* JADX INFO: renamed from: b */
    public final boolean f67251b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32870o)) {
            return false;
        }
        C32870o c32870o = (C32870o) obj;
        return Intrinsics.areEqual(this.f67250a, c32870o.f67250a) && this.f67251b == c32870o.f67251b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f67250a;
        return Boolean.hashCode(this.f67251b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f67250a;
        return "ButtonState(text=" + ((Object) charSequence) + ", enabled=" + this.f67251b + ")";
    }

    public C32870o(String str, boolean z11) {
        this.f67250a = str;
        this.f67251b = z11;
    }
}
