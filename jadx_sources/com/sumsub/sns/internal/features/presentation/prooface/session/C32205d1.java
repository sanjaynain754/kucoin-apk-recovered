package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.d1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32205d1 {

    /* JADX INFO: renamed from: a */
    public final String f65592a;

    /* JADX INFO: renamed from: b */
    public final boolean f65593b;

    /* JADX INFO: renamed from: c */
    public final int f65594c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32205d1)) {
            return false;
        }
        C32205d1 c32205d1 = (C32205d1) obj;
        return Intrinsics.areEqual(this.f65592a, c32205d1.f65592a) && this.f65593b == c32205d1.f65593b && this.f65594c == c32205d1.f65594c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65594c) + AbstractC27920h.m69001a(this.f65593b, this.f65592a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SessionParams(sessionKey=" + this.f65592a + ", calibrationEnabled=" + this.f65593b + ", requiredFragments=" + this.f65594c + ")";
    }

    public C32205d1(int i11, String str, boolean z11) {
        this.f65592a = str;
        this.f65593b = z11;
        this.f65594c = i11;
    }
}
