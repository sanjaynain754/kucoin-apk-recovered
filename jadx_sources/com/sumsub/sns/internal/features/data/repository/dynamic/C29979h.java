package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29979h {

    /* JADX INFO: renamed from: a */
    public final C29124h f60237a;

    /* JADX INFO: renamed from: b */
    public final C29982k f60238b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29979h)) {
            return false;
        }
        C29979h c29979h = (C29979h) obj;
        return Intrinsics.areEqual(this.f60237a, c29979h.f60237a) && Intrinsics.areEqual(this.f60238b, c29979h.f60238b);
    }

    public final int hashCode() {
        return this.f60238b.f60247a.hashCode() + (this.f60237a.hashCode() * 31);
    }

    public final String toString() {
        return "AppConfigFeatureFlags(config=" + this.f60237a + ", featureFlags=" + this.f60238b + ")";
    }

    public C29979h(C29124h c29124h, C29982k c29982k) {
        this.f60237a = c29124h;
        this.f60238b = c29982k;
    }
}
