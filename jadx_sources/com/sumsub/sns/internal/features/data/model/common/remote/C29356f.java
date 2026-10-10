package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29356f {

    @NotNull
    public static final C29348e Companion = new C29348e();

    /* JADX INFO: renamed from: a */
    public final String f59373a;

    public /* synthetic */ C29356f(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f59373a = null;
        } else {
            this.f59373a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29356f) && Intrinsics.areEqual(this.f59373a, ((C29356f) obj).f59373a);
    }

    public C29356f(String str) {
        this.f59373a = str;
    }

    public final int hashCode() {
        String str = this.f59373a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "AgreementCriteria(country=" + this.f59373a + ")";
    }
}
