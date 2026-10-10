package com.sumsub.sns.internal.fingerprint.infoproviders;

import com.sumsub.sentry.AbstractC27897U;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33206b {

    /* JADX INFO: renamed from: a */
    public final String f67752a;

    /* JADX INFO: renamed from: b */
    public final String f67753b;

    /* JADX INFO: renamed from: c */
    public final String f67754c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33206b)) {
            return false;
        }
        C33206b c33206b = (C33206b) obj;
        return Intrinsics.areEqual(this.f67752a, c33206b.f67752a) && Intrinsics.areEqual(this.f67753b, c33206b.f67753b) && Intrinsics.areEqual(this.f67754c, c33206b.f67754c);
    }

    public final int hashCode() {
        return this.f67754c.hashCode() + AbstractC27897U.m68983a(this.f67753b, this.f67752a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CameraInfo(cameraName=" + this.f67752a + ", cameraType=" + this.f67753b + ", cameraOrientation=" + this.f67754c + ")";
    }

    public C33206b(String str, String str2, String str3) {
        this.f67752a = str;
        this.f67753b = str2;
        this.f67754c = str3;
    }
}
