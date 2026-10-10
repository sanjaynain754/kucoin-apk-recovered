package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DocumentData {

    /* JADX INFO: renamed from: a */
    public String f6033a;

    /* JADX INFO: renamed from: b */
    public String f6034b;

    /* JADX INFO: renamed from: c */
    public float f6035c;

    /* JADX INFO: renamed from: d */
    public Justification f6036d;

    /* JADX INFO: renamed from: e */
    public int f6037e;

    /* JADX INFO: renamed from: f */
    public float f6038f;

    /* JADX INFO: renamed from: g */
    public float f6039g;

    /* JADX INFO: renamed from: h */
    @ColorInt
    public int f6040h;

    /* JADX INFO: renamed from: i */
    @ColorInt
    public int f6041i;

    /* JADX INFO: renamed from: j */
    public float f6042j;

    /* JADX INFO: renamed from: k */
    public boolean f6043k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public PointF f6044l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public PointF f6045m;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f11, Justification justification, int i11, float f12, float f13, @ColorInt int i12, @ColorInt int i13, float f14, boolean z11, PointF pointF, PointF pointF2) {
        m5683a(str, str2, f11, justification, i11, f12, f13, i12, i13, f14, z11, pointF, pointF2);
    }

    /* JADX INFO: renamed from: a */
    public void m5683a(String str, String str2, float f11, Justification justification, int i11, float f12, float f13, @ColorInt int i12, @ColorInt int i13, float f14, boolean z11, PointF pointF, PointF pointF2) {
        this.f6033a = str;
        this.f6034b = str2;
        this.f6035c = f11;
        this.f6036d = justification;
        this.f6037e = i11;
        this.f6038f = f12;
        this.f6039g = f13;
        this.f6040h = i12;
        this.f6041i = i13;
        this.f6042j = f14;
        this.f6043k = z11;
        this.f6044l = pointF;
        this.f6045m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f6033a.hashCode() * 31) + this.f6034b.hashCode()) * 31) + this.f6035c)) * 31) + this.f6036d.ordinal()) * 31) + this.f6037e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f6038f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f6040h;
    }

    public DocumentData() {
    }
}
