package com.sumsub.sns.internal.core.presentation.android;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28695o implements InterfaceC28697p {

    /* JADX INFO: renamed from: a */
    public final AbstractC28636K f58343a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28695o) && Intrinsics.areEqual(this.f58343a, ((C28695o) obj).f58343a);
    }

    public final int hashCode() {
        return this.f58343a.hashCode();
    }

    public final String toString() {
        return "ShowingSettingsDialog(permission=" + this.f58343a + ")";
    }

    public C28695o(AbstractC28636K abstractC28636K) {
        this.f58343a = abstractC28636K;
    }
}
