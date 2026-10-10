package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.p1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29591p1 {

    @NotNull
    public static final C29587o1 Companion = new C29587o1();

    /* JADX INFO: renamed from: a */
    public final C29546f1 f59613a;

    /* JADX INFO: renamed from: b */
    public final C29531c1 f59614b;

    /* JADX INFO: renamed from: c */
    public final C29579m1 f59615c;

    /* JADX INFO: renamed from: d */
    public final C29566j1 f59616d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29591p1)) {
            return false;
        }
        C29591p1 c29591p1 = (C29591p1) obj;
        return Intrinsics.areEqual(this.f59613a, c29591p1.f59613a) && Intrinsics.areEqual(this.f59614b, c29591p1.f59614b) && Intrinsics.areEqual(this.f59615c, c29591p1.f59615c) && Intrinsics.areEqual(this.f59616d, c29591p1.f59616d);
    }

    public final int hashCode() {
        C29546f1 c29546f1 = this.f59613a;
        int iHashCode = (c29546f1 == null ? 0 : c29546f1.hashCode()) * 31;
        C29531c1 c29531c1 = this.f59614b;
        int iHashCode2 = (iHashCode + (c29531c1 == null ? 0 : c29531c1.hashCode())) * 31;
        C29579m1 c29579m1 = this.f59615c;
        int iHashCode3 = (iHashCode2 + (c29579m1 == null ? 0 : c29579m1.hashCode())) * 31;
        C29566j1 c29566j1 = this.f59616d;
        return iHashCode3 + (c29566j1 != null ? c29566j1.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSettings(bankCard=" + this.f59613a + ", bankAccount=" + this.f59614b + ", eWallet=" + this.f59615c + ", cryptoWallet=" + this.f59616d + ")";
    }

    public /* synthetic */ C29591p1(int i11, C29546f1 c29546f1, C29531c1 c29531c1, C29579m1 c29579m1, C29566j1 c29566j1) {
        if ((i11 & 1) == 0) {
            this.f59613a = null;
        } else {
            this.f59613a = c29546f1;
        }
        if ((i11 & 2) == 0) {
            this.f59614b = null;
        } else {
            this.f59614b = c29531c1;
        }
        if ((i11 & 4) == 0) {
            this.f59615c = null;
        } else {
            this.f59615c = c29579m1;
        }
        if ((i11 & 8) == 0) {
            this.f59616d = null;
        } else {
            this.f59616d = c29566j1;
        }
    }
}
