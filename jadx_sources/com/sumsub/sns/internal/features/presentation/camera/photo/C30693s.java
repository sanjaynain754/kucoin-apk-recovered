package com.sumsub.sns.internal.features.presentation.camera.photo;

import android.text.Spanned;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30693s implements InterfaceC30731t {

    /* JADX INFO: renamed from: a */
    public final CharSequence f62024a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30693s) && Intrinsics.areEqual(this.f62024a, ((C30693s) obj).f62024a);
    }

    public final int hashCode() {
        return this.f62024a.hashCode();
    }

    public final String toString() {
        return "Info(info=" + ((Object) this.f62024a) + ")";
    }

    public C30693s(Spanned spanned) {
        this.f62024a = spanned;
    }
}
