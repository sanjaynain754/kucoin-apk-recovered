package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.Bitmap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.h1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32096h1 extends AbstractC32118m1 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65316a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f65317b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32096h1)) {
            return false;
        }
        C32096h1 c32096h1 = (C32096h1) obj;
        return Intrinsics.areEqual(this.f65316a, c32096h1.f65316a) && Intrinsics.areEqual(this.f65317b, c32096h1.f65317b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f65316a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Bitmap bitmap = this.f65317b;
        return iHashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f65316a;
        return "Processing(hint=" + ((Object) charSequence) + ", blurredImage=" + this.f65317b + ")";
    }

    public C32096h1(String str, Bitmap bitmap) {
        this.f65316a = str;
        this.f65317b = bitmap;
    }
}
