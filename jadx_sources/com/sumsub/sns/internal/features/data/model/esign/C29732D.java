package com.sumsub.sns.internal.features.data.model.esign;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29732D {

    @NotNull
    public static final C29731C Companion = new C29731C();

    /* JADX INFO: renamed from: a */
    public final String f59801a;

    public /* synthetic */ C29732D(int i11, String str) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29730B.f59800a.getDescriptor());
        }
        this.f59801a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29732D) && Intrinsics.areEqual(this.f59801a, ((C29732D) obj).f59801a);
    }

    public C29732D(String str) {
        this.f59801a = str;
    }

    public final int hashCode() {
        return this.f59801a.hashCode();
    }

    public final String toString() {
        return "Otp(code=" + this.f59801a + ")";
    }
}
