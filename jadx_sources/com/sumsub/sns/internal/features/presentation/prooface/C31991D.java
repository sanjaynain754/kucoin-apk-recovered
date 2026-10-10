package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.Bitmap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31991D extends AbstractC32018M {

    /* JADX INFO: renamed from: a */
    public final Bitmap f65036a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65037b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31991D)) {
            return false;
        }
        C31991D c31991d = (C31991D) obj;
        return Intrinsics.areEqual(this.f65036a, c31991d.f65036a) && Intrinsics.areEqual(this.f65037b, c31991d.f65037b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f65036a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        CharSequence charSequence = this.f65037b;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "Completed(blurredLastImage=" + this.f65036a + ", hint=" + ((Object) this.f65037b) + ")";
    }

    public C31991D(Bitmap bitmap, CharSequence charSequence) {
        this.f65036a = bitmap;
        this.f65037b = charSequence;
    }
}
