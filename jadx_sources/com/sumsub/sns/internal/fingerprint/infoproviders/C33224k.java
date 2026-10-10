package com.sumsub.sns.internal.fingerprint.infoproviders;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33224k {

    /* JADX INFO: renamed from: a */
    public final String f67771a;

    /* JADX INFO: renamed from: b */
    public final List f67772b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33224k)) {
            return false;
        }
        C33224k c33224k = (C33224k) obj;
        return Intrinsics.areEqual(this.f67771a, c33224k.f67771a) && Intrinsics.areEqual(this.f67772b, c33224k.f67772b);
    }

    public final int hashCode() {
        return this.f67772b.hashCode() + (this.f67771a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaCodecInfo(name=" + this.f67771a + ", capabilities=" + this.f67772b + ")";
    }

    public C33224k(String str, List list) {
        this.f67771a = str;
        this.f67772b = list;
    }
}
