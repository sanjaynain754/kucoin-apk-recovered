package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.domain.documents.C30148s;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32314j implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final C30148s f65838a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32314j) && Intrinsics.areEqual(this.f65838a, ((C32314j) obj).f65838a);
    }

    public final int hashCode() {
        return this.f65838a.hashCode();
    }

    public final String toString() {
        return "OpenGallery(galleryRequest=" + this.f65838a + ")";
    }

    public C32314j(C30148s c30148s) {
        this.f65838a = c30148s;
    }
}
