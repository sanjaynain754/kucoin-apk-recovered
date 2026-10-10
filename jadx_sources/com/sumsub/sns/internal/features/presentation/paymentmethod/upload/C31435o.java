package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import android.text.Spanned;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31435o extends AbstractC31436p {

    /* JADX INFO: renamed from: a */
    public final String f63704a;

    /* JADX INFO: renamed from: b */
    public final String f63705b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f63706c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f63707d;

    /* JADX INFO: renamed from: e */
    public final C31433m f63708e;

    /* JADX INFO: renamed from: f */
    public final C31431k f63709f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31435o)) {
            return false;
        }
        C31435o c31435o = (C31435o) obj;
        return Intrinsics.areEqual(this.f63704a, c31435o.f63704a) && Intrinsics.areEqual(this.f63705b, c31435o.f63705b) && Intrinsics.areEqual(this.f63706c, c31435o.f63706c) && Intrinsics.areEqual(this.f63707d, c31435o.f63707d) && Intrinsics.areEqual(this.f63708e, c31435o.f63708e) && Intrinsics.areEqual(this.f63709f, c31435o.f63709f);
    }

    public final int hashCode() {
        int iHashCode = (this.f63705b.hashCode() + (this.f63704a.hashCode() * 31)) * 31;
        CharSequence charSequence = this.f63706c;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f63707d;
        return this.f63709f.hashCode() + ((this.f63708e.hashCode() + ((iHashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f63704a;
        String str2 = this.f63705b;
        CharSequence charSequence = this.f63706c;
        CharSequence charSequence2 = this.f63707d;
        return "DocUpload(title=" + ((Object) str) + ", subtitle=" + ((Object) str2) + ", body=" + ((Object) charSequence) + ", disclaimer=" + ((Object) charSequence2) + ", fileChooser=" + this.f63708e + ", primaryButton=" + this.f63709f + ")";
    }

    public C31435o(String str, String str2, Spanned spanned, String str3, C31433m c31433m, C31431k c31431k) {
        this.f63704a = str;
        this.f63705b = str2;
        this.f63706c = spanned;
        this.f63707d = str3;
        this.f63708e = c31433m;
        this.f63709f = c31431k;
    }
}
