package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.r0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29449r0 {

    @NotNull
    public static final C29442q0 Companion = new C29442q0();

    /* JADX INFO: renamed from: a */
    public final C29301X f59440a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29449r0) && Intrinsics.areEqual(this.f59440a, ((C29449r0) obj).f59440a);
    }

    public final int hashCode() {
        C29301X c29301x = this.f59440a;
        if (c29301x == null) {
            return 0;
        }
        return c29301x.hashCode();
    }

    public final String toString() {
        return "NfcConfiguration(kinegram=" + this.f59440a + ")";
    }

    public /* synthetic */ C29449r0(int i11, C29301X c29301x) {
        if ((i11 & 1) == 0) {
            this.f59440a = null;
        } else {
            this.f59440a = c29301x;
        }
    }
}
