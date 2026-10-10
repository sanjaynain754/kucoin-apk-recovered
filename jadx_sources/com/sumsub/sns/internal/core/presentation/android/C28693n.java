package com.sumsub.sns.internal.core.presentation.android;

import java.util.Set;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28693n implements InterfaceC28697p {

    /* JADX INFO: renamed from: a */
    public final Set f58341a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28693n) && Intrinsics.areEqual(this.f58341a, ((C28693n) obj).f58341a);
    }

    public final int hashCode() {
        return this.f58341a.hashCode();
    }

    public final String toString() {
        return "RequestRuntimePermissions(permissions=" + this.f58341a + ")";
    }

    public C28693n(Set set) {
        this.f58341a = set;
    }
}
