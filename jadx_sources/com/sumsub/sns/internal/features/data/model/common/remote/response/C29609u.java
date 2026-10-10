package com.sumsub.sns.internal.features.data.model.common.remote.response;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29609u extends AbstractC29490L1 {

    @NotNull
    public static final C29605t Companion = new C29605t();

    /* JADX INFO: renamed from: a */
    public final C29478H1 f59666a;

    /* JADX INFO: renamed from: b */
    public final C29601s f59667b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29609u)) {
            return false;
        }
        C29609u c29609u = (C29609u) obj;
        return Intrinsics.areEqual(this.f59666a, c29609u.f59666a) && Intrinsics.areEqual(this.f59667b, c29609u.f59667b);
    }

    public /* synthetic */ C29609u(int i11, C29478H1 c29478h1, C29601s c29601s) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29589p.f59611a.getDescriptor());
        }
        this.f59666a = c29478h1;
        this.f59667b = c29601s;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.remote.response.AbstractC29490L1
    /* JADX INFO: renamed from: a */
    public final C29478H1 mo69873a() {
        return this.f59666a;
    }

    public final int hashCode() {
        return this.f59667b.hashCode() + (this.f59666a.hashCode() * 31);
    }

    public final String toString() {
        return "ApplicantWithIdDocsStatusResponse(requiredIdDocsStatus=" + this.f59666a + ", applicant=" + this.f59667b + ")";
    }
}
