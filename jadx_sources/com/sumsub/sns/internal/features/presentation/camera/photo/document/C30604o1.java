package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.o1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30604o1 implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final boolean f61826a;

    /* JADX INFO: renamed from: b */
    public final float f61827b;

    /* JADX INFO: renamed from: c */
    public final long f61828c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30604o1)) {
            return false;
        }
        C30604o1 c30604o1 = (C30604o1) obj;
        return this.f61826a == c30604o1.f61826a && Float.compare(this.f61827b, c30604o1.f61827b) == 0 && this.f61828c == c30604o1.f61828c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f61828c) + ((Float.hashCode(this.f61827b) + (Boolean.hashCode(this.f61826a) * 31)) * 31);
    }

    public final String toString() {
        return "ShowQualityCheckResult(ok=" + this.f61826a + ", confidence=" + this.f61827b + ", timeMs=" + this.f61828c + ")";
    }

    public C30604o1(boolean z11, float f11, long j11) {
        this.f61826a = z11;
        this.f61827b = f11;
        this.f61828c = j11;
    }
}
