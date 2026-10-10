package com.sumsub.sns.internal.features.presentation.restrictions;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32336b implements InterfaceC32338d {

    /* JADX INFO: renamed from: a */
    public final C29586o0 f65893a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32336b) && Intrinsics.areEqual(this.f65893a, ((C32336b) obj).f65893a);
    }

    public final int hashCode() {
        return this.f65893a.hashCode();
    }

    public final String toString() {
        return "Blocked(restriction=" + this.f65893a + ")";
    }

    public C32336b(C29586o0 c29586o0) {
        this.f65893a = c29586o0;
    }
}
