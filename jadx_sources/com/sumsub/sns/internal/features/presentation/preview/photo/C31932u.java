package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sentry.android.AbstractC27920h;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31932u {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64914a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64915b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64916c;

    /* JADX INFO: renamed from: d */
    public final boolean f64917d;

    /* JADX INFO: renamed from: e */
    public final List f64918e;

    /* JADX INFO: renamed from: f */
    public final List f64919f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31932u)) {
            return false;
        }
        C31932u c31932u = (C31932u) obj;
        return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f64914a, c31932u.f64914a) && Intrinsics.areEqual(this.f64915b, c31932u.f64915b) && Intrinsics.areEqual(this.f64916c, c31932u.f64916c) && this.f64917d == c31932u.f64917d && Intrinsics.areEqual(this.f64918e, c31932u.f64918e) && Intrinsics.areEqual(this.f64919f, c31932u.f64919f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64914a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64915b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64916c;
        return this.f64919f.hashCode() + ((this.f64918e.hashCode() + AbstractC27920h.m69001a(true, AbstractC27920h.m69001a(this.f64917d, (iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f64914a;
        CharSequence charSequence2 = this.f64915b;
        CharSequence charSequence3 = this.f64916c;
        return "WarningResult(title=" + ((Object) null) + ", message=" + ((Object) charSequence) + ", buttonPrimary=" + ((Object) charSequence2) + ", buttonSecondary=" + ((Object) charSequence3) + ", isFatal=" + this.f64917d + ", showIcon=true, errors=" + this.f64918e + ", imageIds=" + this.f64919f + ")";
    }

    public C31932u(CharSequence charSequence, String str, String str2, boolean z11, List list, List list2) {
        this.f64914a = charSequence;
        this.f64915b = str;
        this.f64916c = str2;
        this.f64917d = z11;
        this.f64918e = list;
        this.f64919f = list2;
    }
}
