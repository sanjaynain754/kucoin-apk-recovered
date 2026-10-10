package com.sumsub.sns.internal.core.presentation.camera;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28734c extends AbstractC28738e {

    /* JADX INFO: renamed from: a */
    public final int f58436a;

    /* JADX INFO: renamed from: b */
    public final Throwable f58437b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28734c)) {
            return false;
        }
        C28734c c28734c = (C28734c) obj;
        return this.f58436a == c28734c.f58436a && Intrinsics.areEqual(this.f58437b, c28734c.f58437b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f58436a) * 31;
        Throwable th2 = this.f58437b;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "Error(code=" + this.f58436a + ", cause=" + this.f58437b + ")";
    }

    public C28734c(int i11, Throwable th2) {
        this.f58436a = i11;
        this.f58437b = th2;
    }
}
