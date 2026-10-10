package com.sumsub.sns.internal.features.presentation.verification2.phone;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.core.presentation.common.InterfaceC28771f;
import com.sumsub.sns.internal.features.domain.C30270n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32851b implements InterfaceC28771f {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67217a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f67218b;

    /* JADX INFO: renamed from: c */
    public final boolean f67219c;

    /* JADX INFO: renamed from: d */
    public final C30270n f67220d;

    /* JADX INFO: renamed from: e */
    public final boolean f67221e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32851b)) {
            return false;
        }
        C32851b c32851b = (C32851b) obj;
        return Intrinsics.areEqual(this.f67217a, c32851b.f67217a) && Intrinsics.areEqual(this.f67218b, c32851b.f67218b) && this.f67219c == c32851b.f67219c && Intrinsics.areEqual(this.f67220d, c32851b.f67220d) && this.f67221e == c32851b.f67221e;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f67217a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f67218b;
        int iM69001a = AbstractC27920h.m69001a(this.f67219c, (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31);
        C30270n c30270n = this.f67220d;
        return Boolean.hashCode(this.f67221e) + ((iM69001a + (c30270n != null ? c30270n.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f67217a;
        CharSequence charSequence2 = this.f67218b;
        return "State(initialValue=" + ((Object) charSequence) + ", error=" + ((Object) charSequence2) + ", inputDisabled=" + this.f67219c + ", countryResultData=" + this.f67220d + ", isValid=" + this.f67221e + ")";
    }

    public C32851b(String str, CharSequence charSequence, boolean z11, C30270n c30270n, boolean z12) {
        this.f67217a = str;
        this.f67218b = charSequence;
        this.f67219c = z11;
        this.f67220d = c30270n;
        this.f67221e = z12;
    }
}
