package com.sumsub.sns.internal.features.presentation.restrictions;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32349o {

    /* JADX INFO: renamed from: a */
    public final String f65914a;

    /* JADX INFO: renamed from: b */
    public final AbstractC32352r f65915b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32349o)) {
            return false;
        }
        C32349o c32349o = (C32349o) obj;
        return Intrinsics.areEqual(this.f65914a, c32349o.f65914a) && Intrinsics.areEqual(this.f65915b, c32349o.f65915b);
    }

    public final int hashCode() {
        return this.f65915b.hashCode() + (this.f65914a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f65914a;
        return "ButtonSpec(text=" + ((Object) str) + ", action=" + this.f65915b + ")";
    }

    public C32349o(String str, AbstractC32352r abstractC32352r) {
        this.f65914a = str;
        this.f65915b = abstractC32352r;
    }
}
