package com.sumsub.sns.internal.p126ml.core;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33333l extends AbstractC33335n {

    /* JADX INFO: renamed from: a */
    public final Object f67967a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33333l) && Intrinsics.areEqual(this.f67967a, ((C33333l) obj).f67967a);
    }

    public final int hashCode() {
        Object obj = this.f67967a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f67967a + ")";
    }

    public C33333l(Object obj) {
        this.f67967a = obj;
    }
}
