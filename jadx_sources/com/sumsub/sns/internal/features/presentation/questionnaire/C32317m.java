package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32317m implements InterfaceC32319o {

    /* JADX INFO: renamed from: a */
    public final AbstractC28841e0 f65841a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32317m) && Intrinsics.areEqual(this.f65841a, ((C32317m) obj).f65841a);
    }

    public final int hashCode() {
        return this.f65841a.hashCode();
    }

    public final String toString() {
        return "OnOpenCamera(formItem=" + this.f65841a + ")";
    }

    public C32317m(AbstractC28841e0 abstractC28841e0) {
        this.f65841a = abstractC28841e0;
    }
}
