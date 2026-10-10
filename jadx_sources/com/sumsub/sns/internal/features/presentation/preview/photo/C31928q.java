package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31928q extends AbstractC31930s {

    /* JADX INFO: renamed from: a */
    public final AbstractC28978A2 f64907a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31928q) && Intrinsics.areEqual(this.f64907a, ((C31928q) obj).f64907a);
    }

    public final int hashCode() {
        return this.f64907a.hashCode();
    }

    public final String toString() {
        return "Document(mrtdDocument=" + this.f64907a + ")";
    }

    public C31928q(AbstractC28978A2 abstractC28978A2) {
        this.f64907a = abstractC28978A2;
    }
}
