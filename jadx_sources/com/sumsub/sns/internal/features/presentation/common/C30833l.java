package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30833l implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final int f62274a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30833l) && this.f62274a == ((C30833l) obj).f62274a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62274a);
    }

    public final String toString() {
        return "ImageSourcePickerEvent(viewId=" + this.f62274a + ")";
    }

    public C30833l(int i11) {
        this.f62274a = i11;
    }
}
