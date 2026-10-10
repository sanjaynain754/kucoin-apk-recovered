package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31429i implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final Document f63686a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31429i) && Intrinsics.areEqual(this.f63686a, ((C31429i) obj).f63686a);
    }

    public final int hashCode() {
        return this.f63686a.hashCode();
    }

    public final String toString() {
        return "DocumentUploaded(document=" + this.f63686a + ")";
    }

    public C31429i(Document document) {
        this.f63686a = document;
    }
}
