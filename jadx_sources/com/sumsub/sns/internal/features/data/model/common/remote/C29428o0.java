package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.o0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29428o0 {

    @NotNull
    public static final C29421n0 Companion = new C29421n0();

    /* JADX INFO: renamed from: a */
    public final String f59427a;

    /* JADX INFO: renamed from: b */
    public final String f59428b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29428o0)) {
            return false;
        }
        C29428o0 c29428o0 = (C29428o0) obj;
        return Intrinsics.areEqual(this.f59427a, c29428o0.f59427a) && Intrinsics.areEqual(this.f59428b, c29428o0.f59428b);
    }

    public final int hashCode() {
        String str = this.f59427a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59428b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Metavalue(key=" + this.f59427a + ", value=" + this.f59428b + ")";
    }

    public /* synthetic */ C29428o0(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f59427a = null;
        } else {
            this.f59427a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59428b = null;
        } else {
            this.f59428b = str2;
        }
    }
}
