package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.r2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29185r2 {

    /* JADX INFO: renamed from: a */
    public final String f59182a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29185r2) && Intrinsics.areEqual(this.f59182a, ((C29185r2) obj).f59182a);
    }

    public final int hashCode() {
        String str = this.f59182a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "InspectionReview(levelName=" + this.f59182a + ")";
    }

    public C29185r2(String str) {
        this.f59182a = str;
    }
}
