package com.sumsub.sns.internal.core.presentation.theme;

import android.graphics.Bitmap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.theme.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28957e extends AbstractC28962j {

    /* JADX INFO: renamed from: a */
    public final String f58861a;

    /* JADX INFO: renamed from: b */
    public final Integer f58862b;

    /* JADX INFO: renamed from: c */
    public final String f58863c;

    /* JADX INFO: renamed from: d */
    public Bitmap f58864d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28957e)) {
            return false;
        }
        C28957e c28957e = (C28957e) obj;
        return Intrinsics.areEqual(this.f58861a, c28957e.f58861a) && Intrinsics.areEqual(this.f58862b, c28957e.f58862b) && Intrinsics.areEqual(this.f58863c, c28957e.f58863c) && Intrinsics.areEqual(this.f58864d, c28957e.f58864d);
    }

    public final int hashCode() {
        String str = this.f58861a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f58862b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f58863c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bitmap bitmap = this.f58864d;
        return iHashCode3 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "Image(image=" + this.f58861a + ", scale=" + this.f58862b + ", rendering=" + this.f58863c + ", bitmap=" + this.f58864d + ")";
    }
}
