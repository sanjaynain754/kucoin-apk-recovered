package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.AbstractC28250a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30363b {

    /* JADX INFO: renamed from: a */
    public final int f61068a;

    /* JADX INFO: renamed from: b */
    public final int f61069b;

    /* JADX INFO: renamed from: c */
    public final int f61070c;

    /* JADX INFO: renamed from: d */
    public final int f61071d;

    /* JADX INFO: renamed from: e */
    public final int f61072e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30363b)) {
            return false;
        }
        C30363b c30363b = (C30363b) obj;
        return this.f61068a == c30363b.f61068a && this.f61069b == c30363b.f61069b && this.f61070c == c30363b.f61070c && this.f61071d == c30363b.f61071d && this.f61072e == c30363b.f61072e;
    }

    public C30363b() {
        int i11 = R$id.sns_primary_button;
        int i12 = R$id.sns_button;
        int i13 = R$id.sns_primary_button_progress;
        int i14 = R$id.sns_gallery;
        int i15 = R$id.sns_info;
        this.f61068a = i11;
        this.f61069b = i12;
        this.f61070c = i13;
        this.f61071d = i14;
        this.f61072e = i15;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61072e) + AbstractC28250a.m69223a(this.f61071d, AbstractC28250a.m69223a(this.f61070c, AbstractC28250a.m69223a(this.f61069b, Integer.hashCode(this.f61068a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Views(takePictureContainerId=" + this.f61068a + ", takePictureButtonId=" + this.f61069b + ", takePictureProgressId=" + this.f61070c + ", galleryButtonId=" + this.f61071d + ", infoButtonId=" + this.f61072e + ")";
    }
}
