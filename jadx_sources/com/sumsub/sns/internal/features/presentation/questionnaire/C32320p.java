package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32320p extends AbstractC28081V {

    /* JADX INFO: renamed from: a */
    public final int f65843a;

    /* JADX INFO: renamed from: b */
    public final boolean f65844b;

    /* JADX INFO: renamed from: c */
    public final boolean f65845c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f65846d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32320p)) {
            return false;
        }
        C32320p c32320p = (C32320p) obj;
        return this.f65843a == c32320p.f65843a && this.f65844b == c32320p.f65844b && this.f65845c == c32320p.f65845c && Intrinsics.areEqual(this.f65846d, c32320p.f65846d);
    }

    public final int hashCode() {
        int iM69001a = AbstractC27920h.m69001a(this.f65845c, AbstractC27920h.m69001a(this.f65844b, Integer.hashCode(this.f65843a) * 31, 31), 31);
        CharSequence charSequence = this.f65846d;
        return iM69001a + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "ViewState(currentPageIndex=" + this.f65843a + ", showPage=" + this.f65844b + ", buttonEnabled=" + this.f65845c + ", buttonText=" + ((Object) this.f65846d) + ")";
    }

    public C32320p(int i11, boolean z11, boolean z12, CharSequence charSequence) {
        this.f65843a = i11;
        this.f65844b = z11;
        this.f65845c = z12;
        this.f65846d = charSequence;
    }
}
