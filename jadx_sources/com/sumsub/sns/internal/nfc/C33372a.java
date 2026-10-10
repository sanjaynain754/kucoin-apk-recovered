package com.sumsub.sns.internal.nfc;

import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33372a {

    /* JADX INFO: renamed from: a */
    public final boolean f68046a;

    /* JADX INFO: renamed from: b */
    public final List f68047b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33372a)) {
            return false;
        }
        C33372a c33372a = (C33372a) obj;
        return this.f68046a == c33372a.f68046a && Intrinsics.areEqual(this.f68047b, c33372a.f68047b);
    }

    public C33372a(List list, int i11) {
        list = (i11 & 2) != 0 ? CollectionsKt.listOf((Object[]) new Short[]{286, 285, 257, 258}) : list;
        this.f68046a = true;
        this.f68047b = list;
    }

    public final int hashCode() {
        return this.f68047b.hashCode() + (Boolean.hashCode(this.f68046a) * 31);
    }

    public final String toString() {
        return "NfcConfig(usePace=" + this.f68046a + ", files=" + this.f68047b + ")";
    }
}
