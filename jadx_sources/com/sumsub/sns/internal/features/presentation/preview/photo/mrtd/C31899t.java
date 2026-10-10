package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import com.sumsub.sentry.AbstractC27897U;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31899t {

    /* JADX INFO: renamed from: a */
    public final int f64830a;

    /* JADX INFO: renamed from: b */
    public final String f64831b;

    /* JADX INFO: renamed from: c */
    public final String f64832c;

    /* JADX INFO: renamed from: d */
    public final C31907x f64833d;

    /* JADX INFO: renamed from: e */
    public final C31883l f64834e;

    /* JADX INFO: renamed from: f */
    public final C31855b f64835f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31899t)) {
            return false;
        }
        C31899t c31899t = (C31899t) obj;
        return this.f64830a == c31899t.f64830a && Intrinsics.areEqual(this.f64831b, c31899t.f64831b) && Intrinsics.areEqual(this.f64832c, c31899t.f64832c);
    }

    public final int hashCode() {
        return this.f64832c.hashCode() + AbstractC27897U.m68983a(this.f64831b, Integer.hashCode(this.f64830a) * 31, 31);
    }

    public final String toString() {
        return "Config(instructionRes=" + this.f64830a + ", idDocType=" + this.f64831b + ", country=" + this.f64832c + ")";
    }

    public C31899t(int i11, String str, String str2) {
        this.f64830a = i11;
        this.f64831b = str;
        this.f64832c = str2;
        this.f64833d = new C31907x(i11);
        this.f64834e = new C31883l(i11, str);
        this.f64835f = new C31855b(str, str2);
    }
}
