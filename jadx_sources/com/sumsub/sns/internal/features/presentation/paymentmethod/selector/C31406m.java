package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31406m {

    /* JADX INFO: renamed from: a */
    public final String f63634a;

    /* JADX INFO: renamed from: b */
    public final boolean f63635b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31406m)) {
            return false;
        }
        C31406m c31406m = (C31406m) obj;
        return Intrinsics.areEqual("bankCard", "bankCard") && Intrinsics.areEqual(this.f63634a, c31406m.f63634a) && this.f63635b == c31406m.f63635b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63635b) + ((this.f63634a.hashCode() - 1813613036) * 31);
    }

    public final String toString() {
        String str = this.f63634a;
        return "SelectableItem(typeKey=bankCard, title=" + ((Object) str) + ", isSelected=" + this.f63635b + ")";
    }

    public C31406m(String str, boolean z11) {
        this.f63634a = str;
        this.f63635b = z11;
    }
}
