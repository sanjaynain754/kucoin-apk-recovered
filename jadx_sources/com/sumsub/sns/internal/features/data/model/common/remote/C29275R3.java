package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.R3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29275R3 {

    @NotNull
    public static final C29271Q3 Companion = new C29271Q3();

    /* JADX INFO: renamed from: a */
    public final String f59264a;

    /* JADX INFO: renamed from: b */
    public final String f59265b;

    public /* synthetic */ C29275R3(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f59264a = null;
        } else {
            this.f59264a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59265b = null;
        } else {
            this.f59265b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29275R3)) {
            return false;
        }
        C29275R3 c29275r3 = (C29275R3) obj;
        return Intrinsics.areEqual(this.f59264a, c29275r3.f59264a) && Intrinsics.areEqual(this.f59265b, c29275r3.f59265b);
    }

    public C29275R3(String str, String str2) {
        this.f59264a = str;
        this.f59265b = str2;
    }

    public final int hashCode() {
        String str = this.f59264a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59265b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Tin(country=" + this.f59264a + ", tin=" + this.f59265b + ")";
    }
}
