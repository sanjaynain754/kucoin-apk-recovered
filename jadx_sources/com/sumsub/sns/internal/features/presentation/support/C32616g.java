package com.sumsub.sns.internal.features.presentation.support;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.support.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32616g {

    /* JADX INFO: renamed from: a */
    public final SNSSupportItem f66532a;

    /* JADX INFO: renamed from: b */
    public final SNSStepState f66533b;

    /* JADX INFO: renamed from: c */
    public final Drawable f66534c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f66535d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f66536e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32616g)) {
            return false;
        }
        C32616g c32616g = (C32616g) obj;
        return Intrinsics.areEqual(this.f66532a, c32616g.f66532a) && this.f66533b == c32616g.f66533b && Intrinsics.areEqual(this.f66534c, c32616g.f66534c) && Intrinsics.areEqual(this.f66535d, c32616g.f66535d) && Intrinsics.areEqual(this.f66536e, c32616g.f66536e);
    }

    public final int hashCode() {
        int iHashCode = (this.f66533b.hashCode() + (this.f66532a.hashCode() * 31)) * 31;
        Drawable drawable = this.f66534c;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        CharSequence charSequence = this.f66535d;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f66536e;
        return iHashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "SupportItem(item=" + this.f66532a + ", stepState=" + this.f66533b + ", icon=" + this.f66534c + ", title=" + ((Object) this.f66535d) + ", subtitle=" + ((Object) this.f66536e) + ")";
    }

    public C32616g(SNSSupportItem sNSSupportItem, SNSStepState sNSStepState, Drawable drawable, Spanned spanned, Spanned spanned2) {
        this.f66532a = sNSSupportItem;
        this.f66533b = sNSStepState;
        this.f66534c = drawable;
        this.f66535d = spanned;
        this.f66536e = spanned2;
    }
}
