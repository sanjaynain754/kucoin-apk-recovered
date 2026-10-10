package com.sumsub.sns.core.presentation.base;

import android.os.Bundle;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28139o implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final int f57373a;

    /* JADX INFO: renamed from: b */
    public final Bundle f57374b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28139o)) {
            return false;
        }
        C28139o c28139o = (C28139o) obj;
        return this.f57373a == c28139o.f57373a && Intrinsics.areEqual(this.f57374b, c28139o.f57374b);
    }

    public final int hashCode() {
        return this.f57374b.hashCode() + (Integer.hashCode(this.f57373a) * 31);
    }

    public final String toString() {
        return "FinishWithResultEvent(result=" + this.f57373a + ", data=" + this.f57374b + ")";
    }

    public C28139o(int i11, Bundle bundle) {
        this.f57373a = i11;
        this.f57374b = bundle;
    }
}
