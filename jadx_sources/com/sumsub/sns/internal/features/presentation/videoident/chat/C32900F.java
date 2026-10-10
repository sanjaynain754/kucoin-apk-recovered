package com.sumsub.sns.internal.features.presentation.videoident.chat;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C32900F {

    @NotNull
    public static final C32899E Companion = new C32899E();

    /* JADX INFO: renamed from: a */
    public final String f67302a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32900F) && Intrinsics.areEqual(this.f67302a, ((C32900F) obj).f67302a);
    }

    public final int hashCode() {
        String str = this.f67302a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VideoIdentConfig(codec=" + this.f67302a + ")";
    }

    public /* synthetic */ C32900F(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f67302a = null;
        } else {
            this.f67302a = str;
        }
    }
}
