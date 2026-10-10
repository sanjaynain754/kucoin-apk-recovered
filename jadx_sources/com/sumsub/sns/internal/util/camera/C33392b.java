package com.sumsub.sns.internal.util.camera;

import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.camera.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33392b {

    /* JADX INFO: renamed from: a */
    public final String f68095a;

    /* JADX INFO: renamed from: b */
    public final XposedVirtualCameraDirectory f68096b;

    /* JADX INFO: renamed from: c */
    public final boolean f68097c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33392b)) {
            return false;
        }
        C33392b c33392b = (C33392b) obj;
        return Intrinsics.areEqual(this.f68095a, c33392b.f68095a) && this.f68096b == c33392b.f68096b && this.f68097c == c33392b.f68097c;
    }

    /* JADX INFO: renamed from: a */
    public final Pair m71684a() {
        String str;
        int i11 = AbstractC33391a.f68094a[this.f68096b.ordinal()];
        if (i11 == 1) {
            str = "internal";
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "external";
        }
        return TuplesKt.m90091to("xposed_virtual_camera_" + str + "_" + this.f68095a, String.valueOf(this.f68097c));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68097c) + ((this.f68096b.hashCode() + (this.f68095a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ControlFile(fileKey=" + this.f68095a + ", directory=" + this.f68096b + ", exists=" + this.f68097c + ")";
    }

    public C33392b(String str, XposedVirtualCameraDirectory xposedVirtualCameraDirectory, boolean z11) {
        this.f68095a = str;
        this.f68096b = xposedVirtualCameraDirectory;
        this.f68097c = z11;
    }
}
