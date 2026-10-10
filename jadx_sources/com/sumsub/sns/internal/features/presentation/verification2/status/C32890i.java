package com.sumsub.sns.internal.features.presentation.verification2.status;

import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.status.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32890i extends AbstractC28081V {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67286a;

    /* JADX INFO: renamed from: b */
    public final String f67287b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f67288c;

    /* JADX INFO: renamed from: d */
    public final boolean f67289d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32890i)) {
            return false;
        }
        C32890i c32890i = (C32890i) obj;
        return Intrinsics.areEqual(this.f67286a, c32890i.f67286a) && Intrinsics.areEqual(this.f67287b, c32890i.f67287b) && Intrinsics.areEqual(this.f67288c, c32890i.f67288c) && this.f67289d == c32890i.f67289d;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f67286a;
        int iM68983a = AbstractC27897U.m68983a(this.f67287b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
        CharSequence charSequence2 = this.f67288c;
        return Boolean.hashCode(this.f67289d) + ((iM68983a + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f67286a;
        String str = this.f67287b;
        CharSequence charSequence2 = this.f67288c;
        return "ViewState(title=" + ((Object) charSequence) + ", icon=" + str + ", primaryButton=" + ((Object) charSequence2) + ", isFailure=" + this.f67289d + ")";
    }

    public C32890i(String str, String str2, boolean z11, String str3) {
        this.f67286a = str;
        this.f67287b = str2;
        this.f67288c = str3;
        this.f67289d = z11;
    }
}
