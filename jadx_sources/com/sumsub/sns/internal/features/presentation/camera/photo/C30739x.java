package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.presentation.country.C30877b;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30739x extends AbstractC30397B {

    /* JADX INFO: renamed from: a */
    public final C30877b f62108a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30739x) && Intrinsics.areEqual(this.f62108a, ((C30739x) obj).f62108a);
    }

    public final int hashCode() {
        C30877b c30877b = this.f62108a;
        if (c30877b == null) {
            return 0;
        }
        return c30877b.hashCode();
    }

    public final String toString() {
        return "OnCountrySelected(country=" + this.f62108a + ")";
    }

    public C30739x(C30877b c30877b) {
        this.f62108a = c30877b;
    }
}
