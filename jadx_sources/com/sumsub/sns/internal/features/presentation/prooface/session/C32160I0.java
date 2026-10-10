package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.Bitmap;
import android.util.Size;
import com.sumsub.sentry.AbstractC27897U;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.I0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32160I0 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f65477a;

    /* JADX INFO: renamed from: b */
    public final Size f65478b;

    /* JADX INFO: renamed from: c */
    public final String f65479c;

    /* JADX INFO: renamed from: d */
    public final boolean f65480d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32160I0)) {
            return false;
        }
        C32160I0 c32160i0 = (C32160I0) obj;
        return Intrinsics.areEqual(this.f65477a, c32160i0.f65477a) && Intrinsics.areEqual(this.f65478b, c32160i0.f65478b) && Intrinsics.areEqual(this.f65479c, c32160i0.f65479c) && this.f65480d == c32160i0.f65480d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65480d) + AbstractC27897U.m68983a(this.f65479c, (this.f65478b.hashCode() + (this.f65477a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LivenessSegment(bitmap=" + this.f65477a + ", trackSize=" + this.f65478b + ", faceStatus=" + this.f65479c + ", isDebug=" + this.f65480d + ")";
    }

    public C32160I0(Bitmap bitmap, Size size, String str, boolean z11) {
        this.f65477a = bitmap;
        this.f65478b = size;
        this.f65479c = str;
        this.f65480d = z11;
    }
}
