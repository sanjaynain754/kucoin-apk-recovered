package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.Y2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29309Y2 {

    @NotNull
    public static final C29304X2 Companion = new C29304X2();

    /* JADX INFO: renamed from: a */
    public final String f59323a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29309Y2) && Intrinsics.areEqual(this.f59323a, ((C29309Y2) obj).f59323a);
    }

    public final int hashCode() {
        String str = this.f59323a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Payload(name=" + this.f59323a + ")";
    }

    public /* synthetic */ C29309Y2(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f59323a = null;
        } else {
            this.f59323a = str;
        }
    }
}
