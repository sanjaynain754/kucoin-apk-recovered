package com.sumsub.sns.internal.features.data.repository.navigation;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C30031z {

    @NotNull
    public static final C30030y Companion = new C30030y();

    /* JADX INFO: renamed from: a */
    public final C30011f f60321a;

    /* JADX INFO: renamed from: b */
    public final C30014i f60322b;

    /* JADX INFO: renamed from: c */
    public final C30020o f60323c;

    /* JADX INFO: renamed from: d */
    public final String f60324d;

    /* JADX INFO: renamed from: e */
    public final C30008c f60325e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30031z)) {
            return false;
        }
        C30031z c30031z = (C30031z) obj;
        return Intrinsics.areEqual(this.f60321a, c30031z.f60321a) && Intrinsics.areEqual(this.f60322b, c30031z.f60322b) && Intrinsics.areEqual(this.f60323c, c30031z.f60323c) && Intrinsics.areEqual(this.f60324d, c30031z.f60324d) && Intrinsics.areEqual(this.f60325e, c30031z.f60325e);
    }

    public /* synthetic */ C30031z(int i11, C30011f c30011f, C30014i c30014i, C30020o c30020o, String str, C30008c c30008c) {
        if (4 != (i11 & 4)) {
            C41801c2.m91514a(i11, 4, C30029x.f60320a.getDescriptor());
        }
        this.f60321a = (i11 & 1) == 0 ? new C30011f() : c30011f;
        if ((i11 & 2) == 0) {
            this.f60322b = null;
        } else {
            this.f60322b = c30014i;
        }
        this.f60323c = c30020o;
        if ((i11 & 8) == 0) {
            this.f60324d = null;
        } else {
            this.f60324d = str;
        }
        if ((i11 & 16) == 0) {
            this.f60325e = null;
        } else {
            this.f60325e = c30008c;
        }
    }

    public final int hashCode() {
        int iHashCode = this.f60321a.hashCode() * 31;
        C30014i c30014i = this.f60322b;
        int iHashCode2 = (this.f60323c.hashCode() + ((iHashCode + (c30014i == null ? 0 : c30014i.hashCode())) * 31)) * 31;
        String str = this.f60324d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C30008c c30008c = this.f60325e;
        return iHashCode3 + (c30008c != null ? c30008c.hashCode() : 0);
    }

    public final String toString() {
        return "ServerNavigationStateDto(navigation=" + this.f60321a + ", params=" + this.f60322b + ", step=" + this.f60323c + ", version=" + this.f60324d + ", applicantReview=" + this.f60325e + ")";
    }
}
