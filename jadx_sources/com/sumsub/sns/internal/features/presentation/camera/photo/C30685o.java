package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30685o implements InterfaceC30681m {

    /* JADX INFO: renamed from: a */
    public final CharSequence f62008a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30685o) && Intrinsics.areEqual(this.f62008a, ((C30685o) obj).f62008a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f62008a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "Divider(text=" + ((Object) this.f62008a) + ")";
    }

    public C30685o(String str) {
        this.f62008a = str;
    }
}
