package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.b4 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29329b4 {

    @NotNull
    public static final C29321a4 Companion = new C29321a4();

    /* JADX INFO: renamed from: a */
    public final String f59340a;

    /* JADX INFO: renamed from: b */
    public final JsonElement f59341b;

    public /* synthetic */ C29329b4(int i11, String str, JsonElement jsonElement) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29315Z3.f59329a.getDescriptor());
        }
        this.f59340a = str;
        this.f59341b = jsonElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29329b4)) {
            return false;
        }
        C29329b4 c29329b4 = (C29329b4) obj;
        return Intrinsics.areEqual(this.f59340a, c29329b4.f59340a) && Intrinsics.areEqual(this.f59341b, c29329b4.f59341b);
    }

    public C29329b4(String str, JsonElement jsonElement) {
        this.f59340a = str;
        this.f59341b = jsonElement;
    }

    public final int hashCode() {
        int iHashCode = this.f59340a.hashCode() * 31;
        JsonElement jsonElement = this.f59341b;
        return iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    public final String toString() {
        return "UpdatedFieldSurrogate(name=" + this.f59340a + ", value=" + this.f59341b + ")";
    }
}
