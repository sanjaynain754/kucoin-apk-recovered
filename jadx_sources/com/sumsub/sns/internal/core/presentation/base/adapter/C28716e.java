package com.sumsub.sns.internal.core.presentation.base.adapter;

import android.text.Spanned;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.base.adapter.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28716e extends AbstractC28712a {

    /* JADX INFO: renamed from: b */
    public final CharSequence f58401b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f58402c;

    /* JADX INFO: renamed from: d */
    public final SNSStepState f58403d;

    public C28716e(CharSequence charSequence, Spanned spanned, SNSStepState sNSStepState) {
        super(2);
        this.f58401b = charSequence;
        this.f58402c = spanned;
        this.f58403d = sNSStepState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28716e)) {
            return false;
        }
        C28716e c28716e = (C28716e) obj;
        return Intrinsics.areEqual(this.f58401b, c28716e.f58401b) && Intrinsics.areEqual(this.f58402c, c28716e.f58402c) && this.f58403d == c28716e.f58403d;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f58401b;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f58402c;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        SNSStepState sNSStepState = this.f58403d;
        return iHashCode2 + (sNSStepState != null ? sNSStepState.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f58401b;
        CharSequence charSequence2 = this.f58402c;
        return "SNSModeratorCommentViewItem(moderationTitle=" + ((Object) charSequence) + ", moderationComment=" + ((Object) charSequence2) + ", state=" + this.f58403d + ")";
    }
}
