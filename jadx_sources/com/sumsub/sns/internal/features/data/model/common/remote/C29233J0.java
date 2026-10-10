package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.J0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29233J0 {

    @NotNull
    public static final C29228I0 Companion = new C29228I0();

    /* JADX INFO: renamed from: a */
    public final String f59224a;

    /* JADX INFO: renamed from: b */
    public final String f59225b;

    /* JADX INFO: renamed from: c */
    public final Boolean f59226c;

    public /* synthetic */ C29233J0(int i11, String str, String str2, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f59224a = null;
        } else {
            this.f59224a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59225b = null;
        } else {
            this.f59225b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59226c = null;
        } else {
            this.f59226c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29233J0)) {
            return false;
        }
        C29233J0 c29233j0 = (C29233J0) obj;
        return Intrinsics.areEqual(this.f59224a, c29233j0.f59224a) && Intrinsics.areEqual(this.f59225b, c29233j0.f59225b) && Intrinsics.areEqual(this.f59226c, c29233j0.f59226c);
    }

    public C29233J0(String str, String str2) {
        this.f59224a = str;
        this.f59225b = str2;
        this.f59226c = null;
    }

    public final int hashCode() {
        String str = this.f59224a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59225b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f59226c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PoaGpsAddressField(name=" + this.f59224a + ", value=" + this.f59225b + ", required=" + this.f59226c + ")";
    }
}
