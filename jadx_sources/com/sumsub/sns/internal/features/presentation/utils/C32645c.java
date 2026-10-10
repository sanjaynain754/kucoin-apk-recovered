package com.sumsub.sns.internal.features.presentation.utils;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32645c extends AbstractC32647d {

    /* JADX INFO: renamed from: a */
    public final String f66640a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32645c) && Intrinsics.areEqual(this.f66640a, ((C32645c) obj).f66640a);
    }

    public final int hashCode() {
        return this.f66640a.hashCode();
    }

    public final String toString() {
        return "ShowContent(html=" + this.f66640a + ")";
    }

    public C32645c(String str) {
        this.f66640a = str;
    }
}
