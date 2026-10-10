package com.sumsub.sns.internal.core.presentation.screen.base;

import com.sumsub.sns.internal.core.presentation.screen.navigation.C28949f;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28925i implements InterfaceC28926j {

    /* JADX INFO: renamed from: a */
    public final C28949f f58813a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28925i) && Intrinsics.areEqual(this.f58813a, ((C28925i) obj).f58813a);
    }

    public final int hashCode() {
        return this.f58813a.hashCode();
    }

    public final String toString() {
        return "Show(screen=" + this.f58813a + ")";
    }

    public C28925i(C28949f c28949f) {
        this.f58813a = c28949f;
    }
}
