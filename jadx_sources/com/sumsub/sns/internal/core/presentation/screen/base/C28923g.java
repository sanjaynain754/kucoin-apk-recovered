package com.sumsub.sns.internal.core.presentation.screen.base;

import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28923g implements InterfaceC28926j {

    /* JADX INFO: renamed from: a */
    public final C29107e0 f58810a;

    /* JADX INFO: renamed from: b */
    public final String f58811b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28923g)) {
            return false;
        }
        C28923g c28923g = (C28923g) obj;
        return Intrinsics.areEqual(this.f58810a, c28923g.f58810a) && Intrinsics.areEqual(this.f58811b, c28923g.f58811b);
    }

    public final int hashCode() {
        return this.f58811b.hashCode() + (this.f58810a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.f58810a + ", idDocSetType=" + this.f58811b + ")";
    }

    public C28923g(C29107e0 c29107e0, String str) {
        this.f58810a = c29107e0;
        this.f58811b = str;
    }
}
