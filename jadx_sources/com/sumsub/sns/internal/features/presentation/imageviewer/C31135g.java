package com.sumsub.sns.internal.features.presentation.imageviewer;

import android.graphics.Bitmap;
import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31135g extends AbstractC31137i {

    /* JADX INFO: renamed from: a */
    public final Bitmap f62958a;

    /* JADX INFO: renamed from: b */
    public final File f62959b;

    /* JADX INFO: renamed from: c */
    public final int f62960c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31135g)) {
            return false;
        }
        C31135g c31135g = (C31135g) obj;
        return Intrinsics.areEqual(this.f62958a, c31135g.f62958a) && Intrinsics.areEqual(this.f62959b, c31135g.f62959b) && this.f62960c == c31135g.f62960c;
    }

    public final int hashCode() {
        Bitmap bitmap = this.f62958a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        File file = this.f62959b;
        return Integer.hashCode(this.f62960c) + ((iHashCode + (file != null ? file.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Image(bitmap=" + this.f62958a + ", bitmapFile=" + this.f62959b + ", rotation=" + this.f62960c + ")";
    }

    public C31135g(Bitmap bitmap, File file, int i11) {
        this.f62958a = bitmap;
        this.f62959b = file;
        this.f62960c = i11;
    }
}
