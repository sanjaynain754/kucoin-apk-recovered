package com.sumsub.sns.internal.features.data.model.esign;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29757c {

    @NotNull
    public static final C29755b Companion = new C29755b();

    /* JADX INFO: renamed from: a */
    public final C29769i f59831a;

    /* JADX INFO: renamed from: b */
    public final C29783s f59832b;

    /* JADX INFO: renamed from: c */
    public final C29745Q f59833c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29757c)) {
            return false;
        }
        C29757c c29757c = (C29757c) obj;
        return Intrinsics.areEqual(this.f59831a, c29757c.f59831a) && Intrinsics.areEqual(this.f59832b, c29757c.f59832b) && Intrinsics.areEqual(this.f59833c, c29757c.f59833c);
    }

    public final int hashCode() {
        C29769i c29769i = this.f59831a;
        int iHashCode = (c29769i == null ? 0 : c29769i.hashCode()) * 31;
        C29783s c29783s = this.f59832b;
        int iHashCode2 = (iHashCode + (c29783s == null ? 0 : c29783s.hashCode())) * 31;
        C29745Q c29745q = this.f59833c;
        return iHashCode2 + (c29745q != null ? c29745q.hashCode() : 0);
    }

    public final String toString() {
        return "ESignAction(agreement=" + this.f59831a + ", otp=" + this.f59832b + ", requiredData=" + this.f59833c + ")";
    }

    public /* synthetic */ C29757c(int i11, C29769i c29769i, C29783s c29783s, C29745Q c29745q) {
        if ((i11 & 1) == 0) {
            this.f59831a = null;
        } else {
            this.f59831a = c29769i;
        }
        if ((i11 & 2) == 0) {
            this.f59832b = null;
        } else {
            this.f59832b = c29783s;
        }
        if ((i11 & 4) == 0) {
            this.f59833c = null;
        } else {
            this.f59833c = c29745q;
        }
    }
}
