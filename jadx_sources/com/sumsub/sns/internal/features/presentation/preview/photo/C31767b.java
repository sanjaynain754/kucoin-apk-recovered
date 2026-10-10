package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.graphics.Bitmap;
import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31767b {

    /* JADX INFO: renamed from: a */
    public final Bitmap f64550a;

    /* JADX INFO: renamed from: b */
    public final File f64551b;

    /* JADX INFO: renamed from: c */
    public final int f64552c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31767b)) {
            return false;
        }
        C31767b c31767b = (C31767b) obj;
        return Intrinsics.areEqual(this.f64550a, c31767b.f64550a) && Intrinsics.areEqual(this.f64551b, c31767b.f64551b) && this.f64552c == c31767b.f64552c;
    }

    public final int hashCode() {
        int iHashCode = this.f64550a.hashCode() * 31;
        File file = this.f64551b;
        return Integer.hashCode(this.f64552c) + ((iHashCode + (file == null ? 0 : file.hashCode())) * 31);
    }

    public final String toString() {
        return "PhotoItem(photo=" + this.f64550a + ", file=" + this.f64551b + ", rotation=" + this.f64552c + ")";
    }

    public C31767b(Bitmap bitmap, File file, int i11) {
        this.f64550a = bitmap;
        this.f64551b = file;
        this.f64552c = i11;
    }
}
