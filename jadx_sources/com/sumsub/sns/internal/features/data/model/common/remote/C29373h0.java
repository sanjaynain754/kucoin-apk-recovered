package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29373h0 {

    @NotNull
    public static final C29365g0 Companion = new C29365g0();

    /* JADX INFO: renamed from: a */
    public final String f59383a;

    public /* synthetic */ C29373h0(int i11, String str) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29357f0.f59374a.getDescriptor());
        }
        this.f59383a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29373h0) && Intrinsics.areEqual(this.f59383a, ((C29373h0) obj).f59383a);
    }

    public C29373h0(String str) {
        this.f59383a = str;
    }

    public final int hashCode() {
        return this.f59383a.hashCode();
    }

    public final String toString() {
        return "MRTDProcessingError(reason=" + this.f59383a + ")";
    }
}
