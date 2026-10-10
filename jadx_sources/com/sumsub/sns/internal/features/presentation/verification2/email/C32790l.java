package com.sumsub.sns.internal.features.presentation.verification2.email;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32790l implements InterfaceC32792n {

    /* JADX INFO: renamed from: a */
    public final String f67096a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32790l) && Intrinsics.areEqual(this.f67096a, ((C32790l) obj).f67096a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.verification2.email.InterfaceC32792n
    /* JADX INFO: renamed from: a */
    public final CharSequence mo71345a() {
        return this.f67096a;
    }

    public final int hashCode() {
        return this.f67096a.hashCode();
    }

    public final String toString() {
        return "Blocking(message=" + ((Object) this.f67096a) + ")";
    }

    public C32790l(String str) {
        this.f67096a = str;
    }
}
