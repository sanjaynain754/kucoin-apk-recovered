package com.sumsub.sns.internal.features.presentation.main.navigation;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31305a implements InterfaceC31310f {

    /* JADX INFO: renamed from: a */
    public final Throwable f63442a;

    /* JADX INFO: renamed from: b */
    public final String f63443b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31305a)) {
            return false;
        }
        C31305a c31305a = (C31305a) obj;
        return Intrinsics.areEqual(this.f63442a, c31305a.f63442a) && Intrinsics.areEqual(this.f63443b, c31305a.f63443b);
    }

    public final int hashCode() {
        return this.f63443b.hashCode() + (this.f63442a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(cause=" + this.f63442a + ", idDocSetType=" + this.f63443b + ")";
    }

    public C31305a(String str, Throwable th2) {
        this.f63442a = th2;
        this.f63443b = str;
    }
}
