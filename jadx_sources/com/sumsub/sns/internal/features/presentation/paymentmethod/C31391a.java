package com.sumsub.sns.internal.features.presentation.paymentmethod;

import com.sumsub.sns.internal.features.data.model.common.PhotosAmount;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31391a implements InterfaceC31392b {

    /* JADX INFO: renamed from: a */
    public final PhotosAmount f63617a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31391a) && this.f63617a == ((C31391a) obj).f63617a;
    }

    public final int hashCode() {
        return this.f63617a.hashCode();
    }

    public final String toString() {
        return "BankCard(photosAmount=" + this.f63617a + ")";
    }

    public C31391a(PhotosAmount photosAmount) {
        this.f63617a = photosAmount;
    }
}
