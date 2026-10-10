package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32318n implements InterfaceC32319o {

    /* JADX INFO: renamed from: a */
    public final AbstractC28841e0 f65842a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32318n) && Intrinsics.areEqual(this.f65842a, ((C32318n) obj).f65842a);
    }

    public final int hashCode() {
        return this.f65842a.hashCode();
    }

    public final String toString() {
        return "OnOpenGallery(formItem=" + this.f65842a + ")";
    }

    public C32318n(AbstractC28841e0 abstractC28841e0) {
        this.f65842a = abstractC28841e0;
    }
}
