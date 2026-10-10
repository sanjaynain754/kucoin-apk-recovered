package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.AbstractC28250a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30390n {

    /* JADX INFO: renamed from: a */
    public final int f61138a;

    /* JADX INFO: renamed from: b */
    public final int f61139b;

    /* JADX INFO: renamed from: c */
    public final int f61140c;

    /* JADX INFO: renamed from: d */
    public final int f61141d;

    /* JADX INFO: renamed from: e */
    public final int f61142e;

    /* JADX INFO: renamed from: f */
    public final int f61143f;

    /* JADX INFO: renamed from: g */
    public final int f61144g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30390n)) {
            return false;
        }
        C30390n c30390n = (C30390n) obj;
        return this.f61138a == c30390n.f61138a && this.f61139b == c30390n.f61139b && this.f61140c == c30390n.f61140c && this.f61141d == c30390n.f61141d && this.f61142e == c30390n.f61142e && this.f61143f == c30390n.f61143f && this.f61144g == c30390n.f61144g;
    }

    public C30390n() {
        int i11 = R$id.sns_helper;
        int i12 = R$id.sns_dark_overlay;
        int i13 = R$id.sns_brief_details;
        int i14 = R$id.sns_intro_content;
        int i15 = R$id.sns_helper_title;
        int i16 = R$id.sns_helper_brief;
        int i17 = R$id.sns_helper_details;
        this.f61138a = i11;
        this.f61139b = i12;
        this.f61140c = i13;
        this.f61141d = i14;
        this.f61142e = i15;
        this.f61143f = i16;
        this.f61144g = i17;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61144g) + AbstractC28250a.m69223a(this.f61143f, AbstractC28250a.m69223a(this.f61142e, AbstractC28250a.m69223a(this.f61141d, AbstractC28250a.m69223a(this.f61140c, AbstractC28250a.m69223a(this.f61139b, Integer.hashCode(this.f61138a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Views(helperViewId=" + this.f61138a + ", darkOverlayId=" + this.f61139b + ", briefDetailsId=" + this.f61140c + ", introContentId=" + this.f61141d + ", helperTitleId=" + this.f61142e + ", helperBriefId=" + this.f61143f + ", helperDetailsId=" + this.f61144g + ")";
    }
}
