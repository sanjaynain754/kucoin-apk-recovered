package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31434n {

    /* JADX INFO: renamed from: a */
    public final C30152w f63701a;

    /* JADX INFO: renamed from: b */
    public final boolean f63702b;

    /* JADX INFO: renamed from: c */
    public final boolean f63703c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31434n)) {
            return false;
        }
        C31434n c31434n = (C31434n) obj;
        return Intrinsics.areEqual(this.f63701a, c31434n.f63701a) && this.f63702b == c31434n.f63702b && this.f63703c == c31434n.f63703c;
    }

    public final int hashCode() {
        C30152w c30152w = this.f63701a;
        return Boolean.hashCode(this.f63703c) + AbstractC27920h.m69001a(this.f63702b, AbstractC27920h.m69001a(true, (c30152w == null ? 0 : c30152w.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "FileState(doc=" + this.f63701a + ", isEnabled=true, isOptional=" + this.f63702b + ", isClickable=" + this.f63703c + ")";
    }

    public C31434n(C30152w c30152w, boolean z11, boolean z12) {
        this.f63701a = c30152w;
        this.f63702b = z11;
        this.f63703c = z12;
    }
}
