package com.sumsub.sns.internal.features.presentation.camera;

import android.util.Size;
import com.sumsub.sns.internal.core.presentation.camera.C28732b;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30372e {

    /* JADX INFO: renamed from: a */
    public final boolean f61095a;

    /* JADX INFO: renamed from: b */
    public final CameraX$Mode f61096b;

    /* JADX INFO: renamed from: c */
    public final Size f61097c;

    /* JADX INFO: renamed from: d */
    public final C28732b f61098d;

    public C30372e(boolean z11, CameraX$Mode cameraX$Mode, Size size, C28732b c28732b) {
        this.f61095a = z11;
        this.f61096b = cameraX$Mode;
        this.f61097c = size;
        this.f61098d = c28732b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30372e)) {
            return false;
        }
        C30372e c30372e = (C30372e) obj;
        return this.f61095a == c30372e.f61095a && this.f61096b == c30372e.f61096b && Intrinsics.areEqual(this.f61097c, c30372e.f61097c) && Intrinsics.areEqual(this.f61098d, c30372e.f61098d);
    }

    public final int hashCode() {
        int iHashCode = (this.f61096b.hashCode() + (Boolean.hashCode(this.f61095a) * 31)) * 31;
        Size size = this.f61097c;
        return this.f61098d.hashCode() + ((iHashCode + (size == null ? 0 : size.hashCode())) * 31);
    }

    public final String toString() {
        return "Config(isFrontFacingCamera=" + this.f61095a + ", cameraMode=" + this.f61096b + ", frameSize=" + this.f61097c + ", videoParams=" + this.f61098d + ")";
    }

    public /* synthetic */ C30372e(int i11) {
        this((i11 & 1) == 0, CameraX$Mode.PHOTO, null, new C28732b());
    }
}
