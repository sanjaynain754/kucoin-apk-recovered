package com.sumsub.sns.internal.core.presentation.theme;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.theme.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28960h extends AbstractC28962j {

    /* JADX INFO: renamed from: a */
    public final String f58868a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28960h) && Intrinsics.areEqual(this.f58868a, ((C28960h) obj).f58868a);
    }

    public final int hashCode() {
        return this.f58868a.hashCode();
    }

    public final String toString() {
        return "Style(value=" + this.f58868a + ")";
    }

    public C28960h(String str) {
        this.f58868a = str;
    }
}
