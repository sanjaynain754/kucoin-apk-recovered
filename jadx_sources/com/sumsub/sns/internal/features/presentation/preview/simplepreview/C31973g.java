package com.sumsub.sns.internal.features.presentation.preview.simplepreview;

import android.graphics.Bitmap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.simplepreview.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31973g extends AbstractC31974h {

    /* JADX INFO: renamed from: a */
    public final Bitmap f65008a;

    /* JADX INFO: renamed from: b */
    public final String f65009b;

    /* JADX INFO: renamed from: c */
    public final String f65010c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31973g)) {
            return false;
        }
        C31973g c31973g = (C31973g) obj;
        return Intrinsics.areEqual(this.f65008a, c31973g.f65008a) && Intrinsics.areEqual(this.f65009b, c31973g.f65009b) && Intrinsics.areEqual(this.f65010c, c31973g.f65010c);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f65008a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        String str = this.f65009b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65010c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Normal(bitmap=" + this.f65008a + ", continueButton=" + this.f65009b + ", retakeButton=" + this.f65010c + ")";
    }

    public C31973g(Bitmap bitmap, String str, String str2) {
        this.f65008a = bitmap;
        this.f65009b = str;
        this.f65010c = str2;
    }
}
