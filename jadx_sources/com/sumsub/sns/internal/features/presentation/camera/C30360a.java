package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30360a {

    /* JADX INFO: renamed from: a */
    public final boolean f61064a;

    /* JADX INFO: renamed from: b */
    public final C29070X f61065b;

    public C30360a(boolean z11, C29070X c29070x) {
        this.f61064a = z11;
        this.f61065b = c29070x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30360a)) {
            return false;
        }
        C30360a c30360a = (C30360a) obj;
        return this.f61064a == c30360a.f61064a && Intrinsics.areEqual(this.f61065b, c30360a.f61065b);
    }

    public final int hashCode() {
        return this.f61065b.f59014a.hashCode() + (Boolean.hashCode(this.f61064a) * 31);
    }

    public final String toString() {
        return "Config(hasGallery=" + this.f61064a + ", documentType=" + this.f61065b + ")";
    }

    public C30360a() {
        C29070X.Companion.getClass();
        C29070X c29070xM69739a = C29062V.m69739a("TYPE_UNKNOWN");
        this.f61064a = true;
        this.f61065b = c29070xM69739a;
    }
}
