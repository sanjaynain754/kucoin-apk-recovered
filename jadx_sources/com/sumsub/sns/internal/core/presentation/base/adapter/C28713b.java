package com.sumsub.sns.internal.core.presentation.base.adapter;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.base.adapter.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28713b extends AbstractC28712a {

    /* JADX INFO: renamed from: b */
    public final SNSStepState f58393b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f58394c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f58395d;

    /* JADX INFO: renamed from: e */
    public final boolean f58396e;

    /* JADX INFO: renamed from: f */
    public final C28714c f58397f;

    public C28713b(SNSStepState sNSStepState, CharSequence charSequence, CharSequence charSequence2, boolean z11, C28714c c28714c) {
        super(1);
        this.f58393b = sNSStepState;
        this.f58394c = charSequence;
        this.f58395d = charSequence2;
        this.f58396e = z11;
        this.f58397f = c28714c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28713b)) {
            return false;
        }
        C28713b c28713b = (C28713b) obj;
        return this.f58393b == c28713b.f58393b && Intrinsics.areEqual(this.f58394c, c28713b.f58394c) && Intrinsics.areEqual(this.f58395d, c28713b.f58395d) && this.f58396e == c28713b.f58396e && Intrinsics.areEqual(this.f58397f, c28713b.f58397f);
    }

    public final int hashCode() {
        int iHashCode = (this.f58394c.hashCode() + (this.f58393b.hashCode() * 31)) * 31;
        CharSequence charSequence = this.f58395d;
        return this.f58397f.hashCode() + AbstractC27920h.m69001a(this.f58396e, (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
    }

    public final String toString() {
        SNSStepState sNSStepState = this.f58393b;
        CharSequence charSequence = this.f58394c;
        CharSequence charSequence2 = this.f58395d;
        return "SNSDocumentViewItem(state=" + sNSStepState + ", title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", isClickable=" + this.f58396e + ", typeInfo=" + this.f58397f + ")";
    }
}
