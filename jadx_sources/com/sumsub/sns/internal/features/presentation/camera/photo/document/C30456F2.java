package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.AbstractC28250a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.F2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30456F2 {

    /* JADX INFO: renamed from: a */
    public final int f61399a;

    /* JADX INFO: renamed from: b */
    public final int f61400b;

    /* JADX INFO: renamed from: c */
    public final int f61401c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30456F2)) {
            return false;
        }
        C30456F2 c30456f2 = (C30456F2) obj;
        return this.f61399a == c30456f2.f61399a && this.f61400b == c30456f2.f61400b && this.f61401c == c30456f2.f61401c;
    }

    public C30456F2() {
        int i11 = R$id.sns_upload_progress_container;
        int i12 = R$id.sns_upload_progress_text;
        int i13 = R$id.sns_upload_progress;
        this.f61399a = i11;
        this.f61400b = i12;
        this.f61401c = i13;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61401c) + AbstractC28250a.m69223a(this.f61400b, Integer.hashCode(this.f61399a) * 31, 31);
    }

    public final String toString() {
        return "Views(containerId=" + this.f61399a + ", textId=" + this.f61400b + ", progressId=" + this.f61401c + ")";
    }
}
