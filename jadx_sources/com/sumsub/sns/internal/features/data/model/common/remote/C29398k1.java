package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.k1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29398k1 {

    @NotNull
    public static final C29366g1 Companion = new C29366g1();

    /* JADX INFO: renamed from: a */
    public final C29390j1 f59406a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29398k1) && Intrinsics.areEqual(this.f59406a, ((C29398k1) obj).f59406a);
    }

    public final int hashCode() {
        C29390j1 c29390j1 = this.f59406a;
        if (c29390j1 == null) {
            return 0;
        }
        return c29390j1.hashCode();
    }

    public final String toString() {
        return "RemoteResourceUploadResult(uploaded=" + this.f59406a + ")";
    }

    public /* synthetic */ C29398k1(int i11, C29390j1 c29390j1) {
        if ((i11 & 1) == 0) {
            this.f59406a = null;
        } else {
            this.f59406a = c29390j1;
        }
    }
}
