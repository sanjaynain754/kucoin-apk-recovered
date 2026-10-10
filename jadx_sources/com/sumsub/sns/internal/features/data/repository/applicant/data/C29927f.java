package com.sumsub.sns.internal.features.data.repository.applicant.data;

import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.data.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29927f {

    @NotNull
    public static final C29926e Companion = new C29926e();

    /* JADX INFO: renamed from: a */
    public final C29332c f60062a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29927f) && Intrinsics.areEqual(this.f60062a, ((C29927f) obj).f60062a);
    }

    public final int hashCode() {
        C29332c c29332c = this.f60062a;
        if (c29332c == null) {
            return 0;
        }
        return c29332c.hashCode();
    }

    public final String toString() {
        return "AgreementResponse(agreement=" + this.f60062a + ")";
    }

    public /* synthetic */ C29927f(int i11, C29332c c29332c) {
        if ((i11 & 1) == 0) {
            this.f60062a = null;
        } else {
            this.f60062a = c29332c;
        }
    }
}
