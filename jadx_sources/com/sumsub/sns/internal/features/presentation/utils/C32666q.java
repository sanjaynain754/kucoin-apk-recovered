package com.sumsub.sns.internal.features.presentation.utils;

import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32666q {

    /* JADX INFO: renamed from: a */
    public final Map f66669a;

    /* JADX INFO: renamed from: b */
    public final Map f66670b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32666q)) {
            return false;
        }
        C32666q c32666q = (C32666q) obj;
        return Intrinsics.areEqual(this.f66669a, c32666q.f66669a) && Intrinsics.areEqual(this.f66670b, c32666q.f66670b);
    }

    public final int hashCode() {
        return this.f66670b.hashCode() + (this.f66669a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapsWithProperties(photoBitmaps=" + this.f66669a + ", properties=" + this.f66670b + ")";
    }

    public C32666q(Map map, Map map2) {
        this.f66669a = map;
        this.f66670b = map2;
    }
}
