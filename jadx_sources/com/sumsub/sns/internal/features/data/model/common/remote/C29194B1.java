package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.B1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29194B1 {

    @NotNull
    public static final C29189A1 Companion = new C29189A1();

    /* JADX INFO: renamed from: a */
    public final String f59188a;

    public /* synthetic */ C29194B1(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f59188a = null;
        } else {
            this.f59188a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29194B1) && Intrinsics.areEqual(this.f59188a, ((C29194B1) obj).f59188a);
    }

    public C29194B1(String str) {
        this.f59188a = str;
    }

    public final int hashCode() {
        String str = this.f59188a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Payload(name=" + this.f59188a + ")";
    }
}
