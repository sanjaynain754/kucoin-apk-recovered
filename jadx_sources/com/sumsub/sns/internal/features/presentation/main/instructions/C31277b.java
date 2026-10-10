package com.sumsub.sns.internal.features.presentation.main.instructions;

import com.sumsub.sns.internal.features.presentation.main.C31237Z;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.instructions.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31277b implements InterfaceC31279d {

    /* JADX INFO: renamed from: a */
    public final C31237Z f63372a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31277b) && Intrinsics.areEqual(this.f63372a, ((C31277b) obj).f63372a);
    }

    public final int hashCode() {
        return this.f63372a.hashCode();
    }

    public final String toString() {
        return "Instructions(instructions=" + this.f63372a + ")";
    }

    public C31277b(C31237Z c31237z) {
        this.f63372a = c31237z;
    }
}
