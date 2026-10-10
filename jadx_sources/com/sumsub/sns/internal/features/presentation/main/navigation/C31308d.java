package com.sumsub.sns.internal.features.presentation.main.navigation;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31308d implements InterfaceC31310f {

    /* JADX INFO: renamed from: a */
    public final String f63446a;

    /* JADX INFO: renamed from: b */
    public final String f63447b;

    /* JADX INFO: renamed from: c */
    public final boolean f63448c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31308d)) {
            return false;
        }
        C31308d c31308d = (C31308d) obj;
        return Intrinsics.areEqual(this.f63446a, c31308d.f63446a) && Intrinsics.areEqual(this.f63447b, c31308d.f63447b) && this.f63448c == c31308d.f63448c;
    }

    public final int hashCode() {
        int iHashCode = this.f63446a.hashCode() * 31;
        String str = this.f63447b;
        return Boolean.hashCode(this.f63448c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "StepCompleted(idDocSetType=" + this.f63446a + ", levelName=" + this.f63447b + ", isCancelled=" + this.f63448c + ")";
    }

    public C31308d(String str, boolean z11, String str2) {
        this.f63446a = str;
        this.f63447b = str2;
        this.f63448c = z11;
    }
}
