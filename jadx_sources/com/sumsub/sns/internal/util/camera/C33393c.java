package com.sumsub.sns.internal.util.camera;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.camera.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33393c {

    /* JADX INFO: renamed from: a */
    public final String f68098a;

    /* JADX INFO: renamed from: b */
    public final String f68099b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33393c)) {
            return false;
        }
        C33393c c33393c = (C33393c) obj;
        return Intrinsics.areEqual(this.f68098a, c33393c.f68098a) && Intrinsics.areEqual(this.f68099b, c33393c.f68099b);
    }

    public final int hashCode() {
        return this.f68099b.hashCode() + (this.f68098a.hashCode() * 31);
    }

    public final String toString() {
        return "ControlFile(key=" + this.f68098a + ", path=" + this.f68099b + ")";
    }

    public C33393c(String str, String str2) {
        this.f68098a = str;
        this.f68099b = str2;
    }
}
