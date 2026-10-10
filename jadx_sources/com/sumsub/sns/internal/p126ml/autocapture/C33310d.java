package com.sumsub.sns.internal.p126ml.autocapture;

import android.util.Size;
import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.autocapture.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33310d {

    /* JADX INFO: renamed from: m */
    public static final C33308b f67911m = new C33308b();

    /* JADX INFO: renamed from: a */
    public final boolean f67912a;

    /* JADX INFO: renamed from: b */
    public final boolean f67913b;

    /* JADX INFO: renamed from: c */
    public final long f67914c;

    /* JADX INFO: renamed from: d */
    public final long f67915d;

    /* JADX INFO: renamed from: e */
    public final float f67916e;

    /* JADX INFO: renamed from: f */
    public final float f67917f;

    /* JADX INFO: renamed from: g */
    public final float f67918g;

    /* JADX INFO: renamed from: h */
    public final float f67919h;

    /* JADX INFO: renamed from: i */
    public final float f67920i;

    /* JADX INFO: renamed from: j */
    public final C33307a f67921j;

    /* JADX INFO: renamed from: k */
    public final Size f67922k;

    /* JADX INFO: renamed from: l */
    public final boolean f67923l;

    public C33310d(boolean z11, boolean z12, long j11, long j12, float f11, float f12, float f13, float f14, float f15, C33307a c33307a, Size size, boolean z13) {
        this.f67912a = z11;
        this.f67913b = z12;
        this.f67914c = j11;
        this.f67915d = j12;
        this.f67916e = f11;
        this.f67917f = f12;
        this.f67918g = f13;
        this.f67919h = f14;
        this.f67920i = f15;
        this.f67921j = c33307a;
        this.f67922k = size;
        this.f67923l = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33310d)) {
            return false;
        }
        C33310d c33310d = (C33310d) obj;
        return this.f67912a == c33310d.f67912a && this.f67913b == c33310d.f67913b && this.f67914c == c33310d.f67914c && this.f67915d == c33310d.f67915d && Float.compare(this.f67916e, c33310d.f67916e) == 0 && Float.compare(this.f67917f, c33310d.f67917f) == 0 && Float.compare(this.f67918g, c33310d.f67918g) == 0 && Float.compare(this.f67919h, c33310d.f67919h) == 0 && Float.compare(this.f67920i, c33310d.f67920i) == 0 && Intrinsics.areEqual(this.f67921j, c33310d.f67921j) && Intrinsics.areEqual(this.f67922k, c33310d.f67922k) && this.f67923l == c33310d.f67923l;
    }

    public final int hashCode() {
        int iHashCode = (this.f67921j.hashCode() + AbstractC27920h.m69001a(false, (Float.hashCode(this.f67920i) + ((Float.hashCode(this.f67919h) + ((Float.hashCode(this.f67918g) + ((Float.hashCode(this.f67917f) + ((Float.hashCode(this.f67916e) + ((Long.hashCode(this.f67915d) + AbstractC27920h.m69001a(false, (Long.hashCode(this.f67914c) + AbstractC27920h.m69001a(this.f67913b, Boolean.hashCode(this.f67912a) * 31, 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31;
        Size size = this.f67922k;
        return Boolean.hashCode(this.f67923l) + ((iHashCode + (size != null ? size.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DocumentAutocaptureMobileConfig(enabled=" + this.f67912a + ", showBounds=" + this.f67913b + ", waitForBetterPhotoMs=" + this.f67914c + ", enableInsideFrameAutoShot=false, insideFrameAutoShotTimeoutMs=" + this.f67915d + ", requiredFrameFillRatio=" + this.f67916e + ", requiredFrameFillRatioV2=" + this.f67917f + ", requiredLargestSizeOffsetRatio=" + this.f67918g + ", requiredLargestSizeOffsetRatioV2=" + this.f67919h + ", frameAspectRatio=" + this.f67920i + ", enableCropToFrame=false, autoCaptureModel=" + this.f67921j + ", frameSize=" + this.f67922k + ", imageCaptureUseCaseEnabled=" + this.f67923l + ")";
    }

    public /* synthetic */ C33310d() {
        this(true, false, 1500L, 0L, 0.0f, 0.0f, 0.1f, 0.1f, 1.75f, new C33307a(), null, false);
    }
}
