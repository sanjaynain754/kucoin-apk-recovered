package com.sumsub.sns.internal.features.presentation.camera.photo;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30683n {

    /* JADX INFO: renamed from: a */
    public final List f62005a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30683n) && Intrinsics.areEqual(this.f62005a, ((C30683n) obj).f62005a);
    }

    public final int hashCode() {
        return this.f62005a.hashCode();
    }

    public final String toString() {
        return "CountryPickerDialog(items=" + this.f62005a + ")";
    }

    public C30683n(List list) {
        this.f62005a = list;
    }
}
