package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32486O {

    /* JADX INFO: renamed from: a */
    public final Integer f66258a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66259b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66260c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32486O)) {
            return false;
        }
        C32486O c32486o = (C32486O) obj;
        return Intrinsics.areEqual(this.f66258a, c32486o.f66258a) && Intrinsics.areEqual(this.f66259b, c32486o.f66259b) && Intrinsics.areEqual(this.f66260c, c32486o.f66260c);
    }

    public final int hashCode() {
        Integer num = this.f66258a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        CharSequence charSequence = this.f66259b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f66260c;
        return iHashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "Benefit(icon=" + this.f66258a + ", title=" + ((Object) this.f66259b) + ", body=" + ((Object) this.f66260c) + ")";
    }

    public C32486O(Integer num, String str, String str2) {
        this.f66258a = num;
        this.f66259b = str;
        this.f66260c = str2;
    }
}
