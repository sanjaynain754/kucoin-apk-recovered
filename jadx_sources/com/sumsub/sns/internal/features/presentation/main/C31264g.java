package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.core.data.model.SNSCompletionResult;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31264g extends AbstractC31245b0 {

    /* JADX INFO: renamed from: a */
    public final SNSCompletionResult f63326a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31264g) && Intrinsics.areEqual(this.f63326a, ((C31264g) obj).f63326a);
    }

    public final int hashCode() {
        return this.f63326a.hashCode();
    }

    public final String toString() {
        return "Cancel(result=" + this.f63326a + ")";
    }

    public C31264g(SNSCompletionResult sNSCompletionResult) {
        this.f63326a = sNSCompletionResult;
    }
}
