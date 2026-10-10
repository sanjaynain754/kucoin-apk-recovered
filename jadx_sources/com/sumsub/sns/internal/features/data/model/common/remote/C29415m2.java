package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.m2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29415m2 {

    @NotNull
    public static final C29407l2 Companion = new C29407l2();

    /* JADX INFO: renamed from: a */
    public final String f59416a;

    /* JADX INFO: renamed from: b */
    public final String f59417b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29415m2)) {
            return false;
        }
        C29415m2 c29415m2 = (C29415m2) obj;
        return Intrinsics.areEqual(this.f59416a, c29415m2.f59416a) && Intrinsics.areEqual(this.f59417b, c29415m2.f59417b);
    }

    public final int hashCode() {
        String str = this.f59416a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59417b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Payload(newToken=" + this.f59416a + ", sessionId=" + this.f59417b + ")";
    }

    public /* synthetic */ C29415m2(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f59416a = null;
        } else {
            this.f59416a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59417b = null;
        } else {
            this.f59417b = str2;
        }
    }
}
