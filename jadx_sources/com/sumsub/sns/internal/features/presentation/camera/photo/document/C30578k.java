package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.AbstractC28250a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30578k {

    /* JADX INFO: renamed from: a */
    public final int f61753a;

    /* JADX INFO: renamed from: b */
    public final int f61754b;

    /* JADX INFO: renamed from: c */
    public final int f61755c;

    /* JADX INFO: renamed from: d */
    public final int f61756d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30578k)) {
            return false;
        }
        C30578k c30578k = (C30578k) obj;
        return this.f61753a == c30578k.f61753a && this.f61754b == c30578k.f61754b && this.f61755c == c30578k.f61755c && this.f61756d == c30578k.f61756d;
    }

    public C30578k() {
        int i11 = R$id.sns_frame_popup_hint_container;
        int i12 = R$id.sns_text;
        int i13 = R$id.sns_icon;
        int i14 = R$id.sns_animation;
        this.f61753a = i11;
        this.f61754b = i12;
        this.f61755c = i13;
        this.f61756d = i14;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61756d) + AbstractC28250a.m69223a(this.f61755c, AbstractC28250a.m69223a(this.f61754b, Integer.hashCode(this.f61753a) * 31, 31), 31);
    }

    public final String toString() {
        return "Views(containerId=" + this.f61753a + ", textId=" + this.f61754b + ", iconId=" + this.f61755c + ", animationId=" + this.f61756d + ")";
    }
}
