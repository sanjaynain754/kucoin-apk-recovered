package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.h3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29376h3 {

    @NotNull
    public static final C29368g3 Companion = new C29368g3();

    /* JADX INFO: renamed from: a */
    public final String f59387a;

    /* JADX INFO: renamed from: b */
    public final String f59388b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29376h3)) {
            return false;
        }
        C29376h3 c29376h3 = (C29376h3) obj;
        return Intrinsics.areEqual(this.f59387a, c29376h3.f59387a) && Intrinsics.areEqual(this.f59388b, c29376h3.f59388b);
    }

    public final int hashCode() {
        String str = this.f59387a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59388b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Payload(confirmationId=" + this.f59387a + ", type=" + this.f59388b + ")";
    }

    public /* synthetic */ C29376h3(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f59387a = null;
        } else {
            this.f59387a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59388b = null;
        } else {
            this.f59388b = str2;
        }
    }
}
