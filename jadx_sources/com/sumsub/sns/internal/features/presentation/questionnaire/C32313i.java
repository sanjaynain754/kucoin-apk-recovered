package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.domain.documents.C30119M;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32313i implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final C30119M f65837a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32313i) && Intrinsics.areEqual(this.f65837a, ((C32313i) obj).f65837a);
    }

    public final int hashCode() {
        return this.f65837a.hashCode();
    }

    public final String toString() {
        return "OpenCamera(pickerRequest=" + this.f65837a + ")";
    }

    public C32313i(C30119M c30119m) {
        this.f65837a = c30119m;
    }
}
