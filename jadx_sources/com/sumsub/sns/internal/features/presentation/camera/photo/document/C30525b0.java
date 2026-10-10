package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30525b0 implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final boolean f61640a;

    /* JADX INFO: renamed from: b */
    public final float f61641b;

    /* JADX INFO: renamed from: c */
    public final long f61642c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30525b0)) {
            return false;
        }
        C30525b0 c30525b0 = (C30525b0) obj;
        return this.f61640a == c30525b0.f61640a && Float.compare(this.f61641b, c30525b0.f61641b) == 0 && this.f61642c == c30525b0.f61642c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f61642c) + ((Float.hashCode(this.f61641b) + (Boolean.hashCode(this.f61640a) * 31)) * 31);
    }

    public final String toString() {
        return "ShowQualityCheckResult(ok=" + this.f61640a + ", confidence=" + this.f61641b + ", timeMs=" + this.f61642c + ")";
    }

    public C30525b0(boolean z11, float f11, long j11) {
        this.f61640a = z11;
        this.f61641b = f11;
        this.f61642c = j11;
    }
}
