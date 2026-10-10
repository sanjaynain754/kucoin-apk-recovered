package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30401F implements InterfaceC30681m {

    /* JADX INFO: renamed from: a */
    public final CharSequence f61163a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30401F) && Intrinsics.areEqual(this.f61163a, ((C30401F) obj).f61163a);
    }

    public final int hashCode() {
        return this.f61163a.hashCode();
    }

    public final String toString() {
        return "SubTitle(text=" + ((Object) this.f61163a) + ")";
    }

    public C30401F(CharSequence charSequence) {
        this.f61163a = charSequence;
    }
}
