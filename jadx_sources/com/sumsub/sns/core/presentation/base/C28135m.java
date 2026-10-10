package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28135m implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final AbstractC29149l0 f57362a;

    /* JADX INFO: renamed from: b */
    public final String f57363b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f57364c;

    /* JADX INFO: renamed from: d */
    public final String f57365d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28135m)) {
            return false;
        }
        C28135m c28135m = (C28135m) obj;
        return Intrinsics.areEqual(this.f57362a, c28135m.f57362a) && Intrinsics.areEqual(this.f57363b, c28135m.f57363b) && Intrinsics.areEqual(this.f57364c, c28135m.f57364c) && Intrinsics.areEqual(this.f57365d, c28135m.f57365d);
    }

    public final int hashCode() {
        AbstractC29149l0 abstractC29149l0 = this.f57362a;
        int iHashCode = (abstractC29149l0 == null ? 0 : abstractC29149l0.hashCode()) * 31;
        String str = this.f57363b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.f57364c;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.f57365d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        AbstractC29149l0 abstractC29149l0 = this.f57362a;
        String str = this.f57363b;
        CharSequence charSequence = this.f57364c;
        return "ErrorEvent(error=" + abstractC29149l0 + ", idDocSetType=" + str + ", buttonText=" + ((Object) charSequence) + ", requestKey=" + this.f57365d + ")";
    }

    public C28135m(AbstractC29149l0 abstractC29149l0, String str, CharSequence charSequence, String str2) {
        this.f57362a = abstractC29149l0;
        this.f57363b = str;
        this.f57364c = charSequence;
        this.f57365d = str2;
    }
}
