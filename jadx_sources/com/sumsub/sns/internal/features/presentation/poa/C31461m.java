package com.sumsub.sns.internal.features.presentation.poa;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31461m {

    /* JADX INFO: renamed from: a */
    public final CharSequence f63788a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f63789b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f63790c;

    public C31461m(String str) {
        this.f63788a = str;
        this.f63789b = null;
        this.f63790c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31461m)) {
            return false;
        }
        C31461m c31461m = (C31461m) obj;
        return Intrinsics.areEqual(this.f63788a, c31461m.f63788a) && Intrinsics.areEqual(this.f63789b, c31461m.f63789b) && Intrinsics.areEqual(this.f63790c, c31461m.f63790c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f63788a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f63789b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f63790c;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        return "Item(title=" + ((Object) this.f63788a) + ", validMonth=" + ((Object) this.f63789b) + ", text=" + ((Object) this.f63790c) + ")";
    }

    public C31461m(String str, String str2, String str3) {
        this.f63788a = str;
        this.f63789b = str2;
        this.f63790c = str3;
    }
}
