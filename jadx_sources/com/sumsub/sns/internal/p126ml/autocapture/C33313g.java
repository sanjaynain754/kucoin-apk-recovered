package com.sumsub.sns.internal.p126ml.autocapture;

import com.sumsub.sns.core.widget.AbstractC28250a;
import com.sumsub.sns.internal.util.DataUnit;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.autocapture.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33313g {

    /* JADX INFO: renamed from: f */
    public static final int f67924f = (int) DataUnit.MEGABYTES.toBytes(2);

    /* JADX INFO: renamed from: g */
    public static final int f67925g = (int) TimeUnit.MINUTES.toSeconds(1);

    /* JADX INFO: renamed from: a */
    public final int f67926a;

    /* JADX INFO: renamed from: b */
    public final int f67927b;

    /* JADX INFO: renamed from: c */
    public final SeamlessDocaptureMobileConfig$VideoQuality f67928c;

    /* JADX INFO: renamed from: d */
    public final SeamlessDocaptureMobileConfig$VideoQuality f67929d;

    /* JADX INFO: renamed from: e */
    public final int f67930e;

    public C33313g(int i11, int i12, SeamlessDocaptureMobileConfig$VideoQuality seamlessDocaptureMobileConfig$VideoQuality, SeamlessDocaptureMobileConfig$VideoQuality seamlessDocaptureMobileConfig$VideoQuality2, int i13) {
        this.f67926a = i11;
        this.f67927b = i12;
        this.f67928c = seamlessDocaptureMobileConfig$VideoQuality;
        this.f67929d = seamlessDocaptureMobileConfig$VideoQuality2;
        this.f67930e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33313g)) {
            return false;
        }
        C33313g c33313g = (C33313g) obj;
        return this.f67926a == c33313g.f67926a && this.f67927b == c33313g.f67927b && this.f67928c == c33313g.f67928c && this.f67929d == c33313g.f67929d && this.f67930e == c33313g.f67930e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67930e) + ((this.f67929d.hashCode() + ((this.f67928c.hashCode() + AbstractC28250a.m69223a(this.f67927b, Integer.hashCode(this.f67926a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SeamlessDocaptureMobileConfig(videoBitrate=" + this.f67926a + ", maxRecordedDurationSec=" + this.f67927b + ", videoQuality=" + this.f67928c + ", videoFallbackQuality=" + this.f67929d + ", maxRecordedFileSizeMB=" + this.f67930e + ")";
    }

    public /* synthetic */ C33313g() {
        this(f67924f, f67925g, SeamlessDocaptureMobileConfig$VideoQuality.HD, SeamlessDocaptureMobileConfig$VideoQuality.SD, 30);
    }
}
