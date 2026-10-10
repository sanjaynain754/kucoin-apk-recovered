package com.sumsub.sns.internal.features.data.model.common;

import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.s3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29693s3 {

    /* JADX INFO: renamed from: a */
    public final Map f59739a;

    /* JADX INFO: renamed from: b */
    public final Map f59740b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29693s3)) {
            return false;
        }
        C29693s3 c29693s3 = (C29693s3) obj;
        return Intrinsics.areEqual(this.f59739a, c29693s3.f59739a) && Intrinsics.areEqual(this.f59740b, c29693s3.f59740b);
    }

    public final int hashCode() {
        int iHashCode = this.f59739a.hashCode() * 31;
        Map map = this.f59740b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "SdkDictEkyc(values=" + this.f59739a + ", fields=" + this.f59740b + ")";
    }

    public C29693s3(Map map, Map map2) {
        this.f59739a = map;
        this.f59740b = map2;
    }
}
