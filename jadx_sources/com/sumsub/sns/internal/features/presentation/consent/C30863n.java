package com.sumsub.sns.internal.features.presentation.consent;

import android.text.SpannableStringBuilder;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30863n extends AbstractC28081V {

    /* JADX INFO: renamed from: a */
    public final Integer f62326a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f62327b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f62328c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f62329d;

    /* JADX INFO: renamed from: e */
    public final SpannableStringBuilder f62330e;

    /* JADX INFO: renamed from: f */
    public final List f62331f;

    /* JADX INFO: renamed from: g */
    public final boolean f62332g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30863n)) {
            return false;
        }
        C30863n c30863n = (C30863n) obj;
        return Intrinsics.areEqual(this.f62326a, c30863n.f62326a) && Intrinsics.areEqual(this.f62327b, c30863n.f62327b) && Intrinsics.areEqual(this.f62328c, c30863n.f62328c) && Intrinsics.areEqual(this.f62329d, c30863n.f62329d) && Intrinsics.areEqual(this.f62330e, c30863n.f62330e) && Intrinsics.areEqual(this.f62331f, c30863n.f62331f) && this.f62332g == c30863n.f62332g;
    }

    public final int hashCode() {
        Integer num = this.f62326a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        CharSequence charSequence = this.f62327b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f62328c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f62329d;
        return Boolean.hashCode(this.f62332g) + ((this.f62331f.hashCode() + ((this.f62330e.hashCode() + ((iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Integer num = this.f62326a;
        CharSequence charSequence = this.f62327b;
        CharSequence charSequence2 = this.f62328c;
        CharSequence charSequence3 = this.f62329d;
        SpannableStringBuilder spannableStringBuilder = this.f62330e;
        return "ViewState(selectedAgreementId=" + num + ", titleText=" + ((Object) charSequence) + ", subtitleText=" + ((Object) charSequence2) + ", acceptText=" + ((Object) charSequence3) + ", footerText=" + ((Object) spannableStringBuilder) + ", countries=" + this.f62331f + ", alignStart=" + this.f62332g + ")";
    }

    public C30863n(Integer num, String str, String str2, String str3, SpannableStringBuilder spannableStringBuilder, List list, boolean z11) {
        this.f62326a = num;
        this.f62327b = str;
        this.f62328c = str2;
        this.f62329d = str3;
        this.f62330e = spannableStringBuilder;
        this.f62331f = list;
        this.f62332g = z11;
    }
}
