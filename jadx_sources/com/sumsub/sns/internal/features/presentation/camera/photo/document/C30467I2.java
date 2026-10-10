package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.widget.AbstractC28250a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.I2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30467I2 {

    /* JADX INFO: renamed from: d */
    public static final C30464H2 f61427d = new C30464H2();

    /* JADX INFO: renamed from: a */
    public final float f61428a;

    /* JADX INFO: renamed from: b */
    public final int f61429b;

    /* JADX INFO: renamed from: c */
    public final float f61430c;

    public C30467I2() {
        this.f61428a = 3.0f;
        this.f61429b = 1;
        this.f61430c = 3.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30467I2)) {
            return false;
        }
        C30467I2 c30467i2 = (C30467I2) obj;
        return Float.compare(this.f61428a, c30467i2.f61428a) == 0 && this.f61429b == c30467i2.f61429b && Float.compare(this.f61430c, c30467i2.f61430c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f61430c) + AbstractC28250a.m69223a(this.f61429b, Float.hashCode(this.f61428a) * 31, 31);
    }

    public final String toString() {
        return "W2AskToTiltDocumentOnSeamlessConfig(tiltAnimationCycleDurationSec=" + this.f61428a + ", tiltAnimationNumberOfCycles=" + this.f61429b + ", tiltWaitAfterAnimationSec=" + this.f61430c + ")";
    }

    public C30467I2(float f11, int i11, float f12) {
        this.f61428a = f11;
        this.f61429b = i11;
        this.f61430c = f12;
    }
}
