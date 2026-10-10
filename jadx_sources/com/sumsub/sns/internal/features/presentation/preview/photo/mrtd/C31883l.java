package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31883l {

    /* JADX INFO: renamed from: a */
    public final int f64794a;

    /* JADX INFO: renamed from: b */
    public final String f64795b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31883l)) {
            return false;
        }
        C31883l c31883l = (C31883l) obj;
        return this.f64794a == c31883l.f64794a && Intrinsics.areEqual(this.f64795b, c31883l.f64795b);
    }

    public final int hashCode() {
        return this.f64795b.hashCode() + (Integer.hashCode(this.f64794a) * 31);
    }

    public final String toString() {
        return "Config(instructionRes=" + this.f64794a + ", idDocType=" + this.f64795b + ")";
    }

    public C31883l(int i11, String str) {
        this.f64794a = i11;
        this.f64795b = str;
    }
}
