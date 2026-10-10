package com.sumsub.sns.internal.features.data.model.prooface;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29810M {

    @NotNull
    public static final C29809L Companion = new C29809L();

    /* JADX INFO: renamed from: a */
    public final String f59884a;

    /* JADX INFO: renamed from: b */
    public final String f59885b;

    /* JADX INFO: renamed from: c */
    public final Integer f59886c;

    /* JADX INFO: renamed from: d */
    public final String f59887d;

    /* JADX INFO: renamed from: e */
    public final Boolean f59888e;

    /* JADX INFO: renamed from: f */
    public final Boolean f59889f;

    /* JADX INFO: renamed from: g */
    public final String f59890g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29810M)) {
            return false;
        }
        C29810M c29810m = (C29810M) obj;
        return Intrinsics.areEqual(this.f59884a, c29810m.f59884a) && Intrinsics.areEqual(this.f59885b, c29810m.f59885b) && Intrinsics.areEqual(this.f59886c, c29810m.f59886c) && Intrinsics.areEqual(this.f59887d, c29810m.f59887d) && Intrinsics.areEqual(this.f59888e, c29810m.f59888e) && Intrinsics.areEqual(this.f59889f, c29810m.f59889f) && Intrinsics.areEqual(this.f59890g, c29810m.f59890g);
    }

    public final int hashCode() {
        String str = this.f59884a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59885b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f59886c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f59887d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f59888e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f59889f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f59890g;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "LivenessSession(sessionId=" + this.f59884a + ", sessionKey=" + this.f59885b + ", requiredFragments=" + this.f59886c + ", answer=" + this.f59887d + ", allowContinuing=" + this.f59888e + ", skipCalibration=" + this.f59889f + ", suggestion=" + this.f59890g + ")";
    }

    public /* synthetic */ C29810M(int i11, String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, String str4) {
        if ((i11 & 1) == 0) {
            this.f59884a = null;
        } else {
            this.f59884a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59885b = null;
        } else {
            this.f59885b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59886c = null;
        } else {
            this.f59886c = num;
        }
        if ((i11 & 8) == 0) {
            this.f59887d = null;
        } else {
            this.f59887d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f59888e = null;
        } else {
            this.f59888e = bool;
        }
        if ((i11 & 32) == 0) {
            this.f59889f = null;
        } else {
            this.f59889f = bool2;
        }
        if ((i11 & 64) == 0) {
            this.f59890g = null;
        } else {
            this.f59890g = str4;
        }
    }
}
