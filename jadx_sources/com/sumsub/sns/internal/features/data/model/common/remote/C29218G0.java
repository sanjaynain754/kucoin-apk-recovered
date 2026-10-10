package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.G0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29218G0 {

    @NotNull
    public static final C29213F0 Companion = new C29213F0();

    /* JADX INFO: renamed from: a */
    public final String f59207a;

    /* JADX INFO: renamed from: b */
    public final String f59208b;

    /* JADX INFO: renamed from: c */
    public final String f59209c;

    /* JADX INFO: renamed from: d */
    public final String f59210d;

    /* JADX INFO: renamed from: e */
    public final String f59211e;

    public /* synthetic */ C29218G0(int i11, String str, String str2, String str3, String str4, String str5) {
        if ((i11 & 1) == 0) {
            this.f59207a = null;
        } else {
            this.f59207a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59208b = null;
        } else {
            this.f59208b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59209c = null;
        } else {
            this.f59209c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59210d = null;
        } else {
            this.f59210d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f59211e = null;
        } else {
            this.f59211e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29218G0)) {
            return false;
        }
        C29218G0 c29218g0 = (C29218G0) obj;
        return Intrinsics.areEqual(this.f59207a, c29218g0.f59207a) && Intrinsics.areEqual(this.f59208b, c29218g0.f59208b) && Intrinsics.areEqual(this.f59209c, c29218g0.f59209c) && Intrinsics.areEqual(this.f59210d, c29218g0.f59210d) && Intrinsics.areEqual(this.f59211e, c29218g0.f59211e);
    }

    public C29218G0() {
        this.f59207a = "bankCard";
        this.f59208b = null;
        this.f59209c = null;
        this.f59210d = null;
        this.f59211e = null;
    }

    public final int hashCode() {
        String str = this.f59207a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59208b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59209c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59210d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59211e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentSourceInfo(type=" + this.f59207a + ", institutionName=" + this.f59208b + ", fullName=" + this.f59209c + ", country=" + this.f59210d + ", accountIdentifier=" + this.f59211e + ")";
    }
}
