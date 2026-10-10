package com.facebook.drawee.generic;

import androidx.annotation.ColorInt;
import java.util.Arrays;
import p712w3.C45708h;

/* JADX INFO: loaded from: classes34.dex */
public class RoundingParams {

    /* JADX INFO: renamed from: a */
    public RoundingMethod f8371a = RoundingMethod.BITMAP_ONLY;

    /* JADX INFO: renamed from: b */
    public boolean f8372b = false;

    /* JADX INFO: renamed from: c */
    public float[] f8373c = null;

    /* JADX INFO: renamed from: d */
    public int f8374d = 0;

    /* JADX INFO: renamed from: e */
    public float f8375e = 0.0f;

    /* JADX INFO: renamed from: f */
    public int f8376f = 0;

    /* JADX INFO: renamed from: g */
    public float f8377g = 0.0f;

    /* JADX INFO: renamed from: h */
    public boolean f8378h = false;

    /* JADX INFO: renamed from: i */
    public boolean f8379i = false;

    /* JADX INFO: renamed from: j */
    public boolean f8380j = false;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* JADX INFO: renamed from: n */
    public RoundingParams m8718n(float f11) {
        C45708h.m100892c(f11 >= 0.0f, "the border width cannot be < 0");
        this.f8375e = f11;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public RoundingParams m8722r(float f11) {
        C45708h.m100892c(f11 >= 0.0f, "the padding cannot be < 0");
        this.f8377g = f11;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public static RoundingParams m8705a(float f11) {
        return new RoundingParams().m8720p(f11);
    }

    /* JADX INFO: renamed from: b */
    public int m8706b() {
        return this.f8376f;
    }

    /* JADX INFO: renamed from: c */
    public float m8707c() {
        return this.f8375e;
    }

    /* JADX INFO: renamed from: d */
    public float[] m8708d() {
        return this.f8373c;
    }

    /* JADX INFO: renamed from: e */
    public final float[] m8709e() {
        if (this.f8373c == null) {
            this.f8373c = new float[8];
        }
        return this.f8373c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.f8372b == roundingParams.f8372b && this.f8374d == roundingParams.f8374d && Float.compare(roundingParams.f8375e, this.f8375e) == 0 && this.f8376f == roundingParams.f8376f && Float.compare(roundingParams.f8377g, this.f8377g) == 0 && this.f8371a == roundingParams.f8371a && this.f8378h == roundingParams.f8378h && this.f8379i == roundingParams.f8379i) {
            return Arrays.equals(this.f8373c, roundingParams.f8373c);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m8710f() {
        return this.f8374d;
    }

    /* JADX INFO: renamed from: g */
    public float m8711g() {
        return this.f8377g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m8712h() {
        return this.f8379i;
    }

    public int hashCode() {
        RoundingMethod roundingMethod = this.f8371a;
        int iHashCode = (((roundingMethod != null ? roundingMethod.hashCode() : 0) * 31) + (this.f8372b ? 1 : 0)) * 31;
        float[] fArr = this.f8373c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f8374d) * 31;
        float f11 = this.f8375e;
        int iFloatToIntBits = (((iHashCode2 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31) + this.f8376f) * 31;
        float f12 = this.f8377g;
        return ((((iFloatToIntBits + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31) + (this.f8378h ? 1 : 0)) * 31) + (this.f8379i ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public boolean m8713i() {
        return this.f8380j;
    }

    /* JADX INFO: renamed from: j */
    public boolean m8714j() {
        return this.f8372b;
    }

    /* JADX INFO: renamed from: k */
    public RoundingMethod m8715k() {
        return this.f8371a;
    }

    /* JADX INFO: renamed from: l */
    public boolean m8716l() {
        return this.f8378h;
    }

    /* JADX INFO: renamed from: m */
    public RoundingParams m8717m(@ColorInt int i11) {
        this.f8376f = i11;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public RoundingParams m8721q(@ColorInt int i11) {
        this.f8374d = i11;
        this.f8371a = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public RoundingParams m8723s(boolean z11) {
        this.f8379i = z11;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public RoundingParams m8724t(boolean z11) {
        this.f8372b = z11;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public RoundingParams m8725u(RoundingMethod roundingMethod) {
        this.f8371a = roundingMethod;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public RoundingParams m8719o(float f11, float f12, float f13, float f14) {
        float[] fArrM8709e = m8709e();
        fArrM8709e[1] = f11;
        fArrM8709e[0] = f11;
        fArrM8709e[3] = f12;
        fArrM8709e[2] = f12;
        fArrM8709e[5] = f13;
        fArrM8709e[4] = f13;
        fArrM8709e[7] = f14;
        fArrM8709e[6] = f14;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public RoundingParams m8720p(float f11) {
        Arrays.fill(m8709e(), f11);
        return this;
    }
}
