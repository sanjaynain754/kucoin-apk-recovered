package com.sumsub.sns.internal.features.data.model.esign;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29787w {

    @NotNull
    public static final C29786v Companion = new C29786v();

    /* JADX INFO: renamed from: a */
    public final String f59858a;

    /* JADX INFO: renamed from: b */
    public final boolean f59859b;

    public /* synthetic */ C29787w(int i11, String str, boolean z11) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29785u.f59857a.getDescriptor());
        }
        this.f59858a = str;
        this.f59859b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29787w)) {
            return false;
        }
        C29787w c29787w = (C29787w) obj;
        return Intrinsics.areEqual(this.f59858a, c29787w.f59858a) && this.f59859b == c29787w.f59859b;
    }

    public C29787w(String str, boolean z11) {
        this.f59858a = str;
        this.f59859b = z11;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59859b) + (this.f59858a.hashCode() * 31);
    }

    public final String toString() {
        return "Agreement(id=" + this.f59858a + ", accepted=" + this.f59859b + ")";
    }
}
