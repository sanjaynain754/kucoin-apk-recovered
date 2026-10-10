package com.sumsub.sns.internal.features.presentation.result;

import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32374n extends AbstractC32375o {

    /* JADX INFO: renamed from: a */
    public final String f65953a;

    /* JADX INFO: renamed from: b */
    public final String f65954b;

    /* JADX INFO: renamed from: c */
    public final String f65955c;

    /* JADX INFO: renamed from: d */
    public final SNSStepState f65956d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32374n)) {
            return false;
        }
        C32374n c32374n = (C32374n) obj;
        return Intrinsics.areEqual(this.f65953a, c32374n.f65953a) && Intrinsics.areEqual(this.f65954b, c32374n.f65954b) && Intrinsics.areEqual(this.f65955c, c32374n.f65955c) && this.f65956d == c32374n.f65956d;
    }

    public final int hashCode() {
        int iHashCode = this.f65953a.hashCode() * 31;
        String str = this.f65954b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65955c;
        return this.f65956d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Status(image=" + this.f65953a + ", title=" + this.f65954b + ", subtitle=" + this.f65955c + ", stepState=" + this.f65956d + ")";
    }

    public C32374n(String str, String str2, String str3, SNSStepState sNSStepState) {
        this.f65953a = str;
        this.f65954b = str2;
        this.f65955c = str3;
        this.f65956d = sNSStepState;
    }
}
