package com.sumsub.sns.internal.features.presentation.verification2.email;

import android.text.Spanned;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32794p extends AbstractC28081V {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67102a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f67103b;

    /* JADX INFO: renamed from: c */
    public final C32793o f67104c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f67105d;

    /* JADX INFO: renamed from: e */
    public final C32789k f67106e;

    public /* synthetic */ C32794p() {
        this(null, null, new C32793o(null, null, null, true), null, new C32789k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32794p)) {
            return false;
        }
        C32794p c32794p = (C32794p) obj;
        return Intrinsics.areEqual(this.f67102a, c32794p.f67102a) && Intrinsics.areEqual(this.f67103b, c32794p.f67103b) && Intrinsics.areEqual(this.f67104c, c32794p.f67104c) && Intrinsics.areEqual(this.f67105d, c32794p.f67105d) && Intrinsics.areEqual(this.f67106e, c32794p.f67106e);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f67102a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f67103b;
        int iHashCode2 = (this.f67104c.hashCode() + ((iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31;
        CharSequence charSequence3 = this.f67105d;
        return this.f67106e.hashCode() + ((iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f67102a;
        CharSequence charSequence2 = this.f67103b;
        C32793o c32793o = this.f67104c;
        CharSequence charSequence3 = this.f67105d;
        return "ViewState(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", inputState=" + c32793o + ", footer=" + ((Object) charSequence3) + ", primaryButton=" + this.f67106e + ")";
    }

    public C32794p(String str, String str2, C32793o c32793o, Spanned spanned, C32789k c32789k) {
        this.f67102a = str;
        this.f67103b = str2;
        this.f67104c = c32793o;
        this.f67105d = spanned;
        this.f67106e = c32789k;
    }
}
