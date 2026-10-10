package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31458j {

    /* JADX INFO: renamed from: a */
    public final C30152w f63765a;

    /* JADX INFO: renamed from: b */
    public final boolean f63766b;

    /* JADX INFO: renamed from: c */
    public final boolean f63767c;

    /* JADX INFO: renamed from: d */
    public final boolean f63768d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31458j)) {
            return false;
        }
        C31458j c31458j = (C31458j) obj;
        return Intrinsics.areEqual(this.f63765a, c31458j.f63765a) && this.f63766b == c31458j.f63766b && this.f63767c == c31458j.f63767c && this.f63768d == c31458j.f63768d;
    }

    public final int hashCode() {
        C30152w c30152w = this.f63765a;
        return Boolean.hashCode(this.f63768d) + AbstractC27920h.m69001a(this.f63767c, AbstractC27920h.m69001a(this.f63766b, (c30152w == null ? 0 : c30152w.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "FileState(doc=" + this.f63765a + ", isEnabled=" + this.f63766b + ", isOptional=" + this.f63767c + ", isClickable=" + this.f63768d + ")";
    }

    public C31458j(C30152w c30152w, boolean z11, boolean z12, boolean z13) {
        this.f63765a = c30152w;
        this.f63766b = z11;
        this.f63767c = z12;
        this.f63768d = z13;
    }
}
