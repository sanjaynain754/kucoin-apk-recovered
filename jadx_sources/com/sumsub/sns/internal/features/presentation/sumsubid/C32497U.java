package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32497U implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66328a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66329b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32497U)) {
            return false;
        }
        C32497U c32497u = (C32497U) obj;
        return Intrinsics.areEqual(this.f66328a, c32497u.f66328a) && Intrinsics.areEqual(this.f66329b, c32497u.f66329b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66328a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66329b;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdShowLoginMenuEvent(openProfile=" + ((Object) this.f66328a) + ", logOut=" + ((Object) this.f66329b) + ")";
    }

    public C32497U(String str, String str2) {
        this.f66328a = str;
        this.f66329b = str2;
    }
}
