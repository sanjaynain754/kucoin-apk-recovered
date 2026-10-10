package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.m1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29579m1 {

    @NotNull
    public static final C29575l1 Companion = new C29575l1();

    /* JADX INFO: renamed from: a */
    public final Boolean f59602a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29579m1) && Intrinsics.areEqual(this.f59602a, ((C29579m1) obj).f59602a);
    }

    public final int hashCode() {
        Boolean bool = this.f59602a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "EWallet(allowed=" + this.f59602a + ")";
    }

    public /* synthetic */ C29579m1(int i11, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f59602a = null;
        } else {
            this.f59602a = bool;
        }
    }
}
