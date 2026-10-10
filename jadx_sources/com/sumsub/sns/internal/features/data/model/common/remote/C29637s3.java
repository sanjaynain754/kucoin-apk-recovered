package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.s3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29637s3 {

    @NotNull
    public static final C29452r3 Companion = new C29452r3();

    /* JADX INFO: renamed from: a */
    public final String f59695a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29637s3) && Intrinsics.areEqual(this.f59695a, ((C29637s3) obj).f59695a);
    }

    public final int hashCode() {
        String str = this.f59695a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Payload(idDocSetType=" + this.f59695a + ")";
    }

    public /* synthetic */ C29637s3(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f59695a = null;
        } else {
            this.f59695a = str;
        }
    }
}
