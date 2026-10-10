package com.sumsub.sns.internal.features.presentation.sumsubid;

import java.util.ArrayList;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.Q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32491Q0 extends AbstractC32498U0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66303a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66304b;

    /* JADX INFO: renamed from: c */
    public final List f66305c;

    /* JADX INFO: renamed from: d */
    public final C32520f f66306d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32491Q0)) {
            return false;
        }
        C32491Q0 c32491q0 = (C32491Q0) obj;
        return Intrinsics.areEqual(this.f66303a, c32491q0.f66303a) && Intrinsics.areEqual(this.f66304b, c32491q0.f66304b) && Intrinsics.areEqual(this.f66305c, c32491q0.f66305c) && Intrinsics.areEqual(this.f66306d, c32491q0.f66306d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66303a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66304b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        List list = this.f66305c;
        return this.f66306d.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66303a;
        CharSequence charSequence2 = this.f66304b;
        return "DocumentsSelector(buttonText=" + ((Object) charSequence) + ", agreementText=" + ((Object) charSequence2) + ", items=" + this.f66305c + ", confirmAction=" + this.f66306d + ")";
    }

    public C32491Q0(String str, String str2, ArrayList arrayList, C32520f c32520f) {
        this.f66303a = str;
        this.f66304b = str2;
        this.f66305c = arrayList;
        this.f66306d = c32520f;
    }
}
