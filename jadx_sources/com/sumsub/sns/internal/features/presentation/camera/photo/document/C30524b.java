package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.R$id;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30524b {

    /* JADX INFO: renamed from: a */
    public final int f61638a;

    /* JADX INFO: renamed from: b */
    public final int f61639b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30524b)) {
            return false;
        }
        C30524b c30524b = (C30524b) obj;
        return this.f61638a == c30524b.f61638a && this.f61639b == c30524b.f61639b;
    }

    public C30524b() {
        int i11 = R$id.sns_autocapture_hint_container;
        int i12 = R$id.sns_autocapture_hint;
        this.f61638a = i11;
        this.f61639b = i12;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61639b) + (Integer.hashCode(this.f61638a) * 31);
    }

    public final String toString() {
        return "Views(containerId=" + this.f61638a + ", textId=" + this.f61639b + ")";
    }
}
