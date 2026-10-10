package com.sumsub.sns.internal.nfc;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33383l extends AbstractC33384m {

    /* JADX INFO: renamed from: a */
    public final List f68085a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33383l) && Intrinsics.areEqual(this.f68085a, ((C33383l) obj).f68085a);
    }

    public final int hashCode() {
        return this.f68085a.hashCode();
    }

    public final String toString() {
        return "Success(files=" + this.f68085a + ")";
    }

    public C33383l(List list) {
        this.f68085a = list;
    }
}
