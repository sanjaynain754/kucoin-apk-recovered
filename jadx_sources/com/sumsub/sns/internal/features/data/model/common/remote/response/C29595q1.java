package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.q1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29595q1 {

    @NotNull
    public static final C29551g1 Companion = new C29551g1();

    /* JADX INFO: renamed from: a */
    public final C29591p1 f59618a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29595q1) && Intrinsics.areEqual(this.f59618a, ((C29595q1) obj).f59618a);
    }

    public final int hashCode() {
        C29591p1 c29591p1 = this.f59618a;
        if (c29591p1 == null) {
            return 0;
        }
        return c29591p1.hashCode();
    }

    public final String toString() {
        return "RemotePaymentSourceLevelSettings(typeSettings=" + this.f59618a + ")";
    }

    public /* synthetic */ C29595q1(int i11, C29591p1 c29591p1) {
        if ((i11 & 1) == 0) {
            this.f59618a = null;
        } else {
            this.f59618a = c29591p1;
        }
    }
}
