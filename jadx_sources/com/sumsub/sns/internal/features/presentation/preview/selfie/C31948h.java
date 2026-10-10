package com.sumsub.sns.internal.features.presentation.preview.selfie;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31948h implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final C31949i f64961a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31948h) && Intrinsics.areEqual(this.f64961a, ((C31948h) obj).f64961a);
    }

    public final int hashCode() {
        return this.f64961a.hashCode();
    }

    public final String toString() {
        return "ShowSelfiePicker(params=" + this.f64961a + ")";
    }

    public C31948h(C31949i c31949i) {
        this.f64961a = c31949i;
    }
}
