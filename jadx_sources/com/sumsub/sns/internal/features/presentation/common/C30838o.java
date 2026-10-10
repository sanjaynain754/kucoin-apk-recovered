package com.sumsub.sns.internal.features.presentation.common;

import android.os.Parcelable;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30838o implements InterfaceC28077Q {

    /* JADX INFO: renamed from: a */
    public final boolean f62283a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f62284b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30838o)) {
            return false;
        }
        C30838o c30838o = (C30838o) obj;
        return this.f62283a == c30838o.f62283a && Intrinsics.areEqual(this.f62284b, c30838o.f62284b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f62283a) * 31;
        Parcelable parcelable = this.f62284b;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public final String toString() {
        return "OnInstructionsShowed(success=" + this.f62283a + ", payload=" + this.f62284b + ")";
    }

    public C30838o(boolean z11, Parcelable parcelable) {
        this.f62283a = z11;
        this.f62284b = parcelable;
    }
}
