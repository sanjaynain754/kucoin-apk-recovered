package com.sumsub.sns.internal.features.presentation.verification2.phone;

import android.text.Spanned;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32873r extends AbstractC28081V {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67253a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f67254b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f67255c;

    /* JADX INFO: renamed from: d */
    public final C32870o f67256d;

    public /* synthetic */ C32873r() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32873r)) {
            return false;
        }
        C32873r c32873r = (C32873r) obj;
        return Intrinsics.areEqual(this.f67253a, c32873r.f67253a) && Intrinsics.areEqual(this.f67254b, c32873r.f67254b) && Intrinsics.areEqual(this.f67255c, c32873r.f67255c) && Intrinsics.areEqual(this.f67256d, c32873r.f67256d);
    }

    public C32873r(Spanned spanned, Spanned spanned2, Spanned spanned3, C32870o c32870o) {
        this.f67253a = spanned;
        this.f67254b = spanned2;
        this.f67255c = spanned3;
        this.f67256d = c32870o;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f67253a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f67254b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f67255c;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        C32870o c32870o = this.f67256d;
        return iHashCode3 + (c32870o != null ? c32870o.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f67253a;
        CharSequence charSequence2 = this.f67254b;
        CharSequence charSequence3 = this.f67255c;
        return "ViewState(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", footer=" + ((Object) charSequence3) + ", primaryButton=" + this.f67256d + ")";
    }
}
