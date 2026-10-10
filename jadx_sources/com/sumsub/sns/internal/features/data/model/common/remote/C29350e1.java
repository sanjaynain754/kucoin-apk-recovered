package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.e1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29350e1 {

    @NotNull
    public static final C29318a1 Companion = new C29318a1();

    /* JADX INFO: renamed from: a */
    public final C29342d1 f59370a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29350e1) && Intrinsics.areEqual(this.f59370a, ((C29350e1) obj).f59370a);
    }

    public final int hashCode() {
        C29342d1 c29342d1 = this.f59370a;
        if (c29342d1 == null) {
            return 0;
        }
        return c29342d1.hashCode();
    }

    public final String toString() {
        return "RemoteImageInspectionResult(uploaded=" + this.f59370a + ")";
    }

    public /* synthetic */ C29350e1(int i11, C29342d1 c29342d1) {
        if ((i11 & 1) == 0) {
            this.f59370a = null;
        } else {
            this.f59370a = c29342d1;
        }
    }
}
