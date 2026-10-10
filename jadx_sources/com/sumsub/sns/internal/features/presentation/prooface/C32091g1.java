package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32252y;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.g1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32091g1 extends AbstractC32118m1 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65307a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC32252y f65308b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32091g1)) {
            return false;
        }
        C32091g1 c32091g1 = (C32091g1) obj;
        return Intrinsics.areEqual(this.f65307a, c32091g1.f65307a) && Intrinsics.areEqual(this.f65308b, c32091g1.f65308b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f65307a;
        return this.f65308b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f65307a;
        return "InProgress(hint=" + ((Object) charSequence) + ", status=" + this.f65308b + ")";
    }

    public C32091g1(String str, InterfaceC32252y interfaceC32252y) {
        this.f65307a = str;
        this.f65308b = interfaceC32252y;
    }
}
