package com.sumsub.sns.internal.features.presentation.restrictions;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32353s extends AbstractC32354t {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65918a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65919b;

    /* JADX INFO: renamed from: c */
    public final SNSIconHandler.SNSRestrictionsIcons f65920c;

    /* JADX INFO: renamed from: d */
    public final C32349o f65921d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32353s)) {
            return false;
        }
        C32353s c32353s = (C32353s) obj;
        return Intrinsics.areEqual(this.f65918a, c32353s.f65918a) && Intrinsics.areEqual(this.f65919b, c32353s.f65919b) && this.f65920c == c32353s.f65920c && Intrinsics.areEqual(this.f65921d, c32353s.f65921d);
    }

    public final int hashCode() {
        int iHashCode = (this.f65920c.hashCode() + ((this.f65919b.hashCode() + (this.f65918a.hashCode() * 31)) * 31)) * 31;
        C32349o c32349o = this.f65921d;
        return iHashCode + (c32349o == null ? 0 : c32349o.hashCode());
    }

    public final String toString() {
        CharSequence charSequence = this.f65918a;
        CharSequence charSequence2 = this.f65919b;
        return "Normal(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", iconId=" + this.f65920c + ", action=" + this.f65921d + ")";
    }

    public C32353s(CharSequence charSequence, CharSequence charSequence2, SNSIconHandler.SNSRestrictionsIcons sNSRestrictionsIcons, C32349o c32349o) {
        this.f65918a = charSequence;
        this.f65919b = charSequence2;
        this.f65920c = sNSRestrictionsIcons;
        this.f65921d = c32349o;
    }
}
