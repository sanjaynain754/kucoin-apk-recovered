package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30831k implements InterfaceC28077Q {

    /* JADX INFO: renamed from: a */
    public final File f62271a;

    /* JADX INFO: renamed from: b */
    public final int f62272b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30831k)) {
            return false;
        }
        C30831k c30831k = (C30831k) obj;
        return Intrinsics.areEqual(this.f62271a, c30831k.f62271a) && this.f62272b == c30831k.f62272b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62272b) + (this.f62271a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageRotationChanged(file=" + this.f62271a + ", rotation=" + this.f62272b + ")";
    }

    public C30831k(int i11, File file) {
        this.f62271a = file;
        this.f62272b = i11;
    }
}
