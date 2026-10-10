package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28980B extends AbstractC28985C {

    /* JADX INFO: renamed from: b */
    public final String f58903b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28980B) && Intrinsics.areEqual(this.f58903b, ((C28980B) obj).f58903b);
    }

    public final int hashCode() {
        return this.f58903b.hashCode();
    }

    public final String toString() {
        return "Text(text=" + ((Object) this.f58903b) + ")";
    }

    public C28980B(String str) {
        this.f58903b = str;
    }
}
