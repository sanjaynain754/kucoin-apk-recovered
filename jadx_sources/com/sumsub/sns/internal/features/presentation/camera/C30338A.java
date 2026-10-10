package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sns.R$id;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30338A {

    /* JADX INFO: renamed from: a */
    public final int f61002a;

    /* JADX INFO: renamed from: b */
    public final int f61003b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30338A)) {
            return false;
        }
        C30338A c30338a = (C30338A) obj;
        return this.f61002a == c30338a.f61002a && this.f61003b == c30338a.f61003b;
    }

    public C30338A() {
        int i11 = R$id.sns_toolbar;
        int i12 = R$id.sns_toolbar_title;
        this.f61002a = i11;
        this.f61003b = i12;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61003b) + (Integer.hashCode(this.f61002a) * 31);
    }

    public final String toString() {
        return "Views(toolbarViewId=" + this.f61002a + ", titleViewId=" + this.f61003b + ")";
    }
}
