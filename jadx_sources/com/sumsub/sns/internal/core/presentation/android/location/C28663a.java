package com.sumsub.sns.internal.core.presentation.android.location;

import com.sumsub.sns.internal.features.data.model.geo.C29795e;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28663a implements InterfaceC28670f {

    /* JADX INFO: renamed from: a */
    public final C29795e f58293a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28663a) && Intrinsics.areEqual(this.f58293a, ((C28663a) obj).f58293a);
    }

    public final int hashCode() {
        return this.f58293a.hashCode();
    }

    public final String toString() {
        return "Acquired(location=" + this.f58293a + ")";
    }

    public C28663a(C29795e c29795e) {
        this.f58293a = c29795e;
    }
}
