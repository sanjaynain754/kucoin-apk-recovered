package com.sumsub.sns.internal.features.data.model.sumsubid;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29844B {

    @NotNull
    public static final C29843A Companion = new C29843A();

    /* JADX INFO: renamed from: a */
    public final String f59933a;

    public /* synthetic */ C29844B(int i11, String str) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29885z.f59986a.getDescriptor());
        }
        this.f59933a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29844B) && Intrinsics.areEqual(this.f59933a, ((C29844B) obj).f59933a);
    }

    public C29844B(String str) {
        this.f59933a = str;
    }

    public final int hashCode() {
        String str = this.f59933a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "SNSSumsubIdLoginRequestBody(email=" + this.f59933a + ")";
    }
}
