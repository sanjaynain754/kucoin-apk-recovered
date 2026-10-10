package com.sumsub.sns.internal.features.data.model.esign;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29745Q {

    @NotNull
    public static final C29744P Companion = new C29744P();

    /* JADX INFO: renamed from: a */
    public final C29779o f59815a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29745Q) && Intrinsics.areEqual(this.f59815a, ((C29745Q) obj).f59815a);
    }

    public final int hashCode() {
        C29779o c29779o = this.f59815a;
        if (c29779o == null) {
            return 0;
        }
        return c29779o.hashCode();
    }

    public final String toString() {
        return "ESignRequiredData(idDoc=" + this.f59815a + ")";
    }

    public /* synthetic */ C29745Q(int i11, C29779o c29779o) {
        if ((i11 & 1) == 0) {
            this.f59815a = null;
        } else {
            this.f59815a = c29779o;
        }
    }
}
