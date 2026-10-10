package com.sumsub.sns.internal.features.data.model.sumsubid;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29875p {

    @NotNull
    public static final C29874o Companion = new C29874o();

    /* JADX INFO: renamed from: a */
    public final String f59957a;

    /* JADX INFO: renamed from: b */
    public final String f59958b;

    public /* synthetic */ C29875p(int i11, String str, String str2) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29873n.f59956a.getDescriptor());
        }
        this.f59957a = str;
        this.f59958b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29875p)) {
            return false;
        }
        C29875p c29875p = (C29875p) obj;
        return Intrinsics.areEqual(this.f59957a, c29875p.f59957a) && Intrinsics.areEqual(this.f59958b, c29875p.f59958b);
    }

    public C29875p(String str, String str2) {
        this.f59957a = str;
        this.f59958b = str2;
    }

    public final int hashCode() {
        String str = this.f59957a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59958b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdConfirmRequestBody(id=" + this.f59957a + ", code=" + this.f59958b + ")";
    }
}
