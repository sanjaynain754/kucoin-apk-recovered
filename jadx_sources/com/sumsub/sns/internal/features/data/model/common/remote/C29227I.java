package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29227I {

    @NotNull
    public static final C29222H Companion = new C29222H();

    /* JADX INFO: renamed from: a */
    public final Integer f59218a;

    /* JADX INFO: renamed from: b */
    public final String f59219b;

    /* JADX INFO: renamed from: c */
    public final Integer f59220c;

    /* JADX INFO: renamed from: d */
    public final String f59221d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29227I)) {
            return false;
        }
        C29227I c29227i = (C29227I) obj;
        return Intrinsics.areEqual(this.f59218a, c29227i.f59218a) && Intrinsics.areEqual(this.f59219b, c29227i.f59219b) && Intrinsics.areEqual(this.f59220c, c29227i.f59220c) && Intrinsics.areEqual(this.f59221d, c29227i.f59221d);
    }

    public final int hashCode() {
        Integer num = this.f59218a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f59219b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f59220c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f59221d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "BasicResponse(ok=" + this.f59218a + ", description=" + this.f59219b + ", code=" + this.f59220c + ", correlationId=" + this.f59221d + ")";
    }

    public /* synthetic */ C29227I(int i11, Integer num, String str, Integer num2, String str2) {
        if ((i11 & 1) == 0) {
            this.f59218a = null;
        } else {
            this.f59218a = num;
        }
        if ((i11 & 2) == 0) {
            this.f59219b = null;
        } else {
            this.f59219b = str;
        }
        if ((i11 & 4) == 0) {
            this.f59220c = null;
        } else {
            this.f59220c = num2;
        }
        if ((i11 & 8) == 0) {
            this.f59221d = null;
        } else {
            this.f59221d = str2;
        }
    }
}
