package com.sumsub.sns.internal.p126ml.docdetector;

import android.graphics.Rect;
import com.sumsub.sns.core.widget.AbstractC28250a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.docdetector.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33350a {

    /* JADX INFO: renamed from: a */
    public final int f67987a;

    /* JADX INFO: renamed from: b */
    public final int f67988b;

    /* JADX INFO: renamed from: c */
    public final int f67989c;

    /* JADX INFO: renamed from: d */
    public final int f67990d;

    /* JADX INFO: renamed from: e */
    public final float f67991e;

    /* JADX INFO: renamed from: f */
    public final long f67992f;

    /* JADX INFO: renamed from: g */
    public final long f67993g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33350a)) {
            return false;
        }
        C33350a c33350a = (C33350a) obj;
        return this.f67987a == c33350a.f67987a && this.f67988b == c33350a.f67988b && this.f67989c == c33350a.f67989c && this.f67990d == c33350a.f67990d && Float.compare(this.f67991e, c33350a.f67991e) == 0 && this.f67992f == c33350a.f67992f && this.f67993g == c33350a.f67993g;
    }

    /* JADX INFO: renamed from: a */
    public final Rect m71661a() {
        int i11 = this.f67987a - (this.f67989c / 2);
        int i12 = this.f67988b - (this.f67990d / 2);
        return new Rect(i11, i12, this.f67989c + i11, this.f67990d + i12);
    }

    public final int hashCode() {
        return Long.hashCode(this.f67993g) + ((Long.hashCode(this.f67992f) + ((Float.hashCode(this.f67991e) + AbstractC28250a.m69223a(this.f67990d, AbstractC28250a.m69223a(this.f67989c, AbstractC28250a.m69223a(this.f67988b, Integer.hashCode(this.f67987a) * 31, 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DetectionResult(cx=" + this.f67987a + ", cy=" + this.f67988b + ", width=" + this.f67989c + ", height=" + this.f67990d + ", confidence=" + this.f67991e + ", inferenceTimeMs=" + this.f67992f + ", timeMs=" + this.f67993g + ")";
    }

    public C33350a(int i11, int i12, int i13, int i14, float f11, long j11, long j12) {
        this.f67987a = i11;
        this.f67988b = i12;
        this.f67989c = i13;
        this.f67990d = i14;
        this.f67991e = f11;
        this.f67992f = j11;
        this.f67993g = j12;
    }
}
