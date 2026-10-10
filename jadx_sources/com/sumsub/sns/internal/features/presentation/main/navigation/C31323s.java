package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.presentation.main.AbstractC31234Y;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31323s implements InterfaceC31324t {

    /* JADX INFO: renamed from: a */
    public final AbstractC31234Y f63482a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31323s) && Intrinsics.areEqual(this.f63482a, ((C31323s) obj).f63482a);
    }

    public final int hashCode() {
        return this.f63482a.hashCode();
    }

    public final String toString() {
        return "Ok(event=" + this.f63482a + ")";
    }

    public C31323s(AbstractC31234Y abstractC31234Y) {
        this.f63482a = abstractC31234Y;
    }
}
