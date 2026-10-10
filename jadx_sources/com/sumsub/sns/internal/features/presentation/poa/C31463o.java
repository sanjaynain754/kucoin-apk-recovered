package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31463o implements InterfaceC28077Q {

    /* JADX INFO: renamed from: a */
    public final C29046Q2 f63798a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31463o) && Intrinsics.areEqual(this.f63798a, ((C31463o) obj).f63798a);
    }

    public final int hashCode() {
        C29046Q2 c29046q2 = this.f63798a;
        if (c29046q2 == null) {
            return 0;
        }
        return c29046q2.hashCode();
    }

    public final String toString() {
        return "ShowMoreExamplesIntent(preset=" + this.f63798a + ")";
    }

    public C31463o(C29046Q2 c29046q2) {
        this.f63798a = c29046q2;
    }
}
