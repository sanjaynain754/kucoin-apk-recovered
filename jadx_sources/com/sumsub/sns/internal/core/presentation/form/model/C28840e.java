package com.sumsub.sns.internal.core.presentation.form.model;

import java.util.LinkedHashSet;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28840e {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f58664a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f58665b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28840e)) {
            return false;
        }
        C28840e c28840e = (C28840e) obj;
        return Intrinsics.areEqual(this.f58664a, c28840e.f58664a) && Intrinsics.areEqual(this.f58665b, c28840e.f58665b);
    }

    public final int hashCode() {
        return this.f58665b.hashCode() + (this.f58664a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckResult(illegalSectionIds=" + this.f58664a + ", illegalItemIds=" + this.f58665b + ")";
    }

    public C28840e(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.f58664a = linkedHashSet;
        this.f58665b = linkedHashSet2;
    }
}
