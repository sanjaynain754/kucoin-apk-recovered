package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.I1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29229I1 {

    @NotNull
    public static final C29224H1 Companion = new C29224H1();

    /* JADX INFO: renamed from: a */
    public final String f59222a;

    public /* synthetic */ C29229I1(int i11, String str) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29219G1.f59212a.getDescriptor());
        }
        this.f59222a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29229I1) && Intrinsics.areEqual(this.f59222a, ((C29229I1) obj).f59222a);
    }

    public C29229I1(String str) {
        this.f59222a = str;
    }

    public final int hashCode() {
        return this.f59222a.hashCode();
    }

    public final String toString() {
        return "Payload(visibilityState=" + this.f59222a + ")";
    }
}
