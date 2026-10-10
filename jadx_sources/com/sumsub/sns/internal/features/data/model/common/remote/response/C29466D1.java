package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.D1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29466D1 {

    @NotNull
    public static final C29463C1 Companion = new C29463C1();

    /* JADX INFO: renamed from: a */
    public final String f59461a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29466D1) && Intrinsics.areEqual(this.f59461a, ((C29466D1) obj).f59461a);
    }

    public final int hashCode() {
        String str = this.f59461a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VideoIdentDataResponse(reviewStatus=" + this.f59461a + ")";
    }

    public /* synthetic */ C29466D1(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f59461a = null;
        } else {
            this.f59461a = str;
        }
    }
}
