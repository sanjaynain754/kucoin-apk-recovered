package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.e1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30544e1 {

    /* JADX INFO: renamed from: a */
    public final String f61690a;

    /* JADX INFO: renamed from: b */
    public final String f61691b;

    /* JADX INFO: renamed from: c */
    public final boolean f61692c = true;

    public C30544e1(String str, String str2) {
        this.f61690a = str;
        this.f61691b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30544e1)) {
            return false;
        }
        C30544e1 c30544e1 = (C30544e1) obj;
        return Intrinsics.areEqual(this.f61690a, c30544e1.f61690a) && Intrinsics.areEqual(this.f61691b, c30544e1.f61691b) && this.f61692c == c30544e1.f61692c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61692c) + ((this.f61691b.hashCode() + (this.f61690a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.f61690a;
        String str2 = this.f61691b;
        return "FrameHint(icon=" + str + ", text=" + ((Object) str2) + ", loading=" + this.f61692c + ")";
    }

    public C30544e1(String str, String str2, int i11) {
        this.f61690a = str;
        this.f61691b = str2;
    }
}
