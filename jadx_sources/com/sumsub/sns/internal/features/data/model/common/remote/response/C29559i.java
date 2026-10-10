package com.sumsub.sns.internal.features.data.model.common.remote.response;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29559i extends AbstractC29490L1 {

    @NotNull
    public static final C29554h Companion = new C29554h();

    /* JADX INFO: renamed from: a */
    public final C29478H1 f59581a;

    /* JADX INFO: renamed from: b */
    public final C29549g f59582b;

    /* JADX INFO: renamed from: c */
    public final C29534d f59583c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29559i)) {
            return false;
        }
        C29559i c29559i = (C29559i) obj;
        return Intrinsics.areEqual(this.f59581a, c29559i.f59581a) && Intrinsics.areEqual(this.f59582b, c29559i.f59582b) && Intrinsics.areEqual(this.f59583c, c29559i.f59583c);
    }

    public /* synthetic */ C29559i(int i11, C29478H1 c29478h1, C29549g c29549g, C29534d c29534d) {
        if (7 != (i11 & 7)) {
            C41801c2.m91514a(i11, 7, C29519a.f59539a.getDescriptor());
        }
        this.f59581a = c29478h1;
        this.f59582b = c29549g;
        this.f59583c = c29534d;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.remote.response.AbstractC29490L1
    /* JADX INFO: renamed from: a */
    public final C29478H1 mo69873a() {
        return this.f59581a;
    }

    public final int hashCode() {
        return this.f59583c.hashCode() + ((this.f59582b.hashCode() + (this.f59581a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ActionWithWithIdDocsStatusResponse(requiredIdDocsStatus=" + this.f59581a + ", applicant=" + this.f59582b + ", action=" + this.f59583c + ")";
    }
}
