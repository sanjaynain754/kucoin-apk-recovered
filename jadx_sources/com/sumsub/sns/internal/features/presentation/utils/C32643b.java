package com.sumsub.sns.internal.features.presentation.utils;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32643b extends AbstractC32647d {

    /* JADX INFO: renamed from: a */
    public final String f66638a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32643b) && Intrinsics.areEqual(this.f66638a, ((C32643b) obj).f66638a);
    }

    public final int hashCode() {
        return this.f66638a.hashCode();
    }

    public final String toString() {
        return "OpenUrl(url=" + this.f66638a + ")";
    }

    public C32643b(String str) {
        this.f66638a = str;
    }
}
