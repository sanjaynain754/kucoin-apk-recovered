package com.sumsub.sns.internal.features.presentation.main.instructions;

import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.instructions.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31276a implements InterfaceC31279d {

    /* JADX INFO: renamed from: a */
    public final C29107e0 f63370a;

    /* JADX INFO: renamed from: b */
    public final String f63371b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31276a)) {
            return false;
        }
        C31276a c31276a = (C31276a) obj;
        return Intrinsics.areEqual(this.f63370a, c31276a.f63370a) && Intrinsics.areEqual(this.f63371b, c31276a.f63371b);
    }

    public final int hashCode() {
        return this.f63371b.hashCode() + (this.f63370a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.f63370a + ", idDocSetType=" + this.f63371b + ")";
    }

    public C31276a(C29107e0 c29107e0, String str) {
        this.f63370a = c29107e0;
        this.f63371b = str;
    }
}
