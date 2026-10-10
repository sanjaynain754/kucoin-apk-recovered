package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29585o {

    @NotNull
    public static final C29581n Companion = new C29581n();

    /* JADX INFO: renamed from: a */
    public final String f59604a;

    /* JADX INFO: renamed from: b */
    public final Integer f59605b;

    /* JADX INFO: renamed from: c */
    public final String f59606c;

    /* JADX INFO: renamed from: d */
    public final Integer f59607d;

    /* JADX INFO: renamed from: e */
    public final String f59608e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29585o)) {
            return false;
        }
        C29585o c29585o = (C29585o) obj;
        return Intrinsics.areEqual(this.f59604a, c29585o.f59604a) && Intrinsics.areEqual(this.f59605b, c29585o.f59605b) && Intrinsics.areEqual(this.f59606c, c29585o.f59606c) && Intrinsics.areEqual(this.f59607d, c29585o.f59607d) && Intrinsics.areEqual(this.f59608e, c29585o.f59608e);
    }

    public final int hashCode() {
        String str = this.f59604a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f59605b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f59606c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f59607d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f59608e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ApiErrorResponse(description=" + this.f59604a + ", code=" + this.f59605b + ", correlationId=" + this.f59606c + ", errorCode=" + this.f59607d + ", errorName=" + this.f59608e + ")";
    }

    public /* synthetic */ C29585o(int i11, String str, Integer num, String str2, Integer num2, String str3) {
        if ((i11 & 1) == 0) {
            this.f59604a = null;
        } else {
            this.f59604a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59605b = null;
        } else {
            this.f59605b = num;
        }
        if ((i11 & 4) == 0) {
            this.f59606c = null;
        } else {
            this.f59606c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f59607d = null;
        } else {
            this.f59607d = num2;
        }
        if ((i11 & 16) == 0) {
            this.f59608e = null;
        } else {
            this.f59608e = str3;
        }
    }
}
