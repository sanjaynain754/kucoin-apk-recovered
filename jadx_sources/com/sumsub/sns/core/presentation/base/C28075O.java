package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28075O {

    /* JADX INFO: renamed from: a */
    public final AbstractC29172p f57269a;

    /* JADX INFO: renamed from: b */
    public final C29124h f57270b;

    /* JADX INFO: renamed from: c */
    public final C29983l f57271c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28075O)) {
            return false;
        }
        C28075O c28075o = (C28075O) obj;
        return Intrinsics.areEqual(this.f57269a, c28075o.f57269a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f57270b, c28075o.f57270b) && Intrinsics.areEqual(this.f57271c, c28075o.f57271c);
    }

    public final int hashCode() {
        AbstractC29172p abstractC29172p = this.f57269a;
        int iHashCode = (abstractC29172p == null ? 0 : abstractC29172p.hashCode()) * 961;
        C29124h c29124h = this.f57270b;
        int iHashCode2 = (iHashCode + (c29124h == null ? 0 : c29124h.hashCode())) * 31;
        C29983l c29983l = this.f57271c;
        return iHashCode2 + (c29983l != null ? c29983l.hashCode() : 0);
    }

    public final String toString() {
        return "Data(applicant=" + this.f57269a + ", documentStatus=" + ((Object) null) + ", config=" + this.f57270b + ", strings=" + this.f57271c + ")";
    }

    public C28075O(C29124h c29124h, AbstractC29172p abstractC29172p, C29983l c29983l) {
        this.f57269a = abstractC29172p;
        this.f57270b = c29124h;
        this.f57271c = c29983l;
    }
}
