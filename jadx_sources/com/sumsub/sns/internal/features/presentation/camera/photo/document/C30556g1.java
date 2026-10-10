package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.g1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30556g1 {

    /* JADX INFO: renamed from: a */
    public final Float f61710a;

    /* JADX INFO: renamed from: b */
    public final boolean f61711b;

    /* JADX INFO: renamed from: c */
    public final float f61712c;

    /* JADX INFO: renamed from: d */
    public final float f61713d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30556g1)) {
            return false;
        }
        C30556g1 c30556g1 = (C30556g1) obj;
        return Intrinsics.areEqual((Object) this.f61710a, (Object) c30556g1.f61710a) && this.f61711b == c30556g1.f61711b && Float.compare(this.f61712c, c30556g1.f61712c) == 0 && Float.compare(this.f61713d, c30556g1.f61713d) == 0;
    }

    public final int hashCode() {
        Float f11 = this.f61710a;
        return Float.hashCode(this.f61713d) + ((Float.hashCode(this.f61712c) + AbstractC27920h.m69001a(this.f61711b, (f11 == null ? 0 : f11.hashCode()) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PhotoQualityResult(checkScore=" + this.f61710a + ", isAutocaptured=" + this.f61711b + ", lowThreshold=" + this.f61712c + ", highThreshold=" + this.f61713d + ")";
    }

    public C30556g1(Float f11, boolean z11, float f12, float f13) {
        this.f61710a = f11;
        this.f61711b = z11;
        this.f61712c = f12;
        this.f61713d = f13;
    }
}
