package com.sumsub.sns.internal.p126ml.autocapture;

import android.util.Size;
import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.autocapture.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33307a extends AbstractC33309c {

    /* JADX INFO: renamed from: a */
    public final String f67906a;

    /* JADX INFO: renamed from: b */
    public final float f67907b;

    /* JADX INFO: renamed from: c */
    public final boolean f67908c;

    /* JADX INFO: renamed from: d */
    public final Size f67909d;

    /* JADX INFO: renamed from: e */
    public final int f67910e;

    public /* synthetic */ C33307a() {
        this("autocapture_v1.tflite", 0.3f, true, new Size(0, 0), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33307a)) {
            return false;
        }
        C33307a c33307a = (C33307a) obj;
        return Intrinsics.areEqual(this.f67906a, c33307a.f67906a) && Float.compare(this.f67907b, c33307a.f67907b) == 0 && this.f67908c == c33307a.f67908c && Intrinsics.areEqual(this.f67909d, c33307a.f67909d) && this.f67910e == c33307a.f67910e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67910e) + ((this.f67909d.hashCode() + AbstractC27920h.m69001a(this.f67908c, (Float.hashCode(this.f67907b) + (this.f67906a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "AutoCaptureModel(name=" + this.f67906a + ", threshold=" + this.f67907b + ", allowCache=" + this.f67908c + ", inputSize=" + this.f67909d + ", outputSize=" + this.f67910e + ")";
    }

    public C33307a(String str, float f11, boolean z11, Size size, int i11) {
        this.f67906a = str;
        this.f67907b = f11;
        this.f67908c = z11;
        this.f67909d = size;
        this.f67910e = i11;
    }
}
