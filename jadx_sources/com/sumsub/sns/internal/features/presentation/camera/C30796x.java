package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sns.internal.core.presentation.common.InterfaceC28771f;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30796x implements InterfaceC28771f {

    /* JADX INFO: renamed from: a */
    public final CharSequence f62222a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30796x) && Intrinsics.areEqual(this.f62222a, ((C30796x) obj).f62222a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f62222a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "State(title=" + ((Object) this.f62222a) + ")";
    }

    public C30796x(CharSequence charSequence) {
        this.f62222a = charSequence;
    }
}
