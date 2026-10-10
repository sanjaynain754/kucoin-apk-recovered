package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.s2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29636s2 {

    @NotNull
    public static final C29451r2 Companion = new C29451r2();

    /* JADX INFO: renamed from: a */
    public final String f59693a;

    /* JADX INFO: renamed from: b */
    public final String f59694b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29636s2)) {
            return false;
        }
        C29636s2 c29636s2 = (C29636s2) obj;
        return Intrinsics.areEqual(this.f59693a, c29636s2.f59693a) && Intrinsics.areEqual(this.f59694b, c29636s2.f59694b);
    }

    public /* synthetic */ C29636s2(int i11, String str, String str2) {
        if (2 != (i11 & 2)) {
            C41801c2.m91514a(i11, 2, C29444q2.f59438a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f59693a = null;
        } else {
            this.f59693a = str;
        }
        this.f59694b = str2;
    }

    public final int hashCode() {
        String str = this.f59693a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59694b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Payload(levelName=" + this.f59693a + ", newToken=" + this.f59694b + ")";
    }
}
