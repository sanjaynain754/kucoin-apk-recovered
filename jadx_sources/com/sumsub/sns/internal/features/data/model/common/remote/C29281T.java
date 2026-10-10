package com.sumsub.sns.internal.features.data.model.common.remote;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29281T {

    /* JADX INFO: renamed from: a */
    public final String f59293a;

    /* JADX INFO: renamed from: b */
    public final String f59294b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29281T)) {
            return false;
        }
        C29281T c29281t = (C29281T) obj;
        return Intrinsics.areEqual(this.f59293a, c29281t.f59293a) && Intrinsics.areEqual(this.f59294b, c29281t.f59294b);
    }

    public final int hashCode() {
        return this.f59294b.hashCode() + (this.f59293a.hashCode() * 31);
    }

    public final String toString() {
        return "KeyValue(key=" + this.f59293a + ", value=" + this.f59294b + ")";
    }

    public C29281T(String str, String str2) {
        this.f59293a = str;
        this.f59294b = str2;
    }
}
