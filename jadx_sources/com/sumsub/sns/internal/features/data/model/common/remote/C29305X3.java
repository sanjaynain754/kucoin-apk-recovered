package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.X3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o(with = C29337c4.class)
public final class C29305X3 {

    @NotNull
    public static final C29300W3 Companion = new C29300W3();

    /* JADX INFO: renamed from: a */
    public final String f59312a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29434p f59313b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29305X3)) {
            return false;
        }
        C29305X3 c29305x3 = (C29305X3) obj;
        return Intrinsics.areEqual(this.f59312a, c29305x3.f59312a) && Intrinsics.areEqual(this.f59313b, c29305x3.f59313b);
    }

    public final int hashCode() {
        int iHashCode = this.f59312a.hashCode() * 31;
        InterfaceC29434p interfaceC29434p = this.f59313b;
        return iHashCode + (interfaceC29434p == null ? 0 : interfaceC29434p.hashCode());
    }

    public final String toString() {
        return "UpdatedField(name=" + this.f59312a + ", value=" + this.f59313b + ")";
    }

    public C29305X3(String str, InterfaceC29434p interfaceC29434p) {
        this.f59312a = str;
        this.f59313b = interfaceC29434p;
    }
}
