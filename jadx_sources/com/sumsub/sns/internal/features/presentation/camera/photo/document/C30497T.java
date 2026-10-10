package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30497T {

    /* JADX INFO: renamed from: a */
    public final Float f61570a;

    /* JADX INFO: renamed from: b */
    public final boolean f61571b;

    /* JADX INFO: renamed from: c */
    public final float f61572c;

    /* JADX INFO: renamed from: d */
    public final float f61573d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30497T)) {
            return false;
        }
        C30497T c30497t = (C30497T) obj;
        return Intrinsics.areEqual((Object) this.f61570a, (Object) c30497t.f61570a) && this.f61571b == c30497t.f61571b && Float.compare(this.f61572c, c30497t.f61572c) == 0 && Float.compare(this.f61573d, c30497t.f61573d) == 0;
    }

    public final int hashCode() {
        Float f11 = this.f61570a;
        return Float.hashCode(this.f61573d) + ((Float.hashCode(this.f61572c) + AbstractC27920h.m69001a(this.f61571b, (f11 == null ? 0 : f11.hashCode()) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PhotoQualityResult(checkScore=" + this.f61570a + ", isAutocaptured=" + this.f61571b + ", lowThreshold=" + this.f61572c + ", highThreshold=" + this.f61573d + ")";
    }

    public C30497T(Float f11, boolean z11, float f12, float f13) {
        this.f61570a = f11;
        this.f61571b = z11;
        this.f61572c = f12;
        this.f61573d = f13;
    }
}
