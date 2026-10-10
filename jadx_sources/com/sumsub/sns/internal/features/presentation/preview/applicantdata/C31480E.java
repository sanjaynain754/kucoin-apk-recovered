package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import java.util.List;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31480E {

    /* JADX INFO: renamed from: a */
    public final List f63874a;

    /* JADX INFO: renamed from: b */
    public final Map f63875b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31480E)) {
            return false;
        }
        C31480E c31480e = (C31480E) obj;
        return Intrinsics.areEqual(this.f63874a, c31480e.f63874a) && Intrinsics.areEqual(this.f63875b, c31480e.f63875b);
    }

    public final int hashCode() {
        List list = this.f63874a;
        return this.f63875b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "TinsRemovalResult(formFields=" + this.f63874a + ", fieldValueCache=" + this.f63875b + ")";
    }

    public C31480E(List list, Map map) {
        this.f63874a = list;
        this.f63875b = map;
    }
}
