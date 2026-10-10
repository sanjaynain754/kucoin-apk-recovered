package com.sumsub.sns.internal.core.presentation.theme;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.theme.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28956d extends AbstractC28962j {

    /* JADX INFO: renamed from: a */
    public final Float f58860a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28956d) && Intrinsics.areEqual((Object) this.f58860a, (Object) ((C28956d) obj).f58860a);
    }

    public final int hashCode() {
        Float f11 = this.f58860a;
        if (f11 == null) {
            return 0;
        }
        return f11.hashCode();
    }

    public final String toString() {
        return "Dimension(value=" + this.f58860a + ")";
    }

    public C28956d(Float f11) {
        this.f58860a = f11;
    }
}
