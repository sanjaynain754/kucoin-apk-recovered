package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.presentation.main.AbstractC31234Y;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31306b implements InterfaceC31310f {

    /* JADX INFO: renamed from: a */
    public final AbstractC31234Y f63444a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31306b) && Intrinsics.areEqual(this.f63444a, ((C31306b) obj).f63444a);
    }

    public final int hashCode() {
        return this.f63444a.hashCode();
    }

    public final String toString() {
        return "Navigate(event=" + this.f63444a + ")";
    }

    public C31306b(AbstractC31234Y abstractC31234Y) {
        this.f63444a = abstractC31234Y;
    }
}
