package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.core.data.model.SNSCompletionResult;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28500v extends AbstractC28503w {

    /* JADX INFO: renamed from: b */
    public final SNSCompletionResult f58031b;

    public C28500v() {
        super("Terminated");
        this.f58031b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28500v) && Intrinsics.areEqual(this.f58031b, ((C28500v) obj).f58031b);
    }

    public C28500v(SNSCompletionResult sNSCompletionResult) {
        super("Terminated");
        this.f58031b = sNSCompletionResult;
    }

    public final int hashCode() {
        SNSCompletionResult sNSCompletionResult = this.f58031b;
        if (sNSCompletionResult == null) {
            return 0;
        }
        return sNSCompletionResult.hashCode();
    }

    @Override // com.sumsub.sns.internal.core.common.AbstractC28503w
    public final String toString() {
        return "Terminated(result=" + this.f58031b + ")";
    }
}
