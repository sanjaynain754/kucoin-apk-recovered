package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31456h implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final Document f63763a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31456h) && Intrinsics.areEqual(this.f63763a, ((C31456h) obj).f63763a);
    }

    public final int hashCode() {
        return this.f63763a.hashCode();
    }

    public final String toString() {
        return "DocumentUploaded(document=" + this.f63763a + ")";
    }

    public C31456h(Document document) {
        this.f63763a = document;
    }
}
