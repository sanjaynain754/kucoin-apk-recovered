package com.sumsub.sns.internal.features.data.repository.navigation;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C30011f {

    @NotNull
    public static final C30010e Companion = new C30010e();

    /* JADX INFO: renamed from: a */
    public final Boolean f60290a;

    /* JADX INFO: renamed from: b */
    public final Boolean f60291b;

    /* JADX INFO: renamed from: c */
    public final Boolean f60292c;

    public /* synthetic */ C30011f(int i11, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i11 & 1) == 0) {
            this.f60290a = null;
        } else {
            this.f60290a = bool;
        }
        if ((i11 & 2) == 0) {
            this.f60291b = null;
        } else {
            this.f60291b = bool2;
        }
        if ((i11 & 4) == 0) {
            this.f60292c = null;
        } else {
            this.f60292c = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30011f)) {
            return false;
        }
        C30011f c30011f = (C30011f) obj;
        return Intrinsics.areEqual(this.f60290a, c30011f.f60290a) && Intrinsics.areEqual(this.f60291b, c30011f.f60291b) && Intrinsics.areEqual(this.f60292c, c30011f.f60292c);
    }

    public C30011f() {
        this.f60290a = null;
        this.f60291b = null;
        this.f60292c = null;
    }

    public final int hashCode() {
        Boolean bool = this.f60290a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f60291b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f60292c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "SdkNavigationDto(canGoBack=" + this.f60290a + ", canGoForward=" + this.f60291b + ", canSkip=" + this.f60292c + ")";
    }
}
