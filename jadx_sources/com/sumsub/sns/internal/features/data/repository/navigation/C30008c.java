package com.sumsub.sns.internal.features.data.repository.navigation;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C30008c {

    @NotNull
    public static final C30006b Companion = new C30006b();

    /* JADX INFO: renamed from: a */
    public final String f60288a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30008c) && Intrinsics.areEqual(this.f60288a, ((C30008c) obj).f60288a);
    }

    public final int hashCode() {
        String str = this.f60288a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "ApplicantReviewDto(levelName=" + this.f60288a + ")";
    }

    public /* synthetic */ C30008c(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f60288a = null;
        } else {
            this.f60288a = str;
        }
    }
}
