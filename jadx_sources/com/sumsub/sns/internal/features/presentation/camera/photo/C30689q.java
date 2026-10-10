package com.sumsub.sns.internal.features.presentation.camera.photo;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30689q implements InterfaceC30731t {

    /* JADX INFO: renamed from: a */
    public final List f62017a;

    /* JADX INFO: renamed from: b */
    public final C30400E f62018b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30689q)) {
            return false;
        }
        C30689q c30689q = (C30689q) obj;
        return Intrinsics.areEqual(this.f62017a, c30689q.f62017a) && Intrinsics.areEqual(this.f62018b, c30689q.f62018b);
    }

    public final int hashCode() {
        int iHashCode = this.f62017a.hashCode() * 31;
        C30400E c30400e = this.f62018b;
        return iHashCode + (c30400e == null ? 0 : c30400e.hashCode());
    }

    public final String toString() {
        return "Chooser(chooserItems=" + this.f62017a + ", selectedItem=" + this.f62018b + ")";
    }

    public C30689q(List list, C30400E c30400e) {
        this.f62017a = list;
        this.f62018b = c30400e;
    }
}
