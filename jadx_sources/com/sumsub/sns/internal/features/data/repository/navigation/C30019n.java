package com.sumsub.sns.internal.features.data.repository.navigation;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C30019n {

    @NotNull
    public static final C30018m Companion = new C30018m();

    /* JADX INFO: renamed from: a */
    public final String f60301a;

    /* JADX INFO: renamed from: b */
    public final String f60302b;

    /* JADX INFO: renamed from: c */
    public final String f60303c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30019n)) {
            return false;
        }
        C30019n c30019n = (C30019n) obj;
        return Intrinsics.areEqual(this.f60301a, c30019n.f60301a) && Intrinsics.areEqual(this.f60302b, c30019n.f60302b) && Intrinsics.areEqual(this.f60303c, c30019n.f60303c);
    }

    public final int hashCode() {
        String str = this.f60301a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60302b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60303c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "IdDocSetDto(videoRequired=" + this.f60301a + ", questionnaireDefId=" + this.f60302b + ", captureMode=" + this.f60303c + ")";
    }

    public /* synthetic */ C30019n(int i11, String str, String str2, String str3) {
        if ((i11 & 1) == 0) {
            this.f60301a = null;
        } else {
            this.f60301a = str;
        }
        if ((i11 & 2) == 0) {
            this.f60302b = null;
        } else {
            this.f60302b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f60303c = null;
        } else {
            this.f60303c = str3;
        }
    }
}
