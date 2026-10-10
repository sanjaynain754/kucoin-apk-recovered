package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31929r extends AbstractC31930s {

    /* JADX INFO: renamed from: a */
    public final C29070X f64908a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31929r) && Intrinsics.areEqual(this.f64908a, ((C31929r) obj).f64908a);
    }

    public final int hashCode() {
        return this.f64908a.f59014a.hashCode();
    }

    public final String toString() {
        return "Skip(type=" + this.f64908a + ")";
    }

    public C31929r(C29070X c29070x) {
        this.f64908a = c29070x;
    }
}
