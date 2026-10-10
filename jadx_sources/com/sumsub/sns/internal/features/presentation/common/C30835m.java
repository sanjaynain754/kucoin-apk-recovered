package com.sumsub.sns.internal.features.presentation.common;

import android.content.Context;
import android.net.Uri;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30835m implements InterfaceC28077Q {

    /* JADX INFO: renamed from: a */
    public final Context f62276a;

    /* JADX INFO: renamed from: b */
    public final String f62277b;

    /* JADX INFO: renamed from: c */
    public final Uri f62278c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30835m)) {
            return false;
        }
        C30835m c30835m = (C30835m) obj;
        return Intrinsics.areEqual(this.f62276a, c30835m.f62276a) && Intrinsics.areEqual(this.f62277b, c30835m.f62277b) && Intrinsics.areEqual(this.f62278c, c30835m.f62278c);
    }

    public final int hashCode() {
        int iHashCode = this.f62276a.hashCode() * 31;
        String str = this.f62277b;
        return this.f62278c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "OnGalleryImagePicked(appContext=" + this.f62276a + ", mimeType=" + this.f62277b + ", uri=" + this.f62278c + ")";
    }

    public C30835m(Context context, String str, Uri uri) {
        this.f62276a = context;
        this.f62277b = str;
        this.f62278c = uri;
    }
}
