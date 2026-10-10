package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.d1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29342d1 {

    @NotNull
    public static final C29334c1 Companion = new C29334c1();

    /* JADX INFO: renamed from: a */
    public final Long f59357a;

    /* JADX INFO: renamed from: b */
    public final String f59358b;

    /* JADX INFO: renamed from: c */
    public final String f59359c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29342d1)) {
            return false;
        }
        C29342d1 c29342d1 = (C29342d1) obj;
        return Intrinsics.areEqual(this.f59357a, c29342d1.f59357a) && Intrinsics.areEqual(this.f59358b, c29342d1.f59358b) && Intrinsics.areEqual(this.f59359c, c29342d1.f59359c);
    }

    public final int hashCode() {
        Long l11 = this.f59357a;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.f59358b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59359c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Uploaded(imageId=" + this.f59357a + ", idDocType=" + this.f59358b + ", country=" + this.f59359c + ")";
    }

    public /* synthetic */ C29342d1(int i11, Long l11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f59357a = null;
        } else {
            this.f59357a = l11;
        }
        if ((i11 & 2) == 0) {
            this.f59358b = null;
        } else {
            this.f59358b = str;
        }
        if ((i11 & 4) == 0) {
            this.f59359c = null;
        } else {
            this.f59359c = str2;
        }
    }
}
