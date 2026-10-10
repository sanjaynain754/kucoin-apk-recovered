package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31008t implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final File f62669a;

    /* JADX INFO: renamed from: b */
    public final String f62670b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31008t)) {
            return false;
        }
        C31008t c31008t = (C31008t) obj;
        return Intrinsics.areEqual(this.f62669a, c31008t.f62669a) && Intrinsics.areEqual(this.f62670b, c31008t.f62670b);
    }

    public final int hashCode() {
        return this.f62670b.hashCode() + (this.f62669a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenImage(file=" + this.f62669a + ", docName=" + this.f62670b + ")";
    }

    public C31008t(File file, String str) {
        this.f62669a = file;
        this.f62670b = str;
    }
}
