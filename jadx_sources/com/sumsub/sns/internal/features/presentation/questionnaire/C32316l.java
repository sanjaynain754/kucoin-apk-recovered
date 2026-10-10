package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32316l implements InterfaceC32319o {

    /* JADX INFO: renamed from: a */
    public final C29054T f65840a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32316l) && Intrinsics.areEqual(this.f65840a, ((C32316l) obj).f65840a);
    }

    public final int hashCode() {
        return this.f65840a.hashCode();
    }

    public final String toString() {
        return "OnDocumentResult(result=" + this.f65840a + ")";
    }

    public C32316l(C29054T c29054t) {
        this.f65840a = c29054t;
    }
}
