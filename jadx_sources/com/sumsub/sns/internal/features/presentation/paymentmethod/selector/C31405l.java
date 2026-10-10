package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.PhotosAmount;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31405l implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final PhotosAmount f63633a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31405l) && this.f63633a == ((C31405l) obj).f63633a;
    }

    public final int hashCode() {
        return this.f63633a.hashCode();
    }

    public final String toString() {
        return "OpenBankCardFlow(photosAmount=" + this.f63633a + ")";
    }

    public C31405l(PhotosAmount photosAmount) {
        this.f63633a = photosAmount;
    }
}
