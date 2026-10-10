package com.sumsub.sns.internal.features.data.model.esign;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29739K {

    @NotNull
    public static final C29738J Companion = new C29738J();

    /* JADX INFO: renamed from: a */
    public final String f59809a;

    /* JADX INFO: renamed from: b */
    public final Integer f59810b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29739K)) {
            return false;
        }
        C29739K c29739k = (C29739K) obj;
        return Intrinsics.areEqual(this.f59809a, c29739k.f59809a) && Intrinsics.areEqual(this.f59810b, c29739k.f59810b);
    }

    public final int hashCode() {
        String str = this.f59809a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f59810b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ESignPage(id=" + this.f59809a + ", page=" + this.f59810b + ")";
    }

    public /* synthetic */ C29739K(int i11, String str, Integer num) {
        if ((i11 & 1) == 0) {
            this.f59809a = null;
        } else {
            this.f59809a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59810b = null;
        } else {
            this.f59810b = num;
        }
    }
}
