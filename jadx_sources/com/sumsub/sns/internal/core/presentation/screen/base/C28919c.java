package com.sumsub.sns.internal.core.presentation.screen.base;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28919c {

    /* JADX INFO: renamed from: a */
    public final AbstractC29149l0 f58805a;

    /* JADX INFO: renamed from: b */
    public final String f58806b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28919c)) {
            return false;
        }
        C28919c c28919c = (C28919c) obj;
        return Intrinsics.areEqual(this.f58805a, c28919c.f58805a) && Intrinsics.areEqual(this.f58806b, c28919c.f58806b);
    }

    public final int hashCode() {
        int iHashCode = this.f58805a.hashCode() * 31;
        String str = this.f58806b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ErrorSpec(error=" + this.f58805a + ", idDocSetType=" + this.f58806b + ")";
    }

    public C28919c(AbstractC29149l0 abstractC29149l0, String str) {
        this.f58805a = abstractC29149l0;
        this.f58806b = str;
    }
}
