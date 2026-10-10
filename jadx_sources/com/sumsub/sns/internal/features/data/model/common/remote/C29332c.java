package com.sumsub.sns.internal.features.data.model.common.remote;

import java.util.List;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29332c {

    @NotNull
    public static final C29324b Companion = new C29324b();

    /* JADX INFO: renamed from: h */
    public static final Lazy[] f59342h = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.w5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29332c.m69848a();
        }
    }), null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f59343a;

    /* JADX INFO: renamed from: b */
    public final String f59344b;

    /* JADX INFO: renamed from: c */
    public final String f59345c;

    /* JADX INFO: renamed from: d */
    public final List f59346d;

    /* JADX INFO: renamed from: e */
    public final String f59347e;

    /* JADX INFO: renamed from: f */
    public final String f59348f;

    /* JADX INFO: renamed from: g */
    public final String f59349g;

    public /* synthetic */ C29332c(int i11, String str, String str2, String str3, List list, String str4, String str5, String str6) {
        if ((i11 & 1) == 0) {
            this.f59343a = null;
        } else {
            this.f59343a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59344b = null;
        } else {
            this.f59344b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59345c = "msdk";
        } else {
            this.f59345c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59346d = null;
        } else {
            this.f59346d = list;
        }
        if ((i11 & 16) == 0) {
            this.f59347e = null;
        } else {
            this.f59347e = str4;
        }
        if ((i11 & 32) == 0) {
            this.f59348f = null;
        } else {
            this.f59348f = str5;
        }
        if ((i11 & 64) == 0) {
            this.f59349g = null;
        } else {
            this.f59349g = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29332c)) {
            return false;
        }
        C29332c c29332c = (C29332c) obj;
        return Intrinsics.areEqual(this.f59343a, c29332c.f59343a) && Intrinsics.areEqual(this.f59344b, c29332c.f59344b) && Intrinsics.areEqual(this.f59345c, c29332c.f59345c) && Intrinsics.areEqual(this.f59346d, c29332c.f59346d) && Intrinsics.areEqual(this.f59347e, c29332c.f59347e) && Intrinsics.areEqual(this.f59348f, c29332c.f59348f) && Intrinsics.areEqual(this.f59349g, c29332c.f59349g);
    }

    public C29332c(String str, String str2) {
        this.f59343a = str;
        this.f59344b = null;
        this.f59345c = "msdk";
        this.f59346d = null;
        this.f59347e = null;
        this.f59348f = str2;
        this.f59349g = null;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69848a() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        String str = this.f59343a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59344b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59345c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f59346d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f59347e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59348f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59349g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "Agreement(content=" + this.f59343a + ", createdAt=" + this.f59344b + ", source=" + this.f59345c + ", targets=" + this.f59346d + ", link=" + this.f59347e + ", titleKey=" + this.f59348f + ", privacyNoticeUrl=" + this.f59349g + ")";
    }
}
